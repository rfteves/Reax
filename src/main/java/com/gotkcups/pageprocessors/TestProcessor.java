/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.gotkcups.pageprocessors;

import com.gotkcups.json.GsonData;
import io.mlundela.rxjava.PageReader;
import java.util.Collection;
import java.util.stream.Collectors;
import org.apache.commons.lang.StringEscapeUtils;

/**
 *
 * @author rfteves
 */
public class TestProcessor {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws Exception {
        /*p.getData().getChildren().get(0).getChildren().stream()
                .map(p -> {
                    StringBuilder sb = new StringBuilder();
                    String line = p.getString("partNumber") + " " + p.getString("inventory") + " " + p.getChildren("options").stream().map(option -> option.getName()).collect(Collectors.joining(", "));
                    return line;
                }).forEach(System.out::println);*/
    }

}
