//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2016.08.11 at 01:51:42 PM MSK 
//


package org.smpte_ra.reg._395._2014._13._1.aaf;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import org.smpte_ra.reg._2003._2012.ApplicationPluginObjectStrongReferenceSet;
import org.smpte_ra.reg._2003._2012.DescriptiveFrameworkStrongReference;
import org.smpte_ra.reg._2003._2012.Indirect;
import org.smpte_ra.reg._2003._2012.KLVDataStrongReferenceVector;
import org.smpte_ra.reg._2003._2012.SourceReferenceStrongReference;
import org.smpte_ra.reg._2003._2012.TaggedValueStrongReferenceVector;
import org.smpte_ra.reg._2003._2012.ToleranceModeType;
import org.smpte_ra.reg._2003._2012.UInt32Array;
import org.smpte_ra.reg._2003._2012.UInt32Set;
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
 *         &lt;element ref="{http://www.smpte-ra.org/reg/335/2012}DynamicSourcePackageID"/>
 *         &lt;element ref="{http://www.smpte-ra.org/reg/335/2012}SourceSpecies" minOccurs="0"/>
 *         &lt;element ref="{http://www.smpte-ra.org/reg/335/2012}DynamicSourceTrackIDs" minOccurs="0"/>
 *         &lt;element ref="{http://www.smpte-ra.org/reg/335/2012}SourceIndex" minOccurs="0"/>
 *         &lt;element ref="{http://www.smpte-ra.org/reg/335/2012}ToleranceInterpolationMethod" minOccurs="0"/>
 *         &lt;element ref="{http://www.smpte-ra.org/reg/335/2012}ToleranceWindow" minOccurs="0"/>
 *         &lt;element ref="{http://www.smpte-ra.org/reg/335/2012}ToleranceMode" minOccurs="0"/>
 *         &lt;element ref="{http://www.smpte-ra.org/reg/335/2012}DescribedTrackIDs" minOccurs="0"/>
 *         &lt;element ref="{http://www.smpte-ra.org/reg/335/2012}DescriptiveMetadataApplicationEnvironmentID" minOccurs="0"/>
 *         &lt;element ref="{http://www.smpte-ra.org/reg/335/2012}DescriptiveMetadataScheme" minOccurs="0"/>
 *         &lt;element ref="{http://www.smpte-ra.org/reg/335/2012}DescriptiveFrameworkObject" minOccurs="0"/>
 *         &lt;element ref="{http://www.smpte-ra.org/reg/335/2012}DescriptiveMetadataPlugInID" minOccurs="0"/>
 *         &lt;element ref="{http://www.smpte-ra.org/reg/335/2012}AnnotationSource" minOccurs="0"/>
 *         &lt;element ref="{http://www.smpte-ra.org/reg/335/2012}EventPosition" minOccurs="0"/>
 *         &lt;element ref="{http://www.smpte-ra.org/reg/335/2012}EventComment" minOccurs="0"/>
 *         &lt;element ref="{http://www.smpte-ra.org/reg/335/2012}ComponentKLVData" minOccurs="0"/>
 *         &lt;element ref="{http://www.smpte-ra.org/reg/335/2012}ComponentLength" minOccurs="0"/>
 *         &lt;element ref="{http://www.smpte-ra.org/reg/335/2012}ComponentUserComments" minOccurs="0"/>
 *         &lt;element ref="{http://www.smpte-ra.org/reg/335/2012}ComponentDataDefinition"/>
 *         &lt;element ref="{http://www.smpte-ra.org/reg/335/2012}ComponentAttributes" minOccurs="0"/>
 *         &lt;element ref="{http://www.smpte-ra.org/reg/335/2012}InstanceID" minOccurs="0"/>
 *         &lt;element ref="{http://www.smpte-ra.org/reg/335/2012}ObjectClass" minOccurs="0"/>
 *         &lt;element ref="{http://www.smpte-ra.org/reg/335/2012}ApplicationPlugInObjects" minOccurs="0"/>
 *         &lt;element ref="{http://www.smpte-ra.org/reg/335/2012}LinkedGenerationID" minOccurs="0"/>
 *       &lt;/all>
 *       &lt;attribute ref="{http://sandflow.com/ns/SMPTEST2001-1/baseline}uid use="required""/>
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
@XmlRootElement(name = "DynamicClip")
public class DynamicClip {

