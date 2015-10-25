
package blueharvest.geocaching.webservices.image;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the blueharvest.geocaching.webservices.image package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _ServiceCredentials_QNAME = new QName("http://blueharvestgeo.com/webservices/", "ServiceCredentials");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: blueharvest.geocaching.webservices.image
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link UpdateImage }
     * 
     */
    public UpdateImage createUpdateImage() {
        return new UpdateImage();
    }

    /**
     * Create an instance of {@link Image }
     * 
     */
    public Image createImage() {
        return new Image();
    }

    /**
     * Create an instance of {@link DeleteImage }
     * 
     */
    public DeleteImage createDeleteImage() {
        return new DeleteImage();
    }

    /**
     * Create an instance of {@link ServiceCredentials }
     * 
     */
    public ServiceCredentials createServiceCredentials() {
        return new ServiceCredentials();
    }

    /**
     * Create an instance of {@link UpdateImageResponse }
     * 
     */
    public UpdateImageResponse createUpdateImageResponse() {
        return new UpdateImageResponse();
    }

    /**
     * Create an instance of {@link GetImage }
     * 
     */
    public GetImage createGetImage() {
        return new GetImage();
    }

    /**
     * Create an instance of {@link InsertImage }
     * 
     */
    public InsertImage createInsertImage() {
        return new InsertImage();
    }

    /**
     * Create an instance of {@link InsertImageResponse }
     * 
     */
    public InsertImageResponse createInsertImageResponse() {
        return new InsertImageResponse();
    }

    /**
     * Create an instance of {@link DeleteImageResponse }
     * 
     */
    public DeleteImageResponse createDeleteImageResponse() {
        return new DeleteImageResponse();
    }

    /**
     * Create an instance of {@link GetImageResponse }
     * 
     */
    public GetImageResponse createGetImageResponse() {
        return new GetImageResponse();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ServiceCredentials }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://blueharvestgeo.com/webservices/", name = "ServiceCredentials")
    public JAXBElement<ServiceCredentials> createServiceCredentials(ServiceCredentials value) {
        return new JAXBElement<ServiceCredentials>(_ServiceCredentials_QNAME, ServiceCredentials.class, null, value);
    }

}
