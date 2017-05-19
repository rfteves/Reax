/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.gotkcups.pageprocessors;

import com.gotkcups.data.KeurigSpan;
import com.gotkcups.data.KeurigSelect;
import com.gotkcups.data.Product;
import com.gotkcups.json.GsonData;
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
public class KeurigProcessor {

    public final static float KEURIG_DISCOUNT_BREWERS = 0.275f;
    public final static float KEURIG_DISCOUNT_BEVERAGES = 0.125f;
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
        /*
        <div class="in-stock">
				<button id="addToCartButton" type="submit" class="addToCartButton badd_to_cart_front btn-box btn-orange">
							Add to cart</button>
					</div>
         */
        if (uds.get(0).getUrl().indexOf("/Beverages") > 0 && html.indexOf("<select id=\"package-variant-select\"") > 0) {
            int start = html.indexOf("<select id=\"package-variant-select\"");
            int end = html.indexOf("</select>", start) + 9;
            String opts = html.substring(start, end).replaceAll("[\t\r\n]", " ").replaceAll("[ ]{2,}", " ");
            KeurigSelect select = (KeurigSelect) Utilities.objectify(opts, new KeurigSelect());
            select.getOption().stream().forEach(o -> {
                for (UrlProductInfo ud : uds) {
                    if (ud.getProduct().getVariantsku().startsWith(o.getDataCode().concat("K")) && !"true".equals(o.getDisabled())) {
                        if (o.getDataStock().equalsIgnoreCase("inStock") && o.getDataPurchasable().equalsIgnoreCase("true")) {
                            ud.getProduct().setInstock(true);
                            ud.getProduct().setStatus(ProductStatus.PRODUCT_IN_STOCK);
                            double cost = Double.parseDouble(o.getDataPrice().substring(1));
                            cost = Math.round((cost * (1 - KEURIG_DISCOUNT_BEVERAGES)) * 100) * 0.01;
                            ud.getProduct().setCost(cost);
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
                            ud.getProduct().setInstock(false);
                            ud.getProduct().setStatus(ProductStatus.PRODUCT_OUT_OF_STOCK);
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
                        cost = Math.round((cost * (1 - KEURIG_DISCOUNT_BREWERS)) * 100) * 0.01;
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
        } else if (uds.get(0).getUrl().indexOf("/Coffee-Makers") > 0 && html.indexOf("<div class=\"in-stock\"") != -1
                && html.indexOf("<button id=\"addToCartButton\" type=\"submit\"") != -1) {
            uds.get(0).getProduct().setInstock(true);
            Matcher m = Pattern.compile("<div class=\"big-price left\">[\r\n\t ]+\\$[0-9]{1,}.[0-9]{2}</div>").matcher(html);
            if (m.find()) {
                m = Pattern.compile("[0-9]{1,}.[0-9]{2}").matcher(m.group());
                if (m.find()) {
                        double cost = Double.parseDouble(m.group());
                        cost = Math.round((cost * (1 - KEURIG_DISCOUNT_BREWERS)) * 100) * 0.01;
                        if (uds.get(0).getProduct().getDefaultCost() > 0) {
                            cost = uds.get(0).getProduct().getDefaultCost();
                        }
                        uds.get(0).getProduct().setCost(cost);
                        uds.get(0).getProduct().setStatus(ProductStatus.PRODUCT_IN_STOCK);
                        if (uds.get(0).getProduct().getDefaultShipping() > 0) {
                            uds.get(0).getProduct().setShipping(uds.get(0).getProduct().getDefaultShipping());
                        } else {
                            uds.get(0).getProduct().setShipping(0);
                        }
                        if (uds.get(0).getProduct().getDefaultMinqty() > 0) {
                            uds.get(0).getProduct().setMinqty(uds.get(0).getProduct().getDefaultMinqty());
                        } else {
                            uds.get(0).getProduct().setMinqty(1);
                        }
                }
            }
        }
    }
    private final static StringBuilder sb = new StringBuilder();
}
