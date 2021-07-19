
package eu.taxud.dac6.v4;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * The user must spread the data about the name of a party over up to six
 *                 elements. The container element for this will be 'NameFix'.
 *             
 * 
 * <p>Classe Java per NamePersonUnknown_Type complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="NamePersonUnknown_Type">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="PrecedingTitle" type="{urn:eu:taxud:dac6:v1}StringMin1Max200_Type" minOccurs="0"/>
 *         &lt;element name="Title" type="{urn:eu:taxud:dac6:v1}StringMin1Max200_Type" minOccurs="0"/>
 *         &lt;element name="FirstName" type="{urn:eu:taxud:dac6:v1}StringMax200Unknown_Type"/>
 *         &lt;element name="MiddleName" type="{urn:eu:taxud:dac6:v1}StringMin1Max200_Type" minOccurs="0"/>
 *         &lt;element name="NamePrefix" type="{urn:eu:taxud:dac6:v1}StringMin1Max200_Type" minOccurs="0"/>
 *         &lt;element name="LastName" type="{urn:eu:taxud:dac6:v1}StringMin1Max200_Type"/>
 *         &lt;element name="GenerationIdentifier" type="{urn:eu:taxud:dac6:v1}StringMin1Max200_Type" minOccurs="0"/>
 *         &lt;element name="Suffix" type="{urn:eu:taxud:dac6:v1}StringMin1Max200_Type" minOccurs="0"/>
 *         &lt;element name="GeneralSuffix" type="{urn:eu:taxud:dac6:v1}StringMin1Max200_Type" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "NamePersonUnknown_Type", namespace = "urn:eu:taxud:dac6:v1", propOrder = {
    "precedingTitle",
    "title",
    "firstName",
    "middleName",
    "namePrefix",
    "lastName",
    "generationIdentifier",
    "suffix",
    "generalSuffix"
})
public class NamePersonUnknownType {

    @XmlElement(name = "PrecedingTitle", namespace = "urn:eu:taxud:dac6:v1")
    protected String precedingTitle;
    @XmlElement(name = "Title", namespace = "urn:eu:taxud:dac6:v1")
    protected String title;
    @XmlElement(name = "FirstName", namespace = "urn:eu:taxud:dac6:v1", required = true)
    protected StringMax200UnknownType firstName;
    @XmlElement(name = "MiddleName", namespace = "urn:eu:taxud:dac6:v1")
    protected String middleName;
    @XmlElement(name = "NamePrefix", namespace = "urn:eu:taxud:dac6:v1")
    protected String namePrefix;
    @XmlElement(name = "LastName", namespace = "urn:eu:taxud:dac6:v1", required = true)
    protected String lastName;
    @XmlElement(name = "GenerationIdentifier", namespace = "urn:eu:taxud:dac6:v1")
    protected String generationIdentifier;
    @XmlElement(name = "Suffix", namespace = "urn:eu:taxud:dac6:v1")
    protected String suffix;
    @XmlElement(name = "GeneralSuffix", namespace = "urn:eu:taxud:dac6:v1")
    protected String generalSuffix;

    /**
     * Recupera il valore della proprietà precedingTitle.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPrecedingTitle() {
        return precedingTitle;
    }

    /**
     * Imposta il valore della proprietà precedingTitle.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPrecedingTitle(String value) {
        this.precedingTitle = value;
    }

    /**
     * Recupera il valore della proprietà title.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTitle() {
        return title;
    }

    /**
     * Imposta il valore della proprietà title.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTitle(String value) {
        this.title = value;
    }

    /**
     * Recupera il valore della proprietà firstName.
     * 
     * @return
     *     possible object is
     *     {@link StringMax200UnknownType }
     *     
     */
    public StringMax200UnknownType getFirstName() {
        return firstName;
    }

    /**
     * Imposta il valore della proprietà firstName.
     * 
     * @param value
     *     allowed object is
     *     {@link StringMax200UnknownType }
     *     
     */
    public void setFirstName(StringMax200UnknownType value) {
        this.firstName = value;
    }

    /**
     * Recupera il valore della proprietà middleName.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMiddleName() {
        return middleName;
    }

    /**
     * Imposta il valore della proprietà middleName.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMiddleName(String value) {
        this.middleName = value;
    }

    /**
     * Recupera il valore della proprietà namePrefix.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNamePrefix() {
        return namePrefix;
    }

    /**
     * Imposta il valore della proprietà namePrefix.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNamePrefix(String value) {
        this.namePrefix = value;
    }

    /**
     * Recupera il valore della proprietà lastName.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLastName() {
        return lastName;
    }

    /**
     * Imposta il valore della proprietà lastName.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLastName(String value) {
        this.lastName = value;
    }

    /**
     * Recupera il valore della proprietà generationIdentifier.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGenerationIdentifier() {
        return generationIdentifier;
    }

    /**
     * Imposta il valore della proprietà generationIdentifier.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGenerationIdentifier(String value) {
        this.generationIdentifier = value;
    }

    /**
     * Recupera il valore della proprietà suffix.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSuffix() {
        return suffix;
    }

    /**
     * Imposta il valore della proprietà suffix.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSuffix(String value) {
        this.suffix = value;
    }

    /**
     * Recupera il valore della proprietà generalSuffix.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGeneralSuffix() {
        return generalSuffix;
    }

    /**
     * Imposta il valore della proprietà generalSuffix.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGeneralSuffix(String value) {
        this.generalSuffix = value;
    }

}
