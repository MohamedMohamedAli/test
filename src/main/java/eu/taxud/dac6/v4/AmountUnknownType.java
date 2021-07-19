
package eu.taxud.dac6.v4;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlValue;


/**
 * 
 *                 This data type is to be used whenever monetary amounts are to be communicated. Such amounts shall be
 *                 given
 *                 in full units, i.e. without decimals. The code for the currency in which the value is expressed has
 *                 to be
 *                 taken from the ISO codelist 4217 and added in attribute currCode.
 *             
 * 
 * <p>Classe Java per AmountUnknown_Type complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="AmountUnknown_Type">
 *   &lt;simpleContent>
 *     &lt;extension base="&lt;urn:eu:taxud:dac6:v1>Long_Type">
 *       &lt;attribute name="currCode" type="{urn:eu:taxud:isotypes:v1}currCode_Type" />
 *       &lt;attribute name="unknown" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *     &lt;/extension>
 *   &lt;/simpleContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AmountUnknown_Type", namespace = "urn:eu:taxud:dac6:v1", propOrder = {
    "value"
})
public class AmountUnknownType {

    @XmlValue
    protected String value;
    @XmlAttribute(name = "currCode")
    protected CurrCodeType currCode;
    @XmlAttribute(name = "unknown")
    protected Boolean unknown;

    /**
     * Recupera il valore della proprietà value.
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
     * Recupera il valore della proprietà currCode.
     * 
     * @return
     *     possible object is
     *     {@link CurrCodeType }
     *     
     */
    public CurrCodeType getCurrCode() {
        return currCode;
    }

    /**
     * Imposta il valore della proprietà currCode.
     * 
     * @param value
     *     allowed object is
     *     {@link CurrCodeType }
     *     
     */
    public void setCurrCode(CurrCodeType value) {
        this.currCode = value;
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
