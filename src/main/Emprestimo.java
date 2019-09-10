package main;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Emprestimo extends JFrame {
JLabel l1,l2,l3,texto;
JTextField t1,t2;
JComboBox lista;
JButton BtnEmp;
String livro;
String vet[] = {"Java: Guia do Programador","Lógica de Programação","C++ Para Iniciantes","Java: Orientação a Objeto","Kotlin para Iniciantes"};
    public Emprestimo() {
        super("EX-4 Empréstimo de Livros");
        Container tela = getContentPane();
        setLayout(null);

        texto = new JLabel("Empréstimo");
        texto.setBounds(135,5,120,20);
        texto.setFont(new Font("Tahoma",Font.PLAIN,14));
        texto.setForeground(Color.red);
        tela.add(texto);

        l1 = new JLabel("Aluno:");
        l1.setBounds(20,50,120,20);
        l1.setFont(new Font("Tahoma",Font.BOLD,14));
        tela.add(l1);

        l2 = new JLabel("Nome");
        l2.setBounds(0,80,120,20);
        l2.setFont(new Font("Tahoma",Font.BOLD,12));
        tela.add(l2);

        t1 = new JTextField(40);
        t1.setBounds(40,80,150,20);
        t1.setFont(new Font("Tahoma",Font.PLAIN,12));
        tela.add(t1);

        l3 = new JLabel("Classe");
        l3.setBounds(0,110,120,20);
        l3.setFont(new Font("Tahoma",Font.BOLD,12));
        tela.add(l3);

        t2 = new JTextField(40);
        t2.setBounds(40,110,150,20);
        t2.setFont(new Font("Tahoma",Font.PLAIN,12));
        tela.add(t2);

        lista = new JComboBox(vet);
        lista.setBounds(190,50,150,20);
        lista.setMaximumRowCount(5);
        tela.add(lista);

        lista.addActionListener(
                new ActionListener() {
                    public void actionPerformed(ActionEvent e) {
                        if(lista.getSelectedItem().toString() == "Java: Guia do Programador"){ livro="Java: Guia do Programador"; }
                        if(lista.getSelectedItem().toString() == "Lógica de Programação"){ livro="Lógica de Programação"; }
                        if(lista.getSelectedItem().toString() == "C++ Para Iniciantes"){ livro="C++ Para Iniciantes"; }
                        if(lista.getSelectedItem().toString() == "Java: Orientação a Objeto"){ livro="Java: Orientação a Objeto"; }
                        if(lista.getSelectedItem().toString() == "Kotlin para Iniciantes"){ livro="Kotlin para Iniciantes"; }
                    }
                }
        );

        BtnEmp = new JButton("Emprestar");
        BtnEmp.setBounds(125,180,100,25);
        BtnEmp.setFont(new Font("Tahoma",Font.PLAIN,12));
        tela.add(BtnEmp);

        BtnEmp.addActionListener(
                new ActionListener() {
                    public void actionPerformed(ActionEvent e) {
                        String b,c;
                        b=t1.getText();
                        c=t2.getText();
                        JOptionPane.showMessageDialog(null,"O livro '"+livro+
                                "' foi emprestado ao aluno: '"+ b+"' da classe: '"+c+"' com sucesso!");
                    }
                }
        );
        
        setSize(350,250);
        setVisible(true);
        setResizable(false);
        setLocationRelativeTo(null);
      }
}
