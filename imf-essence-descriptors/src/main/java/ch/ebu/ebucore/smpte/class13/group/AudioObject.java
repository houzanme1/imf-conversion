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
import ch.ebu.ebucore.smpte.class13.type.IDRefStrongReferenceSet;
import org.smpte_ra.reg._2003._2012.ApplicationPluginObjectStrongReferenceSet;
import org.smpte_ra.reg._2003._2012.Boolean;
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
 *         &lt;element ref="{http://www.ebu.ch/ebucore/smpte/class13/element}audioObjectAudioObjectIDRefObjects" minOccurs="0"/>
 *         &lt;element ref="{http://www.ebu.ch/ebucore/smpte/class13/element}audioObjectAudioPackFormatIDRefObjects" minOccurs="0"/>
 *         &lt;element ref="{http://www.ebu.ch/ebucore/smpte/class13/element}audioObjectAudioTrackUIDRefObjects" minOccurs="0"/>
 *         &lt;element ref="{http://www.ebu.ch/ebucore/smpte/class13/element}audioObjectImportance" minOccurs="0"/>
 *         &lt;element ref="{http://www.ebu.ch/ebucore/smpte/class13/element}audioObjectId" minOccurs="0"/>
 *         &lt;element ref="{http://www.ebu.ch/ebucore/smpte/class13/element}audioObjectInteract" minOccurs="0"/>
 *         &lt;element ref="{http://www.ebu.ch/ebucore/smpte/class13/element}audioObjectName" minOccurs="0"/>
 *         &lt;element ref="{http://www.ebu.ch/ebucore/smpte/class13/element}audioObjectDialogueIndicator" minOccurs="0"/>
 *         &lt;element ref="{http://www.ebu.ch/ebucore/smpte/class13/element}audioObjectStartTimecode" minOccurs="0"/>
 *         &lt;element ref="{http://www.ebu.ch/ebucore/smpte/class13/element}audioObjectDurationTimecode" minOccurs="0"/>
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
@XmlRootElement(name = "audioObject")
public class AudioObject {

    @XmlElement(namespace = "http://www.ebu.ch/ebucore/smpte/class13/element")
    protected IDRefStrongReferenceSet audioObjectAudioObjectIDRefObjects;
    @XmlElement(namespace = "http://www.ebu.ch/ebucore/smpte/class13/element")
    protected IDRefStrongReferenceSet audioObjectAudioPackFormatIDRefObjects;
    @XmlElement(namespace = "http://www.ebu.ch/ebucore/smpte/class13/element")
    protected IDRefStrongReferenceSet audioObjectAudioTrackUIDRefObjects;
    @XmlElement(namespace = "http://www.ebu.ch/ebucore/smpte/class13/element")
    @XmlSchemaType(name = "anySimpleType")
    protected String audioObjectImportance;
    @XmlElement(namespace = "http://www.ebu.ch/ebucore/smpte/class13/element")
    protected UTF16String audioObjectId;
    @XmlElement(namespace = "http://www.ebu.ch/ebucore/smpte/class13/element")
    @XmlSchemaType(name = "token")
    protected Boolean audioObjectInteract;
    @XmlElement(namespace = "http://www.ebu.ch/ebucore/smpte/class13/element")
    protected UTF16String audioObjectName;
    @XmlElement(namespace = "http://www.ebu.ch/ebucore/smpte/class13/element")
    @XmlSchemaType(name = "token")
    protected Boolean audioObjectDialogueIndicator;
    @XmlElement(namespace = "http://www.ebu.ch/ebucore/smpte/class13/element")
    protected UTF16String audioObjectStartTimecode;
    @XmlElement(namespace = "http://www.ebu.ch/ebucore/smpte/class13/element")
    protected UTF16String audioObjectDurationTimecode;
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
     * Gets the value of the audioObjectAudioObjectIDRefObjects property.
     * 
     * @return
     *     possible object is
     *     {@link IDRefStrongReferenceSet }
     *     
     */
    public IDRefStrongReferenceSet getAudioObjectAudioObjectIDRefObjects() {
        return audioObjectAudioObjectIDRefObjects;
    }

    /**
     * Sets the value of the audioObjectAudioObjectIDRefObjects property.
     * 
     * @param value
     *     allowed object is
     *     {@link IDRefStrongReferenceSet }
     *     
     */
    public void setAudioObjectAudioObjectIDRefObjects(IDRefStrongReferenceSet value) {
        this.audioObjectAudioObjectIDRefObjects = value;
    }

