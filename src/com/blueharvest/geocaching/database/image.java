/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.blueharvest.geocaching.database;

/**
 *
 * @author jmb
 * @since 2015-10-13
 */
public class image {

    public com.blueharvest.geocaching.objects.image get(java.util.UUID id) {
        try {
            // todo: get image attributes from database stored procedure
            return new com.blueharvest.geocaching.objects.image(
                new java.net.URI("http://uri-from-database"), 1, null);
        } catch (java.net.URISyntaxException ex) {
            java.util.logging.Logger.getLogger(
                image.class.getName()).log(
                    java.util.logging.Level.SEVERE, null, ex);
        }
        return null;
    }

}
