package main;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Calculadora extends JFrame{
    JTextField t1,t2,t3;
    JLabel n1,n2,res;
    JButton btncalc,btnlimpar;
    JRadioButton r1,r2,r3,r4,r5;
    ButtonGroup grupo;

    public Calculadora() {
        super("EX-1 Calculadora");
        Container tela = getContentPane();
        setLayout(null);
        n1 = new JLabel("N1");
        n1.setBounds(10,10,100,20);
        tela.add(n1);

        n2 = new JLabel("N2");
        n2.setBounds(10,40,100,20);
        tela.add(n2);

        t1 = new JTextField(20);
        t1.setBounds(30,10,220,20);
        tela.add(t1);

        t2 = new JTextField(20);
        t2.setBounds(30,40,220,20);
        tela.add(t2);

        r1 = new JRadioButton("Soma(+)");
        r1.setBounds(0,70,125,20);
        tela.add(r1);

        r2 = new JRadioButton("Subtração(-)");
        r2.setBounds(0,100,125,20);
        tela.add(r2);

        r3 = new JRadioButton("Multiplicação(*)");
        r3.setBounds(0,130,125,20);
        tela.add(r3);

        r4 = new JRadioButton("Divisão(/)");
        r4.setBounds(0,160,125,20);
        tela.add(r4);

        r5 = new JRadioButton("Resto(%)");
        r5.setBounds(0,190,125,20);
        tela.add(r5);

        grupo = new ButtonGroup();
        grupo.add(r1);
        grupo.add(r2);
        grupo.add(r3);
        grupo.add(r4);
        grupo.add(r5);

        res = new JLabel("Resultado");
        res.setBounds(10,220,100,20);
        tela.add(res);

        t3 = new JTextField(20);
        t3.setBounds(70,220,220,20);
        tela.add(t3);

        btncalc = new JButton("Calcular");
        btncalc.setBounds(180,70,100,30);
        tela.add(btncalc);

        btnlimpar = new JButton("Limpar");
        btnlimpar.setBounds(180,130,100,30);
        tela.add(btnlimpar);

        btncalc.addActionListener(
                new ActionListener() {
                    public void actionPerformed(ActionEvent e) {
                        int a,b,c;
                            a = Integer.parseInt(t1.getText());
                            b = Integer.parseInt(t2.getText());
                            c=0;
                        if (r1.getModel().isSelected()) {
                            c=a+b;
                            t3.setText(""+c);
                        }
                        if (r2.getModel().isSelected()) {
                            c=a-b;
                            t3.setText(""+c);
                        }
                        if (r3.getModel().isSelected()) {
                            c=a*b;
                            t3.setText(""+c);
                        }
                        if (r4.getModel().isSelected()) {
                            c=a/b;
                            t3.setText(""+c);
                        }
                        if (r5.getModel().isSelected()) {
                            c=a%b;
                            t3.setText(""+c);
                        }}});
        btnlimpar.addActionListener(
                new ActionListener() {
                    public void actionPerformed(ActionEvent e) {
                        t1.setText(null);
                        t2.setText(null);
                        t3.setText(null);
                    }
                }
        );

        setSize(300,275);
        setVisible(true);
        setResizable(false);
        setLocationRelativeTo(null);
    }

}
