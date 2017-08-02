/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.gotkcups.tests;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;


/**
 *
 * @author rfteves
 */
public class TestGson {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String json = "{\"products\":[{\"id\":8199345863,\"variants\":[{\"id\":26314700743,\"product_id\":8199345863,\"title\":\"Default Title\",\"price\":\"47.98\",\"sku\":\"220743C\",\"position\":1,\"grams\":5,\"inventory_policy\":\"deny\",\"compare_at_price\":\"0.00\",\"fulfillment_service\":\"manual\",\"inventory_management\":\"shopify\",\"option1\":\"Default Title\",\"option2\":null,\"option3\":null,\"created_at\":\"2016-07-30T11:10:01-07:00\",\"updated_at\":\"2017-07-30T09:37:07-07:00\",\"taxable\":false,\"barcode\":\"086216118456\",\"image_id\":null,\"inventory_quantity\":120,\"weight\":0.01,\"weight_unit\":\"lb\",\"old_inventory_quantity\":120,\"requires_shipping\":true}]},{\"id\":9797752650,\"variants\":[{\"id\":35491809802,\"product_id\":9797752650,\"title\":\"Default Title\",\"price\":\"125.98\",\"sku\":\"996603C\",\"position\":1,\"grams\":5,\"inventory_policy\":\"deny\",\"compare_at_price\":\"0.00\",\"fulfillment_service\":\"manual\",\"inventory_management\":\"shopify\",\"option1\":\"Default Title\",\"option2\":null,\"option3\":null,\"created_at\":\"2016-12-31T09:35:06-08:00\",\"updated_at\":\"2017-07-30T09:37:08-07:00\",\"taxable\":false,\"barcode\":\"00858957002796\",\"image_id\":null,\"inventory_quantity\":113,\"weight\":0.01,\"weight_unit\":\"lb\",\"old_inventory_quantity\":113,\"requires_shipping\":true}]},{\"id\":10146096778,\"variants\":[{\"id\":38179165514,\"product_id\":10146096778,\"title\":\"Black\",\"price\":\"35.98\",\"sku\":\"1123314C\",\"position\":1,\"grams\":5,\"inventory_policy\":\"deny\",\"compare_at_price\":\"0.00\",\"fulfillment_service\":\"manual\",\"inventory_management\":\"shopify\",\"option1\":\"Black\",\"option2\":null,\"option3\":null,\"created_at\":\"2017-02-21T22:00:55-08:00\",\"updated_at\":\"2017-07-30T09:37:09-07:00\",\"taxable\":false,\"barcode\":\"00737839948813\",\"image_id\":25762824970,\"inventory_quantity\":0,\"weight\":0.01,\"weight_unit\":\"lb\",\"old_inventory_quantity\":0,\"requires_shipping\":true},{\"id\":38179284042,\"product_id\":10146096778,\"title\":\"Yellow\",\"price\":\"35.98\",\"sku\":\"1121729C\",\"position\":2,\"grams\":5,\"inventory_policy\":\"deny\",\"compare_at_price\":\"0.00\",\"fulfillment_service\":\"manual\",\"inventory_management\":\"shopify\",\"option1\":\"Yellow\",\"option2\":null,\"option3\":null,\"created_at\":\"2017-02-21T22:05:05-08:00\",\"updated_at\":\"2017-07-30T09:37:09-07:00\",\"taxable\":false,\"barcode\":\"00737839948813\",\"image_id\":25762735882,\"inventory_quantity\":0,\"weight\":0.01,\"weight_unit\":\"lb\",\"old_inventory_quantity\":0,\"requires_shipping\":true}]},{\"id\":9818513354,\"variants\":[{\"id\":35648737610,\"product_id\":9818513354,\"title\":\"Default Title\",\"price\":\"51.98\",\"sku\":\"577804C\",\"position\":1,\"grams\":5,\"inventory_policy\":\"deny\",\"compare_at_price\":\"0.00\",\"fulfillment_service\":\"manual\",\"inventory_management\":\"shopify\",\"option1\":\"Default Title\",\"option2\":null,\"option3\":null,\"created_at\":\"2017-01-05T08:02:25-08:00\",\"updated_at\":\"2017-07-30T09:37:10-07:00\",\"taxable\":false,\"barcode\":\"795622574816\",\"image_id\":null,\"inventory_quantity\":119,\"weight\":0.01,\"weight_unit\":\"lb\",\"old_inventory_quantity\":119,\"requires_shipping\":true}]},{\"id\":9797802186,\"variants\":[{\"id\":35491981322,\"product_id\":9797802186,\"title\":\"Default Title\",\"price\":\"59.98\",\"sku\":\"447691C\",\"position\":1,\"grams\":5,\"inventory_policy\":\"deny\",\"compare_at_price\":\"0.00\",\"fulfillment_service\":\"manual\",\"inventory_management\":\"shopify\",\"option1\":\"Default Title\",\"option2\":null,\"option3\":null,\"created_at\":\"2016-12-31T09:46:11-08:00\",\"updated_at\":\"2017-07-30T09:37:11-07:00\",\"taxable\":false,\"barcode\":\"615268460123\",\"image_id\":null,\"inventory_quantity\":120,\"weight\":0.01,\"weight_unit\":\"lb\",\"old_inventory_quantity\":120,\"requires_shipping\":true}]}]}";
        GsonBuilder builder = new GsonBuilder(); 
        Gson gson = builder.create();
        JsonParser parser = new JsonParser(); 
        JsonElement element = parser.parse(json);
        JsonObject obj = element.getAsJsonObject();
        JsonObject ven = new JsonObject();
        JsonArray products = obj.getAsJsonArray("products");
        JsonObject je = (JsonObject)products.get(0);
        ven.addProperty("productid", je.get("id").getAsLong());
        System.out.println(ven);
        
        /*ven.addProperty("productid", obj.get);
                            Document vendor = new Document();
                    vendor.put("productid", product.get("id"));
                    vendor.put("variantid", variant.get("id"));
                    vendor.put("sku", variant.getString("sku"));*/

        
        System.out.println("obj:" + obj);
        
        
        
    }
    
}
