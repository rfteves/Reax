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
import com.gotkcups.shopify.ShopifyProduct;
import com.gotkcups.shopify.ShopifyProducts;
import com.gotkcups.shopify.ShopifyVariant;
import java.io.File;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Optional;
import java.util.Scanner;
import java.util.concurrent.ConcurrentSkipListSet;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
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
    public static void main(String[] args) {
        System.out.println(Pattern.compile("^[0-9]").matcher("0sdfsdfsd").find());
    }
    
    private static void failsafe() {
        ConcurrentSkipListSet list = new ConcurrentSkipListSet();
        list.add("aaa");
        list.add("znba");
        list.add("caa");
        list.add("eaa");
        list.add("oaa");
        Iterator i = list.iterator();
        while (i.hasNext()) {
            System.out.println(i.next());
            list.add("sdfsdfsd");
            list.add("sdfsdfsd");
            list.add("sdfsdfsd");
            list.add("sdfsdfsd");
            list.add("sdfsdfsd");
            //list.add("sdfsdfsd");
        }
    }
    
    private static void failfast() {
        List<String>list = new ArrayList<>();
        list.add("aaa");
        list.add("znba");
        list.add("caa");
        list.add("eaa");
        list.add("oaa");
        Iterator i = list.iterator();
        while (i.hasNext()) {
            System.out.println(i.next());
            list.add("dsfsdf");
        }
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
        KeurigSelect select = (KeurigSelect) Utilities.objectify(xml, new KeurigSelect());
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
        KeurigSpan span = (KeurigSpan) Utilities.objectify(xml, new KeurigSpan());
        KeurigAnchor a = new KeurigAnchor();
        a.setAnchor("anchor her");
        span.getAnchor().add(a);
        System.out.println(span.getAnchor().get(0).getAnchor());
    }

    /*public boolean equals(Object obj) {
        return Optional.ofNullable(obj)
                .filter(that -> instanceof Test)
                .map(that -> (Test) that);
    }*/
}
