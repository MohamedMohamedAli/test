
package eu.taxud.dac6.v4;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java per RelevantTaxpayers_Type complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="RelevantTaxpayers_Type">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="RelevantTaxpayer" type="{urn:eu:taxud:dac6:v1}TaxPayer_Type" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RelevantTaxpayers_Type", namespace = "urn:eu:taxud:dac6:v1", propOrder = {
    "relevantTaxpayer"
})
public class RelevantTaxpayersType {

    @XmlElement(name = "RelevantTaxpayer", namespace = "urn:eu:taxud:dac6:v1")
    protected List<TaxPayerType> relevantTaxpayer;

    /**
     * Gets the value of the relevantTaxpayer property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the relevantTaxpayer property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRelevantTaxpayer().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TaxPayerType }
     * 
     * 
     */
    public List<TaxPayerType> getRelevantTaxpayer() {
        if (relevantTaxpayer == null) {
            relevantTaxpayer = new ArrayList<TaxPayerType>();
        }
        return this.relevantTaxpayer;
    }

}
