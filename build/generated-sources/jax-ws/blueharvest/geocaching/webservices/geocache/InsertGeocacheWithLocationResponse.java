
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
 *         &lt;element name="InsertGeocacheWithLocationResult" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
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
    "insertGeocacheWithLocationResult"
})
@XmlRootElement(name = "InsertGeocacheWithLocationResponse")
public class InsertGeocacheWithLocationResponse {

    @XmlElement(name = "InsertGeocacheWithLocationResult", required = true, type = Boolean.class, nillable = true)
    protected Boolean insertGeocacheWithLocationResult;

    /**
     * Gets the value of the insertGeocacheWithLocationResult property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isInsertGeocacheWithLocationResult() {
        return insertGeocacheWithLocationResult;
    }

    /**
     * Sets the value of the insertGeocacheWithLocationResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setInsertGeocacheWithLocationResult(Boolean value) {
        this.insertGeocacheWithLocationResult = value;
    }

}
