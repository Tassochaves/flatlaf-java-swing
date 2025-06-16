
package com.dev.cna;

import jakarta.xml.bind.JAXBElement;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElementRef;
import jakarta.xml.bind.annotation.XmlRootElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de anonymous complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ConsultaPedidoCPFResult" type="{http://schemas.datacontract.org/2004/07/Cfoab.Integracao.Negocio.TO}ArrayOfTOConsultaPedido" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "consultaPedidoCPFResult"
})
@XmlRootElement(name = "ConsultaPedidoCPFResponse")
public class ConsultaPedidoCPFResponse {

    @XmlElementRef(name = "ConsultaPedidoCPFResult", namespace = "https://www5.oab.org.br/integracao/", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfTOConsultaPedido> consultaPedidoCPFResult;

    /**
     * Obtém o valor da propriedade consultaPedidoCPFResult.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfTOConsultaPedido }{@code >}
     *     
     */
    public JAXBElement<ArrayOfTOConsultaPedido> getConsultaPedidoCPFResult() {
        return consultaPedidoCPFResult;
    }

    /**
     * Define o valor da propriedade consultaPedidoCPFResult.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfTOConsultaPedido }{@code >}
     *     
     */
    public void setConsultaPedidoCPFResult(JAXBElement<ArrayOfTOConsultaPedido> value) {
        this.consultaPedidoCPFResult = value;
    }

}
