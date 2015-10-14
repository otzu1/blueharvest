/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.blueharvest.geocaching.objects;

/**
 *
 * @author jmb
 * @since 2015-10-13
 */
public class address {

    private final String street;
    private final String city;
    private final region region;
    private final String postalcode;

    /**
     * <h3>address constructor</h3>
     * todo: description
     *
     * @param street the street of the address
     * @param city the city of the address
     * @param region the region of the address
     * @param postalcode the postal code of the address
     * @since 2015-10-13
     */
    public address(String street, String city,
        region region, String postalcode) {
        this.street = street;
        this.city = city;
        this.region = region;
        this.postalcode = postalcode;
    }

    public String getStreet() {
        return street;
    }

    public String getCity() {
        return city;
    }

    public region getRegion() {
        return region;
    }

    public String getPostalCode() {
        return postalcode;
    }

    public static class region {

        private final String name;
        private final String abbreviation;

        /**
         * <h3>region constructor</h3>
         *
         * @param name the name of the region
         * @param abbreviation the abbreviation of the region
         */
        public region(String name, String abbreviation) {
            this.name = name;
            this.abbreviation = abbreviation;
        }

        public String getName() {
            return name;
        }

        public String getAbbrevation() {
            return abbreviation;
        }

    }

}
