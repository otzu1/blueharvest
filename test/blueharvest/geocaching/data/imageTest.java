/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package blueharvest.geocaching.data;

import java.io.File;
import java.net.URI;
import java.util.UUID;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author jmb
 */
public class imageTest {
    
    public imageTest() {
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
     * Test of get method, of class image.
     */
    @Test
    public void testGet() {
        System.out.println("get");
        UUID id = null;
        image expResult = null;
        image result = blueharvest.geocaching.data.image.get(id);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of insert method, of class image.
     */
    @Test
    public void testInsert() {
        System.out.println("insert");
        image i = null;
        boolean expResult = false;
        boolean result = blueharvest.geocaching.data.image.insert(i);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of update method, of class image.
     */
    @Test
    public void testUpdate() {
        System.out.println("update");
        image i = null;
        boolean expResult = false;
        boolean result = blueharvest.geocaching.data.image.update(i);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of delete method, of class image.
     */
    @Test
    public void testDelete() {
        System.out.println("delete");
        UUID id = null;
        boolean expResult = false;
        boolean result = blueharvest.geocaching.data.image.delete(id);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of create method, of class image.
     */
    @Test
    public void testCreate() {
        System.out.println("create");
        UUID id = null;
        URI uri = null;
        String caption = "";
        File file = null;
        blueharvest.geocaching.data.image expResult = null;
        blueharvest.geocaching.data.image result = blueharvest.geocaching.data.image.create(id, uri, caption, file);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
