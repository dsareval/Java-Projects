/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package aleatorio;

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
    public int  cirx, ciry, cont,i,j, i2, j2,contpos_r[],contpos_u[],contpos_d[],contpos_l[],contador_r[],contador_u[],contador_d[],contador_l[],val_r[],val_u[],val_d[],val_l[],cont_r,cont_u,cont_d,cont_l,crear,contp;
    public int posx[]=new int [40];
    public int posy[]=new int[40];
    public Timer timer_u[]=new Timer[40];
    public Timer timer_d[]=new Timer[40];
    public Timer timer_l[]=new Timer[40];
    public Timer timer_r[]=new Timer[40];
    public Icon imagen;
    public JLabel serp[]=new JLabel[40];
    public boolean crecer;
    public char tecla;
    
    
    public Aleatorio()
    {        
        contpos_r=new int[40];
        contpos_u=new int[40];
        contpos_d=new int[40];
        contpos_l=new int[40];
        contador_r=new int[40];
        contador_u=new int[40];
        contador_d=new int[40];
        contador_l=new int[40];
        val_r=new int[40];
        val_u=new int[40];
        val_d=new int[40];
        val_l=new int[40];
        
        posx[0]=50;
        posy[0]=250;
        cirx=250;
        ciry=100;
        contp=1;
        
        ventana=new JFrame("Snake");
        ventana.setLayout(null);
        ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        ventana.setSize(498,498);
        ventana.setLocationRelativeTo(null);
        
        serp[0]=new JLabel();
        serp[0].setIcon(new ImageIcon(getClass().getResource("/Imagen/Circulo.jpg")));
        serp[0].setBounds(posx[0], posy[0], 20, 20);
        
        cir=new JLabel();
        cir.setIcon(new ImageIcon(getClass().getResource("/Imagen/Circulo_rosa.jpg")));
        cir.setBounds(cirx,ciry, 10,10);
        
        imagen=serp[0].getIcon();
        
        ventana.addKeyListener(this);
        
        ventana.getContentPane().add(serp[0]);
        ventana.getContentPane().add(cir);
        ventana.setVisible(true);
        
        ActionListener move_r=new ActionListener() 
        {
            @Override
            public void actionPerformed(ActionEvent e) 
            {
                if (posx[0]>=460)
                {
                    timer_r[cont_r].stop();
                }
                else
                {
                    if (tecla!='r')
                    {
                        
                        val_r[contp]++;
                        if(val_r[contp]>contador_r[contp])
                        {
                            contp++;
                            timer_r[cont_r].stop();
                        }                        
                    }
                    if(timer_u[cont_u].isRunning()||timer_d[cont_d].isRunning())
                    {
                        for(contpos_r[contp]=val_r[contp];contpos_r[contp]<=contador_r[contp];contpos_r[contp]++)
                        {
                            posx[contpos_r[contp]]+=20;
                            serp[contpos_r[contp]].setBounds(posx[contpos_r[contp]],posy[contpos_r[contp]],20,20);
                        }
                        if(contador_r[contp]<cont)
                        {
                            contador_r[contp]++;
                        }                        
                    }
                    else
                    {
                        if(contador_r[contp]<cont)
                        {
                            contador_r[contp]++;
                        }              
                        for(contpos_r[contp]=val_r[contp];contpos_r[contp]<=contador_r[contp];contpos_r[contp]++)
                        {
                            posx[contpos_r[contp]]+=20;
                            serp[contpos_r[contp]].setBounds(posx[contpos_r[contp]],posy[contpos_r[contp]],20,20);
                        }
                        
                    }
                }
                for(i=cirx;i<=cirx+10;i+=1)
                {
                    for(j=ciry;j<=ciry+10;j+=1)
                    {
                        for(i2=posx[0];i2<=posx[0]+20;i2+=1)
                        {
                            for(j2=posy[0]; j2<=posy[0]+20;j2+=1)
                            {
                                if(i2==i&&j2==j)
                                {
                                    cirx=(int) Math.floor(Math.random()*(461));
                                    ciry=(int) Math.floor(Math.random()*(431));
                                    cir.setLocation(cirx, ciry);
                                    crecer=true;
                                }
                            }
                        }
                    }
                }
                if(crecer)
                {
                    crecer=false;
                    cont++;
                    serp[cont]=new JLabel();
                    serp[cont].setIcon(imagen);
                    posx[cont]=posx[cont-1]-20;
                    posy[cont]=posy[cont-1];
                    serp[cont].setBounds(posx[cont], posy[cont], 20, 20);
                    ventana.getContentPane().add(serp[cont]);                    
                }               
            }
        };
        for(crear=0;crear<40;crear++)
        {
            timer_r[crear]=new Timer(200,move_r);
        }
        
        
         ActionListener move_u=new ActionListener() 
        {
            @Override
            public void actionPerformed(ActionEvent e) 
            {
                if (posy[0]<=0)
                {
                    timer_u[cont_u].stop();
                }
                else
                {
                    if (tecla!='u')
                    {
                        val_u[cont_u]++;
                        if(val_u[cont_u]>contador_u[cont_u])
                        {
                            timer_u[cont_u].stop();
                        }                        
                    }
                    if(timer_l[cont_l].isRunning()||timer_r[cont_r].isRunning())
                    {
                        for(contpos_u[cont_u]=val_u[cont_u];contpos_u[cont_u]<=contador_u[cont_u];contpos_u[cont_u]++)
                        {
                            posy[contpos_u[cont_u]]-=20;
                            serp[contpos_u[cont_u]].setBounds(posx[contpos_u[cont_u]],posy[contpos_u[cont_u]],20,20);
                        }
                        if(contador_u[cont_u]<cont)
                        {
                            contador_u[cont_u]++;
                        }
                        
                    }
                    else
                    {
                        if(contador_u[cont_u]<cont)
                    {
                        contador_u[cont_u]++;
                    }
                        for(contpos_u[cont_u]=val_u[cont_u];contpos_u[cont_u]<=contador_u[cont_u];contpos_u[cont_u]++)
                        {
                            posy[contpos_u[cont_u]]-=20;
                            serp[contpos_u[cont_u]].setBounds(posx[contpos_u[cont_u]],posy[contpos_u[cont_u]],20,20);
                        }
                    }
                    
                    
                }     
                
                for(i=cirx;i<=cirx+10;i+=1)
                {
                    for(j=ciry;j<=ciry+10;j+=1)
                    {
                        for(i2=posx[0];i2<=posx[0]+20;i2+=1)
                        {
                            for(j2=posy[0]; j2<=posy[0]+20;j2+=1)
                            {
                                if(i2==i&&j2==j)
                                {
                                    cirx=(int) Math.floor(Math.random()*(461));
                                    ciry=(int) Math.floor(Math.random()*(431));
                                    cir.setLocation(cirx, ciry);                                    
                                    crecer=true;                                    
                                }
                            }
                        }
                    }
                }
                
                if(crecer)
                {
                    crecer=false;
                    cont++;
                    serp[cont]=new JLabel();
                    serp[cont].setIcon(imagen);
                    posx[cont]=posx[cont-1];
                    posy[cont]=posy[cont-1]+20;
                    serp[cont].setBounds(posx[cont], posy[cont], 20, 20);
                    ventana.getContentPane().add(serp[cont]);                    
                }
                
                
                
                
            }
        };
        for(crear=0;crear<40;crear++)
        {
            timer_u[crear]=new Timer(200,move_u);
        }
        
        ActionListener move_d=new ActionListener() 
        {
            @Override
            public void actionPerformed(ActionEvent e) 
            {                
                if (posy[0]>=430)
                {
                    timer_d[cont_d].stop();
                }
                else
                {
                    if (tecla!='d')
                    {
                        val_d[cont_d]++;
                        if(val_d[cont_d]>contador_d[cont_d])
                        {
                            timer_d[cont_d].stop();
                        }
                    }
                    if(timer_l[cont_l].isRunning()||timer_r[cont_r].isRunning())
                    {
                        for(contpos_d[cont_d]=val_d[cont_d];contpos_d[cont_d]<=contador_d[cont_d];contpos_d[cont_d]++)
                    {
                        posy[contpos_d[cont_d]]+=20;
                        serp[contpos_d[cont_d]].setBounds(posx[contpos_d[cont_d]],posy[contpos_d[cont_d]],20,20);
                    }
                    if(contador_d[cont_d]<cont)
                    {
                        contador_d[cont_d]++;
                    }
                    
                    }
                    else
                    {
                        if(contador_d[cont_d]<cont)
                    {
                        contador_d[cont_d]++;
                    }
                        for(contpos_d[cont_d]=val_d[cont_d];contpos_d[cont_d]<=contador_d[cont_d];contpos_d[cont_d]++)
                    {
                        posy[contpos_d[cont_d]]+=20;
                        serp[contpos_d[cont_d]].setBounds(posx[contpos_d[cont_d]],posy[contpos_d[cont_d]],20,20);
                    }
                    }
                    
                }     
                
                for(i=cirx;i<=cirx+10;i+=1)
                {
                    for(j=ciry;j<=ciry+10;j+=1)
                    {
                        for(i2=posx[0];i2<=posx[0]+20;i2+=1)
                        {
                            for(j2=posy[0]; j2<=posy[0]+20;j2+=1)
                            {
                                if(i2==i&&j2==j)
                                {
                                    cirx=(int) Math.floor(Math.random()*(461));
                                    ciry=(int) Math.floor(Math.random()*(431));
                                    cir.setLocation(cirx, ciry);
                                    crecer=true;
                                }
                            }
                        }
                    }
                }
                
                if(crecer)
                {
                    crecer=false;
                    cont++;
                    serp[cont]=new JLabel();
                    serp[cont].setIcon(imagen);
                    posx[cont]=posx[cont-1];
                    posy[cont]=posy[cont-1]-20;
                    serp[cont].setBounds(posx[cont], posy[cont], 20, 20);
                    ventana.getContentPane().add(serp[cont]);                    
                }
                
            }
        };
        for(crear=0;crear<40;crear++)
        {
            timer_d[crear]=new Timer(200,move_d);
        }
        
        ActionListener move_l=new ActionListener() 
        {
            @Override
            public void actionPerformed(ActionEvent e) 
            {
                if (posx[0]<=0)
                {
                    timer_l[cont_l].stop();
                }
                else
                {
                    if (tecla!='l')
                    {
                        val_l[cont_l]++;
                        if(val_l[cont_l]>contador_l[cont_l])
                        {
                            timer_l[cont_l].stop();
                        }
                    }
                    if(timer_u[cont_u].isRunning()||timer_d[cont_d].isRunning())
                    {
                        for(contpos_l[cont_l]=val_l[cont_l];contpos_l[cont_l]<=contador_l[cont_l];contpos_l[cont_l]++)
                    {
                        posx[contpos_l[cont_l]]-=20;
                        serp[contpos_l[cont_l]].setBounds(posx[contpos_l[cont_l]],posy[contpos_l[cont_l]],20,20);
                    }
                    if(contador_l[cont_l]<cont)
                    {
                        contador_l[cont_l]++;
                    }  
                    
                    }
                    else
                    {
                        if(contador_l[cont_l]<cont)
                        {
                            contador_l[cont_l]++;
                        }  
                        for(contpos_l[cont_l]=val_l[cont_l];contpos_l[cont_l]<=contador_l[cont_l];contpos_l[cont_l]++)
                    {
                        posx[contpos_l[cont_l]]-=20;
                        serp[contpos_l[cont_l]].setBounds(posx[contpos_l[cont_l]],posy[contpos_l[cont_l]],20,20);
                    }
                    }
                              
                }
                
                for(i=cirx;i<=cirx+10;i+=1)
                {
                    for(j=ciry;j<=ciry+10;j+=1)
                    {
                        for(i2=posx[0];i2<=posx[0]+20;i2+=1)
                        {
                            for(j2=posy[0]; j2<=posy[0]+20;j2+=1)
                            {
                                if(i2==i&&j2==j)
                                {
                                    cirx=(int) Math.floor(Math.random()*(461));
                                    ciry=(int) Math.floor(Math.random()*(431));
                                    cir.setLocation(cirx, ciry);
                                    crecer=true;
                                }
                            }
                        }
                    }
                }
                if(crecer)
                {
                    crecer=false;
                    cont++;
                    serp[cont]=new JLabel();
                    serp[cont].setIcon(imagen);
                    posx[cont]=posx[cont-1]+20;
                    posy[cont]=posy[cont-1];
                    serp[cont].setBounds(posx[cont], posy[cont], 20, 20);
                    ventana.getContentPane().add(serp[cont]);                    
                }
            }
        };
        for(crear=0;crear<40;crear++)
        {
            timer_l[crear]=new Timer(200,move_l);
        }
        
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
            if(tecla!='l'&&tecla!='r')
            {
                cont_r++;
                System.out.println(cont_r);
                System.out.println(timer_r[1].isRunning());
                timer_r[cont_r].start();
                
                tecla='r';
                val_r[cont_r]=0;
                contador_r[cont_r]=0;
                
                
            }            
        }
        
        if(key == KeyEvent.VK_UP)
        {
            if(tecla!='d'&&tecla!='u')
            {
                cont_u++;
                timer_u[cont_u].start();
                
                tecla='u';
                val_u[cont_u]=0;
                contador_u[cont_u]=0;
                
                
                
            }            
        }
        
        if(key == KeyEvent.VK_LEFT)
        {    
            if(tecla!='r'&&tecla!='l')
            {
                cont_l++;
                timer_l[cont_l].start();
                
                tecla='l';
                val_l[cont_l]=0;
                contador_l[cont_l]=0;
                
            }
        }
        
        if(key == KeyEvent.VK_DOWN)
        {    
            if(tecla!='d'&&tecla!='u')
            {
                cont_d++;
                timer_d[cont_d].start();
                
                tecla='d';
                val_d[cont_d]=0;
                contador_d[cont_d]=0;
                
            }
        }
    }

    @Override
    public void keyReleased(KeyEvent e) 
    {
        
    }
}
   
  
    
