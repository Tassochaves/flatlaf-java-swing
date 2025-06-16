
package com.dev.cna;

import jakarta.xml.bind.JAXBElement;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlElementRef;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de TOBiometricoAdvogado complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="TOBiometricoAdvogado"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="CPF" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="PossuiAssinatura" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="PossuiDigital" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="PossuiFoto" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TOBiometricoAdvogado", namespace = "http://schemas.datacontract.org/2004/07/Cfoab.Integracao.Negocio.TO", propOrder = {
    "cpf",
    "possuiAssinatura",
    "possuiDigital",
    "possuiFoto"
})
public class TOBiometricoAdvogado {

    @XmlElementRef(name = "CPF", namespace = "http://schemas.datacontract.org/2004/07/Cfoab.Integracao.Negocio.TO", type = JAXBElement.class, required = false)
    protected JAXBElement<String> cpf;
    @XmlElement(name = "PossuiAssinatura")
    protected Boolean possuiAssinatura;
    @XmlElement(name = "PossuiDigital")
    protected Boolean possuiDigital;
    @XmlElement(name = "PossuiFoto")
    protected Boolean possuiFoto;

    /**
     * Obtém o valor da propriedade cpf.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCPF() {
        return cpf;
    }

    /**
     * Define o valor da propriedade cpf.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCPF(JAXBElement<String> value) {
        this.cpf = value;
    }

    /**
     * Obtém o valor da propriedade possuiAssinatura.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isPossuiAssinatura() {
        return possuiAssinatura;
    }

    /**
     * Define o valor da propriedade possuiAssinatura.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setPossuiAssinatura(Boolean value) {
        this.possuiAssinatura = value;
    }

    /**
     * Obtém o valor da propriedade possuiDigital.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isPossuiDigital() {
        return possuiDigital;
    }

    /**
     * Define o valor da propriedade possuiDigital.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setPossuiDigital(Boolean value) {
        this.possuiDigital = value;
    }

    /**
     * Obtém o valor da propriedade possuiFoto.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isPossuiFoto() {
        return possuiFoto;
    }

    /**
     * Define o valor da propriedade possuiFoto.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setPossuiFoto(Boolean value) {
        this.possuiFoto = value;
    }

}
