
package blueharvest.geocaching.webservices.user;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.6-1b01 
 * Generated source version: 2.2
 * 
 */
@WebService(name = "UserServiceSoap", targetNamespace = "http://blueharvest.com/webservices/")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface UserServiceSoap {


    /**
     * 
     * @param serviceCredentials
     * @param email
     * @return
     *     returns blueharvest.geocaching.webservices.user.User
     */
    @WebMethod(operationName = "GetUser", action = "http://blueharvest.com/webservices/GetUser")
    @WebResult(name = "GetUserResult", targetNamespace = "http://blueharvest.com/webservices/")
    @RequestWrapper(localName = "GetUser", targetNamespace = "http://blueharvest.com/webservices/", className = "blueharvest.geocaching.webservices.user.GetUser")
    @ResponseWrapper(localName = "GetUserResponse", targetNamespace = "http://blueharvest.com/webservices/", className = "blueharvest.geocaching.webservices.user.GetUserResponse")
    public User getUser(
        @WebParam(name = "email", targetNamespace = "http://blueharvest.com/webservices/")
        String email,
        @WebParam(name = "ServiceCredentials", targetNamespace = "http://blueharvest.com/webservices/", header = true, partName = "ServiceCredentials")
        ServiceCredentials serviceCredentials);

    /**
     * 
     * @param u
     * @param serviceCredentials
     * @return
     *     returns java.lang.Boolean
     */
    @WebMethod(operationName = "InsertUser", action = "http://blueharvest.com/webservices/InsertUser")
    @WebResult(name = "InsertUserResult", targetNamespace = "http://blueharvest.com/webservices/")
    @RequestWrapper(localName = "InsertUser", targetNamespace = "http://blueharvest.com/webservices/", className = "blueharvest.geocaching.webservices.user.InsertUser")
    @ResponseWrapper(localName = "InsertUserResponse", targetNamespace = "http://blueharvest.com/webservices/", className = "blueharvest.geocaching.webservices.user.InsertUserResponse")
    public Boolean insertUser(
        @WebParam(name = "u", targetNamespace = "http://blueharvest.com/webservices/")
        User u,
        @WebParam(name = "ServiceCredentials", targetNamespace = "http://blueharvest.com/webservices/", header = true, partName = "ServiceCredentials")
        ServiceCredentials serviceCredentials);

    /**
     * 
     * @param password
     * @param serviceCredentials
     * @param email
     * @return
     *     returns java.lang.Boolean
     */
    @WebMethod(operationName = "AuthUser", action = "http://blueharvest.com/webservices/AuthUser")
    @WebResult(name = "AuthUserResult", targetNamespace = "http://blueharvest.com/webservices/")
    @RequestWrapper(localName = "AuthUser", targetNamespace = "http://blueharvest.com/webservices/", className = "blueharvest.geocaching.webservices.user.AuthUser")
    @ResponseWrapper(localName = "AuthUserResponse", targetNamespace = "http://blueharvest.com/webservices/", className = "blueharvest.geocaching.webservices.user.AuthUserResponse")
    public Boolean authUser(
        @WebParam(name = "email", targetNamespace = "http://blueharvest.com/webservices/")
        String email,
        @WebParam(name = "password", targetNamespace = "http://blueharvest.com/webservices/")
        String password,
        @WebParam(name = "ServiceCredentials", targetNamespace = "http://blueharvest.com/webservices/", header = true, partName = "ServiceCredentials")
        ServiceCredentials serviceCredentials);

}