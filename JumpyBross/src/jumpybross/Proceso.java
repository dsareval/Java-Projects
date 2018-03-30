
package jumpybross;

import java.awt.Image;
import java.awt.event.*;
import java.awt.event.KeyListener;
import javax.swing.*;


public class Proceso  extends JFrame implements KeyListener
{
    public JFrame v;
    public JFrame v2;
    public JLabel m1;
    public JLabel m2;
    public JLabel m3;
    public JLabel m4;
    public JLabel m5;
    public JLabel dk;
    public JLabel dk2;
    public JLabel dk3;
    public JLabel dk4;
    public JLabel go;
    public int c,c2=690;
    public int s;
    public int j,i;
    public int x1,x2,x3,x4,x5,x6,xs,x,xm1,xm2;
    public int ys,yd,y1,y2,ym3,ym1,ym2;
    public int vel,t;
    
    public Proceso()
    {
        v = new JFrame("Jumpy Bross");
        v.setBounds(100, 100, 550, 363);
        v.setLayout(null);
        v.setVisible(true);
        v.addKeyListener((KeyListener) this);
        v.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        v2 = new JFrame();
        v2.setBounds(220, 225, 300, 120);
        v2.setLayout(null);
        v2.repaint();  
        
        m1 = new JLabel();
        m1.setBounds(10, 245, 32, 55);
        ImageIcon imgIcon = new ImageIcon(getClass().getResource("/Imagen/m1.png"));
        Image imgEscalada = imgIcon.getImage().getScaledInstance(m1.getWidth(), m1.getHeight(), Image.SCALE_SMOOTH);
        Icon iconoEscalado = new ImageIcon(imgEscalada);
        m1.setIcon(iconoEscalado);
        
        m2 = new JLabel();
        m2.setBounds(10, 245, 32, 55);
        ImageIcon imgIcon2 = new ImageIcon(getClass().getResource("/Imagen/m2.png"));
        Image imgEscalada2 = imgIcon2.getImage().getScaledInstance(m2.getWidth(), m2.getHeight(), Image.SCALE_SMOOTH);
        Icon iconoEscalado2 = new ImageIcon(imgEscalada2);
        m2.setIcon(iconoEscalado2);
        
        m3 = new JLabel();
        m3.setBounds(10, 150, 32, 55);
        ImageIcon imgIcon3 = new ImageIcon(getClass().getResource("/Imagen/m3.png"));
        Image imgEscalada3 = imgIcon3.getImage().getScaledInstance(m3.getWidth(), m3.getHeight(), Image.SCALE_SMOOTH);
        Icon iconoEscalado3 = new ImageIcon(imgEscalada3);
        m3.setIcon(iconoEscalado3);
        
        m4 = new JLabel();
        m4.setBounds(0, 0, 700, 325);
        ImageIcon imgIcon4 = new ImageIcon(getClass().getResource("/Imagen/mm.png"));
        Image imgEscalada4 = imgIcon4.getImage().getScaledInstance(m4.getWidth(), m4.getHeight(), Image.SCALE_SMOOTH);
        Icon iconoEscalado4 = new ImageIcon(imgEscalada4);
        m4.setIcon(iconoEscalado4);
        
        m5 = new JLabel();
        m5.setBounds(690, 0, 700, 325);
        ImageIcon imgIcon5 = new ImageIcon(getClass().getResource("/Imagen/mm1.png"));
        Image imgEscalada5 = imgIcon5.getImage().getScaledInstance(m5.getWidth(), m5.getHeight(), Image.SCALE_SMOOTH);
        Icon iconoEscalado5 = new ImageIcon(imgEscalada5);
        m5.setIcon(iconoEscalado5);
        
        dk = new JLabel();
        dk.setBounds(250, 255, 32, 45);
        ImageIcon imgIcon6 = new ImageIcon(getClass().getResource("/Imagen/dk.png"));
        Image imgEscalada6 = imgIcon6.getImage().getScaledInstance(dk.getWidth(), dk.getHeight(), Image.SCALE_SMOOTH);
        Icon iconoEscalado6 = new ImageIcon(imgEscalada6);
        dk.setIcon(iconoEscalado6);
        
        dk2 = new JLabel();
        dk2.setBounds(400, 255, 32, 45);
        ImageIcon imgIcon7 = new ImageIcon(getClass().getResource("/Imagen/dk.png"));
        Image imgEscalada7 = imgIcon7.getImage().getScaledInstance(dk2.getWidth(), dk2.getHeight(), Image.SCALE_SMOOTH);
        Icon iconoEscalado7 = new ImageIcon(imgEscalada7);
        dk2.setIcon(iconoEscalado7);
        
        dk3 = new JLabel();
        dk3.setBounds(550, 255, 32, 45);
        ImageIcon imgIcon8 = new ImageIcon(getClass().getResource("/Imagen/dk.png"));
        Image imgEscalada8 = imgIcon8.getImage().getScaledInstance(dk3.getWidth(), dk3.getHeight(), Image.SCALE_SMOOTH);
        Icon iconoEscalado8 = new ImageIcon(imgEscalada8);
        dk3.setIcon(iconoEscalado8);
        
        dk4 = new JLabel();
        dk4.setBounds(700, 255, 32, 45);
        ImageIcon imgIcon9 = new ImageIcon(getClass().getResource("/Imagen/dk.png"));
        Image imgEscalada9 = imgIcon9.getImage().getScaledInstance(dk4.getWidth(), dk4.getHeight(), Image.SCALE_SMOOTH);
        Icon iconoEscalado9 = new ImageIcon(imgEscalada9);
        dk4.setIcon(iconoEscalado9);
        
        go = new JLabel();
        go.setBounds(0, 0, 285, 80);
        ImageIcon imgIcon10 = new ImageIcon(getClass().getResource("/Imagen/gamerover.png"));
        Image imgEscalada10 = imgIcon10.getImage().getScaledInstance(go.getWidth(), go.getHeight(), Image.SCALE_SMOOTH);
        Icon iconoEscalado10 = new ImageIcon(imgEscalada10);
        go.setIcon(iconoEscalado10);
        
        v.getContentPane().add(m1);
        v.getContentPane().add(m2);
        v.getContentPane().add(m3);
        v.getContentPane().add(dk);
        v.getContentPane().add(dk2);
        v.getContentPane().add(dk3);
        v.getContentPane().add(dk4);
        v.getContentPane().add(m4);
        v.getContentPane().add(m5);
        v2.getContentPane().add(go);
        
        m3.setVisible(false);
        m2.setVisible(false);
        v2.setVisible(false);
        
        
    }
    @Override
    public void keyTyped(KeyEvent ke)
    {
        
    }

