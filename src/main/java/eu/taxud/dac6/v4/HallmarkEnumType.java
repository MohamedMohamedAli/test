
package eu.taxud.dac6.v4;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java per HallmarkEnum_Type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * <p>
 * <pre>
 * &lt;simpleType name="HallmarkEnum_Type">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="DAC6A1"/>
 *     &lt;enumeration value="DAC6A2a"/>
 *     &lt;enumeration value="DAC6A2b"/>
 *     &lt;enumeration value="DAC6A3"/>
 *     &lt;enumeration value="DAC6B1"/>
 *     &lt;enumeration value="DAC6B2"/>
 *     &lt;enumeration value="DAC6B3"/>
 *     &lt;enumeration value="DAC6C1a"/>
 *     &lt;enumeration value="DAC6C1bi"/>
 *     &lt;enumeration value="DAC6C1bii"/>
 *     &lt;enumeration value="DAC6C1c"/>
 *     &lt;enumeration value="DAC6C1d"/>
 *     &lt;enumeration value="DAC6C2"/>
 *     &lt;enumeration value="DAC6C3"/>
 *     &lt;enumeration value="DAC6C4"/>
 *     &lt;enumeration value="DAC6D1Other"/>
 *     &lt;enumeration value="DAC6D1a"/>
 *     &lt;enumeration value="DAC6D1b"/>
 *     &lt;enumeration value="DAC6D1c"/>
 *     &lt;enumeration value="DAC6D1d"/>
 *     &lt;enumeration value="DAC6D1e"/>
 *     &lt;enumeration value="DAC6D1f"/>
 *     &lt;enumeration value="DAC6D2"/>
 *     &lt;enumeration value="DAC6E1"/>
 *     &lt;enumeration value="DAC6E2"/>
 *     &lt;enumeration value="DAC6E3"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "HallmarkEnum_Type", namespace = "urn:eu:taxud:dac6:v1")
@XmlEnum
public enum HallmarkEnumType {


    /**
     * Hallmark A1
     * 
     */
    @XmlEnumValue("DAC6A1")
    DAC_6_A_1("DAC6A1"),

    /**
     * Hallmark A2a
     * 
     */
    @XmlEnumValue("DAC6A2a")
    DAC_6_A_2_A("DAC6A2a"),

    /**
     * Hallmark A2b
     * 
     */
    @XmlEnumValue("DAC6A2b")
    DAC_6_A_2_B("DAC6A2b"),

    /**
     * Hallmark A3
     * 
     */
    @XmlEnumValue("DAC6A3")
    DAC_6_A_3("DAC6A3"),

    /**
     * Hallmark B1
     * 
     */
    @XmlEnumValue("DAC6B1")
    DAC_6_B_1("DAC6B1"),

    /**
     * Hallmark B2
     * 
     */
    @XmlEnumValue("DAC6B2")
    DAC_6_B_2("DAC6B2"),

    /**
     * Hallmark B3
     * 
     */
    @XmlEnumValue("DAC6B3")
    DAC_6_B_3("DAC6B3"),

    /**
     * Hallmark C1a
     * 
     */
    @XmlEnumValue("DAC6C1a")
    DAC_6_C_1_A("DAC6C1a"),

    /**
     * Hallmark C1bi
     * 
     */
    @XmlEnumValue("DAC6C1bi")
    DAC_6_C_1_BI("DAC6C1bi"),

    /**
     * Hallmark C1bii
     * 
     */
    @XmlEnumValue("DAC6C1bii")
    DAC_6_C_1_BII("DAC6C1bii"),

    /**
     * Hallmark C1c
     * 
     */
    @XmlEnumValue("DAC6C1c")
    DAC_6_C_1_C("DAC6C1c"),

    /**
     * Hallmark C1d
     * 
     */
    @XmlEnumValue("DAC6C1d")
    DAC_6_C_1_D("DAC6C1d"),

    /**
     * Hallmark C2
     * 
     */
    @XmlEnumValue("DAC6C2")
    DAC_6_C_2("DAC6C2"),

    /**
     * Hallmark C3
     * 
     */
    @XmlEnumValue("DAC6C3")
    DAC_6_C_3("DAC6C3"),

    /**
     * Hallmark C4
     * 
     */
    @XmlEnumValue("DAC6C4")
    DAC_6_C_4("DAC6C4"),

    /**
     * Hallmark D1 - Other
     * 
     */
    @XmlEnumValue("DAC6D1Other")
    DAC_6_D_1_OTHER("DAC6D1Other"),

    /**
     * Hallmark D1a
     * 
     */
    @XmlEnumValue("DAC6D1a")
    DAC_6_D_1_A("DAC6D1a"),

    /**
     * Hallmark D1b
     * 
     */
    @XmlEnumValue("DAC6D1b")
    DAC_6_D_1_B("DAC6D1b"),

    /**
     * Hallmark D1c
     * 
     */
    @XmlEnumValue("DAC6D1c")
    DAC_6_D_1_C("DAC6D1c"),

    /**
     * Hallmark D1d
     * 
     */
    @XmlEnumValue("DAC6D1d")
    DAC_6_D_1_D("DAC6D1d"),

    /**
     * Hallmark D1e
     * 
     */
    @XmlEnumValue("DAC6D1e")
    DAC_6_D_1_E("DAC6D1e"),

    /**
     * Hallmark D1f
     * 
     */
    @XmlEnumValue("DAC6D1f")
    DAC_6_D_1_F("DAC6D1f"),

    /**
     * Hallmark D2a, D2b and D2c
     * 
     */
    @XmlEnumValue("DAC6D2")
    DAC_6_D_2("DAC6D2"),

    /**
     * Hallmark E1
     * 
     */
    @XmlEnumValue("DAC6E1")
    DAC_6_E_1("DAC6E1"),

    /**
     * Hallmark E2a and E2b
     * 
     */
    @XmlEnumValue("DAC6E2")
    DAC_6_E_2("DAC6E2"),

    /**
     * Hallmark E3
     * 
     */
    @XmlEnumValue("DAC6E3")
    DAC_6_E_3("DAC6E3");
    private final String value;

    HallmarkEnumType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static HallmarkEnumType fromValue(String v) {
        for (HallmarkEnumType c: HallmarkEnumType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
