/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.gotkcups.data;

import com.gotkcups.json.GsonData;
import javax.persistence.Convert;

/**
 *
 * @author rfteves
 */
public interface Product {
    @Convert(converter = String.class)
    public enum ProductStatus {
        PRODUCT_NOT_FOUND("Product not found"),
        PRODUCT_OUT_OF_STOCK("Product out of stock"),
        PRODUCT_LOW_OF_STOCK("Product stock low"),
        PRODUCT_IN_STOCK("Product in stock"),
        PAGE_NOT_AVAILABLE("Page not available"),
        PRODUCT_PRICE_CHANGE("Price change"),
        PRODUCT_PRICE_STOCK_CHANGE("Price and stock change"),
        PRODUCT_FIRST("Alpha product"),
        PRODUCT_OTHERS("Secondary"),
        PRODUCT_NOT_VALID("Product not valid"),
        PRODUCT_INV_QTY_CHANGE("Product inv qty change");
        
        private String status;
        private ProductStatus(String status) {
            this.status = status;
        }
        
        @Override
        public String toString(){
            return status; 
        }
    }
    
    String status();

}
