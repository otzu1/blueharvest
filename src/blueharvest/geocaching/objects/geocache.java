/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package blueharvest.geocaching.objects;

/**
 * immutable
 *
 * @author jmb
 * @since 2015-10-13
 */
public abstract class geocache {

    private final java.util.UUID id;
    private final java.util.Date anniversary;
    private final String name;
    private final String description;
    private final int difficulty;
    private final int terrain;
    private final int size;
    private final int status;
    private final user creator;
    private final java.util.ArrayList<image> images;
    private final location location;
    private final logbook logbook;

    /**
     * <h3>constructor</h3>
     * instantiates this
     *
     * @param id identifier
     * @param anniversary date which this was created
     * @param name the name of this
     * @param description the description of this
     * @param difficulty how difficult this is
     * @param size the size of this
     * @param terrain the terrain of this
     * @param status the status of this
     * @param creator the user that created this
     * @param images the images associated with this
     * @param location the location of this
     * @param logbook the logbook associated with this
     * @see blueharvest.geocaching.objects.user
     * @see blueharvest.geocaching.objects.image
     * @see blueharvest.geocaching.objects.location
     * @see blueharvest.geocaching.objects.logbook
     */
    public geocache(java.util.UUID id, java.util.Date anniversary, String name,
        String description, int difficulty, int size, int terrain, int status,
        user creator, java.util.ArrayList<image> images, location location,
        logbook logbook) {
        this.id = id;
        this.anniversary = anniversary;
        this.name = name;
        this.description = description;
        this.difficulty = difficulty;
        this.terrain = terrain;
        this.size = size;
        this.status = status;
        this.creator = creator;
        this.images = images;
        this.logbook = logbook;
        this.location = location;
    }

    public java.util.UUID getId() {
        return id;
    }

    public java.util.Date getAnniversary() {
        return anniversary;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public int getDifficulty() {
        return difficulty;
    }

    public int getTerrain() {
        return terrain;
    }

    public int getSize() {
        return size;
    }

    public int getStatus() {
        return status;
    }

    public user getCreator() {
        return creator;
    }

    public java.util.ArrayList<image> getImages() {
        return images;
    }

    public location getLocation() {
        return location;
    }

    public logbook getLogbook() {
        return logbook;
    }

}
