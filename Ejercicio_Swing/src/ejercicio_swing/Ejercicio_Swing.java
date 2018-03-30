/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio_swing;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

/**
 *
 * @author Lore
 */
public class Ejercicio_Swing extends JFrame implements ActionListener
{
    public JFrame ventana;
    public JLabel lblnum1, lblnum2, resp;
    public JTextField txtnum1, txtnum2;
    public JButton btnsuma, btnresta, btnmult, btndiv;
    
    public Ejercicio_Swing()
    {
        ventana=new JFrame("Calculadora");
        ventana.setLayout(null);
        ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        ventana.setSize(500, 300);
        ventana.setLocationRelativeTo(null);
        
        lblnum1=new JLabel("Número 1:");
        lblnum1.setBounds(50,30,100,20);
        
        lblnum2=new JLabel("Número 2:");
        lblnum2.setBounds(50,80,100,20);    
        
        btnsuma=new JButton("Suma");
        btnsuma.setBounds(50,130,150,20);
        btnsuma.addActionListener(this);
        
        btnmult=new JButton("Multiplicación");
        btnmult.setBounds(50,180,150,20);
        btnmult.addActionListener(this);
        
        txtnum1=new JTextField();
        txtnum1.setBounds(150,30,200,20);
        
        txtnum2=new JTextField();
        txtnum2.setBounds(150,80,200,20);
        
        btnresta=new JButton("Resta");
        btnresta.setBounds(250,130,150,20);
        btnresta.addActionListener(this);
        
        btndiv=new JButton("División");
        btndiv.setBounds(250,180,150,20);
        btndiv.addActionListener(this);
        
        resp=new JLabel("Respuesta: ");
        resp.setBounds(50,230,100,20);
        
        
        ventana.getContentPane().add(lblnum1);
        ventana.getContentPane().add(txtnum1);
        ventana.getContentPane().add(lblnum2);
        ventana.getContentPane().add(txtnum2);
        ventana.getContentPane().add(btnsuma);
        ventana.getContentPane().add(btnmult);
        ventana.getContentPane().add(btnresta);
        ventana.getContentPane().add(btndiv);
        ventana.getContentPane().add(resp);
        ventana.setVisible(true);
        
    }

    @Override
    public void actionPerformed(ActionEvent e)
    {
        if(e.getSource()==btnsuma)
        {
            resp.setText("Respuesta: "+((Double.valueOf(txtnum1.getText()))+Double.valueOf(txtnum2.getText())));
        }
        
        if(e.getSource()==btnresta)
        {
            if(Double.valueOf(txtnum1.getText())>Double.valueOf(txtnum2.getText()))
            {
                resp.setText("Respuesta: "+((Double.valueOf(txtnum1.getText()))-Double.valueOf(txtnum2.getText())));
            }
            else
            {
                resp.setText("Respuesta: "+((Double.valueOf(txtnum2.getText()))-Double.valueOf(txtnum1.getText())));
            }
        }
        
        if(e.getSource()==btnmult)
        {
            resp.setText("Respuesta: "+((Double.valueOf(txtnum1.getText()))*Double.valueOf(txtnum2.getText())));
        }
        
        if(e.getSource()==btndiv)
        {
            resp.setText("Respuesta: "+((Double.valueOf(txtnum1.getText()))/Double.valueOf(txtnum2.getText())));
        }
    }
}
