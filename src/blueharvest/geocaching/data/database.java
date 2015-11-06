/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package blueharvest.geocaching.data;

/**
 * @author jmb
 * @since 2015-11
 * @warning not fully compatible with Android SDK
 */
public class database {

    private static blueharvest.geocaching.webservices.database.ServiceCredentials
        getServiceCredentials() {
        blueharvest.geocaching.webservices.database.ServiceCredentials sc
            = new blueharvest.geocaching.webservices.database.ServiceCredentials();
        sc.setUsername(
            new blueharvest.geocaching.resources.properties().getProperty("wsu"));
        sc.setPassword(
            new blueharvest.geocaching.resources.properties().getProperty("wsp"));
        return sc;
    }

    private static blueharvest.geocaching.webservices.database.DatabaseServiceSoap
        getServicePort() {
        blueharvest.geocaching.webservices.database.DatabaseService service
            = new blueharvest.geocaching.webservices.database.DatabaseService();
        return service.getDatabaseServiceSoap();
    }

    private database() {
    }

    public static String test() {
        return "blueharvest.geocaching.data.database.test() "
            + new java.util.Date().toString();
    }

    public static boolean delete() {
        return deleteAll();
    }

    private static Boolean deleteAll() {
        try {
            return getServicePort().deleteAll(getServiceCredentials());
        } catch (java.lang.Exception ex) { // java.net.ConnectException
            java.util.logging.Logger.getLogger(
                new Object().getClass().getName()).log(
                    java.util.logging.Level.SEVERE, null, ex);
            return false;
        }
    }

}
