/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.gotkcups.json;

import java.util.Comparator;
import org.apache.commons.lang.StringUtils;

/**
 *
 * @author rfteves
 */
public class GsonKey implements Comparable<GsonKey> {
    public static GsonKey getInstance(String field) {
        return new GsonKey(field);
    }
    
    private String field;
    private GsonKey(String field) {
        this.field = field;
    }

    /**
     * @return the field
     */
    public String getField() {
        return field;
    }

    /**
     * @param key the field to set
     */
    public void setField(String field) {
        this.field = field;
    }

    @Override
    public int compareTo(GsonKey o) {
        String org = StringUtils.countMatches(this.getField(), "]") + this.getField();
        String org2 = "" + StringUtils.countMatches(o.getField(), "]") + o.getField();
        return org.compareTo(org2);
        
    }
}
