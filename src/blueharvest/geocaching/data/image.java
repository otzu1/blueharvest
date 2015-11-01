/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package blueharvest.geocaching.data;

/**
 *
 * @author jmb
 * @since 2015-10-24
 */
public class image extends blueharvest.geocaching.objects.image { // implements data<image>

    /**
     * <h3>constructor</h>
     * discourage instantiation (immutable) externally
     *
     * @param id the id for this
     * @param uri where this is
     * @param caption caption for this
     * @param file file object of this
     * @see java.util.UUID
     * @see java.io.File
     * @since 2015-10-27
     */
    private image(java.util.UUID id, java.net.URI uri, String caption,
        java.io.File file) {
        super(id, uri, caption, file);
    }

    /**
     * <h3>create this</h3>
     *
     * @param id id
     * @param uri uri
     * @param caption caption
     * @param file file
     * @return an image
     * @see java.util.UUID
     * @see java.net.URI
     * @see java.io.File
     * @since 2015-10-27
     */
    public static image create(java.util.UUID id, java.net.URI uri,
        String caption, java.io.File file) {
        return new image(id, uri, caption, file);
    }

    /**
     * <h3>service credentials for the web services</h3>
     *
     * @return service credentials needed for the web services
     * @since 2015-10-27
     */
    private static blueharvest.geocaching.webservices.image.ServiceCredentials
        getServiceCredentials() {
        blueharvest.geocaching.webservices.image.ServiceCredentials sc
            = new blueharvest.geocaching.webservices.image.ServiceCredentials();
        try { // use properties file for credentials
            java.util.Properties p = new java.util.Properties();
            p.load(new Object().getClass().getResourceAsStream(
                "/blueharvest/geocaching/resources/config.properties"));
            sc.setUsername(p.getProperty("wsu"));
            sc.setPassword(p.getProperty("wsp"));
        } catch (java.io.FileNotFoundException ex) {
            java.util.logging.Logger.getLogger(
                new Object().getClass().getName()).log(
                    java.util.logging.Level.SEVERE, null, ex);
        } catch (java.io.IOException ex) {
            java.util.logging.Logger.getLogger(
                new Object().getClass().getName()).log(
                    java.util.logging.Level.SEVERE, null, ex);
        }
        return sc;
    }

    /**
     * <h3>service port for the web services</h3>
     *
     * @return service port needed for web services
     * @since 2015-10-27
     */
    private static blueharvest.geocaching.webservices.image.ImageServiceSoap
        getServicePort() {
        blueharvest.geocaching.webservices.image.ImageService service
            = new blueharvest.geocaching.webservices.image.ImageService();
        return service.getImageServiceSoap();
    }

    /**
     * <h3>factory method</h3>
     *
     * @param id
     * @return an instance of this
     * @since 2015-10-27
     * @see java.util.UUID
     */
    public static image get(java.util.UUID id) {
        blueharvest.geocaching.webservices.image.Image i
            = getImage(id.toString());
        return new image(java.util.UUID.fromString(i.getId()),
            java.net.URI.create(i.getUri()), i.getCaption(), null);
    }

    private static blueharvest.geocaching.webservices.image.Image
        getImage(java.lang.String id) {
        try {
            return getServicePort().getImage(id, getServiceCredentials());
        } catch (java.lang.Exception ex) { // java.net.ConnectException
            java.util.logging.Logger.getLogger(
                new Object().getClass().getName()).log(
                    java.util.logging.Level.SEVERE, null, ex);
            return null;
        }
    }

    /**
     * <h3>insert image</h3>
     *
     * @param i (i)mage
     * @return true/false dependent on whether the web service inserts
     * @since 2015-10-27
     */
    public static boolean insert(image i) {
        blueharvest.geocaching.webservices.image.Image j
            = new blueharvest.geocaching.webservices.image.Image();
        //j.setId(i.getId().toString()); // not used
        j.setUri(i.getUri().toString());
        j.setCaption(i.getCaption());
        return insertImage(j);
    }

    private static Boolean insertImage(
        blueharvest.geocaching.webservices.image.Image i) {
        try {
            return getServicePort().insertImage(i, getServiceCredentials());
        } catch (java.lang.Exception ex) { // java.net.ConnectException
            java.util.logging.Logger.getLogger(
                new Object().getClass().getName()).log(
                    java.util.logging.Level.SEVERE, null, ex);
            return false;
        }
    }

    /**
     * <h3>update image through the web services</h3>
     *
     * @param i (i)mage
     * @return true/false whether or not the database image was updated
     * @since 2015-10-27
     */
    public static final boolean update(image i) {
        blueharvest.geocaching.webservices.image.Image j
            = new blueharvest.geocaching.webservices.image.Image();
        j.setId(i.getId().toString());
        j.setUri(i.getUri().toString());
        j.setCaption(i.getCaption());
        return updateImage(j);
    }

    private static Boolean updateImage(
        blueharvest.geocaching.webservices.image.Image i) {
        try {
            return getServicePort().updateImage(i, getServiceCredentials());
        } catch (java.lang.Exception ex) { // java.net.ConnectException
            java.util.logging.Logger.getLogger(
                new Object().getClass().getName()).log(
                    java.util.logging.Level.SEVERE, null, ex);
            return false;
        }
    }

    /**
     * <h3>delete an image</h3>
     *
     * @param id unique identifier
     * @return true/false whether or not the image was deleted
     * @since 2015-10-27
     */
    public static final boolean delete(java.util.UUID id) {
        return deleteImage(id.toString());
    }

    private static Boolean deleteImage(java.lang.String id) {
        try {
            return getServicePort().deleteImage(id, getServiceCredentials());
        } catch (java.lang.Exception ex) { // java.net.ConnectException
            java.util.logging.Logger.getLogger(
                new Object().getClass().getName()).log(
                    java.util.logging.Level.SEVERE, null, ex);
            return false;
        }
    }
    
    /**
     * <h3>uploads an image</h3>
     * uploads an image to Amazon Web Services (AWS)
     * Simple Storage Service (S3)
     * @return true/false whether the image was uploaded
     * @see
     * <a href="http://docs.aws.amazon.com/AmazonS3/latest/dev/UploadObjSingleOpJava.html">
     * Location.java</a>
     */
    public static boolean upload() {
        
        return true;
    }

}
