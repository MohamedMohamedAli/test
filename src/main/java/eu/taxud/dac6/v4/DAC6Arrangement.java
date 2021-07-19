
package eu.taxud.dac6.v4;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Classe Java per anonymous complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Header" type="{urn:eu:taxud:dac6:v1}Header_Type"/>
 *         &lt;element name="ArrangementVersionTimestamp" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="ArrangementID" type="{urn:eu:taxud:dac6:v1}Arrangement_Type"/>
 *         &lt;element name="DAC6Disclosures" type="{urn:eu:taxud:dac6:v1}DAC6Disclosure_Type" maxOccurs="unbounded"/>
 *       &lt;/sequence>
 *       &lt;attribute name="version" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "header",
    "arrangementVersionTimestamp",
    "arrangementID",
    "dac6Disclosures"
})
@XmlRootElement(name = "DAC6_Arrangement", namespace = "urn:eu:taxud:dac6:v1")
public class DAC6Arrangement {

    @XmlElement(name = "Header", namespace = "urn:eu:taxud:dac6:v1", required = true)
    protected HeaderType header;
    @XmlElement(name = "ArrangementVersionTimestamp", namespace = "urn:eu:taxud:dac6:v1")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar arrangementVersionTimestamp;
    @XmlElement(name = "ArrangementID", namespace = "urn:eu:taxud:dac6:v1", required = true)
    protected ArrangementType arrangementID;
    @XmlElement(name = "DAC6Disclosures", namespace = "urn:eu:taxud:dac6:v1", required = true)
    protected List<DAC6DisclosureType> dac6Disclosures;
    @XmlAttribute(name = "version")
    protected String version;

    /**
     * Recupera il valore della proprietà header.
     * 
     * @return
     *     possible object is
     *     {@link HeaderType }
     *     
     */
    public HeaderType getHeader() {
        return header;
    }

    /**
     * Imposta il valore della proprietà header.
     * 
     * @param value
     *     allowed object is
     *     {@link HeaderType }
     *     
     */
    public void setHeader(HeaderType value) {
        this.header = value;
    }

    /**
     * Recupera il valore della proprietà arrangementVersionTimestamp.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getArrangementVersionTimestamp() {
        return arrangementVersionTimestamp;
    }

    /**
     * Imposta il valore della proprietà arrangementVersionTimestamp.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setArrangementVersionTimestamp(XMLGregorianCalendar value) {
        this.arrangementVersionTimestamp = value;
    }

    /**
     * Recupera il valore della proprietà arrangementID.
     * 
     * @return
     *     possible object is
     *     {@link ArrangementType }
     *     
     */
    public ArrangementType getArrangementID() {
        return arrangementID;
    }

    /**
     * Imposta il valore della proprietà arrangementID.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrangementType }
     *     
     */
    public void setArrangementID(ArrangementType value) {
        this.arrangementID = value;
    }

    /**
     * Gets the value of the dac6Disclosures property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the dac6Disclosures property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDAC6Disclosures().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DAC6DisclosureType }
     * 
     * 
     */
    public List<DAC6DisclosureType> getDAC6Disclosures() {
        if (dac6Disclosures == null) {
            dac6Disclosures = new ArrayList<DAC6DisclosureType>();
        }
        return this.dac6Disclosures;
    }

    /**
     * Recupera il valore della proprietà version.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVersion() {
        return version;
    }

    /**
     * Imposta il valore della proprietà version.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVersion(String value) {
        this.version = value;
    }

}
