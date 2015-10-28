/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package blueharvest.geocaching.data;

/**
 *
 * @author jmb
 * @since 2015-10-15 Back to the Future Day!
 */
public class logbook extends blueharvest.geocaching.objects.logbook { // implements data<logbook>

    private logbook(java.util.ArrayList<entry> entries) {
        super(entries);
    }
    
    public static logbook create(java.util.ArrayList<entry> entries) {
        // todo
        throw new java.lang.UnsupportedOperationException("Not supported yet.");
    }

    public static logbook get(java.util.UUID id) {
        // todo
        throw new java.lang.UnsupportedOperationException("Not supported yet.");
    }

    public static boolean insert(logbook l) {
        // todo
        throw new java.lang.UnsupportedOperationException("Not supported yet.");
    }

    public static final boolean update(logbook l) {
        // todo
        throw new java.lang.UnsupportedOperationException("Not supported yet.");
    }

    public static final boolean delete(java.util.UUID id) {
        // todo
        throw new java.lang.UnsupportedOperationException("Not implemented.");
    }

}
