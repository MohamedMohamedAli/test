
package eu.taxud.dac6.v4;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlValue;


/**
 * Defines a string with minimum length 1 and maximum length of 4000, with
 *                 the Language attribute
 *             
 * 
 * <p>Classe Java per StringMin1Max4000WithLang_Type complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="StringMin1Max4000WithLang_Type">
 *   &lt;simpleContent>
 *     &lt;extension base="&lt;urn:eu:taxud:dac6:v1>StringMin1Max4000_Type">
 *       &lt;attribute name="language" type="{urn:eu:taxud:isotypes:v1}LanguageCode_Type" />
 *     &lt;/extension>
 *   &lt;/simpleContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "StringMin1Max4000WithLang_Type", namespace = "urn:eu:taxud:dac6:v1", propOrder = {
    "value"
})
public class StringMin1Max4000WithLangType {

    @XmlValue
    protected String value;
    @XmlAttribute(name = "language")
    protected LanguageCodeType language;

    /**
     * Defines a string with minimum length 1 and maximum length of 4000
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getValue() {
        return value;
    }

    /**
     * Imposta il valore della proprietà value.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setValue(String value) {
        this.value = value;
    }

    /**
     * Recupera il valore della proprietà language.
     * 
     * @return
     *     possible object is
     *     {@link LanguageCodeType }
     *     
     */
    public LanguageCodeType getLanguage() {
        return language;
    }

    /**
     * Imposta il valore della proprietà language.
     * 
     * @param value
     *     allowed object is
     *     {@link LanguageCodeType }
     *     
     */
    public void setLanguage(LanguageCodeType value) {
        this.language = value;
    }

}
