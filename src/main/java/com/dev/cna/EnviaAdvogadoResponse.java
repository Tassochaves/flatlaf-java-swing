
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
 *         &lt;element name="EnviaAdvogadoResult" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
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
    "enviaAdvogadoResult"
})
@XmlRootElement(name = "EnviaAdvogadoResponse")
public class EnviaAdvogadoResponse {

    @XmlElementRef(name = "EnviaAdvogadoResult", namespace = "https://www5.oab.org.br/integracao/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> enviaAdvogadoResult;

    /**
     * Obtém o valor da propriedade enviaAdvogadoResult.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getEnviaAdvogadoResult() {
        return enviaAdvogadoResult;
    }

    /**
     * Define o valor da propriedade enviaAdvogadoResult.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setEnviaAdvogadoResult(JAXBElement<String> value) {
        this.enviaAdvogadoResult = value;
    }

}
