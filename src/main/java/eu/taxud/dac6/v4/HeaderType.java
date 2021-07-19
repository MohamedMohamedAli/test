
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
 * Information in the message header identifies the Member State that is
 *                 sending the message.
 *             
 * 
 * <p>Classe Java per Header_Type complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="Header_Type">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="TransmittingCountry" type="{urn:eu:taxud:isotypes:v1}MSCountryCode_Type"/>
 *         &lt;element name="ReceivingCountries" type="{urn:eu:taxud:isotypes:v1}MSCountryCode_Type" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="MessageRefId" type="{urn:eu:taxud:dac6:v1}StringMin1Max200_Type"/>
 *         &lt;element name="Timestamp" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Header_Type", namespace = "urn:eu:taxud:dac6:v1", propOrder = {
    "transmittingCountry",
    "receivingCountries",
    "messageRefId",
    "timestamp"
})
public class HeaderType {

    @XmlElement(name = "TransmittingCountry", namespace = "urn:eu:taxud:dac6:v1", required = true)
    @XmlSchemaType(name = "string")
    protected MSCountryCodeType transmittingCountry;
    @XmlElement(name = "ReceivingCountries", namespace = "urn:eu:taxud:dac6:v1")
    @XmlSchemaType(name = "string")
    protected List<MSCountryCodeType> receivingCountries;
    @XmlElement(name = "MessageRefId", namespace = "urn:eu:taxud:dac6:v1", required = true)
    protected String messageRefId;
    @XmlElement(name = "Timestamp", namespace = "urn:eu:taxud:dac6:v1", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar timestamp;

    /**
     * Recupera il valore della proprietà transmittingCountry.
     * 
     * @return
     *     possible object is
     *     {@link MSCountryCodeType }
     *     
     */
    public MSCountryCodeType getTransmittingCountry() {
        return transmittingCountry;
    }

    /**
     * Imposta il valore della proprietà transmittingCountry.
     * 
     * @param value
     *     allowed object is
     *     {@link MSCountryCodeType }
     *     
     */
    public void setTransmittingCountry(MSCountryCodeType value) {
        this.transmittingCountry = value;
    }

    /**
     * Gets the value of the receivingCountries property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the receivingCountries property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getReceivingCountries().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link MSCountryCodeType }
     * 
     * 
     */
    public List<MSCountryCodeType> getReceivingCountries() {
        if (receivingCountries == null) {
            receivingCountries = new ArrayList<MSCountryCodeType>();
        }
        return this.receivingCountries;
    }

    /**
     * Recupera il valore della proprietà messageRefId.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMessageRefId() {
        return messageRefId;
    }

    /**
     * Imposta il valore della proprietà messageRefId.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMessageRefId(String value) {
        this.messageRefId = value;
    }

    /**
     * Recupera il valore della proprietà timestamp.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getTimestamp() {
        return timestamp;
    }

    /**
     * Imposta il valore della proprietà timestamp.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setTimestamp(XMLGregorianCalendar value) {
        this.timestamp = value;
    }

}
