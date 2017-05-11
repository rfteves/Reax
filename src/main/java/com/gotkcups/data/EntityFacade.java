/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.gotkcups.data;

import com.gotkcups.data.Product.ProductStatus;
import com.gotkcups.json.Utilities;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

/**
 *
 * @author rfteves
 */
public class EntityFacade {
    static {
        
    }
    private final static EntityManagerFactory emf = Persistence.createEntityManagerFactory("com.gotkcups.data.ProductChanges");
    public static void executeQuery(String query) {
        EntityManager em = emf.createEntityManager();
        /*System.out.println("user : " + em.getProperties().get("javax.persistence.jdbc.user"));
        System.out.println("pswd: " + em.getProperties().get("javax.persistence.jdbc.password"));
        System.out.println("urls : " + em.getProperties().get("javax.persistence.jdbc.url"));
        em.getProperties().put("javax.persistence.jdbc.user", Utilities.getApplicationProperty("jdbc.user"));
        em.getProperties().put("javax.persistence.jdbc.password", Utilities.getApplicationProperty("jdbc.password"));
        em.getProperties().put("javax.persistence.jdbc.url", Utilities.getApplicationProperty("jdbc.url.persistence"));
        System.out.println("again");
        System.out.println("user : " + em.getProperties().get("javax.persistence.jdbc.user"));
        System.out.println("pswd: " + em.getProperties().get("javax.persistence.jdbc.password"));
        System.out.println("urls : " + em.getProperties().get("javax.persistence.jdbc.url"));*/
        Query truncate = em.createNativeQuery(query);
        em.getTransaction().begin();
        truncate.executeUpdate();
        em.getTransaction().commit();
        em.close();
    }
    
    public static <T> void add(T object) {
        
        //EntityManagerFactory emf = Persistence.createEntityManagerFactory("com.gotkcups.data");
        //emf.getProperties().put("javax.persistence.jdbc.user", "trial");
        
        EntityManager em = emf.createEntityManager();
        em.getTransaction().begin();
        em.persist(object);
        em.getTransaction().commit();
        em.close();
    }
    
    public static ProductChange create(ProductInfo product, ProductStatus reason) {
        ProductChange change = new ProductChange();
        change.setDescription(product.getDescription());
        change.setCurrentListPrice(product.getMaxprice());
        change.setCurrentPrice(product.getMinprice());
        change.setCurrentStock(product.isCurrentStock());
        change.setInStock(product.isInstock());
        change.setListPrice(product.getListPrice());
        change.setPrice(product.getPrice());
        change.setProductid(product.getProductid());
        change.setReason(reason);
        change.setVariantid(product.getVariantid());
        change.setVariantsku(product.getVariantsku());
        return change;
    }
}
