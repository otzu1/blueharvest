
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
 *         &lt;element name="GetLogbookResult" type="{http://blueharvestgeo.com/webservices/}ArrayOfAnyType" minOccurs="0"/>
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
    "getLogbookResult"
})
@XmlRootElement(name = "GetLogbookResponse")
public class GetLogbookResponse {

    @XmlElement(name = "GetLogbookResult")
    protected ArrayOfAnyType getLogbookResult;

    /**
     * Gets the value of the getLogbookResult property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfAnyType }
     *     
     */
    public ArrayOfAnyType getGetLogbookResult() {
        return getLogbookResult;
    }

    /**
     * Sets the value of the getLogbookResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfAnyType }
     *     
     */
    public void setGetLogbookResult(ArrayOfAnyType value) {
        this.getLogbookResult = value;
    }

}
