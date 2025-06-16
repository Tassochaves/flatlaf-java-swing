
package com.dev.cna;

import jakarta.xml.bind.JAXBElement;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElementRef;
import jakarta.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Classe Java de TOConsultaAdvogadoResult complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="TOConsultaAdvogadoResult"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="BairCom" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="BairRes" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="BitDivuEndeCom" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="BitDivuEndeRes" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="BitDivuTelfCom" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="BitDivuTelfRes" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="BitEnviEmalCom" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="BitEnviEmalRes" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="BitPublCada" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="BitPublFoto" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="CertMilt" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="CodiCiddCom" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="CodiCiddElei" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="CodiCiddNasc" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="CodiCiddRes" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="CodiDefc" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="CodiRacaCor" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="CodiStatAdvo" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="CompCom" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="CompRes" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Cpf" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="DatAtualizacao" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="DataCola" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="DataCpro" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="DataEmis" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="DataEmisRG" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="DataNasc" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="DataStat" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="DataTransf" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="DescRacaCor" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Descdefi" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="EmailCom" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="EmailRes" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="EstdCivl" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ExpeMilt" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="IdenEstdCivl" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="IdenOgan" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="IdenOganTransf" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="IdtAdvo" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="IdtFacu" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="IdtTipoDoad" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="IdtTipoInscOab" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="Insc" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="InscOab" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="LogrCom" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="LogrRes" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Nacn" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="NomeAdvo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="NomeCiddCom" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="NomeCiddElei" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="NomeCiddNasc" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="NomeCiddRes" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="NomeInst" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="NomeMae2Advo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="NomeMaeAdvo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="NomeOgan" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="NomePai2Advo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="NomePaiAdvo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="NomeProf" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="NomeSoci" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="NumrCepCom" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="NumrCepRes" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="NumrDDDCelCom" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="NumrDDDCelRes" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="NumrDDDCom" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="NumrDDDFaxCom" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="NumrDDDFaxRes" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="NumrDDDRes" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="NumrEndeCom" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="NumrEndeRes" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="NumrSegu" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="NumrTelfCelCom" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="NumrTelfCelRes" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="NumrTelfCom" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="NumrTelfFaxCom" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="NumrTelfFaxRes" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="NumrTelfRes" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="OrgaEmisRG" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Pass" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="RG" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="SecaElei" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Sexo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="SiglUFCom" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="SiglUFElei" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="SiglUFNasc" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="SiglUFRes" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="TipoDoad" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="TitlElei" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ViaCart" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" minOccurs="0"/&gt;
 *         &lt;element name="ViaCrte" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" minOccurs="0"/&gt;
 *         &lt;element name="ZonaElei" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TOConsultaAdvogadoResult", namespace = "http://schemas.datacontract.org/2004/07/Cfoab.Integracao.Negocio.TO", propOrder = {
    "bairCom",
    "bairRes",
    "bitDivuEndeCom",
    "bitDivuEndeRes",
    "bitDivuTelfCom",
    "bitDivuTelfRes",
    "bitEnviEmalCom",
    "bitEnviEmalRes",
    "bitPublCada",
    "bitPublFoto",
    "certMilt",
    "codiCiddCom",
    "codiCiddElei",
    "codiCiddNasc",
    "codiCiddRes",
    "codiDefc",
    "codiRacaCor",
    "codiStatAdvo",
    "compCom",
    "compRes",
    "cpf",
    "datAtualizacao",
    "dataCola",
    "dataCpro",
    "dataEmis",
    "dataEmisRG",
    "dataNasc",
    "dataStat",
    "dataTransf",
    "descRacaCor",
    "descdefi",
    "emailCom",
    "emailRes",
    "estdCivl",
    "expeMilt",
    "idenEstdCivl",
    "idenOgan",
    "idenOganTransf",
    "idtAdvo",
    "idtFacu",
    "idtTipoDoad",
    "idtTipoInscOab",
    "insc",
    "inscOab",
    "logrCom",
    "logrRes",
    "nacn",
    "nomeAdvo",
    "nomeCiddCom",
    "nomeCiddElei",
    "nomeCiddNasc",
    "nomeCiddRes",
    "nomeInst",
    "nomeMae2Advo",
    "nomeMaeAdvo",
    "nomeOgan",
    "nomePai2Advo",
    "nomePaiAdvo",
    "nomeProf",
    "nomeSoci",
    "numrCepCom",
    "numrCepRes",
    "numrDDDCelCom",
    "numrDDDCelRes",
    "numrDDDCom",
    "numrDDDFaxCom",
    "numrDDDFaxRes",
    "numrDDDRes",
    "numrEndeCom",
    "numrEndeRes",
    "numrSegu",
    "numrTelfCelCom",
    "numrTelfCelRes",
    "numrTelfCom",
    "numrTelfFaxCom",
    "numrTelfFaxRes",
    "numrTelfRes",
    "orgaEmisRG",
    "pass",
    "rg",
    "secaElei",
    "sexo",
    "siglUFCom",
    "siglUFElei",
    "siglUFNasc",
    "siglUFRes",
    "tipoDoad",
    "titlElei",
    "viaCart",
    "viaCrte",
    "zonaElei"
})
public class TOConsultaAdvogadoResult {

