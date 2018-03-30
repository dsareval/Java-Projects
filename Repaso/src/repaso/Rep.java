/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package repaso;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

/**
 *
 * @author Lore
 */
public class Rep extends JFrame implements ActionListener
{
    JFrame ventana;
    JLabel etiqueta;
    JButton restar;
    JTextField txt;
    JTextField txt2;
    
    
    Rep ()
    {
        ventana = new JFrame ("Repaso");
        ventana.setBounds(50, 50,800, 500);
        ventana.setLayout(null);
        
        txt= new JTextField();
        txt.setBounds(100,100 ,200, 40);
        
        txt2= new JTextField();
        txt2.setBounds(450,100 ,200, 40);
        
        
        etiqueta = new JLabel ("Texto");
        etiqueta.setBounds(150,19, 59, 50);
        
        restar= new JButton ("Comprobar");
        restar.setBounds(155, 150, 80, 50);
        restar.addActionListener(this);
        
        ventana.getContentPane().add(txt);
        ventana.getContentPane().add(txt2);
        
        ventana.getContentPane().add(etiqueta);
        ventana.getContentPane().add(restar);
        ventana.setVisible(true);
        
        
        
        
    }

    @Override
    public void actionPerformed(ActionEvent e) 
    {
       int num1;
       int num2;
       
       num1= Integer.valueOf(txt.getText());
       num2= Integer.valueOf(txt2.getText());
       
       if(e.getSource()==restar)
       {
           if(num2<num1)
           {
               System.out.println("ERROR");
           }
           else 
           {
               System.out.println("CORRECTO");
           }
       }
    }
}
