/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.gotkcups.shopify;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author rfteves
 */

public class ShopifyProduct  {

    private long id;

    private String title;

    private String product_type;

    private Date published_at;

    private Collection<ShopifyVariant>variants = new ArrayList<>();

    /**
     * @return the id
     */
    public long getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(long id) {
        this.id = id;
    }

    /**
     * @return the title
     */
    public String getTitle() {
        return title;
    }

    /**
     * @param title the title to set
     */
    public void setTitle(String title) {
        this.title = title;
    }

    /**
     * @return the product_type
     */
    public String getProduct_type() {
        return product_type;
    }

    /**
     * @param product_type the product_type to set
     */
    public void setProduct_type(String product_type) {
        this.product_type = product_type;
    }

    /**
     * @return the published_at
     */
    public Date getPublished_at() {
        return published_at;
    }

    /**
     * @param published_at the published_at to set
     */
    public void setPublished_at(Date published_at) {
        this.published_at = published_at;
    }

    /**
     * @return the variants
     */
    public Collection<ShopifyVariant> getVariants() {
        return variants;
    }

    /**
     * @param variants the variants to set
     */
    public void setVariants(Collection<ShopifyVariant> variants) {
        this.variants = variants;
    }
}
