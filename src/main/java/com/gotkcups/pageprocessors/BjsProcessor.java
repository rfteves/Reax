/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.gotkcups.pageprocessors;

import com.gotkcups.data.KeurigSelect;
import com.gotkcups.data.Product;
import com.gotkcups.json.Utilities;
import com.gotkcups.data.Product.ProductStatus;
import com.gotkcups.servers.UrlProductInfo;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * @author rfteves
 */
public class BjsProcessor {

    public static void costing(List<UrlProductInfo> uds) {
        String html = uds.get(0).getHtml();
        if (html == null) {
            uds.stream().forEach(p -> p.getProduct().setStatus(Product.ProductStatus.PAGE_NOT_AVAILABLE));
            return;
        }
        if (html.indexOf("<h1>Product Not Found</h1>") > 0) {
            uds.stream().forEach(p -> p.getProduct().setStatus(Product.ProductStatus.PRODUCT_NOT_FOUND));
            return;
        }
        int start = html.indexOf("<p class=models id=productModel>");
        int end = html.indexOf("</p>", start);
        if (start != -1) {
            String idp = html.substring(start, end);
            String varsku = uds.get(0).getProduct().getVariantsku().substring(0, uds.get(0).getProduct().getVariantsku().length() - 1);
            if (idp.contains(varsku)) {
                start = html.indexOf("<input id=addItemTocartButton");
                if (start != -1) {
                    uds.get(0).getProduct().setInstock(true);
                    uds.get(0).getProduct().setMinqty(1);
                    uds.get(0).getProduct().setStatus(ProductStatus.PRODUCT_IN_STOCK);
                    start = html.indexOf("class=price4 id=prodFamilyId");
                    start = html.indexOf("<span>", start);
                    end = html.indexOf("</span>", start);
                    String str = html.substring(start, end);
                    Matcher m = Pattern.compile("[0-9]{1,}.[0-9]{2}").matcher(str);
                    if (uds.get(0).getProduct().getDefaultCost() > 0) {
                        uds.get(0).getProduct().setCost(uds.get(0).getProduct().getDefaultCost());
                    } else if (m.find()) {
                        double cost = Double.parseDouble(m.group());
                        uds.get(0).getProduct().setCost(cost);
                    }
                    if (html.indexOf("<div id=freeShipping") != -1) {
                        uds.get(0).getProduct().setShipping(0);
                    } else if (uds.get(0).getProduct().getDefaultShipping() > 0) {
                        uds.get(0).getProduct().setShipping(uds.get(0).getProduct().getDefaultShipping());
                    }
                } else {
                    uds.get(0).getProduct().setInstock(false);
                    uds.get(0).getProduct().setStatus(ProductStatus.PRODUCT_OUT_OF_STOCK);
                }
            }
        } else {
            System.out.println();
        }
    }
    private final static StringBuilder sb = new StringBuilder();
}
