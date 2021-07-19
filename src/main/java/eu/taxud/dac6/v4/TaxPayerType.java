
package eu.taxud.dac6.v4;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java per TaxPayer_Type complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="TaxPayer_Type">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ID" type="{urn:eu:taxud:dac6:v1}PersonOrOrganisationUnknown_Type"/>
 *         &lt;element name="TaxpayerImplementingDate" type="{urn:eu:taxud:dac6:v1}DateUnknown_Type" minOccurs="0"/>
 *         &lt;element name="AssociatedEnterprises" type="{urn:eu:taxud:dac6:v1}AssociatedEnterprises_Type" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TaxPayer_Type", namespace = "urn:eu:taxud:dac6:v1", propOrder = {
    "id",
    "taxpayerImplementingDate",
    "associatedEnterprises"
})
@XmlSeeAlso({
    TaxPayer.class
})
public class TaxPayerType {

    @XmlElement(name = "ID", namespace = "urn:eu:taxud:dac6:v1", required = true)
    protected PersonOrOrganisationUnknownType id;
    @XmlElement(name = "TaxpayerImplementingDate", namespace = "urn:eu:taxud:dac6:v1")
    protected DateUnknownType taxpayerImplementingDate;
    @XmlElement(name = "AssociatedEnterprises", namespace = "urn:eu:taxud:dac6:v1")
    protected AssociatedEnterprisesType associatedEnterprises;

    /**
     * Recupera il valore della proprietà id.
     * 
     * @return
     *     possible object is
     *     {@link PersonOrOrganisationUnknownType }
     *     
     */
    public PersonOrOrganisationUnknownType getID() {
        return id;
    }

    /**
     * Imposta il valore della proprietà id.
     * 
     * @param value
     *     allowed object is
     *     {@link PersonOrOrganisationUnknownType }
     *     
     */
    public void setID(PersonOrOrganisationUnknownType value) {
        this.id = value;
    }

    /**
     * Recupera il valore della proprietà taxpayerImplementingDate.
     * 
     * @return
     *     possible object is
     *     {@link DateUnknownType }
     *     
     */
    public DateUnknownType getTaxpayerImplementingDate() {
        return taxpayerImplementingDate;
    }

    /**
     * Imposta il valore della proprietà taxpayerImplementingDate.
     * 
     * @param value
     *     allowed object is
     *     {@link DateUnknownType }
     *     
     */
    public void setTaxpayerImplementingDate(DateUnknownType value) {
        this.taxpayerImplementingDate = value;
    }

    /**
     * Recupera il valore della proprietà associatedEnterprises.
     * 
     * @return
     *     possible object is
     *     {@link AssociatedEnterprisesType }
     *     
     */
    public AssociatedEnterprisesType getAssociatedEnterprises() {
        return associatedEnterprises;
    }

    /**
     * Imposta il valore della proprietà associatedEnterprises.
     * 
     * @param value
     *     allowed object is
     *     {@link AssociatedEnterprisesType }
     *     
     */
    public void setAssociatedEnterprises(AssociatedEnterprisesType value) {
        this.associatedEnterprises = value;
    }

}
