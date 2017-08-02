/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.gotkcups.main;

import com.borland.dx.sql.dataset.ConnectionDescriptor;
import com.borland.dx.sql.dataset.Load;
import com.borland.dx.sql.dataset.QueryDescriptor;
import com.cwd.db.ColumnFactory;
import com.cwd.db.Data;
import com.google.gson.Gson;
import com.gotkcups.data.EntityFacade;
import com.gotkcups.data.Product;
import com.gotkcups.data.Product.ProductStatus;
import com.gotkcups.data.ProductChange;
import com.gotkcups.io.RestClient;
import com.gotkcups.json.GsonData;
import com.gotkcups.json.GsonMapper;
import com.gotkcups.json.Utilities;
import com.gotkcups.shopify.ShopifyProduct;
import com.gotkcups.shopify.ShopifyProducts;
import com.gotkcups.shopify.ShopifyVariant;
import java.io.File;
import java.io.IOException;
import java.math.BigDecimal;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.apache.commons.io.FileUtils;

/**
 *
 * @author rfteves
 */
public class SubmitProductChanges {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {

        //String j = FileUtils.readFileToString(new File("D:\\Users\\rfteves\\products.json"), "UTF-8");
        //GsonData g = GsonMapper.getInstance(j);
        initData();
        Gson gson = new Gson();
        Collection<ProductChange> changes = EntityFacade.findAll(ProductChange.class);
        Map<String, String> params = new HashMap<String, String>();
        params.put("fields", "id,variants");
        changes.stream().filter(p -> p.isInStock() == false).forEach(p -> {
            System.out.println(p.getProductid() + ":" + p.getVariantsku() + p.getDescription() + ", price: " + p.getPrice() + ", listprice: " + p.getListPrice() + ", instock: " + p.isInStock());
            String json = RestClient.getProduct("prod", Long.parseLong(p.getProductid()), params);
            ShopifyProducts sp = gson.fromJson(json, ShopifyProducts.class);
            sp.getProduct().getVariants().stream().filter(pc -> pc.getId() == Long.parseLong(p.getVariantid())).forEach(pc -> {
                pc.setInventory_quantity(0);
            });
            json = gson.toJson(sp);
            json = RestClient.updateProduct("prod", Long.parseLong(p.getProductid()), json);
            update(p);
            System.out.println("-*+*+*+*+*-");
        });
        changes.stream().filter(p -> p.isInStock() == true).forEach(p -> {
            System.out.println(p.getProductid() + ":" + p.getVariantsku() + p.getDescription() + ", price: " + p.getPrice() + ", listprice: " + p.getListPrice() + ", instock: " + p.isInStock());
            String json = RestClient.getProduct("prod", Long.parseLong(p.getProductid()), params);
            ShopifyProducts sp = gson.fromJson(json, ShopifyProducts.class);
            sp.getProduct().getVariants().stream().filter(pc -> pc.getId() == Long.parseLong(p.getVariantid())).forEach(pc -> {
                pc.setInventory_quantity(p.getInvqty());
                pc.setPrice("" + p.getPrice());
                pc.setCompare_at_price("" + p.getListPrice());

            });
            json = gson.toJson(sp);
            json = RestClient.updateProduct("prod", Long.parseLong(p.getProductid()), json);
            update(p);
            System.out.println("-*+*+*+*+*-");
        });
    }
    private static Data data;

    private static void initData() {
        data = Data.getData();
        try {
            data.getSourcedb().setConnection(new ConnectionDescriptor(
                    Utilities.getApplicationProperty("jdbc.url.amazonkeurig"), Utilities.getApplicationProperty("jdbc.user"),
                    Utilities.getApplicationProperty("jdbc.password"), false, "com.mysql.jdbc.Driver"));
            data.getSourcedb().getJdbcConnection().setAutoCommit(false);
            data.getSource().setQuery(new QueryDescriptor(data.getSourcedb(),
                    "select * from shopifyurls where productid=:productid and variantid=:variantid",
                    data.getParameters(), true, Load.ALL));
            data.getParameters().addColumn(ColumnFactory.createStringColumn("productid"));
            data.getParameters().addColumn(ColumnFactory.createStringColumn("variantid"));
        } catch (Throwable ex) {
            ex.printStackTrace();
        }
    }

    private static void update(ProductChange change) {
        if (!data.getSource().open()) {
            data.getSource().open();
        }
        data.getParameters().setString("productid", change.getProductid());
        data.getParameters().setString("variantid", change.getVariantid());
        data.getSource().refresh();
        if (!data.getSource().isEmpty()) {
            data.getSource().setBigDecimal("minprice", BigDecimal.valueOf(change.getPrice()));
            data.getSource().setBigDecimal("maxprice", BigDecimal.valueOf(change.getListPrice()));
            data.getSource().setBigDecimal("instockqty", BigDecimal.valueOf(change.getInvqty()));
            data.getSource().setString("instock", change.getInvqty() == 0 ? "N" : "Y");
            data.getSource().saveChanges();
        }
    }

}
