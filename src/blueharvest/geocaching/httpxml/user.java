/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package blueharvest.geocaching.httpxml;

/**
 *
 * @author jmb
 * @since 2015-10-17
 * @deprecated no replacement
 */
public class user {

    private final static String url = "";

    /**
     * <h3>gets a user object</h3>
     *
     * @param email email of the user
     * @return user object instantiated from a http xml response. salt has since
     * been added and set as a random uuid here.
     */
    public static blueharvest.geocaching.objects.user get(String email) {
        try {
            java.net.HttpURLConnection con
                = (java.net.HttpURLConnection) new java.net.URL(
                    url + "?email=" + email).openConnection();
            java.util.Properties p = new java.util.Properties();
            p.load(new Object() {
            }.getClass().getResourceAsStream(
                "/com/blueharvest/geocaching/resources/config.properties"));
            con.setRequestProperty("Authorization", "Basic "
                + p.getProperty("wsu") + ":" + p.getProperty("wsp"));
            // http://www.rgagnon.com/javadetails/java-0573.html
            javax.xml.parsers.DocumentBuilderFactory dbf
                = javax.xml.parsers.DocumentBuilderFactory.newInstance();
            javax.xml.parsers.DocumentBuilder db = dbf.newDocumentBuilder();
            org.w3c.dom.Document doc = db.parse(con.getInputStream());
            return new blueharvest.geocaching.objects.user(
                java.util.UUID.fromString(
                    doc.getElementsByTagName("id").item(0).getTextContent()),
                null, // todo: anniversary
                doc.getElementsByTagName("username").item(0).getTextContent(),
                doc.getElementsByTagName("password").item(0).getTextContent(),
                java.util.UUID.randomUUID(),
                email, "True".equals(doc.getElementsByTagName("active").item(0)
                    .getTextContent()), true, null, null); // todo: locked
        } catch (java.net.MalformedURLException ex) {
            java.util.logging.Logger.getLogger(
                new Object().getClass().getName()).log(
                    java.util.logging.Level.SEVERE, null, ex);
        } catch (java.io.IOException ex) {
            java.util.logging.Logger.getLogger(
                new Object().getClass().getName()).log(
                    java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.xml.parsers.ParserConfigurationException ex) {
            java.util.logging.Logger.getLogger(
                new Object().getClass().getName()).log(
                    java.util.logging.Level.SEVERE, null, ex);
        } catch (org.xml.sax.SAXException ex) { // premature end of file
            java.util.logging.Logger.getLogger(
                new Object().getClass().getName()).log(
                    java.util.logging.Level.SEVERE, null, ex);
        }
        return null;
    }

}
