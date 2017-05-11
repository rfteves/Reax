/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.gotkcups.pageprocessors;

import com.gotkcups.data.KeurigSpan;
import com.gotkcups.data.KeurigSelect;
import com.gotkcups.data.Product;
import com.cwd.db.Base64Coder;
import com.gotkcups.json.GsonData;
import com.gotkcups.json.GsonMapper;
import com.gotkcups.json.Utilities;
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
public class KeurigProcessor {

    public static void costing(List<UrlProductInfo> uds) {
        String html = uds.get(0).getHtml();
        GsonData options = null;
        GsonData products = null;
        if (html == null) {
            uds.stream().forEach(p -> p.getProduct().setStatus(Product.ProductStatus.PAGE_NOT_AVAILABLE));
            return;
        }
        if (html.indexOf("<h1>Product Not Found</h1>") > 0) {
            uds.stream().forEach(p -> p.getProduct().setStatus(Product.ProductStatus.PRODUCT_NOT_FOUND));
            return;
        }
        if (uds.get(0).getUrl().indexOf("/Beverages") > 0 && html.indexOf("<select id=\"package-variant-select\"") > 0) {
            int start = html.indexOf("<select id=\"package-variant-select\"");
            int end = html.indexOf("</select>", start) + 9;
            String opts = html.substring(start, end).replaceAll("[\t\r\n]", " ").replaceAll("[ ]{2,}", " ");
            KeurigSelect select = (KeurigSelect) Utilities.objectify(opts, new KeurigSelect());
            select.getOption().stream().filter(o -> o.getDataPurchasable().equalsIgnoreCase("true")).forEach(o -> {
                for (UrlProductInfo ud : uds) {
                    if (ud.getProduct().getVariantsku().startsWith(o.getDataCode().concat("K")) && !"true".equals(o.getDisabled())) {
                        ud.getProduct().setInstock(true);
                        double cost = Double.parseDouble(o.getDataPrice().substring(1));
                        cost = Math.round((cost * (ProductProcessor.MARKUP_NON_TAXABLE)) * 100) / 100;
                        ud.getProduct().setCost(cost);
                        ud.getProduct().setStatus(ProductStatus.PRODUCT_IN_STOCK);
                        if (ud.getProduct().getDefaultShipping() > 0) {
                            ud.getProduct().setShipping(ud.getProduct().getDefaultShipping());
                        } else {
                            ud.getProduct().setShipping(0);
                        }
                        if (ud.getProduct().getDefaultMinqty() > 0) {
                            ud.getProduct().setMinqty(ud.getProduct().getDefaultMinqty());
                        } else {
                            ud.getProduct().setMinqty(1);
                        }
                        break;
                    }
                }
            });
        } else if (uds.get(0).getUrl().indexOf("/Brewers") > 0 && html.indexOf("<span class=\"custom-color-swatch\">") > 0) {
            int start = html.indexOf("<span class=\"custom-color-swatch\">");
            int end = html.indexOf("</span>", start) + 7;
            String opts = html.substring(start, end).replaceAll("[\t\r\n]", " ").replaceAll("[\"]{2}", "\"\" ").replaceAll("[ ]{2,}", " ");
            int select = 0;
            sb.setLength(0);
            sb.append("<span>");
            while ((start = opts.indexOf("<a ", select)) != -1) {
                end = opts.indexOf("/a>", start) + 3;
                sb.append(opts.substring(start, end));
                select = end;
            }
            sb.append("</span>");
            KeurigSpan span = (KeurigSpan) Utilities.objectify(sb.toString(), new KeurigSpan());
            span.getAnchor().stream().filter(o -> o.getDataPurchasable().equalsIgnoreCase("true")).forEach(o -> {
                for (UrlProductInfo ud : uds) {
                    if (ud.getProduct().getVariantsku().startsWith(o.getDataCode().concat("K")) && !"true".equals(o.getDisabled())) {
                        ud.getProduct().setInstock(true);
                        double cost = Double.parseDouble(o.getDataPrice().substring(1));
                        cost = Math.round((cost * (0.75)) * 100) / 100;
                        if (ud.getProduct().getDefaultCost() > 0) {
                            cost = ud.getProduct().getDefaultCost();
                        }
                        ud.getProduct().setCost(cost);
                        ud.getProduct().setStatus(ProductStatus.PRODUCT_IN_STOCK);
                        if (ud.getProduct().getDefaultShipping() > 0) {
                            ud.getProduct().setShipping(ud.getProduct().getDefaultShipping());
                        } else {
                            ud.getProduct().setShipping(0);
                        }
                        if (ud.getProduct().getDefaultMinqty() > 0) {
                            ud.getProduct().setMinqty(ud.getProduct().getDefaultMinqty());
                        } else {
                            ud.getProduct().setMinqty(1);
                        }
                    } else {
                        ud.getProduct().setStatus(ProductStatus.PRODUCT_OUT_OF_STOCK);
                    }
                }
            });
        }
    }
    private final static StringBuilder sb = new StringBuilder();
}
