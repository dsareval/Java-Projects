/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package debercalculadoraventana;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
/**
 *
 * @author Lore
 */
public class Proceso extends JFrame implements ActionListener
{
    JFrame ventana;
    JLabel etiqueta;
    JButton s,r,m,d,f;
    JTextField n1,n2;
    int numero1,numero2;
    String auxn1,auxn2;
    
    Proceso()
    {
        ventana=new JFrame("SKJHJSFSDFGSDFH"); 
        ventana.setLayout(null);
        ventana.setBounds(50, 50, 800, 500);
        
        etiqueta = new JLabel("Numeros");
        etiqueta.setBounds(300, 20, 200, 50);
        
        n1 = new JTextField();
        n1.setBounds(50, 70, 100, 50);
        
        n2 = new JTextField();
        n2.setBounds(300, 70, 100, 50);
        
        s=new JButton("Suma");
        s.addActionListener(this);
        s.setBounds(50,140,100,50);
        
        r=new JButton("Resta");
        r.addActionListener(this);
        r.setBounds(150,140,100,50);
        
        m=new JButton("Multi");
        m.addActionListener(this);
        m.setBounds(350,140,100,50);
        
        d=new JButton("Divis");
        d.addActionListener(this);
        d.setBounds(50,240,100,50);
        
        f=new JButton("Finalizar");
        f.addActionListener(this);
        f.setBounds(150,240,100,50);
        
        ventana.getContentPane().add(etiqueta);
        ventana.getContentPane().add(n1);
        ventana.getContentPane().add(n2);
        ventana.getContentPane().add(s);
        ventana.getContentPane().add(r);
        ventana.getContentPane().add(m);
        ventana.getContentPane().add(d);
        ventana.getContentPane().add(f);
        ventana.setVisible(true);
    }
    @Override
    public void actionPerformed(ActionEvent e) 
    {
        numero1=Integer.valueOf(n1.getText());
        numero2=Integer.valueOf(n2.getText());
        if(e.getSource()==s)
        {
            System.out.println(numero1+numero2);
        }
        
        if(e.getSource()==r)
        {
            System.out.println(numero1-numero2);
        }
        
        if(e.getSource()==m)
        {
            System.out.println(numero1*numero2);
        }
        
        if(e.getSource()==d)
        {
            System.out.println(numero1/numero2);
        }
        if(e.getSource()==f)
        {
            System.exit(0);
        }
    }
}
