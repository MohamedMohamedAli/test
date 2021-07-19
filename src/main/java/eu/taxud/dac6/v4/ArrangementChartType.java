
package eu.taxud.dac6.v4;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java per ArrangementChart_Type complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="ArrangementChart_Type">
 *   &lt;complexContent>
 *     &lt;extension base="{urn:eu:taxud:dac6:v1}AbstractArrangementChart_Type">
 *       &lt;sequence>
 *         &lt;element name="ID" type="{urn:eu:taxud:dac6:v1}PersonOrOrganisationUnknown_Type"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrangementChart_Type", namespace = "urn:eu:taxud:dac6:v1", propOrder = {
    "id"
})
public class ArrangementChartType
    extends AbstractArrangementChartType
{

    @XmlElement(name = "ID", namespace = "urn:eu:taxud:dac6:v1", required = true)
    protected PersonOrOrganisationUnknownType id;

    /**
     * Recupera il valore della proprietà id.
     * 
     * @return
     *     possible object is
     *     {@link PersonOrOrganisationUnknownType }
     *     
     */
    public PersonOrOrganisationUnknownType getID() {
        return id;
    }

    /**
     * Imposta il valore della proprietà id.
     * 
     * @param value
     *     allowed object is
     *     {@link PersonOrOrganisationUnknownType }
     *     
     */
    public void setID(PersonOrOrganisationUnknownType value) {
        this.id = value;
    }

}
