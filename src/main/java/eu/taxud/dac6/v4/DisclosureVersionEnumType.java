
package eu.taxud.dac6.v4;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java per DisclosureVersion_EnumType.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * <p>
 * <pre>
 * &lt;simpleType name="DisclosureVersion_EnumType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="DAC6INI"/>
 *     &lt;enumeration value="DAC6UPD"/>
 *     &lt;enumeration value="DAC6UNCH"/>
 *     &lt;enumeration value="DAC6EXP"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "DisclosureVersion_EnumType", namespace = "urn:eu:taxud:dac6:v1")
@XmlEnum
public enum DisclosureVersionEnumType {


    /**
     * Create new Disclosure (neither draft nor submitted version of the imported
     *                         Disclosure already exists). The new Disclosure draft will be created whenever DAC6INI is used
     *                         during import.
     *                     
     * 
     */
    @XmlEnumValue("DAC6INI")
    DAC_6_INI("DAC6INI"),

    /**
     * Update/Correct an existing submitted Disclosure. A draft of the existing
     *                         submitted Disclosure will be created whenever DAC6UPD is used during import.
     *                     
     * 
     */
    @XmlEnumValue("DAC6UPD")
    DAC_6_UPD("DAC6UPD"),

    /**
     * Overwrite/Update existing draft Disclosure. The existing draft Disclosure will
     *                         be overwritten whenever DAC6UNCH is used during import.
     *                     
     * 
     */
    @XmlEnumValue("DAC6UNCH")
    DAC_6_UNCH("DAC6UNCH"),

    /**
     * Not used for the Import feature. This value is used by the Central Directory
     *                         when exporting Disclosure.
     *                     
     * 
     */
    @XmlEnumValue("DAC6EXP")
    DAC_6_EXP("DAC6EXP");
    private final String value;

    DisclosureVersionEnumType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static DisclosureVersionEnumType fromValue(String v) {
        for (DisclosureVersionEnumType c: DisclosureVersionEnumType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
