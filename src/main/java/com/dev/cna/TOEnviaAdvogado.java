
package com.dev.cna;

import jakarta.xml.bind.JAXBElement;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElementRef;
import jakarta.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Classe Java de TOEnviaAdvogado complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="TOEnviaAdvogado"&gt;
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
 *         &lt;element name="CPF" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="CertMilt" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="CodiCiddCom" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="CodiCiddEleit" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="CodiCiddNasc" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="CodiCiddRes" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="CodiDefc" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="CodiPaisConsEstr" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="CodiRacaCor" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" minOccurs="0"/&gt;
 *         &lt;element name="CodiStatAdvo" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="CodiStatFina" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="CompCom" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="CompRes" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="DDDCelularRes" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="DataCola" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="DataCpro" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="DataEmisRG" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="DataNasc" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="DataStatFina" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="DataValidade" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="EmailCom" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="EmailRes" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ExpeMilt" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="IdenEstdCivl" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="IdenOgan" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="IdtFacu" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="IdtTipoDoad" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="IdtTipoInscOab" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="Impedimentos" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Insc" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="LogrCom" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="LogrRes" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Nacionalidade" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="NomeAdvo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="NomeMae2Advo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="NomeMaeAdvo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="NomePai2Advo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="NomePaiAdvo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="NomeProf" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="NomeSoci" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="NumeroEnderecoRes" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="NumrCepCom" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="NumrCepRes" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="NumrDDDCelCom" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="NumrDDDCom" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="NumrDDDFaxCom" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="NumrDDDFaxRes" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="NumrDDDRes" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="NumrEndeCom" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="NumrTelfCelCom" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="NumrTelfCelRes" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="NumrTelfCom" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="NumrTelfFaxCom" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="NumrTelfFaxRes" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="NumrTelfRes" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="OrgaEmisRG" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Pass" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="RG" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="SecaoEleitoral" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Sexo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="TitlElei" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Token" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ViaCart" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="ViaCrte" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
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
@XmlType(name = "TOEnviaAdvogado", namespace = "http://schemas.datacontract.org/2004/07/Cfoab.Integracao.Negocio.TO", propOrder = {
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
    "cpf",
    "certMilt",
    "codiCiddCom",
    "codiCiddEleit",
    "codiCiddNasc",
    "codiCiddRes",
    "codiDefc",
    "codiPaisConsEstr",
    "codiRacaCor",
    "codiStatAdvo",
    "codiStatFina",
    "compCom",
    "compRes",
    "dddCelularRes",
    "dataCola",
    "dataCpro",
    "dataEmisRG",
    "dataNasc",
    "dataStatFina",
    "dataValidade",
    "emailCom",
    "emailRes",
    "expeMilt",
    "idenEstdCivl",
    "idenOgan",
    "idtFacu",
    "idtTipoDoad",
    "idtTipoInscOab",
    "impedimentos",
    "insc",
    "logrCom",
    "logrRes",
    "nacionalidade",
    "nomeAdvo",
    "nomeMae2Advo",
    "nomeMaeAdvo",
    "nomePai2Advo",
    "nomePaiAdvo",
    "nomeProf",
    "nomeSoci",
    "numeroEnderecoRes",
    "numrCepCom",
    "numrCepRes",
    "numrDDDCelCom",
    "numrDDDCom",
    "numrDDDFaxCom",
    "numrDDDFaxRes",
    "numrDDDRes",
    "numrEndeCom",
    "numrTelfCelCom",
    "numrTelfCelRes",
    "numrTelfCom",
    "numrTelfFaxCom",
    "numrTelfFaxRes",
    "numrTelfRes",
    "orgaEmisRG",
    "pass",
    "rg",
    "secaoEleitoral",
    "sexo",
    "titlElei",
    "token",
    "viaCart",
    "viaCrte",
    "zonaElei"
})
public class TOEnviaAdvogado {

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
    @XmlElementRef(name = "CPF", namespace = "http://schemas.datacontract.org/2004/07/Cfoab.Integracao.Negocio.TO", type = JAXBElement.class, required = false)
    protected JAXBElement<String> cpf;
    @XmlElementRef(name = "CertMilt", namespace = "http://schemas.datacontract.org/2004/07/Cfoab.Integracao.Negocio.TO", type = JAXBElement.class, required = false)
    protected JAXBElement<String> certMilt;
    @XmlElementRef(name = "CodiCiddCom", namespace = "http://schemas.datacontract.org/2004/07/Cfoab.Integracao.Negocio.TO", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> codiCiddCom;
    @XmlElementRef(name = "CodiCiddEleit", namespace = "http://schemas.datacontract.org/2004/07/Cfoab.Integracao.Negocio.TO", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> codiCiddEleit;
    @XmlElementRef(name = "CodiCiddNasc", namespace = "http://schemas.datacontract.org/2004/07/Cfoab.Integracao.Negocio.TO", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> codiCiddNasc;
    @XmlElementRef(name = "CodiCiddRes", namespace = "http://schemas.datacontract.org/2004/07/Cfoab.Integracao.Negocio.TO", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> codiCiddRes;
    @XmlElementRef(name = "CodiDefc", namespace = "http://schemas.datacontract.org/2004/07/Cfoab.Integracao.Negocio.TO", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> codiDefc;
    @XmlElementRef(name = "CodiPaisConsEstr", namespace = "http://schemas.datacontract.org/2004/07/Cfoab.Integracao.Negocio.TO", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> codiPaisConsEstr;
    @XmlElementRef(name = "CodiRacaCor", namespace = "http://schemas.datacontract.org/2004/07/Cfoab.Integracao.Negocio.TO", type = JAXBElement.class, required = false)
    protected JAXBElement<Short> codiRacaCor;
    @XmlElementRef(name = "CodiStatAdvo", namespace = "http://schemas.datacontract.org/2004/07/Cfoab.Integracao.Negocio.TO", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> codiStatAdvo;
    @XmlElementRef(name = "CodiStatFina", namespace = "http://schemas.datacontract.org/2004/07/Cfoab.Integracao.Negocio.TO", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> codiStatFina;
    @XmlElementRef(name = "CompCom", namespace = "http://schemas.datacontract.org/2004/07/Cfoab.Integracao.Negocio.TO", type = JAXBElement.class, required = false)
    protected JAXBElement<String> compCom;
    @XmlElementRef(name = "CompRes", namespace = "http://schemas.datacontract.org/2004/07/Cfoab.Integracao.Negocio.TO", type = JAXBElement.class, required = false)
    protected JAXBElement<String> compRes;
    @XmlElementRef(name = "DDDCelularRes", namespace = "http://schemas.datacontract.org/2004/07/Cfoab.Integracao.Negocio.TO", type = JAXBElement.class, required = false)
    protected JAXBElement<String> dddCelularRes;
    @XmlElementRef(name = "DataCola", namespace = "http://schemas.datacontract.org/2004/07/Cfoab.Integracao.Negocio.TO", type = JAXBElement.class, required = false)
    protected JAXBElement<XMLGregorianCalendar> dataCola;
    @XmlElementRef(name = "DataCpro", namespace = "http://schemas.datacontract.org/2004/07/Cfoab.Integracao.Negocio.TO", type = JAXBElement.class, required = false)
    protected JAXBElement<XMLGregorianCalendar> dataCpro;
    @XmlElementRef(name = "DataEmisRG", namespace = "http://schemas.datacontract.org/2004/07/Cfoab.Integracao.Negocio.TO", type = JAXBElement.class, required = false)
    protected JAXBElement<XMLGregorianCalendar> dataEmisRG;
    @XmlElementRef(name = "DataNasc", namespace = "http://schemas.datacontract.org/2004/07/Cfoab.Integracao.Negocio.TO", type = JAXBElement.class, required = false)
    protected JAXBElement<XMLGregorianCalendar> dataNasc;
    @XmlElementRef(name = "DataStatFina", namespace = "http://schemas.datacontract.org/2004/07/Cfoab.Integracao.Negocio.TO", type = JAXBElement.class, required = false)
    protected JAXBElement<XMLGregorianCalendar> dataStatFina;
    @XmlElementRef(name = "DataValidade", namespace = "http://schemas.datacontract.org/2004/07/Cfoab.Integracao.Negocio.TO", type = JAXBElement.class, required = false)
    protected JAXBElement<XMLGregorianCalendar> dataValidade;
    @XmlElementRef(name = "EmailCom", namespace = "http://schemas.datacontract.org/2004/07/Cfoab.Integracao.Negocio.TO", type = JAXBElement.class, required = false)
    protected JAXBElement<String> emailCom;
    @XmlElementRef(name = "EmailRes", namespace = "http://schemas.datacontract.org/2004/07/Cfoab.Integracao.Negocio.TO", type = JAXBElement.class, required = false)
    protected JAXBElement<String> emailRes;
    @XmlElementRef(name = "ExpeMilt", namespace = "http://schemas.datacontract.org/2004/07/Cfoab.Integracao.Negocio.TO", type = JAXBElement.class, required = false)
    protected JAXBElement<String> expeMilt;
    @XmlElementRef(name = "IdenEstdCivl", namespace = "http://schemas.datacontract.org/2004/07/Cfoab.Integracao.Negocio.TO", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> idenEstdCivl;
    @XmlElementRef(name = "IdenOgan", namespace = "http://schemas.datacontract.org/2004/07/Cfoab.Integracao.Negocio.TO", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> idenOgan;
    @XmlElementRef(name = "IdtFacu", namespace = "http://schemas.datacontract.org/2004/07/Cfoab.Integracao.Negocio.TO", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> idtFacu;
    @XmlElementRef(name = "IdtTipoDoad", namespace = "http://schemas.datacontract.org/2004/07/Cfoab.Integracao.Negocio.TO", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> idtTipoDoad;
    @XmlElementRef(name = "IdtTipoInscOab", namespace = "http://schemas.datacontract.org/2004/07/Cfoab.Integracao.Negocio.TO", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> idtTipoInscOab;
    @XmlElementRef(name = "Impedimentos", namespace = "http://schemas.datacontract.org/2004/07/Cfoab.Integracao.Negocio.TO", type = JAXBElement.class, required = false)
    protected JAXBElement<String> impedimentos;
    @XmlElementRef(name = "Insc", namespace = "http://schemas.datacontract.org/2004/07/Cfoab.Integracao.Negocio.TO", type = JAXBElement.class, required = false)
    protected JAXBElement<String> insc;
    @XmlElementRef(name = "LogrCom", namespace = "http://schemas.datacontract.org/2004/07/Cfoab.Integracao.Negocio.TO", type = JAXBElement.class, required = false)
    protected JAXBElement<String> logrCom;
    @XmlElementRef(name = "LogrRes", namespace = "http://schemas.datacontract.org/2004/07/Cfoab.Integracao.Negocio.TO", type = JAXBElement.class, required = false)
    protected JAXBElement<String> logrRes;
    @XmlElementRef(name = "Nacionalidade", namespace = "http://schemas.datacontract.org/2004/07/Cfoab.Integracao.Negocio.TO", type = JAXBElement.class, required = false)
    protected JAXBElement<String> nacionalidade;
    @XmlElementRef(name = "NomeAdvo", namespace = "http://schemas.datacontract.org/2004/07/Cfoab.Integracao.Negocio.TO", type = JAXBElement.class, required = false)
    protected JAXBElement<String> nomeAdvo;
    @XmlElementRef(name = "NomeMae2Advo", namespace = "http://schemas.datacontract.org/2004/07/Cfoab.Integracao.Negocio.TO", type = JAXBElement.class, required = false)
    protected JAXBElement<String> nomeMae2Advo;
    @XmlElementRef(name = "NomeMaeAdvo", namespace = "http://schemas.datacontract.org/2004/07/Cfoab.Integracao.Negocio.TO", type = JAXBElement.class, required = false)
    protected JAXBElement<String> nomeMaeAdvo;
    @XmlElementRef(name = "NomePai2Advo", namespace = "http://schemas.datacontract.org/2004/07/Cfoab.Integracao.Negocio.TO", type = JAXBElement.class, required = false)
    protected JAXBElement<String> nomePai2Advo;
    @XmlElementRef(name = "NomePaiAdvo", namespace = "http://schemas.datacontract.org/2004/07/Cfoab.Integracao.Negocio.TO", type = JAXBElement.class, required = false)
    protected JAXBElement<String> nomePaiAdvo;
    @XmlElementRef(name = "NomeProf", namespace = "http://schemas.datacontract.org/2004/07/Cfoab.Integracao.Negocio.TO", type = JAXBElement.class, required = false)
    protected JAXBElement<String> nomeProf;
    @XmlElementRef(name = "NomeSoci", namespace = "http://schemas.datacontract.org/2004/07/Cfoab.Integracao.Negocio.TO", type = JAXBElement.class, required = false)
    protected JAXBElement<String> nomeSoci;
    @XmlElementRef(name = "NumeroEnderecoRes", namespace = "http://schemas.datacontract.org/2004/07/Cfoab.Integracao.Negocio.TO", type = JAXBElement.class, required = false)
    protected JAXBElement<String> numeroEnderecoRes;
    @XmlElementRef(name = "NumrCepCom", namespace = "http://schemas.datacontract.org/2004/07/Cfoab.Integracao.Negocio.TO", type = JAXBElement.class, required = false)
    protected JAXBElement<String> numrCepCom;
    @XmlElementRef(name = "NumrCepRes", namespace = "http://schemas.datacontract.org/2004/07/Cfoab.Integracao.Negocio.TO", type = JAXBElement.class, required = false)
    protected JAXBElement<String> numrCepRes;
    @XmlElementRef(name = "NumrDDDCelCom", namespace = "http://schemas.datacontract.org/2004/07/Cfoab.Integracao.Negocio.TO", type = JAXBElement.class, required = false)
    protected JAXBElement<String> numrDDDCelCom;
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
    @XmlElementRef(name = "SecaoEleitoral", namespace = "http://schemas.datacontract.org/2004/07/Cfoab.Integracao.Negocio.TO", type = JAXBElement.class, required = false)
    protected JAXBElement<String> secaoEleitoral;
    @XmlElementRef(name = "Sexo", namespace = "http://schemas.datacontract.org/2004/07/Cfoab.Integracao.Negocio.TO", type = JAXBElement.class, required = false)
    protected JAXBElement<String> sexo;
    @XmlElementRef(name = "TitlElei", namespace = "http://schemas.datacontract.org/2004/07/Cfoab.Integracao.Negocio.TO", type = JAXBElement.class, required = false)
    protected JAXBElement<String> titlElei;
    @XmlElementRef(name = "Token", namespace = "http://schemas.datacontract.org/2004/07/Cfoab.Integracao.Negocio.TO", type = JAXBElement.class, required = false)
    protected JAXBElement<String> token;
    @XmlElementRef(name = "ViaCart", namespace = "http://schemas.datacontract.org/2004/07/Cfoab.Integracao.Negocio.TO", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> viaCart;
    @XmlElementRef(name = "ViaCrte", namespace = "http://schemas.datacontract.org/2004/07/Cfoab.Integracao.Negocio.TO", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> viaCrte;
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
     * Obtém o valor da propriedade codiCiddEleit.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getCodiCiddEleit() {
        return codiCiddEleit;
    }

    /**
     * Define o valor da propriedade codiCiddEleit.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setCodiCiddEleit(JAXBElement<Integer> value) {
        this.codiCiddEleit = value;
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
     * Obtém o valor da propriedade codiPaisConsEstr.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getCodiPaisConsEstr() {
        return codiPaisConsEstr;
    }

    /**
     * Define o valor da propriedade codiPaisConsEstr.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setCodiPaisConsEstr(JAXBElement<Integer> value) {
        this.codiPaisConsEstr = value;
    }

    /**
     * Obtém o valor da propriedade codiRacaCor.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public JAXBElement<Short> getCodiRacaCor() {
        return codiRacaCor;
    }

    /**
     * Define o valor da propriedade codiRacaCor.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public void setCodiRacaCor(JAXBElement<Short> value) {
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
     * Obtém o valor da propriedade codiStatFina.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getCodiStatFina() {
        return codiStatFina;
    }

    /**
     * Define o valor da propriedade codiStatFina.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setCodiStatFina(JAXBElement<Integer> value) {
        this.codiStatFina = value;
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
     * Obtém o valor da propriedade dddCelularRes.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getDDDCelularRes() {
        return dddCelularRes;
    }

    /**
     * Define o valor da propriedade dddCelularRes.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setDDDCelularRes(JAXBElement<String> value) {
        this.dddCelularRes = value;
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
     * Obtém o valor da propriedade dataStatFina.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public JAXBElement<XMLGregorianCalendar> getDataStatFina() {
        return dataStatFina;
    }

    /**
     * Define o valor da propriedade dataStatFina.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public void setDataStatFina(JAXBElement<XMLGregorianCalendar> value) {
        this.dataStatFina = value;
    }

    /**
     * Obtém o valor da propriedade dataValidade.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public JAXBElement<XMLGregorianCalendar> getDataValidade() {
        return dataValidade;
    }

    /**
     * Define o valor da propriedade dataValidade.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public void setDataValidade(JAXBElement<XMLGregorianCalendar> value) {
        this.dataValidade = value;
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
     * Obtém o valor da propriedade impedimentos.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getImpedimentos() {
        return impedimentos;
    }

    /**
     * Define o valor da propriedade impedimentos.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setImpedimentos(JAXBElement<String> value) {
        this.impedimentos = value;
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
     * Obtém o valor da propriedade nacionalidade.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getNacionalidade() {
        return nacionalidade;
    }

    /**
     * Define o valor da propriedade nacionalidade.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setNacionalidade(JAXBElement<String> value) {
        this.nacionalidade = value;
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
     * Obtém o valor da propriedade numeroEnderecoRes.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getNumeroEnderecoRes() {
        return numeroEnderecoRes;
    }

    /**
     * Define o valor da propriedade numeroEnderecoRes.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setNumeroEnderecoRes(JAXBElement<String> value) {
        this.numeroEnderecoRes = value;
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
     * Obtém o valor da propriedade secaoEleitoral.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getSecaoEleitoral() {
        return secaoEleitoral;
    }

    /**
     * Define o valor da propriedade secaoEleitoral.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setSecaoEleitoral(JAXBElement<String> value) {
        this.secaoEleitoral = value;
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

    /**
     * Obtém o valor da propriedade viaCart.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getViaCart() {
        return viaCart;
    }

    /**
     * Define o valor da propriedade viaCart.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setViaCart(JAXBElement<Integer> value) {
        this.viaCart = value;
    }

    /**
     * Obtém o valor da propriedade viaCrte.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getViaCrte() {
        return viaCrte;
    }

    /**
     * Define o valor da propriedade viaCrte.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setViaCrte(JAXBElement<Integer> value) {
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
