/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.gotkcups.metafields;

import com.gotkcups.io.RestClient;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.bson.Document;

/**
 *
 * @author rfteves
 */
public class UpdateVariant {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws Exception {
        Map<String, String> params = new HashMap<>();
        params.put("fields", "id,variants,metafields");
        /*Document doc = AddCustom.getAllProducts("prod", params, 1, 1);
        List<Document> products = (List) doc.get("products");
        products.stream().forEach(UpdateVariant::update);*/
    }
 
    private static void update(Document product) {
        List<Document> variantsArray = (List) product.get("variants");
        for (Document variant : variantsArray) {
            String get = RestClient.getVariantMetaField("prod", product.getLong("id"), variant.getLong("id"));
            Document meta = Document.parse(get);
            List<Document> metafields = (List) meta.get("metafields");
            metafields.stream().forEach(UpdateVariant::namespace);
            System.out.println();
        }
    }
    
    private static void namespace(Document metafield) {
        if (metafield.getString("namespace").equals("inventory") && metafield.getString("key").equals("vendor")) {
        }
    }
}
