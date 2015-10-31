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

    private logbook(java.util.UUID id,
        java.util.ArrayList<blueharvest.geocaching.objects.logbook.entry> entries) {
        super(id, entries);
    }
    
    public static logbook create(java.util.UUID id,
        java.util.ArrayList<blueharvest.geocaching.objects.logbook.entry> entries) {
        return new logbook(id, entries);
    }

    public static logbook get(java.util.UUID id) {
        // todo
        //java.util.ArrayList<entry> entries = new java.util.ArrayList<>();
        //entries.add(new logbook.entry(null, null, null, null, null));
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
    
    /*
    public static class entry extends blueharvest.geocaching.objects.logbook.entry {

        private entry(java.util.UUID id, java.util.Date date, String title,
            String text, blueharvest.geocaching.objects.user user) {
            super(id, date, title, text, user);
        }
        
        public static entry create(java.util.UUID id, java.util.Date date,
            String title, String text, blueharvest.geocaching.objects.user user) {
            return new entry(id, date, title, text, user);
        }
        
        public static final boolean insert(entry e) {
            throw new java.lang.UnsupportedOperationException("Not implemented.");
        }
        
    }
    */

}
