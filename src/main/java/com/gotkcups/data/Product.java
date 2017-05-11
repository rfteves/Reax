/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.gotkcups.data;

import com.gotkcups.json.GsonData;

/**
 *
 * @author rfteves
 */
public interface Product {

    public enum ProductStatus {
        PRODUCT_NOT_FOUND,
        PRODUCT_OUT_OF_STOCK,
        PRODUCT_LOW_OF_STOCK,
        PRODUCT_IN_STOCK,
        PAGE_NOT_AVAILABLE,
        PRODUCT_PRICE_CHANGE,
        PRODUCT_FIRST
    }
    
    String status();

}
