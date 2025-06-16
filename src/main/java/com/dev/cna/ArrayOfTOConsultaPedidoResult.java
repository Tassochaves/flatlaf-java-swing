
package com.dev.cna;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de ArrayOfTOConsultaPedidoResult complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfTOConsultaPedidoResult"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="TOConsultaPedidoResult" type="{http://schemas.datacontract.org/2004/07/Cfoab.Integracao.Negocio.TO}TOConsultaPedidoResult" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfTOConsultaPedidoResult", namespace = "http://schemas.datacontract.org/2004/07/Cfoab.Integracao.Negocio.TO", propOrder = {
    "toConsultaPedidoResult"
})
public class ArrayOfTOConsultaPedidoResult {

    @XmlElement(name = "TOConsultaPedidoResult", nillable = true)
    protected List<TOConsultaPedidoResult> toConsultaPedidoResult;

    /**
     * Gets the value of the toConsultaPedidoResult property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the toConsultaPedidoResult property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTOConsultaPedidoResult().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TOConsultaPedidoResult }
     * 
     * 
     */
    public List<TOConsultaPedidoResult> getTOConsultaPedidoResult() {
        if (toConsultaPedidoResult == null) {
            toConsultaPedidoResult = new ArrayList<TOConsultaPedidoResult>();
        }
        return this.toConsultaPedidoResult;
    }

}
