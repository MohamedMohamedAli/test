
package eu.taxud.dac6.v4;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 *             
 * 
 * <p>Classe Java per Organisation_Type complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="Organisation_Type">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="OrganisationName" type="{urn:eu:taxud:dac6:v1}NameOrganisation_Type" maxOccurs="unbounded"/>
 *         &lt;element name="TIN" type="{urn:eu:taxud:dac6:v1}TIN_Type" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="Address" type="{urn:eu:taxud:dac6:v1}Address_Type" minOccurs="0"/>
 *         &lt;element name="EmailAddress" type="{urn:eu:taxud:dac6:v1}StringMin1Max400_Type" minOccurs="0"/>
 *         &lt;element name="ResCountryCodes" type="{urn:eu:taxud:dac6:v1}ResCountryCode_Type"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Organisation_Type", namespace = "urn:eu:taxud:dac6:v1", propOrder = {
    "organisationName",
    "tin",
    "address",
    "emailAddress",
    "resCountryCodes"
})
public class OrganisationType {

    @XmlElement(name = "OrganisationName", namespace = "urn:eu:taxud:dac6:v1", required = true)
    protected List<NameOrganisationType> organisationName;
    @XmlElement(name = "TIN", namespace = "urn:eu:taxud:dac6:v1")
    protected List<TINType> tin;
    @XmlElement(name = "Address", namespace = "urn:eu:taxud:dac6:v1")
    protected AddressType address;
    @XmlElement(name = "EmailAddress", namespace = "urn:eu:taxud:dac6:v1")
    protected String emailAddress;
    @XmlElement(name = "ResCountryCodes", namespace = "urn:eu:taxud:dac6:v1", required = true)
    protected ResCountryCodeType resCountryCodes;

    /**
     * Gets the value of the organisationName property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the organisationName property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOrganisationName().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link NameOrganisationType }
     * 
     * 
     */
    public List<NameOrganisationType> getOrganisationName() {
        if (organisationName == null) {
            organisationName = new ArrayList<NameOrganisationType>();
        }
        return this.organisationName;
    }

    /**
     * Gets the value of the tin property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the tin property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTIN().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TINType }
     * 
     * 
     */
    public List<TINType> getTIN() {
        if (tin == null) {
            tin = new ArrayList<TINType>();
        }
        return this.tin;
    }

    /**
     * Recupera il valore della propriet?? address.
     * 
     * @return
     *     possible object is
     *     {@link AddressType }
     *     
     */
    public AddressType getAddress() {
        return address;
    }

    /**
     * Imposta il valore della propriet?? address.
     * 
     * @param value
     *     allowed object is
     *     {@link AddressType }
     *     
     */
    public void setAddress(AddressType value) {
        this.address = value;
    }

    /**
     * Recupera il valore della propriet?? emailAddress.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEmailAddress() {
        return emailAddress;
    }

    /**
     * Imposta il valore della propriet?? emailAddress.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEmailAddress(String value) {
        this.emailAddress = value;
    }

    /**
     * Recupera il valore della propriet?? resCountryCodes.
     * 
     * @return
     *     possible object is
     *     {@link ResCountryCodeType }
     *     
     */
    public ResCountryCodeType getResCountryCodes() {
        return resCountryCodes;
    }

    /**
     * Imposta il valore della propriet?? resCountryCodes.
     * 
     * @param value
     *     allowed object is
     *     {@link ResCountryCodeType }
     *     
     */
    public void setResCountryCodes(ResCountryCodeType value) {
        this.resCountryCodes = value;
    }

}
