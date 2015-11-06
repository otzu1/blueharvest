/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package blueharvest.geocaching.data;

/**
 *
 * @author jmb
 * @since 2015-10-24
 * @warning not fully compatible in an Android environment
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
        sc.setUsername(
            new blueharvest.geocaching.resources.properties().getProperty("wsu"));
        sc.setPassword(
            new blueharvest.geocaching.resources.properties().getProperty("wsp"));
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
     * inserts a geocache into the database via web services<br>
     * preconditions: the user must exist; location latitude and longitude must
     * be specified.<br>
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

    /**
     * <h3>gets geocaches within a radius of center coordinates</h3>
     * the following are not implemented:
     * <ul>
     * <li>geocache.user.anniversary - null</li>
     * <li>geocache.user.password - null/empty (intentionally)</li>
     * <li>geocache.user.salt - null/empty (intentionally)</li>
     * <li>geocache.user.active - true</li>
     * <li>geocache.user.locked - false</li>
     * <li>geocache.user.image - null</li>
     * <li>geocache.user.location - null</li>
     * <li>geocache.images - null (todo)</li>
     * <li>geocache.location.name - empty</li>
     * <li>geocache.location.address - null</li>
     * <li>geocache.logbook.entries - null (todo)</li>
     * </ul>
     *
     * @param minlatrad minimum latitude in radians
     * @param maxlatrad maximum latitude in radians
     * @param minlngrad minimum longitude in radians
     * @param maxlngrad maximum longitude in radians
     * @param latrad center latitude in radians
     * @param lngrad center longitude in radians
     * @param distance measurement from center coordinates
     * @return a list of geocaches within the distance from the center
     * coordinates
     * @since 2015-11-02
     * @see
     * <a href="http://JanMatuschek.de/LatitudeLongitudeBoundingCoordinates#Java">
     * http://JanMatuschek.de/LatitudeLongitudeBoundingCoordinates#Java</a>
     * @see blueharvest.geocaching.util.GeoLocation
     */
    public static java.util.ArrayList<geocache> getWithinDistance(
        double minlatrad, double maxlatrad, double minlngrad, double maxlngrad,
        double latrad, double lngrad, double distance) {
        java.util.ArrayList<geocache> g = new java.util.ArrayList<>();
        java.util.List<Object> h = getGeocachesWithinDistance(
            minlatrad, maxlatrad, minlngrad, maxlngrad,
            latrad, lngrad, distance).getAnyType();
        // get the geocaches from one array to another
        if (h.size() > 0) {
            for (int i = 0; i < h.size(); i++) { // todo: enhanced loop
                // or new geocache(...)
                g.add(create(
                    java.util.UUID.fromString(
                        ((blueharvest.geocaching.webservices.geocache.Geocache) h.get(i)).getId()),
                    ((blueharvest.geocaching.webservices.geocache.Geocache) h.get(i)).getAnniversary().toGregorianCalendar().getTime(),
                    ((blueharvest.geocaching.webservices.geocache.Geocache) h.get(i)).getName(),
                    ((blueharvest.geocaching.webservices.geocache.Geocache) h.get(i)).getDescription(),
                    ((blueharvest.geocaching.webservices.geocache.Geocache) h.get(i)).getDifficulty(),
                    ((blueharvest.geocaching.webservices.geocache.Geocache) h.get(i)).getSize(),
                    ((blueharvest.geocaching.webservices.geocache.Geocache) h.get(i)).getTerrain(),
                    ((blueharvest.geocaching.webservices.geocache.Geocache) h.get(i)).getStatus(),
                    ((blueharvest.geocaching.webservices.geocache.Geocache) h.get(i)).getType(),
                    blueharvest.geocaching.data.user.create(java.util.UUID.fromString(
                            ((blueharvest.geocaching.webservices.geocache.Geocache) h.get(i)).getUser().getId()),
                        ((blueharvest.geocaching.webservices.geocache.Geocache) h.get(i)).getUser().getAnniversary().toGregorianCalendar().getTime(), // not implemented
                        ((blueharvest.geocaching.webservices.geocache.Geocache) h.get(i)).getUser().getUsername(),
                        ((blueharvest.geocaching.webservices.geocache.Geocache) h.get(i)).getUser().getPassword(), // intentionally not implemented
                        java.util.UUID.fromString(((blueharvest.geocaching.webservices.geocache.Geocache) h.get(i)).getUser().getSalt()), // intentionally not implemented
                        ((blueharvest.geocaching.webservices.geocache.Geocache) h.get(i)).getUser().getEmail(),
                        true, false, null, null), // active, locked, image, and location not implemented
                    null, // java.util.ArrayList<blueharvest.geocaching.objects.image> images not implemented, todo
                    blueharvest.geocaching.data.location.create(
                        java.util.UUID.fromString(
                            ((blueharvest.geocaching.webservices.geocache.Geocache) h.get(i)).getLocation().getId()),
                        null, // location.name not implemented
                        ((blueharvest.geocaching.webservices.geocache.Geocache) h.get(i)).getLocation().getLatitude(),
                        ((blueharvest.geocaching.webservices.geocache.Geocache) h.get(i)).getLocation().getLongitude(),
                        ((blueharvest.geocaching.webservices.geocache.Geocache) h.get(i)).getLocation().getAltitude(),
                        null), // location.address not implemented
                    blueharvest.geocaching.data.logbook.create(java.util.UUID.fromString(
                            ((blueharvest.geocaching.webservices.geocache.Geocache) h.get(i)).getLogbook().getId()),
                        null))); // logbook.entries not implemented
            }
        }
        return g;
    }

    private static blueharvest.geocaching.webservices.geocache.ArrayOfAnyType
        getGeocachesWithinDistance(
            double minlatrad, double maxlatrad, double minlngrad,
            double maxlngrad, double latrad, double lngrad, double distance) {
            try {
                return getServicePort().getGeocachesWithinDistance(
                    minlatrad, maxlatrad, minlngrad, maxlngrad, latrad,
                    lngrad, distance, getServiceCredentials());
            } catch (java.lang.Exception ex) { // java.net.ConnectException
                java.util.logging.Logger.getLogger(
                    new Object().getClass().getName()).log(
                        java.util.logging.Level.SEVERE, null, ex);
                System.out.println(ex.getMessage());
                return null;
            }
        }

}
