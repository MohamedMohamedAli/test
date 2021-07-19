
package eu.taxud.dac6.v4;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * 
 *                 This container brings together all data about a person as a stakeholder. Name and country of
 *                 residency are required components and each can
 *                 be present more than once to enable as complete a description as possible. Whenever possible one or
 *                 more identifiers (TIN) should be added. Additional data that describes and identifies the party must
 *                 be
 *                 given, as Birth date and Birth place.
 *             
 * 
 * <p>Classe Java per Person_Type complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="Person_Type">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="IndividualName" type="{urn:eu:taxud:dac6:v1}NamePerson_Type"/>
 *         &lt;element name="BirthDate" type="{http://www.w3.org/2001/XMLSchema}date"/>
 *         &lt;element name="BirthPlace" type="{urn:eu:taxud:dac6:v1}StringMin1Max200_Type"/>
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
@XmlType(name = "Person_Type", namespace = "urn:eu:taxud:dac6:v1", propOrder = {
    "individualName",
    "birthDate",
    "birthPlace",
    "tin",
    "address",
    "emailAddress",
    "resCountryCodes"
})
public class PersonType {

    @XmlElement(name = "IndividualName", namespace = "urn:eu:taxud:dac6:v1", required = true)
    protected NamePersonType individualName;
    @XmlElement(name = "BirthDate", namespace = "urn:eu:taxud:dac6:v1", required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar birthDate;
    @XmlElement(name = "BirthPlace", namespace = "urn:eu:taxud:dac6:v1", required = true)
    protected String birthPlace;
    @XmlElement(name = "TIN", namespace = "urn:eu:taxud:dac6:v1")
    protected List<TINType> tin;
    @XmlElement(name = "Address", namespace = "urn:eu:taxud:dac6:v1")
    protected AddressType address;
    @XmlElement(name = "EmailAddress", namespace = "urn:eu:taxud:dac6:v1")
    protected String emailAddress;
    @XmlElement(name = "ResCountryCodes", namespace = "urn:eu:taxud:dac6:v1", required = true)
    protected ResCountryCodeType resCountryCodes;

    /**
     * Recupera il valore della proprietà individualName.
     * 
     * @return
     *     possible object is
     *     {@link NamePersonType }
     *     
     */
    public NamePersonType getIndividualName() {
        return individualName;
    }

    /**
     * Imposta il valore della proprietà individualName.
     * 
     * @param value
     *     allowed object is
     *     {@link NamePersonType }
     *     
     */
    public void setIndividualName(NamePersonType value) {
        this.individualName = value;
    }

    /**
     * Recupera il valore della proprietà birthDate.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getBirthDate() {
        return birthDate;
    }

    /**
     * Imposta il valore della proprietà birthDate.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setBirthDate(XMLGregorianCalendar value) {
        this.birthDate = value;
    }

    /**
     * Recupera il valore della proprietà birthPlace.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBirthPlace() {
        return birthPlace;
    }

    /**
     * Imposta il valore della proprietà birthPlace.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBirthPlace(String value) {
        this.birthPlace = value;
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
     * Recupera il valore della proprietà address.
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
     * Imposta il valore della proprietà address.
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
     * Recupera il valore della proprietà emailAddress.
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
     * Imposta il valore della proprietà emailAddress.
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
     * Recupera il valore della proprietà resCountryCodes.
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
     * Imposta il valore della proprietà resCountryCodes.
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
