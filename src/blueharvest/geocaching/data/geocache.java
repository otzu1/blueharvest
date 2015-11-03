/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package blueharvest.geocaching.data;

import blueharvest.geocaching.webservices.geocache.ArrayOfAnyType;

/**
 *
 * @author jmb
 * @since 2015-10-24
 */
public class geocache extends blueharvest.geocaching.objects.geocache {

    private geocache(java.util.UUID id, java.util.Date anniversary, String name,
        String description, int difficulty, int size, int terrain, int status,
        int type, blueharvest.geocaching.objects.user creator,
        java.util.ArrayList<blueharvest.geocaching.objects.image> images,
        blueharvest.geocaching.objects.location location,
        blueharvest.geocaching.objects.logbook logbook) {
        super(id, anniversary, name, description, difficulty, size, terrain,
            status, type, creator, images, location, logbook);
    }

    public static geocache create(java.util.UUID id, java.util.Date anniversary,
        String name, String description, int difficulty, int size, int terrain,
        int status, int type, blueharvest.geocaching.objects.user creator,
        java.util.ArrayList<blueharvest.geocaching.objects.image> images,
        blueharvest.geocaching.objects.location location,
        blueharvest.geocaching.objects.logbook logbook) {
        return new geocache(id, anniversary, name, description, difficulty,
            size, terrain, status, type, creator, images, location, logbook);
    }

    private static blueharvest.geocaching.webservices.geocache.ServiceCredentials
        getServiceCredentials() {
        blueharvest.geocaching.webservices.geocache.ServiceCredentials sc
            = new blueharvest.geocaching.webservices.geocache.ServiceCredentials();
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

    private static blueharvest.geocaching.webservices.geocache.GeocacheServiceSoap
        getServicePort() {
        blueharvest.geocaching.webservices.geocache.GeocacheService service
            = new blueharvest.geocaching.webservices.geocache.GeocacheService();
        return service.getGeocacheServiceSoap();
    }

    public static geocache get(java.util.UUID id) {
        // todo
        throw new java.lang.UnsupportedOperationException("Not supported yet.");
    }

    /**
     * <h3>inserts a geocache</h3>
     * inserts a geocache into the database via web services<br />
     * preconditions: the user must exist; location latitude and longitude must
     * be specified.<br />
     * logbook and location inserted alongside
     *
     * @param g (g)eocache
     * @return true/false depending on whether the geocache was inserted
     * //@throws java.lang.Exception
     * @since 2015-11-02
     */
    public static boolean insert(blueharvest.geocaching.objects.geocache g) /*throws java.lang.Exception*/ {
        /*if (g.getCreator() == null)
         throw new java.lang.Exception("User must not be null");*/
        blueharvest.geocaching.webservices.geocache.Geocache h
            = new blueharvest.geocaching.webservices.geocache.Geocache();
        h.setName(g.getName());
        h.setDescription(g.getDescription());
        h.setDifficulty(g.getDifficulty());
        h.setTerrain(g.getTerrain());
        h.setSize(g.getSize());
        h.setType(g.getType());
        h.setUserid(g.getCreator().getId().toString());
        return insertGeocacheWithLocation(
            h, g.getLocation().getLatitude().getDecimalDegrees(),
            g.getLocation().getLongitude().getDecimalDegrees());
    }

    private static Boolean insertGeocacheWithLocation(
        blueharvest.geocaching.webservices.geocache.Geocache g,
        double latitude, double longitude) {
        try {
            return getServicePort().insertGeocacheWithLocation(
                g, latitude, longitude, getServiceCredentials());
        } catch (java.lang.Exception ex) { // java.net.ConnectException
            java.util.logging.Logger.getLogger(
                new Object().getClass().getName()).log(
                    java.util.logging.Level.SEVERE, null, ex);
            return false;
        }
    }

    public static final boolean update(blueharvest.geocaching.objects.geocache g) {
        // todo
        throw new java.lang.UnsupportedOperationException("Not supported yet.");
    }

    public static final boolean delete(java.util.UUID id) {
        // todo
        throw new java.lang.UnsupportedOperationException("Not implemented.");
    }

    public static java.util.ArrayList<geocache> getWithinDistance(
        double minlatrad, double maxlatrad, double minlngrad, double maxlngrad,
        double latrad, double lngrad, double distance) {
        java.util.ArrayList<blueharvest.geocaching.objects.geocache> g
            = new java.util.ArrayList<>();
        java.util.List<Object> f = getGeocachesWithinDistance(
            minlatrad, maxlatrad, minlngrad, maxlngrad,
            latrad, lngrad, distance).getAnyType();
        // get the geocaches from one array to another
        if (f.size() > 0) {
            for (int i = 0; i < f.size(); i++) { // todo: enhanced loop
                // START HERE
                //f.get(i);
            }
        }
return null; // todo
    }

    private static ArrayOfAnyType getGeocachesWithinDistance(
        double minlatrad, double maxlatrad, double minlngrad, double maxlngrad,
        double latrad, double lngrad, double distance) {
        try {
            return getServicePort().getGeocachesWithinDistance(
                minlatrad, maxlatrad, minlngrad, maxlngrad, latrad,
                lngrad, distance, getServiceCredentials());
        } catch (java.lang.Exception ex) { // java.net.ConnectException
            java.util.logging.Logger.getLogger(
                new Object().getClass().getName()).log(
                    java.util.logging.Level.SEVERE, null, ex);
            return null;
        }
    }

}
