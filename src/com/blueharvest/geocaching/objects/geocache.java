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
public class geocache {

    public enum size {

        small, medium, large
    }

    public enum difficulty {

        easy, medium, hard
    }

    private final String name;
    private final location location;
    private final size size;
    private final difficulty difficulty;
    private final java.util.ArrayList<image> images;
    private final logbook logbook;
    private final user creator;
    private final java.util.Date date;

    public geocache(String name, location location,
        size size, difficulty difficulty, java.util.ArrayList<image> images,
        logbook logbook, user creator, java.util.Date date) {
        this.name = name;
        this.location = location;
        this.size = size;
        this.difficulty = difficulty;
        this.images = images;
        this.logbook = logbook;
        this.creator = creator;
        this.date = date;
    }

    public String getName() {
        return name;
    }

    public location getLocation() {
        return location;
    }

    public size getSize() {
        return size;
    }

    public difficulty getDifficulty() {
        return difficulty;
    }

    public java.util.ArrayList<image> getImages() {
        return images;
    }

    public logbook getLogbook() {
        return logbook;
    }

    public user getCreator() {
        return creator;
    }

    public java.util.Date getDate() {
        return date;
    }

}
