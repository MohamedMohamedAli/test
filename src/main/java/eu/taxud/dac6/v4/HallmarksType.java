
package eu.taxud.dac6.v4;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java per Hallmarks_Type complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="Hallmarks_Type">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ListHallmarks" type="{urn:eu:taxud:dac6:v1}ListHallmarks_Type"/>
 *         &lt;element name="DAC6D1OtherInfo" type="{urn:eu:taxud:dac6:v1}StringMin1Max4000WithLang_Type" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Hallmarks_Type", namespace = "urn:eu:taxud:dac6:v1", propOrder = {
    "listHallmarks",
    "dac6D1OtherInfo"
})
public class HallmarksType {

    @XmlElement(name = "ListHallmarks", namespace = "urn:eu:taxud:dac6:v1", required = true)
    protected ListHallmarksType listHallmarks;
    @XmlElement(name = "DAC6D1OtherInfo", namespace = "urn:eu:taxud:dac6:v1")
    protected List<StringMin1Max4000WithLangType> dac6D1OtherInfo;

    /**
     * Recupera il valore della proprietà listHallmarks.
     * 
     * @return
     *     possible object is
     *     {@link ListHallmarksType }
     *     
     */
    public ListHallmarksType getListHallmarks() {
        return listHallmarks;
    }

    /**
     * Imposta il valore della proprietà listHallmarks.
     * 
     * @param value
     *     allowed object is
     *     {@link ListHallmarksType }
     *     
     */
    public void setListHallmarks(ListHallmarksType value) {
        this.listHallmarks = value;
    }

    /**
     * Gets the value of the dac6D1OtherInfo property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the dac6D1OtherInfo property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDAC6D1OtherInfo().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link StringMin1Max4000WithLangType }
     * 
     * 
     */
    public List<StringMin1Max4000WithLangType> getDAC6D1OtherInfo() {
        if (dac6D1OtherInfo == null) {
            dac6D1OtherInfo = new ArrayList<StringMin1Max4000WithLangType>();
        }
        return this.dac6D1OtherInfo;
    }

}
