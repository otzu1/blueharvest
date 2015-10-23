/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package blueharvest.geocaching.database;

/**
 *
 * @author jmb
 * @since 2015-10-13
 * @deprecated replaced by {@link blueharvest.geocaching.data.image}
 */
public class image {

    /**
     * <h3>constructor>/h3 discourage instantiation
     *
     * @since 2015-10-14
     */
    private image() {
    }

    /**
     * <h3>database representation of an image</h3>
     * see blueharvest.dbo.getImageById
     *
     * @param id id
     * @return an image object instantiated from a database. null if none.
     * @since 2015-10-14
     */
    public blueharvest.geocaching.objects.image get(java.util.UUID id) {
        // todo, see database.user.get to reuse code
        throw new java.lang.UnsupportedOperationException("Not implemented.");
    }

    /**
     * <h3>insert an image into the database</h3>
     * see blueharvest.dbo.insertImage stored procedure
     *
     * @param i <u>i</u>mage
     * @since 2015-10-14
     */
    public static void insert(blueharvest.geocaching.objects.image i) {
        // todo, see database.user.insert to reuse code
        throw new java.lang.UnsupportedOperationException("Not implemented.");
    }

    /**
     * <h3>update an image in the database</h3>
     * see blueharvest.dbo.updateImage stored procedure<br>
     * the image id is required!
     *
     * @param i <u>i</u>mage
     * @since 2015-10-14
     */
    public static void update(blueharvest.geocaching.objects.image i) {
        // todo, see database.user.insert to reuse code
        throw new java.lang.UnsupportedOperationException("Not implemented.");
    }

    /**
     * <h3>delete an image from the database</h3>
     * see blueharvest.dbo.deleteImage stored procedure
     *
     * @param id database object id
     * @since 2015-10-14
     */
    public static void delete(java.util.UUID id) {
        // todo, see database.user.delete to reuse code
        throw new java.lang.UnsupportedOperationException("Not implemented.");
    }

}
