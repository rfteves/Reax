/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.gotkcups.pageprocessors;

import com.gotkcups.servers.UrlProductInfo;
import java.util.List;

/**
 *
 * @author rfteves
 */
public abstract class ProductProcessor {

    public final static double MARKUP_TAXABLE = 0.835;
    public final static double MARKUP_NON_TAXABLE = 0.9;
    public final static double MARKUP_DISCOUNT = 0.035;

    public static void costing(List<UrlProductInfo> uds) {
        System.out.println(uds.get(0).getUrl());
        if (uds.get(0).getUrl().contains("costco.com")) {
            CostcoProcessor.costing(uds);
        } else if (uds.get(0).getUrl().contains("keurig.com")) {
            KeurigProcessor.costing(uds);
        } else if (uds.get(0).getUrl().contains("samsclub.com")) {
            SamsclubProcessor.costing(uds);
        } else if (uds.get(0).getUrl().contains("bjs.com")) {
            BjsProcessor.costing(uds);
        }
    }

    public static void pricing(List<UrlProductInfo> uds) {
        uds.stream().map(p -> {p.getProduct().setHtml(p.getHtml());return p.getProduct();}).filter(k -> k.isInstock()).forEach(o -> {
            double price = calculatePrice(o.getCost(), o.getMinqty(), o.getShipping(), o.isTaxable(), o.getListCost() != -1);
            o.setPrice(price);
            double listPrice = 0;
            if (o.getListCost() != -1) {
                listPrice = calculatePrice(o.getListCost(), o.getMinqty(), o.getShipping(), o.isTaxable(), false);
            }
            o.setListPrice(listPrice);
        });
    }

    private static double calculatePrice(double cost, int minqty, double shipping, boolean taxable, boolean discounted) {
        double price = cost * minqty;
        price += shipping;
        if (minqty >= 5 && price > 50) {
            price -= minqty * 0.36;
        }
        if (taxable) {
            price /= (MARKUP_TAXABLE - (discounted ? MARKUP_DISCOUNT : 0.0));
        } else {
            price /= (MARKUP_NON_TAXABLE - (discounted ? MARKUP_DISCOUNT : 0.0));
        }
        price = Math.floor(price) + 0.98;
        return price;
    }
}
