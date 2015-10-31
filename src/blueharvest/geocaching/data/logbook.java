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

    /**
     * <h3>constructor</h3>
     * discourage instantiation
     *
     * @param id id
     * @param entries entries
     * @since 2015-10-31 Hallowe'en!
     */
    private logbook(java.util.UUID id,
        java.util.ArrayList<blueharvest.geocaching.objects.logbook.entry> entries) {
        super(id, entries);
    }

    /**
     * <h3>create a logbook object</h3>
     *
     * @param id id of this
     * @param entries entries in this
     * @return a logbook with entries
     * @since 2015-10-31 Hallowe'en
     */
    public static logbook create(java.util.UUID id,
        java.util.ArrayList<blueharvest.geocaching.objects.logbook.entry> entries) {
        return new logbook(id, entries);
    }

    private static blueharvest.geocaching.webservices.logbook.ServiceCredentials
        getServiceCredentials() {
        blueharvest.geocaching.webservices.logbook.ServiceCredentials sc
            = new blueharvest.geocaching.webservices.logbook.ServiceCredentials();
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

    private static blueharvest.geocaching.webservices.logbook.LogbookServiceSoap
        getServicePort() {
        blueharvest.geocaching.webservices.logbook.LogbookService service
            = new blueharvest.geocaching.webservices.logbook.LogbookService();
        return service.getLogbookServiceSoap();
    }

    /**
     * <h3>gets a logbook including entries with user</h3>
     *
     * @param id id of this logbook
     * @return a logbook with entries and users
     * @since 2015-10-31 Hallowe'en!
     */
    public static logbook get(java.util.UUID id) {
        // todo
        java.util.ArrayList<blueharvest.geocaching.objects.logbook.entry> e
            = new java.util.ArrayList<>();
        java.util.List<Object> f = getLogbook(id.toString()).getAnyType();
        // get the logbook entries from one array to another
        if (f.size() > 0) {
            for (int i = 0; i < f.size(); i++) { // todo: enhanced loop
                e.add(entry.create(
                    java.util.UUID.fromString(
                        ((blueharvest.geocaching.webservices.logbook.LogbookEntry) f.get(i)).getId()),
                    ((blueharvest.geocaching.webservices.logbook.LogbookEntry) f.get(i)).getDatetime().toGregorianCalendar().getTime(),
                    ((blueharvest.geocaching.webservices.logbook.LogbookEntry) f.get(i)).getTitle(),
                    ((blueharvest.geocaching.webservices.logbook.LogbookEntry) f.get(i)).getText(),
                    blueharvest.geocaching.data.user.create(null, null,
                        ((blueharvest.geocaching.webservices.logbook.LogbookEntry) f.get(i)).getUsername(),
                        null, null, null, true, true, null,
                        blueharvest.geocaching.data.image.create(
                            null, java.net.URI.create(
                                ((blueharvest.geocaching.webservices.logbook.LogbookEntry) f.get(i)).getUri()), null, null))));
                //((blueharvest.geocaching.webservices.logbook.LogbookEntry)f.getAnyType().get(i)).getId();
            }
        }
        return new logbook(id, e);
    }

    private static blueharvest.geocaching.webservices.logbook.ArrayOfAnyType
        getLogbook(java.lang.String id) {
        try {
            return getServicePort().getLogbook(id, getServiceCredentials());
        } catch (java.lang.Exception ex) { // java.net.ConnectException
            java.util.logging.Logger.getLogger(
                new Object().getClass().getName()).log(
                    java.util.logging.Level.SEVERE, null, ex);
            return null;
        }
    }

    /**
     * <h3>insert a logbook via web service</h3>
     *
     * @return true/false depending on whether the insert was successful
     * @since 2015-10-31 Hallowe'en
     */
    public static boolean insert() {
        return insertLogbook();
    }

    private static Boolean insertLogbook() {
        try {
            return getServicePort().insertLogbook(getServiceCredentials());
        } catch (java.lang.Exception ex) { // java.net.ConnectException
            java.util.logging.Logger.getLogger(
                new Object().getClass().getName()).log(
                    java.util.logging.Level.SEVERE, null, ex);
            return false;
        }
    }

    public static final boolean update(logbook l) {
        // todo
        throw new java.lang.UnsupportedOperationException("Not supported yet.");
    }

    public static final boolean delete(java.util.UUID id) {
        // todo
        throw new java.lang.UnsupportedOperationException("Not implemented.");
    }

    public static class entry extends blueharvest.geocaching.objects.logbook.entry {

        private entry(java.util.UUID id, java.util.Date date, String title,
            String text, blueharvest.geocaching.objects.user user) {
            super(id, date, title, text, user);
        }

        public static entry create(java.util.UUID id, java.util.Date date,
            String title, String text, blueharvest.geocaching.objects.user user) {
            return new entry(id, date, title, text, user);
        }

        private static blueharvest.geocaching.webservices.logbook.ServiceCredentials
            getServiceCredentials() {
            blueharvest.geocaching.webservices.logbook.ServiceCredentials sc
                = new blueharvest.geocaching.webservices.logbook.ServiceCredentials();
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

        private static blueharvest.geocaching.webservices.logbook.LogbookServiceSoap
            getServicePort() {
            blueharvest.geocaching.webservices.logbook.LogbookService service
                = new blueharvest.geocaching.webservices.logbook.LogbookService();
            return service.getLogbookServiceSoap();
        }

        public static entry get(java.util.UUID id) {
            // todo
            throw new java.lang.UnsupportedOperationException("Not implemented.");
        }

        /**
         * <h3>inserts a logbook entry in the database via web services</h3>
         *
         * @param e (e)ntry
         * @param userid author's user id
         * @param logbookid logbook id for this logbook entry
         * @return true/false depending on the success of the web service insert
         * @since 2015-10-31 Hallowe'en!
         */
        public static boolean insert(
            entry e, java.util.UUID userid, java.util.UUID logbookid) {
            blueharvest.geocaching.webservices.logbook.LogbookEntry f
                = new blueharvest.geocaching.webservices.logbook.LogbookEntry();
            f.setTitle(e.getTitle());
            f.setText(e.getText());
            //e.getUser().getId().toString(); // decided against
            return insertLogbookEntry(f, userid.toString(), logbookid.toString());
        }

        private static Boolean insertLogbookEntry(
            blueharvest.geocaching.webservices.logbook.LogbookEntry entry,
            java.lang.String userid, java.lang.String logbookid) {
            try {
                return getServicePort().insertLogbookEntry(
                    entry, userid, logbookid, getServiceCredentials());
            } catch (java.lang.Exception ex) { // java.net.ConnectException
                java.util.logging.Logger.getLogger(
                    new Object().getClass().getName()).log(
                        java.util.logging.Level.SEVERE, null, ex);
                return false;
            }
        }

        public static boolean update(entry e) {
            // todo
            throw new java.lang.UnsupportedOperationException("Not implemented.");
        }

        public static boolean delete(java.util.UUID id) {
            // todo
            throw new java.lang.UnsupportedOperationException("Not implemented.");
        }

    }

}
