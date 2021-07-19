
package eu.taxud.dac6.v4;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java per AssociatedEnterprise_Type complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="AssociatedEnterprise_Type">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="AssociatedEnterpriseID" type="{urn:eu:taxud:dac6:v1}PersonOrOrganisationUnknown_Type"/>
 *         &lt;element name="AffectedPerson" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AssociatedEnterprise_Type", namespace = "urn:eu:taxud:dac6:v1", propOrder = {
    "associatedEnterpriseID",
    "affectedPerson"
})
public class AssociatedEnterpriseType {

    @XmlElement(name = "AssociatedEnterpriseID", namespace = "urn:eu:taxud:dac6:v1", required = true)
    protected PersonOrOrganisationUnknownType associatedEnterpriseID;
    @XmlElement(name = "AffectedPerson", namespace = "urn:eu:taxud:dac6:v1")
    protected boolean affectedPerson;

    /**
     * Recupera il valore della proprietà associatedEnterpriseID.
     * 
     * @return
     *     possible object is
     *     {@link PersonOrOrganisationUnknownType }
     *     
     */
    public PersonOrOrganisationUnknownType getAssociatedEnterpriseID() {
        return associatedEnterpriseID;
    }

    /**
     * Imposta il valore della proprietà associatedEnterpriseID.
     * 
     * @param value
     *     allowed object is
     *     {@link PersonOrOrganisationUnknownType }
     *     
     */
    public void setAssociatedEnterpriseID(PersonOrOrganisationUnknownType value) {
        this.associatedEnterpriseID = value;
    }

    /**
     * Recupera il valore della proprietà affectedPerson.
     * 
     */
    public boolean isAffectedPerson() {
        return affectedPerson;
    }

    /**
     * Imposta il valore della proprietà affectedPerson.
     * 
     */
    public void setAffectedPerson(boolean value) {
        this.affectedPerson = value;
    }

}
