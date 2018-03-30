/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package proyec;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

/**
 *
 * @author Lore
 */
public class Pro extends JFrame implements ActionListener
{
    public JFrame vent;
    public JButton accion;
    public JTextField cuadro,cuadro2,cuadro3,cuadro4;
    public int num1,num2,resp;
    
    public void ingresar () 
    {
         vent=new JFrame ("Operaciones");
         vent.setLayout(null);
         vent.setSize(800,500 );
         vent.setLocation(180, 145);
         
         cuadro= new JTextField ("");
         cuadro.setBounds(0, 0, 800, 50);
         
         cuadro2= new JTextField ("");
         cuadro2.setBounds(0,120 , 800, 50);
         
         cuadro3= new JTextField ("");
         cuadro3.setBounds(0, 300, 800, 50);
         
         cuadro4= new JTextField ("");
         cuadro4.setBounds(0, 400, 800, 50);
         
         accion=new JButton ("Cambiar");
         accion.setBounds(300, 190, 120,65);
         accion.addActionListener((ActionListener) this);
         
         vent.getContentPane().add(accion);
         vent.getContentPane().add(cuadro);
         vent.getContentPane().add(cuadro2);
         vent.getContentPane().add(cuadro3);
         vent.getContentPane().add(cuadro4);
         vent.setVisible(true);
         
         
         
         
    
    }

    @Override
    public void actionPerformed(ActionEvent e) 
    {
          
        if(e.getSource()==accion)
        {
            try{
                
                
            num1=Integer.parseInt(cuadro.getText());
            num2=Integer.parseInt(cuadro3.getText());
            
            
            
            if(cuadro2.getText().equals("Suma"))
            {
                resp= Integer.valueOf(cuadro.getText()) + Integer.valueOf(cuadro3.getText()) ; 
            
                 cuadro4.setText(String.valueOf(resp));
                 
            }
             if(cuadro2.getText().equals("Resta"))
            {
                resp= Integer.valueOf(cuadro.getText()) - Integer.valueOf(cuadro3.getText()) ; 
            
                 cuadro4.setText(String.valueOf(resp));
                 
            }
             
             if(cuadro2.getText().equals("Multiplicacion"))
            {
                resp= Integer.valueOf(cuadro.getText()) * Integer.valueOf(cuadro3.getText()) ; 
            
                 cuadro4.setText(String.valueOf(resp));
                 
            }
             
            if(cuadro2.getText().equals("Divisio"))
            {
                resp= Integer.valueOf(cuadro.getText()) / Integer.valueOf(cuadro3.getText()) ; 
            
                 cuadro4.setText(String.valueOf(resp));
                 
            }
            
            }    
            catch (NumberFormatException ex)
            {
               cuadro4.setText("Error");
                
            }
    }
    
    
    
}
}


    