    @Override
    public void keyPressed(KeyEvent ke)
    {
        if(ke.getKeyCode() == KeyEvent.VK_ENTER)
        {
            t2.start();
            t3.start();
            t5.start();
        }
    }

    @Override
    public void keyReleased(KeyEvent ke) 
    {
        if(ke.getKeyCode() == KeyEvent.VK_ENTER)
        {
            m1.setLocation(10, m3.getY());
            m2.setLocation(10, m3.getY());
            
            if(m3.getY()>150)
            {
                m3.setLocation(10, yd);
            }
            else
            {
                m3.setLocation(10, ys);
            }
            
            System.out.println(ys);
            
            ys=m3.getLocation().y;
            
            if(ys<245)
            {
                t5.stop();
                t1.stop();
                t4.start();
                m1.setVisible(false);
                m2.setVisible(false); 
                m3.setVisible(true);
            }
            else
            {
                m3.setVisible(false);
                t4.stop();
                t5.stop();
                t1.start();
                
            }
        }
    }
    
     Timer t1 = new Timer ( 75, new ActionListener() {

        @Override
        public void actionPerformed(ActionEvent ae) 
        {
            //movimiento mario
            MovMario();
            Validar();
            
        }
        
    });
     
     Timer t2 = new Timer ( 10, new ActionListener() {

        @Override
        public void actionPerformed(ActionEvent ae) 
        {
            //fondo pantalla
            FondodeP();
        }
        
    });
     
     Timer t3 = new Timer ( 10, new ActionListener() {

        @Override
        public void actionPerformed(ActionEvent ae) 
        {
            //barriles
            Barriles();
        }
        
    });
     
