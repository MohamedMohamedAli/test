
package eu.taxud.dac6.v4;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java per ConcernedMSs_Type complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="ConcernedMSs_Type">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ConcernedMS" type="{urn:eu:taxud:isotypes:v1}MSCountryCode_Type" maxOccurs="unbounded"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ConcernedMSs_Type", namespace = "urn:eu:taxud:dac6:v1", propOrder = {
    "concernedMS"
})
public class ConcernedMSsType {

    @XmlElement(name = "ConcernedMS", namespace = "urn:eu:taxud:dac6:v1", required = true)
    @XmlSchemaType(name = "string")
    protected List<MSCountryCodeType> concernedMS;

    /**
     * Gets the value of the concernedMS property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the concernedMS property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getConcernedMS().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link MSCountryCodeType }
     * 
     * 
     */
    public List<MSCountryCodeType> getConcernedMS() {
        if (concernedMS == null) {
            concernedMS = new ArrayList<MSCountryCodeType>();
        }
        return this.concernedMS;
    }

}
