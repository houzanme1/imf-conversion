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
 * <p>Java class for ColorCorrectionFilterWheelSettingType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ColorCorrectionFilterWheelSettingType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token">
 *     &lt;enumeration value="ColorCorrectionFilterWheelSetting_CrossEffectFilter"/>
 *     &lt;enumeration value="ColorCorrectionFilterWheelSetting_CCFilter3200K"/>
 *     &lt;enumeration value="ColorCorrectionFilterWheelSetting_CCFilter4300K"/>
 *     &lt;enumeration value="ColorCorrectionFilterWheelSetting_CCFilter6300K"/>
 *     &lt;enumeration value="ColorCorrectionFilterWheelSetting_CCFilter5600K"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "ColorCorrectionFilterWheelSettingType")
@XmlEnum
public enum ColorCorrectionFilterWheelSettingType {

    @XmlEnumValue("ColorCorrectionFilterWheelSetting_CrossEffectFilter")
    COLOR_CORRECTION_FILTER_WHEEL_SETTING_CROSS_EFFECT_FILTER("ColorCorrectionFilterWheelSetting_CrossEffectFilter"),
    @XmlEnumValue("ColorCorrectionFilterWheelSetting_CCFilter3200K")
    COLOR_CORRECTION_FILTER_WHEEL_SETTING_CC_FILTER_3200_K("ColorCorrectionFilterWheelSetting_CCFilter3200K"),
    @XmlEnumValue("ColorCorrectionFilterWheelSetting_CCFilter4300K")
    COLOR_CORRECTION_FILTER_WHEEL_SETTING_CC_FILTER_4300_K("ColorCorrectionFilterWheelSetting_CCFilter4300K"),
    @XmlEnumValue("ColorCorrectionFilterWheelSetting_CCFilter6300K")
    COLOR_CORRECTION_FILTER_WHEEL_SETTING_CC_FILTER_6300_K("ColorCorrectionFilterWheelSetting_CCFilter6300K"),
    @XmlEnumValue("ColorCorrectionFilterWheelSetting_CCFilter5600K")
    COLOR_CORRECTION_FILTER_WHEEL_SETTING_CC_FILTER_5600_K("ColorCorrectionFilterWheelSetting_CCFilter5600K");
    private final String value;

    ColorCorrectionFilterWheelSettingType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ColorCorrectionFilterWheelSettingType fromValue(String v) {
        for (ColorCorrectionFilterWheelSettingType c: ColorCorrectionFilterWheelSettingType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