    @XmlElement(name = "DynamicSourcePackageID", namespace = "http://www.smpte-ra.org/reg/335/2012", required = true)
    protected String dynamicSourcePackageID;
    @XmlElement(name = "SourceSpecies", namespace = "http://www.smpte-ra.org/reg/335/2012")
    protected Indirect sourceSpecies;
    @XmlElement(name = "DynamicSourceTrackIDs", namespace = "http://www.smpte-ra.org/reg/335/2012")
    protected UInt32Array dynamicSourceTrackIDs;
    @XmlElement(name = "SourceIndex", namespace = "http://www.smpte-ra.org/reg/335/2012")
    protected Indirect sourceIndex;
    @XmlElement(name = "ToleranceInterpolationMethod", namespace = "http://www.smpte-ra.org/reg/335/2012")
    @XmlSchemaType(name = "anySimpleType")
    protected String toleranceInterpolationMethod;
    @XmlElement(name = "ToleranceWindow", namespace = "http://www.smpte-ra.org/reg/335/2012")
    protected Indirect toleranceWindow;
    @XmlElement(name = "ToleranceMode", namespace = "http://www.smpte-ra.org/reg/335/2012")
    @XmlSchemaType(name = "token")
    protected ToleranceModeType toleranceMode;
    @XmlElement(name = "DescribedTrackIDs", namespace = "http://www.smpte-ra.org/reg/335/2012")
    protected UInt32Set describedTrackIDs;
    @XmlElement(name = "DescriptiveMetadataApplicationEnvironmentID", namespace = "http://www.smpte-ra.org/reg/335/2012")
    protected UTF16String descriptiveMetadataApplicationEnvironmentID;
    @XmlElement(name = "DescriptiveMetadataScheme", namespace = "http://www.smpte-ra.org/reg/335/2012")
    @XmlSchemaType(name = "anyURI")
    protected String descriptiveMetadataScheme;
    @XmlElement(name = "DescriptiveFrameworkObject", namespace = "http://www.smpte-ra.org/reg/335/2012")
    protected DescriptiveFrameworkStrongReference descriptiveFrameworkObject;
    @XmlElement(name = "DescriptiveMetadataPlugInID", namespace = "http://www.smpte-ra.org/reg/335/2012")
    @XmlSchemaType(name = "anyURI")
    protected String descriptiveMetadataPlugInID;
    @XmlElement(name = "AnnotationSource", namespace = "http://www.smpte-ra.org/reg/335/2012")
    protected SourceReferenceStrongReference annotationSource;
    @XmlElement(name = "EventPosition", namespace = "http://www.smpte-ra.org/reg/335/2012")
    @XmlSchemaType(name = "anySimpleType")
    protected String eventPosition;
    @XmlElement(name = "EventComment", namespace = "http://www.smpte-ra.org/reg/335/2012")
    protected UTF16String eventComment;
    @XmlElement(name = "ComponentKLVData", namespace = "http://www.smpte-ra.org/reg/335/2012")
    protected KLVDataStrongReferenceVector componentKLVData;
    @XmlElement(name = "ComponentLength", namespace = "http://www.smpte-ra.org/reg/335/2012")
    @XmlSchemaType(name = "anySimpleType")
    protected String componentLength;
    @XmlElement(name = "ComponentUserComments", namespace = "http://www.smpte-ra.org/reg/335/2012")
    protected TaggedValueStrongReferenceVector componentUserComments;
    @XmlElement(name = "ComponentDataDefinition", namespace = "http://www.smpte-ra.org/reg/335/2012", required = true)
    @XmlSchemaType(name = "anySimpleType")
    protected String componentDataDefinition;
    @XmlElement(name = "ComponentAttributes", namespace = "http://www.smpte-ra.org/reg/335/2012")
    protected TaggedValueStrongReferenceVector componentAttributes;
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
    @XmlAttribute(name = "uid", namespace = "http://sandflow.com/ns/SMPTEST2001-1/baseline", required = true)
    protected String uid;
    @XmlAttribute(name = "path", namespace = "http://sandflow.com/ns/SMPTEST2001-1/baseline")
    protected String path;

    /**
     * Gets the value of the dynamicSourcePackageID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDynamicSourcePackageID() {
        return dynamicSourcePackageID;
    }

    /**
     * Sets the value of the dynamicSourcePackageID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDynamicSourcePackageID(String value) {
        this.dynamicSourcePackageID = value;
    }

    /**
     * Gets the value of the sourceSpecies property.
     * 
     * @return
     *     possible object is
     *     {@link Indirect }
     *     
     */
    public Indirect getSourceSpecies() {
        return sourceSpecies;
    }

