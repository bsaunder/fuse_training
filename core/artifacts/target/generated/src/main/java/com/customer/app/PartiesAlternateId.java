//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2015.09.21 at 11:26:27 AM EDT 
//


package com.customer.app;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Parties Alternate Ids 
 * 
 * <p>Java class for PartiesAlternateId complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PartiesAlternateId"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="alternateidsrole" type="{http://www.davita.com}Code" minOccurs="0"/&gt;
 *         &lt;element name="alternateid" type="{http://www.davita.com}ID" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PartiesAlternateId", propOrder = {
    "alternateidsrole",
    "alternateid"
})
@XmlRootElement(name = "PartiesAlternateId")
public class PartiesAlternateId
    implements Serializable
{

    private final static long serialVersionUID = 12343L;
    protected Code alternateidsrole;
    protected ID alternateid;

    /**
     * Gets the value of the alternateidsrole property.
     * 
     * @return
     *     possible object is
     *     {@link Code }
     *     
     */
    public Code getAlternateidsrole() {
        return alternateidsrole;
    }

    /**
     * Sets the value of the alternateidsrole property.
     * 
     * @param value
     *     allowed object is
     *     {@link Code }
     *     
     */
    public void setAlternateidsrole(Code value) {
        this.alternateidsrole = value;
    }

    /**
     * Gets the value of the alternateid property.
     * 
     * @return
     *     possible object is
     *     {@link ID }
     *     
     */
    public ID getAlternateid() {
        return alternateid;
    }

    /**
     * Sets the value of the alternateid property.
     * 
     * @param value
     *     allowed object is
     *     {@link ID }
     *     
     */
    public void setAlternateid(ID value) {
        this.alternateid = value;
    }

}
