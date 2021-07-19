
package eu.taxud.dac6.v4;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java per Incoherent_EnumType.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * <p>
 * <pre>
 * &lt;simpleType name="Incoherent_EnumType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="true"/>
 *     &lt;enumeration value="false"/>
 *     &lt;enumeration value="indeterminate"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "Incoherent_EnumType", namespace = "urn:eu:taxud:dac6:v1")
@XmlEnum
public enum IncoherentEnumType {

    @XmlEnumValue("true")
    TRUE("true"),
    @XmlEnumValue("false")
    FALSE("false"),
    @XmlEnumValue("indeterminate")
    INDETERMINATE("indeterminate");
    private final String value;

    IncoherentEnumType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static IncoherentEnumType fromValue(String v) {
        for (IncoherentEnumType c: IncoherentEnumType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
