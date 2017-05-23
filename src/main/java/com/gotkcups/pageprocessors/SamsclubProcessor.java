/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.gotkcups.pageprocessors;

import com.gotkcups.data.ProductInfo;
import com.gotkcups.data.Product;
import com.gotkcups.data.Product.ProductStatus;
import com.gotkcups.json.GsonData;
import com.gotkcups.json.GsonMapper;
import com.gotkcups.servers.UrlProductInfo;
import io.mlundela.rxjava.In;
import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.apache.commons.io.FileUtils;
import org.apache.commons.lang.StringEscapeUtils;

/**
 *
 * @author rfteves
 */
public class SamsclubProcessor {

    //<button class="biggreenbtn" tabindex="2" id="addtocartsingleajaxonline"> Ship this item</button>
    private static StringBuilder pad = new StringBuilder();

    public static void costing(List<UrlProductInfo> uds) {
        //<span itemprop="productID">584194</span>
        String s = uds.get(0).getProduct().getVariantsku();
        String id = String.format("<span itemprop=productID>%s</span>", s.substring(0, s.length() - 1));
        String id2 = String.format("Item # %s", s.substring(0, s.length() - 1));//Item # 556159
        String html = uds.get(0).getHtml();
        GsonData products = null;
        if (html == null) {
            uds.stream().forEach(p -> p.getProduct().setStatus(Product.ProductStatus.PAGE_NOT_AVAILABLE));
            return;
        }
        if (html.indexOf("<div id=moneyBoxJson style=display:none>") > 0) {
            int start = html.indexOf("<div id=moneyBoxJson style=display:none>") + "<div id=moneyBoxJson style=display:none>".length();
            int end = html.indexOf("</div>", start);
            pad.setLength(0);
            //pad.append("{\"moneyBoxJson\":");
            pad.append(StringEscapeUtils.unescapeHtml(html.substring(start, end)));
            //pad.append("}");
            try {
                products = GsonMapper.getInstance(pad.toString());
            } catch (IOException ex) {
                Logger.getLogger(SamsclubProcessor.class.getName()).log(Level.SEVERE, null, ex);
            }
            for (UrlProductInfo ud : uds) {
                for (GsonData dg : products.getMap().get("availableSKUs").getChildren()) {
                    if (ud.getProduct().getVariantsku().equals(dg.getString("itemNo").concat("S"))) {
                        if (dg.get("onlineInventoryVO") != null) {
                            ud.getProduct().setInstock(dg.get("onlineInventoryVO").get("status").toString().equals("inStock"));
                            if (ud.getProduct().isInstock()) {
                                double cost = Double.parseDouble(dg.get("onlinePriceVO").get("finalPrice").toString());
                                ud.getProduct().setCost(cost);
                                if (html.indexOf("<div class=freeDelvryTxt>") > 0) {
                                    ud.getProduct().setShipping(0);
                                } else {
                                    ud.getProduct().setShipping(ud.getProduct().getDefaultShipping());
                                }
                                ud.getProduct().setStatus(Product.ProductStatus.PRODUCT_IN_STOCK);
                            } else {
                                ud.getProduct().setStatus(Product.ProductStatus.PRODUCT_OUT_OF_STOCK);
                            }
                        }
                        break;
                    }
                }
            }
            uds.stream().map(ud -> ud.getProduct()).filter(ud -> !ud.isInstock()).forEach(ud -> {
                ud.setStatus(ProductStatus.PRODUCT_OUT_OF_STOCK);
                ud.setInstock(false);
            });
        } else if (html.indexOf(id) != -1) {
            UrlProductInfo ud = uds.get(0);
            if (html.indexOf("<link itemprop=availability href=\"http://schema.org/InStock\"/>") > 0
                    && html.indexOf("<button class=biggreenbtn tabindex=2 id=addtocartsingleajaxonline> Ship this item</button>") > 0) {
                String pattern = "<span class=hidden itemprop=price>[0-9]{1,}.[0-9]{2}</span>";
                ud.getProduct().setInstock(true);
                ud.getProduct().setStatus(Product.ProductStatus.PRODUCT_IN_STOCK);
                ud.getProduct().setCost(retrieveCost(html));
                if (html.indexOf("<div class=freeDelvryTxt>") > 0) {
                    ud.getProduct().setShipping(0);
                } else {
                    ud.getProduct().setShipping(ud.getProduct().getDefaultShipping());
                }
            } else if (html.indexOf("<link itemprop=availability href=\"http://schema.org/OutOfStock\"/>") > 0) {
                ud.getProduct().setStatus(Product.ProductStatus.PRODUCT_OUT_OF_STOCK);
            } else {
                ud.getProduct().setInstock(false);
                int flag = html.indexOf("online_stock_status\":\"outofstock");
                if (flag != -1) {
                    uds.stream().forEach(p -> p.getProduct().setStatus(Product.ProductStatus.PRODUCT_OUT_OF_STOCK));
                } else {
                    uds.stream().forEach(p -> p.getProduct().setStatus(Product.ProductStatus.PRODUCT_LOW_OF_STOCK));
                }

            }
        } else if (html.indexOf(id2) != -1) {
            if (html.indexOf("this item is not available in your selected club") != -1 ||
                    html.indexOf("Select a club for price and availability") != -1) {
                uds.stream().forEach(p -> p.getProduct().setStatus(Product.ProductStatus.PRODUCT_OUT_OF_STOCK));
            } else if (html.indexOf(">Add to cart</button>") != -1) {
                UrlProductInfo ud = uds.get(0);
                ud.getProduct().setInstock(true);
                ud.getProduct().setStatus(Product.ProductStatus.PRODUCT_IN_STOCK);
                ud.getProduct().setCost(retrieveCost(html));
                if (html.indexOf(">Free shipping</span>") != -1) {
                    ud.getProduct().setShipping(0);
                } else {
                    ud.getProduct().setShipping(ud.getProduct().getDefaultShipping());
                }
            } else {
                uds.stream().forEach(p -> p.getProduct().setStatus(Product.ProductStatus.PAGE_NOT_AVAILABLE));
                try {
                    FileUtils.writeStringToFile(new File(String.format("%s.html", uds.get(0).getProduct().getProductid())), html, In.CHARSET_NAME);
                } catch (IOException ex) {
                    Logger.getLogger(SamsclubProcessor.class.getName()).log(Level.SEVERE, null, ex);
                }
            }

        } else {
            uds.stream().forEach(p -> p.getProduct().setStatus(Product.ProductStatus.PRODUCT_NOT_FOUND));
        }
        int qty = 1;
        if (html.indexOf("<div class=\"twoChannel\">") != -1) {
            int begin = html.indexOf("<div class=\"twoChannel\">");
            int start = html.indexOf("<span class=\"qty-msg\">", begin);
            int end = html.indexOf("</span>", start);
            String minorder = html.substring(start, end);
            Matcher m = Pattern.compile("[0-9]{1,}").matcher(minorder);
            if (m.find()) {
                qty = Integer.parseInt(m.group());
            }
        }
        int finalQty = qty;
        uds.stream().map(p -> p.getProduct()).filter(ProductInfo::isInstock).forEach(o -> {
            double cost = o.getCost();
            if (o.getShipping() == 0 && o.getCost() < 50) {
                cost = o.getCost() * 1.04;
            } else if (o.getShipping() != 0) {
                cost = o.getCost() * 1.02;
            }
            cost = Math.floor(cost * 100) / 100;
            o.setCost(cost);
            if (o.getDefaultMinqty() > 0) {
                o.setMinqty(o.getDefaultMinqty());
            } else {
                o.setMinqty(finalQty);
            }
        });
    }

