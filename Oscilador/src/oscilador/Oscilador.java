/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package oscilador;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

/**
 *
 * @author Lore
 */
public class Oscilador extends JFrame implements ActionListener
{
    public JFrame ventana;
    public JLabel lblfoco, lbl2, lblerror, lblTH, lblTL;
    public JTextField txtTH, txtTL;
    public JButton btnempezar, btnparar;
    public int TH, TL, cont;
    public Timer timer;
    public Icon f_a,f_p;
    
    public Oscilador()
    {
        ventana=new JFrame("Oscilador");
        ventana.setLayout(null);
        ventana.setSize(500, 500);
        ventana.setLocationRelativeTo(null);
        ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        lblfoco=new JLabel();
        lblfoco.setBounds(200,75,100,140);
        ImageIcon imagen = new ImageIcon(getClass().getResource("/Focos/foco apagado.png"));
        Image imagen_esc = imagen.getImage().getScaledInstance(lblfoco.getWidth(), lblfoco.getHeight(), Image.SCALE_SMOOTH);
        Icon foco_a = new ImageIcon(imagen_esc);
        f_a=foco_a;
        
        ImageIcon imagen2 = new ImageIcon(getClass().getResource("/Focos/foco prendido.png"));
        Image imagen_esc2 = imagen2.getImage().getScaledInstance(lblfoco.getWidth(), lblfoco.getHeight(), Image.SCALE_SMOOTH);
        Icon foco_p = new ImageIcon(imagen_esc2);
        f_p=foco_p;
        lblfoco.setIcon(foco_a);
        
        
        txtTH=new JTextField();
        txtTH.setBounds(50, 250, 100, 20);
        
        txtTL=new JTextField();
        txtTL.setBounds(350, 250, 100, 20);
        
        btnempezar=new JButton("Oscilar");
        btnempezar.setBounds(100,350,100,30); 
        btnempezar.addActionListener(this);
        
        btnparar=new JButton("Parar");
        btnparar.setBounds(300,350,100,30); 
        btnparar.addActionListener(this);
        
        lblerror=new JLabel();
        lblerror.setBounds(150, 300, 300, 20);
        
        lblTH=new JLabel("Tiempo en alto");
        lblTH.setBounds(50, 225, 100, 20);
        
        lblTL=new JLabel("Tiempo en bajo");
        lblTL.setBounds(350, 225, 100, 20);
        
        ventana.getContentPane().add(lblfoco);

        ventana.getContentPane().add(txtTH);
        ventana.getContentPane().add(txtTL);
        ventana.getContentPane().add(lblTH);
        ventana.getContentPane().add(lblTL);
        ventana.getContentPane().add(btnempezar);
        ventana.getContentPane().add(btnparar);
        ventana.getContentPane().add(lblerror);
        ventana.setVisible(true);
        
        ActionListener comandos=new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent e) 
            {
                cont++;
                if(cont<=TH)
                {
                    lblfoco.setIcon(f_p);
                }
                else
                {
                    if(cont<TH+TL)
                    {
                        lblfoco.setIcon(f_a);
                    }
                    if(cont==TH+TL)
                    {
                        lblfoco.setIcon(f_a);
                        cont=0;
                    }
                }
                
                
            }
        };
        timer=new Timer(100,comandos);
        
    }

    @Override
    public void actionPerformed(ActionEvent e) 
    {
        if(e.getSource()==btnempezar)
        {
            
            try
            {
                TH=Integer.valueOf(Math.round(Float.valueOf(txtTH.getText())*10));
                try
                {
                    TL=Integer.valueOf(Math.round(Float.valueOf(txtTL.getText())*10)); 
                    timer.setInitialDelay(0);
                    timer.start();
                }                
                catch(NumberFormatException ae)
                {
                    lblerror.setText("El tiempo ingresado no es correcto");
                }
            }
            catch(NumberFormatException ae)
            {
                lblerror.setText("El tiempo ingresado no es correcto");
            }
        }
        if(e.getSource()==btnparar)
        {
            timer.stop();
            cont=0;
            lblfoco.setIcon(f_a);
        }
    }
}
