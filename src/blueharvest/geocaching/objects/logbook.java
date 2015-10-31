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
public abstract class logbook {

    java.util.UUID id;
    java.util.ArrayList<entry> entries = new java.util.ArrayList<>();

    public logbook(java.util.UUID id, java.util.ArrayList<entry> entries) {
        this.id = id;
        this.entries = entries;
    }

    public java.util.UUID getId() {
        return id;
    }

    public java.util.ArrayList<entry> getEntries() {
        return entries;
    }

    /**
     *
     * @author jmb
     * @since 2015-10-13
     */
    public static class entry {

        private final java.util.UUID id;
        private final java.util.Date date;
        private final String title;
        private final String text;
        private final user user;

        public entry(java.util.UUID id, java.util.Date date, String title,
            String text, user user) {
            this.id = id;
            this.date = date;
            this.title = title;
            this.text = text;
            this.user = user;
        }

        public java.util.UUID getId() {
            return id;
        }

        public java.util.Date getDate() {
            return date;
        }

        public String getTitle() {
            return title;
        }

        public String getText() {
            return text;
        }

        public blueharvest.geocaching.objects.user getUser() {
            return user;
        }

    }

}
