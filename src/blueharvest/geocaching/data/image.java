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
     * @param id id
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
     * uploads an image to Amazon Web Services (AWS) Simple Storage Service (S3)
     * to a specific bucket in the 'images' directory; the filename is identical
     * to that of the file itself; only .jpg and .png permitted as per a policy
     * specified in the AWS Console
     *
     * @param f (f)ile to be uploaded
     * @return true/false whether the image was uploaded
     * @see
     * <a href="http://docs.aws.amazon.com/AmazonS3/latest/dev/UploadObjSingleOpJava.html">
     * Upload an Object Using the AWS SDK for Java</a>
     * @see <a href="http://javatutorial.net/java-s3-example">Java S3
     * Example</a>
     * @since 2015-11-01
     */
    public static boolean upload(java.io.File f) {
        try {
            java.util.Properties p = new java.util.Properties();
            p.load(new Object().getClass().getResourceAsStream(
                "/blueharvest/geocaching/resources/config.properties"));
            com.amazonaws.auth.AWSCredentials credentials
                = new com.amazonaws.auth.BasicAWSCredentials(
                    p.getProperty("awskid"), p.getProperty("awssk"));
            com.amazonaws.services.s3.AmazonS3 s3client
                = new com.amazonaws.services.s3.AmazonS3Client(credentials);
            s3client.putObject(new com.amazonaws.services.s3.model.PutObjectRequest(
                p.getProperty("s3bucket"), "images/" + f.getName(), f)
                .withCannedAcl(com.amazonaws.services.s3.model.CannedAccessControlList.PublicRead));
        } catch (com.amazonaws.services.s3.model.AmazonS3Exception ex) {
            // signature does not match (403), invalid access key (403),
            // access denied (403), no such bucket (404)
            java.util.logging.Logger.getLogger(
                new Object().getClass().getName()).log(
                    java.util.logging.Level.SEVERE, null, ex);
            return false;
        } catch (com.amazonaws.AmazonClientException ex) {
            // file path not found
            java.util.logging.Logger.getLogger(
                new Object().getClass().getName()).log(
                    java.util.logging.Level.SEVERE, null, ex);
            return false;
        } catch (java.io.IOException ex) { // config.properties
            java.util.logging.Logger.getLogger(
                new Object().getClass().getName()).log(
                    java.util.logging.Level.SEVERE, null, ex);
            return false;
        }
        return true;
    }

    public static java.io.File download(java.net.URI uri) {
        // todo
        throw new java.lang.UnsupportedOperationException("Not supported yet.");
        /*
         java.awt.image.BufferedImage img
         = javax.imageio.ImageIO.read(
         java.net.URI.create(
         "https://s3-us-west-2.amazonaws.com/blueharvest/"
         + "images/20151010_140004.jpg").toURL()
         .openConnection().getInputStream());
         */
    }

}
