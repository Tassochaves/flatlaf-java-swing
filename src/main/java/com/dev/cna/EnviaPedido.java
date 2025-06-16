
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
 *         &lt;element name="dadosPedido" type="{http://schemas.datacontract.org/2004/07/Cfoab.Integracao.Negocio.TO}TOEnviaPedido" minOccurs="0"/&gt;
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
    "dadosPedido"
})
@XmlRootElement(name = "EnviaPedido")
public class EnviaPedido {

    @XmlElementRef(name = "dadosPedido", namespace = "https://www5.oab.org.br/integracao/", type = JAXBElement.class, required = false)
    protected JAXBElement<TOEnviaPedido> dadosPedido;

    /**
     * Obtém o valor da propriedade dadosPedido.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link TOEnviaPedido }{@code >}
     *     
     */
    public JAXBElement<TOEnviaPedido> getDadosPedido() {
        return dadosPedido;
    }

    /**
     * Define o valor da propriedade dadosPedido.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link TOEnviaPedido }{@code >}
     *     
     */
    public void setDadosPedido(JAXBElement<TOEnviaPedido> value) {
        this.dadosPedido = value;
    }

}
