/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package blueharvest.geocaching.data;

import blueharvest.geocaching.objects.address;
import java.util.UUID;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author JamieMarie
 */
public class locationTest {
    
    public locationTest() {
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
     * Test of create method, of class location.
     */
    @Test
    public void testCreate() {
        System.out.println("create");
        UUID id = null;
        String name = "";
        double latitude = 0.0;
        double longitude = 0.0;
        int altitude = 0;
        address address = null;
        location expResult = null;
        location result = location.create(id, name, latitude, longitude, altitude, address);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of get method, of class location.
     */
    @Test
    public void testGet() {
        System.out.println("get");
        UUID id = null;
        location expResult = null;
        location result = location.get(id);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of insert method, of class location.
     */
    @Test
    public void testInsert() {
        System.out.println("insert");
        location l = null;
        boolean expResult = false;
        boolean result = location.insert(l);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of update method, of class location.
     */
    @Test
    public void testUpdate() {
        System.out.println("update");
        location l = null;
        boolean expResult = false;
        boolean result = location.update(l);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of delete method, of class location.
     */
    @Test
    public void testDelete() {
        System.out.println("delete");
        UUID id = null;
        boolean expResult = false;
        boolean result = location.delete(id);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
