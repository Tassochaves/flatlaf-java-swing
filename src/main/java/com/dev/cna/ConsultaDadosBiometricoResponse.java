
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
 *         &lt;element name="ConsultaDadosBiometricoResult" type="{http://schemas.datacontract.org/2004/07/Cfoab.Integracao.Negocio.TO}TOBiometricoAdvogado" minOccurs="0"/&gt;
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
    "consultaDadosBiometricoResult"
})
@XmlRootElement(name = "ConsultaDadosBiometricoResponse")
public class ConsultaDadosBiometricoResponse {

    @XmlElementRef(name = "ConsultaDadosBiometricoResult", namespace = "https://www5.oab.org.br/integracao/", type = JAXBElement.class, required = false)
    protected JAXBElement<TOBiometricoAdvogado> consultaDadosBiometricoResult;

    /**
     * Obtém o valor da propriedade consultaDadosBiometricoResult.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link TOBiometricoAdvogado }{@code >}
     *     
     */
    public JAXBElement<TOBiometricoAdvogado> getConsultaDadosBiometricoResult() {
        return consultaDadosBiometricoResult;
    }

    /**
     * Define o valor da propriedade consultaDadosBiometricoResult.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link TOBiometricoAdvogado }{@code >}
     *     
     */
    public void setConsultaDadosBiometricoResult(JAXBElement<TOBiometricoAdvogado> value) {
        this.consultaDadosBiometricoResult = value;
    }

}
