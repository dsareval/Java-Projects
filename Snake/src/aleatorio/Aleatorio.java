/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package aleatorio;

import java.awt.event.*;
import java.util.Timer;
import java.util.TimerTask;
import javax.swing.*;

/**
 *
 * @author LABORATORIO
 */
public class Aleatorio extends JFrame implements ActionListener, KeyListener
{
    public JFrame ventana;
    public JLabel lblnum1;
    public JButton btn;
    public int posx,posy;
    public Timer timer;
    public boolean right;
    
    public Aleatorio()
    {
        posx=50;
        posy=275;
        
        ventana=new JFrame("Random Number");
        ventana.setLayout(null);
        ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        ventana.setSize(500,500);
        ventana.setLocationRelativeTo(null);
        
        lblnum1=new JLabel();
        lblnum1.setIcon(new ImageIcon(getClass().getResource("/Imagen/Circulo.jpg")));
        lblnum1.setBounds(posx, posy, 200, 30);
        lblnum1.setFocusable(true);
        lblnum1.addKeyListener(this);
        
        btn=new JButton("hola");
        btn.setBounds(50, 50, 100, 10);
        btn.addActionListener (this);
        
        ventana.addKeyListener(this);
        
        ventana.getContentPane().add(btn);
        ventana.getContentPane().add(lblnum1);
        ventana.setVisible(true);
               
        right=false;
    }

    
    
    class RemindTask extends TimerTask 
    {
        @Override
        public void run() 
        {
            if(right)
            {
                posx+=10;
                lblnum1.setBounds(posx, posy, 200, 30);
            }
        }
    }
    
    @Override
    public void actionPerformed(ActionEvent a) 
    {
        if(a.getSource()==btn)
        {
            right = true;
            timer = new Timer();
            timer.schedule(new RemindTask(),0, 1*100);
        }
    }

    @Override
    public void keyTyped(KeyEvent e) 
    {
        
    }

    @Override
    public void keyPressed(KeyEvent e) 
    {       
        if(e.getKeyCode()==KeyEvent.VK_RIGHT)
        {
            right=true;
            timer=new Timer();
            timer.schedule(new RemindTask(), 0, 1*100);
            posx+=10;
            lblnum1.setBounds(posx, posy, 200, 30);
        }
    }

    @Override
    public void keyReleased(KeyEvent e) {
        
    }
    
}

   
  
    
