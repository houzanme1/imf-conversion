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
import ch.ebu.ebucore.smpte.class13.type.ContactStrongReferenceSet;
import ch.ebu.ebucore.smpte.class13.type.CoverageStrongReference;
import ch.ebu.ebucore.smpte.class13.type.EntityStrongReferenceSet;
import ch.ebu.ebucore.smpte.class13.type.IDRefStrongReferenceSet;
import ch.ebu.ebucore.smpte.class13.type.IdentifierStrongReferenceSet;
import ch.ebu.ebucore.smpte.class13.type.TextualAnnotationStrongReferenceSet;
import ch.ebu.ebucore.smpte.class13.type.TypeGroupStrongReference;
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
 *         &lt;element ref="{http://www.ebu.ch/ebucore/smpte/class13/element}disclaimerObjects" minOccurs="0"/>
 *         &lt;element ref="{http://www.ebu.ch/ebucore/smpte/class13/element}copyrightStatementObjects" minOccurs="0"/>
 *         &lt;element ref="{http://www.ebu.ch/ebucore/smpte/class13/element}rightsCoverageObject" minOccurs="0"/>
 *         &lt;element ref="{http://www.ebu.ch/ebucore/smpte/class13/element}rightsHolderEntityObjects" minOccurs="0"/>
 *         &lt;element ref="{http://www.ebu.ch/ebucore/smpte/class13/element}rightsLink" minOccurs="0"/>
 *         &lt;element ref="{http://www.ebu.ch/ebucore/smpte/class13/element}rightsFormatReferenceObjects" minOccurs="0"/>
 *         &lt;element ref="{http://www.ebu.ch/ebucore/smpte/class13/element}rightsID" minOccurs="0"/>
 *         &lt;element ref="{http://www.ebu.ch/ebucore/smpte/class13/element}processingRestrictionFlag" minOccurs="0"/>
 *         &lt;element ref="{http://www.ebu.ch/ebucore/smpte/class13/element}rightsTypeGroupObject" minOccurs="0"/>
 *         &lt;element ref="{http://www.ebu.ch/ebucore/smpte/class13/element}rightsAttributedIDObjects" minOccurs="0"/>
 *         &lt;element ref="{http://www.ebu.ch/ebucore/smpte/class13/element}rightsContactObjects" minOccurs="0"/>
 *         &lt;element ref="{http://www.ebu.ch/ebucore/smpte/class13/element}rightsClearanceFlag" minOccurs="0"/>
 *         &lt;element ref="{http://www.ebu.ch/ebucore/smpte/class13/element}exploitationIssuesObjects" minOccurs="0"/>
 *         &lt;element ref="{http://www.ebu.ch/ebucore/smpte/class13/element}rightsNote" minOccurs="0"/>
 *         &lt;element ref="{http://www.ebu.ch/ebucore/smpte/class13/element}rightsValueObjects" minOccurs="0"/>
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
@XmlRootElement(name = "rights")
public class Rights {

    @XmlElement(namespace = "http://www.ebu.ch/ebucore/smpte/class13/element")
    protected TextualAnnotationStrongReferenceSet disclaimerObjects;
    @XmlElement(namespace = "http://www.ebu.ch/ebucore/smpte/class13/element")
    protected TextualAnnotationStrongReferenceSet copyrightStatementObjects;
    @XmlElement(namespace = "http://www.ebu.ch/ebucore/smpte/class13/element")
    protected CoverageStrongReference rightsCoverageObject;
    @XmlElement(namespace = "http://www.ebu.ch/ebucore/smpte/class13/element")
    protected EntityStrongReferenceSet rightsHolderEntityObjects;
    @XmlElement(namespace = "http://www.ebu.ch/ebucore/smpte/class13/element")
    protected UTF16String rightsLink;
    @XmlElement(namespace = "http://www.ebu.ch/ebucore/smpte/class13/element")
    protected IDRefStrongReferenceSet rightsFormatReferenceObjects;
    @XmlElement(namespace = "http://www.ebu.ch/ebucore/smpte/class13/element")
    protected UTF16String rightsID;
    @XmlElement(namespace = "http://www.ebu.ch/ebucore/smpte/class13/element")
    @XmlSchemaType(name = "token")
    protected Boolean processingRestrictionFlag;
    @XmlElement(namespace = "http://www.ebu.ch/ebucore/smpte/class13/element")
    protected TypeGroupStrongReference rightsTypeGroupObject;
    @XmlElement(namespace = "http://www.ebu.ch/ebucore/smpte/class13/element")
    protected IdentifierStrongReferenceSet rightsAttributedIDObjects;
    @XmlElement(namespace = "http://www.ebu.ch/ebucore/smpte/class13/element")
    protected ContactStrongReferenceSet rightsContactObjects;
    @XmlElement(namespace = "http://www.ebu.ch/ebucore/smpte/class13/element")
    @XmlSchemaType(name = "token")
    protected Boolean rightsClearanceFlag;
    @XmlElement(namespace = "http://www.ebu.ch/ebucore/smpte/class13/element")
    protected TextualAnnotationStrongReferenceSet exploitationIssuesObjects;
    @XmlElement(namespace = "http://www.ebu.ch/ebucore/smpte/class13/element")
    protected UTF16String rightsNote;
    @XmlElement(namespace = "http://www.ebu.ch/ebucore/smpte/class13/element")
    protected TextualAnnotationStrongReferenceSet rightsValueObjects;
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
     * Gets the value of the disclaimerObjects property.
     * 
     * @return
     *     possible object is
     *     {@link TextualAnnotationStrongReferenceSet }
     *     
     */
    public TextualAnnotationStrongReferenceSet getDisclaimerObjects() {
        return disclaimerObjects;
    }

