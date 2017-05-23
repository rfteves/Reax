/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.gotkcups.data;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Collection;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;
import javax.persistence.criteria.CriteriaQuery;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.PreparedStatementCreator;

/**
 *
 * @author rfteves
 */
public class EntityFacade {

    public static void main(String[] args) {
        EntityFacade.add(new ProductInfo());
        EntityFacade.add(new ProductChange());
    }
    private final static EntityManagerFactory emf = Persistence.createEntityManagerFactory("Reax");

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
        if (object == null) {
            return;
        }
        EntityManager em = emf.createEntityManager();
        em.getTransaction().begin();
        em.persist(object);
        em.getTransaction().commit();
        em.close();
    }

    public static <T> void bulk(Collection<T> objects) {
        EntityManager em = emf.createEntityManager();
        em.getTransaction().begin();
        objects.stream().forEach(em::persist);
        em.getTransaction().commit();
        em.close();
    }

    public static <T> Collection findAll(Class<T> entityClass) {
        EntityManager em = emf.createEntityManager();
        em.getTransaction().begin();
        CriteriaQuery query = em.getCriteriaBuilder().createQuery();
        query.select(query.from(entityClass));
        return em.createQuery(query).getResultList();
    }

    public static ProductChange create(ProductInfo product) {
        ProductChange change = new ProductChange();
        change.setDescription(product.getDescription());
        change.setCurrentListPrice(product.getMaxprice());
        change.setCurrentPrice(product.getMinprice());
        change.setCurrentStock(product.isCurrentStock());
        change.setInStock(product.isInstock());
        change.setListPrice(product.getListPrice());
        change.setPrice(product.getPrice());
        change.setProductid(product.getProductid());
        change.setReason(product.getProductStatus());
        change.setVariantid(product.getVariantid());
        change.setVariantsku(product.getVariantsku());
        return change;
    }
}
