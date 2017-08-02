/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.gotkcups.shopify;

import com.gotkcups.json.GsonData;
import java.util.Map;
import com.gotkcups.io.RestClient;
import com.gotkcups.json.GsonMapper;
import java.io.IOException;
import java.util.HashMap;

/**
 *
 * @author rfteves
 */
public class Products {
    
    public static void main(String[]args) throws Exception {
        Map<String, String> params = new HashMap<>();
        //params.put("fields", "id,title,published_at,product_type,variants");
        GsonData g = Products.getAllProducts("prod", params);
    }
    
    public static GsonData getAllProducts(String env, Map<String, String> params) throws IOException {
	GsonData object = null, next = null;
        int page = 0;
        int limit = 50;
	while (limit == 50) {
            params.put("limit", "50");
            params.put("page", ++page + "");
	    String take = RestClient.getProducts(env, params);
            System.out.println(take);
	    if (object == null) {
		object = GsonMapper.getInstance(take);
	    } else {
                next = GsonMapper.getInstance(take);
                next.getChildren().forEach(object.getChildren()::add);
	    }
            limit = next.getChildren().size();
	}
	return object;
    }
}