    private static double retrieveCost(String html) {
        double retval = -1;
        String[] patterns = {"<span class=\"striked strikedPrice\">\\$[0-9]{1,}.[0-9]{2}</span>",
            "<span itemprop=price>[0-9]{1,}.[0-9]{2}</span>",
            "<span class=hidden itemprop=price>[0-9]{1,}.[0-9]{2}</span>",
            "<span class=Price-mantissa>[0-9]{1,}.[0-9]{2}</span>",
            "<span itemprop=priceCurrency content=USD>\\$</span><span itemprop=price>[0-9]{1,}.[0-9]{2}</span>"};
        for (String pattern : patterns) {
            Matcher m = Pattern.compile(pattern).matcher(html);
            if (m.find()) {
                m = Pattern.compile("[0-9]{1,}.[0-9]{2}").matcher(m.group());
                if (m.find()) {
                    retval = Double.parseDouble(m.group());
                    break;
                }
            }
        }
        if (retval == -1) {
            // It's probabl in two places
            String[] pats = {"<span class=price>[0-9]{1,}</span>", "<span class=superscript>[0-9]{2}</span>"};
            for (String pattern : pats) {
                Matcher m = Pattern.compile(pattern).matcher(html);
                if (m.find()) {
                    m = Pattern.compile("[0-9]{1,}").matcher(m.group());
                    if (m.find()) {
                        double r = Double.parseDouble(m.group());
                        if (retval == -1) {
                            retval = r;
                        } else {
                            retval += r / 100;
                        }
                    }
                }
            }
        }
        if (retval == -1) {
            // It's probabl in two places
            String[] pats = {"<span class=Price-characteristic>[0-9]{1,}</span>", "<span class=Price-mantissa>[0-9]{2}</span>"};
            for (String pattern : pats) {
                Matcher m = Pattern.compile(pattern).matcher(html);
                if (m.find()) {
                    m = Pattern.compile("[0-9]{1,}").matcher(m.group());
                    if (m.find()) {
                        double r = Double.parseDouble(m.group());
                        if (retval == -1) {
                            retval = r;
                        } else {
                            retval += r / 100;
                        }
                    }
                }
            }
        }
        return retval;
    }
}
