/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.gotkcups.pageprocessors;

import com.gotkcups.data.Product;
import com.cwd.db.Base64Coder;
import com.gotkcups.json.GsonData;
import com.gotkcups.json.GsonMapper;
import com.gotkcups.data.Product.ProductStatus;
import com.gotkcups.servers.UrlProductInfo;
import java.io.IOException;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * @author rfteves
 */
public class CostcoProcessor {

    public static void costing(List<UrlProductInfo> uds) {
        String html = uds.get(0).getHtml();
        dig(html, uds);
    }
    
    private static void dig(String html, List<UrlProductInfo> uds) {
        GsonData options = null;
        GsonData products = null;
        if (html == null) {
            return;
        }
        if (html.indexOf("<h1>Product Not Found</h1>") > 0) {
            if (html.indexOf("is not valid for the current contract") != -1) {
                uds.stream().forEach(p -> p.getProduct().setStatus(Product.ProductStatus.PRODUCT_NOT_VALID));
            } else {
                uds.stream().forEach(p -> p.getProduct().setStatus(Product.ProductStatus.PRODUCT_NOT_FOUND));
            }
            return;
        }
        if (html.indexOf("var options = ") > 0) {
            int start = html.indexOf("var options = ") + 14;
            int end = html.indexOf("];", start) + 1;
            String varoptions = html.substring(start, end).replaceAll("[\n\r\t]", "").replaceAll("[ ]{2,}", " ");
            try {
                options = GsonMapper.getInstance(varoptions);
            } catch (IOException ex) {
                Logger.getLogger(CostcoProcessor.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        if (html.indexOf("var products = ") > 0) {
            int start = html.indexOf("var products = ") + 15;
            int end = html.indexOf("];", start) + 1;
            String varproducts = html.substring(start, end).replaceAll("[\n\r\t]", "").replaceAll("[ ]{2,}", " ");
            try {
                products = GsonMapper.getInstance(varproducts);
            } catch (IOException ex) {
                Logger.getLogger(CostcoProcessor.class.getName()).log(Level.SEVERE, null, ex);
            }
            if (options == null || options.getChildren().get(0).getChildren().size() == 0) {
                GsonData dg = products.getChildren().get(0).getChildren().get(0);
                if (dg.getString("listPrice") != null) {
                    String str = Base64Coder.decode(dg.getString("listPrice"));
                    dg.put("listPrice", GsonData.getInstance(str));
                }
                if (dg.getString("price") != null) {
                    String str = Base64Coder.decode(dg.getString("price"));
                    dg.put("price", GsonData.getInstance(str));
                }
            } else {
                Map<String, GsonData> all = new LinkedHashMap<>();
                options.getChildren().get(0).getChildren().stream().map(v -> v.getMap("v")).forEach(all::putAll);
                List<GsonData> newOptions = new ArrayList<>();
                for (GsonData dg : products.getChildren().get(0).getChildren()) {
                    GsonData opt = (GsonData) dg.get("options");
                    if (dg.getString("listPrice") != null) {
                        String str = Base64Coder.decode(dg.getString("listPrice"));
                        dg.put("listPrice", GsonData.getInstance(str));
                    }
                    if (dg.getString("price") != null) {
                        String str = Base64Coder.decode(dg.getString("price"));
                        dg.put("price", GsonData.getInstance(str));
                    }
                    opt.getChildren().stream().forEach(o -> {
                        newOptions.add(all.get(o.getName()));
                    });
                    opt.getChildren().clear();
                    newOptions.stream().forEach(opt.getChildren()::add);
                    newOptions.clear();
                }

            }
        } else {
            uds.stream().forEach(p -> p.getProduct().setStatus(Product.ProductStatus.PAGE_NOT_AVAILABLE));
            return;
        }
        if (products != null && products.getChildren().size() == 1) {
            int start = html.indexOf("<p id=\"shipping-statement\">");
            int end = html.indexOf("</p>", start);
            double shipping = 0;
            if (start != -1) {
                String str = html.substring(start, end);
                Matcher m = Pattern.compile("[0-9]{1,}.[0-9]{2}").matcher(str);
                if (m.find()) {
                    if (m.group().equals("0:00")) {
                        shipping = 0;
                    } else {
                        shipping = Double.parseDouble(m.group());
                    }
                    
                }
            }
            int minqty = 1;
            Matcher m = Pattern.compile("Minimum Order Quantity: [0-9]{1,}").matcher(html);
            if (m.find()) {
                m = Pattern.compile("[0-9]{1,}").matcher(m.group());
                if (m.find()) {
                    minqty = Integer.parseInt(m.group());
                }
            }
            for (UrlProductInfo ud : uds) {
                for (GsonData dg : products.getChildren().get(0).getChildren()) {
                    if (ud.getProduct().getVariantsku().equals(dg.getString("partNumber").concat("C"))) {
                        if (dg.getString("ordinal").contains("E")) {
                            ud.getProduct().setInstock(true);
                            ud.getProduct().setStatus(ProductStatus.PRODUCT_IN_STOCK);
                        } else {
                            double qty = Double.parseDouble(dg.getString("ordinal"));
                            ud.getProduct().setInstock(qty > 10);
                            if (ud.getProduct().isInstock()) {
                                ud.getProduct().setStatus(ProductStatus.PRODUCT_IN_STOCK);
                            } else {
                                ud.getProduct().setStatus(ProductStatus.PRODUCT_OUT_OF_STOCK);
                            }
                        }
                        double cost = Double.parseDouble(dg.getString("price"));
                        double listcost = Double.parseDouble(dg.getString("listPrice"));
                        if (listcost > 0 && cost > listcost) {
                            double c = cost;
                            cost = listcost;
                            listcost = c;
                        }
                        ud.getProduct().setCost(cost);
                        ud.getProduct().setListCost(listcost);
                        ud.getProduct().setShipping(shipping == 0 ? ud.getProduct().getDefaultShipping() : shipping);
                        ud.getProduct().setMinqty(minqty);
                        break;
                    }
                }
            }
            uds.stream().map(ud -> ud.getProduct()).filter(ud -> !ud.isInstock()).forEach(ud -> {ud.setStatus(ProductStatus.PRODUCT_OUT_OF_STOCK); ud.setInstock(false);});
        }
    }
}
