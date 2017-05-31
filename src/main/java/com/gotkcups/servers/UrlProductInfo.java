/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.gotkcups.servers;

import com.gotkcups.data.ProductInfo;
import java.io.Serializable;

/**
 *
 * @author rfteves
 */
public class UrlProductInfo implements Serializable, HtmlCached {

    /**
     * @return the url
     */
    public String getUrl() {
        return url;
    }

    /**
     * @param url the url to set
     */
    public void setUrl(String url) {
        this.url = url;
    }
    private String url;
    private transient String html;
    private ProductInfo product;
    private boolean cached;
    
    public static UrlProductInfo create(ProductInfo product, String url) {
        UrlProductInfo udata = new UrlProductInfo();
        udata.setProduct(product);
        udata.setUrl(url);
        return udata;
    }

    /**
     * @return the html
     */
    public String getHtml() {
        return html;
    }

    /**
     * @param html the html to set
     */
    public void setHtml(String html) {
        this.html = html;
    }

    /**
     * @return the cached
     */
    public boolean isCached() {
        return cached;
    }

    /**
     * @param cached the cached to set
     */
    public void setCached(boolean cached) {
        this.cached = cached;
    }

    /**
     * @return the product
     */
    public ProductInfo getProduct() {
        return product;
    }

    /**
     * @param product the product to set
     */
    public void setProduct(ProductInfo product) {
        this.product = product;
    }
}
