
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
 *         &lt;element name="organizacao" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="cpf" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="organizacaoTransferencia" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
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
    "organizacao",
    "cpf",
    "organizacaoTransferencia"
})
@XmlRootElement(name = "EnviaTransferencia")
public class EnviaTransferencia {

    @XmlElementRef(name = "organizacao", namespace = "https://www5.oab.org.br/integracao/", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> organizacao;
    @XmlElementRef(name = "cpf", namespace = "https://www5.oab.org.br/integracao/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> cpf;
    @XmlElementRef(name = "organizacaoTransferencia", namespace = "https://www5.oab.org.br/integracao/", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> organizacaoTransferencia;

    /**
     * Obtém o valor da propriedade organizacao.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getOrganizacao() {
        return organizacao;
    }

    /**
     * Define o valor da propriedade organizacao.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setOrganizacao(JAXBElement<Integer> value) {
        this.organizacao = value;
    }

    /**
     * Obtém o valor da propriedade cpf.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCpf() {
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
    public void setCpf(JAXBElement<String> value) {
        this.cpf = value;
    }

    /**
     * Obtém o valor da propriedade organizacaoTransferencia.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getOrganizacaoTransferencia() {
        return organizacaoTransferencia;
    }

    /**
     * Define o valor da propriedade organizacaoTransferencia.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setOrganizacaoTransferencia(JAXBElement<Integer> value) {
        this.organizacaoTransferencia = value;
    }

}
