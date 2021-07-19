
package eu.taxud.dac6.v4;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java per Intermediary_Type complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="Intermediary_Type">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ID" type="{urn:eu:taxud:dac6:v1}PersonOrOrganisationUnknown_Type"/>
 *         &lt;element name="Capacity" type="{urn:eu:taxud:dac6:v1}IntermediaryCapacity_EnumType" minOccurs="0"/>
 *         &lt;element name="NationalExemption" type="{urn:eu:taxud:dac6:v1}NationalExemption_Type" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Intermediary_Type", namespace = "urn:eu:taxud:dac6:v1", propOrder = {
    "id",
    "capacity",
    "nationalExemption"
})
@XmlSeeAlso({
    Intermediary.class
})
public class IntermediaryType {

    @XmlElement(name = "ID", namespace = "urn:eu:taxud:dac6:v1", required = true)
    protected PersonOrOrganisationUnknownType id;
    @XmlElement(name = "Capacity", namespace = "urn:eu:taxud:dac6:v1")
    @XmlSchemaType(name = "string")
    protected IntermediaryCapacityEnumType capacity;
    @XmlElement(name = "NationalExemption", namespace = "urn:eu:taxud:dac6:v1")
    protected NationalExemptionType nationalExemption;

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
     * Recupera il valore della proprietà capacity.
     * 
     * @return
     *     possible object is
     *     {@link IntermediaryCapacityEnumType }
     *     
     */
    public IntermediaryCapacityEnumType getCapacity() {
        return capacity;
    }

    /**
     * Imposta il valore della proprietà capacity.
     * 
     * @param value
     *     allowed object is
     *     {@link IntermediaryCapacityEnumType }
     *     
     */
    public void setCapacity(IntermediaryCapacityEnumType value) {
        this.capacity = value;
    }

    /**
     * Recupera il valore della proprietà nationalExemption.
     * 
     * @return
     *     possible object is
     *     {@link NationalExemptionType }
     *     
     */
    public NationalExemptionType getNationalExemption() {
        return nationalExemption;
    }

    /**
     * Imposta il valore della proprietà nationalExemption.
     * 
     * @param value
     *     allowed object is
     *     {@link NationalExemptionType }
     *     
     */
    public void setNationalExemption(NationalExemptionType value) {
        this.nationalExemption = value;
    }

}
