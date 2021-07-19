
package eu.taxud.dac6.v4;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Classe Java per DAC6Disclosure_Type complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="DAC6Disclosure_Type">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="DisclosureID" type="{urn:eu:taxud:dac6:v1}UUID_Type"/>
 *         &lt;element name="DisclosureVersionTimestamp" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="DisclosureImportInstruction" type="{urn:eu:taxud:dac6:v1}DisclosureVersion_EnumType"/>
 *         &lt;element name="Language" type="{urn:eu:taxud:isotypes:v1}LanguageCode_Type" minOccurs="0"/>
 *         &lt;element name="Disclosing" type="{urn:eu:taxud:dac6:v1}Discloser"/>
 *         &lt;element name="InitialDisclosureMA" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="Incoherent" type="{urn:eu:taxud:dac6:v1}Incoherent_EnumType" minOccurs="0"/>
 *         &lt;element name="RelevantTaxPayers" type="{urn:eu:taxud:dac6:v1}RelevantTaxpayers_Type" minOccurs="0"/>
 *         &lt;element name="Intermediaries" type="{urn:eu:taxud:dac6:v1}Intermediaries_Type" minOccurs="0"/>
 *         &lt;element name="AffectedPersons" type="{urn:eu:taxud:dac6:v1}AffectedPersons_Type" minOccurs="0"/>
 *         &lt;element name="DisclosureInformation" type="{urn:eu:taxud:dac6:v1}DisclosureInformation_Type"/>
 *       &lt;/sequence>
 *       &lt;attribute name="PartialGDPRUpdate" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="FullyGDPRUpdate" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DAC6Disclosure_Type", namespace = "urn:eu:taxud:dac6:v1", propOrder = {
    "disclosureID",
    "disclosureVersionTimestamp",
    "disclosureImportInstruction",
    "language",
    "disclosing",
    "initialDisclosureMA",
    "incoherent",
    "relevantTaxPayers",
    "intermediaries",
    "affectedPersons",
    "disclosureInformation"
})
public class DAC6DisclosureType {

    @XmlElement(name = "DisclosureID", namespace = "urn:eu:taxud:dac6:v1", required = true)
    protected String disclosureID;
    @XmlElement(name = "DisclosureVersionTimestamp", namespace = "urn:eu:taxud:dac6:v1")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar disclosureVersionTimestamp;
    @XmlElement(name = "DisclosureImportInstruction", namespace = "urn:eu:taxud:dac6:v1", required = true)
    @XmlSchemaType(name = "string")
    protected DisclosureVersionEnumType disclosureImportInstruction;
    @XmlElement(name = "Language", namespace = "urn:eu:taxud:dac6:v1")
    @XmlSchemaType(name = "string")
    protected LanguageCodeType language;
    @XmlElement(name = "Disclosing", namespace = "urn:eu:taxud:dac6:v1", required = true)
    protected Discloser disclosing;
    @XmlElement(name = "InitialDisclosureMA", namespace = "urn:eu:taxud:dac6:v1", defaultValue = "false")
    protected boolean initialDisclosureMA;
    @XmlElement(name = "Incoherent", namespace = "urn:eu:taxud:dac6:v1")
    @XmlSchemaType(name = "string")
    protected IncoherentEnumType incoherent;
    @XmlElement(name = "RelevantTaxPayers", namespace = "urn:eu:taxud:dac6:v1")
    protected RelevantTaxpayersType relevantTaxPayers;
    @XmlElement(name = "Intermediaries", namespace = "urn:eu:taxud:dac6:v1")
    protected IntermediariesType intermediaries;
    @XmlElement(name = "AffectedPersons", namespace = "urn:eu:taxud:dac6:v1")
    protected AffectedPersonsType affectedPersons;
    @XmlElement(name = "DisclosureInformation", namespace = "urn:eu:taxud:dac6:v1", required = true)
    protected DisclosureInformationType disclosureInformation;
    @XmlAttribute(name = "PartialGDPRUpdate")
    protected Boolean partialGDPRUpdate;
    @XmlAttribute(name = "FullyGDPRUpdate")
    protected Boolean fullyGDPRUpdate;

    /**
     * Recupera il valore della proprietà disclosureID.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDisclosureID() {
        return disclosureID;
    }

    /**
     * Imposta il valore della proprietà disclosureID.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDisclosureID(String value) {
        this.disclosureID = value;
    }

    /**
     * Recupera il valore della proprietà disclosureVersionTimestamp.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDisclosureVersionTimestamp() {
        return disclosureVersionTimestamp;
    }

    /**
     * Imposta il valore della proprietà disclosureVersionTimestamp.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDisclosureVersionTimestamp(XMLGregorianCalendar value) {
        this.disclosureVersionTimestamp = value;
    }

    /**
     * Recupera il valore della proprietà disclosureImportInstruction.
     * 
     * @return
     *     possible object is
     *     {@link DisclosureVersionEnumType }
     *     
     */
    public DisclosureVersionEnumType getDisclosureImportInstruction() {
        return disclosureImportInstruction;
    }

