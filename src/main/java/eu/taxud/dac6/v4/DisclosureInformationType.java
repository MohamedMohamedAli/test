
package eu.taxud.dac6.v4;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java per DisclosureInformation_Type complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="DisclosureInformation_Type">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ImplementingDate" type="{urn:eu:taxud:dac6:v1}DateUnknown_Type"/>
 *         &lt;element name="Reason" type="{urn:eu:taxud:dac6:v1}DisclosureReason_EnumType" minOccurs="0"/>
 *         &lt;element name="Summary" type="{urn:eu:taxud:dac6:v1}Summary_Type"/>
 *         &lt;element name="NationalProvision" type="{urn:eu:taxud:dac6:v1}StringMin1Max4000WithLang_Type" maxOccurs="unbounded"/>
 *         &lt;element name="Amount" type="{urn:eu:taxud:dac6:v1}AmountUnknown_Type"/>
 *         &lt;element name="ArrangementChart" type="{urn:eu:taxud:dac6:v1}ArrangementChartRoot_Type" minOccurs="0"/>
 *         &lt;element name="ConcernedMSs" type="{urn:eu:taxud:dac6:v1}ConcernedMSs_Type"/>
 *         &lt;element name="MainBenefitTest1" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="Hallmarks" type="{urn:eu:taxud:dac6:v1}Hallmarks_Type"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DisclosureInformation_Type", namespace = "urn:eu:taxud:dac6:v1", propOrder = {
    "implementingDate",
    "reason",
    "summary",
    "nationalProvision",
    "amount",
    "arrangementChart",
    "concernedMSs",
    "mainBenefitTest1",
    "hallmarks"
})
public class DisclosureInformationType {

    @XmlElement(name = "ImplementingDate", namespace = "urn:eu:taxud:dac6:v1", required = true)
    protected DateUnknownType implementingDate;
    @XmlElement(name = "Reason", namespace = "urn:eu:taxud:dac6:v1")
    @XmlSchemaType(name = "string")
    protected DisclosureReasonEnumType reason;
    @XmlElement(name = "Summary", namespace = "urn:eu:taxud:dac6:v1", required = true)
    protected SummaryType summary;
    @XmlElement(name = "NationalProvision", namespace = "urn:eu:taxud:dac6:v1", required = true)
    protected List<StringMin1Max4000WithLangType> nationalProvision;
    @XmlElement(name = "Amount", namespace = "urn:eu:taxud:dac6:v1", required = true)
    protected AmountUnknownType amount;
    @XmlElement(name = "ArrangementChart", namespace = "urn:eu:taxud:dac6:v1")
    protected ArrangementChartRootType arrangementChart;
    @XmlElement(name = "ConcernedMSs", namespace = "urn:eu:taxud:dac6:v1", required = true)
    protected ConcernedMSsType concernedMSs;
    @XmlElement(name = "MainBenefitTest1", namespace = "urn:eu:taxud:dac6:v1", defaultValue = "false")
    protected boolean mainBenefitTest1;
    @XmlElement(name = "Hallmarks", namespace = "urn:eu:taxud:dac6:v1", required = true)
    protected HallmarksType hallmarks;

    /**
     * Recupera il valore della proprietà implementingDate.
     * 
     * @return
     *     possible object is
     *     {@link DateUnknownType }
     *     
     */
    public DateUnknownType getImplementingDate() {
        return implementingDate;
    }

    /**
     * Imposta il valore della proprietà implementingDate.
     * 
     * @param value
     *     allowed object is
     *     {@link DateUnknownType }
     *     
     */
    public void setImplementingDate(DateUnknownType value) {
        this.implementingDate = value;
    }

    /**
     * Recupera il valore della proprietà reason.
     * 
     * @return
     *     possible object is
     *     {@link DisclosureReasonEnumType }
     *     
     */
    public DisclosureReasonEnumType getReason() {
        return reason;
    }

    /**
     * Imposta il valore della proprietà reason.
     * 
     * @param value
     *     allowed object is
     *     {@link DisclosureReasonEnumType }
     *     
     */
    public void setReason(DisclosureReasonEnumType value) {
        this.reason = value;
    }

    /**
     * Recupera il valore della proprietà summary.
     * 
     * @return
     *     possible object is
     *     {@link SummaryType }
     *     
     */
    public SummaryType getSummary() {
        return summary;
    }

    /**
     * Imposta il valore della proprietà summary.
     * 
     * @param value
     *     allowed object is
     *     {@link SummaryType }
     *     
     */
    public void setSummary(SummaryType value) {
        this.summary = value;
    }

    /**
     * Gets the value of the nationalProvision property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the nationalProvision property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getNationalProvision().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link StringMin1Max4000WithLangType }
     * 
     * 
     */
    public List<StringMin1Max4000WithLangType> getNationalProvision() {
        if (nationalProvision == null) {
            nationalProvision = new ArrayList<StringMin1Max4000WithLangType>();
        }
        return this.nationalProvision;
    }

    /**
     * Recupera il valore della proprietà amount.
     * 
     * @return
     *     possible object is
     *     {@link AmountUnknownType }
     *     
     */
    public AmountUnknownType getAmount() {
        return amount;
    }

    /**
     * Imposta il valore della proprietà amount.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountUnknownType }
     *     
     */
    public void setAmount(AmountUnknownType value) {
        this.amount = value;
    }

    /**
     * Recupera il valore della proprietà arrangementChart.
     * 
     * @return
     *     possible object is
     *     {@link ArrangementChartRootType }
     *     
     */
    public ArrangementChartRootType getArrangementChart() {
        return arrangementChart;
    }

    /**
     * Imposta il valore della proprietà arrangementChart.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrangementChartRootType }
     *     
     */
    public void setArrangementChart(ArrangementChartRootType value) {
        this.arrangementChart = value;
    }

    /**
     * Recupera il valore della proprietà concernedMSs.
     * 
     * @return
     *     possible object is
     *     {@link ConcernedMSsType }
     *     
     */
    public ConcernedMSsType getConcernedMSs() {
        return concernedMSs;
    }

    /**
     * Imposta il valore della proprietà concernedMSs.
     * 
     * @param value
     *     allowed object is
     *     {@link ConcernedMSsType }
     *     
     */
    public void setConcernedMSs(ConcernedMSsType value) {
        this.concernedMSs = value;
    }

    /**
     * Recupera il valore della proprietà mainBenefitTest1.
     * 
     */
    public boolean isMainBenefitTest1() {
        return mainBenefitTest1;
    }

    /**
     * Imposta il valore della proprietà mainBenefitTest1.
     * 
     */
    public void setMainBenefitTest1(boolean value) {
        this.mainBenefitTest1 = value;
    }

    /**
     * Recupera il valore della proprietà hallmarks.
     * 
     * @return
     *     possible object is
     *     {@link HallmarksType }
     *     
     */
    public HallmarksType getHallmarks() {
        return hallmarks;
    }

    /**
     * Imposta il valore della proprietà hallmarks.
     * 
     * @param value
     *     allowed object is
     *     {@link HallmarksType }
     *     
     */
    public void setHallmarks(HallmarksType value) {
        this.hallmarks = value;
    }

}
