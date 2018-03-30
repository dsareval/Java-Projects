/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package juego;

import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.Timer;

/**
 *
 * @author Josep Love
 */
public class games extends JFrame implements KeyListener
{
    public JFrame w, w1;
    public JLabel lbl1,lblpuntaje,lblvidas,lbl2,lbl3;
    public int cont, numr,i1,i2,i3, i4, i5, posxcan, i, j, puntaje,vidas;
    public int posx[]= new int[1000];
    public int posy[]= new int[1000];
    public Icon imagen;
    public Timer timer, timer2, timer3, timer4, timer5, timerf;
    public JLabel vec[]=new JLabel[1000];
    
    public games()
    {
        posx[0]=50;//posicion manzana 1
        posx[1]=150;
        posx[2]=250;
        posx[3]=350;
        posx[4]=450;
        posxcan=25;//posicion canasta
        cont=1;
        i1=0;
        i2=1;
        i3=2;
        i4=3;
        i5=4;
        vidas=3;
        
        w = new JFrame("MiniJuegos José&&Josep");
        w.setSize(750, 462);
        w.setLayout(null);
        w.setLocationRelativeTo(null);
        w.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        w.addKeyListener(this);
        
        w1 = new JFrame("SCORE");
        w1.setSize(250, 250);
        w1.setLayout(null);
        w1.setLocationRelativeTo(null);
        w1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        lbl2=new JLabel();
        lbl2.setBounds(0, 0, 100, 75);
        ImageIcon imgIcon2 = new ImageIcon(getClass().getResource("/picture/images (1).jpg"));
        Image imgEscalada2 = imgIcon2.getImage().getScaledInstance(lbl2.getWidth(), lbl2.getHeight(), Image.SCALE_SMOOTH);
        Icon iconoEscalado2 = new ImageIcon(imgEscalada2);        
        lbl2.setIcon(iconoEscalado2);
        
        vec[0]=new JLabel();
        vec[0].setIcon(new ImageIcon(getClass().getResource("/picture/appletwo.png")));
        vec[0].setBounds(posx[0], 10, 50, 50);
        
        imagen=vec[0].getIcon();
        
        vec[1]=new JLabel();
        vec[1].setIcon(imagen);
        vec[1].setBounds(posx[1], 10, 50, 50);
        
        vec[2]=new JLabel();
        vec[2].setIcon(imagen);
        vec[2].setBounds(posx[2], 10, 50, 50);
        
        vec[3]=new JLabel();
        vec[3].setIcon(imagen);
        vec[3].setBounds(posx[3], 10, 50, 50);
        
        vec[4]=new JLabel();
        vec[4].setIcon(imagen);
        vec[4].setBounds(posx[4], 10, 50, 50);
        
        lbl1=new JLabel();
        lbl1.setBounds(posxcan, 350, 100, 75);
        ImageIcon imgIcon = new ImageIcon(getClass().getResource("/picture/e.png"));
        Image imgEscalada = imgIcon.getImage().getScaledInstance(lbl1.getWidth(), lbl1.getHeight(), Image.SCALE_SMOOTH);
        Icon iconoEscalado = new ImageIcon(imgEscalada);        
        lbl1.setIcon(iconoEscalado);
        
        lblvidas=new JLabel("vidas:  "+vidas);
        lblvidas.setBounds(550, 50, 100, 50);
        
        lblpuntaje=new JLabel("puntaje:  "+puntaje);
        lblpuntaje.setBounds(550, 150, 100, 50);
       
         
        w.setVisible(true);
        w.getContentPane().add(lbl1);
        w.getContentPane().add(vec[0]);
        w.getContentPane().add(lblvidas);
        w.getContentPane().add(lblpuntaje);
        w1.getContentPane().add(lbl2);
        
        ActionListener task=new ActionListener() 
        {
            @Override
            public void actionPerformed(ActionEvent e) 
            {
                if(posy[i1]<=475)
                {
                    vec[i1].setBounds(posx[i1], posy[i1]+=10,50,50); 
                    if(posy[i1]==300)
                    {
                        if(posx[i1]-25==posxcan)
                        {
                            puntaje+=100;
                            lblpuntaje.setText("puntaje: "+puntaje);
                            vec[i1].setVisible(false);
                        }
                        else
                        {
                            vidas--;
                            lblvidas.setText("vidas: "+vidas);
                        } 
                        if(vidas==0)
                        {                            
                            w.setVisible(false);
                            w1.setVisible(true);
                        } 
                    }
                }
                else
                {                    
                    i1+=5;
                    numr=(int)Math.floor(Math.random()*4);
                    switch(numr)
                    {
                        case 0:
                            posx[i1]=50;
                            break;
                        case 1:
                            posx[i1]=150;
                            break;
                        case 2:
                            posx[i1]=250;
                            break;
                        case 3:
                            posx[i1]=350;
                            break;    
                        case 4:
                            posx[i1]=450;
                            break;  
                    }
                }
                
            }
        };
        timer=new Timer(100,task);
        
        ActionListener task2=new ActionListener() 
        {
            @Override
            public void actionPerformed(ActionEvent e) 
            {
                
                if(posy[i2]<=475)
                {
                    vec[i2].setBounds(posx[i2], posy[i2]+=10,50,50); 
                    if(posy[i2]==300)
                    {
                        if(posx[i2]-25==posxcan)
                        {
                            puntaje+=100;
                            lblpuntaje.setText("puntaje: "+puntaje);
                        }
                        else
                        {
                            vidas--;
                            lblvidas.setText("vidas: "+vidas);
                        }            
                        if(vidas==0)
                        {                            
                            w.setVisible(false);
                            w1.setVisible(true);
                        } 
                    }
                }
                else
                {
                    i2+=5;
                    numr=(int)Math.floor(Math.random()*4);
                    switch(numr)
                    {
                        case 0:
                            posx[i2]=50;
                            break;
                        case 1:
                            posx[i2]=150;
                            break;
                        case 2:
                            posx[i2]=250;
                            break;
                        case 3:
                            posx[i2]=350;
                            break;    
                        case 4:
                            posx[i2]=450;
                            break;  
                    }
                }
                
            }
        };
        timer2=new Timer(100,task2);
        timer2.setInitialDelay(1000);
        
        ActionListener task3=new ActionListener() 
        {
            @Override
            public void actionPerformed(ActionEvent e) 
            {
                if(posy[i3]<=475)
                {
                    vec[i3].setBounds(posx[i3], posy[i3]+=10,50,50); 
                    if(posy[i3]==300)
                    {
                        if(posx[i3]-25==posxcan)
                        {
                            puntaje+=100;
                            lblpuntaje.setText("puntaje: "+puntaje);
                        }
                        else
                        {
                            vidas--;
                            lblvidas.setText("vidas: "+vidas);
                        }           
                        if(vidas==0)
                        {                            
                            w.setVisible(false);
                            w1.setVisible(true);
                        } 
                    }
                }
                else
                {
                    i3+=5;
                    numr=(int)Math.floor(Math.random()*4);
                    switch(numr)
                    {
                        case 0:
                            posx[i3]=50;
                            break;
                        case 1:
                            posx[i3]=150;
                            break;
                        case 2:
                            posx[i3]=250;
                            break;
                        case 3:
                            posx[i3]=350;
                            break;    
                        case 4:
                            posx[i3]=450;
                            break;  
                    }
                }    
            }
        };
        timer3=new Timer(100,task3);
        timer3.setInitialDelay(2000);
        
        ActionListener task4=new ActionListener() 
        {
            @Override
            public void actionPerformed(ActionEvent e) 
            {
                if(posy[i4]<=475)
                {
                    vec[i4].setBounds(posx[i4], posy[i4]+=10,50,50); 
                    if(posy[i4]==300)
                    {
                        if(posx[i4]-25==posxcan)
                        {
                            puntaje+=100;
                            lblpuntaje.setText("puntaje: "+puntaje);
                        }
                        else
                        {
                            vidas--;
                            lblvidas.setText("vidas: "+vidas);
                        }          
                        if(vidas==0)
                        {                            
                            w.setVisible(false);
                            w1.setVisible(true);
                        }                            
                    }
                }
                else
                {
                    i4+=5;
                    numr=(int)Math.floor(Math.random()*4);
                    switch(numr)
                    {
                        case 0:
                            posx[i4]=50;
                            break;
                        case 1:
                            posx[i4]=150;
                            break;
                        case 2:
                            posx[i4]=250;
                            break;
                        case 3:
                            posx[i4]=350;
                            break;    
                        case 4:
                            posx[i4]=450;
                            break;  
                    }
                }    
            }
        };
        timer4=new Timer(100,task4);
        timer4.setInitialDelay(3000);
        
        ActionListener task5=new ActionListener() 
        {
            @Override
            public void actionPerformed(ActionEvent e) 
            {
                if(posy[i5]<=475)
                {
                    vec[i5].setBounds(posx[i5], posy[i5]+=10,50,50);
                    if(posy[i5]==300)
                    {
                        if(posx[i5]-25==posxcan)
                        {
                            puntaje+=100;
                            lblpuntaje.setText("puntaje: "+puntaje);
                        }
                        else
                        {
                            vidas--;
                            lblvidas.setText("vidas: "+vidas);
                        }         
                        if(vidas==0)
                        {                            
                            w.setVisible(false);
                            w1.setVisible(true);
                        } 
                    }
                    
                }
                else
                {                    
                    i5+=5;
                    numr=(int)Math.floor(Math.random()*4);
                    switch(numr)
                    {
                        case 0:
                            posx[i5]=50;
                            break;
                        case 1:
                            posx[i5]=150;
                            break;
                        case 2:
                            posx[i5]=250;
                            break;
                        case 3:
                            posx[i5]=350;
                            break;    
                        case 4:
                            posx[i5]=450;
                            break;  
                    }
                }    
            }
        };
        timer5=new Timer(100,task5);
        timer5.setInitialDelay(4000);
        
        ActionListener comando=new ActionListener() 
        {
            @Override
            public void actionPerformed(ActionEvent e) 
            {
                vec[cont]=new JLabel();//va asignando labels a las posiciones del vector
                vec[cont].setIcon(imagen);                
                w.getContentPane().add(vec[cont]);
                cont++;    
            }
        };
        timerf=new Timer(1000,comando);
        
        timer.start();
        timer2.start();
        timer3.start();
        timer4.start();
        timer5.start();
        timerf.start();
        
    }    

    @Override
    public void keyPressed(KeyEvent e) 
    {
        if(e.getKeyCode()==KeyEvent.VK_RIGHT)
        {
            if(posxcan!=425)
            {
                posxcan+=100;
                lbl1.setBounds(posxcan, 350, 100, 75);
            }
            
        }
        
        if(e.getKeyCode()==KeyEvent.VK_LEFT)
        {
            if(posxcan!=25)
            {
                posxcan-=100;
                lbl1.setBounds(posxcan, 350, 100, 75);
            }
            
        }
    }
    
    @Override
    public void keyTyped(KeyEvent e) 
    {

    }  

    @Override
    public void keyReleased(KeyEvent e) 
    {
        
    }
}
