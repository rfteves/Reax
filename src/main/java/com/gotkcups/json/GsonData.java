/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.gotkcups.json;

import java.text.ParseException;
import java.util.ArrayList;
import java.util.Date;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/**
 *
 * @author rfteves
 */
public class GsonData {
    
    private Map<String, GsonData> map;
    private List<GsonData> children;
    private String name;

    public static GsonData getInstance(String name) {
	return new GsonData(name);
    }

    public static GsonData getInstance() {
	return new GsonData();
    }

    private GsonData() {
    }

    private GsonData(String name) {
	this.name = name;
    }

    public GsonData get(String field) {
	GsonData retval = null;
	if (map.containsKey(field)) {
	    retval = map.get(field);
	}
	return retval;
    }

    public String getString(String field) {
	String retval = null;
	if (map.containsKey(field)) {
	    retval = map.get(field).getName();
	}
	return retval;
    }

    public boolean getBoolean(String field) {
	boolean retval = false;
	String s = this.getString(field);
	if (s != null) {
	    retval = Boolean.parseBoolean(s);
	}
	return retval;
    }

    public int getInt(String field) {
	int retval = 0;
	String s = this.getString(field);
	if (s != null) {
	    retval = Integer.parseInt(s);
	}
	return retval;
    }

    public long getLong(String field) {
	long retval = 0;
	String s = this.getString(field);
	if (s != null) {
	    retval = Long.parseLong(s);
	}
	return retval;
    }

    public double getDouble(String field) {
	double retval = 0;
	String s = this.getString(field);
	if (s != null) {
	    retval = Double.parseDouble(s);
	}
	return retval;
    }

    public Date getDate(String field) throws ParseException {
	Date retval = null;
	String s = this.getString(field);
	if (s != null) {
	    retval = Utilities.parsePublishedDate(s.replaceAll("\"", ""));
	}
	return retval;
    }

    public void put(String key, GsonData value) {
	if (this.map == null) {
	    map = new LinkedHashMap<>();
	}
	map.put(key, value);

    }

    /**
     * @return the map
     */
    public Map<String, GsonData> getMap() {
        return map;
    }

    public void add(GsonData child) {
	if (this.children == null) {
	    children = new ArrayList<GsonData>();
	}
	if (child != null) {
	    this.children.add(child);
	}

    }

    /**
     * @return the map
     */
    public Map<String, GsonData> getMap(String name) {
        Object o = get(name);
        Map<String, GsonData> mp = null;
        if (o instanceof GsonData) {
            GsonData gd = (GsonData)o;
            mp = gd.getMap();
        }
        return mp;
    }

    public List<GsonData> getChildren(String name) {
        Object o = get(name);
        List<GsonData> kids = null;
        if (o instanceof GsonData) {
            GsonData gd = (GsonData)o;
            kids = gd.getChildren();
        }
        return kids;

    }

    public List<GsonData> getChildren() {
	if (this.children == null) {
	    return null;
	} else {
	    return children;
	}

    }

    public List<String> getFields() {
	return map.keySet().stream().collect(Collectors.toList());
    }

    /**
     * @return the name
     */
    public String getName() {
	return name;
    }
    
    public String toString() {
        return name;
    }
}
