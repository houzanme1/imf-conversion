//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2016.08.11 at 01:51:42 PM MSK 
//


package org.smpte_ra.reg._2003._2012;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ReferenceType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ReferenceType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token">
 *     &lt;enumeration value="RefLimitMinimum"/>
 *     &lt;enumeration value="RefLimitMaximum"/>
 *     &lt;enumeration value="RefMinimum"/>
 *     &lt;enumeration value="RefMaximum"/>
 *     &lt;enumeration value="RefEnumvalue"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "ReferenceType")
@XmlEnum
public enum ReferenceType {

    @XmlEnumValue("RefLimitMinimum")
    REF_LIMIT_MINIMUM("RefLimitMinimum"),
    @XmlEnumValue("RefLimitMaximum")
    REF_LIMIT_MAXIMUM("RefLimitMaximum"),
    @XmlEnumValue("RefMinimum")
    REF_MINIMUM("RefMinimum"),
    @XmlEnumValue("RefMaximum")
    REF_MAXIMUM("RefMaximum"),
    @XmlEnumValue("RefEnumvalue")
    REF_ENUMVALUE("RefEnumvalue");
    private final String value;

    ReferenceType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ReferenceType fromValue(String v) {
        for (ReferenceType c: ReferenceType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}