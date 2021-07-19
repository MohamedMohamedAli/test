
package eu.taxud.dac6.v4;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java per RelevantTaxpayerNexus_EnumType.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * <p>
 * <pre>
 * &lt;simpleType name="RelevantTaxpayerNexus_EnumType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="RTNEXa"/>
 *     &lt;enumeration value="RTNEXb"/>
 *     &lt;enumeration value="RTNEXc"/>
 *     &lt;enumeration value="RTNEXd"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "RelevantTaxpayerNexus_EnumType", namespace = "urn:eu:taxud:dac6:v1")
@XmlEnum
public enum RelevantTaxpayerNexusEnumType {


    /**
     * The Member State where the relevant taxpayer is resident for tax purposes
     *                     
     * 
     */
    @XmlEnumValue("RTNEXa")
    RTNE_XA("RTNEXa"),

    /**
     * The Member State where the relevant taxpayer has a permanent establishment
     *                         benefiting from the arrangement
     *                     
     * 
     */
    @XmlEnumValue("RTNEXb")
    RTNE_XB("RTNEXb"),

    /**
     * The Member State where the relevant taxpayer receives income or generates
     *                         profits, although the relevant taxpayer is not resident for tax purposes and has no permanent
     *                         establishment in any Member State.
     *                     
     * 
     */
    @XmlEnumValue("RTNEXc")
    RTNE_XC("RTNEXc"),

    /**
     * The Member State where the relevant taxpayer carries on an activity, although
     *                         the relevant taxpayer is not resident for tax purposes and has no permanent establishment in
     *                         any Member State
     *                     
     * 
     */
    @XmlEnumValue("RTNEXd")
    RTNE_XD("RTNEXd");
    private final String value;

    RelevantTaxpayerNexusEnumType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static RelevantTaxpayerNexusEnumType fromValue(String v) {
        for (RelevantTaxpayerNexusEnumType c: RelevantTaxpayerNexusEnumType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
