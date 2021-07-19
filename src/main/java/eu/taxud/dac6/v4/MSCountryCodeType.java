
package eu.taxud.dac6.v4;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java per MSCountryCode_Type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * <p>
 * <pre>
 * &lt;simpleType name="MSCountryCode_Type">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="AT"/>
 *     &lt;enumeration value="BE"/>
 *     &lt;enumeration value="BG"/>
 *     &lt;enumeration value="CY"/>
 *     &lt;enumeration value="CZ"/>
 *     &lt;enumeration value="DK"/>
 *     &lt;enumeration value="EE"/>
 *     &lt;enumeration value="FI"/>
 *     &lt;enumeration value="FR"/>
 *     &lt;enumeration value="DE"/>
 *     &lt;enumeration value="GR"/>
 *     &lt;enumeration value="HU"/>
 *     &lt;enumeration value="HR"/>
 *     &lt;enumeration value="IE"/>
 *     &lt;enumeration value="IT"/>
 *     &lt;enumeration value="LV"/>
 *     &lt;enumeration value="LT"/>
 *     &lt;enumeration value="LU"/>
 *     &lt;enumeration value="MT"/>
 *     &lt;enumeration value="NL"/>
 *     &lt;enumeration value="PL"/>
 *     &lt;enumeration value="PT"/>
 *     &lt;enumeration value="RO"/>
 *     &lt;enumeration value="SK"/>
 *     &lt;enumeration value="SI"/>
 *     &lt;enumeration value="ES"/>
 *     &lt;enumeration value="SE"/>
 *     &lt;enumeration value="GB"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "MSCountryCode_Type", namespace = "urn:eu:taxud:isotypes:v1")
@XmlEnum
public enum MSCountryCodeType {

    AT,
    BE,
    BG,
    CY,
    CZ,
    DK,
    EE,
    FI,
    FR,
    DE,
    GR,
    HU,
    HR,
    IE,
    IT,
    LV,
    LT,
    LU,
    MT,
    NL,
    PL,
    PT,
    RO,
    SK,
    SI,
    ES,
    SE,
    GB;

    public String value() {
        return name();
    }

    public static MSCountryCodeType fromValue(String v) {
        return valueOf(v);
    }

}
