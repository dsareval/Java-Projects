/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package repaso2;

import java.awt.event.*;
import javax.swing.*;

/**
 *
 * @author Lore
 */
public class Rep2 extends JFrame implements ActionListener
{
   JFrame ventana;
   JLabel etiqueta;
   JButton contar,unir;
   JTextField txt;
   
   Rep2 ()
    {
        ventana = new JFrame ("Repaso 2");
        ventana.setBounds(50, 50, 800, 500);
        ventana.setLayout(null);
        
        txt= new JTextField ();
        txt.setBounds(100, 100, 200, 40);
        txt.addActionListener(this);
        
        etiqueta = new JLabel ("Texto");
        etiqueta.setBounds(150,19, 59, 50);
        
        contar= new JButton ("Contar");
        contar.setBounds(155, 150, 80, 50);
        contar.addActionListener(this);
        
        unir= new JButton ("Unir");
        unir.setBounds(155, 170, 80, 50);
        unir.addActionListener(this);
        
        
        ventana.getContentPane().add(txt);
        ventana.getContentPane().add(etiqueta);
        ventana.getContentPane().add(contar);
        ventana.getContentPane().add(etiqueta);
        ventana.getContentPane().add(unir);
        ventana.setVisible(true);
        
        
        
        
        
    }

    @Override
    public void actionPerformed(ActionEvent e) 
    {
        if (e.getSource()==txt);
        
    }
}
