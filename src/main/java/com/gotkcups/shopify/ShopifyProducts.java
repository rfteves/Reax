/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.gotkcups.shopify;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author rfteves
 */
@XmlRootElement(name="products")
public class ShopifyProducts {
    @XmlElement
    private ShopifyProduct product;

    /**
     * @return the product
     */
    public ShopifyProduct getProduct() {
        return product;
    }

    /**
     * @param product the product to set
     */
    public void setProduct(ShopifyProduct product) {
        this.product = product;
    }
}
