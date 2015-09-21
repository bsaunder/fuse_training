//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2015.09.21 at 10:49:12 AM EDT 
//


package com.customer.app;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Contact Mechanism
 * 
 *                 Phone
 *                 Fax
 *                 email
 *                 Website 
 * 
 * <p>Java class for ContactMechanism complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ContactMechanism"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="contactmechanismtype" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="effectivedaterange" type="{http://www.davita.com}TimeInterval" minOccurs="0"/&gt;
 *         &lt;element name="istextmessageenabled" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="universalrecordid" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ContactMechanism", propOrder = {
    "contactmechanismtype",
    "effectivedaterange",
    "istextmessageenabled",
    "universalrecordid"
})
@XmlRootElement(name = "ContactMechanism")
public class ContactMechanism
    implements Serializable
{

    private final static long serialVersionUID = 12343L;
    protected String contactmechanismtype;
    protected TimeInterval effectivedaterange;
    protected Boolean istextmessageenabled;
    protected String universalrecordid;

    /**
     * Gets the value of the contactmechanismtype property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getContactmechanismtype() {
        return contactmechanismtype;
    }

    /**
     * Sets the value of the contactmechanismtype property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setContactmechanismtype(String value) {
        this.contactmechanismtype = value;
    }

    /**
     * Gets the value of the effectivedaterange property.
     * 
     * @return
     *     possible object is
     *     {@link TimeInterval }
     *     
     */
    public TimeInterval getEffectivedaterange() {
        return effectivedaterange;
    }

    /**
     * Sets the value of the effectivedaterange property.
     * 
     * @param value
     *     allowed object is
     *     {@link TimeInterval }
     *     
     */
    public void setEffectivedaterange(TimeInterval value) {
        this.effectivedaterange = value;
    }

    /**
     * Gets the value of the istextmessageenabled property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIstextmessageenabled() {
        return istextmessageenabled;
    }

    /**
     * Sets the value of the istextmessageenabled property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIstextmessageenabled(Boolean value) {
        this.istextmessageenabled = value;
    }

    /**
     * Gets the value of the universalrecordid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUniversalrecordid() {
        return universalrecordid;
    }

    /**
     * Sets the value of the universalrecordid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUniversalrecordid(String value) {
        this.universalrecordid = value;
    }

}
