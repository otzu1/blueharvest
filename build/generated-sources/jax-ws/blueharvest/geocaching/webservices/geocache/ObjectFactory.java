
package blueharvest.geocaching.webservices.geocache;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the blueharvest.geocaching.webservices.geocache package. 
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
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: blueharvest.geocaching.webservices.geocache
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link InsertGeocacheWithLocationResponse }
     * 
     */
    public InsertGeocacheWithLocationResponse createInsertGeocacheWithLocationResponse() {
        return new InsertGeocacheWithLocationResponse();
    }

    /**
     * Create an instance of {@link ServiceCredentials }
     * 
     */
    public ServiceCredentials createServiceCredentials() {
        return new ServiceCredentials();
    }

    /**
     * Create an instance of {@link InsertGeocacheWithLocation }
     * 
     */
    public InsertGeocacheWithLocation createInsertGeocacheWithLocation() {
        return new InsertGeocacheWithLocation();
    }

    /**
     * Create an instance of {@link Geocache }
     * 
     */
    public Geocache createGeocache() {
        return new Geocache();
    }

    /**
     * Create an instance of {@link GetGeocachesWithinDistance }
     * 
     */
    public GetGeocachesWithinDistance createGetGeocachesWithinDistance() {
        return new GetGeocachesWithinDistance();
    }

    /**
     * Create an instance of {@link GetGeocachesWithinDistanceResponse }
     * 
     */
    public GetGeocachesWithinDistanceResponse createGetGeocachesWithinDistanceResponse() {
        return new GetGeocachesWithinDistanceResponse();
    }

    /**
     * Create an instance of {@link ArrayOfAnyType }
     * 
     */
    public ArrayOfAnyType createArrayOfAnyType() {
        return new ArrayOfAnyType();
    }

    /**
     * Create an instance of {@link Logbook }
     * 
     */
    public Logbook createLogbook() {
        return new Logbook();
    }

    /**
     * Create an instance of {@link User }
     * 
     */
    public User createUser() {
        return new User();
    }

    /**
     * Create an instance of {@link Location }
     * 
     */
    public Location createLocation() {
        return new Location();
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
