
package eu.taxud.dac6.v4;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java per PersonOrOrganisation_Type complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="PersonOrOrganisation_Type">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;choice>
 *           &lt;element name="Individual" type="{urn:eu:taxud:dac6:v1}Person_Type"/>
 *           &lt;element name="Organisation" type="{urn:eu:taxud:dac6:v1}Organisation_Type"/>
 *         &lt;/choice>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PersonOrOrganisation_Type", namespace = "urn:eu:taxud:dac6:v1", propOrder = {
    "individual",
    "organisation"
})
public class PersonOrOrganisationType {

    @XmlElement(name = "Individual", namespace = "urn:eu:taxud:dac6:v1")
    protected PersonType individual;
    @XmlElement(name = "Organisation", namespace = "urn:eu:taxud:dac6:v1")
    protected OrganisationType organisation;

    /**
     * Recupera il valore della proprietà individual.
     * 
     * @return
     *     possible object is
     *     {@link PersonType }
     *     
     */
    public PersonType getIndividual() {
        return individual;
    }

    /**
     * Imposta il valore della proprietà individual.
     * 
     * @param value
     *     allowed object is
     *     {@link PersonType }
     *     
     */
    public void setIndividual(PersonType value) {
        this.individual = value;
    }

    /**
     * Recupera il valore della proprietà organisation.
     * 
     * @return
     *     possible object is
     *     {@link OrganisationType }
     *     
     */
    public OrganisationType getOrganisation() {
        return organisation;
    }

    /**
     * Imposta il valore della proprietà organisation.
     * 
     * @param value
     *     allowed object is
     *     {@link OrganisationType }
     *     
     */
    public void setOrganisation(OrganisationType value) {
        this.organisation = value;
    }

}
