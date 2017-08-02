/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.gotkcups.metafields;

import com.borland.dx.dataset.MasterLinkDescriptor;
import com.borland.dx.sql.dataset.ConnectionDescriptor;
import com.borland.dx.sql.dataset.Load;
import com.borland.dx.sql.dataset.QueryDescriptor;
import com.cwd.db.ColumnFactory;
import com.cwd.db.Data;
import com.gotkcups.io.RestClient;
import com.gotkcups.json.Utilities;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.bson.Document;

/**
 *
 * @author rfteves
 */
public class AddCustom {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws Exception {

        String namespace = "inventory";
        Document products = AddCustom.initProducts();
        AddCustom.processProducts(products);
    }

    private static Document initProducts() throws IOException {
        Map<String, String> params = new HashMap<>();
        params.put("fields", "id,variants,metafields");
        return AddCustom.getAllProducts("prod", params);
    }

    private static void processProducts(Document doc) {
        List<Document> products = (List) doc.get("products");
        products.stream().forEach(AddCustom::createMetafield);
    }

    private static void createMetafield(Document product) {
        Data data = AddCustom.getData();
        List<Document> variantsArray = (List) product.get("variants");
        for (Document variant : variantsArray) {
            Document meta = null;
            String sku = variant.getString("sku");
            if (sku == null) {
                System.out.println("");
            }
            data.getParameters().setString("variantsku", sku);
            data.getSource().refresh();
            if (data.getSource().getRowCount() != 0) {
                List<Document> vendors = new ArrayList<Document>();
                if (!data.getTarget().isOpen()) {
                    data.getTarget().open();
                }
                data.getTarget().refresh();
                Document metafield = new Document();
                do {
                    Document vendor = new Document();
                    vendor.put("variantid", variant.get("id"));
                    vendor.put("productid", product.get("id"));
                    vendor.put("taxable", data.getTarget().getString("taxable").equalsIgnoreCase("Y"));
                    vendor.put("sku", variant.getString("sku"));
                    vendor.put("url", data.getTarget().getString("url"));
                    if (data.getTarget().getBigDecimal("defaultcost").doubleValue() > 0) {
                        vendor.put("defaultcost", data.getTarget().getBigDecimal("defaultcost").doubleValue());
                    }
                    if (data.getTarget().getBigDecimal("defaultshipping").doubleValue() > 0) {
                        vendor.put("defaultshipping", data.getTarget().getBigDecimal("defaultshipping").doubleValue());
                    }
                    if (data.getTarget().getBigDecimal("defaultminqty").intValue() > 1) {
                        vendor.put("defaultminqty", data.getTarget().getBigDecimal("defaultminqty").intValue());
                    }
                    vendor.put("pageid", data.getTarget().getString("pageid"));
                    vendors.add(vendor);
                } while (data.getTarget().next());
                Document v = new Document();
                v.put("vendors", vendors);
                metafield.put("namespace", "inventory");
                metafield.put("key", "vendor");
                metafield.put("value", v.toJson().toString());
                metafield.put("value_type", "string");
                meta = new Document();
                meta.put("metafield", metafield);
                if (!data.getSource().getString("url").startsWith("http")) {
                    System.out.println("meta " + meta.toJson() + ":" + product.get("id"));
                }
                RestClient.createVariantMetaField("prod", product.getLong("id"), variant.getLong("id"), meta.toJson());
                System.out.println("meta " + meta.toJson() + ":" + product.get("id"));
            } else {
                System.out.println("product no shopifyurl: " + product.get("id") + "_" + variant.getLong("id") + ":" + sku);
            }
        }
    }

    public static Document getAllProducts(String env, Map<String, String> params) throws IOException {
        return getAllProducts(env, params, 50, -1);
    }

    public static Document getAllProducts(String env, Map<String, String> params, int pageLimit, int bookLimit) throws IOException {
        final Document[] object = new Document[1];
        Document next = null;
        int page = 0;
        params.put("limit", "" + pageLimit);
        int pageMax = pageLimit;
        while (pageLimit == pageMax) {
            params.put("page", ++page + "");
            String take = RestClient.getProducts(env, params);
            System.out.println(take);
            Document tempdoc = Document.parse(take);
            if (object[0] == null) {
                object[0] = tempdoc;
            } else {
                next = tempdoc;
                List<Document> docs = (List) next.get("products");
                docs.stream().forEach(((List) object[0].get("products"))::add);
            }
            pageLimit = ((List) tempdoc.get("products")).size();
            if (bookLimit < 0) {
                continue;
            } else if (((List) object[0].get("products")).size() >= bookLimit) {
                break;
            }
            //if (true)break;
        }
        return object[0];
    }
    private static Data privdata;

    private static Data getData() {
        Data data = privdata;
        if (privdata == null) {
            data = Data.getData();
            data.getSourcedb().setConnection(new ConnectionDescriptor(
                    Utilities.getApplicationProperty("jdbc.url.amazonkeurig"),
                    Utilities.getApplicationProperty("jdbc.user"),
                    Utilities.getApplicationProperty("jdbc.password"),
                    false, "com.mysql.jdbc.Driver"));
            data.getParameters().addColumn(ColumnFactory.createStringColumn("variantsku"));
            data.getSource().setQuery(new QueryDescriptor(data.getSourcedb(),
                    "select * from shopifyurls where variantsku = :variantsku",
                    data.getParameters(), true, Load.ALL));
            data.getTarget().setQuery(new QueryDescriptor(data.getSourcedb(),
                    "select * from shopifyurls where variantid = :variantid",
                    data.getSource(), true, Load.ALL));
            data.getTarget().setMasterLink(new MasterLinkDescriptor(
                    data.getSource(), new String[]{"variantid"}, new String[]{"variantid"}, true, false, false));
            data.getSource().open();
            privdata = data;
        }
        return data;
    }
}
