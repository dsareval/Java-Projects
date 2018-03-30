/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ventana;

import java.awt.*;
import java.awt.event.*;
import javax.swing.AbstractButton;
import javax.swing.BoxLayout;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

/**
 *
 * @author Lore
 */
public class Mostrar extends JFrame implements ActionListener
{
    
    public JFrame Ventana;
    public JDialog ven;
    public JLabel lblmsg, lblmsg2;
    public JButton btnb1, btnb2, btnb3, btnb4;   
    public JTextField tf , tf1, tf2;
    public int respsuma , respresta, respmult;
    public double respdiv;
    
    
    public Mostrar() 
    {
        
        Ventana = new JFrame("Operaciones Matematicas");
        Ventana.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        Ventana.setSize(500, 250);
        Ventana.setLocation(100, 100);
        
        Object[] options = {"Yes, please",
                    "No, thanks"};
        ven = new JDialog();
        JOptionPane.showMessageDialog(Ventana, "hola","bebé",JOptionPane.ERROR_MESSAGE);
        JOptionPane.showInputDialog(Ventana, "Hola", "bebé",JOptionPane.PLAIN_MESSAGE,null,options,options[0]);
                
        lblmsg = new JLabel("Numero 1");
        lblmsg.setBounds(1, 1, 100, 10);
        lblmsg.setForeground(Color.red);
        
        lblmsg2 = new JLabel("Numero 2");
        lblmsg2.setBounds(1, 50, 100, 10);
        lblmsg2.setForeground(Color.red);
        
        btnb1 = new JButton("Suma");
        btnb1.setBounds(5, 100, 100, 20);
        btnb1.addActionListener(this);
        btnb1.setHorizontalTextPosition(SwingConstants.RIGHT);
        
        btnb2 = new JButton("Resta");
        btnb2.setBounds(120, 100, 100, 20);
        btnb2.addActionListener(this);
        
        btnb3 = new JButton("Mult");
        btnb3.setBounds(240, 100, 100, 20);
        btnb3.addActionListener(this);
        
        btnb4 = new JButton("Div");
        btnb4.setBounds(360, 100, 100, 20);
        btnb4.addActionListener(this);
        
        tf= new JTextField();
        tf.setBounds(5, 15, 200, 20);
        
        tf1= new JTextField();
        tf1.setBounds(5, 65, 200, 20);
        
        tf2= new JTextField();
        tf2.setBounds(5, 150, 200, 20);
        
        
        Ventana.getContentPane().add(lblmsg2);
        Ventana.getContentPane().add(lblmsg);
        Ventana.getContentPane().add(btnb1);
        Ventana.getContentPane().add(btnb2);
        Ventana.getContentPane().add(btnb3);
        Ventana.getContentPane().add(btnb4);
        Ventana.getContentPane().add(tf);
        Ventana.getContentPane().add(tf1);
        Ventana.getContentPane().add(tf2);
        Ventana.setVisible(true);

        
        System.out.println("hola");
        
        
    
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==btnb1)
        {
            respsuma = Integer.valueOf(tf.getText()) + Integer.valueOf(tf1.getText()) ; 
            tf2.setText(String.valueOf(respsuma));
        }
        
         if(e.getSource()==btnb2)
        {
             if(Integer.valueOf(tf.getText())>Integer.valueOf(tf1.getText()))
            {
                respresta = Integer.valueOf(tf.getText()) - Integer.valueOf(tf1.getText()) ;
            }
            else
            {
                respresta = Integer.valueOf(tf1.getText())-Integer.valueOf(tf.getText());
            } 
            tf2.setText(String.valueOf(respresta));
            
           
        }
         
          if(e.getSource()==btnb3)
        {
            respmult = Integer.valueOf(tf.getText()) * Integer.valueOf(tf1.getText()) ; 
            tf2.setText(String.valueOf(respmult));
        }
          
           if(e.getSource()==btnb4)
        {
            respdiv = Double.valueOf(tf.getText()) / Double.valueOf(tf1.getText()) ; 
            tf2.setText(String.valueOf(respdiv));
        }
        
    }
    
}
