
package blueharvest.geocaching.webservices.logbook;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="entry" type="{http://blueharvestgeo.com/webservices/}LogbookEntry" minOccurs="0"/>
 *         &lt;element name="userid" type="{http://microsoft.com/wsdl/types/}guid"/>
 *         &lt;element name="logbookid" type="{http://microsoft.com/wsdl/types/}guid"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "entry",
    "userid",
    "logbookid"
})
@XmlRootElement(name = "InsertLogbookEntry")
public class InsertLogbookEntry {

    protected LogbookEntry entry;
    @XmlElement(required = true)
    protected String userid;
    @XmlElement(required = true)
    protected String logbookid;

    /**
     * Gets the value of the entry property.
     * 
     * @return
     *     possible object is
     *     {@link LogbookEntry }
     *     
     */
    public LogbookEntry getEntry() {
        return entry;
    }

    /**
     * Sets the value of the entry property.
     * 
     * @param value
     *     allowed object is
     *     {@link LogbookEntry }
     *     
     */
    public void setEntry(LogbookEntry value) {
        this.entry = value;
    }

    /**
     * Gets the value of the userid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUserid() {
        return userid;
    }

    /**
     * Sets the value of the userid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUserid(String value) {
        this.userid = value;
    }

    /**
     * Gets the value of the logbookid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLogbookid() {
        return logbookid;
    }

    /**
     * Sets the value of the logbookid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLogbookid(String value) {
        this.logbookid = value;
    }

}
