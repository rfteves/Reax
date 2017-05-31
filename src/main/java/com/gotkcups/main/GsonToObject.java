/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.gotkcups.main;

import java.io.File;
import org.apache.commons.io.FileUtils;

/**
 *
 * @author rfteves
 */
public class GsonToObject {
    public static void main(String[]args) throws Exception {
        String json = FileUtils.readFileToString(new File("D:\\Users\\rfteves\\Documents\\pojo.json"), "UTF-8").replaceAll("[\n\r\t]", "").replaceAll("[ ]{2,}", " ");
        AddShopifyProduct.createClasses(json);
    }
}
