
package com.dev.cna;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de ArrayOfTOConsultaPedido complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfTOConsultaPedido"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="TOConsultaPedido" type="{http://schemas.datacontract.org/2004/07/Cfoab.Integracao.Negocio.TO}TOConsultaPedido" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfTOConsultaPedido", namespace = "http://schemas.datacontract.org/2004/07/Cfoab.Integracao.Negocio.TO", propOrder = {
    "toConsultaPedido"
})
public class ArrayOfTOConsultaPedido {

    @XmlElement(name = "TOConsultaPedido", nillable = true)
    protected List<TOConsultaPedido> toConsultaPedido;

    /**
     * Gets the value of the toConsultaPedido property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the toConsultaPedido property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTOConsultaPedido().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TOConsultaPedido }
     * 
     * 
     */
    public List<TOConsultaPedido> getTOConsultaPedido() {
        if (toConsultaPedido == null) {
            toConsultaPedido = new ArrayList<TOConsultaPedido>();
        }
        return this.toConsultaPedido;
    }

}
