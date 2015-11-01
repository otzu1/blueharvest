
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
 *         &lt;element name="InsertLogbookEntryByStringsResult" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
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
    "insertLogbookEntryByStringsResult"
})
@XmlRootElement(name = "InsertLogbookEntryByStringsResponse")
public class InsertLogbookEntryByStringsResponse {

    @XmlElement(name = "InsertLogbookEntryByStringsResult", required = true, type = Boolean.class, nillable = true)
    protected Boolean insertLogbookEntryByStringsResult;

    /**
     * Gets the value of the insertLogbookEntryByStringsResult property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isInsertLogbookEntryByStringsResult() {
        return insertLogbookEntryByStringsResult;
    }

    /**
     * Sets the value of the insertLogbookEntryByStringsResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setInsertLogbookEntryByStringsResult(Boolean value) {
        this.insertLogbookEntryByStringsResult = value;
    }

}
