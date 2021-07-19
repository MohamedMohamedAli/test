
package eu.taxud.dac6.v4;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java per Summary_Type complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="Summary_Type">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Disclosure_Name" type="{urn:eu:taxud:dac6:v1}StringMin1Max400_Type"/>
 *         &lt;element name="Disclosure_Description" type="{urn:eu:taxud:dac6:v1}StringMin1Max4000WithLang_Type" maxOccurs="unbounded"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Summary_Type", namespace = "urn:eu:taxud:dac6:v1", propOrder = {
    "disclosureName",
    "disclosureDescription"
})
public class SummaryType {

    @XmlElement(name = "Disclosure_Name", namespace = "urn:eu:taxud:dac6:v1", required = true)
    protected String disclosureName;
    @XmlElement(name = "Disclosure_Description", namespace = "urn:eu:taxud:dac6:v1", required = true)
    protected List<StringMin1Max4000WithLangType> disclosureDescription;

    /**
     * Recupera il valore della proprietà disclosureName.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDisclosureName() {
        return disclosureName;
    }

    /**
     * Imposta il valore della proprietà disclosureName.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDisclosureName(String value) {
        this.disclosureName = value;
    }

    /**
     * Gets the value of the disclosureDescription property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the disclosureDescription property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDisclosureDescription().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link StringMin1Max4000WithLangType }
     * 
     * 
     */
    public List<StringMin1Max4000WithLangType> getDisclosureDescription() {
        if (disclosureDescription == null) {
            disclosureDescription = new ArrayList<StringMin1Max4000WithLangType>();
        }
        return this.disclosureDescription;
    }

}
