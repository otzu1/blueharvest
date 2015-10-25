
package blueharvest.geocaching.webservices.user;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the blueharvest.geocaching.webservices.user package. 
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

    private final static QName _ServiceCredentials_QNAME = new QName("http://blueharvest.com/webservices/", "ServiceCredentials");
    private final static QName _User_QNAME = new QName("http://blueharvest.com/webservices/", "User");
    private final static QName _Boolean_QNAME = new QName("http://blueharvest.com/webservices/", "boolean");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: blueharvest.geocaching.webservices.user
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link ServiceCredentials }
     * 
     */
    public ServiceCredentials createServiceCredentials() {
        return new ServiceCredentials();
    }

    /**
     * Create an instance of {@link AuthUserResponse }
     * 
     */
    public AuthUserResponse createAuthUserResponse() {
        return new AuthUserResponse();
    }

    /**
     * Create an instance of {@link User }
     * 
     */
    public User createUser() {
        return new User();
    }

    /**
     * Create an instance of {@link GetUserResponse }
     * 
     */
    public GetUserResponse createGetUserResponse() {
        return new GetUserResponse();
    }

    /**
     * Create an instance of {@link InsertUserResponse }
     * 
     */
    public InsertUserResponse createInsertUserResponse() {
        return new InsertUserResponse();
    }

    /**
     * Create an instance of {@link AuthUser }
     * 
     */
    public AuthUser createAuthUser() {
        return new AuthUser();
    }

    /**
     * Create an instance of {@link InsertUser }
     * 
     */
    public InsertUser createInsertUser() {
        return new InsertUser();
    }

    /**
     * Create an instance of {@link GetUser }
     * 
     */
    public GetUser createGetUser() {
        return new GetUser();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ServiceCredentials }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://blueharvest.com/webservices/", name = "ServiceCredentials")
    public JAXBElement<ServiceCredentials> createServiceCredentials(ServiceCredentials value) {
        return new JAXBElement<ServiceCredentials>(_ServiceCredentials_QNAME, ServiceCredentials.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link User }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://blueharvest.com/webservices/", name = "User")
    public JAXBElement<User> createUser(User value) {
        return new JAXBElement<User>(_User_QNAME, User.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://blueharvest.com/webservices/", name = "boolean")
    public JAXBElement<Boolean> createBoolean(Boolean value) {
        return new JAXBElement<Boolean>(_Boolean_QNAME, Boolean.class, null, value);
    }

}
