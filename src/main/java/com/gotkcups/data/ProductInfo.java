/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.gotkcups.data;

import java.util.Comparator;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author rfteves
 */
@XmlRootElement
public class ProductInfo implements Product, Comparator<ProductInfo>, Comparable<ProductInfo> {

    /**
     * @return the minqty
     */
    public int getMinqty() {
        return minqty;
    }

    /**
     * @param minqty the minqty to set
     */
    public void setMinqty(int minqty) {
        this.minqty = minqty;
    }

    /**
     * @return the rowid
     */
    public int getRowid() {
        return rowid;
    }

    /**
     * @param rowid the rowid to set
     */
    public void setRowid(int rowid) {
        this.rowid = rowid;
    }

    /**
     * @return the status
     */
    public ProductStatus getStatus() {
        return status;
    }

    /**
     * @param status the status to set
     */
    public void setStatus(ProductStatus status) {
        this.status = status;
    }
    private String productid;
    private String variantid;
    private String description;
    private String variantsku;
    private boolean instock;
    private boolean currentStock;
    private boolean taxable;
    private double cost;
    private double listCost;
    private double defaultCost;
    private double price;
    private double listPrice;
    private double shipping;
    private double defaultShipping;
    private double minprice;
    private double maxprice;
    private int minqty;
    private int defaultMinqty;
    private ProductStatus status;
    private int rowid;
    
    public ProductInfo() {
        this.cost = -1;
        this.defaultCost = -1.0;
        this.defaultMinqty = 1;
        this.defaultShipping = -1.0;
        this.listCost = -1.0;
        this.listPrice = -1.0;
        this.price = -1.0;
        this.shipping = -1.0;
    }
    
    public String toString() {
        return String.format("%s %8.2f", variantsku, cost);
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

    /**
     * @return the description
     */
    public String getDescription() {
        return description;
    }

    /**
     * @param description the description to set
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * @return the variantsku
     */
    public String getVariantsku() {
        return variantsku;
    }

    /**
     * @param variantsku the variantsku to set
     */
    public void setVariantsku(String variantsku) {
        this.variantsku = variantsku;
    }

    /**
     * @return the instock
     */
    public boolean isInstock() {
        return instock;
    }

    /**
     * @param instock the instock to set
     */
    public void setInstock(boolean instock) {
        this.instock = instock;
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
     * @return the cost
     */
    public double getCost() {
        return cost;
    }

    /**
     * @param cost the cost to set
     */
    public void setCost(double cost) {
        this.cost = cost;
    }

    /**
     * @return the defautlCost
     */
    public double getDefaultCost() {
        return defaultCost;
    }

    /**
     * @param defautlCost the defautlCost to set
     */
    public void setDefaultCost(double defaultCost) {
        this.defaultCost = defaultCost;
    }

    /**
     * @return the shipping
     */
    public double getShipping() {
        return shipping;
    }

    /**
     * @param shipping the shipping to set
     */
    public void setShipping(double shipping) {
        this.shipping = shipping;
    }

    /**
     * @return the defaultShipping
     */
    public double getDefaultShipping() {
        return defaultShipping;
    }

    /**
     * @param defaultShipping the defaultShipping to set
     */
    public void setDefaultShipping(double defaultShipping) {
        this.defaultShipping = defaultShipping;
    }

    /**
     * @return the defaultMinqty
     */
    public int getDefaultMinqty() {
        return defaultMinqty;
    }

    /**
     * @param defaultMinqty the defaultMinqty to set
     */
    public void setDefaultMinqty(int defaultMinqty) {
        this.defaultMinqty = defaultMinqty;
    }
    public String status() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int compare(ProductInfo o1, ProductInfo o2) {
        return o1.getPrice() < o2.getPrice() ? -1 : (o1.getPrice() == o2.getPrice() ? 0 : 1);
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
     * @return the listCost
     */
    public double getListCost() {
        return listCost;
    }

    /**
     * @param listCost the listCost to set
     */
    public void setListCost(double listCost) {
        this.listCost = listCost;
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
     * @return the minprice
     */
    public double getMinprice() {
        return minprice;
    }

    /**
     * @param minprice the minprice to set
     */
    public void setMinprice(double minprice) {
        this.minprice = minprice;
    }

    /**
     * @return the maxprice
     */
    public double getMaxprice() {
        return maxprice;
    }

    /**
     * @param maxprice the maxprice to set
     */
    public void setMaxprice(double maxprice) {
        this.maxprice = maxprice;
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

    @Override
    public int compareTo(ProductInfo o) {
        return this.compare(this, o);
    }
    
}
