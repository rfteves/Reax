/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.gotkcups.data;

import java.util.Collection;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author rfteves
 */
public class EntityFacadeTest {
    
    public EntityFacadeTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of main method, of class EntityFacade.
     */
    @Test
    public void testMain() {
        System.out.println("main");
        String[] args = null;
        EntityFacade.main(args);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of executeQuery method, of class EntityFacade.
     */
    @Test
    public void testExecuteQuery() {
        System.out.println("executeQuery");
        String query = "";
        EntityFacade.executeQuery(query);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of add method, of class EntityFacade.
     */
    @Test
    public void testAdd() {
        System.out.println("add");
        Object object = null;
        EntityFacade.add(object);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of bulk method, of class EntityFacade.
     */
    @Test
    public void testBulk() {
        System.out.println("bulk");
        EntityFacade.bulk(null);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of findAll method, of class EntityFacade.
     */
    @Test
    public void testFindAll() {
        System.out.println("findAll");
        Collection expResult = null;
        Collection result = EntityFacade.findAll(null);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of create method, of class EntityFacade.
     */
    @Test
    public void testCreate() {
        System.out.println("create");
        ProductInfo product = null;
        ProductChange expResult = null;
        ProductChange result = EntityFacade.create(product);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
