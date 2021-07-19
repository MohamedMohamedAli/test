
package eu.taxud.dac6.v4;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java per IntermediaryNexus_EnumType.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * <p>
 * <pre>
 * &lt;simpleType name="IntermediaryNexus_EnumType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="INEXa"/>
 *     &lt;enumeration value="INEXb"/>
 *     &lt;enumeration value="INEXc"/>
 *     &lt;enumeration value="INEXd"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "IntermediaryNexus_EnumType", namespace = "urn:eu:taxud:dac6:v1")
@XmlEnum
public enum IntermediaryNexusEnumType {


    /**
     * The Member State where the intermediary is resident for tax purposes
     *                     
     * 
     */
    @XmlEnumValue("INEXa")
    INE_XA("INEXa"),

    /**
     * The Member State where the intermediary has a permanent establishment through
     *                         which the services with respect to the arrangement are provided
     *                     
     * 
     */
    @XmlEnumValue("INEXb")
    INE_XB("INEXb"),

    /**
     * The Member State where the intermediary is incorporated in or governed by the
     *                         laws of
     *                     
     * 
     */
    @XmlEnumValue("INEXc")
    INE_XC("INEXc"),

    /**
     * The Member State where the intermediary is registered with a professional
     *                         association related to legal, taxation or consultancy services
     *                     
     * 
     */
    @XmlEnumValue("INEXd")
    INE_XD("INEXd");
    private final String value;

    IntermediaryNexusEnumType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static IntermediaryNexusEnumType fromValue(String v) {
        for (IntermediaryNexusEnumType c: IntermediaryNexusEnumType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
