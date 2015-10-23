/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package blueharvest.geocaching.database;

/**
 *
 * @author jmb
 * @since 2015-10-13
 * @deprecated no replacement
 */
public class mssql {

    private final static String url = "jdbc:sqlserver://endpoint:1433";
    private final static String u = "";
    private final static String p = "";

    /**
     * <h3>connection string for database</h3>
     *
     * @return a connection string with endpoint, username, and password
     * @throws java.sql.SQLException exception
     * @deprecated exposing credentials in the application poses a security
     * risk.
     */
    public static java.sql.Connection connection()
        throws java.sql.SQLException {
        throw new java.lang.UnsupportedOperationException("Not implemented.");
        //return java.sql.DriverManager.getConnection(url, u, p);
    }

}
