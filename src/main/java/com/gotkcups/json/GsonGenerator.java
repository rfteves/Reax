/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.gotkcups.json;

import java.io.File;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import org.apache.commons.io.FileUtils;
import org.apache.commons.lang.StringUtils;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

/**
 *
 * @author rfteves
 */
public class GsonGenerator {

    private static int[] collections = new int[1];
    private static int[] properties = new int[1];
    private static int[] maps = new int[1];

    public static void main(String[] args) throws Exception {
        String json = FileUtils.readFileToString(new File("D:\\Users\\rfteves\\Documents\\money.json"), "UTF-8").replaceAll("[\n\r\t]", "").replaceAll("[ ]{2,}", " ");
        System.out.println();
        System.out.println(json);
        System.out.println();
        GsonData data = GsonMapper.getInstance(json);
        dig("", null, data, 0);
        gc.put("-", "class Root");
        int deep = 0;
        Set<String> keys = new LinkedHashSet<>();
        for (String key : fields.keySet()) {
            System.out.println(key + "[" + fields.get(key));
            keys.add(key + "[" + fields.get(key));
        }
        DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
        DocumentBuilder builder = factory.newDocumentBuilder();
        Document document = builder.newDocument();
        Node root = document.createElement("class-Root");

        keys.stream().forEach(depth -> {

            int occ = 0;
            int x = -1;
            Node now = root;
            Node previous = null;
            collections[0] = 0;
            properties[0] = 0;
            while ((x = depth.indexOf("]", occ)) != -1) {
                String c = depth.substring(0, x + 1);
                occ = x + 1;
                NodeList list = now.getChildNodes();
                String nodeName = null;
                if (c.endsWith("a]")) {
                    nodeName = "collection-" + ++collections[0];
                } else if (c.endsWith("m]")) {
                    nodeName = "map-" + ++maps[0];
                } else if (c.endsWith("p]")) {
                    int start = depth.lastIndexOf("]");
                    int end = depth.indexOf("[", start);
                    nodeName = "property-" + depth.substring(start + 1, end);
                } else if (c.endsWith("v]")) {
                    int start = depth.lastIndexOf("[");
                    if (depth.length() > start) {
                        Element attr = (Element) previous;
                        attr.setAttribute("type", "Object");
                    }
                }
                System.out.println(nodeName);
                if (nodeName != null) {
                    boolean exists = false;
                    for (int k = 0; k < list.getLength(); ++k) {
                        Node n = list.item(k);
                        if (nodeName.equals(n.getNodeName())) {
                            exists = true;
                            now = n;
                            break;
                        }
                    }
                    if (!exists) {
                        previous = document.createElement(nodeName);
                        now.appendChild(previous);
                        //if (!nodeName.startsWith("property-")) {
                        now = previous;
                        //}

                    }
                } else {
                    previous = null;
                }
            }
        });
        System.out.println("XXXX");
        System.out.println("XXXX");
        System.out.println("XXXX");
        buffer.setLength(0);
        print(root, 0);
        System.out.println(buffer.toString());
    }

    private static void print(Node root, int indent) {
        for (int x = 0; x < indent; ++x) {
            buffer.append("\t");
        }
        buffer.append(root.getNodeName());
        buffer.append("\r\n");
        NodeList list = root.getChildNodes();
        for (int k = 0; k < list.getLength(); ++k) {
            Node n = list.item(k);
            print(n, indent + 1);
        }
    }

    //private static StringBuilder classgen = new StringBuilder();
    private static Map<String, String> gc = new LinkedHashMap<>();

    private static void dig(String type, String key, GsonData data, int indent) {
        boolean mapped = false;
        boolean arrayed = false;
        if (data.getMap() != null) {
            if (key != null) {
                // Let's check if this can be a propert
                data.getMap().entrySet().stream().forEach(c -> {
                    dig(type + "m]", key, c.getValue(), indent + 1);
                });
                arrayed = true;
            } else {
                Collection<String> keys = data.getMap().keySet();
                final Map<String,GsonData>map = data.getMap();
                keys.stream().forEach(k -> {
                    dig(type + "p]", k, map.get(k), indent + 1);
                });
                mapped = true;
            }
        }
        if (data.getChildren() != null) {
            data.getChildren().stream().forEach(c -> {
                dig(type + "a]", key, c, indent + 1);
            });
            arrayed = true;
        }
        if (!arrayed && !mapped) {
            print(type + "v]", key, data.toString(), indent);
        }

    }

    private static StringBuilder buffer = new StringBuilder();
    private static Map<String, String> fields = new LinkedHashMap<>();

    private static void print(String type, String key, String value, int indent) {
        buffer.setLength(0);
        for (int i = 0; i < indent; ++i) {
            buffer.append("\t");
        }
        buffer.append(type);
        buffer.append(key);
        buffer.append(value);
        fields.put(type + key, value);
    }

    public static Class getType(String value) {
        Class retval = null;

        return retval;
    }
}
