
package eu.taxud.dac6.v4;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java per CountryExemptions_Type complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="CountryExemptions_Type">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="CountryExemption" type="{urn:eu:taxud:isotypes:v1}MSCountryCode_Type" maxOccurs="unbounded"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CountryExemptions_Type", namespace = "urn:eu:taxud:dac6:v1", propOrder = {
    "countryExemption"
})
public class CountryExemptionsType {

    @XmlElement(name = "CountryExemption", namespace = "urn:eu:taxud:dac6:v1", required = true)
    @XmlSchemaType(name = "string")
    protected List<MSCountryCodeType> countryExemption;

    /**
     * Gets the value of the countryExemption property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the countryExemption property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCountryExemption().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link MSCountryCodeType }
     * 
     * 
     */
    public List<MSCountryCodeType> getCountryExemption() {
        if (countryExemption == null) {
            countryExemption = new ArrayList<MSCountryCodeType>();
        }
        return this.countryExemption;
    }

}
