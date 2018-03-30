
package pkg4enraya;


import java.awt.Image;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.*;


public class Ventana extends JFrame implements KeyListener 
{
    public JFrame ventana;
    public JLabel img;
    public int x = 25;
    public int y = 0;
    public int g,h;
    public int n;
    public int cont, cont2 ,cont3;
    public int i;
    public int j;
    public boolean r1, r2;
    public int posy, posy2, posy3, posy4;
    public JLabel vec [] = new JLabel[43];
    public JLabel vec2 [] = new JLabel[43];
    public int mat[][] = new int[6][7];
    public Icon Imagen, Imagen2;
    
    public Ventana()
    {
        ventana = new JFrame("4 en Raya");
        ventana.setBounds(100, 100, 600, 500);
        ventana.setLayout(null);
        ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        img = new JLabel();
        img.setBounds(10, 50, 400, 350);
        ImageIcon imgIcon = new ImageIcon(getClass().getResource("/imagen/4enfila2.png"));
        Image imgEscalada = imgIcon.getImage().getScaledInstance(img.getWidth(), img.getHeight(), Image.SCALE_SMOOTH);
        Icon iconoEscalado = new ImageIcon(imgEscalada);
        img.setIcon(iconoEscalado);
        
        
        if(r1)
        {
                vec[g] = new JLabel();
                vec[g].setBounds(x, y, 46, 46);
                ImageIcon img2Icon = new ImageIcon(getClass().getResource("/imagen/cir.png"));
                Image imgEscalad = img2Icon.getImage().getScaledInstance(vec[g].getWidth(), vec[g].getHeight(), Image.SCALE_SMOOTH);
                Icon iconoEscalad = new ImageIcon(imgEscalad);
                vec[g].setIcon(iconoEscalad);
                Imagen=vec[g].getIcon();
                
                ventana.addKeyListener((KeyListener) this);
                ventana.getContentPane().add(vec[g]);
                ventana.getContentPane().add(img);
                ventana.setVisible(true);
        }
        else
        {
                
                vec2[g] = new JLabel();
                vec2[g].setBounds(x, y, 46, 46);
                ImageIcon img2Icon = new ImageIcon(getClass().getResource("/imagen/cir2.png"));
                Image imgEscalad = img2Icon.getImage().getScaledInstance(vec2[g].getWidth(), vec2[g].getHeight(), Image.SCALE_SMOOTH);
                Icon iconoEscalad = new ImageIcon(imgEscalad);
                vec2[g].setIcon(iconoEscalad);
                Imagen2=vec2[g].getIcon();
                
                ventana.addKeyListener((KeyListener) this);
                ventana.getContentPane().add(vec2[g]);
                ventana.getContentPane().add(img);
                ventana.setVisible(true);
        }
    }
    
    
    
    @Override
    public void keyPressed(KeyEvent ke) 
    {
        
        if( ke.getKeyCode() == KeyEvent.VK_RIGHT )
                {
                    
                    if(x >= 318) 
                    {
                        if(r1==true)
                        {
                            vec[g].setLocation(x, y);
                        }
                        else
                        {
                            vec2[g].setLocation(x, y);
                        }
                    }
                    else
                    {
                        if(r1==true)
                        {
                            vec[g].setLocation(x+=53, y);
                        }
                        else
                        {
                            vec2[g].setLocation(x+=53, y);
                        }
                    }
                }
        
        
        
        if( ke.getKeyCode() == KeyEvent.VK_LEFT )
                 {
                     if(x == 25)
                     {
                         if(r1==true)
                         {
                             vec[g].setLocation(x, y);
                         }
                         else
                         {
                             vec2[g].setLocation(x, y);
                         }
                     }
                     else
                     {
                         if(r1==true)
                         {
                             vec[g].setLocation(x-=53, y);
                         }
                         else
                         {
                             vec2[g].setLocation(x-=53, y);
                         }
                     }
                 }
        
        
        
        
        if(ke.getKeyCode() == KeyEvent.VK_ENTER)
        {
            if(r1)
            {
            posy=336;
            for(cont=0;cont<=n;cont++)
            {
                if(vec[cont].getY()==336&&vec[cont].getX()==x)
                {
                    posy=280;  
                }
            }
            
            
            posy2=280;
            for(cont=0;cont<=n;cont++)
            {
                if(vec[cont].getY()==280&&vec[cont].getX()==x)
                {
                    posy=224;
                }
            }
            
             posy3=224;
            for(cont=0;cont<=n;cont++)
            {
                if(vec[cont].getY()==224&&vec[cont].getX()==x)
                {
                    posy=171;
                }
            }
            
             posy4=171;
            for(cont=0;cont<=n;cont++)
            {
                if(vec[cont].getY()==171&&vec[cont].getX()==x)
                {
                    posy=116;
                }
            }
            
             posy2=116;
            for(cont=0;cont<=n;cont++)
            {
                if(vec[cont].getY()==116&&vec[cont].getX()==x)
                {
                    posy=61;
                }
            }
            }
            else
            {
               posy=336;
               for(cont=0;cont<=n;cont++)
               {
                   if(vec2[cont].getY()==336&&vec2[cont].getX()==x)
                   {
                       posy=280;
                   }
            }
               posy2=280;
               for(cont=0;cont<=n;cont++)
               {
                   if(vec2[cont].getY()==280&&vec2[cont].getX()==x)
                   {
                       posy=224;
                   }
               }
               posy3=224;
               for(cont=0;cont<=n;cont++)
               {
                   if(vec2[cont].getY()==224&&vec2[cont].getX()==x)
                   {
                       posy=171;
                   }
               }
            
             posy4=171;
             for(cont=0;cont<=n;cont++)
             {
                if(vec2[cont].getY()==171&&vec2[cont].getX()==x)
                {
                    posy=116;
                }
            }
             posy2=116;
             for(cont=0;cont<=n;cont++)
             {
                 if(vec2[cont].getY()==116&&vec2[cont].getX()==x)
                {
                    posy=61;
                }
             }
            }
           
            cont2++;
            cont3 = cont2%2;
           if(cont3==0)
           {
               r1 = true;
           }
           else
           {
               r1=false;
           }
           
           
           if(r1)
           {
            n++;            
            vec[g].setLocation(x, y+posy);
            
            g++;
            vec[g] = new JLabel();
            vec[g].setIcon(Imagen);
            vec[g].setBounds(x, y, 46, 46);
            
            
            ventana.getContentPane().add(vec[g]);
            
           }
           else
           {   
            n++;            
            vec2[g].setLocation(x, y+posy);
            
            h++;
            vec2[g] = new JLabel();
            vec2[g].setIcon(Imagen2);
            vec2[g].setBounds(x, y, 46, 46);
            
            
            ventana.getContentPane().add(vec2[g]);
           }
            System.out.println(cont3);
            System.out.println(cont2);
           
        }
        
    }
    
        
    
    @Override
    public void keyTyped(KeyEvent ke) 
    {
    }

    
    @Override
    public void keyReleased(KeyEvent ke) 
    {
    }

    
}
