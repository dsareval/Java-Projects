/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package rep;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

/**
 *
 * @author Lore
 */
public class Letrs extends JFrame implements ActionListener
{
    public JFrame vent;
     public JButton Cambio;
     public JTextField cuadro,cuadro1;
     public JLabel respuesta;
     public int num;
     
     
     public void calcular () 
     {
         vent=new JFrame ("Letras");
         vent.setLayout(null);
         vent.setSize(800,500 );
         vent.setLocation(180, 145);
         
         cuadro= new JTextField ("");
         cuadro.setBounds(0, 0, 800, 50);
         
         Cambio=new JButton ("Cambiar");
         Cambio.setBounds(125, 65, 120,65);
         Cambio.addActionListener(this);
         
         cuadro1= new JTextField ("");
         cuadro1.setBounds(400, 400, 300, 50);
         
         respuesta=new JLabel("    ");
         respuesta.setBounds(125, 359, 325, 20);
         
         
         vent.getContentPane().add(respuesta);
         vent.getContentPane().add(cuadro);
         vent.getContentPane().add(cuadro1);
         vent.getContentPane().add(Cambio);
         vent.setVisible(true);
             
     }

    @Override
    public void actionPerformed(ActionEvent e) 
    { 
       
        
        
        if(e.getSource()==Cambio)
        {
            try{
                
                
            
            num=Integer.parseInt(cuadro.getText());
            
            if(num>9)
            {
            cuadro.setText("Error");
            }
            
            
            
            if(num==9)
            {
               cuadro1.setText("Nueve");
            }
             if(num==8)
            {
               cuadro1.setText("Ocho");
            }
              if(num==7)
            {
               cuadro1.setText("Siete");
            }
               if(num==6)
            {
               cuadro1.setText("Seis");
            }
                if(num==5)
            {
               cuadro1.setText("Cinco");
            }
                 if(num==4)
            {
               cuadro1.setText("Cuatro");
            }
                  if(num==3)
            {
               cuadro1.setText("Tres");
            }
                   if(num==2)
            {
               cuadro1.setText("Dos");
            }
                    if(num==1)
            {
               cuadro1.setText("Uno");
            }
                     if(num==0)
            {
               cuadro1.setText("Cero");
            }
            
            
                
                
            
                
               
            
            
                
            
            }    
            catch (NumberFormatException ex)
            {
                cuadro.setText("Error");
                
            }
            
                    
                    
                    
            
      }      
    }
    
}
