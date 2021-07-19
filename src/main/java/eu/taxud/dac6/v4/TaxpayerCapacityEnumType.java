
package eu.taxud.dac6.v4;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java per TaxpayerCapacity_EnumType.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * <p>
 * <pre>
 * &lt;simpleType name="TaxpayerCapacity_EnumType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="DAC61104"/>
 *     &lt;enumeration value="DAC61105"/>
 *     &lt;enumeration value="DAC61106"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "TaxpayerCapacity_EnumType", namespace = "urn:eu:taxud:dac6:v1")
@XmlEnum
public enum TaxpayerCapacityEnumType {


    /**
     * Professional secrecy of intermediary
     * 
     */
    @XmlEnumValue("DAC61104")
    DAC_61104("DAC61104"),

    /**
     * Intermediary in non-EU country
     * 
     */
    @XmlEnumValue("DAC61105")
    DAC_61105("DAC61105"),

    /**
     * In-house Arrangement
     * 
     */
    @XmlEnumValue("DAC61106")
    DAC_61106("DAC61106");
    private final String value;

    TaxpayerCapacityEnumType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static TaxpayerCapacityEnumType fromValue(String v) {
        for (TaxpayerCapacityEnumType c: TaxpayerCapacityEnumType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
