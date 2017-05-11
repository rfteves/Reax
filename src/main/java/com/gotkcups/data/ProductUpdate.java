/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.gotkcups.data;

import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author rfteves
 */
@XmlRootElement
public class ProductUpdate {
 
    private String reason;
    private double price;
    private double listPrice;
    private boolean inStock;
    private boolean currentStock;

    /**
     * @return the reason
     */
    public String getReason() {
        return reason;
    }

    /**
     * @param reason the reason to set
     */
    public void setReason(String reason) {
        this.reason = reason;
    }

    /**
     * @return the price
     */
    public double getPrice() {
        return price;
    }

    /**
     * @param price the price to set
     */
    public void setPrice(double price) {
        this.price = price;
    }

    /**
     * @return the listPrice
     */
    public double getListPrice() {
        return listPrice;
    }

    /**
     * @param listPrice the listPrice to set
     */
    public void setListPrice(double listPrice) {
        this.listPrice = listPrice;
    }

    /**
     * @return the inStock
     */
    public boolean isInStock() {
        return inStock;
    }

    /**
     * @param inStock the inStock to set
     */
    public void setInStock(boolean inStock) {
        this.inStock = inStock;
    }

    /**
     * @return the currentStock
     */
    public boolean isCurrentStock() {
        return currentStock;
    }

    /**
     * @param currentStock the currentStock to set
     */
    public void setCurrentStock(boolean currentStock) {
        this.currentStock = currentStock;
    }
    
}
