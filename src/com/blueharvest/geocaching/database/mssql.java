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
public class mssql {

    /* todo: move to configuration file */
    private final static String url = "jdbc:sqlserver://"
        + "blueharvest.cswdat7lrrzn.us-east-1.rds.amazonaws.com:1433";
    private final static String u = "sweng500team1";
    private final static String p = "cApst0n3!";


    public static java.sql.Connection connection()
        throws java.sql.SQLException {
        return java.sql.DriverManager.getConnection(url, u, p);
    }

}