     Timer t4 = new Timer ( 7, new ActionListener() {

        @Override
        public void actionPerformed(ActionEvent ae) 
        {
            ys=m3.getLocation().y;
            
            ys++;
            
            m3.setLocation(10, ys);
            
            if(ys<244)
            {
                ValidarY();
                t5.stop();
                t1.stop();
                t4.start();
                m1.setVisible(false);
                m2.setVisible(false); 
                m3.setVisible(true);
            }
            else
            {
                ValidarY();
                m3.setVisible(false);
                t4.stop();
                t5.stop();
                t1.start();
                
            }
        }
    });
     
     Timer t5 = new Timer ( 7, new ActionListener() {

        @Override
        public void actionPerformed(ActionEvent ae) 
        {
            
            yd = m3.getLocation().y;
            
            yd--;
            
            m3.setLocation(10, yd);
            
            if(yd>150)
                {
                    ValidarY();
                    t1.stop();
                    t4.stop();
                    t5.start();
                    m1.setVisible(false);
                    m2.setVisible(false);
                    m3.setVisible(true);
                }
                else
                {
                    ValidarY();
                    t1.stop();
                    t5.stop();
                    t4.start();
                    m1.setVisible(false);
                    m2.setVisible(false);
                    m3.setVisible(true);
                }
        }
        
    });
     
     public void MovMario()
     {
         c++;
         if(c%2==0)
            {
                m1.setVisible(true);
                m2.setVisible(false);
                m3.setVisible(false);
            }
            else
            {
                m2.setVisible(true);
                m1.setVisible(false);
                m3.setVisible(false);
            }
         
     }
     
     public void FondodeP()
     {
            x1 = m4.getLocation().x;
            x2 = m5.getLocation().x;
            
            x1--;
            x2--;
            
            m4.setLocation(x1, 0);
            m5.setLocation(x2, 0);
            
            if(x1 <=-700)
            {
                x1=690;
                m4.setLocation(x1, 0);
            }
            if(x2 <= -700)
            {
                x2=690;
                m5.setLocation(x2, 0);
            }
     }
     
     public void Barriles()
     {
            x3 = dk.getLocation().x;
            x4 = dk2.getLocation().x;
            x5 = dk3.getLocation().x;
            x6 = dk4.getLocation().x;
            
            x3--;
            x4--;
            x5--;
            x6--;
            
            dk.setLocation(x3, 255);
            dk2.setLocation(x4, 255);
            dk3.setLocation(x5, 255);
            dk4.setLocation(x6, 255);
            
            if(x3<=-55)
            {
                x3=250;
                dk.setLocation(x3+300, 255);
            }
            if(x4<=-55)
            {
                x4=250;
                dk2.setLocation(x4+300, 255);
            }
            if(x5<=-55)
            {
                x5=250;
                dk3.setLocation(x5+300, 255);
            }
            if(x6<=-55)
            {
                x6=250;
                dk4.setLocation(x6+300, 255);
            }
     }
     
     public void Validar()
     {
         xm1 = m1.getLocation().x;
         xm2 = m2.getLocation().x;
         
         for(j=0;j<=32;j++)
         {
         if(xm1==(dk.getX()+j)-32||xm1==(dk2.getX()+j)-32||xm1==(dk3.getX()+j)-32||xm1==(dk4.getX()+j)-32)
         {
             System.out.println("perdiste");
             t1.stop();
             t2.stop();
             t3.stop();
             t4.stop();
             t5.stop(); 
             GameOver();
         }
         if(xm2==(dk.getX()+j)-32||xm2==(dk2.getX()+j)-32||xm2==(dk3.getX()+j)-32||xm2==(dk4.getX()+j)-32)
         {
             System.out.println("perdiste");
             t1.stop();
             t2.stop();
             t3.stop();
             t4.stop();
             t5.stop(); 
             GameOver();
         }
         }
     }
     
     public void ValidarY()
     {
         ym3 = m3.getLocation().y;
         x = m3.getLocation().x;
         for(j=0;j<=32;j++)
         {
         if(ym3==dk.getY()&&x3==(dk.getX()+j)-32||ym3==dk2.getY()&&x3==(dk.getX()+j)-32||ym3==dk3.getY()&&x3==(dk.getX()+j)-32||ym3==dk4.getY()&&x3==(dk.getX()+j)-32)
            {
                System.out.println("perdistey");
                t1.stop();
                t2.stop();
                t3.stop();
                t4.stop();
                t5.stop(); 
                GameOver();
            }
         }
     }
     
     public void GameOver()
         {
             v2.setVisible(true);
         }
}
