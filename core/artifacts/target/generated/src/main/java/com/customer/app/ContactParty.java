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
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * Contact Party 
 * 
 * <p>Java class for ContactParty complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ContactParty"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="contactcategory" type="{http://www.davita.com}Code" minOccurs="0"/&gt;
 *         &lt;element name="contactreason" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="isprimarycontact" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="effectivedaterange" type="{http://www.davita.com}TimeInterval" minOccurs="0"/&gt;
 *         &lt;element name="enddate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="Person" type="{http://www.davita.com}Person" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ContactParty", propOrder = {
    "contactcategory",
    "contactreason",
    "isprimarycontact",
    "effectivedaterange",
    "enddate",
    "person"
})
@XmlRootElement(name = "ContactParty")
public class ContactParty
    implements Serializable
{

    private final static long serialVersionUID = 12343L;
    protected Code contactcategory;
    protected String contactreason;
    protected Boolean isprimarycontact;
    protected TimeInterval effectivedaterange;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar enddate;
    @XmlElement(name = "Person")
    protected Person person;

    /**
     * Gets the value of the contactcategory property.
     * 
     * @return
     *     possible object is
     *     {@link Code }
     *     
     */
    public Code getContactcategory() {
        return contactcategory;
    }

    /**
     * Sets the value of the contactcategory property.
     * 
     * @param value
     *     allowed object is
     *     {@link Code }
     *     
     */
    public void setContactcategory(Code value) {
        this.contactcategory = value;
    }

    /**
     * Gets the value of the contactreason property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getContactreason() {
        return contactreason;
    }

    /**
     * Sets the value of the contactreason property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setContactreason(String value) {
        this.contactreason = value;
    }

    /**
     * Gets the value of the isprimarycontact property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsprimarycontact() {
        return isprimarycontact;
    }

    /**
     * Sets the value of the isprimarycontact property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsprimarycontact(Boolean value) {
        this.isprimarycontact = value;
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
     * Gets the value of the enddate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getEnddate() {
        return enddate;
    }

    /**
     * Sets the value of the enddate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setEnddate(XMLGregorianCalendar value) {
        this.enddate = value;
    }

    /**
     * Gets the value of the person property.
     * 
     * @return
     *     possible object is
     *     {@link Person }
     *     
     */
    public Person getPerson() {
        return person;
    }

    /**
     * Sets the value of the person property.
     * 
     * @param value
     *     allowed object is
     *     {@link Person }
     *     
     */
    public void setPerson(Person value) {
        this.person = value;
    }

}
