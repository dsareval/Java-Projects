
package pkg4enraya;

import java.awt.Color;
import java.awt.Image;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;


public class Proceso extends JFrame implements KeyListener
{
    public JFrame ven;
    public JLabel img;
    public JLabel f1 ;
    public JLabel f2;
    public Icon Imagen;
    public Icon Imagen2;
    public int op = 0;
    public int x = 25, y = 0;
    public int posy;
    public int a,b;
    public int ord[][] = new int[7][6];
    
    public Proceso() 
    {
        ven = new JFrame("4 en Raya");
        ven.setBounds(100, 100, 600, 500);
        ven.setLayout(null);
        ven.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        ven.addKeyListener((KeyListener) this);
        
        img = new JLabel();
        img.setBounds(10, 50, 400, 350);
        ImageIcon imgIcon = new ImageIcon(getClass().getResource("/Imagen/4enfila2.png"));
        Image imgEscalada = imgIcon.getImage().getScaledInstance(img.getWidth(), img.getHeight(), Image.SCALE_SMOOTH);
        Icon iconoEscalado = new ImageIcon(imgEscalada);
        img.setIcon(iconoEscalado);
        
        if((op%2) == 0)
            {
                
                f1 = new JLabel();
                f1.setBounds(x, y, 46, 46);
                ImageIcon img2Icon = new ImageIcon(getClass().getResource("/Imagen/cir.png"));
                Image imgEscalad = img2Icon.getImage().getScaledInstance(f1.getWidth(), f1.getHeight(), Image.SCALE_SMOOTH);
                Icon iconoEscalad = new ImageIcon(imgEscalad);
                f1.setIcon(iconoEscalad);
                Imagen=f1.getIcon();
                ven.getContentPane().add(f1);
            }
            else
            {
                
                f2 = new JLabel();
                f2.setBounds(x, y, 46, 46);
                ImageIcon imgIcon2 = new ImageIcon(getClass().getResource("/imagen/cir2.png"));
                Image imgEscalado = imgIcon2.getImage().getScaledInstance(f2.getWidth(), f2.getHeight(), Image.SCALE_SMOOTH);
                Icon iconoEscalado2 = new ImageIcon(imgEscalado);
                f2.setIcon(iconoEscalado2);
                Imagen2= f2.getIcon();
                ven.getContentPane().add(f2);
                f2.setLocation(x, y+336);
            }
        
        ven.getContentPane().add(img); 
        ven.setVisible(true);
        ven.getContentPane().setBackground(Color.orange);
        
    }

    @Override
    public void keyPressed(KeyEvent ke) 
    {
        if( ke.getKeyCode() == KeyEvent.VK_RIGHT )
                { 
                    if(x >= 318) 
                    {
                        if((op%2)==0)
                        {
                            f1.setLocation(x, y);
                        }
                        else
                        {
                            f2.setLocation(x,y);
                        }
                    }
                    else
                    {
                        if((op%2)==0)
                        {
                            f1.setLocation(x+=53, y);
                        }
                        else
                        {
                            f2.setLocation(x+=53, y);
                        }
                            
                    }
                }
        
        if( ke.getKeyCode() == KeyEvent.VK_LEFT )
                 {
                     if(x == 25)
                     {
                         if((op%2)==0)
                         {
                             f1.setLocation(x, y);
                         }  
                         else
                         {
                             f2.setLocation(x, y);
                         }
                     }
                     else
                     {
                         if((op%2)==0)
                         {
                             f1.setLocation(x-=53, y);
                         }
                         else
                         {
                             f2.setLocation(x-=53, y);
                         }     
                     }
                 }
        
        if(ke.getKeyCode() == KeyEvent.VK_ENTER)
        {
            if((op%2)==0)
            {
                if(op>1)
                {
                    if(f2.getY()==336&&f2.getX()==x)
                    {
                        f1.setLocation(x, y+280);
                    }
                    else
                    {
                    f1.setLocation(x, y+336);
                    }
                }
                else
                {
                    f1.setLocation(x, y+336);
                }
                
                
            }
            else
            {
                    if(f1.getY()==336&&f1.getX()==x)
                    {
                        f2.setLocation(x, y+280);
                    }
                    else
                    {
                        f2.setLocation(x, y+336);
                    }
                
            }
            
            op++;
            if((op%2) == 0)
            {
                a=1;
                f1 = new JLabel();
                f1.setBounds(x, y, 46, 46);
                ImageIcon img2Icon = new ImageIcon(getClass().getResource("/Imagen/cir.png"));
                Image imgEscalad = img2Icon.getImage().getScaledInstance(f1.getWidth(), f1.getHeight(), Image.SCALE_SMOOTH);
                Icon iconoEscalad = new ImageIcon(imgEscalad);
                f1.setIcon(iconoEscalad);
                Imagen=f1.getIcon();
                ven.getContentPane().add(f1);
            }
            else
            {
                b=2;
                f2 = new JLabel();
                f2.setBounds(x, y, 46, 46);
                ImageIcon imgIcon2 = new ImageIcon(getClass().getResource("/imagen/cir2.png"));
                Image imgEscalado = imgIcon2.getImage().getScaledInstance(f2.getWidth(), f2.getHeight(), Image.SCALE_SMOOTH);
                Icon iconoEscalado2 = new ImageIcon(imgEscalado);
                f2.setIcon(iconoEscalado2);
                Imagen2= f2.getIcon();
                ven.getContentPane().add(f2);
            }
            System.out.println(op%2+"residuo");
            System.out.println(a+"a");
            System.out.println(b+"b");
            ven.getContentPane().add(img);
            
        }
        
    }

    @Override
    public void keyReleased(KeyEvent ke)
    {
    }
    
    @Override
    public void keyTyped(KeyEvent ke)
    {
       
    }
    
}
