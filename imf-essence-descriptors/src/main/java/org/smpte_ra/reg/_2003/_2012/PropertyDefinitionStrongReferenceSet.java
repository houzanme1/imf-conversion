//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2016.08.11 at 01:51:42 PM MSK 
//


package org.smpte_ra.reg._2003._2012;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import org.smpte_ra.reg._395._2014._13._1.aaf.PropertyDefinition;


/**
 * <p>Java class for PropertyDefinitionStrongReferenceSet complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PropertyDefinitionStrongReferenceSet">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;choice maxOccurs="unbounded" minOccurs="0">
 *         &lt;element ref="{http://www.smpte-ra.org/reg/395/2014/13/1/aaf}PropertyDefinition"/>
 *       &lt;/choice>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PropertyDefinitionStrongReferenceSet", propOrder = {
    "propertyDefinition"
})
public class PropertyDefinitionStrongReferenceSet {

    @XmlElement(name = "PropertyDefinition", namespace = "http://www.smpte-ra.org/reg/395/2014/13/1/aaf")
    protected List<PropertyDefinition> propertyDefinition;

    /**
     * Gets the value of the propertyDefinition property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the propertyDefinition property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPropertyDefinition().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PropertyDefinition }
     * 
     * 
     */
    public List<PropertyDefinition> getPropertyDefinition() {
        if (propertyDefinition == null) {
            propertyDefinition = new ArrayList<PropertyDefinition>();
        }
        return this.propertyDefinition;
    }

}
