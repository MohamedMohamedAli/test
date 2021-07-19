
package eu.taxud.dac6.v4;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java per PersonOrOrganisationUnknown_Type complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="PersonOrOrganisationUnknown_Type">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;choice>
 *           &lt;element name="Individual" type="{urn:eu:taxud:dac6:v1}PersonUnknown_Type"/>
 *           &lt;element name="Organisation" type="{urn:eu:taxud:dac6:v1}OrganisationUnknown_Type"/>
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
@XmlType(name = "PersonOrOrganisationUnknown_Type", namespace = "urn:eu:taxud:dac6:v1", propOrder = {
    "individual",
    "organisation"
})
public class PersonOrOrganisationUnknownType {

    @XmlElement(name = "Individual", namespace = "urn:eu:taxud:dac6:v1")
    protected PersonUnknownType individual;
    @XmlElement(name = "Organisation", namespace = "urn:eu:taxud:dac6:v1")
    protected OrganisationUnknownType organisation;

    /**
     * Recupera il valore della proprietà individual.
     * 
     * @return
     *     possible object is
     *     {@link PersonUnknownType }
     *     
     */
    public PersonUnknownType getIndividual() {
        return individual;
    }

    /**
     * Imposta il valore della proprietà individual.
     * 
     * @param value
     *     allowed object is
     *     {@link PersonUnknownType }
     *     
     */
    public void setIndividual(PersonUnknownType value) {
        this.individual = value;
    }

    /**
     * Recupera il valore della proprietà organisation.
     * 
     * @return
     *     possible object is
     *     {@link OrganisationUnknownType }
     *     
     */
    public OrganisationUnknownType getOrganisation() {
        return organisation;
    }

    /**
     * Imposta il valore della proprietà organisation.
     * 
     * @param value
     *     allowed object is
     *     {@link OrganisationUnknownType }
     *     
     */
    public void setOrganisation(OrganisationUnknownType value) {
        this.organisation = value;
    }

}
