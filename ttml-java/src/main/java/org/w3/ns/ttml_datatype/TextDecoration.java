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
 * <p>Java class for textDecoration.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="textDecoration">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token">
 *     &lt;enumeration value="none"/>
 *     &lt;enumeration value="underline"/>
 *     &lt;enumeration value="noUnderline"/>
 *     &lt;enumeration value="overline"/>
 *     &lt;enumeration value="noOverline"/>
 *     &lt;enumeration value="lineThrough"/>
 *     &lt;enumeration value="noLineThrough"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "textDecoration", namespace = "http://www.w3.org/ns/ttml#datatype")
@XmlEnum
public enum TextDecoration {

    @XmlEnumValue("none")
    NONE("none"),
    @XmlEnumValue("underline")
    UNDERLINE("underline"),
    @XmlEnumValue("noUnderline")
    NO_UNDERLINE("noUnderline"),
    @XmlEnumValue("overline")
    OVERLINE("overline"),
    @XmlEnumValue("noOverline")
    NO_OVERLINE("noOverline"),
    @XmlEnumValue("lineThrough")
    LINE_THROUGH("lineThrough"),
    @XmlEnumValue("noLineThrough")
    NO_LINE_THROUGH("noLineThrough");
    private final String value;

    TextDecoration(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static TextDecoration fromValue(String v) {
        for (TextDecoration c: TextDecoration.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}