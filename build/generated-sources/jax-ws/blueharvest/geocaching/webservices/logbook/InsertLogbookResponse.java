
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
 *         &lt;element name="InsertLogbookResult" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
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
    "insertLogbookResult"
})
@XmlRootElement(name = "InsertLogbookResponse")
public class InsertLogbookResponse {

    @XmlElement(name = "InsertLogbookResult", required = true, type = Boolean.class, nillable = true)
    protected Boolean insertLogbookResult;

    /**
     * Gets the value of the insertLogbookResult property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isInsertLogbookResult() {
        return insertLogbookResult;
    }

    /**
     * Sets the value of the insertLogbookResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setInsertLogbookResult(Boolean value) {
        this.insertLogbookResult = value;
    }

}
