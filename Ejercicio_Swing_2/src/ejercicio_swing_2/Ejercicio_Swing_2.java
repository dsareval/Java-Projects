/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio_swing_2;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

/**
 *
 * @author Lore
 */
public class Ejercicio_Swing_2 extends JFrame implements ActionListener
{
    public JFrame ventana;
    public JLabel lbltexto, resp;
    public JTextField txttexto;
    public JButton btnMayus, btnminus, btncarac, btnespini, btnespfin;
    
    public Ejercicio_Swing_2()
    {
        ventana=new JFrame("Convertidor");
        ventana.setLayout(null);
        ventana.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
        ventana.setSize(600, 300);
        ventana.setLocationRelativeTo(null);        
        
        lbltexto=new JLabel("Mensaje:");
        lbltexto.setBounds(50,30,100,20);       
        
        btnMayus=new JButton("Mayúsculas");
        btnMayus.setBounds(30,80,150,20);
        btnMayus.addActionListener(this);
        
        btnminus=new JButton("Minúsculas");
        btnminus.setBounds(210,80,150,20);
        btnminus.addActionListener(this);
        
        txttexto=new JTextField();
        txttexto.setBounds(150,30,200,20);
        
        
        btncarac=new JButton("# de caracteres");
        btncarac.setBounds(390,80,150,20);
        btncarac.addActionListener(this);
        
        btnespini=new JButton("Esp. Inicio");
        btnespini.setBounds(105,130,150,20);
        btnespini.addActionListener(this);
        
        btnespfin=new JButton("Esp. Final");
        btnespfin.setBounds(310,130,150,20);
        btnespfin.addActionListener(this);
        
        resp=new JLabel("Respuesta: ");
        resp.setBounds(50,180,500,20);
               
        
        ventana.getContentPane().add(lbltexto);
        ventana.getContentPane().add(txttexto);
        ventana.getContentPane().add(btnMayus);
        ventana.getContentPane().add(btncarac);       
        ventana.getContentPane().add(btnminus);
        ventana.getContentPane().add(btnespini);
        ventana.getContentPane().add(btnespfin);
        ventana.getContentPane().add(resp);
        ventana.setVisible(true);
        
        
                
    }

    @Override
    public void actionPerformed(ActionEvent e) 
    {
        if(e.getSource()==btnMayus)
        {
            resp.setText(txttexto.getText().toUpperCase());
            System.exit(0);
        }
        
        if(e.getSource()==btnminus)
        {
            resp.setText(txttexto.getText().toLowerCase());
        }
        
        if(e.getSource()==btncarac)
        {
            resp.setText(String.valueOf(txttexto.getText().length()));
        }
        
        if(e.getSource()==btnespini)
        {
            resp.setText(txttexto.getText().substring(1));
        }
        
        if(e.getSource()==btnespfin)
        {
            resp.setText(txttexto.getText().substring(0,txttexto.getText().length()-1));
        }
    }
}