    /**
     * Sets the value of the disclaimerObjects property.
     * 
     * @param value
     *     allowed object is
     *     {@link TextualAnnotationStrongReferenceSet }
     *     
     */
    public void setDisclaimerObjects(TextualAnnotationStrongReferenceSet value) {
        this.disclaimerObjects = value;
    }

    /**
     * Gets the value of the copyrightStatementObjects property.
     * 
     * @return
     *     possible object is
     *     {@link TextualAnnotationStrongReferenceSet }
     *     
     */
    public TextualAnnotationStrongReferenceSet getCopyrightStatementObjects() {
        return copyrightStatementObjects;
    }

    /**
     * Sets the value of the copyrightStatementObjects property.
     * 
     * @param value
     *     allowed object is
     *     {@link TextualAnnotationStrongReferenceSet }
     *     
     */
    public void setCopyrightStatementObjects(TextualAnnotationStrongReferenceSet value) {
        this.copyrightStatementObjects = value;
    }

    /**
     * Gets the value of the rightsCoverageObject property.
     * 
     * @return
     *     possible object is
     *     {@link CoverageStrongReference }
     *     
     */
    public CoverageStrongReference getRightsCoverageObject() {
        return rightsCoverageObject;
    }

    /**
     * Sets the value of the rightsCoverageObject property.
     * 
     * @param value
     *     allowed object is
     *     {@link CoverageStrongReference }
     *     
     */
    public void setRightsCoverageObject(CoverageStrongReference value) {
        this.rightsCoverageObject = value;
    }

    /**
     * Gets the value of the rightsHolderEntityObjects property.
     * 
     * @return
     *     possible object is
     *     {@link EntityStrongReferenceSet }
     *     
     */
    public EntityStrongReferenceSet getRightsHolderEntityObjects() {
        return rightsHolderEntityObjects;
    }

    /**
     * Sets the value of the rightsHolderEntityObjects property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityStrongReferenceSet }
     *     
     */
    public void setRightsHolderEntityObjects(EntityStrongReferenceSet value) {
        this.rightsHolderEntityObjects = value;
    }

    /**
     * Gets the value of the rightsLink property.
     * 
     * @return
     *     possible object is
     *     {@link UTF16String }
     *     
     */
    public UTF16String getRightsLink() {
        return rightsLink;
    }

    /**
     * Sets the value of the rightsLink property.
     * 
     * @param value
     *     allowed object is
     *     {@link UTF16String }
     *     
     */
    public void setRightsLink(UTF16String value) {
        this.rightsLink = value;
    }

    /**
     * Gets the value of the rightsFormatReferenceObjects property.
     * 
     * @return
     *     possible object is
     *     {@link IDRefStrongReferenceSet }
     *     
     */
    public IDRefStrongReferenceSet getRightsFormatReferenceObjects() {
        return rightsFormatReferenceObjects;
    }

    /**
     * Sets the value of the rightsFormatReferenceObjects property.
     * 
     * @param value
     *     allowed object is
     *     {@link IDRefStrongReferenceSet }
     *     
     */
    public void setRightsFormatReferenceObjects(IDRefStrongReferenceSet value) {
        this.rightsFormatReferenceObjects = value;
    }