    /**
     * Imposta il valore della proprietà disclosureImportInstruction.
     * 
     * @param value
     *     allowed object is
     *     {@link DisclosureVersionEnumType }
     *     
     */
    public void setDisclosureImportInstruction(DisclosureVersionEnumType value) {
        this.disclosureImportInstruction = value;
    }

    /**
     * Recupera il valore della proprietà language.
     * 
     * @return
     *     possible object is
     *     {@link LanguageCodeType }
     *     
     */
    public LanguageCodeType getLanguage() {
        return language;
    }

    /**
     * Imposta il valore della proprietà language.
     * 
     * @param value
     *     allowed object is
     *     {@link LanguageCodeType }
     *     
     */
    public void setLanguage(LanguageCodeType value) {
        this.language = value;
    }

    /**
     * Recupera il valore della proprietà disclosing.
     * 
     * @return
     *     possible object is
     *     {@link Discloser }
     *     
     */
    public Discloser getDisclosing() {
        return disclosing;
    }

    /**
     * Imposta il valore della proprietà disclosing.
     * 
     * @param value
     *     allowed object is
     *     {@link Discloser }
     *     
     */
    public void setDisclosing(Discloser value) {
        this.disclosing = value;
    }

    /**
     * Recupera il valore della proprietà initialDisclosureMA.
     * 
     */
    public boolean isInitialDisclosureMA() {
        return initialDisclosureMA;
    }

    /**
     * Imposta il valore della proprietà initialDisclosureMA.
     * 
     */
    public void setInitialDisclosureMA(boolean value) {
        this.initialDisclosureMA = value;
    }

    /**
     * Recupera il valore della proprietà incoherent.
     * 
     * @return
     *     possible object is
     *     {@link IncoherentEnumType }
     *     
     */
    public IncoherentEnumType getIncoherent() {
        return incoherent;
    }

    /**
     * Imposta il valore della proprietà incoherent.
     * 
     * @param value
     *     allowed object is
     *     {@link IncoherentEnumType }
     *     
     */
    public void setIncoherent(IncoherentEnumType value) {
        this.incoherent = value;
    }

    /**
     * Recupera il valore della proprietà relevantTaxPayers.
     * 
     * @return
     *     possible object is
     *     {@link RelevantTaxpayersType }
     *     
     */
    public RelevantTaxpayersType getRelevantTaxPayers() {
        return relevantTaxPayers;
    }

    /**
     * Imposta il valore della proprietà relevantTaxPayers.
     * 
     * @param value
     *     allowed object is
     *     {@link RelevantTaxpayersType }
     *     
     */
    public void setRelevantTaxPayers(RelevantTaxpayersType value) {
        this.relevantTaxPayers = value;
    }

    /**
     * Recupera il valore della proprietà intermediaries.
     * 
     * @return
     *     possible object is
     *     {@link IntermediariesType }
     *     
     */
    public IntermediariesType getIntermediaries() {
        return intermediaries;
    }

    /**
     * Imposta il valore della proprietà intermediaries.
     * 
     * @param value
     *     allowed object is
     *     {@link IntermediariesType }
     *     
     */
    public void setIntermediaries(IntermediariesType value) {
        this.intermediaries = value;
    }

    /**
     * Recupera il valore della proprietà affectedPersons.
     * 
     * @return
     *     possible object is
     *     {@link AffectedPersonsType }
     *     
     */
    public AffectedPersonsType getAffectedPersons() {
        return affectedPersons;
    }

    /**
     * Imposta il valore della proprietà affectedPersons.
     * 
     * @param value
     *     allowed object is
     *     {@link AffectedPersonsType }
     *     
     */
    public void setAffectedPersons(AffectedPersonsType value) {
        this.affectedPersons = value;
    }

    /**
     * Recupera il valore della proprietà disclosureInformation.
     * 
     * @return
     *     possible object is
     *     {@link DisclosureInformationType }
     *     
     */
    public DisclosureInformationType getDisclosureInformation() {
        return disclosureInformation;
    }

    /**
     * Imposta il valore della proprietà disclosureInformation.
     * 
     * @param value
     *     allowed object is
     *     {@link DisclosureInformationType }
     *     
     */
    public void setDisclosureInformation(DisclosureInformationType value) {
        this.disclosureInformation = value;
    }

    /**
     * Recupera il valore della proprietà partialGDPRUpdate.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isPartialGDPRUpdate() {
        return partialGDPRUpdate;
    }

    /**
     * Imposta il valore della proprietà partialGDPRUpdate.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setPartialGDPRUpdate(Boolean value) {
        this.partialGDPRUpdate = value;
    }

    /**
     * Recupera il valore della proprietà fullyGDPRUpdate.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isFullyGDPRUpdate() {
        return fullyGDPRUpdate;
    }

    /**
     * Imposta il valore della proprietà fullyGDPRUpdate.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setFullyGDPRUpdate(Boolean value) {
        this.fullyGDPRUpdate = value;
    }

}
