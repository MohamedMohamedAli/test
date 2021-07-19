
package eu.taxud.dac6.v4;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java per DisclosureReason_EnumType.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * <p>
 * <pre>
 * &lt;simpleType name="DisclosureReason_EnumType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="DAC6701"/>
 *     &lt;enumeration value="DAC6702"/>
 *     &lt;enumeration value="DAC6703"/>
 *     &lt;enumeration value="DAC6704"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "DisclosureReason_EnumType", namespace = "urn:eu:taxud:dac6:v1")
@XmlEnum
public enum DisclosureReasonEnumType {


    /**
     * Arrangement is made available for implementation
     * 
     */
    @XmlEnumValue("DAC6701")
    DAC_6701("DAC6701"),

    /**
     * Arrangement is ready for implementation
     * 
     */
    @XmlEnumValue("DAC6702")
    DAC_6702("DAC6702"),

    /**
     * First step in the implementation of the Arrangement has been made or will be
     *                         made.
     *                     
     * 
     */
    @XmlEnumValue("DAC6703")
    DAC_6703("DAC6703"),

    /**
     * Provision of aid, assistance or advice.
     * 
     */
    @XmlEnumValue("DAC6704")
    DAC_6704("DAC6704");
    private final String value;

    DisclosureReasonEnumType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static DisclosureReasonEnumType fromValue(String v) {
        for (DisclosureReasonEnumType c: DisclosureReasonEnumType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
