package com.dev;
import java.io.IOException;
import java.net.URISyntaxException;
import javax.xml.parsers.ParserConfigurationException;
import org.xml.sax.SAXException;

import java.util.List;
import jakarta.xml.ws.BindingProvider;

import com.dev.cna.*;

public class Main {
    
    public static void main(String[] args) throws URISyntaxException, IOException, ParserConfigurationException, SAXException {
        try {

            Identidade service = new Identidade();

            //Habilita logs
            System.setProperty("com.sun.xml.ws.transport.http.client.HttpTransportPipe.dump", "true");
            System.setProperty("com.sun.xml.internal.ws.transport.http.HttpAdapter.dump", "true");
            System.setProperty("com.sun.xml.internal.ws.transport.http.HttpAdapter.dumpTreshold", "999999");
       
            IIdentidade port = service.getBasicHttpsBindingIIdentidade();

            // Adiciona o token no cabeçalho via Handler
            BindingProvider bp = (BindingProvider) port;
            bp.getBinding().setHandlerChain(List.of(new TokenHeaderHandler("meu_token")));


            ArrayOfTOConsultaAdvogadoResult result = port.consultaAdvogado(
                "cpf",
                null,
                "MA",
                null,
                null,
                1
            );

            //Manipula o resultado
            /*for (TOConsultaAdvogadoResult advogado : result.getTOConsultaAdvogadoResult()) {
                System.out.println("Nome: " + advogado.getNomeAdvo());
            }*/
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}