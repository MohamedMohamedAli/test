
package eu.taxud.dac6.v4;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java per Liability_Type complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="Liability_Type">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;choice>
 *         &lt;element name="IntermediaryDiscloser">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="IntermediaryNexus" type="{urn:eu:taxud:dac6:v1}IntermediaryNexus_EnumType"/>
 *                   &lt;element name="Capacity" type="{urn:eu:taxud:dac6:v1}IntermediaryCapacity_EnumType" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="RelevantTaxpayerDiscloser">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="RelevantTaxpayerNexus" type="{urn:eu:taxud:dac6:v1}RelevantTaxpayerNexus_EnumType"/>
 *                   &lt;element name="Capacity" type="{urn:eu:taxud:dac6:v1}TaxpayerCapacity_EnumType" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *       &lt;/choice>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Liability_Type", namespace = "urn:eu:taxud:dac6:v1", propOrder = {
    "intermediaryDiscloser",
    "relevantTaxpayerDiscloser"
})
public class LiabilityType {

    @XmlElement(name = "IntermediaryDiscloser", namespace = "urn:eu:taxud:dac6:v1")
    protected LiabilityType.IntermediaryDiscloser intermediaryDiscloser;
    @XmlElement(name = "RelevantTaxpayerDiscloser", namespace = "urn:eu:taxud:dac6:v1")
    protected LiabilityType.RelevantTaxpayerDiscloser relevantTaxpayerDiscloser;

    /**
     * Recupera il valore della proprietà intermediaryDiscloser.
     * 
     * @return
     *     possible object is
     *     {@link LiabilityType.IntermediaryDiscloser }
     *     
     */
    public LiabilityType.IntermediaryDiscloser getIntermediaryDiscloser() {
        return intermediaryDiscloser;
    }

    /**
     * Imposta il valore della proprietà intermediaryDiscloser.
     * 
     * @param value
     *     allowed object is
     *     {@link LiabilityType.IntermediaryDiscloser }
     *     
     */
    public void setIntermediaryDiscloser(LiabilityType.IntermediaryDiscloser value) {
        this.intermediaryDiscloser = value;
    }

    /**
     * Recupera il valore della proprietà relevantTaxpayerDiscloser.
     * 
     * @return
     *     possible object is
     *     {@link LiabilityType.RelevantTaxpayerDiscloser }
     *     
     */
    public LiabilityType.RelevantTaxpayerDiscloser getRelevantTaxpayerDiscloser() {
        return relevantTaxpayerDiscloser;
    }

    /**
     * Imposta il valore della proprietà relevantTaxpayerDiscloser.
     * 
     * @param value
     *     allowed object is
     *     {@link LiabilityType.RelevantTaxpayerDiscloser }
     *     
     */
    public void setRelevantTaxpayerDiscloser(LiabilityType.RelevantTaxpayerDiscloser value) {
        this.relevantTaxpayerDiscloser = value;
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
     *         &lt;element name="IntermediaryNexus" type="{urn:eu:taxud:dac6:v1}IntermediaryNexus_EnumType"/>
     *         &lt;element name="Capacity" type="{urn:eu:taxud:dac6:v1}IntermediaryCapacity_EnumType" minOccurs="0"/>
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
        "intermediaryNexus",
        "capacity"
    })
    public static class IntermediaryDiscloser {

        @XmlElement(name = "IntermediaryNexus", namespace = "urn:eu:taxud:dac6:v1", required = true)
        @XmlSchemaType(name = "string")
        protected IntermediaryNexusEnumType intermediaryNexus;
        @XmlElement(name = "Capacity", namespace = "urn:eu:taxud:dac6:v1")
        @XmlSchemaType(name = "string")
        protected IntermediaryCapacityEnumType capacity;

        /**
         * Recupera il valore della proprietà intermediaryNexus.
         * 
         * @return
         *     possible object is
         *     {@link IntermediaryNexusEnumType }
         *     
         */
        public IntermediaryNexusEnumType getIntermediaryNexus() {
            return intermediaryNexus;
        }

        /**
         * Imposta il valore della proprietà intermediaryNexus.
         * 
         * @param value
         *     allowed object is
         *     {@link IntermediaryNexusEnumType }
         *     
         */
        public void setIntermediaryNexus(IntermediaryNexusEnumType value) {
            this.intermediaryNexus = value;
        }

        /**
         * Recupera il valore della proprietà capacity.
         * 
         * @return
         *     possible object is
         *     {@link IntermediaryCapacityEnumType }
         *     
         */
        public IntermediaryCapacityEnumType getCapacity() {
            return capacity;
        }

        /**
         * Imposta il valore della proprietà capacity.
         * 
         * @param value
         *     allowed object is
         *     {@link IntermediaryCapacityEnumType }
         *     
         */
        public void setCapacity(IntermediaryCapacityEnumType value) {
            this.capacity = value;
        }

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
     *         &lt;element name="RelevantTaxpayerNexus" type="{urn:eu:taxud:dac6:v1}RelevantTaxpayerNexus_EnumType"/>
     *         &lt;element name="Capacity" type="{urn:eu:taxud:dac6:v1}TaxpayerCapacity_EnumType" minOccurs="0"/>
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
        "relevantTaxpayerNexus",
        "capacity"
    })
    public static class RelevantTaxpayerDiscloser {

        @XmlElement(name = "RelevantTaxpayerNexus", namespace = "urn:eu:taxud:dac6:v1", required = true)
        @XmlSchemaType(name = "string")
        protected RelevantTaxpayerNexusEnumType relevantTaxpayerNexus;
        @XmlElement(name = "Capacity", namespace = "urn:eu:taxud:dac6:v1")
        @XmlSchemaType(name = "string")
        protected TaxpayerCapacityEnumType capacity;

        /**
         * Recupera il valore della proprietà relevantTaxpayerNexus.
         * 
         * @return
         *     possible object is
         *     {@link RelevantTaxpayerNexusEnumType }
         *     
         */
        public RelevantTaxpayerNexusEnumType getRelevantTaxpayerNexus() {
            return relevantTaxpayerNexus;
        }

        /**
         * Imposta il valore della proprietà relevantTaxpayerNexus.
         * 
         * @param value
         *     allowed object is
         *     {@link RelevantTaxpayerNexusEnumType }
         *     
         */
        public void setRelevantTaxpayerNexus(RelevantTaxpayerNexusEnumType value) {
            this.relevantTaxpayerNexus = value;
        }

        /**
         * Recupera il valore della proprietà capacity.
         * 
         * @return
         *     possible object is
         *     {@link TaxpayerCapacityEnumType }
         *     
         */
        public TaxpayerCapacityEnumType getCapacity() {
            return capacity;
        }

        /**
         * Imposta il valore della proprietà capacity.
         * 
         * @param value
         *     allowed object is
         *     {@link TaxpayerCapacityEnumType }
         *     
         */
        public void setCapacity(TaxpayerCapacityEnumType value) {
            this.capacity = value;
        }

    }

}
