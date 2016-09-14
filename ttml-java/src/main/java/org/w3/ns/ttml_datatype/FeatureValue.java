//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2016.08.11 at 04:29:49 PM MSK 
//


package org.w3.ns.ttml_datatype;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for featureValue.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="featureValue">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token">
 *     &lt;enumeration value="optional"/>
 *     &lt;enumeration value="required"/>
 *     &lt;enumeration value="use"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "featureValue", namespace = "http://www.w3.org/ns/ttml#datatype")
@XmlEnum
public enum FeatureValue {

    @XmlEnumValue("optional")
    OPTIONAL("optional"),
    @XmlEnumValue("required")
    REQUIRED("required"),
    @XmlEnumValue("use")
    USE("use");
    private final String value;

    FeatureValue(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static FeatureValue fromValue(String v) {
        for (FeatureValue c: FeatureValue.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
