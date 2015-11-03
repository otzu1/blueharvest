
package blueharvest.geocaching.webservices.geocache;

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
 *         &lt;element name="GetGeocachesWithinDistanceResult" type="{http://blueharvestgeo.com/webservices/}ArrayOfAnyType" minOccurs="0"/>
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
    "getGeocachesWithinDistanceResult"
})
@XmlRootElement(name = "GetGeocachesWithinDistanceResponse")
public class GetGeocachesWithinDistanceResponse {

    @XmlElement(name = "GetGeocachesWithinDistanceResult")
    protected ArrayOfAnyType getGeocachesWithinDistanceResult;

    /**
     * Gets the value of the getGeocachesWithinDistanceResult property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfAnyType }
     *     
     */
    public ArrayOfAnyType getGetGeocachesWithinDistanceResult() {
        return getGeocachesWithinDistanceResult;
    }

    /**
     * Sets the value of the getGeocachesWithinDistanceResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfAnyType }
     *     
     */
    public void setGetGeocachesWithinDistanceResult(ArrayOfAnyType value) {
        this.getGeocachesWithinDistanceResult = value;
    }

}
