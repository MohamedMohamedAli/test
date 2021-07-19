
package eu.taxud.dac6.v4;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java per Disclosing_Type complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="Disclosing_Type">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ID" type="{urn:eu:taxud:dac6:v1}PersonOrOrganisation_Type"/>
 *         &lt;element name="Liability" type="{urn:eu:taxud:dac6:v1}Liability_Type" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Disclosing_Type", namespace = "urn:eu:taxud:dac6:v1", propOrder = {
    "id",
    "liability"
})
@XmlSeeAlso({
    Discloser.class
})
public class DisclosingType {

    @XmlElement(name = "ID", namespace = "urn:eu:taxud:dac6:v1", required = true)
    protected PersonOrOrganisationType id;
    @XmlElement(name = "Liability", namespace = "urn:eu:taxud:dac6:v1")
    protected LiabilityType liability;

    /**
     * Recupera il valore della proprietà id.
     * 
     * @return
     *     possible object is
     *     {@link PersonOrOrganisationType }
     *     
     */
    public PersonOrOrganisationType getID() {
        return id;
    }

    /**
     * Imposta il valore della proprietà id.
     * 
     * @param value
     *     allowed object is
     *     {@link PersonOrOrganisationType }
     *     
     */
    public void setID(PersonOrOrganisationType value) {
        this.id = value;
    }

    /**
     * Recupera il valore della proprietà liability.
     * 
     * @return
     *     possible object is
     *     {@link LiabilityType }
     *     
     */
    public LiabilityType getLiability() {
        return liability;
    }

    /**
     * Imposta il valore della proprietà liability.
     * 
     * @param value
     *     allowed object is
     *     {@link LiabilityType }
     *     
     */
    public void setLiability(LiabilityType value) {
        this.liability = value;
    }

}
