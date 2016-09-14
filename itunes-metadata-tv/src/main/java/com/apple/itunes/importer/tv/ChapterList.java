//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.7-b41 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2016.09.01 at 06:27:35 PM MSK 
//


package com.apple.itunes.importer.tv;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElements;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ChapterList complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ChapterList">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;choice maxOccurs="unbounded" minOccurs="0">
 *         &lt;element ref="{http://apple.com/itunes/importer}timecode_format"/>
 *         &lt;element ref="{http://apple.com/itunes/importer}chapter"/>
 *       &lt;/choice>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ChapterList", propOrder = {
    "timecodeFormatOrChapter"
})
public class ChapterList {

    @XmlElements({
        @XmlElement(name = "timecode_format", type = String.class),
        @XmlElement(name = "chapter", type = ChapterItem.class)
    })
    protected List<Object> timecodeFormatOrChapter;

    /**
     * Gets the value of the timecodeFormatOrChapter property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the timecodeFormatOrChapter property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTimecodeFormatOrChapter().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * {@link ChapterItem }
     * 
     * 
     */
    public List<Object> getTimecodeFormatOrChapter() {
        if (timecodeFormatOrChapter == null) {
            timecodeFormatOrChapter = new ArrayList<Object>();
        }
        return this.timecodeFormatOrChapter;
    }

}
