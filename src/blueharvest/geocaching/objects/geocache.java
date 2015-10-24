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
public class geocache {

    /**
     * subject to change! should this be an average?
     */
    public enum size {

        small, medium, large
    }

    /**
     * subject to change! should this be an average?
     */
    public enum difficulty {

        easy, medium, hard
    }

    private final java.util.UUID id;
    private final java.util.Date anniversary;
    private final String name;
    private final String description;
    private final location location;
    private final size size; // ???
    private final difficulty difficulty; // ???
    private final java.util.ArrayList<image> images;
    private final logbook logbook;
    private final user creator;

    /**
     * <h3>constructor</h3>
     * instantiates this
     *
     * @param id identifier
     * @param anniversary date which this was created
     * @param name the name of this
     * @param description the description of this
     * @param location the location of this
     * @param size the size of this
     * @param difficulty how difficult this is
     * @param images the images associated with this
     * @param logbook the logbook associated with this
     * @param creator the user that created this
     * @see blueharvest.geocaching.objects.location
     * @see blueharvest.geocaching.objects.image
     * @see blueharvest.geocaching.objects.logbook
     * @see blueharvest.geocaching.objects.user
     */
    public geocache(java.util.UUID id, java.util.Date anniversary, String name,
        String description, location location, size size, difficulty difficulty,
        java.util.ArrayList<image> images, logbook logbook, user creator) {
        this.id = id;
        this.anniversary = anniversary;
        this.name = name;
        this.description = description;
        this.location = location;
        this.size = size;
        this.difficulty = difficulty;
        this.images = images;
        this.logbook = logbook;
        this.creator = creator;
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

}
