
package com.sun.mdm.index.webservice;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for recalculateMatchResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="recalculateMatchResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="return" type="{http://webservice.index.mdm.sun.com/}matchColResult" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "recalculateMatchResponse", propOrder = {
    "_return"
})
@XmlRootElement(name = "recalculateMatchResponse")
public class RecalculateMatchResponse
    implements Serializable
{

    private final static long serialVersionUID = 12343L;
    @XmlElement(name = "return")
    protected MatchColResult _return;

    /**
     * Gets the value of the return property.
     * 
     * @return
     *     possible object is
     *     {@link MatchColResult }
     *     
     */
    public MatchColResult getReturn() {
        return _return;
    }

    /**
     * Sets the value of the return property.
     * 
     * @param value
     *     allowed object is
     *     {@link MatchColResult }
     *     
     */
    public void setReturn(MatchColResult value) {
        this._return = value;
    }

    public boolean isSetReturn() {
        return (this._return!= null);
    }

}
