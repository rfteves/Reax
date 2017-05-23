/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.gotkcups.shopify;

import java.util.Date;

/**
 *
 * @author rfteves
 */
public class ShopifyVariant {
    private long id, product_id;
    private String title, price, sku,
            inventory_policy, compare_at_price, fulfillment_service, inventory_management,
            option1, option2, option3, barcode, image_id, weight_unit;
    
    private int position, grams, inventory_quantity, old_inventory_quantity;
    private float weight;
    private Date created_at, updated_at;
    private boolean taxable, requires_shipping;

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
     * @return the product_id
     */
    public long getProduct_id() {
        return product_id;
    }

    /**
     * @param product_id the product_id to set
     */
    public void setProduct_id(long product_id) {
        this.product_id = product_id;
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
     * @return the price
     */
    public String getPrice() {
        return price;
    }

    /**
     * @param price the price to set
     */
    public void setPrice(String price) {
        this.price = price;
    }

    /**
     * @return the sku
     */
    public String getSku() {
        return sku;
    }

    /**
     * @param sku the sku to set
     */
    public void setSku(String sku) {
        this.sku = sku;
    }

    /**
     * @return the inventory_policy
     */
    public String getInventory_policy() {
        return inventory_policy;
    }

    /**
     * @param inventory_policy the inventory_policy to set
     */
    public void setInventory_policy(String inventory_policy) {
        this.inventory_policy = inventory_policy;
    }

    /**
     * @return the compare_at_price
     */
    public String getCompare_at_price() {
        return compare_at_price;
    }

    /**
     * @param compare_at_price the compare_at_price to set
     */
    public void setCompare_at_price(String compare_at_price) {
        this.compare_at_price = compare_at_price;
    }

    /**
     * @return the fulfillment_service
     */
    public String getFulfillment_service() {
        return fulfillment_service;
    }

    /**
     * @param fulfillment_service the fulfillment_service to set
     */
    public void setFulfillment_service(String fulfillment_service) {
        this.fulfillment_service = fulfillment_service;
    }

    /**
     * @return the inventory_management
     */
    public String getInventory_management() {
        return inventory_management;
    }

    /**
     * @param inventory_management the inventory_management to set
     */
    public void setInventory_management(String inventory_management) {
        this.inventory_management = inventory_management;
    }

    /**
     * @return the option1
     */
    public String getOption1() {
        return option1;
    }

    /**
     * @param option1 the option1 to set
     */
    public void setOption1(String option1) {
        this.option1 = option1;
    }

    /**
     * @return the option2
     */
    public String getOption2() {
        return option2;
    }

    /**
     * @param option2 the option2 to set
     */
    public void setOption2(String option2) {
        this.option2 = option2;
    }

    /**
     * @return the option3
     */
    public String getOption3() {
        return option3;
    }

    /**
     * @param option3 the option3 to set
     */
    public void setOption3(String option3) {
        this.option3 = option3;
    }

    /**
     * @return the barcode
     */
    public String getBarcode() {
        return barcode;
    }

    /**
     * @param barcode the barcode to set
     */
    public void setBarcode(String barcode) {
        this.barcode = barcode;
    }

    /**
     * @return the image_id
     */
    public String getImage_id() {
        return image_id;
    }

    /**
     * @param image_id the image_id to set
     */
    public void setImage_id(String image_id) {
        this.image_id = image_id;
    }

    /**
     * @return the weight_unit
     */
    public String getWeight_unit() {
        return weight_unit;
    }

    /**
     * @param weight_unit the weight_unit to set
     */
    public void setWeight_unit(String weight_unit) {
        this.weight_unit = weight_unit;
    }

    /**
     * @return the position
     */
    public int getPosition() {
        return position;
    }

    /**
     * @param position the position to set
     */
    public void setPosition(int position) {
        this.position = position;
    }

    /**
     * @return the grams
     */
    public int getGrams() {
        return grams;
    }

    /**
     * @param grams the grams to set
     */
    public void setGrams(int grams) {
        this.grams = grams;
    }

    /**
     * @return the inventory_quantity
     */
    public int getInventory_quantity() {
        return inventory_quantity;
    }

    /**
     * @param inventory_quantity the inventory_quantity to set
     */
    public void setInventory_quantity(int inventory_quantity) {
        this.inventory_quantity = inventory_quantity;
    }

    /**
     * @return the old_inventory_quantity
     */
    public int getOld_inventory_quantity() {
        return old_inventory_quantity;
    }

    /**
     * @param old_inventory_quantity the old_inventory_quantity to set
     */
    public void setOld_inventory_quantity(int old_inventory_quantity) {
        this.old_inventory_quantity = old_inventory_quantity;
    }

    /**
     * @return the weight
     */
    public float getWeight() {
        return weight;
    }

    /**
     * @param weight the weight to set
     */
    public void setWeight(float weight) {
        this.weight = weight;
    }

    /**
     * @return the created_at
     */
    public Date getCreated_at() {
        return created_at;
    }

    /**
     * @param created_at the created_at to set
     */
    public void setCreated_at(Date created_at) {
        this.created_at = created_at;
    }

    /**
     * @return the updated_at
     */
    public Date getUpdated_at() {
        return updated_at;
    }

    /**
     * @param updated_at the updated_at to set
     */
    public void setUpdated_at(Date updated_at) {
        this.updated_at = updated_at;
    }

    /**
     * @return the taxable
     */
    public boolean isTaxable() {
        return taxable;
    }

    /**
     * @param taxable the taxable to set
     */
    public void setTaxable(boolean taxable) {
        this.taxable = taxable;
    }

    /**
     * @return the requires_shipping
     */
    public boolean isRequires_shipping() {
        return requires_shipping;
    }

    /**
     * @param requires_shipping the requires_shipping to set
     */
    public void setRequires_shipping(boolean requires_shipping) {
        this.requires_shipping = requires_shipping;
    }
}
