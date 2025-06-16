
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
 *         &lt;element name="ConsultaAdvogadoResult" type="{http://schemas.datacontract.org/2004/07/Cfoab.Integracao.Negocio.TO}ArrayOfTOConsultaAdvogadoResult" minOccurs="0"/&gt;
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
    "consultaAdvogadoResult"
})
@XmlRootElement(name = "ConsultaAdvogadoResponse")
public class ConsultaAdvogadoResponse {

    @XmlElementRef(name = "ConsultaAdvogadoResult", namespace = "https://www5.oab.org.br/integracao/", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfTOConsultaAdvogadoResult> consultaAdvogadoResult;

    /**
     * Obtém o valor da propriedade consultaAdvogadoResult.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfTOConsultaAdvogadoResult }{@code >}
     *     
     */
    public JAXBElement<ArrayOfTOConsultaAdvogadoResult> getConsultaAdvogadoResult() {
        return consultaAdvogadoResult;
    }

    /**
     * Define o valor da propriedade consultaAdvogadoResult.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfTOConsultaAdvogadoResult }{@code >}
     *     
     */
    public void setConsultaAdvogadoResult(JAXBElement<ArrayOfTOConsultaAdvogadoResult> value) {
        this.consultaAdvogadoResult = value;
    }

}
