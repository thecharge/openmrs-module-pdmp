//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vJAXB 2.1.10 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2013.03.15 at 08:39:59 AM EDT 
//


package org.ncpdp.schema.script;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CoAgentType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CoAgentType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence minOccurs="0">
 *         &lt;element name="CoAgentID" type="{http://www.ncpdp.org/schema/SCRIPT}an..19" minOccurs="0"/>
 *         &lt;element name="CoAgentQualifier" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;pattern value="01|02|03|04|07|08|09|11|12|14|15|16|17|18|19|20|21|22|23|24|25|26|27|28|29|30|31|32|33|37|38|39|40|41|99"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CoAgentType", propOrder = {
    "coAgentID",
    "coAgentQualifier"
})
public class CoAgentType {

    @XmlElement(name = "CoAgentID")
    protected String coAgentID;
    @XmlElement(name = "CoAgentQualifier")
    protected String coAgentQualifier;

    /**
     * Gets the value of the coAgentID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCoAgentID() {
        return coAgentID;
    }

    /**
     * Sets the value of the coAgentID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCoAgentID(String value) {
        this.coAgentID = value;
    }

    /**
     * Gets the value of the coAgentQualifier property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCoAgentQualifier() {
        return coAgentQualifier;
    }

    /**
     * Sets the value of the coAgentQualifier property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCoAgentQualifier(String value) {
        this.coAgentQualifier = value;
    }

}
