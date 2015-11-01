
package blueharvest.geocaching.webservices.logbook;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the blueharvest.geocaching.webservices.logbook package. 
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
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: blueharvest.geocaching.webservices.logbook
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link InsertLogbook }
     * 
     */
    public InsertLogbook createInsertLogbook() {
        return new InsertLogbook();
    }

    /**
     * Create an instance of {@link ServiceCredentials }
     * 
     */
    public ServiceCredentials createServiceCredentials() {
        return new ServiceCredentials();
    }

    /**
     * Create an instance of {@link GetLogbook }
     * 
     */
    public GetLogbook createGetLogbook() {
        return new GetLogbook();
    }

    /**
     * Create an instance of {@link InsertLogbookResponse }
     * 
     */
    public InsertLogbookResponse createInsertLogbookResponse() {
        return new InsertLogbookResponse();
    }

    /**
     * Create an instance of {@link InsertLogbookEntryResponse }
     * 
     */
    public InsertLogbookEntryResponse createInsertLogbookEntryResponse() {
        return new InsertLogbookEntryResponse();
    }

    /**
     * Create an instance of {@link InsertLogbookEntryByStrings }
     * 
     */
    public InsertLogbookEntryByStrings createInsertLogbookEntryByStrings() {
        return new InsertLogbookEntryByStrings();
    }

    /**
     * Create an instance of {@link InsertLogbookEntryByStringsResponse }
     * 
     */
    public InsertLogbookEntryByStringsResponse createInsertLogbookEntryByStringsResponse() {
        return new InsertLogbookEntryByStringsResponse();
    }

    /**
     * Create an instance of {@link InsertLogbookEntry }
     * 
     */
    public InsertLogbookEntry createInsertLogbookEntry() {
        return new InsertLogbookEntry();
    }

    /**
     * Create an instance of {@link LogbookEntry }
     * 
     */
    public LogbookEntry createLogbookEntry() {
        return new LogbookEntry();
    }

    /**
     * Create an instance of {@link GetLogbookResponse }
     * 
     */
    public GetLogbookResponse createGetLogbookResponse() {
        return new GetLogbookResponse();
    }

    /**
     * Create an instance of {@link ArrayOfAnyType }
     * 
     */
    public ArrayOfAnyType createArrayOfAnyType() {
        return new ArrayOfAnyType();
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
