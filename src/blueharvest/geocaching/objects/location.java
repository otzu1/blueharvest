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
    private final coordinate latitude;
    private final coordinate longitude;
    private final address address;

    /**
     * <h3>location</h3>
     * represents the latitude and longitude coordinates on globe
     *
     * @param name name
     * @param latitude latitude coordinate
     * @param longitude longitude coordinate
     * @param address address
     * @see blueharvest.geocaching.objects.location.coordinate
     */
    public location(String name, double latitude, double longitude,
        address address) {
        this.name = name;
        this.latitude = new coordinate(latitude);
        this.longitude = new coordinate(longitude);
        this.address = address;
    }

    public String getName() {
        return name;
    }

    /**
     * <h3>latitude φ coordinate</h3>
     * e.g., 40.7981905
     *
     * @return latitude coordinate; positive (+) is in the northern hemisphere
     * or N, negative (-) is in the southern hemisphere or S
     * @see blueharvest.geocaching.objects.location.coordinate
     * @since 2015-10-23
     */
    public coordinate getLatitude() {
        return latitude;
    }

    /**
     * <h3>longitude λ coordinate</h3>
     * e.g., -77.8600217
     *
     * @return longitude coordinate; positive (+) is in the eastern hemisphere
     * or E, negative (-) is in the western hemisphere or W
     * @see blueharvest.geocaching.objects.location.coordinate
     * @since 2015-10-23
     */
    public coordinate getLongitude() {
        return longitude;
    }

    public address getAddress() {
        return address;
    }

    /**
     * <h3>distance from this location to that location</h3>
     *
     * @param that the location to determine distance from this location
     * @return statute miles from this location to that location
     * @see
     * <a href="http://introcs.cs.princeton.edu/java/44st/Location.java.html">
     * Location.java</a>
     */
    public double distanceTo(location that) {
        double knot = 1.5077945;
        double lat1 = java.lang.Math.toRadians(this.latitude.getDecimalDegrees());
        double lat2 = java.lang.Math.toRadians(that.latitude.getDecimalDegrees());
        double lng1 = java.lang.Math.toRadians(this.longitude.getDecimalDegrees());
        double lng2 = java.lang.Math.toRadians(that.longitude.getDecimalDegrees());
        // great circle distance in radians, using law of cosines formula
        double angle = Math.acos(Math.sin(lat1) * Math.sin(lat2)
            + Math.cos(lat1) * Math.cos(lat2) * Math.cos(lng1 - lng2));
        // each degree on a great circle of Earth is 60 nautical miles
        double nm = 60 * Math.toDegrees(angle);
        double mi = knot * nm;
        return mi;
    }

    /**
     * wrapper class for a latitude or longitude coordinate
     */
    public static class coordinate {

        private final double dd; // (d)ecimal (d)egrees
        private final int d; // (d)egree
        private final int m; // (m)inute
        private final double s; // (s)econd

        /**
         * <h3>constructor</h3>
         *
         * @param l <u>l</u>atitude or <u>l</u>ongitude in decimal degrees
         * @see
         * <a href="https://en.wikipedia.org/wiki/Geographic_coordinate_conversion">
         * Geographic Coordinate Conversion</a>
         * @since 2015-10-23
         */
        public coordinate(double l) {
            dd = l;
            d = (int) Math.floor(Math.abs(l));
            m = (int) Math.floor((Math.abs(l) - d) * 60d);
            s = (Math.abs(l) - d - (double) m / 60d) * 3600;
        }

        /**
         * <h3>gets the coordinate in decimal degree format</h3>
         * e.g., 40.7981905 or -77.8600217;
         * <ul>
         * <li>a positive (+) latitude coordinate indicates the northern
         * hemisphere or N</li>
         * <li>a negative (-) latitude coordinate indicates the southern
         * hemisphere or S</li>
         * <li>a positive (+) longitude coordinate indicates the eastern
         * hemisphere or E</li>
         * <li>a negative (-) longitude coordinate indicates the western
         * hemisphere or W</li>
         * </ul>
         *
         * @return coordinate in decimal degrees
         */
        public double getDecimalDegrees() {
            return dd;
        }

        /**
         * <h3>gets the degree ° for coordinate formatting</h3>
         * e.g., <b>40°</b>47'53.5", <b>77°</b>51'36.1" (<b>degrees</b> minutes
         * seconds or dms); to determine hemisphere, see
         * {@link blueharvest.geocaching.objects.location.coordinate#getDecimalDegrees()}
         * for sign
         *
         * @return degrees ° of the coordinate
         */
        public int getDegree() {
            return d;
        }

        /**
         * <h3>gets the minute ' for coordinate formatting</h3>
         * e.g., 40°<b>47'</b>53.5", 77°<b>51'</b>36.1"(degrees <b>minutes</b>
         * seconds or dms)
         *
         * @return minutes ' of the coordinate
         */
        public int getMinute() {
            return m;
        }

        /**
         * <h3>gets the second " for coordinate formatting</h3>
         * e.g., 40°47'<b>53.5"</b>, 77°51'<b>36.1"</b> (degrees minutes
         * <b>seconds</b> or dms)
         *
         * @return seconds " of the coordinate
         */
        public double getSecond() {
            return s;
        }

    }

}
