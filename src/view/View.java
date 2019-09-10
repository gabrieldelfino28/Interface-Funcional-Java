package view;
/*
 * @author Gabriel Cavalcante Delfino
 */
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import main.*;
public class View extends JFrame{
JButton btn1,btn2,btn3,btn4;
JLabel texto;
    public View() {
    	super("Gabriel Delfino");
    	Container tela = getContentPane();
    	ImageIcon icone = new ImageIcon("img/app.png");
    	setIconImage(icone.getImage());
    	setLayout(null);
    	
    	texto = new JLabel("Todos os exercicios - Gabriel Cavalcante");
    	texto.setBounds(1,0,250,30);
    	texto.setFont( new Font("Tahoma",Font.BOLD,12));
    	tela.add(texto);
    	
    	btn1 = new JButton("Exercicio-1");
    	btn1.setBounds(10,40,100,30);
    	tela.add(btn1);
    	btn1.addActionListener(new ActionListener() {public void actionPerformed(ActionEvent e) {Calculadora e1 = new Calculadora();}});
  
    	btn2 = new JButton("Exercicio-2");
    	btn2.setBounds(130,40,100,30);
    	tela.add(btn2);
    	btn2.addActionListener(new ActionListener() {public void actionPerformed(ActionEvent e) {Cadastro e2 = new Cadastro();}});
    	
    	btn3 = new JButton("Exercicio-3");
    	btn3.setBounds(10,90,100,30);
    	tela.add(btn3);
    	btn3.addActionListener(new ActionListener() {public void actionPerformed(ActionEvent e) {Filmes e4 = new Filmes();}});
    	
    	btn4 = new JButton("Exercicio-4");
    	btn4.setBounds(130,90,100,30);
    	tela.add(btn4);
    	btn4.addActionListener(new ActionListener() {public void actionPerformed(ActionEvent e) {Emprestimo e3 = new Emprestimo();}});
    	
    	setVisible(true);
    	setResizable(false);
    	setSize(250,170);
    	setLocationRelativeTo(null);
    }
public static void main(String args[]) {
		View app = new View();
		app.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}
