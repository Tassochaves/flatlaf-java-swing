
package com.dev.cna;

import java.math.BigDecimal;
import java.math.BigInteger;
import jakarta.xml.bind.JAXBElement;
import jakarta.xml.bind.annotation.XmlElementDecl;
import jakarta.xml.bind.annotation.XmlRegistry;
import javax.xml.datatype.Duration;
import javax.xml.datatype.XMLGregorianCalendar;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.dev.cna package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _ArrayOfTOConsultaAdvogadoResult_QNAME = new QName("http://schemas.datacontract.org/2004/07/Cfoab.Integracao.Negocio.TO", "ArrayOfTOConsultaAdvogadoResult");
    private final static QName _TOConsultaAdvogadoResult_QNAME = new QName("http://schemas.datacontract.org/2004/07/Cfoab.Integracao.Negocio.TO", "TOConsultaAdvogadoResult");
    private final static QName _ArrayOfTOConsultaAdvogadoImagemResult_QNAME = new QName("http://schemas.datacontract.org/2004/07/Cfoab.Integracao.Negocio.TO", "ArrayOfTOConsultaAdvogadoImagemResult");
    private final static QName _TOConsultaAdvogadoImagemResult_QNAME = new QName("http://schemas.datacontract.org/2004/07/Cfoab.Integracao.Negocio.TO", "TOConsultaAdvogadoImagemResult");
    private final static QName _TOBiometricoAdvogado_QNAME = new QName("http://schemas.datacontract.org/2004/07/Cfoab.Integracao.Negocio.TO", "TOBiometricoAdvogado");
    private final static QName _ArrayOfTOConsultaPedidoResult_QNAME = new QName("http://schemas.datacontract.org/2004/07/Cfoab.Integracao.Negocio.TO", "ArrayOfTOConsultaPedidoResult");
    private final static QName _TOConsultaPedidoResult_QNAME = new QName("http://schemas.datacontract.org/2004/07/Cfoab.Integracao.Negocio.TO", "TOConsultaPedidoResult");
    private final static QName _ArrayOfTOConsultaPedido_QNAME = new QName("http://schemas.datacontract.org/2004/07/Cfoab.Integracao.Negocio.TO", "ArrayOfTOConsultaPedido");
    private final static QName _TOConsultaPedido_QNAME = new QName("http://schemas.datacontract.org/2004/07/Cfoab.Integracao.Negocio.TO", "TOConsultaPedido");
    private final static QName _TOEnviaAdvogado_QNAME = new QName("http://schemas.datacontract.org/2004/07/Cfoab.Integracao.Negocio.TO", "TOEnviaAdvogado");
    private final static QName _TOEnviaPedido_QNAME = new QName("http://schemas.datacontract.org/2004/07/Cfoab.Integracao.Negocio.TO", "TOEnviaPedido");
    private final static QName _ArrayOfTOConsultaTransferenciaResult_QNAME = new QName("http://schemas.datacontract.org/2004/07/Cfoab.Integracao.Negocio.TO", "ArrayOfTOConsultaTransferenciaResult");
    private final static QName _TOConsultaTransferenciaResult_QNAME = new QName("http://schemas.datacontract.org/2004/07/Cfoab.Integracao.Negocio.TO", "TOConsultaTransferenciaResult");
    private final static QName _TOImpedimentoAdvogado_QNAME = new QName("http://schemas.datacontract.org/2004/07/Cfoab.Integracao.Negocio.TO", "TOImpedimentoAdvogado");
    private final static QName _ArrayOfTOImpedimento_QNAME = new QName("http://schemas.datacontract.org/2004/07/Cfoab.Integracao.Negocio.TO", "ArrayOfTOImpedimento");
    private final static QName _TOImpedimento_QNAME = new QName("http://schemas.datacontract.org/2004/07/Cfoab.Integracao.Negocio.TO", "TOImpedimento");
    private final static QName _AnyType_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "anyType");
    private final static QName _AnyURI_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "anyURI");
    private final static QName _Base64Binary_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "base64Binary");
    private final static QName _Boolean_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "boolean");
    private final static QName _Byte_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "byte");
    private final static QName _DateTime_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "dateTime");
    private final static QName _Decimal_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "decimal");
    private final static QName _Double_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "double");
    private final static QName _Float_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "float");
    private final static QName _Int_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "int");
    private final static QName _Long_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "long");
    private final static QName _QName_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "QName");
    private final static QName _Short_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "short");
    private final static QName _String_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "string");
    private final static QName _UnsignedByte_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "unsignedByte");
    private final static QName _UnsignedInt_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "unsignedInt");
    private final static QName _UnsignedLong_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "unsignedLong");
    private final static QName _UnsignedShort_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "unsignedShort");
    private final static QName _Char_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "char");
    private final static QName _Duration_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "duration");
    private final static QName _Guid_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "guid");
    private final static QName _ConsultaAdvogadoCpf_QNAME = new QName("https://www5.oab.org.br/integracao/", "cpf");
    private final static QName _ConsultaAdvogadoInscricao_QNAME = new QName("https://www5.oab.org.br/integracao/", "inscricao");
    private final static QName _ConsultaAdvogadoUf_QNAME = new QName("https://www5.oab.org.br/integracao/", "uf");
    private final static QName _ConsultaAdvogadoNomeAdvogado_QNAME = new QName("https://www5.oab.org.br/integracao/", "nomeAdvogado");
    private final static QName _ConsultaAdvogadoDataCompromisso_QNAME = new QName("https://www5.oab.org.br/integracao/", "dataCompromisso");
    private final static QName _ConsultaAdvogadoNumeroPagina_QNAME = new QName("https://www5.oab.org.br/integracao/", "numeroPagina");
    private final static QName _ConsultaAdvogadoResponseConsultaAdvogadoResult_QNAME = new QName("https://www5.oab.org.br/integracao/", "ConsultaAdvogadoResult");
    private final static QName _ConsultaAdvogadoImagemResponseConsultaAdvogadoImagemResult_QNAME = new QName("https://www5.oab.org.br/integracao/", "ConsultaAdvogadoImagemResult");
    private final static QName _ConsultaDadosBiometricoResponseConsultaDadosBiometricoResult_QNAME = new QName("https://www5.oab.org.br/integracao/", "ConsultaDadosBiometricoResult");
    private final static QName _ConsultaPedidoRequerimento_QNAME = new QName("https://www5.oab.org.br/integracao/", "requerimento");
    private final static QName _ConsultaPedidoResponseConsultaPedidoResult_QNAME = new QName("https://www5.oab.org.br/integracao/", "ConsultaPedidoResult");
    private final static QName _ConsultaPedidoCPFResponseConsultaPedidoCPFResult_QNAME = new QName("https://www5.oab.org.br/integracao/", "ConsultaPedidoCPFResult");
    private final static QName _EnviaAdvogadoDadosAdvogado_QNAME = new QName("https://www5.oab.org.br/integracao/", "dadosAdvogado");
    private final static QName _EnviaAdvogadoResponseEnviaAdvogadoResult_QNAME = new QName("https://www5.oab.org.br/integracao/", "EnviaAdvogadoResult");
    private final static QName _EnviaPedidoDadosPedido_QNAME = new QName("https://www5.oab.org.br/integracao/", "dadosPedido");
    private final static QName _EnviaPedidoResponseEnviaPedidoResult_QNAME = new QName("https://www5.oab.org.br/integracao/", "EnviaPedidoResult");
    private final static QName _EnviaTransferenciaOrganizacao_QNAME = new QName("https://www5.oab.org.br/integracao/", "organizacao");
    private final static QName _EnviaTransferenciaOrganizacaoTransferencia_QNAME = new QName("https://www5.oab.org.br/integracao/", "organizacaoTransferencia");
    private final static QName _EnviaTransferenciaResponseEnviaTransferenciaResult_QNAME = new QName("https://www5.oab.org.br/integracao/", "EnviaTransferenciaResult");
    private final static QName _ConsultaTransferenciaTipoTransferencia_QNAME = new QName("https://www5.oab.org.br/integracao/", "tipoTransferencia");
    private final static QName _ConsultaTransferenciaResponseConsultaTransferenciaResult_QNAME = new QName("https://www5.oab.org.br/integracao/", "ConsultaTransferenciaResult");
    private final static QName _ConsultaImpedimentosDoAdvogadoResponseConsultaImpedimentosDoAdvogadoResult_QNAME = new QName("https://www5.oab.org.br/integracao/", "ConsultaImpedimentosDoAdvogadoResult");
    private final static QName _GetIPResponseGetIPResult_QNAME = new QName("https://www5.oab.org.br/integracao/", "GetIPResult");
    private final static QName _TOImpedimentoAbreImpe_QNAME = new QName("http://schemas.datacontract.org/2004/07/Cfoab.Integracao.Negocio.TO", "AbreImpe");
    private final static QName _TOImpedimentoNome_QNAME = new QName("http://schemas.datacontract.org/2004/07/Cfoab.Integracao.Negocio.TO", "Nome");
    private final static QName _TOConsultaTransferenciaResultCpf_QNAME = new QName("http://schemas.datacontract.org/2004/07/Cfoab.Integracao.Negocio.TO", "Cpf");
    private final static QName _TOConsultaTransferenciaResultDataSolicitacao_QNAME = new QName("http://schemas.datacontract.org/2004/07/Cfoab.Integracao.Negocio.TO", "DataSolicitacao");
    private final static QName _TOConsultaTransferenciaResultNomeAdvo_QNAME = new QName("http://schemas.datacontract.org/2004/07/Cfoab.Integracao.Negocio.TO", "NomeAdvo");
    private final static QName _TOConsultaTransferenciaResultNumrSegu_QNAME = new QName("http://schemas.datacontract.org/2004/07/Cfoab.Integracao.Negocio.TO", "NumrSegu");
    private final static QName _TOConsultaTransferenciaResultSeccDestino_QNAME = new QName("http://schemas.datacontract.org/2004/07/Cfoab.Integracao.Negocio.TO", "SeccDestino");
    private final static QName _TOConsultaTransferenciaResultSeccOrigem_QNAME = new QName("http://schemas.datacontract.org/2004/07/Cfoab.Integracao.Negocio.TO", "SeccOrigem");
    private final static QName _TOConsultaPedidoBiometrico_QNAME = new QName("http://schemas.datacontract.org/2004/07/Cfoab.Integracao.Negocio.TO", "Biometrico");
    private final static QName _TOConsultaPedidoCodiStatPedi_QNAME = new QName("http://schemas.datacontract.org/2004/07/Cfoab.Integracao.Negocio.TO", "CodiStatPedi");
    private final static QName _TOConsultaPedidoDescPedi_QNAME = new QName("http://schemas.datacontract.org/2004/07/Cfoab.Integracao.Negocio.TO", "DescPedi");
    private final static QName _TOConsultaPedidoDescStatPedi_QNAME = new QName("http://schemas.datacontract.org/2004/07/Cfoab.Integracao.Negocio.TO", "DescStatPedi");
    private final static QName _TOConsultaPedidoNumrNotaFsca_QNAME = new QName("http://schemas.datacontract.org/2004/07/Cfoab.Integracao.Negocio.TO", "NumrNotaFsca");
    private final static QName _TOConsultaPedidoNumrPedi_QNAME = new QName("http://schemas.datacontract.org/2004/07/Cfoab.Integracao.Negocio.TO", "NumrPedi");
    private final static QName _TOConsultaPedidoOS_QNAME = new QName("http://schemas.datacontract.org/2004/07/Cfoab.Integracao.Negocio.TO", "OS");
    private final static QName _TOConsultaPedidoUf_QNAME = new QName("http://schemas.datacontract.org/2004/07/Cfoab.Integracao.Negocio.TO", "Uf");
    private final static QName _TOConsultaAdvogadoImagemResultAssi_QNAME = new QName("http://schemas.datacontract.org/2004/07/Cfoab.Integracao.Negocio.TO", "Assi");
    private final static QName _TOConsultaAdvogadoImagemResultBitImpAssi_QNAME = new QName("http://schemas.datacontract.org/2004/07/Cfoab.Integracao.Negocio.TO", "BitImpAssi");
    private final static QName _TOConsultaAdvogadoImagemResultBitImpDigi_QNAME = new QName("http://schemas.datacontract.org/2004/07/Cfoab.Integracao.Negocio.TO", "BitImpDigi");
    private final static QName _TOConsultaAdvogadoImagemResultBitImpFoto_QNAME = new QName("http://schemas.datacontract.org/2004/07/Cfoab.Integracao.Negocio.TO", "BitImpFoto");
    private final static QName _TOConsultaAdvogadoImagemResultDataAtuaAssi_QNAME = new QName("http://schemas.datacontract.org/2004/07/Cfoab.Integracao.Negocio.TO", "DataAtuaAssi");
    private final static QName _TOConsultaAdvogadoImagemResultDataAtuaDigi_QNAME = new QName("http://schemas.datacontract.org/2004/07/Cfoab.Integracao.Negocio.TO", "DataAtuaDigi");
    private final static QName _TOConsultaAdvogadoImagemResultDataAtuaFoto_QNAME = new QName("http://schemas.datacontract.org/2004/07/Cfoab.Integracao.Negocio.TO", "DataAtuaFoto");
    private final static QName _TOConsultaAdvogadoImagemResultDigi_QNAME = new QName("http://schemas.datacontract.org/2004/07/Cfoab.Integracao.Negocio.TO", "Digi");
    private final static QName _TOConsultaAdvogadoImagemResultFoto_QNAME = new QName("http://schemas.datacontract.org/2004/07/Cfoab.Integracao.Negocio.TO", "Foto");
    private final static QName _TOConsultaAdvogadoResultBairCom_QNAME = new QName("http://schemas.datacontract.org/2004/07/Cfoab.Integracao.Negocio.TO", "BairCom");
    private final static QName _TOConsultaAdvogadoResultBairRes_QNAME = new QName("http://schemas.datacontract.org/2004/07/Cfoab.Integracao.Negocio.TO", "BairRes");
    private final static QName _TOConsultaAdvogadoResultBitDivuEndeCom_QNAME = new QName("http://schemas.datacontract.org/2004/07/Cfoab.Integracao.Negocio.TO", "BitDivuEndeCom");
    private final static QName _TOConsultaAdvogadoResultBitDivuEndeRes_QNAME = new QName("http://schemas.datacontract.org/2004/07/Cfoab.Integracao.Negocio.TO", "BitDivuEndeRes");
    private final static QName _TOConsultaAdvogadoResultBitDivuTelfCom_QNAME = new QName("http://schemas.datacontract.org/2004/07/Cfoab.Integracao.Negocio.TO", "BitDivuTelfCom");
    private final static QName _TOConsultaAdvogadoResultBitDivuTelfRes_QNAME = new QName("http://schemas.datacontract.org/2004/07/Cfoab.Integracao.Negocio.TO", "BitDivuTelfRes");
    private final static QName _TOConsultaAdvogadoResultBitEnviEmalCom_QNAME = new QName("http://schemas.datacontract.org/2004/07/Cfoab.Integracao.Negocio.TO", "BitEnviEmalCom");
    private final static QName _TOConsultaAdvogadoResultBitEnviEmalRes_QNAME = new QName("http://schemas.datacontract.org/2004/07/Cfoab.Integracao.Negocio.TO", "BitEnviEmalRes");
    private final static QName _TOConsultaAdvogadoResultBitPublCada_QNAME = new QName("http://schemas.datacontract.org/2004/07/Cfoab.Integracao.Negocio.TO", "BitPublCada");
    private final static QName _TOConsultaAdvogadoResultBitPublFoto_QNAME = new QName("http://schemas.datacontract.org/2004/07/Cfoab.Integracao.Negocio.TO", "BitPublFoto");
    private final static QName _TOConsultaAdvogadoResultCertMilt_QNAME = new QName("http://schemas.datacontract.org/2004/07/Cfoab.Integracao.Negocio.TO", "CertMilt");
    private final static QName _TOConsultaAdvogadoResultCodiCiddCom_QNAME = new QName("http://schemas.datacontract.org/2004/07/Cfoab.Integracao.Negocio.TO", "CodiCiddCom");
    private final static QName _TOConsultaAdvogadoResultCodiCiddElei_QNAME = new QName("http://schemas.datacontract.org/2004/07/Cfoab.Integracao.Negocio.TO", "CodiCiddElei");
    private final static QName _TOConsultaAdvogadoResultCodiCiddNasc_QNAME = new QName("http://schemas.datacontract.org/2004/07/Cfoab.Integracao.Negocio.TO", "CodiCiddNasc");
    private final static QName _TOConsultaAdvogadoResultCodiCiddRes_QNAME = new QName("http://schemas.datacontract.org/2004/07/Cfoab.Integracao.Negocio.TO", "CodiCiddRes");
    private final static QName _TOConsultaAdvogadoResultCodiDefc_QNAME = new QName("http://schemas.datacontract.org/2004/07/Cfoab.Integracao.Negocio.TO", "CodiDefc");
    private final static QName _TOConsultaAdvogadoResultCodiRacaCor_QNAME = new QName("http://schemas.datacontract.org/2004/07/Cfoab.Integracao.Negocio.TO", "CodiRacaCor");
    private final static QName _TOConsultaAdvogadoResultCodiStatAdvo_QNAME = new QName("http://schemas.datacontract.org/2004/07/Cfoab.Integracao.Negocio.TO", "CodiStatAdvo");
    private final static QName _TOConsultaAdvogadoResultCompCom_QNAME = new QName("http://schemas.datacontract.org/2004/07/Cfoab.Integracao.Negocio.TO", "CompCom");
    private final static QName _TOConsultaAdvogadoResultCompRes_QNAME = new QName("http://schemas.datacontract.org/2004/07/Cfoab.Integracao.Negocio.TO", "CompRes");
    private final static QName _TOConsultaAdvogadoResultDatAtualizacao_QNAME = new QName("http://schemas.datacontract.org/2004/07/Cfoab.Integracao.Negocio.TO", "DatAtualizacao");
    private final static QName _TOConsultaAdvogadoResultDataCola_QNAME = new QName("http://schemas.datacontract.org/2004/07/Cfoab.Integracao.Negocio.TO", "DataCola");
    private final static QName _TOConsultaAdvogadoResultDataCpro_QNAME = new QName("http://schemas.datacontract.org/2004/07/Cfoab.Integracao.Negocio.TO", "DataCpro");
    private final static QName _TOConsultaAdvogadoResultDataEmis_QNAME = new QName("http://schemas.datacontract.org/2004/07/Cfoab.Integracao.Negocio.TO", "DataEmis");
    private final static QName _TOConsultaAdvogadoResultDataEmisRG_QNAME = new QName("http://schemas.datacontract.org/2004/07/Cfoab.Integracao.Negocio.TO", "DataEmisRG");
    private final static QName _TOConsultaAdvogadoResultDataNasc_QNAME = new QName("http://schemas.datacontract.org/2004/07/Cfoab.Integracao.Negocio.TO", "DataNasc");
    private final static QName _TOConsultaAdvogadoResultDataStat_QNAME = new QName("http://schemas.datacontract.org/2004/07/Cfoab.Integracao.Negocio.TO", "DataStat");
    private final static QName _TOConsultaAdvogadoResultDataTransf_QNAME = new QName("http://schemas.datacontract.org/2004/07/Cfoab.Integracao.Negocio.TO", "DataTransf");
    private final static QName _TOConsultaAdvogadoResultDescRacaCor_QNAME = new QName("http://schemas.datacontract.org/2004/07/Cfoab.Integracao.Negocio.TO", "DescRacaCor");
    private final static QName _TOConsultaAdvogadoResultDescdefi_QNAME = new QName("http://schemas.datacontract.org/2004/07/Cfoab.Integracao.Negocio.TO", "Descdefi");
    private final static QName _TOConsultaAdvogadoResultEmailCom_QNAME = new QName("http://schemas.datacontract.org/2004/07/Cfoab.Integracao.Negocio.TO", "EmailCom");
    private final static QName _TOConsultaAdvogadoResultEmailRes_QNAME = new QName("http://schemas.datacontract.org/2004/07/Cfoab.Integracao.Negocio.TO", "EmailRes");
    private final static QName _TOConsultaAdvogadoResultEstdCivl_QNAME = new QName("http://schemas.datacontract.org/2004/07/Cfoab.Integracao.Negocio.TO", "EstdCivl");
    private final static QName _TOConsultaAdvogadoResultExpeMilt_QNAME = new QName("http://schemas.datacontract.org/2004/07/Cfoab.Integracao.Negocio.TO", "ExpeMilt");
    private final static QName _TOConsultaAdvogadoResultIdenEstdCivl_QNAME = new QName("http://schemas.datacontract.org/2004/07/Cfoab.Integracao.Negocio.TO", "IdenEstdCivl");
    private final static QName _TOConsultaAdvogadoResultIdenOgan_QNAME = new QName("http://schemas.datacontract.org/2004/07/Cfoab.Integracao.Negocio.TO", "IdenOgan");
    private final static QName _TOConsultaAdvogadoResultIdenOganTransf_QNAME = new QName("http://schemas.datacontract.org/2004/07/Cfoab.Integracao.Negocio.TO", "IdenOganTransf");
    private final static QName _TOConsultaAdvogadoResultIdtAdvo_QNAME = new QName("http://schemas.datacontract.org/2004/07/Cfoab.Integracao.Negocio.TO", "IdtAdvo");
    private final static QName _TOConsultaAdvogadoResultIdtFacu_QNAME = new QName("http://schemas.datacontract.org/2004/07/Cfoab.Integracao.Negocio.TO", "IdtFacu");
    private final static QName _TOConsultaAdvogadoResultIdtTipoDoad_QNAME = new QName("http://schemas.datacontract.org/2004/07/Cfoab.Integracao.Negocio.TO", "IdtTipoDoad");
    private final static QName _TOConsultaAdvogadoResultIdtTipoInscOab_QNAME = new QName("http://schemas.datacontract.org/2004/07/Cfoab.Integracao.Negocio.TO", "IdtTipoInscOab");
    private final static QName _TOConsultaAdvogadoResultInsc_QNAME = new QName("http://schemas.datacontract.org/2004/07/Cfoab.Integracao.Negocio.TO", "Insc");
    private final static QName _TOConsultaAdvogadoResultInscOab_QNAME = new QName("http://schemas.datacontract.org/2004/07/Cfoab.Integracao.Negocio.TO", "InscOab");
    private final static QName _TOConsultaAdvogadoResultLogrCom_QNAME = new QName("http://schemas.datacontract.org/2004/07/Cfoab.Integracao.Negocio.TO", "LogrCom");
    private final static QName _TOConsultaAdvogadoResultLogrRes_QNAME = new QName("http://schemas.datacontract.org/2004/07/Cfoab.Integracao.Negocio.TO", "LogrRes");
    private final static QName _TOConsultaAdvogadoResultNacn_QNAME = new QName("http://schemas.datacontract.org/2004/07/Cfoab.Integracao.Negocio.TO", "Nacn");
    private final static QName _TOConsultaAdvogadoResultNomeCiddCom_QNAME = new QName("http://schemas.datacontract.org/2004/07/Cfoab.Integracao.Negocio.TO", "NomeCiddCom");
    private final static QName _TOConsultaAdvogadoResultNomeCiddElei_QNAME = new QName("http://schemas.datacontract.org/2004/07/Cfoab.Integracao.Negocio.TO", "NomeCiddElei");
    private final static QName _TOConsultaAdvogadoResultNomeCiddNasc_QNAME = new QName("http://schemas.datacontract.org/2004/07/Cfoab.Integracao.Negocio.TO", "NomeCiddNasc");
    private final static QName _TOConsultaAdvogadoResultNomeCiddRes_QNAME = new QName("http://schemas.datacontract.org/2004/07/Cfoab.Integracao.Negocio.TO", "NomeCiddRes");
    private final static QName _TOConsultaAdvogadoResultNomeInst_QNAME = new QName("http://schemas.datacontract.org/2004/07/Cfoab.Integracao.Negocio.TO", "NomeInst");
    private final static QName _TOConsultaAdvogadoResultNomeMae2Advo_QNAME = new QName("http://schemas.datacontract.org/2004/07/Cfoab.Integracao.Negocio.TO", "NomeMae2Advo");
    private final static QName _TOConsultaAdvogadoResultNomeMaeAdvo_QNAME = new QName("http://schemas.datacontract.org/2004/07/Cfoab.Integracao.Negocio.TO", "NomeMaeAdvo");
    private final static QName _TOConsultaAdvogadoResultNomeOgan_QNAME = new QName("http://schemas.datacontract.org/2004/07/Cfoab.Integracao.Negocio.TO", "NomeOgan");
    private final static QName _TOConsultaAdvogadoResultNomePai2Advo_QNAME = new QName("http://schemas.datacontract.org/2004/07/Cfoab.Integracao.Negocio.TO", "NomePai2Advo");
    private final static QName _TOConsultaAdvogadoResultNomePaiAdvo_QNAME = new QName("http://schemas.datacontract.org/2004/07/Cfoab.Integracao.Negocio.TO", "NomePaiAdvo");
    private final static QName _TOConsultaAdvogadoResultNomeProf_QNAME = new QName("http://schemas.datacontract.org/2004/07/Cfoab.Integracao.Negocio.TO", "NomeProf");
    private final static QName _TOConsultaAdvogadoResultNomeSoci_QNAME = new QName("http://schemas.datacontract.org/2004/07/Cfoab.Integracao.Negocio.TO", "NomeSoci");
    private final static QName _TOConsultaAdvogadoResultNumrCepCom_QNAME = new QName("http://schemas.datacontract.org/2004/07/Cfoab.Integracao.Negocio.TO", "NumrCepCom");
    private final static QName _TOConsultaAdvogadoResultNumrCepRes_QNAME = new QName("http://schemas.datacontract.org/2004/07/Cfoab.Integracao.Negocio.TO", "NumrCepRes");
    private final static QName _TOConsultaAdvogadoResultNumrDDDCelCom_QNAME = new QName("http://schemas.datacontract.org/2004/07/Cfoab.Integracao.Negocio.TO", "NumrDDDCelCom");
    private final static QName _TOConsultaAdvogadoResultNumrDDDCelRes_QNAME = new QName("http://schemas.datacontract.org/2004/07/Cfoab.Integracao.Negocio.TO", "NumrDDDCelRes");
    private final static QName _TOConsultaAdvogadoResultNumrDDDCom_QNAME = new QName("http://schemas.datacontract.org/2004/07/Cfoab.Integracao.Negocio.TO", "NumrDDDCom");
    private final static QName _TOConsultaAdvogadoResultNumrDDDFaxCom_QNAME = new QName("http://schemas.datacontract.org/2004/07/Cfoab.Integracao.Negocio.TO", "NumrDDDFaxCom");
    private final static QName _TOConsultaAdvogadoResultNumrDDDFaxRes_QNAME = new QName("http://schemas.datacontract.org/2004/07/Cfoab.Integracao.Negocio.TO", "NumrDDDFaxRes");
    private final static QName _TOConsultaAdvogadoResultNumrDDDRes_QNAME = new QName("http://schemas.datacontract.org/2004/07/Cfoab.Integracao.Negocio.TO", "NumrDDDRes");
    private final static QName _TOConsultaAdvogadoResultNumrEndeCom_QNAME = new QName("http://schemas.datacontract.org/2004/07/Cfoab.Integracao.Negocio.TO", "NumrEndeCom");
    private final static QName _TOConsultaAdvogadoResultNumrEndeRes_QNAME = new QName("http://schemas.datacontract.org/2004/07/Cfoab.Integracao.Negocio.TO", "NumrEndeRes");
    private final static QName _TOConsultaAdvogadoResultNumrTelfCelCom_QNAME = new QName("http://schemas.datacontract.org/2004/07/Cfoab.Integracao.Negocio.TO", "NumrTelfCelCom");
    private final static QName _TOConsultaAdvogadoResultNumrTelfCelRes_QNAME = new QName("http://schemas.datacontract.org/2004/07/Cfoab.Integracao.Negocio.TO", "NumrTelfCelRes");
    private final static QName _TOConsultaAdvogadoResultNumrTelfCom_QNAME = new QName("http://schemas.datacontract.org/2004/07/Cfoab.Integracao.Negocio.TO", "NumrTelfCom");
    private final static QName _TOConsultaAdvogadoResultNumrTelfFaxCom_QNAME = new QName("http://schemas.datacontract.org/2004/07/Cfoab.Integracao.Negocio.TO", "NumrTelfFaxCom");
    private final static QName _TOConsultaAdvogadoResultNumrTelfFaxRes_QNAME = new QName("http://schemas.datacontract.org/2004/07/Cfoab.Integracao.Negocio.TO", "NumrTelfFaxRes");
    private final static QName _TOConsultaAdvogadoResultNumrTelfRes_QNAME = new QName("http://schemas.datacontract.org/2004/07/Cfoab.Integracao.Negocio.TO", "NumrTelfRes");
    private final static QName _TOConsultaAdvogadoResultOrgaEmisRG_QNAME = new QName("http://schemas.datacontract.org/2004/07/Cfoab.Integracao.Negocio.TO", "OrgaEmisRG");
    private final static QName _TOConsultaAdvogadoResultPass_QNAME = new QName("http://schemas.datacontract.org/2004/07/Cfoab.Integracao.Negocio.TO", "Pass");
    private final static QName _TOConsultaAdvogadoResultRG_QNAME = new QName("http://schemas.datacontract.org/2004/07/Cfoab.Integracao.Negocio.TO", "RG");
    private final static QName _TOConsultaAdvogadoResultSecaElei_QNAME = new QName("http://schemas.datacontract.org/2004/07/Cfoab.Integracao.Negocio.TO", "SecaElei");
    private final static QName _TOConsultaAdvogadoResultSexo_QNAME = new QName("http://schemas.datacontract.org/2004/07/Cfoab.Integracao.Negocio.TO", "Sexo");
    private final static QName _TOConsultaAdvogadoResultSiglUFCom_QNAME = new QName("http://schemas.datacontract.org/2004/07/Cfoab.Integracao.Negocio.TO", "SiglUFCom");
    private final static QName _TOConsultaAdvogadoResultSiglUFElei_QNAME = new QName("http://schemas.datacontract.org/2004/07/Cfoab.Integracao.Negocio.TO", "SiglUFElei");
    private final static QName _TOConsultaAdvogadoResultSiglUFNasc_QNAME = new QName("http://schemas.datacontract.org/2004/07/Cfoab.Integracao.Negocio.TO", "SiglUFNasc");
    private final static QName _TOConsultaAdvogadoResultSiglUFRes_QNAME = new QName("http://schemas.datacontract.org/2004/07/Cfoab.Integracao.Negocio.TO", "SiglUFRes");
    private final static QName _TOConsultaAdvogadoResultTipoDoad_QNAME = new QName("http://schemas.datacontract.org/2004/07/Cfoab.Integracao.Negocio.TO", "TipoDoad");
    private final static QName _TOConsultaAdvogadoResultTitlElei_QNAME = new QName("http://schemas.datacontract.org/2004/07/Cfoab.Integracao.Negocio.TO", "TitlElei");
    private final static QName _TOConsultaAdvogadoResultViaCart_QNAME = new QName("http://schemas.datacontract.org/2004/07/Cfoab.Integracao.Negocio.TO", "ViaCart");
    private final static QName _TOConsultaAdvogadoResultViaCrte_QNAME = new QName("http://schemas.datacontract.org/2004/07/Cfoab.Integracao.Negocio.TO", "ViaCrte");
    private final static QName _TOConsultaAdvogadoResultZonaElei_QNAME = new QName("http://schemas.datacontract.org/2004/07/Cfoab.Integracao.Negocio.TO", "ZonaElei");
    private final static QName _TOImpedimentoAdvogadoCPF_QNAME = new QName("http://schemas.datacontract.org/2004/07/Cfoab.Integracao.Negocio.TO", "CPF");
    private final static QName _TOImpedimentoAdvogadoImpedimentos_QNAME = new QName("http://schemas.datacontract.org/2004/07/Cfoab.Integracao.Negocio.TO", "Impedimentos");
    private final static QName _TOEnviaPedidoBitTrocaBiometrico_QNAME = new QName("http://schemas.datacontract.org/2004/07/Cfoab.Integracao.Negocio.TO", "BitTrocaBiometrico");
    private final static QName _TOEnviaPedidoCodigoPedido_QNAME = new QName("http://schemas.datacontract.org/2004/07/Cfoab.Integracao.Negocio.TO", "CodigoPedido");
    private final static QName _TOEnviaPedidoCodigoTipoDocumento_QNAME = new QName("http://schemas.datacontract.org/2004/07/Cfoab.Integracao.Negocio.TO", "CodigoTipoDocumento");
    private final static QName _TOEnviaPedidoNumeroPedido_QNAME = new QName("http://schemas.datacontract.org/2004/07/Cfoab.Integracao.Negocio.TO", "NumeroPedido");
    private final static QName _TOEnviaPedidoNumeroPedidoPai_QNAME = new QName("http://schemas.datacontract.org/2004/07/Cfoab.Integracao.Negocio.TO", "NumeroPedidoPai");
    private final static QName _TOEnviaPedidoOrganizacao_QNAME = new QName("http://schemas.datacontract.org/2004/07/Cfoab.Integracao.Negocio.TO", "Organizacao");
    private final static QName _TOEnviaPedidoTextBrai1_QNAME = new QName("http://schemas.datacontract.org/2004/07/Cfoab.Integracao.Negocio.TO", "TextBrai1");
    private final static QName _TOEnviaPedidoTextBrai2_QNAME = new QName("http://schemas.datacontract.org/2004/07/Cfoab.Integracao.Negocio.TO", "TextBrai2");
    private final static QName _TOEnviaPedidoTextBrai3_QNAME = new QName("http://schemas.datacontract.org/2004/07/Cfoab.Integracao.Negocio.TO", "TextBrai3");
    private final static QName _TOEnviaPedidoTextBrai4_QNAME = new QName("http://schemas.datacontract.org/2004/07/Cfoab.Integracao.Negocio.TO", "TextBrai4");
    private final static QName _TOEnviaPedidoToken_QNAME = new QName("http://schemas.datacontract.org/2004/07/Cfoab.Integracao.Negocio.TO", "Token");
    private final static QName _TOEnviaAdvogadoCodiCiddEleit_QNAME = new QName("http://schemas.datacontract.org/2004/07/Cfoab.Integracao.Negocio.TO", "CodiCiddEleit");
    private final static QName _TOEnviaAdvogadoCodiPaisConsEstr_QNAME = new QName("http://schemas.datacontract.org/2004/07/Cfoab.Integracao.Negocio.TO", "CodiPaisConsEstr");
    private final static QName _TOEnviaAdvogadoCodiStatFina_QNAME = new QName("http://schemas.datacontract.org/2004/07/Cfoab.Integracao.Negocio.TO", "CodiStatFina");
    private final static QName _TOEnviaAdvogadoDDDCelularRes_QNAME = new QName("http://schemas.datacontract.org/2004/07/Cfoab.Integracao.Negocio.TO", "DDDCelularRes");
    private final static QName _TOEnviaAdvogadoDataStatFina_QNAME = new QName("http://schemas.datacontract.org/2004/07/Cfoab.Integracao.Negocio.TO", "DataStatFina");
    private final static QName _TOEnviaAdvogadoDataValidade_QNAME = new QName("http://schemas.datacontract.org/2004/07/Cfoab.Integracao.Negocio.TO", "DataValidade");
    private final static QName _TOEnviaAdvogadoNacionalidade_QNAME = new QName("http://schemas.datacontract.org/2004/07/Cfoab.Integracao.Negocio.TO", "Nacionalidade");
    private final static QName _TOEnviaAdvogadoNumeroEnderecoRes_QNAME = new QName("http://schemas.datacontract.org/2004/07/Cfoab.Integracao.Negocio.TO", "NumeroEnderecoRes");
    private final static QName _TOEnviaAdvogadoSecaoEleitoral_QNAME = new QName("http://schemas.datacontract.org/2004/07/Cfoab.Integracao.Negocio.TO", "SecaoEleitoral");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.dev.cna
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link ConsultaAdvogado }
     * 
     */
    public ConsultaAdvogado createConsultaAdvogado() {
        return new ConsultaAdvogado();
    }

    /**
     * Create an instance of {@link ConsultaAdvogadoResponse }
     * 
     */
    public ConsultaAdvogadoResponse createConsultaAdvogadoResponse() {
        return new ConsultaAdvogadoResponse();
    }

    /**
     * Create an instance of {@link ArrayOfTOConsultaAdvogadoResult }
     * 
     */
    public ArrayOfTOConsultaAdvogadoResult createArrayOfTOConsultaAdvogadoResult() {
        return new ArrayOfTOConsultaAdvogadoResult();
    }

    /**
     * Create an instance of {@link ConsultaAdvogadoImagem }
     * 
     */
    public ConsultaAdvogadoImagem createConsultaAdvogadoImagem() {
        return new ConsultaAdvogadoImagem();
    }

    /**
     * Create an instance of {@link ConsultaAdvogadoImagemResponse }
     * 
     */
    public ConsultaAdvogadoImagemResponse createConsultaAdvogadoImagemResponse() {
        return new ConsultaAdvogadoImagemResponse();
    }

    /**
     * Create an instance of {@link ArrayOfTOConsultaAdvogadoImagemResult }
     * 
     */
    public ArrayOfTOConsultaAdvogadoImagemResult createArrayOfTOConsultaAdvogadoImagemResult() {
        return new ArrayOfTOConsultaAdvogadoImagemResult();
    }

    /**
     * Create an instance of {@link ConsultaDadosBiometrico }
     * 
     */
    public ConsultaDadosBiometrico createConsultaDadosBiometrico() {
        return new ConsultaDadosBiometrico();
    }

    /**
     * Create an instance of {@link ConsultaDadosBiometricoResponse }
     * 
     */
    public ConsultaDadosBiometricoResponse createConsultaDadosBiometricoResponse() {
        return new ConsultaDadosBiometricoResponse();
    }

    /**
     * Create an instance of {@link TOBiometricoAdvogado }
     * 
     */
    public TOBiometricoAdvogado createTOBiometricoAdvogado() {
        return new TOBiometricoAdvogado();
    }

    /**
     * Create an instance of {@link ConsultaPedido }
     * 
     */
    public ConsultaPedido createConsultaPedido() {
        return new ConsultaPedido();
    }

    /**
     * Create an instance of {@link ConsultaPedidoResponse }
     * 
     */
    public ConsultaPedidoResponse createConsultaPedidoResponse() {
        return new ConsultaPedidoResponse();
    }

    /**
     * Create an instance of {@link ArrayOfTOConsultaPedidoResult }
     * 
     */
    public ArrayOfTOConsultaPedidoResult createArrayOfTOConsultaPedidoResult() {
        return new ArrayOfTOConsultaPedidoResult();
    }

    /**
     * Create an instance of {@link ConsultaPedidoCPF }
     * 
     */
    public ConsultaPedidoCPF createConsultaPedidoCPF() {
        return new ConsultaPedidoCPF();
    }

    /**
     * Create an instance of {@link ConsultaPedidoCPFResponse }
     * 
     */
    public ConsultaPedidoCPFResponse createConsultaPedidoCPFResponse() {
        return new ConsultaPedidoCPFResponse();
    }

    /**
     * Create an instance of {@link ArrayOfTOConsultaPedido }
     * 
     */
    public ArrayOfTOConsultaPedido createArrayOfTOConsultaPedido() {
        return new ArrayOfTOConsultaPedido();
    }

    /**
     * Create an instance of {@link EnviaAdvogado }
     * 
     */
    public EnviaAdvogado createEnviaAdvogado() {
        return new EnviaAdvogado();
    }

    /**
     * Create an instance of {@link TOEnviaAdvogado }
     * 
     */
    public TOEnviaAdvogado createTOEnviaAdvogado() {
        return new TOEnviaAdvogado();
    }

    /**
     * Create an instance of {@link EnviaAdvogadoResponse }
     * 
     */
    public EnviaAdvogadoResponse createEnviaAdvogadoResponse() {
        return new EnviaAdvogadoResponse();
    }

    /**
     * Create an instance of {@link EnviaPedido }
     * 
     */
    public EnviaPedido createEnviaPedido() {
        return new EnviaPedido();
    }

    /**
     * Create an instance of {@link TOEnviaPedido }
     * 
     */
    public TOEnviaPedido createTOEnviaPedido() {
        return new TOEnviaPedido();
    }

    /**
     * Create an instance of {@link EnviaPedidoResponse }
     * 
     */
    public EnviaPedidoResponse createEnviaPedidoResponse() {
        return new EnviaPedidoResponse();
    }

    /**
     * Create an instance of {@link EnviaTransferencia }
     * 
     */
    public EnviaTransferencia createEnviaTransferencia() {
        return new EnviaTransferencia();
    }

    /**
     * Create an instance of {@link EnviaTransferenciaResponse }
     * 
     */
    public EnviaTransferenciaResponse createEnviaTransferenciaResponse() {
        return new EnviaTransferenciaResponse();
    }

    /**
     * Create an instance of {@link ConsultaTransferencia }
     * 
     */
    public ConsultaTransferencia createConsultaTransferencia() {
        return new ConsultaTransferencia();
    }

    /**
     * Create an instance of {@link ConsultaTransferenciaResponse }
     * 
     */
    public ConsultaTransferenciaResponse createConsultaTransferenciaResponse() {
        return new ConsultaTransferenciaResponse();
    }

    /**
     * Create an instance of {@link ArrayOfTOConsultaTransferenciaResult }
     * 
     */
    public ArrayOfTOConsultaTransferenciaResult createArrayOfTOConsultaTransferenciaResult() {
        return new ArrayOfTOConsultaTransferenciaResult();
    }

    /**
     * Create an instance of {@link ConsultaImpedimentosDoAdvogado }
     * 
     */
    public ConsultaImpedimentosDoAdvogado createConsultaImpedimentosDoAdvogado() {
        return new ConsultaImpedimentosDoAdvogado();
    }

    /**
     * Create an instance of {@link ConsultaImpedimentosDoAdvogadoResponse }
     * 
     */
    public ConsultaImpedimentosDoAdvogadoResponse createConsultaImpedimentosDoAdvogadoResponse() {
        return new ConsultaImpedimentosDoAdvogadoResponse();
    }

    /**
     * Create an instance of {@link TOImpedimentoAdvogado }
     * 
     */
    public TOImpedimentoAdvogado createTOImpedimentoAdvogado() {
        return new TOImpedimentoAdvogado();
    }

    /**
     * Create an instance of {@link GetIP }
     * 
     */
    public GetIP createGetIP() {
        return new GetIP();
    }

    /**
     * Create an instance of {@link GetIPResponse }
     * 
     */
    public GetIPResponse createGetIPResponse() {
        return new GetIPResponse();
    }

    /**
     * Create an instance of {@link TOConsultaAdvogadoResult }
     * 
     */
    public TOConsultaAdvogadoResult createTOConsultaAdvogadoResult() {
        return new TOConsultaAdvogadoResult();
    }

    /**
     * Create an instance of {@link TOConsultaAdvogadoImagemResult }
     * 
     */
    public TOConsultaAdvogadoImagemResult createTOConsultaAdvogadoImagemResult() {
        return new TOConsultaAdvogadoImagemResult();
    }

    /**
     * Create an instance of {@link TOConsultaPedidoResult }
     * 
     */
    public TOConsultaPedidoResult createTOConsultaPedidoResult() {
        return new TOConsultaPedidoResult();
    }

    /**
     * Create an instance of {@link TOConsultaPedido }
     * 
     */
    public TOConsultaPedido createTOConsultaPedido() {
        return new TOConsultaPedido();
    }

    /**
     * Create an instance of {@link TOConsultaTransferenciaResult }
     * 
     */
    public TOConsultaTransferenciaResult createTOConsultaTransferenciaResult() {
        return new TOConsultaTransferenciaResult();
    }

    /**
     * Create an instance of {@link ArrayOfTOImpedimento }
     * 
     */
    public ArrayOfTOImpedimento createArrayOfTOImpedimento() {
        return new ArrayOfTOImpedimento();
    }

    /**
     * Create an instance of {@link TOImpedimento }
     * 
     */
    public TOImpedimento createTOImpedimento() {
        return new TOImpedimento();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfTOConsultaAdvogadoResult }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ArrayOfTOConsultaAdvogadoResult }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Cfoab.Integracao.Negocio.TO", name = "ArrayOfTOConsultaAdvogadoResult")
    public JAXBElement<ArrayOfTOConsultaAdvogadoResult> createArrayOfTOConsultaAdvogadoResult(ArrayOfTOConsultaAdvogadoResult value) {
        return new JAXBElement<ArrayOfTOConsultaAdvogadoResult>(_ArrayOfTOConsultaAdvogadoResult_QNAME, ArrayOfTOConsultaAdvogadoResult.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TOConsultaAdvogadoResult }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link TOConsultaAdvogadoResult }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Cfoab.Integracao.Negocio.TO", name = "TOConsultaAdvogadoResult")
    public JAXBElement<TOConsultaAdvogadoResult> createTOConsultaAdvogadoResult(TOConsultaAdvogadoResult value) {
        return new JAXBElement<TOConsultaAdvogadoResult>(_TOConsultaAdvogadoResult_QNAME, TOConsultaAdvogadoResult.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfTOConsultaAdvogadoImagemResult }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ArrayOfTOConsultaAdvogadoImagemResult }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Cfoab.Integracao.Negocio.TO", name = "ArrayOfTOConsultaAdvogadoImagemResult")
    public JAXBElement<ArrayOfTOConsultaAdvogadoImagemResult> createArrayOfTOConsultaAdvogadoImagemResult(ArrayOfTOConsultaAdvogadoImagemResult value) {
        return new JAXBElement<ArrayOfTOConsultaAdvogadoImagemResult>(_ArrayOfTOConsultaAdvogadoImagemResult_QNAME, ArrayOfTOConsultaAdvogadoImagemResult.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TOConsultaAdvogadoImagemResult }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link TOConsultaAdvogadoImagemResult }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Cfoab.Integracao.Negocio.TO", name = "TOConsultaAdvogadoImagemResult")
    public JAXBElement<TOConsultaAdvogadoImagemResult> createTOConsultaAdvogadoImagemResult(TOConsultaAdvogadoImagemResult value) {
        return new JAXBElement<TOConsultaAdvogadoImagemResult>(_TOConsultaAdvogadoImagemResult_QNAME, TOConsultaAdvogadoImagemResult.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TOBiometricoAdvogado }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link TOBiometricoAdvogado }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Cfoab.Integracao.Negocio.TO", name = "TOBiometricoAdvogado")
    public JAXBElement<TOBiometricoAdvogado> createTOBiometricoAdvogado(TOBiometricoAdvogado value) {
        return new JAXBElement<TOBiometricoAdvogado>(_TOBiometricoAdvogado_QNAME, TOBiometricoAdvogado.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfTOConsultaPedidoResult }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ArrayOfTOConsultaPedidoResult }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Cfoab.Integracao.Negocio.TO", name = "ArrayOfTOConsultaPedidoResult")
    public JAXBElement<ArrayOfTOConsultaPedidoResult> createArrayOfTOConsultaPedidoResult(ArrayOfTOConsultaPedidoResult value) {
        return new JAXBElement<ArrayOfTOConsultaPedidoResult>(_ArrayOfTOConsultaPedidoResult_QNAME, ArrayOfTOConsultaPedidoResult.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TOConsultaPedidoResult }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link TOConsultaPedidoResult }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Cfoab.Integracao.Negocio.TO", name = "TOConsultaPedidoResult")
    public JAXBElement<TOConsultaPedidoResult> createTOConsultaPedidoResult(TOConsultaPedidoResult value) {
        return new JAXBElement<TOConsultaPedidoResult>(_TOConsultaPedidoResult_QNAME, TOConsultaPedidoResult.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfTOConsultaPedido }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ArrayOfTOConsultaPedido }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Cfoab.Integracao.Negocio.TO", name = "ArrayOfTOConsultaPedido")
    public JAXBElement<ArrayOfTOConsultaPedido> createArrayOfTOConsultaPedido(ArrayOfTOConsultaPedido value) {
        return new JAXBElement<ArrayOfTOConsultaPedido>(_ArrayOfTOConsultaPedido_QNAME, ArrayOfTOConsultaPedido.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TOConsultaPedido }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link TOConsultaPedido }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Cfoab.Integracao.Negocio.TO", name = "TOConsultaPedido")
    public JAXBElement<TOConsultaPedido> createTOConsultaPedido(TOConsultaPedido value) {
        return new JAXBElement<TOConsultaPedido>(_TOConsultaPedido_QNAME, TOConsultaPedido.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TOEnviaAdvogado }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link TOEnviaAdvogado }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Cfoab.Integracao.Negocio.TO", name = "TOEnviaAdvogado")
    public JAXBElement<TOEnviaAdvogado> createTOEnviaAdvogado(TOEnviaAdvogado value) {
        return new JAXBElement<TOEnviaAdvogado>(_TOEnviaAdvogado_QNAME, TOEnviaAdvogado.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TOEnviaPedido }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link TOEnviaPedido }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Cfoab.Integracao.Negocio.TO", name = "TOEnviaPedido")
    public JAXBElement<TOEnviaPedido> createTOEnviaPedido(TOEnviaPedido value) {
        return new JAXBElement<TOEnviaPedido>(_TOEnviaPedido_QNAME, TOEnviaPedido.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfTOConsultaTransferenciaResult }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ArrayOfTOConsultaTransferenciaResult }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Cfoab.Integracao.Negocio.TO", name = "ArrayOfTOConsultaTransferenciaResult")
    public JAXBElement<ArrayOfTOConsultaTransferenciaResult> createArrayOfTOConsultaTransferenciaResult(ArrayOfTOConsultaTransferenciaResult value) {
        return new JAXBElement<ArrayOfTOConsultaTransferenciaResult>(_ArrayOfTOConsultaTransferenciaResult_QNAME, ArrayOfTOConsultaTransferenciaResult.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TOConsultaTransferenciaResult }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link TOConsultaTransferenciaResult }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Cfoab.Integracao.Negocio.TO", name = "TOConsultaTransferenciaResult")
    public JAXBElement<TOConsultaTransferenciaResult> createTOConsultaTransferenciaResult(TOConsultaTransferenciaResult value) {
        return new JAXBElement<TOConsultaTransferenciaResult>(_TOConsultaTransferenciaResult_QNAME, TOConsultaTransferenciaResult.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TOImpedimentoAdvogado }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link TOImpedimentoAdvogado }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Cfoab.Integracao.Negocio.TO", name = "TOImpedimentoAdvogado")
    public JAXBElement<TOImpedimentoAdvogado> createTOImpedimentoAdvogado(TOImpedimentoAdvogado value) {
        return new JAXBElement<TOImpedimentoAdvogado>(_TOImpedimentoAdvogado_QNAME, TOImpedimentoAdvogado.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfTOImpedimento }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ArrayOfTOImpedimento }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Cfoab.Integracao.Negocio.TO", name = "ArrayOfTOImpedimento")
    public JAXBElement<ArrayOfTOImpedimento> createArrayOfTOImpedimento(ArrayOfTOImpedimento value) {
        return new JAXBElement<ArrayOfTOImpedimento>(_ArrayOfTOImpedimento_QNAME, ArrayOfTOImpedimento.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TOImpedimento }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link TOImpedimento }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Cfoab.Integracao.Negocio.TO", name = "TOImpedimento")
    public JAXBElement<TOImpedimento> createTOImpedimento(TOImpedimento value) {
        return new JAXBElement<TOImpedimento>(_TOImpedimento_QNAME, TOImpedimento.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Object }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Object }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "anyType")
    public JAXBElement<Object> createAnyType(Object value) {
        return new JAXBElement<Object>(_AnyType_QNAME, Object.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "anyURI")
    public JAXBElement<String> createAnyURI(String value) {
        return new JAXBElement<String>(_AnyURI_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link byte[]}{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link byte[]}{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "base64Binary")
    public JAXBElement<byte[]> createBase64Binary(byte[] value) {
        return new JAXBElement<byte[]>(_Base64Binary_QNAME, byte[].class, null, ((byte[]) value));
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "boolean")
    public JAXBElement<Boolean> createBoolean(Boolean value) {
        return new JAXBElement<Boolean>(_Boolean_QNAME, Boolean.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Byte }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Byte }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "byte")
    public JAXBElement<Byte> createByte(Byte value) {
        return new JAXBElement<Byte>(_Byte_QNAME, Byte.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "dateTime")
    public JAXBElement<XMLGregorianCalendar> createDateTime(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_DateTime_QNAME, XMLGregorianCalendar.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "decimal")
    public JAXBElement<BigDecimal> createDecimal(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_Decimal_QNAME, BigDecimal.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Double }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Double }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "double")
    public JAXBElement<Double> createDouble(Double value) {
        return new JAXBElement<Double>(_Double_QNAME, Double.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Float }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Float }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "float")
    public JAXBElement<Float> createFloat(Float value) {
        return new JAXBElement<Float>(_Float_QNAME, Float.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "int")
    public JAXBElement<Integer> createInt(Integer value) {
        return new JAXBElement<Integer>(_Int_QNAME, Integer.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Long }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "long")
    public JAXBElement<Long> createLong(Long value) {
        return new JAXBElement<Long>(_Long_QNAME, Long.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link QName }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link QName }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "QName")
    public JAXBElement<QName> createQName(QName value) {
        return new JAXBElement<QName>(_QName_QNAME, QName.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Short }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Short }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "short")
    public JAXBElement<Short> createShort(Short value) {
        return new JAXBElement<Short>(_Short_QNAME, Short.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "string")
    public JAXBElement<String> createString(String value) {
        return new JAXBElement<String>(_String_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Short }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Short }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "unsignedByte")
    public JAXBElement<Short> createUnsignedByte(Short value) {
        return new JAXBElement<Short>(_UnsignedByte_QNAME, Short.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Long }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "unsignedInt")
    public JAXBElement<Long> createUnsignedInt(Long value) {
        return new JAXBElement<Long>(_UnsignedInt_QNAME, Long.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigInteger }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link BigInteger }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "unsignedLong")
    public JAXBElement<BigInteger> createUnsignedLong(BigInteger value) {
        return new JAXBElement<BigInteger>(_UnsignedLong_QNAME, BigInteger.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "unsignedShort")
    public JAXBElement<Integer> createUnsignedShort(Integer value) {
        return new JAXBElement<Integer>(_UnsignedShort_QNAME, Integer.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "char")
    public JAXBElement<Integer> createChar(Integer value) {
        return new JAXBElement<Integer>(_Char_QNAME, Integer.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Duration }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Duration }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "duration")
    public JAXBElement<Duration> createDuration(Duration value) {
        return new JAXBElement<Duration>(_Duration_QNAME, Duration.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "guid")
    public JAXBElement<String> createGuid(String value) {
        return new JAXBElement<String>(_Guid_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "https://www5.oab.org.br/integracao/", name = "cpf", scope = ConsultaAdvogado.class)
    public JAXBElement<String> createConsultaAdvogadoCpf(String value) {
        return new JAXBElement<String>(_ConsultaAdvogadoCpf_QNAME, String.class, ConsultaAdvogado.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "https://www5.oab.org.br/integracao/", name = "inscricao", scope = ConsultaAdvogado.class)
    public JAXBElement<String> createConsultaAdvogadoInscricao(String value) {
        return new JAXBElement<String>(_ConsultaAdvogadoInscricao_QNAME, String.class, ConsultaAdvogado.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "https://www5.oab.org.br/integracao/", name = "uf", scope = ConsultaAdvogado.class)
    public JAXBElement<String> createConsultaAdvogadoUf(String value) {
        return new JAXBElement<String>(_ConsultaAdvogadoUf_QNAME, String.class, ConsultaAdvogado.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "https://www5.oab.org.br/integracao/", name = "nomeAdvogado", scope = ConsultaAdvogado.class)
    public JAXBElement<String> createConsultaAdvogadoNomeAdvogado(String value) {
        return new JAXBElement<String>(_ConsultaAdvogadoNomeAdvogado_QNAME, String.class, ConsultaAdvogado.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     */
    @XmlElementDecl(namespace = "https://www5.oab.org.br/integracao/", name = "dataCompromisso", scope = ConsultaAdvogado.class)
    public JAXBElement<XMLGregorianCalendar> createConsultaAdvogadoDataCompromisso(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_ConsultaAdvogadoDataCompromisso_QNAME, XMLGregorianCalendar.class, ConsultaAdvogado.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}
     */
    @XmlElementDecl(namespace = "https://www5.oab.org.br/integracao/", name = "numeroPagina", scope = ConsultaAdvogado.class)
    public JAXBElement<Integer> createConsultaAdvogadoNumeroPagina(Integer value) {
        return new JAXBElement<Integer>(_ConsultaAdvogadoNumeroPagina_QNAME, Integer.class, ConsultaAdvogado.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfTOConsultaAdvogadoResult }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ArrayOfTOConsultaAdvogadoResult }{@code >}
     */
    @XmlElementDecl(namespace = "https://www5.oab.org.br/integracao/", name = "ConsultaAdvogadoResult", scope = ConsultaAdvogadoResponse.class)
    public JAXBElement<ArrayOfTOConsultaAdvogadoResult> createConsultaAdvogadoResponseConsultaAdvogadoResult(ArrayOfTOConsultaAdvogadoResult value) {
        return new JAXBElement<ArrayOfTOConsultaAdvogadoResult>(_ConsultaAdvogadoResponseConsultaAdvogadoResult_QNAME, ArrayOfTOConsultaAdvogadoResult.class, ConsultaAdvogadoResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "https://www5.oab.org.br/integracao/", name = "cpf", scope = ConsultaAdvogadoImagem.class)
    public JAXBElement<String> createConsultaAdvogadoImagemCpf(String value) {
        return new JAXBElement<String>(_ConsultaAdvogadoCpf_QNAME, String.class, ConsultaAdvogadoImagem.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfTOConsultaAdvogadoImagemResult }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ArrayOfTOConsultaAdvogadoImagemResult }{@code >}
     */
    @XmlElementDecl(namespace = "https://www5.oab.org.br/integracao/", name = "ConsultaAdvogadoImagemResult", scope = ConsultaAdvogadoImagemResponse.class)
    public JAXBElement<ArrayOfTOConsultaAdvogadoImagemResult> createConsultaAdvogadoImagemResponseConsultaAdvogadoImagemResult(ArrayOfTOConsultaAdvogadoImagemResult value) {
        return new JAXBElement<ArrayOfTOConsultaAdvogadoImagemResult>(_ConsultaAdvogadoImagemResponseConsultaAdvogadoImagemResult_QNAME, ArrayOfTOConsultaAdvogadoImagemResult.class, ConsultaAdvogadoImagemResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "https://www5.oab.org.br/integracao/", name = "cpf", scope = ConsultaDadosBiometrico.class)
    public JAXBElement<String> createConsultaDadosBiometricoCpf(String value) {
        return new JAXBElement<String>(_ConsultaAdvogadoCpf_QNAME, String.class, ConsultaDadosBiometrico.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TOBiometricoAdvogado }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link TOBiometricoAdvogado }{@code >}
     */
    @XmlElementDecl(namespace = "https://www5.oab.org.br/integracao/", name = "ConsultaDadosBiometricoResult", scope = ConsultaDadosBiometricoResponse.class)
    public JAXBElement<TOBiometricoAdvogado> createConsultaDadosBiometricoResponseConsultaDadosBiometricoResult(TOBiometricoAdvogado value) {
        return new JAXBElement<TOBiometricoAdvogado>(_ConsultaDadosBiometricoResponseConsultaDadosBiometricoResult_QNAME, TOBiometricoAdvogado.class, ConsultaDadosBiometricoResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "https://www5.oab.org.br/integracao/", name = "requerimento", scope = ConsultaPedido.class)
    public JAXBElement<String> createConsultaPedidoRequerimento(String value) {
        return new JAXBElement<String>(_ConsultaPedidoRequerimento_QNAME, String.class, ConsultaPedido.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfTOConsultaPedidoResult }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ArrayOfTOConsultaPedidoResult }{@code >}
     */
    @XmlElementDecl(namespace = "https://www5.oab.org.br/integracao/", name = "ConsultaPedidoResult", scope = ConsultaPedidoResponse.class)
    public JAXBElement<ArrayOfTOConsultaPedidoResult> createConsultaPedidoResponseConsultaPedidoResult(ArrayOfTOConsultaPedidoResult value) {
        return new JAXBElement<ArrayOfTOConsultaPedidoResult>(_ConsultaPedidoResponseConsultaPedidoResult_QNAME, ArrayOfTOConsultaPedidoResult.class, ConsultaPedidoResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "https://www5.oab.org.br/integracao/", name = "cpf", scope = ConsultaPedidoCPF.class)
    public JAXBElement<String> createConsultaPedidoCPFCpf(String value) {
        return new JAXBElement<String>(_ConsultaAdvogadoCpf_QNAME, String.class, ConsultaPedidoCPF.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfTOConsultaPedido }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ArrayOfTOConsultaPedido }{@code >}
     */
    @XmlElementDecl(namespace = "https://www5.oab.org.br/integracao/", name = "ConsultaPedidoCPFResult", scope = ConsultaPedidoCPFResponse.class)
    public JAXBElement<ArrayOfTOConsultaPedido> createConsultaPedidoCPFResponseConsultaPedidoCPFResult(ArrayOfTOConsultaPedido value) {
        return new JAXBElement<ArrayOfTOConsultaPedido>(_ConsultaPedidoCPFResponseConsultaPedidoCPFResult_QNAME, ArrayOfTOConsultaPedido.class, ConsultaPedidoCPFResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TOEnviaAdvogado }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link TOEnviaAdvogado }{@code >}
     */
    @XmlElementDecl(namespace = "https://www5.oab.org.br/integracao/", name = "dadosAdvogado", scope = EnviaAdvogado.class)
    public JAXBElement<TOEnviaAdvogado> createEnviaAdvogadoDadosAdvogado(TOEnviaAdvogado value) {
        return new JAXBElement<TOEnviaAdvogado>(_EnviaAdvogadoDadosAdvogado_QNAME, TOEnviaAdvogado.class, EnviaAdvogado.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "https://www5.oab.org.br/integracao/", name = "EnviaAdvogadoResult", scope = EnviaAdvogadoResponse.class)
    public JAXBElement<String> createEnviaAdvogadoResponseEnviaAdvogadoResult(String value) {
        return new JAXBElement<String>(_EnviaAdvogadoResponseEnviaAdvogadoResult_QNAME, String.class, EnviaAdvogadoResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TOEnviaPedido }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link TOEnviaPedido }{@code >}
     */
    @XmlElementDecl(namespace = "https://www5.oab.org.br/integracao/", name = "dadosPedido", scope = EnviaPedido.class)
    public JAXBElement<TOEnviaPedido> createEnviaPedidoDadosPedido(TOEnviaPedido value) {
        return new JAXBElement<TOEnviaPedido>(_EnviaPedidoDadosPedido_QNAME, TOEnviaPedido.class, EnviaPedido.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "https://www5.oab.org.br/integracao/", name = "EnviaPedidoResult", scope = EnviaPedidoResponse.class)
    public JAXBElement<String> createEnviaPedidoResponseEnviaPedidoResult(String value) {
        return new JAXBElement<String>(_EnviaPedidoResponseEnviaPedidoResult_QNAME, String.class, EnviaPedidoResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}
     */
    @XmlElementDecl(namespace = "https://www5.oab.org.br/integracao/", name = "organizacao", scope = EnviaTransferencia.class)
    public JAXBElement<Integer> createEnviaTransferenciaOrganizacao(Integer value) {
        return new JAXBElement<Integer>(_EnviaTransferenciaOrganizacao_QNAME, Integer.class, EnviaTransferencia.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "https://www5.oab.org.br/integracao/", name = "cpf", scope = EnviaTransferencia.class)
    public JAXBElement<String> createEnviaTransferenciaCpf(String value) {
        return new JAXBElement<String>(_ConsultaAdvogadoCpf_QNAME, String.class, EnviaTransferencia.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}
     */
    @XmlElementDecl(namespace = "https://www5.oab.org.br/integracao/", name = "organizacaoTransferencia", scope = EnviaTransferencia.class)
    public JAXBElement<Integer> createEnviaTransferenciaOrganizacaoTransferencia(Integer value) {
        return new JAXBElement<Integer>(_EnviaTransferenciaOrganizacaoTransferencia_QNAME, Integer.class, EnviaTransferencia.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "https://www5.oab.org.br/integracao/", name = "EnviaTransferenciaResult", scope = EnviaTransferenciaResponse.class)
    public JAXBElement<String> createEnviaTransferenciaResponseEnviaTransferenciaResult(String value) {
        return new JAXBElement<String>(_EnviaTransferenciaResponseEnviaTransferenciaResult_QNAME, String.class, EnviaTransferenciaResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "https://www5.oab.org.br/integracao/", name = "tipoTransferencia", scope = ConsultaTransferencia.class)
    public JAXBElement<String> createConsultaTransferenciaTipoTransferencia(String value) {
        return new JAXBElement<String>(_ConsultaTransferenciaTipoTransferencia_QNAME, String.class, ConsultaTransferencia.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "https://www5.oab.org.br/integracao/", name = "cpf", scope = ConsultaTransferencia.class)
    public JAXBElement<String> createConsultaTransferenciaCpf(String value) {
        return new JAXBElement<String>(_ConsultaAdvogadoCpf_QNAME, String.class, ConsultaTransferencia.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfTOConsultaTransferenciaResult }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ArrayOfTOConsultaTransferenciaResult }{@code >}
     */
    @XmlElementDecl(namespace = "https://www5.oab.org.br/integracao/", name = "ConsultaTransferenciaResult", scope = ConsultaTransferenciaResponse.class)
    public JAXBElement<ArrayOfTOConsultaTransferenciaResult> createConsultaTransferenciaResponseConsultaTransferenciaResult(ArrayOfTOConsultaTransferenciaResult value) {
        return new JAXBElement<ArrayOfTOConsultaTransferenciaResult>(_ConsultaTransferenciaResponseConsultaTransferenciaResult_QNAME, ArrayOfTOConsultaTransferenciaResult.class, ConsultaTransferenciaResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "https://www5.oab.org.br/integracao/", name = "cpf", scope = ConsultaImpedimentosDoAdvogado.class)
    public JAXBElement<String> createConsultaImpedimentosDoAdvogadoCpf(String value) {
        return new JAXBElement<String>(_ConsultaAdvogadoCpf_QNAME, String.class, ConsultaImpedimentosDoAdvogado.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TOImpedimentoAdvogado }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link TOImpedimentoAdvogado }{@code >}
     */
    @XmlElementDecl(namespace = "https://www5.oab.org.br/integracao/", name = "ConsultaImpedimentosDoAdvogadoResult", scope = ConsultaImpedimentosDoAdvogadoResponse.class)
    public JAXBElement<TOImpedimentoAdvogado> createConsultaImpedimentosDoAdvogadoResponseConsultaImpedimentosDoAdvogadoResult(TOImpedimentoAdvogado value) {
        return new JAXBElement<TOImpedimentoAdvogado>(_ConsultaImpedimentosDoAdvogadoResponseConsultaImpedimentosDoAdvogadoResult_QNAME, TOImpedimentoAdvogado.class, ConsultaImpedimentosDoAdvogadoResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "https://www5.oab.org.br/integracao/", name = "GetIPResult", scope = GetIPResponse.class)
    public JAXBElement<String> createGetIPResponseGetIPResult(String value) {
        return new JAXBElement<String>(_GetIPResponseGetIPResult_QNAME, String.class, GetIPResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Cfoab.Integracao.Negocio.TO", name = "AbreImpe", scope = TOImpedimento.class)
    public JAXBElement<String> createTOImpedimentoAbreImpe(String value) {
        return new JAXBElement<String>(_TOImpedimentoAbreImpe_QNAME, String.class, TOImpedimento.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Cfoab.Integracao.Negocio.TO", name = "Nome", scope = TOImpedimento.class)
    public JAXBElement<String> createTOImpedimentoNome(String value) {
        return new JAXBElement<String>(_TOImpedimentoNome_QNAME, String.class, TOImpedimento.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Cfoab.Integracao.Negocio.TO", name = "Cpf", scope = TOConsultaTransferenciaResult.class)
    public JAXBElement<String> createTOConsultaTransferenciaResultCpf(String value) {
        return new JAXBElement<String>(_TOConsultaTransferenciaResultCpf_QNAME, String.class, TOConsultaTransferenciaResult.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Cfoab.Integracao.Negocio.TO", name = "DataSolicitacao", scope = TOConsultaTransferenciaResult.class)
    public JAXBElement<XMLGregorianCalendar> createTOConsultaTransferenciaResultDataSolicitacao(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_TOConsultaTransferenciaResultDataSolicitacao_QNAME, XMLGregorianCalendar.class, TOConsultaTransferenciaResult.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Cfoab.Integracao.Negocio.TO", name = "NomeAdvo", scope = TOConsultaTransferenciaResult.class)
    public JAXBElement<String> createTOConsultaTransferenciaResultNomeAdvo(String value) {
        return new JAXBElement<String>(_TOConsultaTransferenciaResultNomeAdvo_QNAME, String.class, TOConsultaTransferenciaResult.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Cfoab.Integracao.Negocio.TO", name = "NumrSegu", scope = TOConsultaTransferenciaResult.class)
    public JAXBElement<Integer> createTOConsultaTransferenciaResultNumrSegu(Integer value) {
        return new JAXBElement<Integer>(_TOConsultaTransferenciaResultNumrSegu_QNAME, Integer.class, TOConsultaTransferenciaResult.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Cfoab.Integracao.Negocio.TO", name = "SeccDestino", scope = TOConsultaTransferenciaResult.class)
    public JAXBElement<String> createTOConsultaTransferenciaResultSeccDestino(String value) {
        return new JAXBElement<String>(_TOConsultaTransferenciaResultSeccDestino_QNAME, String.class, TOConsultaTransferenciaResult.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Cfoab.Integracao.Negocio.TO", name = "SeccOrigem", scope = TOConsultaTransferenciaResult.class)
    public JAXBElement<String> createTOConsultaTransferenciaResultSeccOrigem(String value) {
        return new JAXBElement<String>(_TOConsultaTransferenciaResultSeccOrigem_QNAME, String.class, TOConsultaTransferenciaResult.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Cfoab.Integracao.Negocio.TO", name = "Biometrico", scope = TOConsultaPedido.class)
    public JAXBElement<String> createTOConsultaPedidoBiometrico(String value) {
        return new JAXBElement<String>(_TOConsultaPedidoBiometrico_QNAME, String.class, TOConsultaPedido.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Cfoab.Integracao.Negocio.TO", name = "CodiStatPedi", scope = TOConsultaPedido.class)
    public JAXBElement<Integer> createTOConsultaPedidoCodiStatPedi(Integer value) {
        return new JAXBElement<Integer>(_TOConsultaPedidoCodiStatPedi_QNAME, Integer.class, TOConsultaPedido.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Cfoab.Integracao.Negocio.TO", name = "Cpf", scope = TOConsultaPedido.class)
    public JAXBElement<String> createTOConsultaPedidoCpf(String value) {
        return new JAXBElement<String>(_TOConsultaTransferenciaResultCpf_QNAME, String.class, TOConsultaPedido.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Cfoab.Integracao.Negocio.TO", name = "DescPedi", scope = TOConsultaPedido.class)
    public JAXBElement<String> createTOConsultaPedidoDescPedi(String value) {
        return new JAXBElement<String>(_TOConsultaPedidoDescPedi_QNAME, String.class, TOConsultaPedido.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Cfoab.Integracao.Negocio.TO", name = "DescStatPedi", scope = TOConsultaPedido.class)
    public JAXBElement<String> createTOConsultaPedidoDescStatPedi(String value) {
        return new JAXBElement<String>(_TOConsultaPedidoDescStatPedi_QNAME, String.class, TOConsultaPedido.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Cfoab.Integracao.Negocio.TO", name = "NumrNotaFsca", scope = TOConsultaPedido.class)
    public JAXBElement<String> createTOConsultaPedidoNumrNotaFsca(String value) {
        return new JAXBElement<String>(_TOConsultaPedidoNumrNotaFsca_QNAME, String.class, TOConsultaPedido.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Cfoab.Integracao.Negocio.TO", name = "NumrPedi", scope = TOConsultaPedido.class)
    public JAXBElement<String> createTOConsultaPedidoNumrPedi(String value) {
        return new JAXBElement<String>(_TOConsultaPedidoNumrPedi_QNAME, String.class, TOConsultaPedido.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Cfoab.Integracao.Negocio.TO", name = "NumrSegu", scope = TOConsultaPedido.class)
    public JAXBElement<Integer> createTOConsultaPedidoNumrSegu(Integer value) {
        return new JAXBElement<Integer>(_TOConsultaTransferenciaResultNumrSegu_QNAME, Integer.class, TOConsultaPedido.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Cfoab.Integracao.Negocio.TO", name = "OS", scope = TOConsultaPedido.class)
    public JAXBElement<String> createTOConsultaPedidoOS(String value) {
        return new JAXBElement<String>(_TOConsultaPedidoOS_QNAME, String.class, TOConsultaPedido.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Cfoab.Integracao.Negocio.TO", name = "Uf", scope = TOConsultaPedido.class)
    public JAXBElement<String> createTOConsultaPedidoUf(String value) {
        return new JAXBElement<String>(_TOConsultaPedidoUf_QNAME, String.class, TOConsultaPedido.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Cfoab.Integracao.Negocio.TO", name = "Biometrico", scope = TOConsultaPedidoResult.class)
    public JAXBElement<String> createTOConsultaPedidoResultBiometrico(String value) {
        return new JAXBElement<String>(_TOConsultaPedidoBiometrico_QNAME, String.class, TOConsultaPedidoResult.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Cfoab.Integracao.Negocio.TO", name = "Cpf", scope = TOConsultaPedidoResult.class)
    public JAXBElement<String> createTOConsultaPedidoResultCpf(String value) {
        return new JAXBElement<String>(_TOConsultaTransferenciaResultCpf_QNAME, String.class, TOConsultaPedidoResult.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Cfoab.Integracao.Negocio.TO", name = "DescStatPedi", scope = TOConsultaPedidoResult.class)
    public JAXBElement<String> createTOConsultaPedidoResultDescStatPedi(String value) {
        return new JAXBElement<String>(_TOConsultaPedidoDescStatPedi_QNAME, String.class, TOConsultaPedidoResult.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Cfoab.Integracao.Negocio.TO", name = "NumrNotaFsca", scope = TOConsultaPedidoResult.class)
    public JAXBElement<String> createTOConsultaPedidoResultNumrNotaFsca(String value) {
        return new JAXBElement<String>(_TOConsultaPedidoNumrNotaFsca_QNAME, String.class, TOConsultaPedidoResult.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Cfoab.Integracao.Negocio.TO", name = "NumrPedi", scope = TOConsultaPedidoResult.class)
    public JAXBElement<String> createTOConsultaPedidoResultNumrPedi(String value) {
        return new JAXBElement<String>(_TOConsultaPedidoNumrPedi_QNAME, String.class, TOConsultaPedidoResult.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Cfoab.Integracao.Negocio.TO", name = "NumrSegu", scope = TOConsultaPedidoResult.class)
    public JAXBElement<String> createTOConsultaPedidoResultNumrSegu(String value) {
        return new JAXBElement<String>(_TOConsultaTransferenciaResultNumrSegu_QNAME, String.class, TOConsultaPedidoResult.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Cfoab.Integracao.Negocio.TO", name = "OS", scope = TOConsultaPedidoResult.class)
    public JAXBElement<String> createTOConsultaPedidoResultOS(String value) {
        return new JAXBElement<String>(_TOConsultaPedidoOS_QNAME, String.class, TOConsultaPedidoResult.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link byte[]}{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link byte[]}{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Cfoab.Integracao.Negocio.TO", name = "Assi", scope = TOConsultaAdvogadoImagemResult.class)
    public JAXBElement<byte[]> createTOConsultaAdvogadoImagemResultAssi(byte[] value) {
        return new JAXBElement<byte[]>(_TOConsultaAdvogadoImagemResultAssi_QNAME, byte[].class, TOConsultaAdvogadoImagemResult.class, ((byte[]) value));
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Cfoab.Integracao.Negocio.TO", name = "BitImpAssi", scope = TOConsultaAdvogadoImagemResult.class)
    public JAXBElement<Boolean> createTOConsultaAdvogadoImagemResultBitImpAssi(Boolean value) {
        return new JAXBElement<Boolean>(_TOConsultaAdvogadoImagemResultBitImpAssi_QNAME, Boolean.class, TOConsultaAdvogadoImagemResult.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Cfoab.Integracao.Negocio.TO", name = "BitImpDigi", scope = TOConsultaAdvogadoImagemResult.class)
    public JAXBElement<Boolean> createTOConsultaAdvogadoImagemResultBitImpDigi(Boolean value) {
        return new JAXBElement<Boolean>(_TOConsultaAdvogadoImagemResultBitImpDigi_QNAME, Boolean.class, TOConsultaAdvogadoImagemResult.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Cfoab.Integracao.Negocio.TO", name = "BitImpFoto", scope = TOConsultaAdvogadoImagemResult.class)
    public JAXBElement<Boolean> createTOConsultaAdvogadoImagemResultBitImpFoto(Boolean value) {
        return new JAXBElement<Boolean>(_TOConsultaAdvogadoImagemResultBitImpFoto_QNAME, Boolean.class, TOConsultaAdvogadoImagemResult.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Cfoab.Integracao.Negocio.TO", name = "DataAtuaAssi", scope = TOConsultaAdvogadoImagemResult.class)
    public JAXBElement<XMLGregorianCalendar> createTOConsultaAdvogadoImagemResultDataAtuaAssi(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_TOConsultaAdvogadoImagemResultDataAtuaAssi_QNAME, XMLGregorianCalendar.class, TOConsultaAdvogadoImagemResult.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Cfoab.Integracao.Negocio.TO", name = "DataAtuaDigi", scope = TOConsultaAdvogadoImagemResult.class)
    public JAXBElement<XMLGregorianCalendar> createTOConsultaAdvogadoImagemResultDataAtuaDigi(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_TOConsultaAdvogadoImagemResultDataAtuaDigi_QNAME, XMLGregorianCalendar.class, TOConsultaAdvogadoImagemResult.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Cfoab.Integracao.Negocio.TO", name = "DataAtuaFoto", scope = TOConsultaAdvogadoImagemResult.class)
    public JAXBElement<XMLGregorianCalendar> createTOConsultaAdvogadoImagemResultDataAtuaFoto(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_TOConsultaAdvogadoImagemResultDataAtuaFoto_QNAME, XMLGregorianCalendar.class, TOConsultaAdvogadoImagemResult.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link byte[]}{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link byte[]}{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Cfoab.Integracao.Negocio.TO", name = "Digi", scope = TOConsultaAdvogadoImagemResult.class)
    public JAXBElement<byte[]> createTOConsultaAdvogadoImagemResultDigi(byte[] value) {
        return new JAXBElement<byte[]>(_TOConsultaAdvogadoImagemResultDigi_QNAME, byte[].class, TOConsultaAdvogadoImagemResult.class, ((byte[]) value));
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link byte[]}{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link byte[]}{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Cfoab.Integracao.Negocio.TO", name = "Foto", scope = TOConsultaAdvogadoImagemResult.class)
    public JAXBElement<byte[]> createTOConsultaAdvogadoImagemResultFoto(byte[] value) {
        return new JAXBElement<byte[]>(_TOConsultaAdvogadoImagemResultFoto_QNAME, byte[].class, TOConsultaAdvogadoImagemResult.class, ((byte[]) value));
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Cfoab.Integracao.Negocio.TO", name = "NomeAdvo", scope = TOConsultaAdvogadoImagemResult.class)
    public JAXBElement<String> createTOConsultaAdvogadoImagemResultNomeAdvo(String value) {
        return new JAXBElement<String>(_TOConsultaTransferenciaResultNomeAdvo_QNAME, String.class, TOConsultaAdvogadoImagemResult.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Cfoab.Integracao.Negocio.TO", name = "NumrSegu", scope = TOConsultaAdvogadoImagemResult.class)
    public JAXBElement<String> createTOConsultaAdvogadoImagemResultNumrSegu(String value) {
        return new JAXBElement<String>(_TOConsultaTransferenciaResultNumrSegu_QNAME, String.class, TOConsultaAdvogadoImagemResult.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Cfoab.Integracao.Negocio.TO", name = "BairCom", scope = TOConsultaAdvogadoResult.class)
    public JAXBElement<String> createTOConsultaAdvogadoResultBairCom(String value) {
        return new JAXBElement<String>(_TOConsultaAdvogadoResultBairCom_QNAME, String.class, TOConsultaAdvogadoResult.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Cfoab.Integracao.Negocio.TO", name = "BairRes", scope = TOConsultaAdvogadoResult.class)
    public JAXBElement<String> createTOConsultaAdvogadoResultBairRes(String value) {
        return new JAXBElement<String>(_TOConsultaAdvogadoResultBairRes_QNAME, String.class, TOConsultaAdvogadoResult.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Cfoab.Integracao.Negocio.TO", name = "BitDivuEndeCom", scope = TOConsultaAdvogadoResult.class)
    public JAXBElement<Boolean> createTOConsultaAdvogadoResultBitDivuEndeCom(Boolean value) {
        return new JAXBElement<Boolean>(_TOConsultaAdvogadoResultBitDivuEndeCom_QNAME, Boolean.class, TOConsultaAdvogadoResult.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Cfoab.Integracao.Negocio.TO", name = "BitDivuEndeRes", scope = TOConsultaAdvogadoResult.class)
    public JAXBElement<Boolean> createTOConsultaAdvogadoResultBitDivuEndeRes(Boolean value) {
        return new JAXBElement<Boolean>(_TOConsultaAdvogadoResultBitDivuEndeRes_QNAME, Boolean.class, TOConsultaAdvogadoResult.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Cfoab.Integracao.Negocio.TO", name = "BitDivuTelfCom", scope = TOConsultaAdvogadoResult.class)
    public JAXBElement<Boolean> createTOConsultaAdvogadoResultBitDivuTelfCom(Boolean value) {
        return new JAXBElement<Boolean>(_TOConsultaAdvogadoResultBitDivuTelfCom_QNAME, Boolean.class, TOConsultaAdvogadoResult.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Cfoab.Integracao.Negocio.TO", name = "BitDivuTelfRes", scope = TOConsultaAdvogadoResult.class)
    public JAXBElement<Boolean> createTOConsultaAdvogadoResultBitDivuTelfRes(Boolean value) {
        return new JAXBElement<Boolean>(_TOConsultaAdvogadoResultBitDivuTelfRes_QNAME, Boolean.class, TOConsultaAdvogadoResult.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Cfoab.Integracao.Negocio.TO", name = "BitEnviEmalCom", scope = TOConsultaAdvogadoResult.class)
    public JAXBElement<Boolean> createTOConsultaAdvogadoResultBitEnviEmalCom(Boolean value) {
        return new JAXBElement<Boolean>(_TOConsultaAdvogadoResultBitEnviEmalCom_QNAME, Boolean.class, TOConsultaAdvogadoResult.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Cfoab.Integracao.Negocio.TO", name = "BitEnviEmalRes", scope = TOConsultaAdvogadoResult.class)
    public JAXBElement<Boolean> createTOConsultaAdvogadoResultBitEnviEmalRes(Boolean value) {
        return new JAXBElement<Boolean>(_TOConsultaAdvogadoResultBitEnviEmalRes_QNAME, Boolean.class, TOConsultaAdvogadoResult.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Cfoab.Integracao.Negocio.TO", name = "BitPublCada", scope = TOConsultaAdvogadoResult.class)
    public JAXBElement<Boolean> createTOConsultaAdvogadoResultBitPublCada(Boolean value) {
        return new JAXBElement<Boolean>(_TOConsultaAdvogadoResultBitPublCada_QNAME, Boolean.class, TOConsultaAdvogadoResult.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Cfoab.Integracao.Negocio.TO", name = "BitPublFoto", scope = TOConsultaAdvogadoResult.class)
    public JAXBElement<Boolean> createTOConsultaAdvogadoResultBitPublFoto(Boolean value) {
        return new JAXBElement<Boolean>(_TOConsultaAdvogadoResultBitPublFoto_QNAME, Boolean.class, TOConsultaAdvogadoResult.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Cfoab.Integracao.Negocio.TO", name = "CertMilt", scope = TOConsultaAdvogadoResult.class)
    public JAXBElement<String> createTOConsultaAdvogadoResultCertMilt(String value) {
        return new JAXBElement<String>(_TOConsultaAdvogadoResultCertMilt_QNAME, String.class, TOConsultaAdvogadoResult.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Cfoab.Integracao.Negocio.TO", name = "CodiCiddCom", scope = TOConsultaAdvogadoResult.class)
    public JAXBElement<Integer> createTOConsultaAdvogadoResultCodiCiddCom(Integer value) {
        return new JAXBElement<Integer>(_TOConsultaAdvogadoResultCodiCiddCom_QNAME, Integer.class, TOConsultaAdvogadoResult.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Cfoab.Integracao.Negocio.TO", name = "CodiCiddElei", scope = TOConsultaAdvogadoResult.class)
    public JAXBElement<Integer> createTOConsultaAdvogadoResultCodiCiddElei(Integer value) {
        return new JAXBElement<Integer>(_TOConsultaAdvogadoResultCodiCiddElei_QNAME, Integer.class, TOConsultaAdvogadoResult.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Cfoab.Integracao.Negocio.TO", name = "CodiCiddNasc", scope = TOConsultaAdvogadoResult.class)
    public JAXBElement<Integer> createTOConsultaAdvogadoResultCodiCiddNasc(Integer value) {
        return new JAXBElement<Integer>(_TOConsultaAdvogadoResultCodiCiddNasc_QNAME, Integer.class, TOConsultaAdvogadoResult.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Cfoab.Integracao.Negocio.TO", name = "CodiCiddRes", scope = TOConsultaAdvogadoResult.class)
    public JAXBElement<Integer> createTOConsultaAdvogadoResultCodiCiddRes(Integer value) {
        return new JAXBElement<Integer>(_TOConsultaAdvogadoResultCodiCiddRes_QNAME, Integer.class, TOConsultaAdvogadoResult.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Cfoab.Integracao.Negocio.TO", name = "CodiDefc", scope = TOConsultaAdvogadoResult.class)
    public JAXBElement<Integer> createTOConsultaAdvogadoResultCodiDefc(Integer value) {
        return new JAXBElement<Integer>(_TOConsultaAdvogadoResultCodiDefc_QNAME, Integer.class, TOConsultaAdvogadoResult.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Cfoab.Integracao.Negocio.TO", name = "CodiRacaCor", scope = TOConsultaAdvogadoResult.class)
    public JAXBElement<Integer> createTOConsultaAdvogadoResultCodiRacaCor(Integer value) {
        return new JAXBElement<Integer>(_TOConsultaAdvogadoResultCodiRacaCor_QNAME, Integer.class, TOConsultaAdvogadoResult.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Cfoab.Integracao.Negocio.TO", name = "CodiStatAdvo", scope = TOConsultaAdvogadoResult.class)
    public JAXBElement<Integer> createTOConsultaAdvogadoResultCodiStatAdvo(Integer value) {
        return new JAXBElement<Integer>(_TOConsultaAdvogadoResultCodiStatAdvo_QNAME, Integer.class, TOConsultaAdvogadoResult.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Cfoab.Integracao.Negocio.TO", name = "CompCom", scope = TOConsultaAdvogadoResult.class)
    public JAXBElement<String> createTOConsultaAdvogadoResultCompCom(String value) {
        return new JAXBElement<String>(_TOConsultaAdvogadoResultCompCom_QNAME, String.class, TOConsultaAdvogadoResult.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Cfoab.Integracao.Negocio.TO", name = "CompRes", scope = TOConsultaAdvogadoResult.class)
    public JAXBElement<String> createTOConsultaAdvogadoResultCompRes(String value) {
        return new JAXBElement<String>(_TOConsultaAdvogadoResultCompRes_QNAME, String.class, TOConsultaAdvogadoResult.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Cfoab.Integracao.Negocio.TO", name = "Cpf", scope = TOConsultaAdvogadoResult.class)
    public JAXBElement<String> createTOConsultaAdvogadoResultCpf(String value) {
        return new JAXBElement<String>(_TOConsultaTransferenciaResultCpf_QNAME, String.class, TOConsultaAdvogadoResult.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Cfoab.Integracao.Negocio.TO", name = "DatAtualizacao", scope = TOConsultaAdvogadoResult.class)
    public JAXBElement<XMLGregorianCalendar> createTOConsultaAdvogadoResultDatAtualizacao(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_TOConsultaAdvogadoResultDatAtualizacao_QNAME, XMLGregorianCalendar.class, TOConsultaAdvogadoResult.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Cfoab.Integracao.Negocio.TO", name = "DataCola", scope = TOConsultaAdvogadoResult.class)
    public JAXBElement<XMLGregorianCalendar> createTOConsultaAdvogadoResultDataCola(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_TOConsultaAdvogadoResultDataCola_QNAME, XMLGregorianCalendar.class, TOConsultaAdvogadoResult.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Cfoab.Integracao.Negocio.TO", name = "DataCpro", scope = TOConsultaAdvogadoResult.class)
    public JAXBElement<XMLGregorianCalendar> createTOConsultaAdvogadoResultDataCpro(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_TOConsultaAdvogadoResultDataCpro_QNAME, XMLGregorianCalendar.class, TOConsultaAdvogadoResult.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Cfoab.Integracao.Negocio.TO", name = "DataEmis", scope = TOConsultaAdvogadoResult.class)
    public JAXBElement<XMLGregorianCalendar> createTOConsultaAdvogadoResultDataEmis(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_TOConsultaAdvogadoResultDataEmis_QNAME, XMLGregorianCalendar.class, TOConsultaAdvogadoResult.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Cfoab.Integracao.Negocio.TO", name = "DataEmisRG", scope = TOConsultaAdvogadoResult.class)
    public JAXBElement<XMLGregorianCalendar> createTOConsultaAdvogadoResultDataEmisRG(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_TOConsultaAdvogadoResultDataEmisRG_QNAME, XMLGregorianCalendar.class, TOConsultaAdvogadoResult.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Cfoab.Integracao.Negocio.TO", name = "DataNasc", scope = TOConsultaAdvogadoResult.class)
    public JAXBElement<XMLGregorianCalendar> createTOConsultaAdvogadoResultDataNasc(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_TOConsultaAdvogadoResultDataNasc_QNAME, XMLGregorianCalendar.class, TOConsultaAdvogadoResult.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Cfoab.Integracao.Negocio.TO", name = "DataStat", scope = TOConsultaAdvogadoResult.class)
    public JAXBElement<XMLGregorianCalendar> createTOConsultaAdvogadoResultDataStat(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_TOConsultaAdvogadoResultDataStat_QNAME, XMLGregorianCalendar.class, TOConsultaAdvogadoResult.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Cfoab.Integracao.Negocio.TO", name = "DataTransf", scope = TOConsultaAdvogadoResult.class)
    public JAXBElement<XMLGregorianCalendar> createTOConsultaAdvogadoResultDataTransf(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_TOConsultaAdvogadoResultDataTransf_QNAME, XMLGregorianCalendar.class, TOConsultaAdvogadoResult.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Cfoab.Integracao.Negocio.TO", name = "DescRacaCor", scope = TOConsultaAdvogadoResult.class)
    public JAXBElement<String> createTOConsultaAdvogadoResultDescRacaCor(String value) {
        return new JAXBElement<String>(_TOConsultaAdvogadoResultDescRacaCor_QNAME, String.class, TOConsultaAdvogadoResult.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Cfoab.Integracao.Negocio.TO", name = "Descdefi", scope = TOConsultaAdvogadoResult.class)
    public JAXBElement<String> createTOConsultaAdvogadoResultDescdefi(String value) {
        return new JAXBElement<String>(_TOConsultaAdvogadoResultDescdefi_QNAME, String.class, TOConsultaAdvogadoResult.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Cfoab.Integracao.Negocio.TO", name = "EmailCom", scope = TOConsultaAdvogadoResult.class)
    public JAXBElement<String> createTOConsultaAdvogadoResultEmailCom(String value) {
        return new JAXBElement<String>(_TOConsultaAdvogadoResultEmailCom_QNAME, String.class, TOConsultaAdvogadoResult.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Cfoab.Integracao.Negocio.TO", name = "EmailRes", scope = TOConsultaAdvogadoResult.class)
    public JAXBElement<String> createTOConsultaAdvogadoResultEmailRes(String value) {
        return new JAXBElement<String>(_TOConsultaAdvogadoResultEmailRes_QNAME, String.class, TOConsultaAdvogadoResult.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Cfoab.Integracao.Negocio.TO", name = "EstdCivl", scope = TOConsultaAdvogadoResult.class)
    public JAXBElement<String> createTOConsultaAdvogadoResultEstdCivl(String value) {
        return new JAXBElement<String>(_TOConsultaAdvogadoResultEstdCivl_QNAME, String.class, TOConsultaAdvogadoResult.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Cfoab.Integracao.Negocio.TO", name = "ExpeMilt", scope = TOConsultaAdvogadoResult.class)
    public JAXBElement<String> createTOConsultaAdvogadoResultExpeMilt(String value) {
        return new JAXBElement<String>(_TOConsultaAdvogadoResultExpeMilt_QNAME, String.class, TOConsultaAdvogadoResult.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Cfoab.Integracao.Negocio.TO", name = "IdenEstdCivl", scope = TOConsultaAdvogadoResult.class)
    public JAXBElement<Integer> createTOConsultaAdvogadoResultIdenEstdCivl(Integer value) {
        return new JAXBElement<Integer>(_TOConsultaAdvogadoResultIdenEstdCivl_QNAME, Integer.class, TOConsultaAdvogadoResult.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Cfoab.Integracao.Negocio.TO", name = "IdenOgan", scope = TOConsultaAdvogadoResult.class)
    public JAXBElement<Integer> createTOConsultaAdvogadoResultIdenOgan(Integer value) {
        return new JAXBElement<Integer>(_TOConsultaAdvogadoResultIdenOgan_QNAME, Integer.class, TOConsultaAdvogadoResult.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Cfoab.Integracao.Negocio.TO", name = "IdenOganTransf", scope = TOConsultaAdvogadoResult.class)
    public JAXBElement<Integer> createTOConsultaAdvogadoResultIdenOganTransf(Integer value) {
        return new JAXBElement<Integer>(_TOConsultaAdvogadoResultIdenOganTransf_QNAME, Integer.class, TOConsultaAdvogadoResult.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Cfoab.Integracao.Negocio.TO", name = "IdtAdvo", scope = TOConsultaAdvogadoResult.class)
    public JAXBElement<Integer> createTOConsultaAdvogadoResultIdtAdvo(Integer value) {
        return new JAXBElement<Integer>(_TOConsultaAdvogadoResultIdtAdvo_QNAME, Integer.class, TOConsultaAdvogadoResult.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Cfoab.Integracao.Negocio.TO", name = "IdtFacu", scope = TOConsultaAdvogadoResult.class)
    public JAXBElement<Integer> createTOConsultaAdvogadoResultIdtFacu(Integer value) {
        return new JAXBElement<Integer>(_TOConsultaAdvogadoResultIdtFacu_QNAME, Integer.class, TOConsultaAdvogadoResult.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Cfoab.Integracao.Negocio.TO", name = "IdtTipoDoad", scope = TOConsultaAdvogadoResult.class)
    public JAXBElement<Integer> createTOConsultaAdvogadoResultIdtTipoDoad(Integer value) {
        return new JAXBElement<Integer>(_TOConsultaAdvogadoResultIdtTipoDoad_QNAME, Integer.class, TOConsultaAdvogadoResult.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Cfoab.Integracao.Negocio.TO", name = "IdtTipoInscOab", scope = TOConsultaAdvogadoResult.class)
    public JAXBElement<Integer> createTOConsultaAdvogadoResultIdtTipoInscOab(Integer value) {
        return new JAXBElement<Integer>(_TOConsultaAdvogadoResultIdtTipoInscOab_QNAME, Integer.class, TOConsultaAdvogadoResult.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Cfoab.Integracao.Negocio.TO", name = "Insc", scope = TOConsultaAdvogadoResult.class)
    public JAXBElement<String> createTOConsultaAdvogadoResultInsc(String value) {
        return new JAXBElement<String>(_TOConsultaAdvogadoResultInsc_QNAME, String.class, TOConsultaAdvogadoResult.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Cfoab.Integracao.Negocio.TO", name = "InscOab", scope = TOConsultaAdvogadoResult.class)
    public JAXBElement<String> createTOConsultaAdvogadoResultInscOab(String value) {
        return new JAXBElement<String>(_TOConsultaAdvogadoResultInscOab_QNAME, String.class, TOConsultaAdvogadoResult.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Cfoab.Integracao.Negocio.TO", name = "LogrCom", scope = TOConsultaAdvogadoResult.class)
    public JAXBElement<String> createTOConsultaAdvogadoResultLogrCom(String value) {
        return new JAXBElement<String>(_TOConsultaAdvogadoResultLogrCom_QNAME, String.class, TOConsultaAdvogadoResult.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Cfoab.Integracao.Negocio.TO", name = "LogrRes", scope = TOConsultaAdvogadoResult.class)
    public JAXBElement<String> createTOConsultaAdvogadoResultLogrRes(String value) {
        return new JAXBElement<String>(_TOConsultaAdvogadoResultLogrRes_QNAME, String.class, TOConsultaAdvogadoResult.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Cfoab.Integracao.Negocio.TO", name = "Nacn", scope = TOConsultaAdvogadoResult.class)
    public JAXBElement<String> createTOConsultaAdvogadoResultNacn(String value) {
        return new JAXBElement<String>(_TOConsultaAdvogadoResultNacn_QNAME, String.class, TOConsultaAdvogadoResult.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Cfoab.Integracao.Negocio.TO", name = "NomeAdvo", scope = TOConsultaAdvogadoResult.class)
    public JAXBElement<String> createTOConsultaAdvogadoResultNomeAdvo(String value) {
        return new JAXBElement<String>(_TOConsultaTransferenciaResultNomeAdvo_QNAME, String.class, TOConsultaAdvogadoResult.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Cfoab.Integracao.Negocio.TO", name = "NomeCiddCom", scope = TOConsultaAdvogadoResult.class)
    public JAXBElement<String> createTOConsultaAdvogadoResultNomeCiddCom(String value) {
        return new JAXBElement<String>(_TOConsultaAdvogadoResultNomeCiddCom_QNAME, String.class, TOConsultaAdvogadoResult.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Cfoab.Integracao.Negocio.TO", name = "NomeCiddElei", scope = TOConsultaAdvogadoResult.class)
    public JAXBElement<String> createTOConsultaAdvogadoResultNomeCiddElei(String value) {
        return new JAXBElement<String>(_TOConsultaAdvogadoResultNomeCiddElei_QNAME, String.class, TOConsultaAdvogadoResult.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Cfoab.Integracao.Negocio.TO", name = "NomeCiddNasc", scope = TOConsultaAdvogadoResult.class)
    public JAXBElement<String> createTOConsultaAdvogadoResultNomeCiddNasc(String value) {
        return new JAXBElement<String>(_TOConsultaAdvogadoResultNomeCiddNasc_QNAME, String.class, TOConsultaAdvogadoResult.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Cfoab.Integracao.Negocio.TO", name = "NomeCiddRes", scope = TOConsultaAdvogadoResult.class)
    public JAXBElement<String> createTOConsultaAdvogadoResultNomeCiddRes(String value) {
        return new JAXBElement<String>(_TOConsultaAdvogadoResultNomeCiddRes_QNAME, String.class, TOConsultaAdvogadoResult.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Cfoab.Integracao.Negocio.TO", name = "NomeInst", scope = TOConsultaAdvogadoResult.class)
    public JAXBElement<String> createTOConsultaAdvogadoResultNomeInst(String value) {
        return new JAXBElement<String>(_TOConsultaAdvogadoResultNomeInst_QNAME, String.class, TOConsultaAdvogadoResult.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Cfoab.Integracao.Negocio.TO", name = "NomeMae2Advo", scope = TOConsultaAdvogadoResult.class)
    public JAXBElement<String> createTOConsultaAdvogadoResultNomeMae2Advo(String value) {
        return new JAXBElement<String>(_TOConsultaAdvogadoResultNomeMae2Advo_QNAME, String.class, TOConsultaAdvogadoResult.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Cfoab.Integracao.Negocio.TO", name = "NomeMaeAdvo", scope = TOConsultaAdvogadoResult.class)
    public JAXBElement<String> createTOConsultaAdvogadoResultNomeMaeAdvo(String value) {
        return new JAXBElement<String>(_TOConsultaAdvogadoResultNomeMaeAdvo_QNAME, String.class, TOConsultaAdvogadoResult.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Cfoab.Integracao.Negocio.TO", name = "NomeOgan", scope = TOConsultaAdvogadoResult.class)
    public JAXBElement<String> createTOConsultaAdvogadoResultNomeOgan(String value) {
        return new JAXBElement<String>(_TOConsultaAdvogadoResultNomeOgan_QNAME, String.class, TOConsultaAdvogadoResult.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Cfoab.Integracao.Negocio.TO", name = "NomePai2Advo", scope = TOConsultaAdvogadoResult.class)
    public JAXBElement<String> createTOConsultaAdvogadoResultNomePai2Advo(String value) {
        return new JAXBElement<String>(_TOConsultaAdvogadoResultNomePai2Advo_QNAME, String.class, TOConsultaAdvogadoResult.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Cfoab.Integracao.Negocio.TO", name = "NomePaiAdvo", scope = TOConsultaAdvogadoResult.class)
    public JAXBElement<String> createTOConsultaAdvogadoResultNomePaiAdvo(String value) {
        return new JAXBElement<String>(_TOConsultaAdvogadoResultNomePaiAdvo_QNAME, String.class, TOConsultaAdvogadoResult.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Cfoab.Integracao.Negocio.TO", name = "NomeProf", scope = TOConsultaAdvogadoResult.class)
    public JAXBElement<String> createTOConsultaAdvogadoResultNomeProf(String value) {
        return new JAXBElement<String>(_TOConsultaAdvogadoResultNomeProf_QNAME, String.class, TOConsultaAdvogadoResult.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Cfoab.Integracao.Negocio.TO", name = "NomeSoci", scope = TOConsultaAdvogadoResult.class)
    public JAXBElement<String> createTOConsultaAdvogadoResultNomeSoci(String value) {
        return new JAXBElement<String>(_TOConsultaAdvogadoResultNomeSoci_QNAME, String.class, TOConsultaAdvogadoResult.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Cfoab.Integracao.Negocio.TO", name = "NumrCepCom", scope = TOConsultaAdvogadoResult.class)
    public JAXBElement<String> createTOConsultaAdvogadoResultNumrCepCom(String value) {
        return new JAXBElement<String>(_TOConsultaAdvogadoResultNumrCepCom_QNAME, String.class, TOConsultaAdvogadoResult.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Cfoab.Integracao.Negocio.TO", name = "NumrCepRes", scope = TOConsultaAdvogadoResult.class)
    public JAXBElement<String> createTOConsultaAdvogadoResultNumrCepRes(String value) {
        return new JAXBElement<String>(_TOConsultaAdvogadoResultNumrCepRes_QNAME, String.class, TOConsultaAdvogadoResult.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Cfoab.Integracao.Negocio.TO", name = "NumrDDDCelCom", scope = TOConsultaAdvogadoResult.class)
    public JAXBElement<String> createTOConsultaAdvogadoResultNumrDDDCelCom(String value) {
        return new JAXBElement<String>(_TOConsultaAdvogadoResultNumrDDDCelCom_QNAME, String.class, TOConsultaAdvogadoResult.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Cfoab.Integracao.Negocio.TO", name = "NumrDDDCelRes", scope = TOConsultaAdvogadoResult.class)
    public JAXBElement<String> createTOConsultaAdvogadoResultNumrDDDCelRes(String value) {
        return new JAXBElement<String>(_TOConsultaAdvogadoResultNumrDDDCelRes_QNAME, String.class, TOConsultaAdvogadoResult.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Cfoab.Integracao.Negocio.TO", name = "NumrDDDCom", scope = TOConsultaAdvogadoResult.class)
    public JAXBElement<String> createTOConsultaAdvogadoResultNumrDDDCom(String value) {
        return new JAXBElement<String>(_TOConsultaAdvogadoResultNumrDDDCom_QNAME, String.class, TOConsultaAdvogadoResult.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Cfoab.Integracao.Negocio.TO", name = "NumrDDDFaxCom", scope = TOConsultaAdvogadoResult.class)
    public JAXBElement<String> createTOConsultaAdvogadoResultNumrDDDFaxCom(String value) {
        return new JAXBElement<String>(_TOConsultaAdvogadoResultNumrDDDFaxCom_QNAME, String.class, TOConsultaAdvogadoResult.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Cfoab.Integracao.Negocio.TO", name = "NumrDDDFaxRes", scope = TOConsultaAdvogadoResult.class)
    public JAXBElement<String> createTOConsultaAdvogadoResultNumrDDDFaxRes(String value) {
        return new JAXBElement<String>(_TOConsultaAdvogadoResultNumrDDDFaxRes_QNAME, String.class, TOConsultaAdvogadoResult.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Cfoab.Integracao.Negocio.TO", name = "NumrDDDRes", scope = TOConsultaAdvogadoResult.class)
    public JAXBElement<String> createTOConsultaAdvogadoResultNumrDDDRes(String value) {
        return new JAXBElement<String>(_TOConsultaAdvogadoResultNumrDDDRes_QNAME, String.class, TOConsultaAdvogadoResult.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Cfoab.Integracao.Negocio.TO", name = "NumrEndeCom", scope = TOConsultaAdvogadoResult.class)
    public JAXBElement<String> createTOConsultaAdvogadoResultNumrEndeCom(String value) {
        return new JAXBElement<String>(_TOConsultaAdvogadoResultNumrEndeCom_QNAME, String.class, TOConsultaAdvogadoResult.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Cfoab.Integracao.Negocio.TO", name = "NumrEndeRes", scope = TOConsultaAdvogadoResult.class)
    public JAXBElement<String> createTOConsultaAdvogadoResultNumrEndeRes(String value) {
        return new JAXBElement<String>(_TOConsultaAdvogadoResultNumrEndeRes_QNAME, String.class, TOConsultaAdvogadoResult.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Cfoab.Integracao.Negocio.TO", name = "NumrSegu", scope = TOConsultaAdvogadoResult.class)
    public JAXBElement<String> createTOConsultaAdvogadoResultNumrSegu(String value) {
        return new JAXBElement<String>(_TOConsultaTransferenciaResultNumrSegu_QNAME, String.class, TOConsultaAdvogadoResult.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Cfoab.Integracao.Negocio.TO", name = "NumrTelfCelCom", scope = TOConsultaAdvogadoResult.class)
    public JAXBElement<String> createTOConsultaAdvogadoResultNumrTelfCelCom(String value) {
        return new JAXBElement<String>(_TOConsultaAdvogadoResultNumrTelfCelCom_QNAME, String.class, TOConsultaAdvogadoResult.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Cfoab.Integracao.Negocio.TO", name = "NumrTelfCelRes", scope = TOConsultaAdvogadoResult.class)
    public JAXBElement<String> createTOConsultaAdvogadoResultNumrTelfCelRes(String value) {
        return new JAXBElement<String>(_TOConsultaAdvogadoResultNumrTelfCelRes_QNAME, String.class, TOConsultaAdvogadoResult.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Cfoab.Integracao.Negocio.TO", name = "NumrTelfCom", scope = TOConsultaAdvogadoResult.class)
    public JAXBElement<String> createTOConsultaAdvogadoResultNumrTelfCom(String value) {
        return new JAXBElement<String>(_TOConsultaAdvogadoResultNumrTelfCom_QNAME, String.class, TOConsultaAdvogadoResult.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Cfoab.Integracao.Negocio.TO", name = "NumrTelfFaxCom", scope = TOConsultaAdvogadoResult.class)
    public JAXBElement<String> createTOConsultaAdvogadoResultNumrTelfFaxCom(String value) {
        return new JAXBElement<String>(_TOConsultaAdvogadoResultNumrTelfFaxCom_QNAME, String.class, TOConsultaAdvogadoResult.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Cfoab.Integracao.Negocio.TO", name = "NumrTelfFaxRes", scope = TOConsultaAdvogadoResult.class)
    public JAXBElement<String> createTOConsultaAdvogadoResultNumrTelfFaxRes(String value) {
        return new JAXBElement<String>(_TOConsultaAdvogadoResultNumrTelfFaxRes_QNAME, String.class, TOConsultaAdvogadoResult.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Cfoab.Integracao.Negocio.TO", name = "NumrTelfRes", scope = TOConsultaAdvogadoResult.class)
    public JAXBElement<String> createTOConsultaAdvogadoResultNumrTelfRes(String value) {
        return new JAXBElement<String>(_TOConsultaAdvogadoResultNumrTelfRes_QNAME, String.class, TOConsultaAdvogadoResult.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Cfoab.Integracao.Negocio.TO", name = "OrgaEmisRG", scope = TOConsultaAdvogadoResult.class)
    public JAXBElement<String> createTOConsultaAdvogadoResultOrgaEmisRG(String value) {
        return new JAXBElement<String>(_TOConsultaAdvogadoResultOrgaEmisRG_QNAME, String.class, TOConsultaAdvogadoResult.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Cfoab.Integracao.Negocio.TO", name = "Pass", scope = TOConsultaAdvogadoResult.class)
    public JAXBElement<String> createTOConsultaAdvogadoResultPass(String value) {
        return new JAXBElement<String>(_TOConsultaAdvogadoResultPass_QNAME, String.class, TOConsultaAdvogadoResult.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Cfoab.Integracao.Negocio.TO", name = "RG", scope = TOConsultaAdvogadoResult.class)
    public JAXBElement<String> createTOConsultaAdvogadoResultRG(String value) {
        return new JAXBElement<String>(_TOConsultaAdvogadoResultRG_QNAME, String.class, TOConsultaAdvogadoResult.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Cfoab.Integracao.Negocio.TO", name = "SecaElei", scope = TOConsultaAdvogadoResult.class)
    public JAXBElement<String> createTOConsultaAdvogadoResultSecaElei(String value) {
        return new JAXBElement<String>(_TOConsultaAdvogadoResultSecaElei_QNAME, String.class, TOConsultaAdvogadoResult.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Cfoab.Integracao.Negocio.TO", name = "Sexo", scope = TOConsultaAdvogadoResult.class)
    public JAXBElement<String> createTOConsultaAdvogadoResultSexo(String value) {
        return new JAXBElement<String>(_TOConsultaAdvogadoResultSexo_QNAME, String.class, TOConsultaAdvogadoResult.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Cfoab.Integracao.Negocio.TO", name = "SiglUFCom", scope = TOConsultaAdvogadoResult.class)
    public JAXBElement<String> createTOConsultaAdvogadoResultSiglUFCom(String value) {
        return new JAXBElement<String>(_TOConsultaAdvogadoResultSiglUFCom_QNAME, String.class, TOConsultaAdvogadoResult.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Cfoab.Integracao.Negocio.TO", name = "SiglUFElei", scope = TOConsultaAdvogadoResult.class)
    public JAXBElement<String> createTOConsultaAdvogadoResultSiglUFElei(String value) {
        return new JAXBElement<String>(_TOConsultaAdvogadoResultSiglUFElei_QNAME, String.class, TOConsultaAdvogadoResult.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Cfoab.Integracao.Negocio.TO", name = "SiglUFNasc", scope = TOConsultaAdvogadoResult.class)
    public JAXBElement<String> createTOConsultaAdvogadoResultSiglUFNasc(String value) {
        return new JAXBElement<String>(_TOConsultaAdvogadoResultSiglUFNasc_QNAME, String.class, TOConsultaAdvogadoResult.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Cfoab.Integracao.Negocio.TO", name = "SiglUFRes", scope = TOConsultaAdvogadoResult.class)
    public JAXBElement<String> createTOConsultaAdvogadoResultSiglUFRes(String value) {
        return new JAXBElement<String>(_TOConsultaAdvogadoResultSiglUFRes_QNAME, String.class, TOConsultaAdvogadoResult.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Cfoab.Integracao.Negocio.TO", name = "TipoDoad", scope = TOConsultaAdvogadoResult.class)
    public JAXBElement<String> createTOConsultaAdvogadoResultTipoDoad(String value) {
        return new JAXBElement<String>(_TOConsultaAdvogadoResultTipoDoad_QNAME, String.class, TOConsultaAdvogadoResult.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Cfoab.Integracao.Negocio.TO", name = "TitlElei", scope = TOConsultaAdvogadoResult.class)
    public JAXBElement<String> createTOConsultaAdvogadoResultTitlElei(String value) {
        return new JAXBElement<String>(_TOConsultaAdvogadoResultTitlElei_QNAME, String.class, TOConsultaAdvogadoResult.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Short }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Short }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Cfoab.Integracao.Negocio.TO", name = "ViaCart", scope = TOConsultaAdvogadoResult.class)
    public JAXBElement<Short> createTOConsultaAdvogadoResultViaCart(Short value) {
        return new JAXBElement<Short>(_TOConsultaAdvogadoResultViaCart_QNAME, Short.class, TOConsultaAdvogadoResult.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Short }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Short }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Cfoab.Integracao.Negocio.TO", name = "ViaCrte", scope = TOConsultaAdvogadoResult.class)
    public JAXBElement<Short> createTOConsultaAdvogadoResultViaCrte(Short value) {
        return new JAXBElement<Short>(_TOConsultaAdvogadoResultViaCrte_QNAME, Short.class, TOConsultaAdvogadoResult.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Cfoab.Integracao.Negocio.TO", name = "ZonaElei", scope = TOConsultaAdvogadoResult.class)
    public JAXBElement<String> createTOConsultaAdvogadoResultZonaElei(String value) {
        return new JAXBElement<String>(_TOConsultaAdvogadoResultZonaElei_QNAME, String.class, TOConsultaAdvogadoResult.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Cfoab.Integracao.Negocio.TO", name = "CPF", scope = TOImpedimentoAdvogado.class)
    public JAXBElement<String> createTOImpedimentoAdvogadoCPF(String value) {
        return new JAXBElement<String>(_TOImpedimentoAdvogadoCPF_QNAME, String.class, TOImpedimentoAdvogado.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfTOImpedimento }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ArrayOfTOImpedimento }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Cfoab.Integracao.Negocio.TO", name = "Impedimentos", scope = TOImpedimentoAdvogado.class)
    public JAXBElement<ArrayOfTOImpedimento> createTOImpedimentoAdvogadoImpedimentos(ArrayOfTOImpedimento value) {
        return new JAXBElement<ArrayOfTOImpedimento>(_TOImpedimentoAdvogadoImpedimentos_QNAME, ArrayOfTOImpedimento.class, TOImpedimentoAdvogado.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Cfoab.Integracao.Negocio.TO", name = "Uf", scope = TOImpedimentoAdvogado.class)
    public JAXBElement<String> createTOImpedimentoAdvogadoUf(String value) {
        return new JAXBElement<String>(_TOConsultaPedidoUf_QNAME, String.class, TOImpedimentoAdvogado.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Cfoab.Integracao.Negocio.TO", name = "BitTrocaBiometrico", scope = TOEnviaPedido.class)
    public JAXBElement<Boolean> createTOEnviaPedidoBitTrocaBiometrico(Boolean value) {
        return new JAXBElement<Boolean>(_TOEnviaPedidoBitTrocaBiometrico_QNAME, Boolean.class, TOEnviaPedido.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Cfoab.Integracao.Negocio.TO", name = "CPF", scope = TOEnviaPedido.class)
    public JAXBElement<String> createTOEnviaPedidoCPF(String value) {
        return new JAXBElement<String>(_TOImpedimentoAdvogadoCPF_QNAME, String.class, TOEnviaPedido.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Cfoab.Integracao.Negocio.TO", name = "CodigoPedido", scope = TOEnviaPedido.class)
    public JAXBElement<Integer> createTOEnviaPedidoCodigoPedido(Integer value) {
        return new JAXBElement<Integer>(_TOEnviaPedidoCodigoPedido_QNAME, Integer.class, TOEnviaPedido.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Cfoab.Integracao.Negocio.TO", name = "CodigoTipoDocumento", scope = TOEnviaPedido.class)
    public JAXBElement<Integer> createTOEnviaPedidoCodigoTipoDocumento(Integer value) {
        return new JAXBElement<Integer>(_TOEnviaPedidoCodigoTipoDocumento_QNAME, Integer.class, TOEnviaPedido.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Cfoab.Integracao.Negocio.TO", name = "NumeroPedido", scope = TOEnviaPedido.class)
    public JAXBElement<String> createTOEnviaPedidoNumeroPedido(String value) {
        return new JAXBElement<String>(_TOEnviaPedidoNumeroPedido_QNAME, String.class, TOEnviaPedido.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Cfoab.Integracao.Negocio.TO", name = "NumeroPedidoPai", scope = TOEnviaPedido.class)
    public JAXBElement<String> createTOEnviaPedidoNumeroPedidoPai(String value) {
        return new JAXBElement<String>(_TOEnviaPedidoNumeroPedidoPai_QNAME, String.class, TOEnviaPedido.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Cfoab.Integracao.Negocio.TO", name = "Organizacao", scope = TOEnviaPedido.class)
    public JAXBElement<Integer> createTOEnviaPedidoOrganizacao(Integer value) {
        return new JAXBElement<Integer>(_TOEnviaPedidoOrganizacao_QNAME, Integer.class, TOEnviaPedido.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Cfoab.Integracao.Negocio.TO", name = "TextBrai1", scope = TOEnviaPedido.class)
    public JAXBElement<String> createTOEnviaPedidoTextBrai1(String value) {
        return new JAXBElement<String>(_TOEnviaPedidoTextBrai1_QNAME, String.class, TOEnviaPedido.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Cfoab.Integracao.Negocio.TO", name = "TextBrai2", scope = TOEnviaPedido.class)
    public JAXBElement<String> createTOEnviaPedidoTextBrai2(String value) {
        return new JAXBElement<String>(_TOEnviaPedidoTextBrai2_QNAME, String.class, TOEnviaPedido.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Cfoab.Integracao.Negocio.TO", name = "TextBrai3", scope = TOEnviaPedido.class)
    public JAXBElement<String> createTOEnviaPedidoTextBrai3(String value) {
        return new JAXBElement<String>(_TOEnviaPedidoTextBrai3_QNAME, String.class, TOEnviaPedido.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Cfoab.Integracao.Negocio.TO", name = "TextBrai4", scope = TOEnviaPedido.class)
    public JAXBElement<String> createTOEnviaPedidoTextBrai4(String value) {
        return new JAXBElement<String>(_TOEnviaPedidoTextBrai4_QNAME, String.class, TOEnviaPedido.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Cfoab.Integracao.Negocio.TO", name = "Token", scope = TOEnviaPedido.class)
    public JAXBElement<String> createTOEnviaPedidoToken(String value) {
        return new JAXBElement<String>(_TOEnviaPedidoToken_QNAME, String.class, TOEnviaPedido.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Cfoab.Integracao.Negocio.TO", name = "BairCom", scope = TOEnviaAdvogado.class)
    public JAXBElement<String> createTOEnviaAdvogadoBairCom(String value) {
        return new JAXBElement<String>(_TOConsultaAdvogadoResultBairCom_QNAME, String.class, TOEnviaAdvogado.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Cfoab.Integracao.Negocio.TO", name = "BairRes", scope = TOEnviaAdvogado.class)
    public JAXBElement<String> createTOEnviaAdvogadoBairRes(String value) {
        return new JAXBElement<String>(_TOConsultaAdvogadoResultBairRes_QNAME, String.class, TOEnviaAdvogado.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Cfoab.Integracao.Negocio.TO", name = "BitDivuEndeCom", scope = TOEnviaAdvogado.class)
    public JAXBElement<Boolean> createTOEnviaAdvogadoBitDivuEndeCom(Boolean value) {
        return new JAXBElement<Boolean>(_TOConsultaAdvogadoResultBitDivuEndeCom_QNAME, Boolean.class, TOEnviaAdvogado.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Cfoab.Integracao.Negocio.TO", name = "BitDivuEndeRes", scope = TOEnviaAdvogado.class)
    public JAXBElement<Boolean> createTOEnviaAdvogadoBitDivuEndeRes(Boolean value) {
        return new JAXBElement<Boolean>(_TOConsultaAdvogadoResultBitDivuEndeRes_QNAME, Boolean.class, TOEnviaAdvogado.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Cfoab.Integracao.Negocio.TO", name = "BitDivuTelfCom", scope = TOEnviaAdvogado.class)
    public JAXBElement<Boolean> createTOEnviaAdvogadoBitDivuTelfCom(Boolean value) {
        return new JAXBElement<Boolean>(_TOConsultaAdvogadoResultBitDivuTelfCom_QNAME, Boolean.class, TOEnviaAdvogado.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Cfoab.Integracao.Negocio.TO", name = "BitDivuTelfRes", scope = TOEnviaAdvogado.class)
    public JAXBElement<Boolean> createTOEnviaAdvogadoBitDivuTelfRes(Boolean value) {
        return new JAXBElement<Boolean>(_TOConsultaAdvogadoResultBitDivuTelfRes_QNAME, Boolean.class, TOEnviaAdvogado.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Cfoab.Integracao.Negocio.TO", name = "BitEnviEmalCom", scope = TOEnviaAdvogado.class)
    public JAXBElement<Boolean> createTOEnviaAdvogadoBitEnviEmalCom(Boolean value) {
        return new JAXBElement<Boolean>(_TOConsultaAdvogadoResultBitEnviEmalCom_QNAME, Boolean.class, TOEnviaAdvogado.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Cfoab.Integracao.Negocio.TO", name = "BitEnviEmalRes", scope = TOEnviaAdvogado.class)
    public JAXBElement<Boolean> createTOEnviaAdvogadoBitEnviEmalRes(Boolean value) {
        return new JAXBElement<Boolean>(_TOConsultaAdvogadoResultBitEnviEmalRes_QNAME, Boolean.class, TOEnviaAdvogado.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Cfoab.Integracao.Negocio.TO", name = "BitPublCada", scope = TOEnviaAdvogado.class)
    public JAXBElement<Boolean> createTOEnviaAdvogadoBitPublCada(Boolean value) {
        return new JAXBElement<Boolean>(_TOConsultaAdvogadoResultBitPublCada_QNAME, Boolean.class, TOEnviaAdvogado.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Cfoab.Integracao.Negocio.TO", name = "BitPublFoto", scope = TOEnviaAdvogado.class)
    public JAXBElement<Boolean> createTOEnviaAdvogadoBitPublFoto(Boolean value) {
        return new JAXBElement<Boolean>(_TOConsultaAdvogadoResultBitPublFoto_QNAME, Boolean.class, TOEnviaAdvogado.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Cfoab.Integracao.Negocio.TO", name = "CPF", scope = TOEnviaAdvogado.class)
    public JAXBElement<String> createTOEnviaAdvogadoCPF(String value) {
        return new JAXBElement<String>(_TOImpedimentoAdvogadoCPF_QNAME, String.class, TOEnviaAdvogado.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Cfoab.Integracao.Negocio.TO", name = "CertMilt", scope = TOEnviaAdvogado.class)
    public JAXBElement<String> createTOEnviaAdvogadoCertMilt(String value) {
        return new JAXBElement<String>(_TOConsultaAdvogadoResultCertMilt_QNAME, String.class, TOEnviaAdvogado.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Cfoab.Integracao.Negocio.TO", name = "CodiCiddCom", scope = TOEnviaAdvogado.class)
    public JAXBElement<Integer> createTOEnviaAdvogadoCodiCiddCom(Integer value) {
        return new JAXBElement<Integer>(_TOConsultaAdvogadoResultCodiCiddCom_QNAME, Integer.class, TOEnviaAdvogado.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Cfoab.Integracao.Negocio.TO", name = "CodiCiddEleit", scope = TOEnviaAdvogado.class)
    public JAXBElement<Integer> createTOEnviaAdvogadoCodiCiddEleit(Integer value) {
        return new JAXBElement<Integer>(_TOEnviaAdvogadoCodiCiddEleit_QNAME, Integer.class, TOEnviaAdvogado.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Cfoab.Integracao.Negocio.TO", name = "CodiCiddNasc", scope = TOEnviaAdvogado.class)
    public JAXBElement<Integer> createTOEnviaAdvogadoCodiCiddNasc(Integer value) {
        return new JAXBElement<Integer>(_TOConsultaAdvogadoResultCodiCiddNasc_QNAME, Integer.class, TOEnviaAdvogado.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Cfoab.Integracao.Negocio.TO", name = "CodiCiddRes", scope = TOEnviaAdvogado.class)
    public JAXBElement<Integer> createTOEnviaAdvogadoCodiCiddRes(Integer value) {
        return new JAXBElement<Integer>(_TOConsultaAdvogadoResultCodiCiddRes_QNAME, Integer.class, TOEnviaAdvogado.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Cfoab.Integracao.Negocio.TO", name = "CodiDefc", scope = TOEnviaAdvogado.class)
    public JAXBElement<Integer> createTOEnviaAdvogadoCodiDefc(Integer value) {
        return new JAXBElement<Integer>(_TOConsultaAdvogadoResultCodiDefc_QNAME, Integer.class, TOEnviaAdvogado.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Cfoab.Integracao.Negocio.TO", name = "CodiPaisConsEstr", scope = TOEnviaAdvogado.class)
    public JAXBElement<Integer> createTOEnviaAdvogadoCodiPaisConsEstr(Integer value) {
        return new JAXBElement<Integer>(_TOEnviaAdvogadoCodiPaisConsEstr_QNAME, Integer.class, TOEnviaAdvogado.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Short }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Short }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Cfoab.Integracao.Negocio.TO", name = "CodiRacaCor", scope = TOEnviaAdvogado.class)
    public JAXBElement<Short> createTOEnviaAdvogadoCodiRacaCor(Short value) {
        return new JAXBElement<Short>(_TOConsultaAdvogadoResultCodiRacaCor_QNAME, Short.class, TOEnviaAdvogado.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Cfoab.Integracao.Negocio.TO", name = "CodiStatAdvo", scope = TOEnviaAdvogado.class)
    public JAXBElement<Integer> createTOEnviaAdvogadoCodiStatAdvo(Integer value) {
        return new JAXBElement<Integer>(_TOConsultaAdvogadoResultCodiStatAdvo_QNAME, Integer.class, TOEnviaAdvogado.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Cfoab.Integracao.Negocio.TO", name = "CodiStatFina", scope = TOEnviaAdvogado.class)
    public JAXBElement<Integer> createTOEnviaAdvogadoCodiStatFina(Integer value) {
        return new JAXBElement<Integer>(_TOEnviaAdvogadoCodiStatFina_QNAME, Integer.class, TOEnviaAdvogado.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Cfoab.Integracao.Negocio.TO", name = "CompCom", scope = TOEnviaAdvogado.class)
    public JAXBElement<String> createTOEnviaAdvogadoCompCom(String value) {
        return new JAXBElement<String>(_TOConsultaAdvogadoResultCompCom_QNAME, String.class, TOEnviaAdvogado.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Cfoab.Integracao.Negocio.TO", name = "CompRes", scope = TOEnviaAdvogado.class)
    public JAXBElement<String> createTOEnviaAdvogadoCompRes(String value) {
        return new JAXBElement<String>(_TOConsultaAdvogadoResultCompRes_QNAME, String.class, TOEnviaAdvogado.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Cfoab.Integracao.Negocio.TO", name = "DDDCelularRes", scope = TOEnviaAdvogado.class)
    public JAXBElement<String> createTOEnviaAdvogadoDDDCelularRes(String value) {
        return new JAXBElement<String>(_TOEnviaAdvogadoDDDCelularRes_QNAME, String.class, TOEnviaAdvogado.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Cfoab.Integracao.Negocio.TO", name = "DataCola", scope = TOEnviaAdvogado.class)
    public JAXBElement<XMLGregorianCalendar> createTOEnviaAdvogadoDataCola(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_TOConsultaAdvogadoResultDataCola_QNAME, XMLGregorianCalendar.class, TOEnviaAdvogado.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Cfoab.Integracao.Negocio.TO", name = "DataCpro", scope = TOEnviaAdvogado.class)
    public JAXBElement<XMLGregorianCalendar> createTOEnviaAdvogadoDataCpro(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_TOConsultaAdvogadoResultDataCpro_QNAME, XMLGregorianCalendar.class, TOEnviaAdvogado.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Cfoab.Integracao.Negocio.TO", name = "DataEmisRG", scope = TOEnviaAdvogado.class)
    public JAXBElement<XMLGregorianCalendar> createTOEnviaAdvogadoDataEmisRG(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_TOConsultaAdvogadoResultDataEmisRG_QNAME, XMLGregorianCalendar.class, TOEnviaAdvogado.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Cfoab.Integracao.Negocio.TO", name = "DataNasc", scope = TOEnviaAdvogado.class)
    public JAXBElement<XMLGregorianCalendar> createTOEnviaAdvogadoDataNasc(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_TOConsultaAdvogadoResultDataNasc_QNAME, XMLGregorianCalendar.class, TOEnviaAdvogado.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Cfoab.Integracao.Negocio.TO", name = "DataStatFina", scope = TOEnviaAdvogado.class)
    public JAXBElement<XMLGregorianCalendar> createTOEnviaAdvogadoDataStatFina(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_TOEnviaAdvogadoDataStatFina_QNAME, XMLGregorianCalendar.class, TOEnviaAdvogado.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Cfoab.Integracao.Negocio.TO", name = "DataValidade", scope = TOEnviaAdvogado.class)
    public JAXBElement<XMLGregorianCalendar> createTOEnviaAdvogadoDataValidade(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_TOEnviaAdvogadoDataValidade_QNAME, XMLGregorianCalendar.class, TOEnviaAdvogado.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Cfoab.Integracao.Negocio.TO", name = "EmailCom", scope = TOEnviaAdvogado.class)
    public JAXBElement<String> createTOEnviaAdvogadoEmailCom(String value) {
        return new JAXBElement<String>(_TOConsultaAdvogadoResultEmailCom_QNAME, String.class, TOEnviaAdvogado.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Cfoab.Integracao.Negocio.TO", name = "EmailRes", scope = TOEnviaAdvogado.class)
    public JAXBElement<String> createTOEnviaAdvogadoEmailRes(String value) {
        return new JAXBElement<String>(_TOConsultaAdvogadoResultEmailRes_QNAME, String.class, TOEnviaAdvogado.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Cfoab.Integracao.Negocio.TO", name = "ExpeMilt", scope = TOEnviaAdvogado.class)
    public JAXBElement<String> createTOEnviaAdvogadoExpeMilt(String value) {
        return new JAXBElement<String>(_TOConsultaAdvogadoResultExpeMilt_QNAME, String.class, TOEnviaAdvogado.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Cfoab.Integracao.Negocio.TO", name = "IdenEstdCivl", scope = TOEnviaAdvogado.class)
    public JAXBElement<Integer> createTOEnviaAdvogadoIdenEstdCivl(Integer value) {
        return new JAXBElement<Integer>(_TOConsultaAdvogadoResultIdenEstdCivl_QNAME, Integer.class, TOEnviaAdvogado.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Cfoab.Integracao.Negocio.TO", name = "IdenOgan", scope = TOEnviaAdvogado.class)
    public JAXBElement<Integer> createTOEnviaAdvogadoIdenOgan(Integer value) {
        return new JAXBElement<Integer>(_TOConsultaAdvogadoResultIdenOgan_QNAME, Integer.class, TOEnviaAdvogado.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Cfoab.Integracao.Negocio.TO", name = "IdtFacu", scope = TOEnviaAdvogado.class)
    public JAXBElement<Integer> createTOEnviaAdvogadoIdtFacu(Integer value) {
        return new JAXBElement<Integer>(_TOConsultaAdvogadoResultIdtFacu_QNAME, Integer.class, TOEnviaAdvogado.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Cfoab.Integracao.Negocio.TO", name = "IdtTipoDoad", scope = TOEnviaAdvogado.class)
    public JAXBElement<Integer> createTOEnviaAdvogadoIdtTipoDoad(Integer value) {
        return new JAXBElement<Integer>(_TOConsultaAdvogadoResultIdtTipoDoad_QNAME, Integer.class, TOEnviaAdvogado.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Cfoab.Integracao.Negocio.TO", name = "IdtTipoInscOab", scope = TOEnviaAdvogado.class)
    public JAXBElement<Integer> createTOEnviaAdvogadoIdtTipoInscOab(Integer value) {
        return new JAXBElement<Integer>(_TOConsultaAdvogadoResultIdtTipoInscOab_QNAME, Integer.class, TOEnviaAdvogado.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Cfoab.Integracao.Negocio.TO", name = "Impedimentos", scope = TOEnviaAdvogado.class)
    public JAXBElement<String> createTOEnviaAdvogadoImpedimentos(String value) {
        return new JAXBElement<String>(_TOImpedimentoAdvogadoImpedimentos_QNAME, String.class, TOEnviaAdvogado.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Cfoab.Integracao.Negocio.TO", name = "Insc", scope = TOEnviaAdvogado.class)
    public JAXBElement<String> createTOEnviaAdvogadoInsc(String value) {
        return new JAXBElement<String>(_TOConsultaAdvogadoResultInsc_QNAME, String.class, TOEnviaAdvogado.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Cfoab.Integracao.Negocio.TO", name = "LogrCom", scope = TOEnviaAdvogado.class)
    public JAXBElement<String> createTOEnviaAdvogadoLogrCom(String value) {
        return new JAXBElement<String>(_TOConsultaAdvogadoResultLogrCom_QNAME, String.class, TOEnviaAdvogado.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Cfoab.Integracao.Negocio.TO", name = "LogrRes", scope = TOEnviaAdvogado.class)
    public JAXBElement<String> createTOEnviaAdvogadoLogrRes(String value) {
        return new JAXBElement<String>(_TOConsultaAdvogadoResultLogrRes_QNAME, String.class, TOEnviaAdvogado.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Cfoab.Integracao.Negocio.TO", name = "Nacionalidade", scope = TOEnviaAdvogado.class)
    public JAXBElement<String> createTOEnviaAdvogadoNacionalidade(String value) {
        return new JAXBElement<String>(_TOEnviaAdvogadoNacionalidade_QNAME, String.class, TOEnviaAdvogado.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Cfoab.Integracao.Negocio.TO", name = "NomeAdvo", scope = TOEnviaAdvogado.class)
    public JAXBElement<String> createTOEnviaAdvogadoNomeAdvo(String value) {
        return new JAXBElement<String>(_TOConsultaTransferenciaResultNomeAdvo_QNAME, String.class, TOEnviaAdvogado.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Cfoab.Integracao.Negocio.TO", name = "NomeMae2Advo", scope = TOEnviaAdvogado.class)
    public JAXBElement<String> createTOEnviaAdvogadoNomeMae2Advo(String value) {
        return new JAXBElement<String>(_TOConsultaAdvogadoResultNomeMae2Advo_QNAME, String.class, TOEnviaAdvogado.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Cfoab.Integracao.Negocio.TO", name = "NomeMaeAdvo", scope = TOEnviaAdvogado.class)
    public JAXBElement<String> createTOEnviaAdvogadoNomeMaeAdvo(String value) {
        return new JAXBElement<String>(_TOConsultaAdvogadoResultNomeMaeAdvo_QNAME, String.class, TOEnviaAdvogado.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Cfoab.Integracao.Negocio.TO", name = "NomePai2Advo", scope = TOEnviaAdvogado.class)
    public JAXBElement<String> createTOEnviaAdvogadoNomePai2Advo(String value) {
        return new JAXBElement<String>(_TOConsultaAdvogadoResultNomePai2Advo_QNAME, String.class, TOEnviaAdvogado.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Cfoab.Integracao.Negocio.TO", name = "NomePaiAdvo", scope = TOEnviaAdvogado.class)
    public JAXBElement<String> createTOEnviaAdvogadoNomePaiAdvo(String value) {
        return new JAXBElement<String>(_TOConsultaAdvogadoResultNomePaiAdvo_QNAME, String.class, TOEnviaAdvogado.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Cfoab.Integracao.Negocio.TO", name = "NomeProf", scope = TOEnviaAdvogado.class)
    public JAXBElement<String> createTOEnviaAdvogadoNomeProf(String value) {
        return new JAXBElement<String>(_TOConsultaAdvogadoResultNomeProf_QNAME, String.class, TOEnviaAdvogado.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Cfoab.Integracao.Negocio.TO", name = "NomeSoci", scope = TOEnviaAdvogado.class)
    public JAXBElement<String> createTOEnviaAdvogadoNomeSoci(String value) {
        return new JAXBElement<String>(_TOConsultaAdvogadoResultNomeSoci_QNAME, String.class, TOEnviaAdvogado.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Cfoab.Integracao.Negocio.TO", name = "NumeroEnderecoRes", scope = TOEnviaAdvogado.class)
    public JAXBElement<String> createTOEnviaAdvogadoNumeroEnderecoRes(String value) {
        return new JAXBElement<String>(_TOEnviaAdvogadoNumeroEnderecoRes_QNAME, String.class, TOEnviaAdvogado.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Cfoab.Integracao.Negocio.TO", name = "NumrCepCom", scope = TOEnviaAdvogado.class)
    public JAXBElement<String> createTOEnviaAdvogadoNumrCepCom(String value) {
        return new JAXBElement<String>(_TOConsultaAdvogadoResultNumrCepCom_QNAME, String.class, TOEnviaAdvogado.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Cfoab.Integracao.Negocio.TO", name = "NumrCepRes", scope = TOEnviaAdvogado.class)
    public JAXBElement<String> createTOEnviaAdvogadoNumrCepRes(String value) {
        return new JAXBElement<String>(_TOConsultaAdvogadoResultNumrCepRes_QNAME, String.class, TOEnviaAdvogado.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Cfoab.Integracao.Negocio.TO", name = "NumrDDDCelCom", scope = TOEnviaAdvogado.class)
    public JAXBElement<String> createTOEnviaAdvogadoNumrDDDCelCom(String value) {
        return new JAXBElement<String>(_TOConsultaAdvogadoResultNumrDDDCelCom_QNAME, String.class, TOEnviaAdvogado.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Cfoab.Integracao.Negocio.TO", name = "NumrDDDCom", scope = TOEnviaAdvogado.class)
    public JAXBElement<String> createTOEnviaAdvogadoNumrDDDCom(String value) {
        return new JAXBElement<String>(_TOConsultaAdvogadoResultNumrDDDCom_QNAME, String.class, TOEnviaAdvogado.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Cfoab.Integracao.Negocio.TO", name = "NumrDDDFaxCom", scope = TOEnviaAdvogado.class)
    public JAXBElement<String> createTOEnviaAdvogadoNumrDDDFaxCom(String value) {
        return new JAXBElement<String>(_TOConsultaAdvogadoResultNumrDDDFaxCom_QNAME, String.class, TOEnviaAdvogado.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Cfoab.Integracao.Negocio.TO", name = "NumrDDDFaxRes", scope = TOEnviaAdvogado.class)
    public JAXBElement<String> createTOEnviaAdvogadoNumrDDDFaxRes(String value) {
        return new JAXBElement<String>(_TOConsultaAdvogadoResultNumrDDDFaxRes_QNAME, String.class, TOEnviaAdvogado.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Cfoab.Integracao.Negocio.TO", name = "NumrDDDRes", scope = TOEnviaAdvogado.class)
    public JAXBElement<String> createTOEnviaAdvogadoNumrDDDRes(String value) {
        return new JAXBElement<String>(_TOConsultaAdvogadoResultNumrDDDRes_QNAME, String.class, TOEnviaAdvogado.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Cfoab.Integracao.Negocio.TO", name = "NumrEndeCom", scope = TOEnviaAdvogado.class)
    public JAXBElement<String> createTOEnviaAdvogadoNumrEndeCom(String value) {
        return new JAXBElement<String>(_TOConsultaAdvogadoResultNumrEndeCom_QNAME, String.class, TOEnviaAdvogado.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Cfoab.Integracao.Negocio.TO", name = "NumrTelfCelCom", scope = TOEnviaAdvogado.class)
    public JAXBElement<String> createTOEnviaAdvogadoNumrTelfCelCom(String value) {
        return new JAXBElement<String>(_TOConsultaAdvogadoResultNumrTelfCelCom_QNAME, String.class, TOEnviaAdvogado.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Cfoab.Integracao.Negocio.TO", name = "NumrTelfCelRes", scope = TOEnviaAdvogado.class)
    public JAXBElement<String> createTOEnviaAdvogadoNumrTelfCelRes(String value) {
        return new JAXBElement<String>(_TOConsultaAdvogadoResultNumrTelfCelRes_QNAME, String.class, TOEnviaAdvogado.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Cfoab.Integracao.Negocio.TO", name = "NumrTelfCom", scope = TOEnviaAdvogado.class)
    public JAXBElement<String> createTOEnviaAdvogadoNumrTelfCom(String value) {
        return new JAXBElement<String>(_TOConsultaAdvogadoResultNumrTelfCom_QNAME, String.class, TOEnviaAdvogado.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Cfoab.Integracao.Negocio.TO", name = "NumrTelfFaxCom", scope = TOEnviaAdvogado.class)
    public JAXBElement<String> createTOEnviaAdvogadoNumrTelfFaxCom(String value) {
        return new JAXBElement<String>(_TOConsultaAdvogadoResultNumrTelfFaxCom_QNAME, String.class, TOEnviaAdvogado.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Cfoab.Integracao.Negocio.TO", name = "NumrTelfFaxRes", scope = TOEnviaAdvogado.class)
    public JAXBElement<String> createTOEnviaAdvogadoNumrTelfFaxRes(String value) {
        return new JAXBElement<String>(_TOConsultaAdvogadoResultNumrTelfFaxRes_QNAME, String.class, TOEnviaAdvogado.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Cfoab.Integracao.Negocio.TO", name = "NumrTelfRes", scope = TOEnviaAdvogado.class)
    public JAXBElement<String> createTOEnviaAdvogadoNumrTelfRes(String value) {
        return new JAXBElement<String>(_TOConsultaAdvogadoResultNumrTelfRes_QNAME, String.class, TOEnviaAdvogado.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Cfoab.Integracao.Negocio.TO", name = "OrgaEmisRG", scope = TOEnviaAdvogado.class)
    public JAXBElement<String> createTOEnviaAdvogadoOrgaEmisRG(String value) {
        return new JAXBElement<String>(_TOConsultaAdvogadoResultOrgaEmisRG_QNAME, String.class, TOEnviaAdvogado.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Cfoab.Integracao.Negocio.TO", name = "Pass", scope = TOEnviaAdvogado.class)
    public JAXBElement<String> createTOEnviaAdvogadoPass(String value) {
        return new JAXBElement<String>(_TOConsultaAdvogadoResultPass_QNAME, String.class, TOEnviaAdvogado.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Cfoab.Integracao.Negocio.TO", name = "RG", scope = TOEnviaAdvogado.class)
    public JAXBElement<String> createTOEnviaAdvogadoRG(String value) {
        return new JAXBElement<String>(_TOConsultaAdvogadoResultRG_QNAME, String.class, TOEnviaAdvogado.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Cfoab.Integracao.Negocio.TO", name = "SecaoEleitoral", scope = TOEnviaAdvogado.class)
    public JAXBElement<String> createTOEnviaAdvogadoSecaoEleitoral(String value) {
        return new JAXBElement<String>(_TOEnviaAdvogadoSecaoEleitoral_QNAME, String.class, TOEnviaAdvogado.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Cfoab.Integracao.Negocio.TO", name = "Sexo", scope = TOEnviaAdvogado.class)
    public JAXBElement<String> createTOEnviaAdvogadoSexo(String value) {
        return new JAXBElement<String>(_TOConsultaAdvogadoResultSexo_QNAME, String.class, TOEnviaAdvogado.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Cfoab.Integracao.Negocio.TO", name = "TitlElei", scope = TOEnviaAdvogado.class)
    public JAXBElement<String> createTOEnviaAdvogadoTitlElei(String value) {
        return new JAXBElement<String>(_TOConsultaAdvogadoResultTitlElei_QNAME, String.class, TOEnviaAdvogado.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Cfoab.Integracao.Negocio.TO", name = "Token", scope = TOEnviaAdvogado.class)
    public JAXBElement<String> createTOEnviaAdvogadoToken(String value) {
        return new JAXBElement<String>(_TOEnviaPedidoToken_QNAME, String.class, TOEnviaAdvogado.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Cfoab.Integracao.Negocio.TO", name = "ViaCart", scope = TOEnviaAdvogado.class)
    public JAXBElement<Integer> createTOEnviaAdvogadoViaCart(Integer value) {
        return new JAXBElement<Integer>(_TOConsultaAdvogadoResultViaCart_QNAME, Integer.class, TOEnviaAdvogado.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Cfoab.Integracao.Negocio.TO", name = "ViaCrte", scope = TOEnviaAdvogado.class)
    public JAXBElement<Integer> createTOEnviaAdvogadoViaCrte(Integer value) {
        return new JAXBElement<Integer>(_TOConsultaAdvogadoResultViaCrte_QNAME, Integer.class, TOEnviaAdvogado.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Cfoab.Integracao.Negocio.TO", name = "ZonaElei", scope = TOEnviaAdvogado.class)
    public JAXBElement<String> createTOEnviaAdvogadoZonaElei(String value) {
        return new JAXBElement<String>(_TOConsultaAdvogadoResultZonaElei_QNAME, String.class, TOEnviaAdvogado.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Cfoab.Integracao.Negocio.TO", name = "CPF", scope = TOBiometricoAdvogado.class)
    public JAXBElement<String> createTOBiometricoAdvogadoCPF(String value) {
        return new JAXBElement<String>(_TOImpedimentoAdvogadoCPF_QNAME, String.class, TOBiometricoAdvogado.class, value);
    }

}
