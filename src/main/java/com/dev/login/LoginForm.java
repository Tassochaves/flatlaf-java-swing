package com.dev.login;
import javax.swing.*;

import com.formdev.flatlaf.FlatClientProperties;
import com.formdev.flatlaf.extras.FlatSVGIcon;

import net.miginfocom.swing.MigLayout;

public class LoginForm extends JPanel{
     public LoginForm() {
        iniciar();
    }

    private void iniciar() {
        setLayout(new MigLayout("wrap,gapy 3", "[fill,300]"));

        add(new JLabel(new FlatSVGIcon("login/icon/logo.svg", 1.5f)));

        JLabel lbTitle = new JLabel("Bem vindo (a)", JLabel.CENTER);
        lbTitle.putClientProperty(FlatClientProperties.STYLE, "" +
                "font:bold +20;");
        add(lbTitle, "gapy 8 8");

        add(new JLabel("Entre para liberar o computador,", JLabel.CENTER));
        add(new JLabel("setting and projects.", JLabel.CENTER));

        JLabel lbSeparator = new JLabel("Insira suas informações");
        lbSeparator.putClientProperty(FlatClientProperties.STYLE, "" +
                "foreground:$Label.disabledForeground;" +
                "font:-1;");

        // sizegroup para fazer com que os componentes do grupo tenham o mesmo tamanho

        add(createSeparator(), "split 3,sizegroup g1");
        add(lbSeparator, "sizegroup g1");
        add(createSeparator(), "sizegroup g1");

        JLabel lbIOab = new JLabel("Inscrição OAB");
        lbIOab.putClientProperty(FlatClientProperties.STYLE, "" +
                "font:bold;");
        add(lbIOab, "gapy 10 5");

        JTextField txtOab = new JTextField();
        txtOab.putClientProperty(FlatClientProperties.STYLE, "" +
                "iconTextGap:10;");
                txtOab.putClientProperty(FlatClientProperties.PLACEHOLDER_TEXT, "Entre com seu numero de inscrição");
                txtOab.putClientProperty(FlatClientProperties.TEXT_FIELD_LEADING_ICON, new FlatSVGIcon("login/icon/email.svg", 0.35f));

        add(txtOab);

        JLabel lbCpf = new JLabel("CPF");
        lbCpf.putClientProperty(FlatClientProperties.STYLE, "" +
                "font:bold;");

        add(lbCpf, "gapy 10 5,split 2");

        JButton cmdForgotPassword = createNoBorderButton("");
        add(cmdForgotPassword, "grow 0,gapy 10 5");

        JTextField txtCpf = new JTextField();
        txtCpf.putClientProperty(FlatClientProperties.STYLE, "" +
                "iconTextGap:10;");
        txtCpf.putClientProperty(FlatClientProperties.PLACEHOLDER_TEXT, "Entre com seu CPF");
        txtCpf.putClientProperty(FlatClientProperties.TEXT_FIELD_LEADING_ICON, new FlatSVGIcon("login/icon/password.svg", 0.35f));

        add(txtCpf);
        add(new JLabel(""), "gapy 10 10");

        JButton cmdSignIn = new JButton("Acessar") {
            @Override
            public boolean isDefaultButton() {
                return true;
            }
        };
        
        cmdSignIn.putClientProperty(FlatClientProperties.STYLE, "" +
                "foreground:#000000;" +
                "font:bold +5;" +
                "iconTextGap:10;");
        cmdSignIn.setHorizontalTextPosition(JButton.LEADING);
        add(cmdSignIn, "gapy n 10");

        add(new JLabel("Inscrição de outro estado?", JLabel.CENTER));
        add(new JLabel("Clique no acesso externo:", JLabel.CENTER));
        
        JButton cmdFacebook2 = new JButton("Externo");
        cmdFacebook2.putClientProperty(FlatClientProperties.STYLE, "" +
                "focusWidth:0;" +
                "font:+5;");
        add(cmdFacebook2, "gapy 15 10");
    }

    private JSeparator createSeparator() {
        JSeparator separator = new JSeparator();
        separator.putClientProperty(FlatClientProperties.STYLE, "" +
                "stripeIndent:8;");
        return separator;
    }

    private JButton createNoBorderButton(String text) {
        JButton button = new JButton(text);
        button.putClientProperty(FlatClientProperties.STYLE, "" +
                "foreground:$Component.accentColor;" +
                "margin:1,5,1,5;" +
                "borderWidth:0;" +
                "focusWidth:0;" +
                "innerFocusWidth:0;" +
                "background:null;");
        return button;
    }
}
