//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2016.08.11 at 01:51:42 PM MSK 
//


package org.smpte_ra.reg._2003._2012;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import org.smpte_ra.reg._395._2014._13._1.aaf.MetaDictionary;


/**
 * <p>Java class for MetaDictionaryStrongReference complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="MetaDictionaryStrongReference">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;choice>
 *         &lt;element ref="{http://www.smpte-ra.org/reg/395/2014/13/1/aaf}MetaDictionary"/>
 *       &lt;/choice>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MetaDictionaryStrongReference", propOrder = {
    "metaDictionary"
})
public class MetaDictionaryStrongReference {

    @XmlElement(name = "MetaDictionary", namespace = "http://www.smpte-ra.org/reg/395/2014/13/1/aaf")
    protected MetaDictionary metaDictionary;

    /**
     * Gets the value of the metaDictionary property.
     * 
     * @return
     *     possible object is
     *     {@link MetaDictionary }
     *     
     */
    public MetaDictionary getMetaDictionary() {
        return metaDictionary;
    }

    /**
     * Sets the value of the metaDictionary property.
     * 
     * @param value
     *     allowed object is
     *     {@link MetaDictionary }
     *     
     */
    public void setMetaDictionary(MetaDictionary value) {
        this.metaDictionary = value;
    }

}
