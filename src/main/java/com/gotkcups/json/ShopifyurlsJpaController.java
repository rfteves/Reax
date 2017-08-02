/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.gotkcups.json;

import com.gotkcups.json.exceptions.NonexistentEntityException;
import java.io.Serializable;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Query;
import javax.persistence.EntityNotFoundException;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;

/**
 *
 * @author rfteves
 */
public class ShopifyurlsJpaController implements Serializable {

    public ShopifyurlsJpaController(EntityManagerFactory emf) {
        this.emf = emf;
    }
    private EntityManagerFactory emf = null;

    public EntityManager getEntityManager() {
        return emf.createEntityManager();
    }

    public void create(Shopifyurls shopifyurls) {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            em.persist(shopifyurls);
            em.getTransaction().commit();
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public void edit(Shopifyurls shopifyurls) throws NonexistentEntityException, Exception {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            shopifyurls = em.merge(shopifyurls);
            em.getTransaction().commit();
        } catch (Exception ex) {
            String msg = ex.getLocalizedMessage();
            if (msg == null || msg.length() == 0) {
                Integer id = shopifyurls.getRecordnumber();
                if (findShopifyurls(id) == null) {
                    throw new NonexistentEntityException("The shopifyurls with id " + id + " no longer exists.");
                }
            }
            throw ex;
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public void destroy(Integer id) throws NonexistentEntityException {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            Shopifyurls shopifyurls;
            try {
                shopifyurls = em.getReference(Shopifyurls.class, id);
                shopifyurls.getRecordnumber();
            } catch (EntityNotFoundException enfe) {
                throw new NonexistentEntityException("The shopifyurls with id " + id + " no longer exists.", enfe);
            }
            em.remove(shopifyurls);
            em.getTransaction().commit();
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public List<Shopifyurls> findShopifyurlsEntities() {
        return findShopifyurlsEntities(true, -1, -1);
    }

    public List<Shopifyurls> findShopifyurlsEntities(int maxResults, int firstResult) {
        return findShopifyurlsEntities(false, maxResults, firstResult);
    }

    private List<Shopifyurls> findShopifyurlsEntities(boolean all, int maxResults, int firstResult) {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            cq.select(cq.from(Shopifyurls.class));
            Query q = em.createQuery(cq);
            if (!all) {
                q.setMaxResults(maxResults);
                q.setFirstResult(firstResult);
            }
            return q.getResultList();
        } finally {
            em.close();
        }
    }

    public Shopifyurls findShopifyurls(Integer id) {
        EntityManager em = getEntityManager();
        try {
            return em.find(Shopifyurls.class, id);
        } finally {
            em.close();
        }
    }

    public int getShopifyurlsCount() {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            Root<Shopifyurls> rt = cq.from(Shopifyurls.class);
            cq.select(em.getCriteriaBuilder().count(rt));
            Query q = em.createQuery(cq);
            return ((Long) q.getSingleResult()).intValue();
        } finally {
            em.close();
        }
    }
    
}
