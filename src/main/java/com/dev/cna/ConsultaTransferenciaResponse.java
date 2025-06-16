
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
 *         &lt;element name="ConsultaTransferenciaResult" type="{http://schemas.datacontract.org/2004/07/Cfoab.Integracao.Negocio.TO}ArrayOfTOConsultaTransferenciaResult" minOccurs="0"/&gt;
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
    "consultaTransferenciaResult"
})
@XmlRootElement(name = "ConsultaTransferenciaResponse")
public class ConsultaTransferenciaResponse {

    @XmlElementRef(name = "ConsultaTransferenciaResult", namespace = "https://www5.oab.org.br/integracao/", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfTOConsultaTransferenciaResult> consultaTransferenciaResult;

    /**
     * Obtém o valor da propriedade consultaTransferenciaResult.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfTOConsultaTransferenciaResult }{@code >}
     *     
     */
    public JAXBElement<ArrayOfTOConsultaTransferenciaResult> getConsultaTransferenciaResult() {
        return consultaTransferenciaResult;
    }

    /**
     * Define o valor da propriedade consultaTransferenciaResult.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfTOConsultaTransferenciaResult }{@code >}
     *     
     */
    public void setConsultaTransferenciaResult(JAXBElement<ArrayOfTOConsultaTransferenciaResult> value) {
        this.consultaTransferenciaResult = value;
    }

}