    /**
     * Sets the value of the sourceSpecies property.
     * 
     * @param value
     *     allowed object is
     *     {@link Indirect }
     *     
     */
    public void setSourceSpecies(Indirect value) {
        this.sourceSpecies = value;
    }

    /**
     * Gets the value of the dynamicSourceTrackIDs property.
     * 
     * @return
     *     possible object is
     *     {@link UInt32Array }
     *     
     */
    public UInt32Array getDynamicSourceTrackIDs() {
        return dynamicSourceTrackIDs;
    }

    /**
     * Sets the value of the dynamicSourceTrackIDs property.
     * 
     * @param value
     *     allowed object is
     *     {@link UInt32Array }
     *     
     */
    public void setDynamicSourceTrackIDs(UInt32Array value) {
        this.dynamicSourceTrackIDs = value;
    }

    /**
     * Gets the value of the sourceIndex property.
     * 
     * @return
     *     possible object is
     *     {@link Indirect }
     *     
     */
    public Indirect getSourceIndex() {
        return sourceIndex;
    }

    /**
     * Sets the value of the sourceIndex property.
     * 
     * @param value
     *     allowed object is
     *     {@link Indirect }
     *     
     */
    public void setSourceIndex(Indirect value) {
        this.sourceIndex = value;
    }

    /**
     * Gets the value of the toleranceInterpolationMethod property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getToleranceInterpolationMethod() {
        return toleranceInterpolationMethod;
    }

    /**
     * Sets the value of the toleranceInterpolationMethod property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setToleranceInterpolationMethod(String value) {
        this.toleranceInterpolationMethod = value;
    }

    /**
     * Gets the value of the toleranceWindow property.
     * 
     * @return
     *     possible object is
     *     {@link Indirect }
     *     
     */
    public Indirect getToleranceWindow() {
        return toleranceWindow;
    }

    /**
     * Sets the value of the toleranceWindow property.
     * 
     * @param value
     *     allowed object is
     *     {@link Indirect }
     *     
     */
    public void setToleranceWindow(Indirect value) {
        this.toleranceWindow = value;
    }

    /**
     * Gets the value of the toleranceMode property.
     * 
     * @return
     *     possible object is
     *     {@link ToleranceModeType }
     *     
     */
    public ToleranceModeType getToleranceMode() {
        return toleranceMode;
    }

    /**
     * Sets the value of the toleranceMode property.
     * 
     * @param value
     *     allowed object is
     *     {@link ToleranceModeType }
     *     
     */
    public void setToleranceMode(ToleranceModeType value) {
        this.toleranceMode = value;
    }

    /**
     * Gets the value of the describedTrackIDs property.
     * 
     * @return
     *     possible object is
     *     {@link UInt32Set }
     *     
     */
    public UInt32Set getDescribedTrackIDs() {
        return describedTrackIDs;
    }

    /**
     * Sets the value of the describedTrackIDs property.
     * 
     * @param value
     *     allowed object is
     *     {@link UInt32Set }
     *     
     */
    public void setDescribedTrackIDs(UInt32Set value) {
        this.describedTrackIDs = value;
    }

    /**
     * Gets the value of the descriptiveMetadataApplicationEnvironmentID property.
     * 
     * @return
     *     possible object is
     *     {@link UTF16String }
     *     
     */
    public UTF16String getDescriptiveMetadataApplicationEnvironmentID() {
        return descriptiveMetadataApplicationEnvironmentID;
    }

    /**
     * Sets the value of the descriptiveMetadataApplicationEnvironmentID property.
     * 
     * @param value
     *     allowed object is
     *     {@link UTF16String }
     *     
     */
    public void setDescriptiveMetadataApplicationEnvironmentID(UTF16String value) {
        this.descriptiveMetadataApplicationEnvironmentID = value;
    }

    /**
     * Gets the value of the descriptiveMetadataScheme property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescriptiveMetadataScheme() {
        return descriptiveMetadataScheme;
    }

    /**
     * Sets the value of the descriptiveMetadataScheme property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescriptiveMetadataScheme(String value) {
        this.descriptiveMetadataScheme = value;
    }

    /**
     * Gets the value of the descriptiveFrameworkObject property.
     * 
     * @return
     *     possible object is
     *     {@link DescriptiveFrameworkStrongReference }
     *     
     */
    public DescriptiveFrameworkStrongReference getDescriptiveFrameworkObject() {
        return descriptiveFrameworkObject;
    }

