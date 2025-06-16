
package com.dev.cna;

import jakarta.xml.bind.JAXBElement;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlElementRef;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Classe Java de TOConsultaPedido complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="TOConsultaPedido"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Biometrico" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="CodiPedi" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="CodiStatPedi" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="Cpf" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="DataHistPedi" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="DescPedi" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="DescStatPedi" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="IdtAdvo" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="NumrNotaFsca" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="NumrPedi" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="NumrSegu" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="OS" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Uf" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TOConsultaPedido", namespace = "http://schemas.datacontract.org/2004/07/Cfoab.Integracao.Negocio.TO", propOrder = {
    "biometrico",
    "codiPedi",
    "codiStatPedi",
    "cpf",
    "dataHistPedi",
    "descPedi",
    "descStatPedi",
    "idtAdvo",
    "numrNotaFsca",
    "numrPedi",
    "numrSegu",
    "os",
    "uf"
})
public class TOConsultaPedido {

    @XmlElementRef(name = "Biometrico", namespace = "http://schemas.datacontract.org/2004/07/Cfoab.Integracao.Negocio.TO", type = JAXBElement.class, required = false)
    protected JAXBElement<String> biometrico;
    @XmlElement(name = "CodiPedi")
    protected Integer codiPedi;
    @XmlElementRef(name = "CodiStatPedi", namespace = "http://schemas.datacontract.org/2004/07/Cfoab.Integracao.Negocio.TO", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> codiStatPedi;
    @XmlElementRef(name = "Cpf", namespace = "http://schemas.datacontract.org/2004/07/Cfoab.Integracao.Negocio.TO", type = JAXBElement.class, required = false)
    protected JAXBElement<String> cpf;
    @XmlElement(name = "DataHistPedi")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar dataHistPedi;
    @XmlElementRef(name = "DescPedi", namespace = "http://schemas.datacontract.org/2004/07/Cfoab.Integracao.Negocio.TO", type = JAXBElement.class, required = false)
    protected JAXBElement<String> descPedi;
    @XmlElementRef(name = "DescStatPedi", namespace = "http://schemas.datacontract.org/2004/07/Cfoab.Integracao.Negocio.TO", type = JAXBElement.class, required = false)
    protected JAXBElement<String> descStatPedi;
    @XmlElement(name = "IdtAdvo")
    protected Integer idtAdvo;
    @XmlElementRef(name = "NumrNotaFsca", namespace = "http://schemas.datacontract.org/2004/07/Cfoab.Integracao.Negocio.TO", type = JAXBElement.class, required = false)
    protected JAXBElement<String> numrNotaFsca;
    @XmlElementRef(name = "NumrPedi", namespace = "http://schemas.datacontract.org/2004/07/Cfoab.Integracao.Negocio.TO", type = JAXBElement.class, required = false)
    protected JAXBElement<String> numrPedi;
    @XmlElementRef(name = "NumrSegu", namespace = "http://schemas.datacontract.org/2004/07/Cfoab.Integracao.Negocio.TO", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> numrSegu;
    @XmlElementRef(name = "OS", namespace = "http://schemas.datacontract.org/2004/07/Cfoab.Integracao.Negocio.TO", type = JAXBElement.class, required = false)
    protected JAXBElement<String> os;
    @XmlElementRef(name = "Uf", namespace = "http://schemas.datacontract.org/2004/07/Cfoab.Integracao.Negocio.TO", type = JAXBElement.class, required = false)
    protected JAXBElement<String> uf;

    /**
     * Obtém o valor da propriedade biometrico.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getBiometrico() {
        return biometrico;
    }

    /**
     * Define o valor da propriedade biometrico.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setBiometrico(JAXBElement<String> value) {
        this.biometrico = value;
    }

    /**
     * Obtém o valor da propriedade codiPedi.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getCodiPedi() {
        return codiPedi;
    }

    /**
     * Define o valor da propriedade codiPedi.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setCodiPedi(Integer value) {
        this.codiPedi = value;
    }

    /**
     * Obtém o valor da propriedade codiStatPedi.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getCodiStatPedi() {
        return codiStatPedi;
    }

    /**
     * Define o valor da propriedade codiStatPedi.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setCodiStatPedi(JAXBElement<Integer> value) {
        this.codiStatPedi = value;
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
     * Obtém o valor da propriedade dataHistPedi.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDataHistPedi() {
        return dataHistPedi;
    }

    /**
     * Define o valor da propriedade dataHistPedi.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDataHistPedi(XMLGregorianCalendar value) {
        this.dataHistPedi = value;
    }

    /**
     * Obtém o valor da propriedade descPedi.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getDescPedi() {
        return descPedi;
    }

    /**
     * Define o valor da propriedade descPedi.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setDescPedi(JAXBElement<String> value) {
        this.descPedi = value;
    }

    /**
     * Obtém o valor da propriedade descStatPedi.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getDescStatPedi() {
        return descStatPedi;
    }

    /**
     * Define o valor da propriedade descStatPedi.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setDescStatPedi(JAXBElement<String> value) {
        this.descStatPedi = value;
    }

    /**
     * Obtém o valor da propriedade idtAdvo.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getIdtAdvo() {
        return idtAdvo;
    }

    /**
     * Define o valor da propriedade idtAdvo.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setIdtAdvo(Integer value) {
        this.idtAdvo = value;
    }

    /**
     * Obtém o valor da propriedade numrNotaFsca.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getNumrNotaFsca() {
        return numrNotaFsca;
    }

    /**
     * Define o valor da propriedade numrNotaFsca.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setNumrNotaFsca(JAXBElement<String> value) {
        this.numrNotaFsca = value;
    }

    /**
     * Obtém o valor da propriedade numrPedi.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getNumrPedi() {
        return numrPedi;
    }

    /**
     * Define o valor da propriedade numrPedi.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setNumrPedi(JAXBElement<String> value) {
        this.numrPedi = value;
    }

    /**
     * Obtém o valor da propriedade numrSegu.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getNumrSegu() {
        return numrSegu;
    }

    /**
     * Define o valor da propriedade numrSegu.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setNumrSegu(JAXBElement<Integer> value) {
        this.numrSegu = value;
    }

    /**
     * Obtém o valor da propriedade os.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getOS() {
        return os;
    }

    /**
     * Define o valor da propriedade os.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setOS(JAXBElement<String> value) {
        this.os = value;
    }

    /**
     * Obtém o valor da propriedade uf.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getUf() {
        return uf;
    }

    /**
     * Define o valor da propriedade uf.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setUf(JAXBElement<String> value) {
        this.uf = value;
    }

}
