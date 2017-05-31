/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.gotkcups.main;

import com.google.gson.JsonElement;
import com.gotkcups.json.Utilities;
import com.gotkcups.main.ClasserType.Types;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

/**
 *
 * @author rfteves
 */
public class Classer {

    private String name;
    private String alias;
    private Types types;
    private Map<String, Classer> classers = new LinkedHashMap<>();
    private Map<String, ClasserProperty> properties = new LinkedHashMap<>();
    private int depth;
    private Set<String> imports = new LinkedHashSet<>();

    public Classer(String name) {
        this.name = name;
    }

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @return the classers
     */
    public Map<String, Classer> getClassers() {
        return classers;
    }

    StringBuilder sb = new StringBuilder();
    public String toString() {
        sb.setLength(0);
        sb.append("\r\n");
        sb.append("\r\n");
        sb.append(String.format("%sclass %s {\r\n", getAlias().equals("__") ? "public " : "", this.classed()));
        Map<Boolean,List<Entry<String,Classer>>>entries = classers.entrySet().stream().collect(Collectors.partitioningBy(o -> o.getKey().contains(" ")));
        
        entries.get(false).stream().forEach(entry
                -> {
            sb.append("\r\n");
            sb.append(String.format("\tprivate %s %s;", entry.getValue().typed(), entry.getValue().variable()));
            sb.append("\r\n");
            sb.append("\r\n");
            sb.append(String.format("\tpublic %s %s() {", entry.getValue().typed(), entry.getValue().getter()));
            sb.append("\r\n");
            sb.append(String.format("\t\treturn %s;", entry.getValue().variable()));
            sb.append("\r\n");
            sb.append(String.format("\t}", null));
            sb.append("\r\n");
            sb.append("\r\n");
            sb.append(String.format("\tpublic void %s(%s %s) {", entry.getValue().setter(), entry.getValue().typed(), entry.getValue().variable()));
            sb.append("\r\n");
            sb.append(String.format("\t\tthis.%s = %s;", entry.getValue().variable(), entry.getValue().variable()));
            sb.append("\r\n");
            sb.append(String.format("\t}", null));
            sb.append("\r\n");
        });
        properties();
        classers.entrySet().stream().forEach(entry
                -> {
            sb.append("\r\n");
            sb.append(entry.getValue().toString());
        });
        return sb.toString();
    }

    /**
     * @return the properties
     */
    public Map<String, ClasserProperty> getProperties() {
        return properties;
    }

    public String variable() {
        return getAlias().substring(0, 1).toLowerCase().concat(getAlias().substring(1));
    }

    public String typed() {
        if (types.equals(Types.CollectionType)) {
            return String.format("Collection<%s>", getAlias().substring(0, 1).toUpperCase().concat(getAlias().substring(1)));
        } else {
            return getAlias().substring(0, 1).toUpperCase().concat(getAlias().substring(1));
        }

    }

    public String classed() {
        return getAlias().substring(0, 1).toUpperCase().concat(getAlias().substring(1));

    }

    public String getter() {
        return "get".concat(getAlias().substring(0, 1).toUpperCase().concat(getAlias().substring(1)));
    }

    public String setter() {
        return "set".concat(getAlias().substring(0, 1).toUpperCase().concat(getAlias().substring(1)));
    }

    /**
     * @return the depth
     */
    public int getDepth() {
        return depth;
    }

    /**
     * @param depth the depth to set
     */
    public void setDepth(int depth) {
        this.depth = depth;
    }

    public String indents() {
        return Utilities.indents(depth);
    }

    /**
     * @return the types
     */
    public Types getTypes() {
        return types;
    }

    /**
     * @param types the types to set
     */
    public void setTypes(Types types) {
        this.types = types;
    }

    /**
     * @return the alias
     */
    public String getAlias() {
        return alias == null ? name.replaceAll(" ", "") : alias;
    }

    /**
     * @param alias the alias to set
     */
    public void setAlias(String alias) {
        this.alias = alias;
    }

    public void addTypes(Types type) {
        if (type.equals(Types.DateType)) {
            imports.add("import java.util.Date;");
        } else if (type.equals(Types.CollectionType)) {
            imports.add("import java.util.Collection;");
        } else if (type.equals(Types.BigIntegerType)) {
            imports.add("import java.math.BigInteger;");
        } else if (type.equals(Types.BigDecimalType)) {
            imports.add("import java.math.BigDecimal;");
        }
    }
    
    private void properties() {
        properties.entrySet().stream().forEach(entry
                -> {
            sb.append("\r\n");
            sb.append(String.format("\tprivate %s %s;", entry.getValue().getType().typed(), entry.getValue().variable()));
            sb.append("\r\n");
            sb.append("\r\n");
            sb.append(String.format("\tpublic %s %s() {", entry.getValue().typed(), entry.getValue().getter()));
            sb.append("\r\n");
            sb.append(String.format("\t\treturn %s;", entry.getValue().variable()));
            sb.append("\r\n");
            sb.append(String.format("\t}", null));
            sb.append("\r\n");
            sb.append("\r\n");
            sb.append(String.format("\tpublic void %s(%s %s) {", entry.getValue().setter(), entry.getValue().typed(), entry.getValue().variable()));
            sb.append("\r\n");
            sb.append(String.format("\t\tthis.%s = %s;", entry.getValue().variable(), entry.getValue().variable()));
            sb.append("\r\n");
            sb.append(String.format("\t}", null));
            sb.append("\r\n");
        });
        sb.append(String.format("\r\n}", null));
    }
}
