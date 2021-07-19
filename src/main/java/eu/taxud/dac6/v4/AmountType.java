
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
 * <p>Classe Java per Amount_Type complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="Amount_Type">
 *   &lt;simpleContent>
 *     &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>long">
 *       &lt;attribute name="currCode" use="required" type="{urn:eu:taxud:isotypes:v1}currCode_Type" />
 *     &lt;/extension>
 *   &lt;/simpleContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Amount_Type", namespace = "urn:eu:taxud:dac6:v1", propOrder = {
    "value"
})
public class AmountType {

    @XmlValue
    protected long value;
    @XmlAttribute(name = "currCode", required = true)
    protected CurrCodeType currCode;

    /**
     * Recupera il valore della proprietà value.
     * 
     */
    public long getValue() {
        return value;
    }

    /**
     * Imposta il valore della proprietà value.
     * 
     */
    public void setValue(long value) {
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

}
