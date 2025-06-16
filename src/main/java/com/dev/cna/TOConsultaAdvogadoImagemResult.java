
package com.dev.cna;

import jakarta.xml.bind.JAXBElement;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElementRef;
import jakarta.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Classe Java de TOConsultaAdvogadoImagemResult complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="TOConsultaAdvogadoImagemResult"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Assi" type="{http://www.w3.org/2001/XMLSchema}base64Binary" minOccurs="0"/&gt;
 *         &lt;element name="BitImpAssi" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="BitImpDigi" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="BitImpFoto" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="DataAtuaAssi" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="DataAtuaDigi" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="DataAtuaFoto" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="Digi" type="{http://www.w3.org/2001/XMLSchema}base64Binary" minOccurs="0"/&gt;
 *         &lt;element name="Foto" type="{http://www.w3.org/2001/XMLSchema}base64Binary" minOccurs="0"/&gt;
 *         &lt;element name="NomeAdvo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="NumrSegu" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TOConsultaAdvogadoImagemResult", namespace = "http://schemas.datacontract.org/2004/07/Cfoab.Integracao.Negocio.TO", propOrder = {
    "assi",
    "bitImpAssi",
    "bitImpDigi",
    "bitImpFoto",
    "dataAtuaAssi",
    "dataAtuaDigi",
    "dataAtuaFoto",
    "digi",
    "foto",
    "nomeAdvo",
    "numrSegu"
})
public class TOConsultaAdvogadoImagemResult {

    @XmlElementRef(name = "Assi", namespace = "http://schemas.datacontract.org/2004/07/Cfoab.Integracao.Negocio.TO", type = JAXBElement.class, required = false)
    protected JAXBElement<byte[]> assi;
    @XmlElementRef(name = "BitImpAssi", namespace = "http://schemas.datacontract.org/2004/07/Cfoab.Integracao.Negocio.TO", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> bitImpAssi;
    @XmlElementRef(name = "BitImpDigi", namespace = "http://schemas.datacontract.org/2004/07/Cfoab.Integracao.Negocio.TO", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> bitImpDigi;
    @XmlElementRef(name = "BitImpFoto", namespace = "http://schemas.datacontract.org/2004/07/Cfoab.Integracao.Negocio.TO", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> bitImpFoto;
    @XmlElementRef(name = "DataAtuaAssi", namespace = "http://schemas.datacontract.org/2004/07/Cfoab.Integracao.Negocio.TO", type = JAXBElement.class, required = false)
    protected JAXBElement<XMLGregorianCalendar> dataAtuaAssi;
    @XmlElementRef(name = "DataAtuaDigi", namespace = "http://schemas.datacontract.org/2004/07/Cfoab.Integracao.Negocio.TO", type = JAXBElement.class, required = false)
    protected JAXBElement<XMLGregorianCalendar> dataAtuaDigi;
    @XmlElementRef(name = "DataAtuaFoto", namespace = "http://schemas.datacontract.org/2004/07/Cfoab.Integracao.Negocio.TO", type = JAXBElement.class, required = false)
    protected JAXBElement<XMLGregorianCalendar> dataAtuaFoto;
    @XmlElementRef(name = "Digi", namespace = "http://schemas.datacontract.org/2004/07/Cfoab.Integracao.Negocio.TO", type = JAXBElement.class, required = false)
    protected JAXBElement<byte[]> digi;
    @XmlElementRef(name = "Foto", namespace = "http://schemas.datacontract.org/2004/07/Cfoab.Integracao.Negocio.TO", type = JAXBElement.class, required = false)
    protected JAXBElement<byte[]> foto;
    @XmlElementRef(name = "NomeAdvo", namespace = "http://schemas.datacontract.org/2004/07/Cfoab.Integracao.Negocio.TO", type = JAXBElement.class, required = false)
    protected JAXBElement<String> nomeAdvo;
    @XmlElementRef(name = "NumrSegu", namespace = "http://schemas.datacontract.org/2004/07/Cfoab.Integracao.Negocio.TO", type = JAXBElement.class, required = false)
    protected JAXBElement<String> numrSegu;

    /**
     * Obtém o valor da propriedade assi.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link byte[]}{@code >}
     *     
     */
    public JAXBElement<byte[]> getAssi() {
        return assi;
    }

    /**
     * Define o valor da propriedade assi.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link byte[]}{@code >}
     *     
     */
    public void setAssi(JAXBElement<byte[]> value) {
        this.assi = value;
    }

    /**
     * Obtém o valor da propriedade bitImpAssi.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getBitImpAssi() {
        return bitImpAssi;
    }

    /**
     * Define o valor da propriedade bitImpAssi.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setBitImpAssi(JAXBElement<Boolean> value) {
        this.bitImpAssi = value;
    }

    /**
     * Obtém o valor da propriedade bitImpDigi.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getBitImpDigi() {
        return bitImpDigi;
    }

    /**
     * Define o valor da propriedade bitImpDigi.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setBitImpDigi(JAXBElement<Boolean> value) {
        this.bitImpDigi = value;
    }

    /**
     * Obtém o valor da propriedade bitImpFoto.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getBitImpFoto() {
        return bitImpFoto;
    }

    /**
     * Define o valor da propriedade bitImpFoto.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setBitImpFoto(JAXBElement<Boolean> value) {
        this.bitImpFoto = value;
    }

    /**
     * Obtém o valor da propriedade dataAtuaAssi.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public JAXBElement<XMLGregorianCalendar> getDataAtuaAssi() {
        return dataAtuaAssi;
    }

    /**
     * Define o valor da propriedade dataAtuaAssi.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public void setDataAtuaAssi(JAXBElement<XMLGregorianCalendar> value) {
        this.dataAtuaAssi = value;
    }

    /**
     * Obtém o valor da propriedade dataAtuaDigi.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public JAXBElement<XMLGregorianCalendar> getDataAtuaDigi() {
        return dataAtuaDigi;
    }

    /**
     * Define o valor da propriedade dataAtuaDigi.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public void setDataAtuaDigi(JAXBElement<XMLGregorianCalendar> value) {
        this.dataAtuaDigi = value;
    }

    /**
     * Obtém o valor da propriedade dataAtuaFoto.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public JAXBElement<XMLGregorianCalendar> getDataAtuaFoto() {
        return dataAtuaFoto;
    }

    /**
     * Define o valor da propriedade dataAtuaFoto.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public void setDataAtuaFoto(JAXBElement<XMLGregorianCalendar> value) {
        this.dataAtuaFoto = value;
    }

    /**
     * Obtém o valor da propriedade digi.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link byte[]}{@code >}
     *     
     */
    public JAXBElement<byte[]> getDigi() {
        return digi;
    }

    /**
     * Define o valor da propriedade digi.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link byte[]}{@code >}
     *     
     */
    public void setDigi(JAXBElement<byte[]> value) {
        this.digi = value;
    }

    /**
     * Obtém o valor da propriedade foto.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link byte[]}{@code >}
     *     
     */
    public JAXBElement<byte[]> getFoto() {
        return foto;
    }

    /**
     * Define o valor da propriedade foto.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link byte[]}{@code >}
     *     
     */
    public void setFoto(JAXBElement<byte[]> value) {
        this.foto = value;
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
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getNumrSegu() {
        return numrSegu;
    }

    /**
     * Define o valor da propriedade numrSegu.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setNumrSegu(JAXBElement<String> value) {
        this.numrSegu = value;
    }

}
