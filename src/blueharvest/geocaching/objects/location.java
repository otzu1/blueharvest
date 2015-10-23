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
public class location {

    private final String name;
    private final double latitude;
    private final double longitude;
    private final address address;

    public location(String name, double latitude, double longitude,
        address address) {
        this.name = name;
        this.latitude = latitude;
        this.longitude = longitude;
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public double getLatitude() {
        return latitude;
    }

    public double getLongitude() {
        return longitude;
    }

    public address getAddress() {
        return address;
    }

    /**
     * <h3>Distance from this location to that location</h3>
     *
     * @param that The location to determine distance from this location
     * @return statute miles from this location to that location
     * @see
     * <a href="http://introcs.cs.princeton.edu/java/44st/Location.java.html">
     * Location.java</a>
     */
    public double distanceTo(location that) {
        double knot = 1.5077945;
        double lat1 = java.lang.Math.toRadians(this.latitude);
        double lat2 = java.lang.Math.toRadians(that.latitude);
        double lng1 = java.lang.Math.toRadians(this.longitude);
        double lng2 = java.lang.Math.toRadians(that.longitude);
        // great circle distance in radians, using law of cosines formula
        double angle = Math.acos(Math.sin(lat1) * Math.sin(lat2)
            + Math.cos(lat1) * Math.cos(lat2) * Math.cos(lng1 - lng2));
        // each degree on a great circle of Earth is 60 nautical miles
        double nm = 60 * Math.toDegrees(angle);
        double mi = knot * nm;
        return mi;
    }

}
