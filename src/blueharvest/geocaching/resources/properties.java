/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package blueharvest.geocaching.resources;

/**
 *
 * @author jmb
 * @warning not fully tested in an Android environment, but could come in handy
 */
public class properties extends java.util.Properties {

    public properties() {
        try { // use properties file for credentials
            load(new Object().getClass().getResourceAsStream(
                "/blueharvest/geocaching/resources/config.properties"));
        } catch (java.io.FileNotFoundException ex) {
            java.util.logging.Logger.getLogger(
                new Object().getClass().getName()).log(
                    java.util.logging.Level.SEVERE, null, ex);
        } catch (java.io.IOException ex) {
            java.util.logging.Logger.getLogger(
                new Object().getClass().getName()).log(
                    java.util.logging.Level.SEVERE, null, ex);
        }
    }

}