    @XmlElementRef(name = "BairCom", namespace = "http://schemas.datacontract.org/2004/07/Cfoab.Integracao.Negocio.TO", type = JAXBElement.class, required = false)
    protected JAXBElement<String> bairCom;
    @XmlElementRef(name = "BairRes", namespace = "http://schemas.datacontract.org/2004/07/Cfoab.Integracao.Negocio.TO", type = JAXBElement.class, required = false)
    protected JAXBElement<String> bairRes;
    @XmlElementRef(name = "BitDivuEndeCom", namespace = "http://schemas.datacontract.org/2004/07/Cfoab.Integracao.Negocio.TO", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> bitDivuEndeCom;
    @XmlElementRef(name = "BitDivuEndeRes", namespace = "http://schemas.datacontract.org/2004/07/Cfoab.Integracao.Negocio.TO", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> bitDivuEndeRes;
    @XmlElementRef(name = "BitDivuTelfCom", namespace = "http://schemas.datacontract.org/2004/07/Cfoab.Integracao.Negocio.TO", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> bitDivuTelfCom;
    @XmlElementRef(name = "BitDivuTelfRes", namespace = "http://schemas.datacontract.org/2004/07/Cfoab.Integracao.Negocio.TO", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> bitDivuTelfRes;
    @XmlElementRef(name = "BitEnviEmalCom", namespace = "http://schemas.datacontract.org/2004/07/Cfoab.Integracao.Negocio.TO", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> bitEnviEmalCom;
    @XmlElementRef(name = "BitEnviEmalRes", namespace = "http://schemas.datacontract.org/2004/07/Cfoab.Integracao.Negocio.TO", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> bitEnviEmalRes;
    @XmlElementRef(name = "BitPublCada", namespace = "http://schemas.datacontract.org/2004/07/Cfoab.Integracao.Negocio.TO", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> bitPublCada;
    @XmlElementRef(name = "BitPublFoto", namespace = "http://schemas.datacontract.org/2004/07/Cfoab.Integracao.Negocio.TO", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> bitPublFoto;
    @XmlElementRef(name = "CertMilt", namespace = "http://schemas.datacontract.org/2004/07/Cfoab.Integracao.Negocio.TO", type = JAXBElement.class, required = false)
    protected JAXBElement<String> certMilt;
    @XmlElementRef(name = "CodiCiddCom", namespace = "http://schemas.datacontract.org/2004/07/Cfoab.Integracao.Negocio.TO", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> codiCiddCom;
    @XmlElementRef(name = "CodiCiddElei", namespace = "http://schemas.datacontract.org/2004/07/Cfoab.Integracao.Negocio.TO", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> codiCiddElei;
    @XmlElementRef(name = "CodiCiddNasc", namespace = "http://schemas.datacontract.org/2004/07/Cfoab.Integracao.Negocio.TO", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> codiCiddNasc;
    @XmlElementRef(name = "CodiCiddRes", namespace = "http://schemas.datacontract.org/2004/07/Cfoab.Integracao.Negocio.TO", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> codiCiddRes;
    @XmlElementRef(name = "CodiDefc", namespace = "http://schemas.datacontract.org/2004/07/Cfoab.Integracao.Negocio.TO", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> codiDefc;
    @XmlElementRef(name = "CodiRacaCor", namespace = "http://schemas.datacontract.org/2004/07/Cfoab.Integracao.Negocio.TO", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> codiRacaCor;
    @XmlElementRef(name = "CodiStatAdvo", namespace = "http://schemas.datacontract.org/2004/07/Cfoab.Integracao.Negocio.TO", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> codiStatAdvo;
    @XmlElementRef(name = "CompCom", namespace = "http://schemas.datacontract.org/2004/07/Cfoab.Integracao.Negocio.TO", type = JAXBElement.class, required = false)
    protected JAXBElement<String> compCom;
    @XmlElementRef(name = "CompRes", namespace = "http://schemas.datacontract.org/2004/07/Cfoab.Integracao.Negocio.TO", type = JAXBElement.class, required = false)
    protected JAXBElement<String> compRes;
    @XmlElementRef(name = "Cpf", namespace = "http://schemas.datacontract.org/2004/07/Cfoab.Integracao.Negocio.TO", type = JAXBElement.class, required = false)
    protected JAXBElement<String> cpf;
    @XmlElementRef(name = "DatAtualizacao", namespace = "http://schemas.datacontract.org/2004/07/Cfoab.Integracao.Negocio.TO", type = JAXBElement.class, required = false)
    protected JAXBElement<XMLGregorianCalendar> datAtualizacao;
    @XmlElementRef(name = "DataCola", namespace = "http://schemas.datacontract.org/2004/07/Cfoab.Integracao.Negocio.TO", type = JAXBElement.class, required = false)
    protected JAXBElement<XMLGregorianCalendar> dataCola;
    @XmlElementRef(name = "DataCpro", namespace = "http://schemas.datacontract.org/2004/07/Cfoab.Integracao.Negocio.TO", type = JAXBElement.class, required = false)
    protected JAXBElement<XMLGregorianCalendar> dataCpro;
    @XmlElementRef(name = "DataEmis", namespace = "http://schemas.datacontract.org/2004/07/Cfoab.Integracao.Negocio.TO", type = JAXBElement.class, required = false)
    protected JAXBElement<XMLGregorianCalendar> dataEmis;
    @XmlElementRef(name = "DataEmisRG", namespace = "http://schemas.datacontract.org/2004/07/Cfoab.Integracao.Negocio.TO", type = JAXBElement.class, required = false)
    protected JAXBElement<XMLGregorianCalendar> dataEmisRG;
    @XmlElementRef(name = "DataNasc", namespace = "http://schemas.datacontract.org/2004/07/Cfoab.Integracao.Negocio.TO", type = JAXBElement.class, required = false)
    protected JAXBElement<XMLGregorianCalendar> dataNasc;
    @XmlElementRef(name = "DataStat", namespace = "http://schemas.datacontract.org/2004/07/Cfoab.Integracao.Negocio.TO", type = JAXBElement.class, required = false)
    protected JAXBElement<XMLGregorianCalendar> dataStat;
    @XmlElementRef(name = "DataTransf", namespace = "http://schemas.datacontract.org/2004/07/Cfoab.Integracao.Negocio.TO", type = JAXBElement.class, required = false)
    protected JAXBElement<XMLGregorianCalendar> dataTransf;
    @XmlElementRef(name = "DescRacaCor", namespace = "http://schemas.datacontract.org/2004/07/Cfoab.Integracao.Negocio.TO", type = JAXBElement.class, required = false)
    protected JAXBElement<String> descRacaCor;
    @XmlElementRef(name = "Descdefi", namespace = "http://schemas.datacontract.org/2004/07/Cfoab.Integracao.Negocio.TO", type = JAXBElement.class, required = false)
    protected JAXBElement<String> descdefi;
    @XmlElementRef(name = "EmailCom", namespace = "http://schemas.datacontract.org/2004/07/Cfoab.Integracao.Negocio.TO", type = JAXBElement.class, required = false)
    protected JAXBElement<String> emailCom;
    @XmlElementRef(name = "EmailRes", namespace = "http://schemas.datacontract.org/2004/07/Cfoab.Integracao.Negocio.TO", type = JAXBElement.class, required = false)
    protected JAXBElement<String> emailRes;
    @XmlElementRef(name = "EstdCivl", namespace = "http://schemas.datacontract.org/2004/07/Cfoab.Integracao.Negocio.TO", type = JAXBElement.class, required = false)
    protected JAXBElement<String> estdCivl;
    @XmlElementRef(name = "ExpeMilt", namespace = "http://schemas.datacontract.org/2004/07/Cfoab.Integracao.Negocio.TO", type = JAXBElement.class, required = false)
    protected JAXBElement<String> expeMilt;
    @XmlElementRef(name = "IdenEstdCivl", namespace = "http://schemas.datacontract.org/2004/07/Cfoab.Integracao.Negocio.TO", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> idenEstdCivl;
    @XmlElementRef(name = "IdenOgan", namespace = "http://schemas.datacontract.org/2004/07/Cfoab.Integracao.Negocio.TO", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> idenOgan;
    @XmlElementRef(name = "IdenOganTransf", namespace = "http://schemas.datacontract.org/2004/07/Cfoab.Integracao.Negocio.TO", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> idenOganTransf;
    @XmlElementRef(name = "IdtAdvo", namespace = "http://schemas.datacontract.org/2004/07/Cfoab.Integracao.Negocio.TO", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> idtAdvo;
    @XmlElementRef(name = "IdtFacu", namespace = "http://schemas.datacontract.org/2004/07/Cfoab.Integracao.Negocio.TO", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> idtFacu;
    @XmlElementRef(name = "IdtTipoDoad", namespace = "http://schemas.datacontract.org/2004/07/Cfoab.Integracao.Negocio.TO", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> idtTipoDoad;
    @XmlElementRef(name = "IdtTipoInscOab", namespace = "http://schemas.datacontract.org/2004/07/Cfoab.Integracao.Negocio.TO", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> idtTipoInscOab;
    @XmlElementRef(name = "Insc", namespace = "http://schemas.datacontract.org/2004/07/Cfoab.Integracao.Negocio.TO", type = JAXBElement.class, required = false)
    protected JAXBElement<String> insc;
    @XmlElementRef(name = "InscOab", namespace = "http://schemas.datacontract.org/2004/07/Cfoab.Integracao.Negocio.TO", type = JAXBElement.class, required = false)
    protected JAXBElement<String> inscOab;
    @XmlElementRef(name = "LogrCom", namespace = "http://schemas.datacontract.org/2004/07/Cfoab.Integracao.Negocio.TO", type = JAXBElement.class, required = false)
    protected JAXBElement<String> logrCom;
    @XmlElementRef(name = "LogrRes", namespace = "http://schemas.datacontract.org/2004/07/Cfoab.Integracao.Negocio.TO", type = JAXBElement.class, required = false)
    protected JAXBElement<String> logrRes;
    @XmlElementRef(name = "Nacn", namespace = "http://schemas.datacontract.org/2004/07/Cfoab.Integracao.Negocio.TO", type = JAXBElement.class, required = false)
    protected JAXBElement<String> nacn;
    @XmlElementRef(name = "NomeAdvo", namespace = "http://schemas.datacontract.org/2004/07/Cfoab.Integracao.Negocio.TO", type = JAXBElement.class, required = false)
    protected JAXBElement<String> nomeAdvo;
    @XmlElementRef(name = "NomeCiddCom", namespace = "http://schemas.datacontract.org/2004/07/Cfoab.Integracao.Negocio.TO", type = JAXBElement.class, required = false)
    protected JAXBElement<String> nomeCiddCom;
    @XmlElementRef(name = "NomeCiddElei", namespace = "http://schemas.datacontract.org/2004/07/Cfoab.Integracao.Negocio.TO", type = JAXBElement.class, required = false)
    protected JAXBElement<String> nomeCiddElei;
    @XmlElementRef(name = "NomeCiddNasc", namespace = "http://schemas.datacontract.org/2004/07/Cfoab.Integracao.Negocio.TO", type = JAXBElement.class, required = false)
    protected JAXBElement<String> nomeCiddNasc;
    @XmlElementRef(name = "NomeCiddRes", namespace = "http://schemas.datacontract.org/2004/07/Cfoab.Integracao.Negocio.TO", type = JAXBElement.class, required = false)
    protected JAXBElement<String> nomeCiddRes;
    @XmlElementRef(name = "NomeInst", namespace = "http://schemas.datacontract.org/2004/07/Cfoab.Integracao.Negocio.TO", type = JAXBElement.class, required = false)
    protected JAXBElement<String> nomeInst;
    @XmlElementRef(name = "NomeMae2Advo", namespace = "http://schemas.datacontract.org/2004/07/Cfoab.Integracao.Negocio.TO", type = JAXBElement.class, required = false)
    protected JAXBElement<String> nomeMae2Advo;
    @XmlElementRef(name = "NomeMaeAdvo", namespace = "http://schemas.datacontract.org/2004/07/Cfoab.Integracao.Negocio.TO", type = JAXBElement.class, required = false)
    protected JAXBElement<String> nomeMaeAdvo;
    @XmlElementRef(name = "NomeOgan", namespace = "http://schemas.datacontract.org/2004/07/Cfoab.Integracao.Negocio.TO", type = JAXBElement.class, required = false)
    protected JAXBElement<String> nomeOgan;
    @XmlElementRef(name = "NomePai2Advo", namespace = "http://schemas.datacontract.org/2004/07/Cfoab.Integracao.Negocio.TO", type = JAXBElement.class, required = false)
    protected JAXBElement<String> nomePai2Advo;
    @XmlElementRef(name = "NomePaiAdvo", namespace = "http://schemas.datacontract.org/2004/07/Cfoab.Integracao.Negocio.TO", type = JAXBElement.class, required = false)
    protected JAXBElement<String> nomePaiAdvo;
    @XmlElementRef(name = "NomeProf", namespace = "http://schemas.datacontract.org/2004/07/Cfoab.Integracao.Negocio.TO", type = JAXBElement.class, required = false)
    protected JAXBElement<String> nomeProf;
    @XmlElementRef(name = "NomeSoci", namespace = "http://schemas.datacontract.org/2004/07/Cfoab.Integracao.Negocio.TO", type = JAXBElement.class, required = false)
    protected JAXBElement<String> nomeSoci;
    @XmlElementRef(name = "NumrCepCom", namespace = "http://schemas.datacontract.org/2004/07/Cfoab.Integracao.Negocio.TO", type = JAXBElement.class, required = false)
    protected JAXBElement<String> numrCepCom;
    @XmlElementRef(name = "NumrCepRes", namespace = "http://schemas.datacontract.org/2004/07/Cfoab.Integracao.Negocio.TO", type = JAXBElement.class, required = false)
    protected JAXBElement<String> numrCepRes;
    @XmlElementRef(name = "NumrDDDCelCom", namespace = "http://schemas.datacontract.org/2004/07/Cfoab.Integracao.Negocio.TO", type = JAXBElement.class, required = false)
    protected JAXBElement<String> numrDDDCelCom;
    @XmlElementRef(name = "NumrDDDCelRes", namespace = "http://schemas.datacontract.org/2004/07/Cfoab.Integracao.Negocio.TO", type = JAXBElement.class, required = false)
    protected JAXBElement<String> numrDDDCelRes;
    @XmlElementRef(name = "NumrDDDCom", namespace = "http://schemas.datacontract.org/2004/07/Cfoab.Integracao.Negocio.TO", type = JAXBElement.class, required = false)
    protected JAXBElement<String> numrDDDCom;
    @XmlElementRef(name = "NumrDDDFaxCom", namespace = "http://schemas.datacontract.org/2004/07/Cfoab.Integracao.Negocio.TO", type = JAXBElement.class, required = false)
    protected JAXBElement<String> numrDDDFaxCom;
    @XmlElementRef(name = "NumrDDDFaxRes", namespace = "http://schemas.datacontract.org/2004/07/Cfoab.Integracao.Negocio.TO", type = JAXBElement.class, required = false)
    protected JAXBElement<String> numrDDDFaxRes;
    @XmlElementRef(name = "NumrDDDRes", namespace = "http://schemas.datacontract.org/2004/07/Cfoab.Integracao.Negocio.TO", type = JAXBElement.class, required = false)
    protected JAXBElement<String> numrDDDRes;
    @XmlElementRef(name = "NumrEndeCom", namespace = "http://schemas.datacontract.org/2004/07/Cfoab.Integracao.Negocio.TO", type = JAXBElement.class, required = false)
    protected JAXBElement<String> numrEndeCom;
    @XmlElementRef(name = "NumrEndeRes", namespace = "http://schemas.datacontract.org/2004/07/Cfoab.Integracao.Negocio.TO", type = JAXBElement.class, required = false)
    protected JAXBElement<String> numrEndeRes;
    @XmlElementRef(name = "NumrSegu", namespace = "http://schemas.datacontract.org/2004/07/Cfoab.Integracao.Negocio.TO", type = JAXBElement.class, required = false)
    protected JAXBElement<String> numrSegu;
    @XmlElementRef(name = "NumrTelfCelCom", namespace = "http://schemas.datacontract.org/2004/07/Cfoab.Integracao.Negocio.TO", type = JAXBElement.class, required = false)
    protected JAXBElement<String> numrTelfCelCom;
    @XmlElementRef(name = "NumrTelfCelRes", namespace = "http://schemas.datacontract.org/2004/07/Cfoab.Integracao.Negocio.TO", type = JAXBElement.class, required = false)
    protected JAXBElement<String> numrTelfCelRes;
    @XmlElementRef(name = "NumrTelfCom", namespace = "http://schemas.datacontract.org/2004/07/Cfoab.Integracao.Negocio.TO", type = JAXBElement.class, required = false)
    protected JAXBElement<String> numrTelfCom;
    @XmlElementRef(name = "NumrTelfFaxCom", namespace = "http://schemas.datacontract.org/2004/07/Cfoab.Integracao.Negocio.TO", type = JAXBElement.class, required = false)
    protected JAXBElement<String> numrTelfFaxCom;
    @XmlElementRef(name = "NumrTelfFaxRes", namespace = "http://schemas.datacontract.org/2004/07/Cfoab.Integracao.Negocio.TO", type = JAXBElement.class, required = false)
    protected JAXBElement<String> numrTelfFaxRes;
    @XmlElementRef(name = "NumrTelfRes", namespace = "http://schemas.datacontract.org/2004/07/Cfoab.Integracao.Negocio.TO", type = JAXBElement.class, required = false)
    protected JAXBElement<String> numrTelfRes;
    @XmlElementRef(name = "OrgaEmisRG", namespace = "http://schemas.datacontract.org/2004/07/Cfoab.Integracao.Negocio.TO", type = JAXBElement.class, required = false)
    protected JAXBElement<String> orgaEmisRG;
    @XmlElementRef(name = "Pass", namespace = "http://schemas.datacontract.org/2004/07/Cfoab.Integracao.Negocio.TO", type = JAXBElement.class, required = false)
    protected JAXBElement<String> pass;
    @XmlElementRef(name = "RG", namespace = "http://schemas.datacontract.org/2004/07/Cfoab.Integracao.Negocio.TO", type = JAXBElement.class, required = false)
    protected JAXBElement<String> rg;
    @XmlElementRef(name = "SecaElei", namespace = "http://schemas.datacontract.org/2004/07/Cfoab.Integracao.Negocio.TO", type = JAXBElement.class, required = false)
    protected JAXBElement<String> secaElei;
    @XmlElementRef(name = "Sexo", namespace = "http://schemas.datacontract.org/2004/07/Cfoab.Integracao.Negocio.TO", type = JAXBElement.class, required = false)
    protected JAXBElement<String> sexo;
    @XmlElementRef(name = "SiglUFCom", namespace = "http://schemas.datacontract.org/2004/07/Cfoab.Integracao.Negocio.TO", type = JAXBElement.class, required = false)
    protected JAXBElement<String> siglUFCom;
    @XmlElementRef(name = "SiglUFElei", namespace = "http://schemas.datacontract.org/2004/07/Cfoab.Integracao.Negocio.TO", type = JAXBElement.class, required = false)
    protected JAXBElement<String> siglUFElei;
    @XmlElementRef(name = "SiglUFNasc", namespace = "http://schemas.datacontract.org/2004/07/Cfoab.Integracao.Negocio.TO", type = JAXBElement.class, required = false)
    protected JAXBElement<String> siglUFNasc;
    @XmlElementRef(name = "SiglUFRes", namespace = "http://schemas.datacontract.org/2004/07/Cfoab.Integracao.Negocio.TO", type = JAXBElement.class, required = false)
    protected JAXBElement<String> siglUFRes;
    @XmlElementRef(name = "TipoDoad", namespace = "http://schemas.datacontract.org/2004/07/Cfoab.Integracao.Negocio.TO", type = JAXBElement.class, required = false)
    protected JAXBElement<String> tipoDoad;
    @XmlElementRef(name = "TitlElei", namespace = "http://schemas.datacontract.org/2004/07/Cfoab.Integracao.Negocio.TO", type = JAXBElement.class, required = false)
    protected JAXBElement<String> titlElei;
    @XmlElementRef(name = "ViaCart", namespace = "http://schemas.datacontract.org/2004/07/Cfoab.Integracao.Negocio.TO", type = JAXBElement.class, required = false)
    protected JAXBElement<Short> viaCart;
    @XmlElementRef(name = "ViaCrte", namespace = "http://schemas.datacontract.org/2004/07/Cfoab.Integracao.Negocio.TO", type = JAXBElement.class, required = false)
    protected JAXBElement<Short> viaCrte;
    @XmlElementRef(name = "ZonaElei", namespace = "http://schemas.datacontract.org/2004/07/Cfoab.Integracao.Negocio.TO", type = JAXBElement.class, required = false)
    protected JAXBElement<String> zonaElei;

    /**
     * Obtém o valor da propriedade bairCom.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getBairCom() {
        return bairCom;
    }

    /**
     * Define o valor da propriedade bairCom.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setBairCom(JAXBElement<String> value) {
        this.bairCom = value;
    }

    /**
     * Obtém o valor da propriedade bairRes.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getBairRes() {
        return bairRes;
    }

    /**
     * Define o valor da propriedade bairRes.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setBairRes(JAXBElement<String> value) {
        this.bairRes = value;
    }

    /**
     * Obtém o valor da propriedade bitDivuEndeCom.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getBitDivuEndeCom() {
        return bitDivuEndeCom;
    }

    /**
     * Define o valor da propriedade bitDivuEndeCom.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setBitDivuEndeCom(JAXBElement<Boolean> value) {
        this.bitDivuEndeCom = value;
    }

    /**
     * Obtém o valor da propriedade bitDivuEndeRes.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getBitDivuEndeRes() {
        return bitDivuEndeRes;
    }

    /**
     * Define o valor da propriedade bitDivuEndeRes.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setBitDivuEndeRes(JAXBElement<Boolean> value) {
        this.bitDivuEndeRes = value;
    }

    /**
     * Obtém o valor da propriedade bitDivuTelfCom.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getBitDivuTelfCom() {
        return bitDivuTelfCom;
    }

    /**
     * Define o valor da propriedade bitDivuTelfCom.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setBitDivuTelfCom(JAXBElement<Boolean> value) {
        this.bitDivuTelfCom = value;
    }

    /**
     * Obtém o valor da propriedade bitDivuTelfRes.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getBitDivuTelfRes() {
        return bitDivuTelfRes;
    }

    /**
     * Define o valor da propriedade bitDivuTelfRes.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setBitDivuTelfRes(JAXBElement<Boolean> value) {
        this.bitDivuTelfRes = value;
    }

    /**
     * Obtém o valor da propriedade bitEnviEmalCom.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getBitEnviEmalCom() {
        return bitEnviEmalCom;
    }

    /**
     * Define o valor da propriedade bitEnviEmalCom.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setBitEnviEmalCom(JAXBElement<Boolean> value) {
        this.bitEnviEmalCom = value;
    }

    /**
     * Obtém o valor da propriedade bitEnviEmalRes.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getBitEnviEmalRes() {
        return bitEnviEmalRes;
    }

    /**
     * Define o valor da propriedade bitEnviEmalRes.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setBitEnviEmalRes(JAXBElement<Boolean> value) {
        this.bitEnviEmalRes = value;
    }

    /**
     * Obtém o valor da propriedade bitPublCada.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getBitPublCada() {
        return bitPublCada;
    }

    /**
     * Define o valor da propriedade bitPublCada.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setBitPublCada(JAXBElement<Boolean> value) {
        this.bitPublCada = value;
    }

    /**
     * Obtém o valor da propriedade bitPublFoto.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getBitPublFoto() {
        return bitPublFoto;
    }

    /**
     * Define o valor da propriedade bitPublFoto.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setBitPublFoto(JAXBElement<Boolean> value) {
        this.bitPublFoto = value;
    }

    /**
     * Obtém o valor da propriedade certMilt.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCertMilt() {
        return certMilt;
    }

    /**
     * Define o valor da propriedade certMilt.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCertMilt(JAXBElement<String> value) {
        this.certMilt = value;
    }

    /**
     * Obtém o valor da propriedade codiCiddCom.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getCodiCiddCom() {
        return codiCiddCom;
    }

    /**
     * Define o valor da propriedade codiCiddCom.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setCodiCiddCom(JAXBElement<Integer> value) {
        this.codiCiddCom = value;
    }

    /**
     * Obtém o valor da propriedade codiCiddElei.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getCodiCiddElei() {
        return codiCiddElei;
    }

    /**
     * Define o valor da propriedade codiCiddElei.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setCodiCiddElei(JAXBElement<Integer> value) {
        this.codiCiddElei = value;
    }

    /**
     * Obtém o valor da propriedade codiCiddNasc.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getCodiCiddNasc() {
        return codiCiddNasc;
    }

    /**
     * Define o valor da propriedade codiCiddNasc.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setCodiCiddNasc(JAXBElement<Integer> value) {
        this.codiCiddNasc = value;
    }

    /**
     * Obtém o valor da propriedade codiCiddRes.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getCodiCiddRes() {
        return codiCiddRes;
    }

    /**
     * Define o valor da propriedade codiCiddRes.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setCodiCiddRes(JAXBElement<Integer> value) {
        this.codiCiddRes = value;
    }

    /**
     * Obtém o valor da propriedade codiDefc.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getCodiDefc() {
        return codiDefc;
    }

    /**
     * Define o valor da propriedade codiDefc.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setCodiDefc(JAXBElement<Integer> value) {
        this.codiDefc = value;
    }

    /**
     * Obtém o valor da propriedade codiRacaCor.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getCodiRacaCor() {
        return codiRacaCor;
    }

    /**
     * Define o valor da propriedade codiRacaCor.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setCodiRacaCor(JAXBElement<Integer> value) {
        this.codiRacaCor = value;
    }

    /**
     * Obtém o valor da propriedade codiStatAdvo.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getCodiStatAdvo() {
        return codiStatAdvo;
    }

    /**
     * Define o valor da propriedade codiStatAdvo.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setCodiStatAdvo(JAXBElement<Integer> value) {
        this.codiStatAdvo = value;
    }

    /**
     * Obtém o valor da propriedade compCom.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCompCom() {
        return compCom;
    }

    /**
     * Define o valor da propriedade compCom.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCompCom(JAXBElement<String> value) {
        this.compCom = value;
    }

    /**
     * Obtém o valor da propriedade compRes.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCompRes() {
        return compRes;
    }

    /**
     * Define o valor da propriedade compRes.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCompRes(JAXBElement<String> value) {
        this.compRes = value;
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
     * Obtém o valor da propriedade datAtualizacao.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public JAXBElement<XMLGregorianCalendar> getDatAtualizacao() {
        return datAtualizacao;
    }

    /**
     * Define o valor da propriedade datAtualizacao.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public void setDatAtualizacao(JAXBElement<XMLGregorianCalendar> value) {
        this.datAtualizacao = value;
    }

    /**
     * Obtém o valor da propriedade dataCola.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public JAXBElement<XMLGregorianCalendar> getDataCola() {
        return dataCola;
    }

    /**
     * Define o valor da propriedade dataCola.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public void setDataCola(JAXBElement<XMLGregorianCalendar> value) {
        this.dataCola = value;
    }

    /**
     * Obtém o valor da propriedade dataCpro.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public JAXBElement<XMLGregorianCalendar> getDataCpro() {
        return dataCpro;
    }

    /**
     * Define o valor da propriedade dataCpro.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public void setDataCpro(JAXBElement<XMLGregorianCalendar> value) {
        this.dataCpro = value;
    }

    /**
     * Obtém o valor da propriedade dataEmis.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public JAXBElement<XMLGregorianCalendar> getDataEmis() {
        return dataEmis;
    }

    /**
     * Define o valor da propriedade dataEmis.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public void setDataEmis(JAXBElement<XMLGregorianCalendar> value) {
        this.dataEmis = value;
    }

    /**
     * Obtém o valor da propriedade dataEmisRG.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public JAXBElement<XMLGregorianCalendar> getDataEmisRG() {
        return dataEmisRG;
    }

    /**
     * Define o valor da propriedade dataEmisRG.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public void setDataEmisRG(JAXBElement<XMLGregorianCalendar> value) {
        this.dataEmisRG = value;
    }

    /**
     * Obtém o valor da propriedade dataNasc.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public JAXBElement<XMLGregorianCalendar> getDataNasc() {
        return dataNasc;
    }

    /**
     * Define o valor da propriedade dataNasc.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public void setDataNasc(JAXBElement<XMLGregorianCalendar> value) {
        this.dataNasc = value;
    }

    /**
     * Obtém o valor da propriedade dataStat.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public JAXBElement<XMLGregorianCalendar> getDataStat() {
        return dataStat;
    }

    /**
     * Define o valor da propriedade dataStat.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public void setDataStat(JAXBElement<XMLGregorianCalendar> value) {
        this.dataStat = value;
    }

    /**
     * Obtém o valor da propriedade dataTransf.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public JAXBElement<XMLGregorianCalendar> getDataTransf() {
        return dataTransf;
    }

    /**
     * Define o valor da propriedade dataTransf.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public void setDataTransf(JAXBElement<XMLGregorianCalendar> value) {
        this.dataTransf = value;
    }

    /**
     * Obtém o valor da propriedade descRacaCor.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getDescRacaCor() {
        return descRacaCor;
    }

    /**
     * Define o valor da propriedade descRacaCor.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setDescRacaCor(JAXBElement<String> value) {
        this.descRacaCor = value;
    }

    /**
     * Obtém o valor da propriedade descdefi.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getDescdefi() {
        return descdefi;
    }

    /**
     * Define o valor da propriedade descdefi.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setDescdefi(JAXBElement<String> value) {
        this.descdefi = value;
    }

    /**
     * Obtém o valor da propriedade emailCom.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getEmailCom() {
        return emailCom;
    }

    /**
     * Define o valor da propriedade emailCom.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setEmailCom(JAXBElement<String> value) {
        this.emailCom = value;
    }

    /**
     * Obtém o valor da propriedade emailRes.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getEmailRes() {
        return emailRes;
    }

    /**
     * Define o valor da propriedade emailRes.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setEmailRes(JAXBElement<String> value) {
        this.emailRes = value;
    }

    /**
     * Obtém o valor da propriedade estdCivl.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getEstdCivl() {
        return estdCivl;
    }

    /**
     * Define o valor da propriedade estdCivl.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setEstdCivl(JAXBElement<String> value) {
        this.estdCivl = value;
    }

    /**
     * Obtém o valor da propriedade expeMilt.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getExpeMilt() {
        return expeMilt;
    }

    /**
     * Define o valor da propriedade expeMilt.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setExpeMilt(JAXBElement<String> value) {
        this.expeMilt = value;
    }

    /**
     * Obtém o valor da propriedade idenEstdCivl.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getIdenEstdCivl() {
        return idenEstdCivl;
    }

    /**
     * Define o valor da propriedade idenEstdCivl.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setIdenEstdCivl(JAXBElement<Integer> value) {
        this.idenEstdCivl = value;
    }

    /**
     * Obtém o valor da propriedade idenOgan.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getIdenOgan() {
        return idenOgan;
    }

    /**
     * Define o valor da propriedade idenOgan.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setIdenOgan(JAXBElement<Integer> value) {
        this.idenOgan = value;
    }

    /**
     * Obtém o valor da propriedade idenOganTransf.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getIdenOganTransf() {
        return idenOganTransf;
    }

    /**
     * Define o valor da propriedade idenOganTransf.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setIdenOganTransf(JAXBElement<Integer> value) {
        this.idenOganTransf = value;
    }

    /**
     * Obtém o valor da propriedade idtAdvo.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getIdtAdvo() {
        return idtAdvo;
    }

    /**
     * Define o valor da propriedade idtAdvo.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setIdtAdvo(JAXBElement<Integer> value) {
        this.idtAdvo = value;
    }

    /**
     * Obtém o valor da propriedade idtFacu.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getIdtFacu() {
        return idtFacu;
    }

    /**
     * Define o valor da propriedade idtFacu.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setIdtFacu(JAXBElement<Integer> value) {
        this.idtFacu = value;
    }

    /**
     * Obtém o valor da propriedade idtTipoDoad.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getIdtTipoDoad() {
        return idtTipoDoad;
    }

    /**
     * Define o valor da propriedade idtTipoDoad.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setIdtTipoDoad(JAXBElement<Integer> value) {
        this.idtTipoDoad = value;
    }

    /**
     * Obtém o valor da propriedade idtTipoInscOab.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getIdtTipoInscOab() {
        return idtTipoInscOab;
    }

    /**
     * Define o valor da propriedade idtTipoInscOab.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setIdtTipoInscOab(JAXBElement<Integer> value) {
        this.idtTipoInscOab = value;
    }

    /**
     * Obtém o valor da propriedade insc.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getInsc() {
        return insc;
    }

    /**
     * Define o valor da propriedade insc.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setInsc(JAXBElement<String> value) {
        this.insc = value;
    }

    /**
     * Obtém o valor da propriedade inscOab.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getInscOab() {
        return inscOab;
    }

    /**
     * Define o valor da propriedade inscOab.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setInscOab(JAXBElement<String> value) {
        this.inscOab = value;
    }

    /**
     * Obtém o valor da propriedade logrCom.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getLogrCom() {
        return logrCom;
    }

    /**
     * Define o valor da propriedade logrCom.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setLogrCom(JAXBElement<String> value) {
        this.logrCom = value;
    }

    /**
     * Obtém o valor da propriedade logrRes.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getLogrRes() {
        return logrRes;
    }

    /**
     * Define o valor da propriedade logrRes.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setLogrRes(JAXBElement<String> value) {
        this.logrRes = value;
    }

    /**
     * Obtém o valor da propriedade nacn.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getNacn() {
        return nacn;
    }

    /**
     * Define o valor da propriedade nacn.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setNacn(JAXBElement<String> value) {
        this.nacn = value;
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
     * Obtém o valor da propriedade nomeCiddCom.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getNomeCiddCom() {
        return nomeCiddCom;
    }

    /**
     * Define o valor da propriedade nomeCiddCom.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setNomeCiddCom(JAXBElement<String> value) {
        this.nomeCiddCom = value;
    }

    /**
     * Obtém o valor da propriedade nomeCiddElei.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getNomeCiddElei() {
        return nomeCiddElei;
    }

    /**
     * Define o valor da propriedade nomeCiddElei.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setNomeCiddElei(JAXBElement<String> value) {
        this.nomeCiddElei = value;
    }

    /**
     * Obtém o valor da propriedade nomeCiddNasc.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getNomeCiddNasc() {
        return nomeCiddNasc;
    }

    /**
     * Define o valor da propriedade nomeCiddNasc.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setNomeCiddNasc(JAXBElement<String> value) {
        this.nomeCiddNasc = value;
    }

    /**
     * Obtém o valor da propriedade nomeCiddRes.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getNomeCiddRes() {
        return nomeCiddRes;
    }

    /**
     * Define o valor da propriedade nomeCiddRes.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setNomeCiddRes(JAXBElement<String> value) {
        this.nomeCiddRes = value;
    }

    /**
     * Obtém o valor da propriedade nomeInst.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getNomeInst() {
        return nomeInst;
    }

    /**
     * Define o valor da propriedade nomeInst.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setNomeInst(JAXBElement<String> value) {
        this.nomeInst = value;
    }

    /**
     * Obtém o valor da propriedade nomeMae2Advo.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getNomeMae2Advo() {
        return nomeMae2Advo;
    }

    /**
     * Define o valor da propriedade nomeMae2Advo.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setNomeMae2Advo(JAXBElement<String> value) {
        this.nomeMae2Advo = value;
    }

    /**
     * Obtém o valor da propriedade nomeMaeAdvo.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getNomeMaeAdvo() {
        return nomeMaeAdvo;
    }

    /**
     * Define o valor da propriedade nomeMaeAdvo.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setNomeMaeAdvo(JAXBElement<String> value) {
        this.nomeMaeAdvo = value;
    }

    /**
     * Obtém o valor da propriedade nomeOgan.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getNomeOgan() {
        return nomeOgan;
    }

    /**
     * Define o valor da propriedade nomeOgan.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setNomeOgan(JAXBElement<String> value) {
        this.nomeOgan = value;
    }

    /**
     * Obtém o valor da propriedade nomePai2Advo.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getNomePai2Advo() {
        return nomePai2Advo;
    }

    /**
     * Define o valor da propriedade nomePai2Advo.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setNomePai2Advo(JAXBElement<String> value) {
        this.nomePai2Advo = value;
    }

    /**
     * Obtém o valor da propriedade nomePaiAdvo.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getNomePaiAdvo() {
        return nomePaiAdvo;
    }

    /**
     * Define o valor da propriedade nomePaiAdvo.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setNomePaiAdvo(JAXBElement<String> value) {
        this.nomePaiAdvo = value;
    }

    /**
     * Obtém o valor da propriedade nomeProf.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getNomeProf() {
        return nomeProf;
    }

    /**
     * Define o valor da propriedade nomeProf.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setNomeProf(JAXBElement<String> value) {
        this.nomeProf = value;
    }

    /**
     * Obtém o valor da propriedade nomeSoci.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getNomeSoci() {
        return nomeSoci;
    }

    /**
     * Define o valor da propriedade nomeSoci.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setNomeSoci(JAXBElement<String> value) {
        this.nomeSoci = value;
    }

    /**
     * Obtém o valor da propriedade numrCepCom.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getNumrCepCom() {
        return numrCepCom;
    }

    /**
     * Define o valor da propriedade numrCepCom.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setNumrCepCom(JAXBElement<String> value) {
        this.numrCepCom = value;
    }

    /**
     * Obtém o valor da propriedade numrCepRes.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getNumrCepRes() {
        return numrCepRes;
    }

    /**
     * Define o valor da propriedade numrCepRes.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setNumrCepRes(JAXBElement<String> value) {
        this.numrCepRes = value;
    }

    /**
     * Obtém o valor da propriedade numrDDDCelCom.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getNumrDDDCelCom() {
        return numrDDDCelCom;
    }

    /**
     * Define o valor da propriedade numrDDDCelCom.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setNumrDDDCelCom(JAXBElement<String> value) {
        this.numrDDDCelCom = value;
    }

    /**
     * Obtém o valor da propriedade numrDDDCelRes.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getNumrDDDCelRes() {
        return numrDDDCelRes;
    }

    /**
     * Define o valor da propriedade numrDDDCelRes.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setNumrDDDCelRes(JAXBElement<String> value) {
        this.numrDDDCelRes = value;
    }

    /**
     * Obtém o valor da propriedade numrDDDCom.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getNumrDDDCom() {
        return numrDDDCom;
    }

    /**
     * Define o valor da propriedade numrDDDCom.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setNumrDDDCom(JAXBElement<String> value) {
        this.numrDDDCom = value;
    }

    /**
     * Obtém o valor da propriedade numrDDDFaxCom.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getNumrDDDFaxCom() {
        return numrDDDFaxCom;
    }

    /**
     * Define o valor da propriedade numrDDDFaxCom.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setNumrDDDFaxCom(JAXBElement<String> value) {
        this.numrDDDFaxCom = value;
    }

    /**
     * Obtém o valor da propriedade numrDDDFaxRes.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getNumrDDDFaxRes() {
        return numrDDDFaxRes;
    }

    /**
     * Define o valor da propriedade numrDDDFaxRes.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setNumrDDDFaxRes(JAXBElement<String> value) {
        this.numrDDDFaxRes = value;
    }

    /**
     * Obtém o valor da propriedade numrDDDRes.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getNumrDDDRes() {
        return numrDDDRes;
    }

    /**
     * Define o valor da propriedade numrDDDRes.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setNumrDDDRes(JAXBElement<String> value) {
        this.numrDDDRes = value;
    }

    /**
     * Obtém o valor da propriedade numrEndeCom.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getNumrEndeCom() {
        return numrEndeCom;
    }

    /**
     * Define o valor da propriedade numrEndeCom.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setNumrEndeCom(JAXBElement<String> value) {
        this.numrEndeCom = value;
    }

    /**
     * Obtém o valor da propriedade numrEndeRes.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getNumrEndeRes() {
        return numrEndeRes;
    }

    /**
     * Define o valor da propriedade numrEndeRes.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setNumrEndeRes(JAXBElement<String> value) {
        this.numrEndeRes = value;
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

    /**
     * Obtém o valor da propriedade numrTelfCelCom.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getNumrTelfCelCom() {
        return numrTelfCelCom;
    }

    /**
     * Define o valor da propriedade numrTelfCelCom.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setNumrTelfCelCom(JAXBElement<String> value) {
        this.numrTelfCelCom = value;
    }

    /**
     * Obtém o valor da propriedade numrTelfCelRes.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getNumrTelfCelRes() {
        return numrTelfCelRes;
    }

    /**
     * Define o valor da propriedade numrTelfCelRes.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setNumrTelfCelRes(JAXBElement<String> value) {
        this.numrTelfCelRes = value;
    }

    /**
     * Obtém o valor da propriedade numrTelfCom.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getNumrTelfCom() {
        return numrTelfCom;
    }

    /**
     * Define o valor da propriedade numrTelfCom.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setNumrTelfCom(JAXBElement<String> value) {
        this.numrTelfCom = value;
    }

    /**
     * Obtém o valor da propriedade numrTelfFaxCom.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getNumrTelfFaxCom() {
        return numrTelfFaxCom;
    }

    /**
     * Define o valor da propriedade numrTelfFaxCom.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setNumrTelfFaxCom(JAXBElement<String> value) {
        this.numrTelfFaxCom = value;
    }

    /**
     * Obtém o valor da propriedade numrTelfFaxRes.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getNumrTelfFaxRes() {
        return numrTelfFaxRes;
    }

    /**
     * Define o valor da propriedade numrTelfFaxRes.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setNumrTelfFaxRes(JAXBElement<String> value) {
        this.numrTelfFaxRes = value;
    }

    /**
     * Obtém o valor da propriedade numrTelfRes.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getNumrTelfRes() {
        return numrTelfRes;
    }

    /**
     * Define o valor da propriedade numrTelfRes.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setNumrTelfRes(JAXBElement<String> value) {
        this.numrTelfRes = value;
    }

    /**
     * Obtém o valor da propriedade orgaEmisRG.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getOrgaEmisRG() {
        return orgaEmisRG;
    }

    /**
     * Define o valor da propriedade orgaEmisRG.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setOrgaEmisRG(JAXBElement<String> value) {
        this.orgaEmisRG = value;
    }

    /**
     * Obtém o valor da propriedade pass.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPass() {
        return pass;
    }

    /**
     * Define o valor da propriedade pass.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPass(JAXBElement<String> value) {
        this.pass = value;
    }

    /**
     * Obtém o valor da propriedade rg.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getRG() {
        return rg;
    }

    /**
     * Define o valor da propriedade rg.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setRG(JAXBElement<String> value) {
        this.rg = value;
    }

    /**
     * Obtém o valor da propriedade secaElei.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getSecaElei() {
        return secaElei;
    }

    /**
     * Define o valor da propriedade secaElei.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setSecaElei(JAXBElement<String> value) {
        this.secaElei = value;
    }

    /**
     * Obtém o valor da propriedade sexo.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getSexo() {
        return sexo;
    }

    /**
     * Define o valor da propriedade sexo.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setSexo(JAXBElement<String> value) {
        this.sexo = value;
    }

    /**
     * Obtém o valor da propriedade siglUFCom.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getSiglUFCom() {
        return siglUFCom;
    }

    /**
     * Define o valor da propriedade siglUFCom.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setSiglUFCom(JAXBElement<String> value) {
        this.siglUFCom = value;
    }

    /**
     * Obtém o valor da propriedade siglUFElei.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getSiglUFElei() {
        return siglUFElei;
    }

    /**
     * Define o valor da propriedade siglUFElei.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setSiglUFElei(JAXBElement<String> value) {
        this.siglUFElei = value;
    }

    /**
     * Obtém o valor da propriedade siglUFNasc.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getSiglUFNasc() {
        return siglUFNasc;
    }

    /**
     * Define o valor da propriedade siglUFNasc.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setSiglUFNasc(JAXBElement<String> value) {
        this.siglUFNasc = value;
    }

    /**
     * Obtém o valor da propriedade siglUFRes.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getSiglUFRes() {
        return siglUFRes;
    }

    /**
     * Define o valor da propriedade siglUFRes.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setSiglUFRes(JAXBElement<String> value) {
        this.siglUFRes = value;
    }

    /**
     * Obtém o valor da propriedade tipoDoad.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getTipoDoad() {
        return tipoDoad;
    }

    /**
     * Define o valor da propriedade tipoDoad.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setTipoDoad(JAXBElement<String> value) {
        this.tipoDoad = value;
    }

    /**
     * Obtém o valor da propriedade titlElei.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getTitlElei() {
        return titlElei;
    }

    /**
     * Define o valor da propriedade titlElei.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setTitlElei(JAXBElement<String> value) {
        this.titlElei = value;
    }

    /**
     * Obtém o valor da propriedade viaCart.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public JAXBElement<Short> getViaCart() {
        return viaCart;
    }

    /**
     * Define o valor da propriedade viaCart.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public void setViaCart(JAXBElement<Short> value) {
        this.viaCart = value;
    }

    /**
     * Obtém o valor da propriedade viaCrte.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public JAXBElement<Short> getViaCrte() {
        return viaCrte;
    }

    /**
     * Define o valor da propriedade viaCrte.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public void setViaCrte(JAXBElement<Short> value) {
        this.viaCrte = value;
    }

    /**
     * Obtém o valor da propriedade zonaElei.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getZonaElei() {
        return zonaElei;
    }

    /**
     * Define o valor da propriedade zonaElei.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setZonaElei(JAXBElement<String> value) {
        this.zonaElei = value;
    }

}
