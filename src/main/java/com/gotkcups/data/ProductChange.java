/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.gotkcups.data;

import com.gotkcups.data.Product.ProductStatus;
import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import org.eclipse.persistence.annotations.Customizer;

/**
 *
 * @author rfteves
 */
@Entity
@Table(name="productchanges")
@Customizer(ColumnPositionCustomizer.class) 
public class ProductChange implements Serializable {

    private static long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id;
    
    private String productid;
    private String variantid;
    private String variantsku;
    private String description;
    private String reason;
    private double price;
    private double currentPrice;
    private double listPrice;
    private double currentListPrice;
    private boolean inStock;
    private boolean currentStock;
    private boolean applied;
    

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof ProductChange)) {
            return false;
        }
        ProductChange other = (ProductChange) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.gotkcups.data.ProductChanges[ id=" + id + " ]";
    }

    /**
     * @return the serialVersionUID
     */
    public static long getSerialVersionUID() {
        return serialVersionUID;
    }

    /**
     * @param aSerialVersionUID the serialVersionUID to set
     */
    public static void setSerialVersionUID(long aSerialVersionUID) {
        serialVersionUID = aSerialVersionUID;
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

    /**
     * @return the applied
     */
    public boolean isApplied() {
        return applied;
    }

    /**
     * @param applied the applied to set
     */
    public void setApplied(boolean applied) {
        this.applied = applied;
    }

    /**
     * @return the currentPrice
     */
    public double getCurrentPrice() {
        return currentPrice;
    }

    /**
     * @param currentPrice the currentPrice to set
     */
    public void setCurrentPrice(double currentPrice) {
        this.currentPrice = currentPrice;
    }

    /**
     * @return the currentListPrice
     */
    public double getCurrentListPrice() {
        return currentListPrice;
    }

    /**
     * @param currentListPrice the currentListPrice to set
     */
    public void setCurrentListPrice(double currentListPrice) {
        this.currentListPrice = currentListPrice;
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
     * @return the reason
     */
    public String getReason() {
        return reason.toString();
    }

    /**
     * @param reason the reason to set
     */
    public void setReason(ProductStatus ps) {
        this.reason = ps.toString();
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
    
}