    /**
     * Gets the value of the audioObjectAudioPackFormatIDRefObjects property.
     * 
     * @return
     *     possible object is
     *     {@link IDRefStrongReferenceSet }
     *     
     */
    public IDRefStrongReferenceSet getAudioObjectAudioPackFormatIDRefObjects() {
        return audioObjectAudioPackFormatIDRefObjects;
    }

    /**
     * Sets the value of the audioObjectAudioPackFormatIDRefObjects property.
     * 
     * @param value
     *     allowed object is
     *     {@link IDRefStrongReferenceSet }
     *     
     */
    public void setAudioObjectAudioPackFormatIDRefObjects(IDRefStrongReferenceSet value) {
        this.audioObjectAudioPackFormatIDRefObjects = value;
    }

    /**
     * Gets the value of the audioObjectAudioTrackUIDRefObjects property.
     * 
     * @return
     *     possible object is
     *     {@link IDRefStrongReferenceSet }
     *     
     */
    public IDRefStrongReferenceSet getAudioObjectAudioTrackUIDRefObjects() {
        return audioObjectAudioTrackUIDRefObjects;
    }

    /**
     * Sets the value of the audioObjectAudioTrackUIDRefObjects property.
     * 
     * @param value
     *     allowed object is
     *     {@link IDRefStrongReferenceSet }
     *     
     */
    public void setAudioObjectAudioTrackUIDRefObjects(IDRefStrongReferenceSet value) {
        this.audioObjectAudioTrackUIDRefObjects = value;
    }

    /**
     * Gets the value of the audioObjectImportance property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAudioObjectImportance() {
        return audioObjectImportance;
    }

    /**
     * Sets the value of the audioObjectImportance property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAudioObjectImportance(String value) {
        this.audioObjectImportance = value;
    }

    /**
     * Gets the value of the audioObjectId property.
     * 
     * @return
     *     possible object is
     *     {@link UTF16String }
     *     
     */
    public UTF16String getAudioObjectId() {
        return audioObjectId;
    }

    /**
     * Sets the value of the audioObjectId property.
     * 
     * @param value
     *     allowed object is
     *     {@link UTF16String }
     *     
     */
    public void setAudioObjectId(UTF16String value) {
        this.audioObjectId = value;
    }

    /**
     * Gets the value of the audioObjectInteract property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean getAudioObjectInteract() {
        return audioObjectInteract;
    }

    /**
     * Sets the value of the audioObjectInteract property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setAudioObjectInteract(Boolean value) {
        this.audioObjectInteract = value;
    }

    /**
     * Gets the value of the audioObjectName property.
     * 
     * @return
     *     possible object is
     *     {@link UTF16String }
     *     
     */
    public UTF16String getAudioObjectName() {
        return audioObjectName;
    }

    /**
     * Sets the value of the audioObjectName property.
     * 
     * @param value
     *     allowed object is
     *     {@link UTF16String }
     *     
     */
    public void setAudioObjectName(UTF16String value) {
        this.audioObjectName = value;
    }

    /**
     * Gets the value of the audioObjectDialogueIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean getAudioObjectDialogueIndicator() {
        return audioObjectDialogueIndicator;
    }

    /**
     * Sets the value of the audioObjectDialogueIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setAudioObjectDialogueIndicator(Boolean value) {
        this.audioObjectDialogueIndicator = value;
    }

    /**
     * Gets the value of the audioObjectStartTimecode property.
     * 
     * @return
     *     possible object is
     *     {@link UTF16String }
     *     
     */
    public UTF16String getAudioObjectStartTimecode() {
        return audioObjectStartTimecode;
    }

    /**
     * Sets the value of the audioObjectStartTimecode property.
     * 
     * @param value
     *     allowed object is
     *     {@link UTF16String }
     *     
     */
    public void setAudioObjectStartTimecode(UTF16String value) {
        this.audioObjectStartTimecode = value;
    }

    /**
     * Gets the value of the audioObjectDurationTimecode property.
     * 
     * @return
     *     possible object is
     *     {@link UTF16String }
     *     
     */
    public UTF16String getAudioObjectDurationTimecode() {
        return audioObjectDurationTimecode;
    }

    /**
     * Sets the value of the audioObjectDurationTimecode property.
     * 
     * @param value
     *     allowed object is
     *     {@link UTF16String }
     *     
     */
    public void setAudioObjectDurationTimecode(UTF16String value) {
        this.audioObjectDurationTimecode = value;
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
