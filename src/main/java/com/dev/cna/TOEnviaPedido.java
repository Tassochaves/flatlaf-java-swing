
package com.dev.cna;

import jakarta.xml.bind.JAXBElement;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElementRef;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de TOEnviaPedido complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="TOEnviaPedido"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="BitTrocaBiometrico" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="CPF" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="CodigoPedido" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="CodigoTipoDocumento" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="NumeroPedido" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="NumeroPedidoPai" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Organizacao" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="TextBrai1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="TextBrai2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="TextBrai3" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="TextBrai4" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Token" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TOEnviaPedido", namespace = "http://schemas.datacontract.org/2004/07/Cfoab.Integracao.Negocio.TO", propOrder = {
    "bitTrocaBiometrico",
    "cpf",
    "codigoPedido",
    "codigoTipoDocumento",
    "numeroPedido",
    "numeroPedidoPai",
    "organizacao",
    "textBrai1",
    "textBrai2",
    "textBrai3",
    "textBrai4",
    "token"
})
public class TOEnviaPedido {

    @XmlElementRef(name = "BitTrocaBiometrico", namespace = "http://schemas.datacontract.org/2004/07/Cfoab.Integracao.Negocio.TO", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> bitTrocaBiometrico;
    @XmlElementRef(name = "CPF", namespace = "http://schemas.datacontract.org/2004/07/Cfoab.Integracao.Negocio.TO", type = JAXBElement.class, required = false)
    protected JAXBElement<String> cpf;
    @XmlElementRef(name = "CodigoPedido", namespace = "http://schemas.datacontract.org/2004/07/Cfoab.Integracao.Negocio.TO", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> codigoPedido;
    @XmlElementRef(name = "CodigoTipoDocumento", namespace = "http://schemas.datacontract.org/2004/07/Cfoab.Integracao.Negocio.TO", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> codigoTipoDocumento;
    @XmlElementRef(name = "NumeroPedido", namespace = "http://schemas.datacontract.org/2004/07/Cfoab.Integracao.Negocio.TO", type = JAXBElement.class, required = false)
    protected JAXBElement<String> numeroPedido;
    @XmlElementRef(name = "NumeroPedidoPai", namespace = "http://schemas.datacontract.org/2004/07/Cfoab.Integracao.Negocio.TO", type = JAXBElement.class, required = false)
    protected JAXBElement<String> numeroPedidoPai;
    @XmlElementRef(name = "Organizacao", namespace = "http://schemas.datacontract.org/2004/07/Cfoab.Integracao.Negocio.TO", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> organizacao;
    @XmlElementRef(name = "TextBrai1", namespace = "http://schemas.datacontract.org/2004/07/Cfoab.Integracao.Negocio.TO", type = JAXBElement.class, required = false)
    protected JAXBElement<String> textBrai1;
    @XmlElementRef(name = "TextBrai2", namespace = "http://schemas.datacontract.org/2004/07/Cfoab.Integracao.Negocio.TO", type = JAXBElement.class, required = false)
    protected JAXBElement<String> textBrai2;
    @XmlElementRef(name = "TextBrai3", namespace = "http://schemas.datacontract.org/2004/07/Cfoab.Integracao.Negocio.TO", type = JAXBElement.class, required = false)
    protected JAXBElement<String> textBrai3;
    @XmlElementRef(name = "TextBrai4", namespace = "http://schemas.datacontract.org/2004/07/Cfoab.Integracao.Negocio.TO", type = JAXBElement.class, required = false)
    protected JAXBElement<String> textBrai4;
    @XmlElementRef(name = "Token", namespace = "http://schemas.datacontract.org/2004/07/Cfoab.Integracao.Negocio.TO", type = JAXBElement.class, required = false)
    protected JAXBElement<String> token;

    /**
     * Obtém o valor da propriedade bitTrocaBiometrico.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getBitTrocaBiometrico() {
        return bitTrocaBiometrico;
    }

    /**
     * Define o valor da propriedade bitTrocaBiometrico.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setBitTrocaBiometrico(JAXBElement<Boolean> value) {
        this.bitTrocaBiometrico = value;
    }

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
     * Obtém o valor da propriedade codigoPedido.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getCodigoPedido() {
        return codigoPedido;
    }

    /**
     * Define o valor da propriedade codigoPedido.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setCodigoPedido(JAXBElement<Integer> value) {
        this.codigoPedido = value;
    }

    /**
     * Obtém o valor da propriedade codigoTipoDocumento.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getCodigoTipoDocumento() {
        return codigoTipoDocumento;
    }

    /**
     * Define o valor da propriedade codigoTipoDocumento.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setCodigoTipoDocumento(JAXBElement<Integer> value) {
        this.codigoTipoDocumento = value;
    }

    /**
     * Obtém o valor da propriedade numeroPedido.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getNumeroPedido() {
        return numeroPedido;
    }

    /**
     * Define o valor da propriedade numeroPedido.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setNumeroPedido(JAXBElement<String> value) {
        this.numeroPedido = value;
    }

    /**
     * Obtém o valor da propriedade numeroPedidoPai.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getNumeroPedidoPai() {
        return numeroPedidoPai;
    }

    /**
     * Define o valor da propriedade numeroPedidoPai.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setNumeroPedidoPai(JAXBElement<String> value) {
        this.numeroPedidoPai = value;
    }

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
     * Obtém o valor da propriedade textBrai1.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getTextBrai1() {
        return textBrai1;
    }

    /**
     * Define o valor da propriedade textBrai1.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setTextBrai1(JAXBElement<String> value) {
        this.textBrai1 = value;
    }

    /**
     * Obtém o valor da propriedade textBrai2.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getTextBrai2() {
        return textBrai2;
    }

    /**
     * Define o valor da propriedade textBrai2.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setTextBrai2(JAXBElement<String> value) {
        this.textBrai2 = value;
    }

    /**
     * Obtém o valor da propriedade textBrai3.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getTextBrai3() {
        return textBrai3;
    }

    /**
     * Define o valor da propriedade textBrai3.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setTextBrai3(JAXBElement<String> value) {
        this.textBrai3 = value;
    }

    /**
     * Obtém o valor da propriedade textBrai4.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getTextBrai4() {
        return textBrai4;
    }

    /**
     * Define o valor da propriedade textBrai4.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setTextBrai4(JAXBElement<String> value) {
        this.textBrai4 = value;
    }

    /**
     * Obtém o valor da propriedade token.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getToken() {
        return token;
    }

    /**
     * Define o valor da propriedade token.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setToken(JAXBElement<String> value) {
        this.token = value;
    }

}
