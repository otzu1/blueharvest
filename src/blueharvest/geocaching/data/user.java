/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package blueharvest.geocaching.data;

/**
 *
 * @author jmb
 * @since 2015-10-16
 */
public abstract class user { // implements data<blueharvest.geocaching.objects.user>

    private static blueharvest.geocaching.webservices.user.ServiceCredentials
        getServiceCredentials() {
        blueharvest.geocaching.webservices.user.ServiceCredentials sc
            = new blueharvest.geocaching.webservices.user.ServiceCredentials();
        try { // use properties file for credentials
            java.util.Properties p = new java.util.Properties();
            p.load(new Object().getClass().getResourceAsStream(
                "/blueharvest/geocaching/resources/config.properties"));
            sc.setUsername(p.getProperty("wsu"));
            sc.setPassword(p.getProperty("wsp"));
        } catch (java.io.FileNotFoundException ex) {
            java.util.logging.Logger.getLogger(
                new Object().getClass().getName()).log(
                    java.util.logging.Level.SEVERE, null, ex);
        } catch (java.io.IOException ex) {
            java.util.logging.Logger.getLogger(
                new Object().getClass().getName()).log(
                    java.util.logging.Level.SEVERE, null, ex);
        }
        return sc;
    }

    private static blueharvest.geocaching.webservices.user.UserServiceSoap
        getServicePort() {
        blueharvest.geocaching.webservices.user.UserService service
            = new blueharvest.geocaching.webservices.user.UserService();
        return service.getUserServiceSoap();
    }

    public static blueharvest.geocaching.objects.user get(java.util.UUID id) {
        // todo
        throw new java.lang.UnsupportedOperationException("Not supported yet.");
    }

    /**
     * <h3>get</h3>
     * gets a user from the web service
     *
     * @param email email of the user
     * @return user
     */
    public static blueharvest.geocaching.objects.user get(String email) {
        blueharvest.geocaching.webservices.user.User x = getUser(email);
        return new blueharvest.geocaching.objects.user(
            java.util.UUID.fromString(x.getId()),
            x.getAnniversary().toGregorianCalendar().getTime(),
            x.getUsername(), x.getPassword(),
            java.util.UUID.fromString(x.getSalt()), email,
            x.isActive(), x.isLocked(), null, null);
    }

    /**
     * <h3>getUser</h3>
     * gets the user from the database through web services
     *
     * @param email email of the web service user object
     * @return the web service user object
     */
    private static blueharvest.geocaching.webservices.user.User getUser(
        java.lang.String email) {
        return getServicePort().getUser(email, getServiceCredentials());
    }

    /**
     * <h3>insert</h3>
     * inserts a user through the web service into the database. username,
     * password (clear text), email, active, and locked are req'd. id and
     * anniversary computed by the database. salt and password (hashed) computed
     * by the web service.
     *
     * @param u <b>u</b>ser
     * @return true or false dependent on whether the user was inserted
     */
    public static boolean insert(blueharvest.geocaching.objects.user u) {
        blueharvest.geocaching.webservices.user.User x
            = new blueharvest.geocaching.webservices.user.User();
        x.setUsername(u.getUsername());
        x.setPassword(u.getPassword());
        x.setEmail(u.getEmail());
        x.setActive(u.isActive());
        x.setLocked(u.isLocked());
        return insertUser(x);
    }

    /**
     * <h3>insertUser</h3>
     *
     * @param u <b>u</b>ser
     * @return true or false dependent on whether the user was inserted
     */
    private static boolean insertUser(
        blueharvest.geocaching.webservices.user.User u) {
        try {
            return getServicePort().insertUser(u, getServiceCredentials());
        } catch (java.lang.Exception ex) { // java.net.ConnectException
            java.util.logging.Logger.getLogger(
                new Object().getClass().getName()).log(
                    java.util.logging.Level.SEVERE, null, ex);
            return false;
        }
    }

    /**
     * <h3>auth</h3>
     * authorization for a user
     *
     * @param email email of the user
     * @param password password (plain text) of the user
     * @return true/false dependent on credentials and inner exceptions
     */
    public static boolean auth(String email, String password) {
        return authUser(email, password);
    }

    private static Boolean authUser(
        java.lang.String email, java.lang.String password) {
        return getServicePort().authUser(email, password, getServiceCredentials());
    }

    public static final boolean update(blueharvest.geocaching.objects.user u) {
        // todo
        throw new java.lang.UnsupportedOperationException("Not implemented.");
    }

    public static final boolean delete(java.util.UUID id) {
        // todo
        throw new java.lang.UnsupportedOperationException("Not implemented.");
    }

}
