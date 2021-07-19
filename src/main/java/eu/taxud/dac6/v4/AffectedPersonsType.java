
package eu.taxud.dac6.v4;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java per AffectedPersons_Type complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="AffectedPersons_Type">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="AffectedPerson" type="{urn:eu:taxud:dac6:v1}AffectedPerson_Type" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AffectedPersons_Type", namespace = "urn:eu:taxud:dac6:v1", propOrder = {
    "affectedPerson"
})
public class AffectedPersonsType {

    @XmlElement(name = "AffectedPerson", namespace = "urn:eu:taxud:dac6:v1")
    protected List<AffectedPersonType> affectedPerson;

    /**
     * Gets the value of the affectedPerson property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the affectedPerson property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAffectedPerson().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AffectedPersonType }
     * 
     * 
     */
    public List<AffectedPersonType> getAffectedPerson() {
        if (affectedPerson == null) {
            affectedPerson = new ArrayList<AffectedPersonType>();
        }
        return this.affectedPerson;
    }

}
