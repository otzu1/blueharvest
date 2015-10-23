/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package blueharvest.geocaching.database;

/**
 *
 * @author jmb
 * @since 2015-10-14
 * @deprecated replaced by {@link blueharvest.geocaching.data.geocache}
 */
public class geocache {

    /**
     * <h3>constructor</h3>
     * discourage instantiation
     *
     * @since 2015-10-14
     */
    private geocache() {
    }

    /**
     * <h3>database representation of a geocache</h3>
     * see blueharvest.dbo.getGeocacheById stored procedure
     *
     * @param id geocache(<u>id</u>)
     * @return a geocache object instantiated from a database
     * @since 2015-10-14
     */
    public static blueharvest.geocaching.objects.geocache get(
        java.util.UUID id) {
        // todo, see database.user.get to reuse code
        throw new java.lang.UnsupportedOperationException("Not implemented.");
    }

    /**
     * <h3>insert a geocache into the database</h3>
     * see blueharvest.dbo.insertGeocache stored procedure
     *
     * @param g <u>g</u>eocache
     * @since 2015-10-14
     */
    public static void insert(blueharvest.geocaching.objects.geocache g) {
        // todo, see database.user.insert to reuse code
        throw new java.lang.UnsupportedOperationException("Not implemented.");
    }

    /**
     * <h3>update a geocache in the database</h3>
     * see blueharvest.dbo.updateGeocache stored procedure<br>
     * the id is required!
     *
     * @param g <u>g</u>eocache
     * @since 2015-10-14
     */
    public static void update(blueharvest.geocaching.objects.geocache g) {
        // todo, see database.user.update to reuse code
        throw new java.lang.UnsupportedOperationException("Not implemented.");
    }

    /**
     * <h3>delete a geocache from the database</h3>
     * see blueharvest.dbo.deleteGeocache stored procedure
     *
     * @param id database object id
     * @since 2015-10-14
     */
    public static void delete(java.util.UUID id) {
        // todo, see database.user.delete to reuse code
        throw new java.lang.UnsupportedOperationException("Not implemented.");
    }

}
