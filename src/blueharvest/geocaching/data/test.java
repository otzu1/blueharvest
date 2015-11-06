/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package blueharvest.geocaching.data;

/**
 * testing object used in discovering that using the JAX library in an Android
 * environment was a no-no
 * @author jmb
 * @since 2015-11-05
 */
public class test {

    public test() {
    }

    public static String test() {
        return new java.util.Date().toString()
            + ": blueharvest.geocaching.data.test.test(), classpath = "
            + System.getProperty("java.class.path");
    }

}
