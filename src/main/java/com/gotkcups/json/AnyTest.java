/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.gotkcups.json;

import com.gotkcups.data.KeurigAnchor;
import com.gotkcups.data.KeurigOption;
import com.gotkcups.data.KeurigSelect;
import com.gotkcups.data.KeurigSpan;
import com.gotkcups.data.Product;
import com.gotkcups.data.ProductChange;
import java.io.File;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import javax.persistence.EntityManager;
import javax.persistence.Persistence;
import javax.persistence.EntityManagerFactory;
import org.apache.commons.io.FileUtils;

/**
 *
 * @author rfteves
 */
public class AnyTest {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws Exception {
         json();
    }
    
    private static void displayClassFields() {
        
        ProductChange pc = new ProductChange();
        java.lang.reflect.Field[] fields = ProductChange.class.getDeclaredFields();
        System.out.println("fields: " + fields.length);
        Arrays.asList(fields).stream().forEach(o -> System.out.println("X: " + o.getName()));
    }
    
    private static void lastTest() throws Exception {
        KeurigSelect select = new KeurigSelect();
        select.setId("id here");
        select.setStyle("style here");
        KeurigOption option = new KeurigOption();
        option.setOption("$58.99");
        option.setDataCode("data code here");
        select.getOption().add(option);
        System.out.println(Utilities.xml(select));
        sss();
        ttt();
    }
    
    private static void sss() throws IOException {
        
        String xml = FileUtils.readFileToString(new File("D:\\Users\\rfteves\\Documents\\keurig.xml"), "UTF-8");
        KeurigSelect select  = (KeurigSelect)Utilities.objectify(xml, new KeurigSelect());
        System.out.println(select.getOption().get(0).getDataCode());
        System.out.println(select.getOption().get(1).getDataCode());
    }
    
    
    
    private static void json() throws IOException {
        
        String json = FileUtils.readFileToString(new File("D:\\Users\\rfteves\\Documents\\options.json"), "UTF-8");
        GsonData data = GsonMapper.getInstance(json);
        System.out.println(data.getChildren());
        System.out.println(data.getMap());
    }
    
    
    private static void ttt() throws IOException {
        
        String xml = FileUtils.readFileToString(new File("D:\\Users\\rfteves\\Documents\\brewers.xml"), "UTF-8");
        KeurigSpan span  = (KeurigSpan)Utilities.objectify(xml, new KeurigSpan());
        KeurigAnchor a = new KeurigAnchor();
        a.setAnchor("anchor her");
        span.getAnchor().add(a);
        System.out.println(span.getAnchor().get(0).getAnchor());
    }
    
}
