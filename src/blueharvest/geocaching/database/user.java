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
 * @deprecated replaced by {@link blueharvest.geocaching.data.user}
 */
public class user {

    /**
     * <h3>constructor</h3>
     * discourage instantiation
     *
     * @since 2015-10-14
     */
    private user() {
    }

    /**
     * <h3>database representation of a user</h3>
     * see blueharvest.dbo.getUserById stored procedure
     *
     * @param id user(<u>id</u>)
     * @return a user object instantiated from a database. if no user exists in
     * the database, null is returned.
     * @since 2015-10-13
     */
    public static blueharvest.geocaching.objects.user get(
        java.util.UUID id) {
        blueharvest.geocaching.objects.user u = null;
        try (java.sql.Connection c = mssql.connection();
            java.sql.CallableStatement cs = c.prepareCall(
                "{call blueharvest.dbo.getUserById(?, ?, ?, ?, ?, ?, ?, ?)}")) {
            cs.setNString(1, id.toString()); // id
            cs.registerOutParameter(2, java.sql.Types.DATE); // anniversary
            cs.registerOutParameter(3, java.sql.Types.NVARCHAR); // username
            cs.registerOutParameter(4, java.sql.Types.NVARCHAR); // password
            cs.registerOutParameter(5, java.sql.Types.NVARCHAR); // salt
            cs.registerOutParameter(6, java.sql.Types.NVARCHAR); // email
            cs.registerOutParameter(7, java.sql.Types.BOOLEAN); // active
            cs.registerOutParameter(8, java.sql.Types.BOOLEAN); // locked
            cs.execute();
            // todo: location
            // todo: image
            if (cs.getNString(4) != null) {
                u = new blueharvest.geocaching.objects.user(
                    id, cs.getDate(2), cs.getNString(3), cs.getNString(4),
                    java.util.UUID.fromString(cs.getNString(5)),
                    cs.getNString(6), cs.getBoolean(7), cs.getBoolean(8),
                    null, null);
            }
            //c.close(); cs.close(); // try-with-resources
        } catch (java.lang.Exception e) {
            System.err.println(e.getMessage());
        } finally {
        }
        return u;
    }

    /**
     * <h3>database representation of a user</h3>
     * see blueharvest.dbo.getUserByEmail
     *
     * @param email email
     * @return a user object instantiated from a database. null if none.
     * @since 2015-10-14
     */
    public static blueharvest.geocaching.objects.user get(String email) {
        blueharvest.geocaching.objects.user u = null;
        try (java.sql.Connection c = mssql.connection();
            java.sql.CallableStatement cs = c.prepareCall(
                "{call blueharvest.dbo.getUserByEmail(?, ?, ?, ?, ?, ?, ?, ?)}")) {
            cs.setNString(1, email); // email
            cs.registerOutParameter(2, java.sql.Types.NVARCHAR); // id
            cs.registerOutParameter(3, java.sql.Types.NVARCHAR); // anniversary
            cs.registerOutParameter(4, java.sql.Types.NVARCHAR); // username
            cs.registerOutParameter(5, java.sql.Types.NVARCHAR); // password
            cs.registerOutParameter(6, java.sql.Types.NVARCHAR); // salt
            cs.registerOutParameter(7, java.sql.Types.BOOLEAN); // active
            cs.registerOutParameter(8, java.sql.Types.BOOLEAN); // locked
            cs.execute();
            // todo: location
            // todo: image
            if (cs.getNString(2) != null) {
                u = new blueharvest.geocaching.objects.user(
                    java.util.UUID.fromString(cs.getNString(2)),
                    cs.getDate(3), cs.getNString(4), cs.getNString(5),
                    java.util.UUID.fromString(cs.getNString(6)),
                    email, cs.getBoolean(7), cs.getBoolean(8), null, null);
            }
            //c.close(); cs.close(); // try-with-resources
        } catch (java.lang.Exception e) {
            System.err.println(e.getMessage()); // todo: exception(s)
        } finally {
        }
        return u;
    }

    /**
     * <h3>insert a user into the database</h3>
     * see blueharvest.dbo.insertUser stored procedure
     *
     * @param u <u>u</u>ser
     * @since 2015-10-14
     */
    public static void insert(blueharvest.geocaching.objects.user u) {
        try (java.sql.Connection c = mssql.connection();
            java.sql.CallableStatement cs
            = c.prepareCall("{call blueharvest.dbo.insertUser(?, ?, ?, ?, ?)}")) {
            cs.setNString(1, u.getUsername());
            cs.setNString(2, u.getPassword());
            cs.setNString(3, u.getEmail());
            cs.setBoolean(4, u.isActive());
            cs.setBoolean(5, u.isLocked());
            cs.executeUpdate();
            //c.close(); cs.close(); // try-with-resources
        } catch (java.lang.Exception e) {
            System.err.println(e.getMessage());
        } finally {
        }
    }

    /**
     * <h3>update a user in the database</h3>
     * see blueharvest.dbo.updateUser stored procedure<br>
     * the user id is required!
     *
     * @param u <u>u</u>ser
     * @since 2015-10-14
     */
    public static void update(blueharvest.geocaching.objects.user u) {
        try (java.sql.Connection c = mssql.connection();
            java.sql.CallableStatement cs
            = c.prepareCall(
                "{call blueharvest.dbo.updateUser(?, ?, ?, ?, ?, ?)}")) {
            cs.setNString(1, u.getId().toString());
            cs.setNString(2, u.getUsername());
            cs.setNString(3, u.getPassword());
            cs.setNString(4, u.getEmail());
            cs.setBoolean(5, u.isActive());
            cs.setBoolean(5, u.isLocked());
            cs.executeUpdate();
            //c.close(); cs.close(); // try-with-resources
        } catch (java.lang.Exception e) {
            System.err.println(e.getMessage());
        } finally {
        }
    }

    /**
     * <h3>delete a user from the database</h3>
     * see blueharvest.dbo.deleteUser stored procedure
     *
     * @param id database object id
     * @since 2015-10-14
     */
    public static void delete(java.util.UUID id) {
        try (java.sql.Connection c = mssql.connection();
            java.sql.CallableStatement cs
            = c.prepareCall("{call blueharvest.dbo.deleteUser(?)}")) {
            cs.setNString(1, id.toString());
            cs.executeUpdate();
            //c.close(); cs.close(); // try-with-resources
        } catch (java.lang.Exception e) {
            System.err.println(e.getMessage());
        } finally {
        }
    }

}
