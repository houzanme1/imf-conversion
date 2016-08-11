//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2016.08.11 at 01:51:42 PM MSK 
//


package ch.ebu.ebucore.smpte.class13.group;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import ch.ebu.ebucore.smpte.class13.type.TypeGroupStrongReference;
import org.smpte_ra.reg._2003._2012.ApplicationPluginObjectStrongReferenceSet;
import org.smpte_ra.reg._2003._2012.UTF16String;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;all>
 *         &lt;element ref="{http://www.ebu.ch/ebucore/smpte/class13/element}textTime" minOccurs="0"/>
 *         &lt;element ref="{http://www.ebu.ch/ebucore/smpte/class13/element}timeTypeGroupObject" minOccurs="0"/>
 *         &lt;element ref="{http://www.ebu.ch/ebucore/smpte/class13/element}editUnit" minOccurs="0"/>
 *         &lt;element ref="{http://www.ebu.ch/ebucore/smpte/class13/element}timecode" minOccurs="0"/>
 *         &lt;element ref="{http://www.ebu.ch/ebucore/smpte/class13/element}normalPlayTime" minOccurs="0"/>
 *         &lt;element ref="{http://www.smpte-ra.org/reg/335/2012}LinkedDescriptiveObjectPluginID" minOccurs="0"/>
 *         &lt;element ref="{http://www.smpte-ra.org/reg/335/2012}InstanceID" minOccurs="0"/>
 *         &lt;element ref="{http://www.smpte-ra.org/reg/335/2012}ObjectClass" minOccurs="0"/>
 *         &lt;element ref="{http://www.smpte-ra.org/reg/335/2012}ApplicationPlugInObjects" minOccurs="0"/>
 *         &lt;element ref="{http://www.smpte-ra.org/reg/335/2012}LinkedGenerationID" minOccurs="0"/>
 *       &lt;/all>
 *       &lt;attribute ref="{http://sandflow.com/ns/SMPTEST2001-1/baseline}path"/>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {

})
@XmlRootElement(name = "time")
public class Time {

    @XmlElement(namespace = "http://www.ebu.ch/ebucore/smpte/class13/element")
    protected UTF16String textTime;
    @XmlElement(namespace = "http://www.ebu.ch/ebucore/smpte/class13/element")
    protected TypeGroupStrongReference timeTypeGroupObject;
    @XmlElement(namespace = "http://www.ebu.ch/ebucore/smpte/class13/element")
    protected UTF16String editUnit;
    @XmlElement(namespace = "http://www.ebu.ch/ebucore/smpte/class13/element")
    protected UTF16String timecode;
    @XmlElement(namespace = "http://www.ebu.ch/ebucore/smpte/class13/element")
    protected UTF16String normalPlayTime;
    @XmlElement(name = "LinkedDescriptiveObjectPluginID", namespace = "http://www.smpte-ra.org/reg/335/2012")
    @XmlSchemaType(name = "anySimpleType")
    protected String linkedDescriptiveObjectPluginID;
    @XmlElement(name = "InstanceID", namespace = "http://www.smpte-ra.org/reg/335/2012")
    @XmlSchemaType(name = "anyURI")
    protected String instanceID;
    @XmlElement(name = "ObjectClass", namespace = "http://www.smpte-ra.org/reg/335/2012")
    @XmlSchemaType(name = "anySimpleType")
    protected String objectClass;
    @XmlElement(name = "ApplicationPlugInObjects", namespace = "http://www.smpte-ra.org/reg/335/2012")
    protected ApplicationPluginObjectStrongReferenceSet applicationPlugInObjects;
    @XmlElement(name = "LinkedGenerationID", namespace = "http://www.smpte-ra.org/reg/335/2012")
    @XmlSchemaType(name = "anyURI")
    protected String linkedGenerationID;
    @XmlAttribute(name = "path", namespace = "http://sandflow.com/ns/SMPTEST2001-1/baseline")
    protected String path;

    /**
     * Gets the value of the textTime property.
     * 
     * @return
     *     possible object is
     *     {@link UTF16String }
     *     
     */
    public UTF16String getTextTime() {
        return textTime;
    }

