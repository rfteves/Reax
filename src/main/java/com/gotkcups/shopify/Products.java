/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.gotkcups.shopify;

import com.gotkcups.json.GsonData;
import java.util.Map;
import com.gotkcups.io.HttpTool;
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
	int limit = 10;
	int page = 0;
	while (limit > 0) {
	    String take = HttpTool.getProducts(env, limit, ++page, params);
            System.out.println(take);
	    if (object == null) {
		object = GsonMapper.getInstance(take);
	    } else {
                next = GsonMapper.getInstance(take);
	    }
	    if (next.getChildren().size() < 50) {
		break;
	    }
	}
	return object;
    }
}