    /**
     * Gets the value of the rightsID property.
     * 
     * @return
     *     possible object is
     *     {@link UTF16String }
     *     
     */
    public UTF16String getRightsID() {
        return rightsID;
    }

    /**
     * Sets the value of the rightsID property.
     * 
     * @param value
     *     allowed object is
     *     {@link UTF16String }
     *     
     */
    public void setRightsID(UTF16String value) {
        this.rightsID = value;
    }

    /**
     * Gets the value of the processingRestrictionFlag property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean getProcessingRestrictionFlag() {
        return processingRestrictionFlag;
    }

    /**
     * Sets the value of the processingRestrictionFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setProcessingRestrictionFlag(Boolean value) {
        this.processingRestrictionFlag = value;
    }

    /**
     * Gets the value of the rightsTypeGroupObject property.
     * 
     * @return
     *     possible object is
     *     {@link TypeGroupStrongReference }
     *     
     */
    public TypeGroupStrongReference getRightsTypeGroupObject() {
        return rightsTypeGroupObject;
    }

    /**
     * Sets the value of the rightsTypeGroupObject property.
     * 
     * @param value
     *     allowed object is
     *     {@link TypeGroupStrongReference }
     *     
     */
    public void setRightsTypeGroupObject(TypeGroupStrongReference value) {
        this.rightsTypeGroupObject = value;
    }

    /**
     * Gets the value of the rightsAttributedIDObjects property.
     * 
     * @return
     *     possible object is
     *     {@link IdentifierStrongReferenceSet }
     *     
     */
    public IdentifierStrongReferenceSet getRightsAttributedIDObjects() {
        return rightsAttributedIDObjects;
    }

    /**
     * Sets the value of the rightsAttributedIDObjects property.
     * 
     * @param value
     *     allowed object is
     *     {@link IdentifierStrongReferenceSet }
     *     
     */
    public void setRightsAttributedIDObjects(IdentifierStrongReferenceSet value) {
        this.rightsAttributedIDObjects = value;
    }

    /**
     * Gets the value of the rightsContactObjects property.
     * 
     * @return
     *     possible object is
     *     {@link ContactStrongReferenceSet }
     *     
     */
    public ContactStrongReferenceSet getRightsContactObjects() {
        return rightsContactObjects;
    }

    /**
     * Sets the value of the rightsContactObjects property.
     * 
     * @param value
     *     allowed object is
     *     {@link ContactStrongReferenceSet }
     *     
     */
    public void setRightsContactObjects(ContactStrongReferenceSet value) {
        this.rightsContactObjects = value;
    }

    /**
     * Gets the value of the rightsClearanceFlag property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean getRightsClearanceFlag() {
        return rightsClearanceFlag;
    }

    /**
     * Sets the value of the rightsClearanceFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setRightsClearanceFlag(Boolean value) {
        this.rightsClearanceFlag = value;
    }

    /**
     * Gets the value of the exploitationIssuesObjects property.
     * 
     * @return
     *     possible object is
     *     {@link TextualAnnotationStrongReferenceSet }
     *     
     */
    public TextualAnnotationStrongReferenceSet getExploitationIssuesObjects() {
        return exploitationIssuesObjects;
    }

    /**
     * Sets the value of the exploitationIssuesObjects property.
     * 
     * @param value
     *     allowed object is
     *     {@link TextualAnnotationStrongReferenceSet }
     *     
     */
    public void setExploitationIssuesObjects(TextualAnnotationStrongReferenceSet value) {
        this.exploitationIssuesObjects = value;
    }

    /**
     * Gets the value of the rightsNote property.
     * 
     * @return
     *     possible object is
     *     {@link UTF16String }
     *     
     */
    public UTF16String getRightsNote() {
        return rightsNote;
    }

    /**
     * Sets the value of the rightsNote property.
     * 
     * @param value
     *     allowed object is
     *     {@link UTF16String }
     *     
     */
    public void setRightsNote(UTF16String value) {
        this.rightsNote = value;
    }

    /**
     * Gets the value of the rightsValueObjects property.
     * 
     * @return
     *     possible object is
     *     {@link TextualAnnotationStrongReferenceSet }
     *     
     */
    public TextualAnnotationStrongReferenceSet getRightsValueObjects() {
        return rightsValueObjects;
    }

    /**
     * Sets the value of the rightsValueObjects property.
     * 
     * @param value
     *     allowed object is
     *     {@link TextualAnnotationStrongReferenceSet }
     *     
     */
    public void setRightsValueObjects(TextualAnnotationStrongReferenceSet value) {
        this.rightsValueObjects = value;
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
