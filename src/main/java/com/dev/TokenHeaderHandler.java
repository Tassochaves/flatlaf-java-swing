package com.dev;
import java.util.Set;

import javax.xml.namespace.QName;

import jakarta.xml.soap.Name;
import jakarta.xml.soap.SOAPEnvelope;
import jakarta.xml.soap.SOAPHeader;
import jakarta.xml.soap.SOAPHeaderElement;
import jakarta.xml.ws.handler.MessageContext;
import jakarta.xml.ws.handler.soap.SOAPHandler;
import jakarta.xml.ws.handler.soap.SOAPMessageContext;

public class TokenHeaderHandler implements SOAPHandler<SOAPMessageContext>{
    private final String token;

    public TokenHeaderHandler(String token) {
        this.token = token;
    }

    @Override
    public boolean handleMessage(SOAPMessageContext context) {
         Boolean isOutbound = (Boolean) context.get(MessageContext.MESSAGE_OUTBOUND_PROPERTY);
        System.out.println("[SOAP HANDLER] Adicionando header com token...");
         if (isOutbound) {
            try {
                SOAPEnvelope envelope = context.getMessage().getSOAPPart().getEnvelope();
                SOAPHeader header = envelope.getHeader();

                //adiciona o Token no Header
                Name headerName = envelope.createName("token", "", "http://CFOAB.Integracao");
                SOAPHeaderElement tokenElement = header.addHeaderElement(headerName);
                tokenElement.addTextNode(token);

                //adiciona o WS-Addressing To no Header
                QName wsaToQName = new QName("http://www.w3.org/2005/08/addressing", "To", "wsa");
                SOAPHeaderElement wsaToElement = header.addHeaderElement(wsaToQName);
                wsaToElement.addTextNode("https://www5.oab.org.br/IntegracaoWS/Identidade.svc");
                
                context.getMessage().saveChanges();
            } catch (Exception e) {
                throw new RuntimeException("Erro ao adicionar token SOAP header", e);
            }
        }
        return true;
    }

    @Override
    public boolean handleFault(SOAPMessageContext context) { return true; }

    @Override
    public void close(MessageContext context) {}

    @Override
    public Set<QName> getHeaders() { return null; }
}
