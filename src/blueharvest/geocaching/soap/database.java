/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package blueharvest.geocaching.soap;

/**
 * example class to demonstrate interop with ksoap, jdk, and adk
 *
 * @author jmb
 * @since 2015-11-06
 * @warning not fully compatible outside an Android Environment
 */
public class database {

    private final static String ns = "http://blueharvestgeo.com/webservices/";
    private final static String url
        = "https://blueharvestgeo.com/WebServices/DatabaseService.asmx";
    private final static String action
        = "http://blueharvestgeo.com/webservices/DeleteAll";
    private final static String op = "DeleteAll";

    public static boolean delete() {

        org.ksoap2.serialization.SoapObject request
            = new org.ksoap2.serialization.SoapObject(ns, op);
        //org.ksoap2.serialization.PropertyInfo pi =
        //    new org.ksoap2.serialization.PropertyInfo();
        org.ksoap2.serialization.SoapSerializationEnvelope envelope
            = new org.ksoap2.serialization.SoapSerializationEnvelope(
                org.ksoap2.SoapEnvelope.VER11);
        envelope.dotNet = true;

        org.kxml2.kdom.Element h
            = new org.kxml2.kdom.Element().createElement(ns, "ServiceCredentials");
        org.kxml2.kdom.Element u
            = new org.kxml2.kdom.Element().createElement(ns, "username");
        u.addChild(org.kxml2.kdom.Node.TEXT,
            new blueharvest.geocaching.resources.properties().getProperty("wsu"));
        h.addChild(org.kxml2.kdom.Node.ELEMENT, u);
        org.kxml2.kdom.Element p
            = new org.kxml2.kdom.Element().createElement(ns, "password");
        p.addChild(org.kxml2.kdom.Node.TEXT,
            new blueharvest.geocaching.resources.properties().getProperty("wsp"));
        h.addChild(org.kxml2.kdom.Node.ELEMENT, p);
        envelope.headerOut = new org.kxml2.kdom.Element[1];
        envelope.headerOut[0] = h;

        envelope.setOutputSoapObject(request);

        org.ksoap2.transport.HttpTransportSE transport
            = new org.ksoap2.transport.HttpTransportSE(url);
        try {
            transport.call(action, envelope);
            org.ksoap2.serialization.SoapPrimitive response
                = (org.ksoap2.serialization.SoapPrimitive) envelope.getResponse();
            //System.out.println(response.toString()); // payload
            return (boolean) response.getValue();
        } catch (java.io.IOException ex) {
            java.util.logging.Logger.getLogger(
                new Object().getClass().getName()).log(
                    java.util.logging.Level.SEVERE, null, ex);
            return false;
        } catch (org.xmlpull.v1.XmlPullParserException ex) {
            java.util.logging.Logger.getLogger(
                new Object().getClass().getName()).log(
                    java.util.logging.Level.SEVERE, null, ex);
            return false;
        }
    }
    
}
