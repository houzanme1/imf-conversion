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
 * <p>Java class for Rootnode complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Rootnode">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;choice maxOccurs="unbounded" minOccurs="0">
 *         &lt;element ref="{http://apple.com/itunes/importer}vendor_id"/>
 *         &lt;element name="title" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element ref="{http://apple.com/itunes/importer}short_title"/>
 *         &lt;element ref="{http://apple.com/itunes/importer}territories"/>
 *         &lt;element ref="{http://apple.com/itunes/importer}background_gallery_link"/>
 *         &lt;element name="locales">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="locale" type="{http://apple.com/itunes/importer}NavnodeLocale" maxOccurs="unbounded" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element ref="{http://apple.com/itunes/importer}colors"/>
 *         &lt;element name="transition">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token">
 *               &lt;enumeration value="none"/>
 *               &lt;enumeration value="push"/>
 *               &lt;enumeration value="wipe"/>
 *               &lt;enumeration value="dissolve"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element ref="{http://apple.com/itunes/importer}navnodes"/>
 *       &lt;/choice>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Rootnode", propOrder = {
    "vendorIdOrTitleOrShortTitle"
})
public class Rootnode {

    @XmlElementRefs({
        @XmlElementRef(name = "short_title", namespace = "http://apple.com/itunes/importer", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "transition", namespace = "http://apple.com/itunes/importer", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "background_gallery_link", namespace = "http://apple.com/itunes/importer", type = BackgroundGalleryLink.class, required = false),
        @XmlElementRef(name = "navnodes", namespace = "http://apple.com/itunes/importer", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "territories", namespace = "http://apple.com/itunes/importer", type = Territories.class, required = false),
        @XmlElementRef(name = "colors", namespace = "http://apple.com/itunes/importer", type = Colors.class, required = false),
        @XmlElementRef(name = "locales", namespace = "http://apple.com/itunes/importer", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "vendor_id", namespace = "http://apple.com/itunes/importer", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "title", namespace = "http://apple.com/itunes/importer", type = JAXBElement.class, required = false)
    })
    protected List<Object> vendorIdOrTitleOrShortTitle;

    /**
     * Gets the value of the vendorIdOrTitleOrShortTitle property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the vendorIdOrTitleOrShortTitle property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getVendorIdOrTitleOrShortTitle().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link JAXBElement }{@code <}{@link String }{@code >}
     * {@link JAXBElement }{@code <}{@link String }{@code >}
     * {@link BackgroundGalleryLink }
     * {@link JAXBElement }{@code <}{@link NavnodeList }{@code >}
     * {@link Territories }
     * {@link Colors }
     * {@link JAXBElement }{@code <}{@link Rootnode.Locales }{@code >}
     * {@link JAXBElement }{@code <}{@link String }{@code >}
     * {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * 
     */
    public List<Object> getVendorIdOrTitleOrShortTitle() {
        if (vendorIdOrTitleOrShortTitle == null) {
            vendorIdOrTitleOrShortTitle = new ArrayList<Object>();
        }
        return this.vendorIdOrTitleOrShortTitle;
    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="locale" type="{http://apple.com/itunes/importer}NavnodeLocale" maxOccurs="unbounded" minOccurs="0"/>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "locale"
    })
    public static class Locales {

        protected List<NavnodeLocale> locale;

        /**
         * Gets the value of the locale property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the locale property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getLocale().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link NavnodeLocale }
         * 
         * 
         */
        public List<NavnodeLocale> getLocale() {
            if (locale == null) {
                locale = new ArrayList<NavnodeLocale>();
            }
            return this.locale;
        }

    }

}
