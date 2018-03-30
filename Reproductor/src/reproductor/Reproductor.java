/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package reproductor;

import java.awt.event.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.*;

/**
 *
 * @author Lore
 */
public class Reproductor extends JFrame implements ActionListener
{
    JFrame ventana;
    JButton Play;
    mainReproductor r=new mainReproductor();
    
    
    public Reproductor()
    {
        ventana=new JFrame("F-Kart");
        ventana.setLayout(null);
        ventana.setSize(700, 700);
        ventana.setLocationRelativeTo(null);
        ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        Play=new JButton("Play");
        Play.setBounds(100, 100, 60, 20);
        
        ventana.getContentPane().add(Play);
        ventana.setVisible(true);
        
        
                
    }

    @Override
    public void actionPerformed(ActionEvent e) 
    {
        if(e.getSource()==Play)
        {
            try {
                r.reproducemp3();
            } catch (Exception ex) {
                Logger.getLogger(Reproductor.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
    
}
