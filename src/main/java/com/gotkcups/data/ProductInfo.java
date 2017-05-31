/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.gotkcups.data;

import java.util.Comparator;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;
import org.eclipse.persistence.annotations.Customizer;

/**
 *
 * @author rfteves
 */
@XmlRootElement
@Entity
@Table(name="productinfos")
@Customizer(ColumnPositionCustomizer.class) 
public class ProductInfo implements Product, Comparator<ProductInfo>, Comparable<ProductInfo> {

    private static long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id;
    private String productid;
    private String variantid;
    private String description;
    private String variantsku;
    private String alpha;
    private String status;
    private String reason;
    private boolean instock;
    private boolean currentStock;
    private boolean taxable;
    private double cost;
    private double listCost;
    private double defaultCost;
    private double price;
    private double listPrice;
    private double minprice;
    private double maxprice;
    private double shipping;
    private double defaultShipping;
    private int minqty;
    private int defaultMinqty;
    private int defaultInv;
    
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
        if (o1.getCost() == -1 && o2.getCost() == -1) {
            return 0;
        } else if (o1.getCost() == -1) {
            return 1;
        } else if (o2.getCost() == -1) {
            return -1;
        } else {
            return o1.getPrice() < o2.getPrice() ? -1 : (o1.getPrice() == o2.getPrice() ? 0 : 1);
        }
        
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
     * @return the status
     */
    public String getStatus() {
        return status.toString();
    }

    /**
     * @param status the status to set
     */
    public void setStatus(ProductStatus ps) {
        this.status = ps.toString();
    }
    
    /**
     * @return the id
     */
    public Long getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * @return the alpha
     */
    public String getAlpha() {
        return alpha;
    }

    /**
     * @param alpha the alpha to set
     */
    public void setAlpha(ProductStatus ps) {
        this.alpha = ps.toString();
    }

    /**
     * @return the reason
     */
    public String getReason() {
        return reason;
    }

    /**
     * @param reason the reason to set
     */
    public void setReason(ProductStatus productStatus) {
        this.productStatus = productStatus;
        this.reason = productStatus.toString();
    }
    
    private transient ProductStatus productStatus;
    private transient String html;
    public ProductStatus getProductStatus() {
        return this.productStatus;
    }

    /**
     * @return the defaultInv
     */
    public int getDefaultInv() {
        return defaultInv;
    }

    /**
     * @param defaultInv the defaultInv to set
     */
    public void setDefaultInv(int defaultInv) {
        this.defaultInv = defaultInv;
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
}
