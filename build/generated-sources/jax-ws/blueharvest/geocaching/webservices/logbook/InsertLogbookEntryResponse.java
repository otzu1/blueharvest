
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
 *         &lt;element name="InsertLogbookEntryResult" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
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
    "insertLogbookEntryResult"
})
@XmlRootElement(name = "InsertLogbookEntryResponse")
public class InsertLogbookEntryResponse {

    @XmlElement(name = "InsertLogbookEntryResult", required = true, type = Boolean.class, nillable = true)
    protected Boolean insertLogbookEntryResult;

    /**
     * Gets the value of the insertLogbookEntryResult property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isInsertLogbookEntryResult() {
        return insertLogbookEntryResult;
    }

    /**
     * Sets the value of the insertLogbookEntryResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setInsertLogbookEntryResult(Boolean value) {
        this.insertLogbookEntryResult = value;
    }

}
