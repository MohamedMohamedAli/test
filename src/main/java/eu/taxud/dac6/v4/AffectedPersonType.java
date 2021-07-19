
package eu.taxud.dac6.v4;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java per AffectedPerson_Type complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="AffectedPerson_Type">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="AffectedPersonID" type="{urn:eu:taxud:dac6:v1}PersonOrOrganisationUnknown_Type"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AffectedPerson_Type", namespace = "urn:eu:taxud:dac6:v1", propOrder = {
    "affectedPersonID"
})
public class AffectedPersonType {

    @XmlElement(name = "AffectedPersonID", namespace = "urn:eu:taxud:dac6:v1", required = true)
    protected PersonOrOrganisationUnknownType affectedPersonID;

    /**
     * Recupera il valore della proprietà affectedPersonID.
     * 
     * @return
     *     possible object is
     *     {@link PersonOrOrganisationUnknownType }
     *     
     */
    public PersonOrOrganisationUnknownType getAffectedPersonID() {
        return affectedPersonID;
    }

    /**
     * Imposta il valore della proprietà affectedPersonID.
     * 
     * @param value
     *     allowed object is
     *     {@link PersonOrOrganisationUnknownType }
     *     
     */
    public void setAffectedPersonID(PersonOrOrganisationUnknownType value) {
        this.affectedPersonID = value;
    }

}
