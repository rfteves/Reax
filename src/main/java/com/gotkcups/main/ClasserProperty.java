/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.gotkcups.main;

/**
 *
 * @author rfteves
 */
public class ClasserProperty {
    private String name;
    private ClasserType.Types type;
    public ClasserProperty() {
    }

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return the type
     */
    public ClasserType.Types getType() {
        return type;
    }

    /**
     * @param type the type to set
     */
    public void setType(ClasserType.Types type) {
        this.type = type;
    }

    public String typed() {
        return type.typed();
    }
    
    public String variable() {
        return name.substring(0, 1).toLowerCase().concat(name.substring(1));
    }

    public String classed() {
        return type.typed();
    }

    public String getter() {
        return "get".concat(name.substring(0, 1).toUpperCase().concat(name.substring(1)));
    }

    public String setter() {
        return "set".concat(name.substring(0, 1).toUpperCase().concat(name.substring(1)));
    }
}
