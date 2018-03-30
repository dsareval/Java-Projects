/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package carro;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

/**
 *
 * @author Fercho
 */
public class Proceso
{
    public JFrame ventana;
    public JLabel carro;
    public int x=10;
    public Timer timer;
    
    public Proceso()
    {
        ventana=new JFrame("Carro");
        ventana.setLayout(null);
        ventana.setBounds(100, 200,1000,500);
        ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        carro=new JLabel();
        carro.setBounds(10,250,150,75);
        ImageIcon imagen = new ImageIcon(getClass().getResource("/imagenes/Carro.jpg"));
        Image imagen_escalada = imagen.getImage().getScaledInstance(carro.getWidth(), carro.getHeight(), Image.SCALE_SMOOTH);
        Icon img = new ImageIcon(imagen_escalada);
        carro.setIcon(img);
        
        ventana.getContentPane().add(carro);
        ventana.setVisible(true);
        
        ActionListener comandos=new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent e) 
            {
                carro.setLocation(x+=10, 250);               
            }
        };
        timer=new Timer(100,comandos);
        
        timer.start();
        
    }

    
}
