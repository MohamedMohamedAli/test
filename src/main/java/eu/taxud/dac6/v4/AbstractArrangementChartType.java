
package eu.taxud.dac6.v4;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java per AbstractArrangementChart_Type complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="AbstractArrangementChart_Type">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Ownership" type="{urn:eu:taxud:dac6:v1}Percentage_Type" minOccurs="0"/>
 *         &lt;element name="InvestAmount" type="{urn:eu:taxud:dac6:v1}Amount_Type" minOccurs="0"/>
 *         &lt;element name="OtherInfo" type="{urn:eu:taxud:dac6:v1}StringMin1Max4000WithLang_Type" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="ListChilds" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="ChildRTP" type="{urn:eu:taxud:dac6:v1}ArrangementChart_Type" maxOccurs="unbounded"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AbstractArrangementChart_Type", namespace = "urn:eu:taxud:dac6:v1", propOrder = {
    "ownership",
    "investAmount",
    "otherInfo",
    "listChilds"
})
@XmlSeeAlso({
    ArrangementChartRootType.class,
    ArrangementChartType.class
})
public abstract class AbstractArrangementChartType {

    @XmlElement(name = "Ownership", namespace = "urn:eu:taxud:dac6:v1")
    @XmlSchemaType(name = "integer")
    protected Integer ownership;
    @XmlElement(name = "InvestAmount", namespace = "urn:eu:taxud:dac6:v1")
    protected AmountType investAmount;
    @XmlElement(name = "OtherInfo", namespace = "urn:eu:taxud:dac6:v1")
    protected List<StringMin1Max4000WithLangType> otherInfo;
    @XmlElement(name = "ListChilds", namespace = "urn:eu:taxud:dac6:v1")
    protected AbstractArrangementChartType.ListChilds listChilds;

    /**
     * Recupera il valore della proprietà ownership.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getOwnership() {
        return ownership;
    }

    /**
     * Imposta il valore della proprietà ownership.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setOwnership(Integer value) {
        this.ownership = value;
    }

    /**
     * Recupera il valore della proprietà investAmount.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getInvestAmount() {
        return investAmount;
    }

    /**
     * Imposta il valore della proprietà investAmount.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setInvestAmount(AmountType value) {
        this.investAmount = value;
    }

    /**
     * Gets the value of the otherInfo property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the otherInfo property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOtherInfo().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link StringMin1Max4000WithLangType }
     * 
     * 
     */
    public List<StringMin1Max4000WithLangType> getOtherInfo() {
        if (otherInfo == null) {
            otherInfo = new ArrayList<StringMin1Max4000WithLangType>();
        }
        return this.otherInfo;
    }

    /**
     * Recupera il valore della proprietà listChilds.
     * 
     * @return
     *     possible object is
     *     {@link AbstractArrangementChartType.ListChilds }
     *     
     */
    public AbstractArrangementChartType.ListChilds getListChilds() {
        return listChilds;
    }

    /**
     * Imposta il valore della proprietà listChilds.
     * 
     * @param value
     *     allowed object is
     *     {@link AbstractArrangementChartType.ListChilds }
     *     
     */
    public void setListChilds(AbstractArrangementChartType.ListChilds value) {
        this.listChilds = value;
    }


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
     *         &lt;element name="ChildRTP" type="{urn:eu:taxud:dac6:v1}ArrangementChart_Type" maxOccurs="unbounded"/>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "childRTP"
    })
    public static class ListChilds {

        @XmlElement(name = "ChildRTP", namespace = "urn:eu:taxud:dac6:v1", required = true)
        protected List<ArrangementChartType> childRTP;

        /**
         * Gets the value of the childRTP property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the childRTP property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getChildRTP().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link ArrangementChartType }
         * 
         * 
         */
        public List<ArrangementChartType> getChildRTP() {
            if (childRTP == null) {
                childRTP = new ArrayList<ArrangementChartType>();
            }
            return this.childRTP;
        }

    }

}
