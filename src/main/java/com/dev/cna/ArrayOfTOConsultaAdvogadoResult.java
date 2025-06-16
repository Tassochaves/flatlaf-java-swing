
package com.dev.cna;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de ArrayOfTOConsultaAdvogadoResult complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfTOConsultaAdvogadoResult"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="TOConsultaAdvogadoResult" type="{http://schemas.datacontract.org/2004/07/Cfoab.Integracao.Negocio.TO}TOConsultaAdvogadoResult" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfTOConsultaAdvogadoResult", namespace = "http://schemas.datacontract.org/2004/07/Cfoab.Integracao.Negocio.TO", propOrder = {
    "toConsultaAdvogadoResult"
})
public class ArrayOfTOConsultaAdvogadoResult {

    @XmlElement(name = "TOConsultaAdvogadoResult", nillable = true)
    protected List<TOConsultaAdvogadoResult> toConsultaAdvogadoResult;

    /**
     * Gets the value of the toConsultaAdvogadoResult property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the toConsultaAdvogadoResult property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTOConsultaAdvogadoResult().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TOConsultaAdvogadoResult }
     * 
     * 
     */
    public List<TOConsultaAdvogadoResult> getTOConsultaAdvogadoResult() {
        if (toConsultaAdvogadoResult == null) {
            toConsultaAdvogadoResult = new ArrayList<TOConsultaAdvogadoResult>();
        }
        return this.toConsultaAdvogadoResult;
    }

}
