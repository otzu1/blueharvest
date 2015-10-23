/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package blueharvest.geocaching.objects;

/**
 *
 * @author jmb
 * @since 2015-10-13
 */
public class logbook {

    java.util.ArrayList<entry> entries = new java.util.ArrayList<>();

    public logbook(java.util.ArrayList<entry> entries) {
        this.entries = entries;
    }

    public java.util.ArrayList<entry> getEntries() {
        return entries;
    }

    /**
     *
     * @author jmb
     * @since 2015-10-13
     */
    public class entry {

        private final java.util.Date date;
        private final String text;
        private final user user;

        public entry(java.util.Date date, String text, user user) {
            this.date = date;
            this.text = text;
            this.user = user;
        }

        public java.util.Date getDate() {
            return date;
        }

        public String getText() {
            return text;
        }

        public blueharvest.geocaching.objects.user getUser() {
            return user;
        }

    }

}
