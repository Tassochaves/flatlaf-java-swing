package com.dev.login;
import java.awt.*;

import javax.swing.*;

import net.miginfocom.swing.MigLayout;

public class Login extends JFrame{

   public Login(){
        // Configurações da janela
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(new Dimension(1366, 768));
        setLocationRelativeTo(null);
        setLayout(new MigLayout("al center center"));
        add(new LoginForm());
   }
}
