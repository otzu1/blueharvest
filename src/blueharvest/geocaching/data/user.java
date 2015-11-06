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
 * @warning not fully compatible in an Android environment
 */
public class user extends blueharvest.geocaching.objects.user { // implements data<user>

    private user(java.util.UUID id, java.util.Date anniversary, String username,
        String password, java.util.UUID salt, String email, boolean active,
        boolean locked, blueharvest.geocaching.objects.location location,
        blueharvest.geocaching.objects.image image) {
        super(id, anniversary, username, password, salt, email, active,
            locked, location, image);
    }

    public static user create(java.util.UUID id, java.util.Date anniversary,
        String username, String password, java.util.UUID salt, String email,
        boolean active, boolean locked,
        blueharvest.geocaching.objects.location location,
        blueharvest.geocaching.objects.image image) {
        return new user(id, anniversary, username, password, salt, email,
            active, locked, location, image);
    }

    private static blueharvest.geocaching.webservices.user.ServiceCredentials
        getServiceCredentials() {
        blueharvest.geocaching.webservices.user.ServiceCredentials sc
            = new blueharvest.geocaching.webservices.user.ServiceCredentials();
        sc.setUsername(
            new blueharvest.geocaching.resources.properties().getProperty("wsu"));
        sc.setPassword(
            new blueharvest.geocaching.resources.properties().getProperty("wsp"));
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
     *
     * @param id user id
     * @return user by id
     * @throws java.lang.UnsupportedOperationException not supported yet
     * @since 2015-10-25
     */
    public static user get(java.util.UUID id) {
        // todo
        throw new java.lang.UnsupportedOperationException("Not supported yet.");
    }

    /**
     * <h3>gets a user</h3>
     * gets a user from the web service
     *
     * @param username username of the user
     * @return user
     */
    public static user get(String username) {
        blueharvest.geocaching.webservices.user.User u = getUser(username);
        return new user(java.util.UUID.fromString(u.getId()),
            u.getAnniversary().toGregorianCalendar().getTime(),
            username, u.getPassword(), java.util.UUID.fromString(u.getSalt()),
            u.getEmail(), u.isActive(), u.isLocked(), null, null);
    }

    /**
     * <h3>getUser</h3>
     * gets the user from the database through web services
     *
     * @param username username of the web service user object
     * @return the web service user object or null if exception occurs
     */
    private static blueharvest.geocaching.webservices.user.User getUser(
        java.lang.String username) {
        try {
            return getServicePort().getUser(username, getServiceCredentials());
        } catch (java.lang.Exception ex) { // java.net.ConnectException
            java.util.logging.Logger.getLogger(
                new Object().getClass().getName()).log(
                    java.util.logging.Level.SEVERE, null, ex);
            return null;
        }
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
    public static boolean insert(user u) {
        blueharvest.geocaching.webservices.user.User v
            = new blueharvest.geocaching.webservices.user.User();
        v.setUsername(u.getUsername());
        v.setPassword(u.getPassword());
        v.setEmail(u.getEmail());
        v.setActive(u.isActive());
        v.setLocked(u.isLocked());
        return insertUser(v);
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
    public static final boolean update(user u) {
        blueharvest.geocaching.webservices.user.User v
            = new blueharvest.geocaching.webservices.user.User();
        v.setId(u.getId().toString());
        v.setActive(u.isActive());
        v.setLocked(u.isLocked());
        return updateUser(v);
    }

    private static Boolean updateUser(
        blueharvest.geocaching.webservices.user.User u) {
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
     *
     * @param id id of the user
     * @return true/false dependent on whether the user was deleted from storage
     * @throws java.lang.UnsupportedOperationException not supported yet
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
        return getServicePort().authUser(
            username, password, getServiceCredentials());
    }

}
