/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.gotkcups.json;

import org.apache.commons.lang.StringUtils;

/**
 *
 * @author rfteves
 */
public class Member implements Comparable<Member> {

    private String key;
    
    public static Member getInstance(String key) {
        return new Member(key);
    }

    @Override
    public String toString() {
        //return "Member{" + "key=" + key + '}';
        return key;
    }

    private Member(String key) {
        this.key = key;
    }

    @Override
    public int compareTo(Member o) {
        int a = StringUtils.countMatches(this.key, "]");
        int b = StringUtils.countMatches(o.key, "]");
        return a - b;
    }

    /**
     * @return the key
     */
    public String getKey() {
        return key;
    }

    /**
     * @param key the key to set
     */
    public void setKey(String key) {
        this.key = key;
    }

}
