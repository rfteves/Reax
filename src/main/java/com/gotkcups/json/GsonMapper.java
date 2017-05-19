/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.gotkcups.json;

import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonParser;
import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.stream.Collectors;
import org.apache.commons.io.FileUtils;

/**
 *
 * @author rfteves
 */
public class GsonMapper {

    public static String DEBUG_ELEMENT = "availableSKUs";

    public static void main(String[] s) throws Exception {
        String data = FileUtils.readFileToString(new File("./productsx.json"), "UTF-8");
        GsonData gd = GsonMapper.getInstance(data);
        System.out.println(gd.getName() + " size: " + gd.getChildren().size());
        gd.getChildren().stream().filter(child -> child.getString("id").compareTo("8199335495") >= 0).map(child -> child.getString("title")).forEach(System.out::println);
        gd.getChildren().stream().filter(child -> child.getString("id").equals("8199335495"))
                .map(child -> child.getChildren("variants")).map(variant -> variant.get(0).getString("id")).forEach(System.out::println);
    }

    public static GsonData getInstance(String data) throws IOException {
        GsonMapper mapper = new GsonMapper();
        JsonElement element = new JsonParser().parse(data);
        mapper.mapvalues(element, null, null);
        return mapper.parent;
    }

    private GsonData parent;
    private GsonData[] parentObj = new GsonData[1];

    private void mapvalues(JsonElement element, GsonData root, String putkey) {
        if (DEBUG_ELEMENT.equals(putkey)) {
            System.out.println();
        }
        if (element.isJsonObject()) {
            Set<Map.Entry<String, JsonElement>> members = element.getAsJsonObject().entrySet();
            Map<Boolean, List<Entry<String, JsonElement>>> entries = members.stream().collect(Collectors.partitioningBy(member -> root == null || member.getValue().isJsonArray() || member.getValue().isJsonObject()));
            entries.get(false).stream().forEach(entry -> {
                if (DEBUG_ELEMENT.equals(entry.getKey())) {
                    System.out.println();
                }
                mapvalues(entry.getValue(), root, entry.getKey());
            });
            entries.get(true).stream().forEach(entry -> {
                if (DEBUG_ELEMENT.equals(entry.getKey())) {
                    System.out.println();
                }
                GsonData ancestor = null;
                if (parent == null) {
                    parent = GsonData.getInstance();
                    parentObj[0] = parent;
                    ancestor = parent;
                } else if (root == null) {
                    ancestor = parentObj[0];
                    GsonData child = GsonData.getInstance(entry.getKey());
                    ancestor.put(entry.getKey(), child);
                    ancestor = child;
                } else {
                    GsonData child = GsonData.getInstance(entry.getKey());
                    root.put(entry.getKey(), child);
                    ancestor = child;
                }
                mapvalues(entry.getValue(), ancestor, entry.getKey());
            });
        } else if (element.isJsonArray()) {
            GsonData ancestor = null;
            if (parent == null) {
                parent = GsonData.getInstance();
                parentObj[0] = parent;
                ancestor = parent;
            } else if (root == null) {
                ancestor = parentObj[0];
            } else {
                ancestor = root;
            }
            JsonArray arrays = element.getAsJsonArray();
            if (arrays.size() == 0) {
                ancestor.add(null); // So we know property is an array
            } else {
                for (JsonElement val : arrays) {
                    if (val.isJsonArray() || val.isJsonObject()) {
                        GsonData child = GsonData.getInstance();
                        ancestor.add(child);
                        mapvalues(val, child, null);
                    } else if (val.isJsonPrimitive()) {
                        ancestor.add(GsonData.getInstance(val.getAsString()));
                    }
                }
            }
        } else if (element.isJsonPrimitive()) {
            root.put(putkey, GsonData.getInstance(element.getAsString()));
        } else if (element.isJsonNull()) {
            root.put(putkey, null);
        }
    }
}