    /**
     * Sets the value of the textTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link UTF16String }
     *     
     */
    public void setTextTime(UTF16String value) {
        this.textTime = value;
    }

    /**
     * Gets the value of the timeTypeGroupObject property.
     * 
     * @return
     *     possible object is
     *     {@link TypeGroupStrongReference }
     *     
     */
    public TypeGroupStrongReference getTimeTypeGroupObject() {
        return timeTypeGroupObject;
    }

    /**
     * Sets the value of the timeTypeGroupObject property.
     * 
     * @param value
     *     allowed object is
     *     {@link TypeGroupStrongReference }
     *     
     */
    public void setTimeTypeGroupObject(TypeGroupStrongReference value) {
        this.timeTypeGroupObject = value;
    }

    /**
     * Gets the value of the editUnit property.
     * 
     * @return
     *     possible object is
     *     {@link UTF16String }
     *     
     */
    public UTF16String getEditUnit() {
        return editUnit;
    }

    /**
     * Sets the value of the editUnit property.
     * 
     * @param value
     *     allowed object is
     *     {@link UTF16String }
     *     
     */
    public void setEditUnit(UTF16String value) {
        this.editUnit = value;
    }

    /**
     * Gets the value of the timecode property.
     * 
     * @return
     *     possible object is
     *     {@link UTF16String }
     *     
     */
    public UTF16String getTimecode() {
        return timecode;
    }

    /**
     * Sets the value of the timecode property.
     * 
     * @param value
     *     allowed object is
     *     {@link UTF16String }
     *     
     */
    public void setTimecode(UTF16String value) {
        this.timecode = value;
    }

    /**
     * Gets the value of the normalPlayTime property.
     * 
     * @return
     *     possible object is
     *     {@link UTF16String }
     *     
     */
    public UTF16String getNormalPlayTime() {
        return normalPlayTime;
    }

    /**
     * Sets the value of the normalPlayTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link UTF16String }
     *     
     */
    public void setNormalPlayTime(UTF16String value) {
        this.normalPlayTime = value;
    }

    /**
     * Gets the value of the linkedDescriptiveObjectPluginID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLinkedDescriptiveObjectPluginID() {
        return linkedDescriptiveObjectPluginID;
    }

    /**
     * Sets the value of the linkedDescriptiveObjectPluginID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLinkedDescriptiveObjectPluginID(String value) {
        this.linkedDescriptiveObjectPluginID = value;
    }

    /**
     * Gets the value of the instanceID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInstanceID() {
        return instanceID;
    }

    /**
     * Sets the value of the instanceID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInstanceID(String value) {
        this.instanceID = value;
    }

    /**
     * Gets the value of the objectClass property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getObjectClass() {
        return objectClass;
    }

    /**
     * Sets the value of the objectClass property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setObjectClass(String value) {
        this.objectClass = value;
    }

    /**
     * Gets the value of the applicationPlugInObjects property.
     * 
     * @return
     *     possible object is
     *     {@link ApplicationPluginObjectStrongReferenceSet }
     *     
     */
    public ApplicationPluginObjectStrongReferenceSet getApplicationPlugInObjects() {
        return applicationPlugInObjects;
    }

    /**
     * Sets the value of the applicationPlugInObjects property.
     * 
     * @param value
     *     allowed object is
     *     {@link ApplicationPluginObjectStrongReferenceSet }
     *     
     */
    public void setApplicationPlugInObjects(ApplicationPluginObjectStrongReferenceSet value) {
        this.applicationPlugInObjects = value;
    }

    /**
     * Gets the value of the linkedGenerationID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLinkedGenerationID() {
        return linkedGenerationID;
    }

    /**
     * Sets the value of the linkedGenerationID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLinkedGenerationID(String value) {
        this.linkedGenerationID = value;
    }

    /**
     * Gets the value of the path property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPath() {
        return path;
    }

    /**
     * Sets the value of the path property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPath(String value) {
        this.path = value;
    }

}
