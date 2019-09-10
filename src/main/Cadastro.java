package main;
import oracle.jrockit.jfr.JFR;

import javax.swing.*;
import javax.swing.text.MaskFormatter;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.ParseException;

public class Cadastro extends JFrame{
    JFormattedTextField t1,t2,t3,t4;
    JLabel l1,l2,l3,l4;
    JButton btnCadastro;
    MaskFormatter m1,m2,m3,m4;

    public Cadastro(){
        super("EX-2 Cadastro de Cliente");
        Container tela = getContentPane();
        setLayout(null);

        l1 = new JLabel("CEP:");
        l1.setBounds(50,20,100,20);
        l1.setFont(new Font("Tahoma",Font.BOLD,12));
        tela.add(l1);

        l2 = new JLabel("Telefone:");
        l2.setBounds(50,60,100,20);
        l2.setFont(new Font("Tahoma",Font.BOLD,12));
        tela.add(l2);

        l3 = new JLabel("CPF:");
        l3.setBounds(50,100,100,20);
        l3.setFont(new Font("Tahoma",Font.BOLD,12));
        tela.add(l3);

        l4 = new JLabel("Data:");
        l4.setBounds(50,140,100,20);
        l4.setFont(new Font("Tahoma",Font.BOLD,12));
        tela.add(l4);

        try{
            m1 = new MaskFormatter("#####-###");
            m2 = new MaskFormatter("(##)####-####");
            m3 = new MaskFormatter("###.###.###-##");
            m4 = new MaskFormatter("##/##/####");
            m1.setPlaceholderCharacter('_');
            m2.setPlaceholderCharacter('_');
            m3.setPlaceholderCharacter('_');
            m4.setPlaceholderCharacter('_');
        }
        catch (ParseException excp){}

        t1 = new JFormattedTextField(m1);
        t1.setBounds(160,20,100,20);
        t1.setFont(new Font("Tahoma",Font.PLAIN,12));
        tela.add(t1);

        t2 = new JFormattedTextField(m2);
        t2.setBounds(160,60,100,20);
        t2.setFont(new Font("Tahoma",Font.PLAIN,12));
        tela.add(t2);

        t3 = new JFormattedTextField(m3);
        t3.setBounds(160,100,100,20);
        t3.setFont(new Font("Tahoma",Font.PLAIN,12));
        tela.add(t3);

        t4 = new JFormattedTextField(m4);
        t4.setBounds(160,140,100,20);
        t4.setFont(new Font("Tahoma",Font.PLAIN,12));
        tela.add(t4);

        btnCadastro = new JButton("Cadastrar");
        btnCadastro.setBounds(160,180,100,30);
        btnCadastro.setFont(new Font("Tahoma",Font.PLAIN,12));
        tela.add(btnCadastro);

        btnCadastro.addActionListener(
                new ActionListener() {
                    public void actionPerformed(ActionEvent e) {
                        String a,b,c,d;
                        a=t1.getText();
                        b=t2.getText();
                        c=t3.getText();
                        d=t4.getText();
                        JOptionPane.showMessageDialog(null,"Cadastro Realizado com Sucesso!\nDados Enviados:\nCEP: "+
                                a+"\nTelefone: "+b+ "\nCPF: "+c+"\nData: "+d);
                    }
                }
        );

        setSize(450,250);
        setVisible(true);
        setResizable(false);
        setLocationRelativeTo(null);
    }

}
