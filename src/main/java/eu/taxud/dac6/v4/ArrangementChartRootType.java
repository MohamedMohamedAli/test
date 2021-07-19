
package eu.taxud.dac6.v4;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java per ArrangementChartRoot_Type complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="ArrangementChartRoot_Type">
 *   &lt;complexContent>
 *     &lt;extension base="{urn:eu:taxud:dac6:v1}AbstractArrangementChart_Type">
 *       &lt;sequence>
 *         &lt;element name="ID" type="{urn:eu:taxud:dac6:v1}PersonOrOrganisationUnknown_Type" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="Void" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrangementChartRoot_Type", namespace = "urn:eu:taxud:dac6:v1", propOrder = {
    "id"
})
public class ArrangementChartRootType
    extends AbstractArrangementChartType
{

    @XmlElement(name = "ID", namespace = "urn:eu:taxud:dac6:v1")
    protected PersonOrOrganisationUnknownType id;
    @XmlAttribute(name = "Void")
    protected Boolean _void;

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

    /**
     * Recupera il valore della proprietà void.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isVoid() {
        return _void;
    }

    /**
     * Imposta il valore della proprietà void.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setVoid(Boolean value) {
        this._void = value;
    }

}
