/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package blueharvest.geocaching.objects;

/**
 * <h3>image object</h3>
 *
 * @author jmb
 * @since 2015-10-13
 */
public abstract class image {

    private final java.util.UUID id;
    private final java.net.URI uri;
    private final String caption;
    private final java.io.File file;

    /**
     * <h3>constructor</h3>
     *
     * @param id id of this
     * @param uri where this is located
     * @param caption the caption for this
     * @param file the file object of this
     * @see java.util.UUID
     * @see java.net.URI
     * @see java.io.File
     * @since 2015-10-24
     */
    public image(java.util.UUID id, java.net.URI uri, String caption,
        java.io.File file) {
        this.id = id;
        this.uri = uri;
        this.caption = caption;
        this.file = file;
    }

    public java.util.UUID getId() {
        return id;
    }

    public java.net.URI getUri() {
        return uri;
    }

    public String getCaption() {
        return caption;
    }

    public java.io.File getFile() {
        return file;
    }

}
