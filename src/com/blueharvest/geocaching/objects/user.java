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
public class user {

    private final java.util.UUID id;
    private final String username;
    private final String password;
    private final String email;
    private final location location;
    private final image image;

    /**
     * <h3>constructor</h3>
     *
     * @param id id
     * @param username username
     * @param password password
     * @param email email (i.e., username@domain.ext)
     * @param location current location of the user. null if unknown.
     * @param image avatar image of the user. null if none or unknown.
     * @since 2015-10-13
     */
    public user(java.util.UUID id, String username, String password,
        String email, location location, image image) {
        this.id = id;
        this.username = username;
        this.password = password;
        this.email = email;
        this.location = location;
        this.image = image;
    }

    public java.util.UUID getId() {
        return id;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    public String getEmail() {
        return email;
    }

    public location getLocation() {
        return location;
    }

    public image getImage() {
        return image;
    }

}
