//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2015.09.21 at 02:38:07 PM EDT 
//


package com.customer.app;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Citizenship - Citizenship is a legal status in a political institution such as a city or a state. The relationship between a citizen and the institution that confers this status is formal, and in contemporary liberal-democratic models includes both a set of rights that the citizen possesses by virtue of this relationship, and a set of obligations or duties that they owe to that institution and their fellow citizens in return.
 * 
 * <p>Java class for Citizenship complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Citizenship"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="effectivedaterange" type="{http://www.davita.com}TimeInterval" minOccurs="0"/&gt;
 *         &lt;element name="Country" type="{http://www.davita.com}Country" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Citizenship", propOrder = {
    "effectivedaterange",
    "country"
})
@XmlRootElement(name = "Citizenship")
public class Citizenship
    implements Serializable
{

    private final static long serialVersionUID = 12343L;
    protected TimeInterval effectivedaterange;
    @XmlElement(name = "Country")
    protected Country country;

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
     * Gets the value of the country property.
     * 
     * @return
     *     possible object is
     *     {@link Country }
     *     
     */
    public Country getCountry() {
        return country;
    }

    /**
     * Sets the value of the country property.
     * 
     * @param value
     *     allowed object is
     *     {@link Country }
     *     
     */
    public void setCountry(Country value) {
        this.country = value;
    }

}
