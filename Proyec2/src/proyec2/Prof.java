/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package proyec2;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

/**
 *
 * @author Lore
 */
public class Prof extends JFrame implements ActionListener
{
    
    public JFrame vent;
    public JButton cambiar;
    public JTextField cuadro,cuadro2;
    public int num,resp;
    
    public void ingresar()
    {
         vent=new JFrame ("Cambio");
         vent.setLayout(null);
         vent.setSize(800,500 );
         vent.setLocation(180, 145);
         
         cuadro= new JTextField ("");
         cuadro.setBounds(0, 0, 800, 50);
         
         cuadro2= new JTextField ("");
         cuadro2.setBounds(0, 400, 800, 50);
         
          
         cambiar=new JButton ("Cambiar");
         cambiar.setBounds(300, 190, 120,65);
         cambiar.addActionListener((ActionListener) this);
         
         vent.getContentPane().add(cambiar);
         vent.getContentPane().add(cuadro);
         vent.getContentPane().add(cuadro2);
         vent.setVisible(true);
         
         
        
        
        
    }

    @Override
    public void actionPerformed(ActionEvent e) 
    {
       if(e.getSource()==cambiar)
        {
            try
            {
                
                
            num=Integer.parseInt(cuadro.getText());
            
            if(num<0)
            {
                resp= num * -1 ; 
            
                 cuadro2.setText(String.valueOf(resp));
            
            
           
             
            
            }    
            
    }
            catch (NumberFormatException ex)
            {
               cuadro2.setText("Error");
                
            }
    
    
         }
    
    
    }  
}
    


