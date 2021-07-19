
package eu.taxud.dac6.v4;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlValue;


/**
 * <p>Classe Java per Arrangement_Type complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="Arrangement_Type">
 *   &lt;simpleContent>
 *     &lt;extension base="&lt;urn:eu:taxud:dac6:v1>UUID_Type">
 *       &lt;attribute name="IncoherentArrangement" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="MarketableArrangement" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *     &lt;/extension>
 *   &lt;/simpleContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Arrangement_Type", namespace = "urn:eu:taxud:dac6:v1", propOrder = {
    "value"
})
public class ArrangementType {

    @XmlValue
    protected String value;
    @XmlAttribute(name = "IncoherentArrangement")
    protected Boolean incoherentArrangement;
    @XmlAttribute(name = "MarketableArrangement")
    protected Boolean marketableArrangement;

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
     * Recupera il valore della proprietà incoherentArrangement.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIncoherentArrangement() {
        return incoherentArrangement;
    }

    /**
     * Imposta il valore della proprietà incoherentArrangement.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIncoherentArrangement(Boolean value) {
        this.incoherentArrangement = value;
    }

    /**
     * Recupera il valore della proprietà marketableArrangement.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isMarketableArrangement() {
        return marketableArrangement;
    }

    /**
     * Imposta il valore della proprietà marketableArrangement.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setMarketableArrangement(Boolean value) {
        this.marketableArrangement = value;
    }

}
