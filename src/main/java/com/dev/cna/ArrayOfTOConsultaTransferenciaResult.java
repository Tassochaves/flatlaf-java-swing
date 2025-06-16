
package com.dev.cna;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de ArrayOfTOConsultaTransferenciaResult complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfTOConsultaTransferenciaResult"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="TOConsultaTransferenciaResult" type="{http://schemas.datacontract.org/2004/07/Cfoab.Integracao.Negocio.TO}TOConsultaTransferenciaResult" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfTOConsultaTransferenciaResult", namespace = "http://schemas.datacontract.org/2004/07/Cfoab.Integracao.Negocio.TO", propOrder = {
    "toConsultaTransferenciaResult"
})
public class ArrayOfTOConsultaTransferenciaResult {

    @XmlElement(name = "TOConsultaTransferenciaResult", nillable = true)
    protected List<TOConsultaTransferenciaResult> toConsultaTransferenciaResult;

    /**
     * Gets the value of the toConsultaTransferenciaResult property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the toConsultaTransferenciaResult property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTOConsultaTransferenciaResult().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TOConsultaTransferenciaResult }
     * 
     * 
     */
    public List<TOConsultaTransferenciaResult> getTOConsultaTransferenciaResult() {
        if (toConsultaTransferenciaResult == null) {
            toConsultaTransferenciaResult = new ArrayList<TOConsultaTransferenciaResult>();
        }
        return this.toConsultaTransferenciaResult;
    }

}
