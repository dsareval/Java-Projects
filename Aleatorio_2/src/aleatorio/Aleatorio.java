/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package aleatorio;

import java.awt.Color;
import java.awt.event.*;
import javax.swing.*;

/**
 *
 * @author LABORATORIO
 */
public class Aleatorio extends JFrame implements KeyListener
{
    public JFrame ventana;
    public JLabel cir;
    public int posx, posx2, posx3, posy, posy2, cont,x,i;
    public Timer timer_r, timer_r_u, timer_r_d, timer_l, timer_d;
    public Icon imagen;
    public JLabel serp[]=new JLabel[500];
    
    public Aleatorio()
    {
        
        posx=50;
        posy=275;
        x=20;
        cont=1;
        
        ventana=new JFrame("Snake");
        ventana.setLayout(null);
        ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        ventana.setSize(498,498);
        ventana.setLocationRelativeTo(null);
        
        serp[0]=new JLabel();
        serp[0].setIcon(new ImageIcon(getClass().getResource("/Imagen/Circulo.jpg")));
        serp[0].setBounds(posx, posy, 20, 30);
        
        imagen=serp[0].getIcon();
        
        serp[1]=new JLabel();
        serp[1].setIcon(imagen);
        serp[1].setBounds(posx-20, posy, 20, 30);
        
        serp[2]=new JLabel();
        serp[2].setIcon(imagen);
        serp[2].setBounds(posx-40, posy, 20, 30);
        
        ventana.addKeyListener(this);
        
        ventana.getContentPane().add(serp[0]);
        ventana.getContentPane().add(serp[1]);
        ventana.getContentPane().add(serp[2]);
        ventana.setVisible(true);
        
        ActionListener move_right=new ActionListener() 
        {
            @Override
            public void actionPerformed(ActionEvent e) 
            {
                if (posx>=460)
                {
                    timer_r.stop();
                }
                else
                {
                    posx+=20;
                    posx2=posx-20;
                    posx3=posx-40;        
                    serp[0].setBounds(posx, posy, 20, 30);  
                    serp[1].setBounds(posx2, posy, 20, 30); 
                    serp[2].setBounds(posx3, posy, 20, 30); 
                }
                
            }
        };
        timer_r=new Timer(200,move_right);
        
         ActionListener move_r_up=new ActionListener() 
        {
            @Override
            public void actionPerformed(ActionEvent e) 
            {
                if (posy<=0)
                {
                    timer_r_u.stop();
                }
                else
                {
                    posy-=20;
                    serp[0].setBounds(posx, posy, 20, 30);
                    
                    if(i<=1)
                    {
                        serp[1].setBounds(posx2+=20, posy+20, 20, 30); 
                    }
                    else
                    {
                        serp[1].setBounds(posx, posy+20, 20, 30);
                    }
                    if(i<=2)
                    {
                        serp[2].setBounds(posx3+=20, posy+40, 20, 30); 
                    }
                    else
                    {
                        serp[2].setBounds(posx, posy+40, 20, 30);
                    }
                    i++;
                }
                
                
            }
        };
        timer_r_u=new Timer(400,move_r_up);
        
        ActionListener move_r_down=new ActionListener() 
        {
            @Override
            public void actionPerformed(ActionEvent e) 
            {                
                if (posy>=430)
                {
                    timer_r_d.stop();
                }
                else
                {
                    posy+=20;
                    serp[0].setBounds(posx, posy, 20, 30);
                    
                    if(i<=2)
                    {
                        serp[1].setBounds(posx2+=10, posy-10*i, 20, 30); 
                    }
                    else
                    {
                        serp[1].setBounds(posx, posy-20, 20, 30);
                    }
                    if(i<=4)
                    {
                        serp[2].setBounds(posx3+=10, posy-10*i, 20, 30); 
                    }
                    else
                    {
                        serp[2].setBounds(posx, posy-40, 20, 30);
                    }
                    i++;
                }
                
                
            }
        };
        timer_r_d=new Timer(200,move_r_down);
        
        ActionListener move_left=new ActionListener() 
        {
            @Override
            public void actionPerformed(ActionEvent e) 
            {
                if (posx<=0)
                {
                    timer_r.stop();
                }
                else
                {
                    posx-=20;
                    serp[0].setBounds(posx, posy, 20, 30);    
                    serp[1].setBounds(posx-20, posy, 20, 30);    
                    serp[2].setBounds(posx-40, posy, 20, 30);    
                }
            }
        };
        timer_l=new Timer(200,move_left);
        
        
         ActionListener move_down=new ActionListener() 
        {
            @Override
            public void actionPerformed(ActionEvent e) 
            {
                if (posy>=430)
                {
                    timer_r.stop();
                }
                else
                {
                posy+=20;
                    serp[0].setBounds(posx, posy, 20, 30); 
                }
                
            }
        };
        timer_d=new Timer(200,move_down);
    }

    @Override
    public void keyTyped(KeyEvent e) 
    {
        
    }

    @Override
    public void keyPressed(KeyEvent e) 
    {
        int key=e.getKeyCode();   
        
        if(key == KeyEvent.VK_RIGHT)
        {   
            if(!timer_l.isRunning())
            {
                timer_d.stop();
                timer_l.stop();
                timer_r_u.stop();
                timer_r.start();     
            }
        }
        
        if(key == KeyEvent.VK_UP)
        {
            i=0;
            if(timer_r.isRunning())
            {
                timer_d.stop();
                timer_l.stop();
                timer_r.stop();
                timer_r_u.start(); 
                timer_r_d.stop();
            }
        }
        
        if(key == KeyEvent.VK_LEFT)
        {            
            if(!timer_r.isRunning())
            {
            timer_d.stop();
            timer_r.stop();
            timer_r_u.stop();
            timer_l.start();    
            }
        }
        
        if(key == KeyEvent.VK_DOWN)
        {    
            i=0;
            if(timer_r.isRunning())
            {
                timer_r.stop();
                timer_l.stop();
                timer_r_u.stop();
                timer_d.stop();
                timer_r_d.start();
            }
        }
        
        if(key==KeyEvent.VK_ENTER)
        {
            if(cont%2==0)
            {
                serp[cont]=new JLabel();
                serp[cont].setIcon(new ImageIcon(getClass().getResource("/Imagen/Circulo.jpg")));
                serp[cont].setBounds(posx-20, posy, 20, 30);
                ventana.setSize(498,498);
                ventana.add(serp[cont]);
                cont++;
            }
            else
            {
                serp[cont]=new JLabel();
                serp[cont].setIcon(imagen);
                serp[cont].setBounds(posx-20, posy, 20, 30);
                ventana.setSize(497,498);
                ventana.add(serp[cont]);
                cont++;
            }
        }
    }

    @Override
    public void keyReleased(KeyEvent e) 
    {
        
    }
}
   
  
    
