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
 */
public class geocache extends blueharvest.geocaching.objects.geocache {

    private geocache(java.util.UUID id, java.util.Date anniversary, String name,
        String description, int difficulty, int size, int terrain, int status,
        blueharvest.geocaching.objects.user creator,
        java.util.ArrayList<blueharvest.geocaching.objects.image> images,
        blueharvest.geocaching.objects.location location,
        blueharvest.geocaching.objects.logbook logbook) {
        super(id, anniversary, name, description, difficulty, size, terrain,
            status, creator, images, location, logbook);
    }
    
    public static geocache create(java.util.UUID id, java.util.Date anniversary,
        String name, String description, int difficulty, int size, int terrain,
        int status, blueharvest.geocaching.objects.user creator,
        java.util.ArrayList<blueharvest.geocaching.objects.image> images,
        blueharvest.geocaching.objects.location location,
        blueharvest.geocaching.objects.logbook logbook) {
        return new geocache(id, anniversary, name, description, difficulty,
            size, terrain, status, creator, images, location, logbook);
    }

    public static geocache get(java.util.UUID id) {
        // todo
        throw new java.lang.UnsupportedOperationException("Not supported yet.");
    }

    public static boolean insert(blueharvest.geocaching.objects.geocache g) {
        // todo
        throw new java.lang.UnsupportedOperationException("Not supported yet.");
    }

    public static final boolean update(blueharvest.geocaching.objects.geocache g) {
        // todo
        throw new java.lang.UnsupportedOperationException("Not supported yet.");
    }

    public static final boolean delete(java.util.UUID id) {
        // todo
        throw new java.lang.UnsupportedOperationException("Not implemented.");
    }

}
