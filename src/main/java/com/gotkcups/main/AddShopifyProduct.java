/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.gotkcups.main;

import com.google.gson.JsonElement;
import com.gotkcups.io.RestClient;
import com.gotkcups.json.GsonKey;
import com.gotkcups.json.GsonMapper;
import com.gotkcups.json.Utilities;
import com.gotkcups.main.ClasserType.Types;
import java.text.SimpleDateFormat;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.HashMap;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.w3c.dom.Document;
import org.w3c.dom.Node;

/**
 *
 * @author rfteves
 */
public class AddShopifyProduct {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws Exception {
        Map<String, String> params = new HashMap<>();
        String json = RestClient.getProduct("prod", 10790256842L, params).replaceAll("[\n\r\t]", "").replaceAll("[ ]{2,}", " ");
        System.out.println(json);
        Map<GsonKey, JsonElement> elements = GsonMapper.getJsonElements(json);
        ClasserFactory factory = ClasserFactory.getReference();
        elements.entrySet().stream().forEach(entry -> {
            System.out.println(entry.getKey().getField() + "<:>" + entry.getValue());
            if (entry.getKey().getField().contains("]values.0")) {
                System.out.println();
            }
            String key = entry.getKey().getField();
            String className = named(getTopClass(key));
            String fieldName = named(getTopField(key));
            if (fieldName.equals("published_at")) {
                System.out.println();
            }
            Deque<String> fields = layoutFields(key);
            String type = null;
            if (className.equals("__")) {
                Classer c = factory.getInstance(null, className, Types.RootType);
            } else {
                String s = null;
                Classer parent = null;
                while ((s = fields.poll()) != null) {
                    if (s.equals("__")) {
                        parent = factory.getRoot();
                    } else {
                        if (parent.getClassers().get(s) != null) {
                            parent = parent.getClassers().get(s);
                        } else {
                            Types types = Types.ClassType;
                            if (entry.getValue().isJsonArray()) {
                                types = Types.CollectionType;
                            }
                            Classer c = factory.getInstance(parent, s, types);
                            parent.getClassers().put(s, c);
                            parent = c;
                        }
                    }
                }
                if (!fieldName.equals("")) {
                    if (entry.getValue().isJsonPrimitive()) {
                        JsonElement v = entry.getValue();
                        Types types = null;
                        if (Utilities.isBigDecimal(v)) {
                            types = Types.BigDecimalType;
                        } else if (Utilities.isBigInteger(v)) {
                            types = Types.BigIntegerType;
                        } else if (Utilities.isBoolean(v)) {
                            types = Types.BooleanType;
                        } else if (Utilities.isDate(v)) {
                            types = Types.DateType;
                        } else {
                            types = Types.StringType;
                        }
                        factory.addProperty(parent, fieldName, types);
                    } else if (entry.getValue().isJsonNull()) {
                        factory.addProperty(parent, fieldName, Types.NullType);
                    }
                }
            }
        });
        System.out.println(factory.getRoot().toString());
    }
    
