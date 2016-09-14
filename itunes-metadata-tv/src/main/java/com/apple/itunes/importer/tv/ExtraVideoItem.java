//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.7-b41 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2016.09.01 at 06:27:35 PM MSK 
//


package com.apple.itunes.importer.tv;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlElementRefs;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ExtraVideoItem complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ExtraVideoItem">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;choice maxOccurs="unbounded" minOccurs="0">
 *         &lt;element ref="{http://apple.com/itunes/importer}target_path"/>
 *         &lt;element ref="{http://apple.com/itunes/importer}vendor_id"/>
 *         &lt;element ref="{http://apple.com/itunes/importer}assets"/>
 *       &lt;/choice>
 *       &lt;attribute name="remove" type="{http://apple.com/itunes/importer}FormattedBoolean" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ExtraVideoItem", propOrder = {
    "targetPathOrVendorIdOrAssets"
})
public class ExtraVideoItem {

    @XmlElementRefs({
        @XmlElementRef(name = "target_path", namespace = "http://apple.com/itunes/importer", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "vendor_id", namespace = "http://apple.com/itunes/importer", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "assets", namespace = "http://apple.com/itunes/importer", type = JAXBElement.class, required = false)
    })
    protected List<JAXBElement<?>> targetPathOrVendorIdOrAssets;
    @XmlAttribute(name = "remove")
    protected String remove;

    /**
     * Gets the value of the targetPathOrVendorIdOrAssets property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the targetPathOrVendorIdOrAssets property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTargetPathOrVendorIdOrAssets().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link JAXBElement }{@code <}{@link String }{@code >}
     * {@link JAXBElement }{@code <}{@link String }{@code >}
     * {@link JAXBElement }{@code <}{@link AssetList }{@code >}
     * 
     * 
     */
    public List<JAXBElement<?>> getTargetPathOrVendorIdOrAssets() {
        if (targetPathOrVendorIdOrAssets == null) {
            targetPathOrVendorIdOrAssets = new ArrayList<JAXBElement<?>>();
        }
        return this.targetPathOrVendorIdOrAssets;
    }

    /**
     * Gets the value of the remove property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRemove() {
        return remove;
    }

    /**
     * Sets the value of the remove property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRemove(String value) {
        this.remove = value;
    }

}
