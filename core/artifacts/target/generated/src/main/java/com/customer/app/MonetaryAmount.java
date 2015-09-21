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
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * "A quantity expressing an amount of money in some currency. While the monetary amount is a single kind of quantity (money) the exchange rates between the different units are variable. This is the principle difference between PQ and MO, and the reason why currency units are not physical units." - HL7 V3
 * 
 * <p>Java class for MonetaryAmount complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="MonetaryAmount"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="currency" type="{http://www.davita.com}Code" minOccurs="0"/&gt;
 *         &lt;element name="value" type="{http://www.davita.com}Real" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MonetaryAmount", propOrder = {
    "currency",
    "value"
})
@XmlRootElement(name = "MonetaryAmount")
public class MonetaryAmount
    implements Serializable
{

    private final static long serialVersionUID = 12343L;
    protected Code currency;
    protected Real value;

    /**
     * Gets the value of the currency property.
     * 
     * @return
     *     possible object is
     *     {@link Code }
     *     
     */
    public Code getCurrency() {
        return currency;
    }

    /**
     * Sets the value of the currency property.
     * 
     * @param value
     *     allowed object is
     *     {@link Code }
     *     
     */
    public void setCurrency(Code value) {
        this.currency = value;
    }

    /**
     * Gets the value of the value property.
     * 
     * @return
     *     possible object is
     *     {@link Real }
     *     
     */
    public Real getValue() {
        return value;
    }

    /**
     * Sets the value of the value property.
     * 
     * @param value
     *     allowed object is
     *     {@link Real }
     *     
     */
    public void setValue(Real value) {
        this.value = value;
    }

}
