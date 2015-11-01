
package blueharvest.geocaching.webservices.location;

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
 *         &lt;element name="GetLocationResult" type="{http://blueharvestgeo.com/webservices/}Location" minOccurs="0"/>
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
    "getLocationResult"
})
@XmlRootElement(name = "GetLocationResponse")
public class GetLocationResponse {

    @XmlElement(name = "GetLocationResult")
    protected Location getLocationResult;

    /**
     * Gets the value of the getLocationResult property.
     * 
     * @return
     *     possible object is
     *     {@link Location }
     *     
     */
    public Location getGetLocationResult() {
        return getLocationResult;
    }

    /**
     * Sets the value of the getLocationResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link Location }
     *     
     */
    public void setGetLocationResult(Location value) {
        this.getLocationResult = value;
    }

}
