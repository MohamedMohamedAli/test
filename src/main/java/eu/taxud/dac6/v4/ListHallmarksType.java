
package eu.taxud.dac6.v4;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java per ListHallmarks_Type complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="ListHallmarks_Type">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Hallmark" type="{urn:eu:taxud:dac6:v1}HallmarkEnum_Type" maxOccurs="unbounded"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ListHallmarks_Type", namespace = "urn:eu:taxud:dac6:v1", propOrder = {
    "hallmark"
})
public class ListHallmarksType {

    @XmlElement(name = "Hallmark", namespace = "urn:eu:taxud:dac6:v1", required = true)
    @XmlSchemaType(name = "string")
    protected List<HallmarkEnumType> hallmark;

    /**
     * Gets the value of the hallmark property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the hallmark property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getHallmark().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link HallmarkEnumType }
     * 
     * 
     */
    public List<HallmarkEnumType> getHallmark() {
        if (hallmark == null) {
            hallmark = new ArrayList<HallmarkEnumType>();
        }
        return this.hallmark;
    }

}
