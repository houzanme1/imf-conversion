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
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlElementRefs;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * <p>Java class for ChapterItem complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ChapterItem">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;choice maxOccurs="unbounded" minOccurs="0">
 *         &lt;choice>
 *           &lt;element ref="{http://apple.com/itunes/importer}start_time"/>
 *           &lt;element ref="{http://apple.com/itunes/importer}chapter_start_time"/>
 *         &lt;/choice>
 *         &lt;choice>
 *           &lt;element name="title" type="{http://apple.com/itunes/importer}NonEmptyLocalizableTextElement"/>
 *           &lt;element ref="{http://apple.com/itunes/importer}titles"/>
 *         &lt;/choice>
 *         &lt;element ref="{http://apple.com/itunes/importer}artwork_file"/>
 *         &lt;element ref="{http://apple.com/itunes/importer}artwork_time"/>
 *       &lt;/choice>
 *       &lt;attribute name="starttime" type="{http://apple.com/itunes/importer}FormattedTime" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ChapterItem", propOrder = {
    "startTimeOrChapterStartTimeOrTitle"
})
public class ChapterItem {

    @XmlElementRefs({
        @XmlElementRef(name = "artwork_time", namespace = "http://apple.com/itunes/importer", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "artwork_file", namespace = "http://apple.com/itunes/importer", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "title", namespace = "http://apple.com/itunes/importer", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "chapter_start_time", namespace = "http://apple.com/itunes/importer", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "start_time", namespace = "http://apple.com/itunes/importer", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "titles", namespace = "http://apple.com/itunes/importer", type = Titles.class, required = false)
    })
    protected List<Object> startTimeOrChapterStartTimeOrTitle;
    @XmlAttribute(name = "starttime")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String starttime;

    /**
     * Gets the value of the startTimeOrChapterStartTimeOrTitle property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the startTimeOrChapterStartTimeOrTitle property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getStartTimeOrChapterStartTimeOrTitle().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link JAXBElement }{@code <}{@link String }{@code >}
     * {@link JAXBElement }{@code <}{@link String }{@code >}
     * {@link JAXBElement }{@code <}{@link File }{@code >}
     * {@link JAXBElement }{@code <}{@link NonEmptyLocalizableTextElement }{@code >}
     * {@link JAXBElement }{@code <}{@link String }{@code >}
     * {@link Titles }
     * 
     * 
     */
    public List<Object> getStartTimeOrChapterStartTimeOrTitle() {
        if (startTimeOrChapterStartTimeOrTitle == null) {
            startTimeOrChapterStartTimeOrTitle = new ArrayList<Object>();
        }
        return this.startTimeOrChapterStartTimeOrTitle;
    }

    /**
     * Gets the value of the starttime property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStarttime() {
        return starttime;
    }

    /**
     * Sets the value of the starttime property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStarttime(String value) {
        this.starttime = value;
    }

}
