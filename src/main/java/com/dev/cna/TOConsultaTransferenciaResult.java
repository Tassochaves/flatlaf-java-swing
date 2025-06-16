
package com.dev.cna;

import jakarta.xml.bind.JAXBElement;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElementRef;
import jakarta.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Classe Java de TOConsultaTransferenciaResult complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="TOConsultaTransferenciaResult"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Cpf" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="DataSolicitacao" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="NomeAdvo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="NumrSegu" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="SeccDestino" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="SeccOrigem" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TOConsultaTransferenciaResult", namespace = "http://schemas.datacontract.org/2004/07/Cfoab.Integracao.Negocio.TO", propOrder = {
    "cpf",
    "dataSolicitacao",
    "nomeAdvo",
    "numrSegu",
    "seccDestino",
    "seccOrigem"
})
public class TOConsultaTransferenciaResult {

    @XmlElementRef(name = "Cpf", namespace = "http://schemas.datacontract.org/2004/07/Cfoab.Integracao.Negocio.TO", type = JAXBElement.class, required = false)
    protected JAXBElement<String> cpf;
    @XmlElementRef(name = "DataSolicitacao", namespace = "http://schemas.datacontract.org/2004/07/Cfoab.Integracao.Negocio.TO", type = JAXBElement.class, required = false)
    protected JAXBElement<XMLGregorianCalendar> dataSolicitacao;
    @XmlElementRef(name = "NomeAdvo", namespace = "http://schemas.datacontract.org/2004/07/Cfoab.Integracao.Negocio.TO", type = JAXBElement.class, required = false)
    protected JAXBElement<String> nomeAdvo;
    @XmlElementRef(name = "NumrSegu", namespace = "http://schemas.datacontract.org/2004/07/Cfoab.Integracao.Negocio.TO", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> numrSegu;
    @XmlElementRef(name = "SeccDestino", namespace = "http://schemas.datacontract.org/2004/07/Cfoab.Integracao.Negocio.TO", type = JAXBElement.class, required = false)
    protected JAXBElement<String> seccDestino;
    @XmlElementRef(name = "SeccOrigem", namespace = "http://schemas.datacontract.org/2004/07/Cfoab.Integracao.Negocio.TO", type = JAXBElement.class, required = false)
    protected JAXBElement<String> seccOrigem;

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
     * Obtém o valor da propriedade dataSolicitacao.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public JAXBElement<XMLGregorianCalendar> getDataSolicitacao() {
        return dataSolicitacao;
    }

    /**
     * Define o valor da propriedade dataSolicitacao.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public void setDataSolicitacao(JAXBElement<XMLGregorianCalendar> value) {
        this.dataSolicitacao = value;
    }

    /**
     * Obtém o valor da propriedade nomeAdvo.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getNomeAdvo() {
        return nomeAdvo;
    }

    /**
     * Define o valor da propriedade nomeAdvo.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setNomeAdvo(JAXBElement<String> value) {
        this.nomeAdvo = value;
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
     * Obtém o valor da propriedade seccDestino.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getSeccDestino() {
        return seccDestino;
    }

    /**
     * Define o valor da propriedade seccDestino.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setSeccDestino(JAXBElement<String> value) {
        this.seccDestino = value;
    }

    /**
     * Obtém o valor da propriedade seccOrigem.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getSeccOrigem() {
        return seccOrigem;
    }

    /**
     * Define o valor da propriedade seccOrigem.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setSeccOrigem(JAXBElement<String> value) {
        this.seccOrigem = value;
    }

}
