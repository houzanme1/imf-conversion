//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.7-b41 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2016.09.01 at 05:28:13 PM MSK 
//


package com.apple.itunes.importer.film;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlElementRefs;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for HeroImage complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="HeroImage">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;choice maxOccurs="unbounded" minOccurs="0">
 *         &lt;element ref="{http://apple.com/itunes/importer}vendor_id"/>
 *         &lt;element ref="{http://apple.com/itunes/importer}hero_image_file"/>
 *       &lt;/choice>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "HeroImage", propOrder = {
    "vendorIdOrHeroImageFile"
})
public class HeroImage {

    @XmlElementRefs({
        @XmlElementRef(name = "hero_image_file", namespace = "http://apple.com/itunes/importer", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "vendor_id", namespace = "http://apple.com/itunes/importer", type = JAXBElement.class, required = false)
    })
    protected List<JAXBElement<?>> vendorIdOrHeroImageFile;

    /**
     * Gets the value of the vendorIdOrHeroImageFile property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the vendorIdOrHeroImageFile property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getVendorIdOrHeroImageFile().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link JAXBElement }{@code <}{@link AssetFile }{@code >}
     * {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * 
     */
    public List<JAXBElement<?>> getVendorIdOrHeroImageFile() {
        if (vendorIdOrHeroImageFile == null) {
            vendorIdOrHeroImageFile = new ArrayList<JAXBElement<?>>();
        }
        return this.vendorIdOrHeroImageFile;
    }

}
