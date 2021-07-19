
package eu.taxud.dac6.v4;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java per Address_Type complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="Address_Type">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Street" type="{urn:eu:taxud:dac6:v1}StringMin1Max400_Type" minOccurs="0"/>
 *         &lt;element name="BuildingIdentifier" type="{urn:eu:taxud:dac6:v1}StringMin1Max400_Type" minOccurs="0"/>
 *         &lt;element name="SuiteIdentifier" type="{urn:eu:taxud:dac6:v1}StringMin1Max400_Type" minOccurs="0"/>
 *         &lt;element name="FloorIdentifier" type="{urn:eu:taxud:dac6:v1}StringMin1Max400_Type" minOccurs="0"/>
 *         &lt;element name="DistrictName" type="{urn:eu:taxud:dac6:v1}StringMin1Max400_Type" minOccurs="0"/>
 *         &lt;element name="POB" type="{urn:eu:taxud:dac6:v1}StringMin1Max400_Type" minOccurs="0"/>
 *         &lt;element name="PostCode" type="{urn:eu:taxud:dac6:v1}StringMin1Max400_Type" minOccurs="0"/>
 *         &lt;element name="City" type="{urn:eu:taxud:dac6:v1}StringMin1Max400_Type"/>
 *         &lt;element name="Country" type="{urn:eu:taxud:isotypes:v1}CountryCode_Type"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Address_Type", namespace = "urn:eu:taxud:dac6:v1", propOrder = {
    "street",
    "buildingIdentifier",
    "suiteIdentifier",
    "floorIdentifier",
    "districtName",
    "pob",
    "postCode",
    "city",
    "country"
})
public class AddressType {

    @XmlElement(name = "Street", namespace = "urn:eu:taxud:dac6:v1")
    protected String street;
    @XmlElement(name = "BuildingIdentifier", namespace = "urn:eu:taxud:dac6:v1")
    protected String buildingIdentifier;
    @XmlElement(name = "SuiteIdentifier", namespace = "urn:eu:taxud:dac6:v1")
    protected String suiteIdentifier;
    @XmlElement(name = "FloorIdentifier", namespace = "urn:eu:taxud:dac6:v1")
    protected String floorIdentifier;
    @XmlElement(name = "DistrictName", namespace = "urn:eu:taxud:dac6:v1")
    protected String districtName;
    @XmlElement(name = "POB", namespace = "urn:eu:taxud:dac6:v1")
    protected String pob;
    @XmlElement(name = "PostCode", namespace = "urn:eu:taxud:dac6:v1")
    protected String postCode;
    @XmlElement(name = "City", namespace = "urn:eu:taxud:dac6:v1", required = true)
    protected String city;
    @XmlElement(name = "Country", namespace = "urn:eu:taxud:dac6:v1", required = true)
    @XmlSchemaType(name = "string")
    protected CountryCodeType country;

    /**
     * Recupera il valore della proprietà street.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStreet() {
        return street;
    }

    /**
     * Imposta il valore della proprietà street.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStreet(String value) {
        this.street = value;
    }

    /**
     * Recupera il valore della proprietà buildingIdentifier.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBuildingIdentifier() {
        return buildingIdentifier;
    }

    /**
     * Imposta il valore della proprietà buildingIdentifier.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBuildingIdentifier(String value) {
        this.buildingIdentifier = value;
    }

    /**
     * Recupera il valore della proprietà suiteIdentifier.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSuiteIdentifier() {
        return suiteIdentifier;
    }

    /**
     * Imposta il valore della proprietà suiteIdentifier.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSuiteIdentifier(String value) {
        this.suiteIdentifier = value;
    }

    /**
     * Recupera il valore della proprietà floorIdentifier.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFloorIdentifier() {
        return floorIdentifier;
    }

    /**
     * Imposta il valore della proprietà floorIdentifier.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFloorIdentifier(String value) {
        this.floorIdentifier = value;
    }

    /**
     * Recupera il valore della proprietà districtName.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDistrictName() {
        return districtName;
    }

    /**
     * Imposta il valore della proprietà districtName.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDistrictName(String value) {
        this.districtName = value;
    }

    /**
     * Recupera il valore della proprietà pob.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPOB() {
        return pob;
    }

    /**
     * Imposta il valore della proprietà pob.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPOB(String value) {
        this.pob = value;
    }

    /**
     * Recupera il valore della proprietà postCode.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPostCode() {
        return postCode;
    }

    /**
     * Imposta il valore della proprietà postCode.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPostCode(String value) {
        this.postCode = value;
    }

    /**
     * Recupera il valore della proprietà city.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCity() {
        return city;
    }

    /**
     * Imposta il valore della proprietà city.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCity(String value) {
        this.city = value;
    }

    /**
     * Recupera il valore della proprietà country.
     * 
     * @return
     *     possible object is
     *     {@link CountryCodeType }
     *     
     */
    public CountryCodeType getCountry() {
        return country;
    }

    /**
     * Imposta il valore della proprietà country.
     * 
     * @param value
     *     allowed object is
     *     {@link CountryCodeType }
     *     
     */
    public void setCountry(CountryCodeType value) {
        this.country = value;
    }

}
