
package eu.taxud.dac6.v4;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java per NationalExemption_Type complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="NationalExemption_Type">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Exemption" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="CountryExemptions" type="{urn:eu:taxud:dac6:v1}CountryExemptions_Type" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "NationalExemption_Type", namespace = "urn:eu:taxud:dac6:v1", propOrder = {
    "exemption",
    "countryExemptions"
})
public class NationalExemptionType {

    @XmlElement(name = "Exemption", namespace = "urn:eu:taxud:dac6:v1")
    protected boolean exemption;
    @XmlElement(name = "CountryExemptions", namespace = "urn:eu:taxud:dac6:v1")
    protected CountryExemptionsType countryExemptions;

    /**
     * Recupera il valore della proprietà exemption.
     * 
     */
    public boolean isExemption() {
        return exemption;
    }

    /**
     * Imposta il valore della proprietà exemption.
     * 
     */
    public void setExemption(boolean value) {
        this.exemption = value;
    }

    /**
     * Recupera il valore della proprietà countryExemptions.
     * 
     * @return
     *     possible object is
     *     {@link CountryExemptionsType }
     *     
     */
    public CountryExemptionsType getCountryExemptions() {
        return countryExemptions;
    }

    /**
     * Imposta il valore della proprietà countryExemptions.
     * 
     * @param value
     *     allowed object is
     *     {@link CountryExemptionsType }
     *     
     */
    public void setCountryExemptions(CountryExemptionsType value) {
        this.countryExemptions = value;
    }

}
