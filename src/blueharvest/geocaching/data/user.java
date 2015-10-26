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

    /**
     * <h3>gets a user by id</h3>
     * todo
     *
     * @param id user id
     * @return user by id
     * @throws java.lang.UnsupportedOperationException
     * @since 2015-10-25
     */
    public static blueharvest.geocaching.objects.user get(java.util.UUID id) {
        // todo
        throw new java.lang.UnsupportedOperationException("Not supported yet.");
    }

    /**
     * <h3>get</h3>
     * gets a user from the web service
     *
     * @param username username of the user
     * @return user
     */
    public static blueharvest.geocaching.objects.user get(String username) {
        blueharvest.geocaching.webservices.user.User x = getUser(username);
        return new blueharvest.geocaching.objects.user(
            java.util.UUID.fromString(x.getId()),
            x.getAnniversary().toGregorianCalendar().getTime(),
            username, x.getPassword(), java.util.UUID.fromString(x.getSalt()),
            x.getEmail(), x.isActive(), x.isLocked(), null, null);
    }

    /**
     * <h3>getUser</h3>
     * gets the user from the database through web services
     *
     * @param username username of the web service user object
     * @return the web service user object
     */
    private static blueharvest.geocaching.webservices.user.User getUser(
        java.lang.String username) {
        return getServicePort().getUser(username, getServiceCredentials());
    }

    /**
     * <h3>insert</h3>
     * inserts a user through the web service into the database. username,
     * password (clear text), email, active, and locked are req'd. id and
     * anniversary computed by the database. salt and password (hashed) computed
     * by the web service.
     *
     * @param u (u)ser
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
     * @param u (u)ser
     * @return true or false dependent on whether the user was inserted
     * @since 2015-10
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
     * <h3>update</h3>
     * updates the user through the web service into the database. id, active,
     * and locked the only update-able attributes at this time and therefore
     * required (all others may be null).
     *
     * @param u (u)ser
     * @return true or false dependent on whether the user was inserted
     * @since 2015-10-24
     */
    public static final boolean update(blueharvest.geocaching.objects.user u) {
        blueharvest.geocaching.webservices.user.User x
            = new blueharvest.geocaching.webservices.user.User();
        x.setId(u.getId().toString());
        x.setActive(u.isActive());
        x.setLocked(u.isLocked());
        return updateUser(x);
    }

    private static Boolean updateUser(blueharvest.geocaching.webservices.user.User u) {
        try {
            return getServicePort().updateUser(u, getServiceCredentials());
        } catch (java.lang.Exception ex) { // java.net.ConnectException
            java.util.logging.Logger.getLogger(
                new Object().getClass().getName()).log(
                    java.util.logging.Level.SEVERE, null, ex);
            return false;
        }
    }

    /**
     * <h3>deletes a user</h3>
     * todo
     * @param id id of the user
     * @return true/false dependent on whether the user was deleted from storage
     * @throws java.lang.UnsupportedOperationException
     * @since 2015-10-25
     */
    public static final boolean delete(java.util.UUID id) {
        // todo
        throw new java.lang.UnsupportedOperationException("Not implemented.");
    }

    /**
     * <h3>authorizes a user</h3>
     * authorization for a user by username and password
     *
     * @param username unique username of the user
     * @param password password (plain text) of the user
     * @return true/false dependent on credentials and inner exceptions
     * @since 2015-10
     */
    public static boolean auth(String username, String password) {
        return authUser(username, password);
    }

    private static Boolean authUser(
        java.lang.String username, java.lang.String password) {
        return getServicePort().authUser(username, password, getServiceCredentials());
    }

}
