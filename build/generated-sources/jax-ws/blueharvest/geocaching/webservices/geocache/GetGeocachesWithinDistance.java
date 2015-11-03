
package blueharvest.geocaching.webservices.geocache;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
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
 *         &lt;element name="minlatrad" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="maxlatrad" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="minlngrad" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="maxlngrad" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="latrad" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="lngrad" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="distance" type="{http://www.w3.org/2001/XMLSchema}double"/>
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
    "minlatrad",
    "maxlatrad",
    "minlngrad",
    "maxlngrad",
    "latrad",
    "lngrad",
    "distance"
})
@XmlRootElement(name = "GetGeocachesWithinDistance")
public class GetGeocachesWithinDistance {

    protected double minlatrad;
    protected double maxlatrad;
    protected double minlngrad;
    protected double maxlngrad;
    protected double latrad;
    protected double lngrad;
    protected double distance;

    /**
     * Gets the value of the minlatrad property.
     * 
     */
    public double getMinlatrad() {
        return minlatrad;
    }

    /**
     * Sets the value of the minlatrad property.
     * 
     */
    public void setMinlatrad(double value) {
        this.minlatrad = value;
    }

    /**
     * Gets the value of the maxlatrad property.
     * 
     */
    public double getMaxlatrad() {
        return maxlatrad;
    }

    /**
     * Sets the value of the maxlatrad property.
     * 
     */
    public void setMaxlatrad(double value) {
        this.maxlatrad = value;
    }

    /**
     * Gets the value of the minlngrad property.
     * 
     */
    public double getMinlngrad() {
        return minlngrad;
    }

    /**
     * Sets the value of the minlngrad property.
     * 
     */
    public void setMinlngrad(double value) {
        this.minlngrad = value;
    }

    /**
     * Gets the value of the maxlngrad property.
     * 
     */
    public double getMaxlngrad() {
        return maxlngrad;
    }

    /**
     * Sets the value of the maxlngrad property.
     * 
     */
    public void setMaxlngrad(double value) {
        this.maxlngrad = value;
    }

    /**
     * Gets the value of the latrad property.
     * 
     */
    public double getLatrad() {
        return latrad;
    }

    /**
     * Sets the value of the latrad property.
     * 
     */
    public void setLatrad(double value) {
        this.latrad = value;
    }

    /**
     * Gets the value of the lngrad property.
     * 
     */
    public double getLngrad() {
        return lngrad;
    }

    /**
     * Sets the value of the lngrad property.
     * 
     */
    public void setLngrad(double value) {
        this.lngrad = value;
    }

    /**
     * Gets the value of the distance property.
     * 
     */
    public double getDistance() {
        return distance;
    }

    /**
     * Sets the value of the distance property.
     * 
     */
    public void setDistance(double value) {
        this.distance = value;
    }

}
