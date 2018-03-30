/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectodisplay;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.Timer;

/**
 *
 * @author PC
 */
public class clase extends JFrame implements ActionListener
{
     public JFrame F;
     public JButton b1, b2;
     public int i,c;
     public Timer timer,timer1;
     
     public clase()
     {
        F = new JFrame("Display");
        F.setSize(500, 250);
        F.setLayout(null);
        F.setLocationRelativeTo(null);
        F.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        b1=new JButton("Ascendente");
        b1.setBounds(50, 50, 150, 50);
        b1.addActionListener(this);
        
        b2=new JButton("Descendente");
        b2.setBounds(230, 50, 150, 50);
        b2.addActionListener(this);
        
        F.setVisible(true);
        F.getContentPane().add(b1);
        F.getContentPane().add(b2);
     }        

    @Override
    public void actionPerformed(ActionEvent e) 
    {
       if(b1==e.getSource())
        {
            ActionListener task1=new ActionListener() 
            {
                @Override
                public void actionPerformed(ActionEvent a) 
                {  
                    
                  if(i<10)
                  {
                      System.out.println(i);  
                      i++;
                  }
                  
                }               
            };
               timer= new Timer(1000,task1);
               timer.start(); 
            
            
        }
       
       if(b2==e.getSource())
        {
           i = -i;
            System.out.println(i);
            
        }
    }
}
