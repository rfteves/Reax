/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.gotkcups.main;

import com.gotkcups.data.EntityFacade;
import com.gotkcups.data.ProductChange;
import com.gotkcups.io.RestClient;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author rfteves
 */
public class SubmitProductChanges {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Collection<ProductChange> changes = EntityFacade.findAll(ProductChange.class);
        Map<String, String> params = new HashMap<String, String>();
        params.put("fields", "id,title,published_at,product_type,variants");
        changes.stream().forEach(p -> {
            System.out.println(p.getDescription() + ", price: " + p.getPrice() + ", listprice: " + p.getListPrice() + ", instock: " + p.isInStock());
            //String json = RestClient.getProduct("prod", Long.parseLong(p.getProductid()), p.getVariantid(), p.getPrice(), p.getListPrice(), p.isInStock() ? 200: 0);
            String json = RestClient.getProduct("prod", Long.parseLong(p.getProductid()), params);
            
            System.out.println(json);
            System.out.println();
        });
    }
    
}
