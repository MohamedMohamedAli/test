
package eu.taxud.dac6.v4;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlValue;


/**
 * This is the identification number/identification code for the party in
 *                 question. As the identifier may be not strictly numeric, it is just defined as a string of
 *                 characters. Attribute 'issuedBy' is required to designate the issuer of the identifier.
 *             
 * 
 * <p>Classe Java per TINUnknown_Type complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="TINUnknown_Type">
 *   &lt;simpleContent>
 *     &lt;extension base="&lt;urn:eu:taxud:dac6:v1>StringMin0Max200_Type">
 *       &lt;attribute name="issuedBy" type="{urn:eu:taxud:isotypes:v1}CountryCode_Type" />
 *       &lt;attribute name="unknown" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *     &lt;/extension>
 *   &lt;/simpleContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TINUnknown_Type", namespace = "urn:eu:taxud:dac6:v1", propOrder = {
    "value"
})
public class TINUnknownType {

    @XmlValue
    protected String value;
    @XmlAttribute(name = "issuedBy")
    protected CountryCodeType issuedBy;
    @XmlAttribute(name = "unknown")
    protected Boolean unknown;

    /**
     * Defines a string with minimum length 0 and maximum length of 200
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
     * Recupera il valore della proprietà issuedBy.
     * 
     * @return
     *     possible object is
     *     {@link CountryCodeType }
     *     
     */
    public CountryCodeType getIssuedBy() {
        return issuedBy;
    }

    /**
     * Imposta il valore della proprietà issuedBy.
     * 
     * @param value
     *     allowed object is
     *     {@link CountryCodeType }
     *     
     */
    public void setIssuedBy(CountryCodeType value) {
        this.issuedBy = value;
    }

    /**
     * Recupera il valore della proprietà unknown.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isUnknown() {
        return unknown;
    }

    /**
     * Imposta il valore della proprietà unknown.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setUnknown(Boolean value) {
        this.unknown = value;
    }

}