    public static void createClasses(String json) {
        Map<GsonKey, JsonElement> elements = GsonMapper.getJsonElements(json);
        ClasserFactory factory = ClasserFactory.getReference();
        elements.entrySet().stream().forEach(entry -> {
            System.out.println(entry.getKey().getField() + "<:>" + entry.getValue());
            String key = entry.getKey().getField();
            String className = named(getTopClass(key));
            String fieldName = named(getTopField(key));
            Deque<String> fields = layoutFields(key);
            String type = null;
            if (className.equals("__")) {
                Classer c = factory.getInstance(null, className, Types.RootType);
            } else {
                String s = null;
                Classer parent = null;
                while ((s = fields.poll()) != null) {
                    if (s.equals("__")) {
                        parent = factory.getRoot();
                    } else {
                        if (parent.getClassers().get(s) != null) {
                            parent = parent.getClassers().get(s);
                        } else {
                            Types types = Types.ClassType;
                            if (entry.getValue().isJsonArray()) {
                                types = Types.CollectionType;
                            }
                            Classer c = factory.getInstance(parent, s, types);
                            parent.getClassers().put(s, c);
                            parent = c;
                        }
                    }
                }
                if (!fieldName.equals("")) {
                    if (entry.getValue().isJsonPrimitive()) {
                        JsonElement v = entry.getValue();
                        Types types = null;
                        if (Utilities.isBigDecimal(v)) {
                            types = Types.BigDecimalType;
                        } else if (Utilities.isBigInteger(v)) {
                            types = Types.BigIntegerType;
                        } else if (Utilities.isBoolean(v)) {
                            types = Types.BooleanType;
                        } else if (Utilities.isDate(v)) {
                            types = Types.DateType;
                        } else {
                            types = Types.StringType;
                        }
                        factory.addProperty(parent, fieldName, types);
                    } else if (entry.getValue().isJsonNull()) {
                        factory.addProperty(parent, fieldName, Types.NullType);
                    }
                }
            }
        });
        System.out.println(factory.getRoot().toString());
    }

    private static void traverse(Node top, int level) {
        StringBuilder sb = new StringBuilder();
        sb.setLength(0);
        int indents = 0;
        while (++indents <= level) {
            sb.append("\t");
        }
        for (int i = 0; i < top.getChildNodes().getLength(); ++i) {
            //System.out.println(sb.toString() + top.getChildNodes().item(i).getNodeName() + ":" + level + ":" + indents);
            if (top.getChildNodes().item(i).getChildNodes().getLength() > 0) {
                traverse(top.getChildNodes().item(i), level + 1);
            }
            //
        }
    }
    private static Deque<String> deq;

    private static Node getTopNode(Document document, Node root, String key) {
        if (deq == null) {
            deq = layoutFields(key);
        }
        Node retval = null;
        String field = null;
        String s = null;
        while ((s = deq.poll()) != null) {
            field = s;
            for (int i = 0; i < root.getChildNodes().getLength(); i++) {
                Node now = root.getChildNodes().item(i);
                if (now.getNodeName().equals("class-".concat(field))) {
                    if (deq.peek() != null) {
                        continue;
                    } else {
                        retval = now;
                        break;
                    }
                }
            }
        }
        if (retval == null) {
            Node newNode = document.createElement("class-".concat(field));
            root.appendChild(newNode);
            retval = newNode;
        }
        return retval;
    }

    private static String getTopField(String key) {
        String retval = null;
        int occ = 0;
        int start = 0;
        int end = -1;
        while ((end = key.indexOf("]", occ)) != -1) {
            retval = key.substring(start, end);
            start = end + 1;
            occ = start;
        }
        retval = key.substring(start);
        return retval;
    }

    private static String getTopClass(String key) {
        String retval = null;
        int occ = 0;
        int start = 0;
        int end = -1;
        while ((end = key.indexOf("]", occ)) != -1) {
            retval = key.substring(start, end);
            start = end + 1;
            occ = start;
        }
        return retval;
    }

    private static Deque<String> layoutFields(String key) {
        Deque<String> deq = new ArrayDeque<>();
        int occ = 0;
        int start = 0;
        int end = -1;
        String field = null;
        while ((end = key.indexOf("]", occ)) != -1) {
            field = named(key.substring(start, end));
            deq.add(field);
            start = end + 1;
            occ = start;
        }
        return deq;
    }

    private static String named(String name) {
        String retval = name;
        Matcher m = Pattern.compile("[a-zA-Z]{1,}\\.[0-9]{1,2}").matcher(name);
        if (m.find()) {
            retval = name.substring(0, name.indexOf("."));
        }
        return retval;
    }
    
    private static void guess(JsonElement value) {
        if (value.isJsonPrimitive()) {
            SimpleDateFormat sdf = new SimpleDateFormat();
            boolean isdate = Utilities.isDate(value);
            System.out.println("isdate: " + isdate + ":" + value);
            System.out.println();
        }
    }
}
