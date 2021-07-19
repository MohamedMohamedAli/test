
package eu.taxud.dac6.v4;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java per IntermediaryCapacity_EnumType.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * <p>
 * <pre>
 * &lt;simpleType name="IntermediaryCapacity_EnumType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="DAC61101"/>
 *     &lt;enumeration value="DAC61102"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "IntermediaryCapacity_EnumType", namespace = "urn:eu:taxud:dac6:v1")
@XmlEnum
public enum IntermediaryCapacityEnumType {


    /**
     * Designer / Promoter / Implementation (managing/organizing/executing)
     *                     
     * 
     */
    @XmlEnumValue("DAC61101")
    DAC_61101("DAC61101"),

    /**
     * Service Provider / Assistant
     * 
     */
    @XmlEnumValue("DAC61102")
    DAC_61102("DAC61102");
    private final String value;

    IntermediaryCapacityEnumType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static IntermediaryCapacityEnumType fromValue(String v) {
        for (IntermediaryCapacityEnumType c: IntermediaryCapacityEnumType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
