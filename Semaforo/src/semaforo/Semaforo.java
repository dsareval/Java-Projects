/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package semaforo;

import java.awt.*;
import java.awt.event.*;;
import javax.swing.*;
import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;


/**
 *
 * @author Lore
 */
public class Semaforo 
{
    public JFrame ventana;
    public JLabel lblfondo, lblC_D, lblC_L, lblC_R, lblC_U, lblS_U, lblS_D, lblS_L, lblS_R;
    public Icon fondo, C_D, C_L, C_R, C_U, S_R, S_A, S_V;
    public boolean SF, SL;
    public int cont, posC_D, posC_U, posC_L, posC_R, limL, limR, limU, limD, vL, vD, vU, vR;
    public Timer timer_s, timer_c;
    
    public Semaforo()
    {
        ventana=new JFrame("F-Kart");
        ventana.setLayout(null);
        ventana.setSize(700, 700);
        ventana.setLocationRelativeTo(null);
        ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        SF=false;
        SL=true;
        posC_D=5;
        posC_U=600;
        posC_L=630;
        posC_R=5;
        limU=(int) Math.floor(Math.random()*(-600+50+1)-50);
        limD=(int) Math.floor(Math.random()*(700-1250+1)+1250);
        limL=(int) Math.floor(Math.random()*(-600+50+1)-50);
        limR=(int) Math.floor(Math.random()*(700-1250+1)+1250);
        vU=(int) Math.floor(Math.random()*(4-1+1)+1);
        vD=(int) Math.floor(Math.random()*(4-1+1)+1);
        vL=(int) Math.floor(Math.random()*(4-1+1)+1);
        vR=(int) Math.floor(Math.random()*(4-1+1)+1);
        
        
        
        lblfondo=new JLabel();
        lblfondo.setBounds(0,0, 700,700);
        ImageIcon imagen = new ImageIcon(getClass().getResource("Fondo.png"));
        Image imagen_esc = imagen.getImage().getScaledInstance(lblfondo.getWidth(), lblfondo.getHeight(), Image.SCALE_SMOOTH);
        fondo = new ImageIcon(imagen_esc);
        lblfondo.setIcon(fondo);
        
        lblC_D=new JLabel();
        lblC_D.setBounds(305, posC_D, 30,50);
        ImageIcon imagen2 = new ImageIcon(getClass().getResource("C_D.png"));
        Image imagen_esc2 = imagen2.getImage().getScaledInstance(lblC_D.getWidth(), lblC_D.getHeight(), Image.SCALE_SMOOTH);
        C_D = new ImageIcon(imagen_esc2);
        lblC_D.setIcon(C_D);
        
        lblC_U=new JLabel();
        lblC_U.setBounds(355, posC_U, 30,50);
        ImageIcon imagen3 = new ImageIcon(getClass().getResource("C_U.png"));
        Image imagen_esc3 = imagen3.getImage().getScaledInstance(lblC_U.getWidth(), lblC_U.getHeight(), Image.SCALE_SMOOTH);
        C_U = new ImageIcon(imagen_esc3);
        lblC_U.setIcon(C_U);
        
        lblC_R=new JLabel();
        lblC_R.setBounds(posC_R, 355, 50,30);
        ImageIcon imagen4 = new ImageIcon(getClass().getResource("C_R.png"));
        Image imagen_esc4 = imagen4.getImage().getScaledInstance(lblC_R.getWidth(), lblC_R.getHeight(), Image.SCALE_SMOOTH);
        C_R = new ImageIcon(imagen_esc4);
        lblC_R.setIcon(C_R);
        
        lblC_L=new JLabel();
        lblC_L.setBounds(posC_L, 305, 50, 30);
        ImageIcon imagen5 = new ImageIcon(getClass().getResource("C_L.png"));
        Image imagen_esc5 = imagen5.getImage().getScaledInstance(lblC_L.getWidth(), lblC_L.getHeight(), Image.SCALE_SMOOTH);
        C_L = new ImageIcon(imagen_esc5);
        lblC_L.setIcon(C_L);
        
        lblS_U=new JLabel();
        lblS_U.setBounds(415, 240, 50, 60); 
        
        ImageIcon imagen6 = new ImageIcon(getClass().getResource("S_R.png"));
        Image imagen_esc6 = imagen6.getImage().getScaledInstance(lblS_U.getWidth(), lblS_U.getHeight(), Image.SCALE_SMOOTH);
        S_R = new ImageIcon(imagen_esc6);      
        
        ImageIcon imagen7 = new ImageIcon(getClass().getResource("S_A.png"));
        Image imagen_esc7 = imagen7.getImage().getScaledInstance(lblS_U.getWidth(), lblS_U.getHeight(), Image.SCALE_SMOOTH);
        S_A = new ImageIcon(imagen_esc7);
        
        ImageIcon imagen8 = new ImageIcon(getClass().getResource("S_V.png"));
        Image imagen_esc8 = imagen8.getImage().getScaledInstance(lblS_U.getWidth(), lblS_U.getHeight(), Image.SCALE_SMOOTH);
        S_V = new ImageIcon(imagen_esc8);
        
        lblS_U.setIcon(S_R);
        
        lblS_D=new JLabel();
        lblS_D.setBounds(240, 405, 50, 60);
        lblS_D.setIcon(S_R);
        
        lblS_L=new JLabel();
        lblS_L.setBounds(240, 240, 50, 60);
        lblS_L.setIcon(S_V);
        
        lblS_R=new JLabel();
        lblS_R.setBounds(415, 405, 50, 60);
        lblS_R.setIcon(S_V);
        
        ventana.getContentPane().add(lblS_U);
        ventana.getContentPane().add(lblS_D);
        ventana.getContentPane().add(lblS_L);
        ventana.getContentPane().add(lblS_R);
        ventana.getContentPane().add(lblC_D);
        ventana.getContentPane().add(lblC_U);
        ventana.getContentPane().add(lblC_R);
        ventana.getContentPane().add(lblC_L);
        ventana.getContentPane().add(lblfondo);        
        ventana.setVisible(true);
        
        ActionListener comandos=new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent e) 
            {
                cont++;
                if(cont<=7)
                {
                    lblS_U.setIcon(S_R);
                    lblS_D.setIcon(S_R);
                    lblS_R.setIcon(S_V);
                    lblS_L.setIcon(S_V);
                    SF=false;
                    SL=true;
                }
                else
                {
                    if(cont<=8)
                    {
                        lblS_U.setIcon(S_R);
                        lblS_D.setIcon(S_R);
                        lblS_R.setIcon(S_A);
                        lblS_L.setIcon(S_A);                       
                    }
                    else
                    {
                        if(cont<=15)
                        {
                            lblS_U.setIcon(S_V);
                            lblS_D.setIcon(S_V);
                            lblS_R.setIcon(S_R);
                            lblS_L.setIcon(S_R);
                            SF=true;
                            SL=false;
                        }
                        else
                        {
                            if(cont<=16)
                            {
                            lblS_U.setIcon(S_A);
                            lblS_D.setIcon(S_A);
                            lblS_R.setIcon(S_R);
                            lblS_L.setIcon(S_R);
                            }
                            else
                            {
                                cont=0;
                                lblS_U.setIcon(S_R);
                                lblS_D.setIcon(S_R);
                                lblS_R.setIcon(S_V);
                                lblS_L.setIcon(S_V);
                                SF=false;
                                SL=true;
                            }
                        }
                    }
                }
                
            }
        };
        timer_s=new Timer(1000,comandos);
        
        timer_s.start();
        
        ActionListener comandos2=new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent e) 
            {
                if(SF==true)
                {                                  
                        lblC_D.setLocation(305, posC_D+=vD);
                        lblC_U.setLocation(355, posC_U-=vU);                    
                    
                }
                else
                {
                    if(lblC_D.getY()>243||lblC_D.getY()<238)
                    {
                        lblC_D.setLocation(305, posC_D+=vD);
                    }
                    if(lblC_U.getY()>403||lblC_U.getY()<398)
                    {
                        lblC_U.setLocation(355, posC_U-=vU);
                    }
                }
                if(SL==true)
                {
                        lblC_R.setLocation(posC_R+=vR, 355);
                        lblC_L.setLocation(posC_L-=vL, 305);
                }
                else
                {
                    if(lblC_R.getX()>243||lblC_R.getX()<238)
                    {
                        lblC_R.setLocation(posC_R+=vR, 355);
                    }
                    if(lblC_L.getX()>413||lblC_L.getX()<408)
                    {
                        lblC_L.setLocation(posC_L-=vL, 305);
                    }
                }
                if(lblC_U.getY()<limU+3&&lblC_U.getY()>limU-2)
                {
                    posC_U=700;
                    limU=(int) Math.floor(Math.random()*(-50+600+1)-600);
                    vU=(int) Math.floor(Math.random()*(4-1+1)+1);

                }
                if(lblC_D.getY()<limD+3&&lblC_D.getY()>limD-2)
                {
                    posC_D=-80;
                    limD=(int) Math.floor(Math.random()*(1250-700+1)+700);
                    vD=(int) Math.floor(Math.random()*(4-1+1)+1);
                }
                if(lblC_L.getX()<limL+3&&lblC_L.getX()>limL-2)
                {
                    posC_L=700;
                    limL=(int) Math.floor(Math.random()*(-50+600+1)-600);
                    vL=(int) Math.floor(Math.random()*(4-1+1)+1);
                }
                if(lblC_R.getX()<limR+3&&lblC_R.getX()>limR-2)
                {
                    posC_R=-80;
                    limR=(int) Math.floor(Math.random()*(1250-700+1)+700);
                    vR=(int) Math.floor(Math.random()*(4-1+1)+1);
                }
            }
        };
        timer_c=new Timer(10,comandos2);
        
        timer_c.start();
        
        
        
}
    
}
