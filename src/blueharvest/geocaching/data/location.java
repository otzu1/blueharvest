/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package blueharvest.geocaching.data;

/**
 *
 * @author jmb
 * @since 2015-10-31 Hallowe'en ... Boo!
 * @warning not fully compatible in an Android environment
 */
public class location extends blueharvest.geocaching.objects.location {

    private location(java.util.UUID id, String name, double latitude,
        double longitude, int altitude,
        blueharvest.geocaching.objects.address address) {
        super(id, name, latitude, longitude, altitude, address);
    }

    /**
     * <h3>create a location</h3>
     *
     * @param id id
     * @param name name
     * @param latitude latitude
     * @param longitude longitude
     * @param altitude altitude
     * @param address address
     * @return location
     * @since 2015-10-31 Hallowe'en ... Boo!
     */
    public static location create(java.util.UUID id, String name, double latitude,
        double longitude, int altitude,
        blueharvest.geocaching.objects.address address) {
        return new location(id, name, latitude, longitude, altitude, address);
    }

    private static blueharvest.geocaching.webservices.location.ServiceCredentials
        getServiceCredentials() {
        blueharvest.geocaching.webservices.location.ServiceCredentials sc
            = new blueharvest.geocaching.webservices.location.ServiceCredentials();
        sc.setUsername(
            new blueharvest.geocaching.resources.properties().getProperty("wsu"));
        sc.setPassword(
            new blueharvest.geocaching.resources.properties().getProperty("wsp"));
        return sc;
    }

    private static blueharvest.geocaching.webservices.location.LocationServiceSoap
        getServicePort() {
        blueharvest.geocaching.webservices.location.LocationService service
            = new blueharvest.geocaching.webservices.location.LocationService();
        return service.getLocationServiceSoap();
    }

    /**
     * <h3>gets location</h3>
     * todo: name and address (if in scope)
     *
     * @param id id
     * @return location
     * @since 2015-10-31 Hallowe'en!
     */
    public static location get(java.util.UUID id) {
        blueharvest.geocaching.webservices.location.Location l
            = getLocation(id.toString());
        return new location(java.util.UUID.fromString(l.getId()), null,
            l.getLatitude(), l.getLongitude(), l.getAltitude(), null);
    }

    private static blueharvest.geocaching.webservices.location.Location
        getLocation(java.lang.String id) {
        try {
            return getServicePort().getLocation(id, getServiceCredentials());
        } catch (java.lang.Exception ex) { // java.net.ConnectException
            java.util.logging.Logger.getLogger(
                new Object().getClass().getName()).log(
                    java.util.logging.Level.SEVERE, null, ex);
            return null;
        }
    }

    /**
     * <h3>gets location by coordinates latitude and longitude</h3>
     *
     * @param latitude latitude
     * @param longitude longitude
     * @return location via web service
     * @since 2015-11-01
     */
    public static location get(double latitude, double longitude) {
        blueharvest.geocaching.webservices.location.Location l
            = getLocationByCoordinates(latitude, longitude);
        return new location(java.util.UUID.fromString(l.getId()), null,
            l.getLatitude(), l.getLongitude(), l.getAltitude(), null);
    }

    private static blueharvest.geocaching.webservices.location.Location
        getLocationByCoordinates(double latitude, double longitude) {
        try {
            return getServicePort().getLocationByCoordinates(
                latitude, longitude, getServiceCredentials());
        } catch (java.lang.Exception ex) { // java.net.ConnectException
            java.util.logging.Logger.getLogger(
                new Object().getClass().getName()).log(
                    java.util.logging.Level.SEVERE, null, ex);
            return null;
        }
    }

    /**
     * <h3>inserts location via web service</h3>
     * latitude, longitude, and altitude required
     *
     * @param l (l)ocation
     * @return true/false depending on success of web service
     * @since 2015-10
     */
    public static boolean insert(location l) {
        blueharvest.geocaching.webservices.location.Location m
            = new blueharvest.geocaching.webservices.location.Location();
        m.setLatitude(l.getLatitude().getDecimalDegrees());
        m.setLongitude(l.getLongitude().getDecimalDegrees());
        m.setAltitude(l.getAltitude());
        return insertLocation(m);
    }

    private static Boolean insertLocation(
        blueharvest.geocaching.webservices.location.Location l) {
        try {
            return getServicePort().insertLocation(l, getServiceCredentials());
        } catch (java.lang.Exception ex) { // java.net.ConnectException
            java.util.logging.Logger.getLogger(
                new Object().getClass().getName()).log(
                    java.util.logging.Level.SEVERE, null, ex);
            return false;
        }
    }

    /**
     * <h3>updates a location via web services</h3>
     *
     * @param l (l)ocation
     * @return true/false depending on whether the record was updated
     * @since 2015-10-31 Hallowe'en!
     */
    public static boolean update(location l) {
        blueharvest.geocaching.webservices.location.Location m
            = new blueharvest.geocaching.webservices.location.Location();
        m.setId(l.getId().toString());
        m.setLatitude(l.getLatitude().getDecimalDegrees());
        m.setLongitude(l.getLongitude().getDecimalDegrees());
        m.setAltitude(l.getAltitude());
        return updateLocation(m);
    }

    private static Boolean updateLocation(
        blueharvest.geocaching.webservices.location.Location l) {
        try {
            return getServicePort().updateLocation(l, getServiceCredentials());
        } catch (java.lang.Exception ex) { // java.net.ConnectException
            java.util.logging.Logger.getLogger(
                new Object().getClass().getName()).log(
                    java.util.logging.Level.SEVERE, null, ex);
            return false;
        }
    }

    public static boolean delete(java.util.UUID id) {
        // todo
        throw new java.lang.UnsupportedOperationException("Not supported yet.");
    }

}
