/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.gotkcups.data;

import com.gotkcups.data.ProductInfo;
import java.util.Collection;

/**
 *
 * @author rfteves
 */
public class Packet {
    private String productid;
    private String variantid;
    private Collection<ProductInfo>products;


    /**
     * @return the values
     */
    public Collection<ProductInfo> getProducts() {
        return products;
    }

    /**
     * @param values the values to set
     */
    public void setProducts(Collection<ProductInfo> products) {
        this.products = products;
    }

    /**
     * @return the productid
     */
    public String getProductid() {
        return productid;
    }

    /**
     * @param productid the productid to set
     */
    public void setProductid(String productid) {
        this.productid = productid;
    }

    /**
     * @return the variantid
     */
    public String getVariantid() {
        return variantid;
    }

    /**
     * @param variantid the variantid to set
     */
    public void setVariantid(String variantid) {
        this.variantid = variantid;
    }
}