    /**
     * Sets the value of the descriptiveFrameworkObject property.
     * 
     * @param value
     *     allowed object is
     *     {@link DescriptiveFrameworkStrongReference }
     *     
     */
    public void setDescriptiveFrameworkObject(DescriptiveFrameworkStrongReference value) {
        this.descriptiveFrameworkObject = value;
    }

    /**
     * Gets the value of the descriptiveMetadataPlugInID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescriptiveMetadataPlugInID() {
        return descriptiveMetadataPlugInID;
    }

    /**
     * Sets the value of the descriptiveMetadataPlugInID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescriptiveMetadataPlugInID(String value) {
        this.descriptiveMetadataPlugInID = value;
    }

    /**
     * Gets the value of the annotationSource property.
     * 
     * @return
     *     possible object is
     *     {@link SourceReferenceStrongReference }
     *     
     */
    public SourceReferenceStrongReference getAnnotationSource() {
        return annotationSource;
    }

    /**
     * Sets the value of the annotationSource property.
     * 
     * @param value
     *     allowed object is
     *     {@link SourceReferenceStrongReference }
     *     
     */
    public void setAnnotationSource(SourceReferenceStrongReference value) {
        this.annotationSource = value;
    }

    /**
     * Gets the value of the eventPosition property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEventPosition() {
        return eventPosition;
    }

    /**
     * Sets the value of the eventPosition property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEventPosition(String value) {
        this.eventPosition = value;
    }

    /**
     * Gets the value of the eventComment property.
     * 
     * @return
     *     possible object is
     *     {@link UTF16String }
     *     
     */
    public UTF16String getEventComment() {
        return eventComment;
    }

    /**
     * Sets the value of the eventComment property.
     * 
     * @param value
     *     allowed object is
     *     {@link UTF16String }
     *     
     */
    public void setEventComment(UTF16String value) {
        this.eventComment = value;
    }

    /**
     * Gets the value of the componentKLVData property.
     * 
     * @return
     *     possible object is
     *     {@link KLVDataStrongReferenceVector }
     *     
     */
    public KLVDataStrongReferenceVector getComponentKLVData() {
        return componentKLVData;
    }

    /**
     * Sets the value of the componentKLVData property.
     * 
     * @param value
     *     allowed object is
     *     {@link KLVDataStrongReferenceVector }
     *     
     */
    public void setComponentKLVData(KLVDataStrongReferenceVector value) {
        this.componentKLVData = value;
    }

    /**
     * Gets the value of the componentLength property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getComponentLength() {
        return componentLength;
    }

    /**
     * Sets the value of the componentLength property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setComponentLength(String value) {
        this.componentLength = value;
    }

    /**
     * Gets the value of the componentUserComments property.
     * 
     * @return
     *     possible object is
     *     {@link TaggedValueStrongReferenceVector }
     *     
     */
    public TaggedValueStrongReferenceVector getComponentUserComments() {
        return componentUserComments;
    }

    /**
     * Sets the value of the componentUserComments property.
     * 
     * @param value
     *     allowed object is
     *     {@link TaggedValueStrongReferenceVector }
     *     
     */
    public void setComponentUserComments(TaggedValueStrongReferenceVector value) {
        this.componentUserComments = value;
    }

    /**
     * Gets the value of the componentDataDefinition property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getComponentDataDefinition() {
        return componentDataDefinition;
    }

    /**
     * Sets the value of the componentDataDefinition property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setComponentDataDefinition(String value) {
        this.componentDataDefinition = value;
    }

    /**
     * Gets the value of the componentAttributes property.
     * 
     * @return
     *     possible object is
     *     {@link TaggedValueStrongReferenceVector }
     *     
     */
    public TaggedValueStrongReferenceVector getComponentAttributes() {
        return componentAttributes;
    }

    /**
     * Sets the value of the componentAttributes property.
     * 
     * @param value
     *     allowed object is
     *     {@link TaggedValueStrongReferenceVector }
     *     
     */
    public void setComponentAttributes(TaggedValueStrongReferenceVector value) {
        this.componentAttributes = value;
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
     * Gets the value of the uid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUid() {
        return uid;
    }

    /**
     * Sets the value of the uid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUid(String value) {
        this.uid = value;
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
