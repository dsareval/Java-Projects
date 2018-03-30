/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package repas;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

/**
 *
 * @author Lore
 */
public class Re extends JFrame implements ActionListener

{
    public JFrame vent,ventana1,ventana2,ventana3;
    public JButton vent1,vent2,vent3,años,areatriangulo,cambiomonedas;
    public JTextField cuadroaños1,cuadroaños2,cuadrotriangulo1,cuadrotriangulo2,cuadrotriangulo3,cuadromonedas1,cuadromonedas2;
    public double num,num2,resp;
    public String aux;
    
            
    public void ingresar()
    
    {
        
         vent=new JFrame ("Botonoes");
         vent.setLayout(null);
         vent.setSize(800,500 );
         vent.setLocation(180, 145);
         
         ventana1=new JFrame ("Edad");
         ventana1.setLayout(null);
         ventana1.setSize(800,500 );
         ventana1.setLocation(180, 145);
         
         ventana2=new JFrame ("Area");
         ventana2.setLayout(null);
         ventana2.setSize(800,500 );
         ventana2.setLocation(180, 145);
         
         ventana3=new JFrame ("Monedas");
         ventana3.setLayout(null);
         ventana3.setSize(800,500 );
         ventana3.setLocation(180, 145);
         
         cuadroaños1= new JTextField ("");
         cuadroaños1.setBounds(0, 0, 800, 50);
         
         cuadroaños2= new JTextField ("");
         cuadroaños2.setBounds(0, 400, 800, 50);
         
         cuadrotriangulo1= new JTextField ("");
         cuadrotriangulo1.setBounds(0, 0, 800, 50);
         
         cuadrotriangulo2= new JTextField ("");
         cuadrotriangulo2.setBounds(0, 100, 800, 50);
         
         cuadrotriangulo3= new JTextField ("");
         cuadrotriangulo3.setBounds(0, 400, 800, 50);
         
         cuadromonedas1= new JTextField ("");
         cuadromonedas1.setBounds(0, 0, 800, 50);
         
         cuadromonedas2= new JTextField ("");
         cuadromonedas2.setBounds(0, 400, 800, 50);
         
         
        
         
      
         
         vent1=new JButton ("Años");
         vent1.setBounds(0, 65, 120,65);
         vent1.addActionListener(this);
         
         vent2=new JButton ("Area");
         vent2.setBounds(200, 65, 120,65);
         vent2.addActionListener(this);
         
         vent3=new JButton ("Monedas");
         vent3.setBounds(400, 65, 120,65);
         vent3.addActionListener(this);
         
         años=new JButton ("Calculo");
         años.setBounds(0, 65, 120,65);
         años.addActionListener(this);
         
         areatriangulo=new JButton ("Area");
         areatriangulo.setBounds(0, 300, 120,65);
         areatriangulo.addActionListener(this);
         
         cambiomonedas=new JButton ("Calculo");
         cambiomonedas.setBounds(0, 65, 120,65);
         cambiomonedas.addActionListener(this);
         
         
         
         
         
         
         vent.getContentPane().add(vent1);
         vent.getContentPane().add(vent2);
         vent.getContentPane().add(vent3);
         ventana1.getContentPane().add(años);
         ventana2.getContentPane().add(areatriangulo);
         ventana3.getContentPane().add(cambiomonedas);
         ventana1.getContentPane().add(cuadroaños1);
         ventana1.getContentPane().add(cuadroaños2);
         ventana2.getContentPane().add(cuadrotriangulo1);
         ventana2.getContentPane().add(cuadrotriangulo2);
         ventana2.getContentPane().add(cuadrotriangulo3);
         ventana3.getContentPane().add(cuadromonedas1);
         ventana3.getContentPane().add(cuadromonedas2);
         vent.setVisible(true);
         
        
    }

    @Override
    public void actionPerformed(ActionEvent e) 
    {
        if(e.getSource()==vent1)
        {
            ventana1.setVisible(true);            
        }
        
        if(e.getSource()==años)
        {
            try
            {
                num=Integer.parseInt(cuadroaños1.getText());
                resp= 2014-num;
                aux= Double.toString(resp);
                cuadroaños2.setText(aux);
                
                
                
            }
            catch (NumberFormatException ex)
            {
                cuadroaños1.setText("Error");
            }
        }
        
        
            if(e.getSource()==vent2)
        {
            ventana2.setVisible(true);
            
        }  
            if(e.getSource()==areatriangulo)
        {
            try
            {
                num=Integer.parseInt(cuadrotriangulo1.getText());
                num2=Integer.parseInt(cuadrotriangulo2.getText());
                resp= (num*num2)/2;
                aux= Double.toString(resp);
                cuadrotriangulo3.setText(aux);
                
                
                
            }
            catch (NumberFormatException ex)
            {
                cuadroaños1.setText("Error");
            }
        }
            
            
            if(e.getSource()==vent3)
        {
            ventana3.setVisible(true);
           
        }  
             if(e.getSource()==cambiomonedas)
        {
            try
            {
                num=Integer.parseInt(cuadromonedas1.getText());
                resp= num*0.73;
                aux=Double.toString(resp);
                cuadromonedas2.setText(aux);
                
                
            }
            catch (NumberFormatException ex)
            {
                cuadroaños1.setText("Error");
            }
        }
            
            
        }
        
        
    
    
}
        
        

