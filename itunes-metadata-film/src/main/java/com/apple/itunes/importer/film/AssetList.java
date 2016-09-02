//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.7-b41 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2016.09.01 at 05:28:13 PM MSK 
//


package com.apple.itunes.importer.film;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElements;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * <p>Java class for AssetList complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AssetList">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;choice maxOccurs="unbounded" minOccurs="0">
 *         &lt;element ref="{http://apple.com/itunes/importer}asset"/>
 *         &lt;element ref="{http://apple.com/itunes/importer}accessibility_info"/>
 *       &lt;/choice>
 *       &lt;attribute name="container_id" type="{http://apple.com/itunes/importer}VendorIdType" />
 *       &lt;attribute name="media_type">
 *         &lt;simpleType>
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token">
 *             &lt;enumeration value="video"/>
 *             &lt;enumeration value="playlist"/>
 *             &lt;enumeration value="extra_video_item"/>
 *             &lt;enumeration value="gallery_item_video"/>
 *             &lt;enumeration value="gallery_item_image"/>
 *             &lt;enumeration value="gallery_item_audio"/>
 *           &lt;/restriction>
 *         &lt;/simpleType>
 *       &lt;/attribute>
 *       &lt;attribute name="vendor_id" type="{http://apple.com/itunes/importer}VendorIdType" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AssetList", propOrder = {
    "assetOrAccessibilityInfo"
})
public class AssetList {

    @XmlElements({
        @XmlElement(name = "asset", type = AssetItem.class),
        @XmlElement(name = "accessibility_info", type = AccessibilityInfo.class)
    })
    protected List<Object> assetOrAccessibilityInfo;
    @XmlAttribute(name = "container_id")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String containerId;
    @XmlAttribute(name = "media_type")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String mediaType;
    @XmlAttribute(name = "vendor_id")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String vendorId;

    /**
     * Gets the value of the assetOrAccessibilityInfo property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the assetOrAccessibilityInfo property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAssetOrAccessibilityInfo().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AssetItem }
     * {@link AccessibilityInfo }
     * 
     * 
     */
    public List<Object> getAssetOrAccessibilityInfo() {
        if (assetOrAccessibilityInfo == null) {
            assetOrAccessibilityInfo = new ArrayList<Object>();
        }
        return this.assetOrAccessibilityInfo;
    }

    /**
     * Gets the value of the containerId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getContainerId() {
        return containerId;
    }

    /**
     * Sets the value of the containerId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setContainerId(String value) {
        this.containerId = value;
    }

    /**
     * Gets the value of the mediaType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMediaType() {
        return mediaType;
    }

    /**
     * Sets the value of the mediaType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMediaType(String value) {
        this.mediaType = value;
    }

    /**
     * Gets the value of the vendorId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVendorId() {
        return vendorId;
    }

    /**
     * Sets the value of the vendorId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVendorId(String value) {
        this.vendorId = value;
    }

}