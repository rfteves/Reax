/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.gotkcups.main;

import com.gotkcups.main.ClasserType.Types;
import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

/**
 *
 * @author rfteves
 */
public class ClasserFactory {

    /**
     * @return the classers
     */
    public Map<String, Integer> getClassers() {
        return classers;
    }

    private Classer root;
    private Map<String, Integer>classers = new LinkedHashMap<>();

    public static ClasserFactory getReference() {
        return new ClasserFactory();
    }

    public Classer getInstance(Classer parent, String name, ClasserType.Types types) {
        Classer c = new Classer(name);
        c.setTypes(types);
        if (classers.containsKey(name)) {
            classers.put(name, classers.get(name) + 1);
            c.setAlias(name.concat("" + classers.get(name)));
        } else {
            classers.put(name, 1);
        }
        if (root == null) {
            root = c;
        }
        if (parent != null) {
            c.setDepth(parent.getDepth() + 1);
        }
        return c;
    }

    public Classer addProperty(Classer parent, String name, ClasserType.Types type) {
        if (!parent.getProperties().keySet().contains(name)) {
            ClasserProperty property = new ClasserProperty();
            property.setName(name);
            property.setType(type);
            parent.getProperties().put(name, property);
            parent.addTypes(type);
        }
        return parent;
    }

    /**
     * @return the root
     */
    public Classer getRoot() {
        return root;
    }
}
