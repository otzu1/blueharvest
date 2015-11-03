
package blueharvest.geocaching.webservices.geocache;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for Geocache complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Geocache">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="id" type="{http://microsoft.com/wsdl/types/}guid"/>
 *         &lt;element name="anniversary" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="description" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="difficulty" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="terrain" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="size" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="status" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="type" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="userid" type="{http://microsoft.com/wsdl/types/}guid"/>
 *         &lt;element name="user" type="{http://blueharvestgeo.com/webservices/}User" minOccurs="0"/>
 *         &lt;element name="locationid" type="{http://microsoft.com/wsdl/types/}guid"/>
 *         &lt;element name="location" type="{http://blueharvestgeo.com/webservices/}Location" minOccurs="0"/>
 *         &lt;element name="logbookid" type="{http://microsoft.com/wsdl/types/}guid"/>
 *         &lt;element name="logbook" type="{http://blueharvestgeo.com/webservices/}Logbook" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Geocache", propOrder = {
    "id",
    "anniversary",
    "name",
    "description",
    "difficulty",
    "terrain",
    "size",
    "status",
    "type",
    "userid",
    "user",
    "locationid",
    "location",
    "logbookid",
    "logbook"
})
public class Geocache {

    @XmlElement(required = true)
    protected String id;
    @XmlElement(required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar anniversary;
    protected String name;
    protected String description;
    protected int difficulty;
    protected int terrain;
    protected int size;
    protected int status;
    protected int type;
    @XmlElement(required = true)
    protected String userid;
    protected User user;
    @XmlElement(required = true)
    protected String locationid;
    protected Location location;
    @XmlElement(required = true)
    protected String logbookid;
    protected Logbook logbook;

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setId(String value) {
        this.id = value;
    }

    /**
     * Gets the value of the anniversary property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getAnniversary() {
        return anniversary;
    }

    /**
     * Sets the value of the anniversary property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setAnniversary(XMLGregorianCalendar value) {
        this.anniversary = value;
    }

    /**
     * Gets the value of the name property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setName(String value) {
        this.name = value;
    }

    /**
     * Gets the value of the description property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescription() {
        return description;
    }

    /**
     * Sets the value of the description property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescription(String value) {
        this.description = value;
    }

    /**
     * Gets the value of the difficulty property.
     * 
     */
    public int getDifficulty() {
        return difficulty;
    }

    /**
     * Sets the value of the difficulty property.
     * 
     */
    public void setDifficulty(int value) {
        this.difficulty = value;
    }

    /**
     * Gets the value of the terrain property.
     * 
     */
    public int getTerrain() {
        return terrain;
    }

    /**
     * Sets the value of the terrain property.
     * 
     */
    public void setTerrain(int value) {
        this.terrain = value;
    }

    /**
     * Gets the value of the size property.
     * 
     */
    public int getSize() {
        return size;
    }

    /**
     * Sets the value of the size property.
     * 
     */
    public void setSize(int value) {
        this.size = value;
    }

    /**
     * Gets the value of the status property.
     * 
     */
    public int getStatus() {
        return status;
    }

    /**
     * Sets the value of the status property.
     * 
     */
    public void setStatus(int value) {
        this.status = value;
    }

    /**
     * Gets the value of the type property.
     * 
     */
    public int getType() {
        return type;
    }

    /**
     * Sets the value of the type property.
     * 
     */
    public void setType(int value) {
        this.type = value;
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
     * Gets the value of the user property.
     * 
     * @return
     *     possible object is
     *     {@link User }
     *     
     */
    public User getUser() {
        return user;
    }

    /**
     * Sets the value of the user property.
     * 
     * @param value
     *     allowed object is
     *     {@link User }
     *     
     */
    public void setUser(User value) {
        this.user = value;
    }

    /**
     * Gets the value of the locationid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLocationid() {
        return locationid;
    }

    /**
     * Sets the value of the locationid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLocationid(String value) {
        this.locationid = value;
    }

    /**
     * Gets the value of the location property.
     * 
     * @return
     *     possible object is
     *     {@link Location }
     *     
     */
    public Location getLocation() {
        return location;
    }

    /**
     * Sets the value of the location property.
     * 
     * @param value
     *     allowed object is
     *     {@link Location }
     *     
     */
    public void setLocation(Location value) {
        this.location = value;
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

    /**
     * Gets the value of the logbook property.
     * 
     * @return
     *     possible object is
     *     {@link Logbook }
     *     
     */
    public Logbook getLogbook() {
        return logbook;
    }

    /**
     * Sets the value of the logbook property.
     * 
     * @param value
     *     allowed object is
     *     {@link Logbook }
     *     
     */
    public void setLogbook(Logbook value) {
        this.logbook = value;
    }

}
