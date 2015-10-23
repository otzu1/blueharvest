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
 * @deprecated replaced by {@link blueharvest.geocaching.data.logbook}
 */
public class logbook {

    /**
     * <h3>constructor>/h3 discourage instantiation
     *
     * @since 2015-10-14
     */
    private logbook() {
    }

    /**
     * <h3>database representation of a logbook</h3>
     * see blueharvest.dbo.getLogbookById
     *
     * @param id id
     * @return a logbook object instantiated from a database. null if none.
     * @since 2015-10-14
     */
    public blueharvest.geocaching.objects.logbook get(java.util.UUID id) {
        // todo, see database.user.get to reuse code
        throw new java.lang.UnsupportedOperationException("Not implemented.");
    }

    /**
     * <h3>insert a logbook into the database</h3>
     * see blueharvest.dbo.insertLogbook stored procedure
     *
     * @param l <u>l</u>ogbook
     * @since 2015-10-14
     */
    public static void insert(blueharvest.geocaching.objects.logbook l) {
        // todo, see database.user.insert to reuse code
        throw new java.lang.UnsupportedOperationException("Not implemented.");
    }

    /**
     * <h3>update a logbook in the database</h3>
     * see blueharvest.dbo.updateLogbook stored procedure<br>
     * the logbook id is required!
     *
     * @param l <u>l</u>ogbook
     * @since 2015-10-14
     */
    public static void update(blueharvest.geocaching.objects.logbook l) {
        // todo, see database.user.insert to reuse code
        throw new java.lang.UnsupportedOperationException("Not implemented.");
    }

    /**
     * <h3>delete a logbook from the database</h3>
     * see blueharvest.dbo.deleteLogbook stored procedure
     *
     * @param id database object id
     * @since 2015-10-14
     */
    public static void delete(java.util.UUID id) {
        // todo, see database.user.delete to reuse code
        throw new java.lang.UnsupportedOperationException("Not implemented.");
    }

}
