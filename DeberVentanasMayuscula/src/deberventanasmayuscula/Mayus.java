/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package deberventanasmayuscula;

import javax.swing.*;
import java.awt.event.*;


/**
 *
 * @author Lore
 */
public class Mayus extends JFrame implements ActionListener

{
    JFrame ventana;
    JLabel etiqueta;
    JButton ma,mi,nu,ei,ef;
    JTextField tx1;
    String cadena;
    
    Mayus ()
    {
        ventana = new JFrame ("Cadenas");
        ventana.setBounds(50, 50, 800, 500);
        ventana.setLayout(null);
        
        tx1= new JTextField();
        tx1.setBounds(100,100 ,200, 40);
        
        etiqueta = new JLabel ("Texto");
        etiqueta.setBounds(155,20, 60, 50);
        
        
        ma = new JButton ("Mayuscula");
        ma.setBounds(50,170, 60, 50);
        ma.addActionListener(this);
        
        mi = new JButton ("Minuscula");
        mi.setBounds(110,170, 60, 50);
        mi.addActionListener(this);
        
        nu = new JButton ("Numero de caracteres");
        nu.setBounds(230,170, 60, 50);
        nu.addActionListener(this);
        
        ei = new JButton ("Espacio al inicio");
        ei.setBounds(290,170, 60, 50);
        ei.addActionListener(this);
        
        ef = new JButton ("Espacio al final");
        ef.setBounds(350,170, 60, 50);
        ef.addActionListener(this);
        
        ventana.getContentPane().add(ma);
        ventana.getContentPane().add(mi);
        ventana.getContentPane().add(nu);
        ventana.getContentPane().add(ei);
        ventana.getContentPane().add(ef);
        ventana.getContentPane().add(tx1);
        ventana.getContentPane().add(etiqueta);
        ventana.setVisible(true);
        
        
        
    }

    @Override
    public void actionPerformed(ActionEvent e) 
    {
        cadena=tx1.getText();
        if(e.getSource()==ma)
        {
            System.out.println(cadena.toUpperCase());
        }
        if(e.getSource()==mi)
        {
            System.out.println(cadena.toLowerCase());
        }
        if(e.getSource()==nu)
        {
            System.out.println(cadena.length());
        }
        if(e.getSource()==ei)
        {
            System.out.println(cadena.trim());
        }
        if(e.getSource()==ef)
        {
            System.out.println(cadena.trim());
        }
    }
}
