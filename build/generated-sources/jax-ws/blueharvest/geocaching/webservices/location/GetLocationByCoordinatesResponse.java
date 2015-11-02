
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
 *         &lt;element name="GetLocationByCoordinatesResult" type="{http://blueharvestgeo.com/webservices/}Location" minOccurs="0"/>
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
    "getLocationByCoordinatesResult"
})
@XmlRootElement(name = "GetLocationByCoordinatesResponse")
public class GetLocationByCoordinatesResponse {

    @XmlElement(name = "GetLocationByCoordinatesResult")
    protected Location getLocationByCoordinatesResult;

    /**
     * Gets the value of the getLocationByCoordinatesResult property.
     * 
     * @return
     *     possible object is
     *     {@link Location }
     *     
     */
    public Location getGetLocationByCoordinatesResult() {
        return getLocationByCoordinatesResult;
    }

    /**
     * Sets the value of the getLocationByCoordinatesResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link Location }
     *     
     */
    public void setGetLocationByCoordinatesResult(Location value) {
        this.getLocationByCoordinatesResult = value;
    }

}
