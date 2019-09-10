package main;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class Filmes extends JFrame {
    JButton btnOk,btnCanc;
    JCheckBox c1,c2,c3,c4,c5,c6,c7;
    ButtonGroup grupo;
    JLabel texto;
    public Filmes() {
        super("EX-3 Seleção de Filmes");
        Container tela = getContentPane();
        setLayout(null);
        ImageIcon ic1 = new ImageIcon("img/1.jpg");ImageIcon ic2 = new ImageIcon("img/2.jpg");ImageIcon ic3 = new ImageIcon("img/3.jpg");
        ImageIcon ic4 = new ImageIcon("img/4.jpg");ImageIcon ic5 = new ImageIcon("img/5.jpg");ImageIcon ic6 = new ImageIcon("img/6.jpg");
        ImageIcon ic7 = new ImageIcon("img/7.jpg");
        	
        texto = new JLabel("Seleção de Filmes");
        texto.setBounds(120,5,200,20);
        texto.setFont(new Font("Tahoma",Font.ITALIC+Font.BOLD,18));
        tela.add(texto);
        
        c1 = new JCheckBox("Ação");
        c1.setBounds(20,40,100,20);
        tela.add(c1);

        c2 = new JCheckBox("Comédia");
        c2.setBounds(20,70,100,20);
        tela.add(c2);

        c3 = new JCheckBox("Comédia Romântica");
        c3.setBounds(20,100,200,20);
        tela.add(c3);

        c4 = new JCheckBox("Ficção");
        c4.setBounds(20,130,100,20);
        tela.add(c4);

        c5 = new JCheckBox("Romance");
        c5.setBounds(20,160,100,20);
        tela.add(c5);

        c6 = new JCheckBox("Suspense");
        c6.setBounds(20,190,100,20);
        tela.add(c6);

        c7 = new JCheckBox("Terror");
        c7.setBounds(20,220,100,20);
        tela.add(c7);

        grupo = new ButtonGroup();
        grupo.add(c1);grupo.add(c2);grupo.add(c3);grupo.add(c4);
        grupo.add(c5);grupo.add(c6);grupo.add(c7);

        btnOk =  new JButton("OK");
        btnOk.setBounds(100,270,75,25);
        tela.add(btnOk);

        btnOk.addActionListener(
                new ActionListener() {
                    public void actionPerformed(ActionEvent e) {

                        if(c1.getModel().isSelected()) { JOptionPane.showMessageDialog(null,ic1); }
                        if(c2.getModel().isSelected()) { JOptionPane.showMessageDialog(null,ic2); }
                        if(c3.getModel().isSelected()) { JOptionPane.showMessageDialog(null,ic3); }
                        if(c4.getModel().isSelected()) { JOptionPane.showMessageDialog(null,ic4); }
                        if(c5.getModel().isSelected()) { JOptionPane.showMessageDialog(null,ic5); }
                        if(c6.getModel().isSelected()) { JOptionPane.showMessageDialog(null,ic6); }
                        if(c7.getModel().isSelected()) { JOptionPane.showMessageDialog(null,ic7); }

                    }
                }
        );
        btnCanc =  new JButton("Cancelar");
        btnCanc.setBounds(200,270,90,25);
        tela.add(btnCanc);

        btnCanc.addActionListener(
                new ActionListener() {
                    public void actionPerformed(ActionEvent e) {
                        System.exit(0);
                    }
                }
        );

        setSize(400,350);
        setVisible(true);
        setResizable(false);
        setLocationRelativeTo(null);
    }
}
