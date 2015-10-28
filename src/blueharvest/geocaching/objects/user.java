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
public abstract class user {

    private final java.util.UUID id;
    private final java.util.Date anniversary;
    private final String username;
    private final String password;
    private final java.util.UUID salt;
    private final String email;
    private final boolean active;
    private final boolean locked;
    private final location location;
    private final image image;

    /**
     * <h3>constructor</h3>
     *
     * @param id id
     * @param anniversary the date the user was originally created
     * @param username username
     * @param password password (clear text out, hashed in)
     * @param salt salt
     * @param email email (i.e., username@domain.ext)
     * @param active active (i.e., true/false)
     * @param locked locked (i.e., true/false)
     * @param location current location of the user. null if unknown.
     * @param image avatar image of the user. null if none or unknown.
     * @see blueharvest.geocaching.objects.image
     * @since 2015-10-13
     */
    public user(java.util.UUID id, java.util.Date anniversary, String username,
        String password, java.util.UUID salt, String email, boolean active,
        boolean locked, location location, image image) {
        this.id = id;
        this.anniversary = anniversary;
        this.username = username;
        this.password = password;
        this.salt = salt;
        this.email = email;
        this.active = active;
        this.locked = locked;
        this.location = location;
        this.image = image;
    }

    public java.util.UUID getId() {
        return id;
    }

    public java.util.Date getAnniversary() {
        return anniversary;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    public java.util.UUID getSalt() {
        return salt;
    }

    public String getEmail() {
        return email;
    }

    public boolean isActive() {
        return active;
    }

    public boolean isLocked() {
        return locked;
    }

    public location getLocation() {
        return location;
    }

    public image getImage() {
        return image;
    }

}
