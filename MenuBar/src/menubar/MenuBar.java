/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package menubar;

import java.awt.*;
import java.awt.event.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.*;
import javazoom.jlgui.basicplayer.BasicPlayerException;

/**
 *
 * @author Lore
 */
public class MenuBar extends JFrame implements ActionListener
{
    public JFrame ventana, frayuda, fracerca_de;
    public JLabel lblayuda, lblacerca_de, lblfondo;
    public Icon fondo;
    public JMenuBar barra;
    public JMenu programas, acerca_de, salir;
    public JMenuItem cronometro, semaforo, musica, iacerca_de, ayuda, isalir;
    
    Cronometro objc=new Cronometro();
    Semaforo objs= new Semaforo();
    Musica objm= new Musica();
    
    public MenuBar()
    {
        ventana = new JFrame("Menú");
        ventana.setSize(700,400);
        ventana.setLayout(null);
        ventana.setLocationRelativeTo(null);
        ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        lblfondo=new JLabel();
        lblfondo.setBounds(0,0, 700,400);
        ImageIcon imagen = new ImageIcon(getClass().getResource("/Imagenes/fondo1.jpg"));
        Image imagen_esc = imagen.getImage().getScaledInstance(lblfondo.getWidth(), lblfondo.getHeight(), Image.SCALE_SMOOTH);
        fondo = new ImageIcon(imagen_esc);
        lblfondo.setIcon(fondo);
        
        frayuda = new JFrame("Ayuda");
        frayuda.setSize(500,300);
        frayuda.setLayout(null);
        frayuda.setLocationRelativeTo(null);
        
        fracerca_de = new JFrame("Acerca de");
        fracerca_de.setSize(500,300);
        fracerca_de.setLayout(null);
        fracerca_de.setLocationRelativeTo(null);
        
        lblayuda = new JLabel("Seleccione uno de los tres programas en el Menú 'Programas' para ejecutarlo");
        lblayuda.setBounds(20,110,500,20);
        
        lblacerca_de = new JLabel("Autor del programa: Daniel Arévalo");
        lblacerca_de.setBounds(130,110,500,20);
        
        barra = new JMenuBar();
        barra.setBounds(0,0,700,20);
        
        programas = new JMenu("Programas");
        barra.add(programas);
            
            cronometro = new JMenuItem("Cronómetro");
            cronometro.addActionListener(this);
            programas.add(cronometro);
                        
            semaforo = new JMenuItem("Semáforo");
            semaforo.addActionListener(this);
            programas.add(semaforo);
            
            musica = new JMenuItem("Música");
            musica.addActionListener(this);
            programas.add(musica);
        
        acerca_de = new JMenu("Acerca de");
        barra.add(acerca_de);
        
            ayuda = new JMenuItem("Ayuda");
            ayuda.addActionListener(this);
            acerca_de.add(ayuda);
            
            iacerca_de = new JMenuItem("Acerca de");
            iacerca_de.addActionListener(this);
            acerca_de.add(iacerca_de);
            
        salir= new JMenu("Salir");
        barra.add(salir);
        
            isalir= new JMenuItem("Salir");
            isalir.addActionListener(this);
            salir.add(isalir);
        
        ventana.getContentPane().add(barra);
        ventana.getContentPane().add(lblfondo);
        
        frayuda.getContentPane().add(lblayuda);
        
        fracerca_de.getContentPane().add(lblacerca_de);
        
        ventana.setVisible(true); 
    }

    @Override
    public void actionPerformed(ActionEvent e) 
    {
        if(e.getSource()==cronometro)
        {
            objc.crm();
        }
        if(e.getSource()==semaforo)
        {
            objs.Semaforo();
        }
        
        if(e.getSource()==musica)
        {
            try {
                objm.Musica();
            } 
            catch (BasicPlayerException ex) 
            {
                Logger.getLogger(MenuBar.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        
        if(e.getSource()==ayuda)
        {
            frayuda.setVisible(true);
        }
        
        if(e.getSource()==iacerca_de)
        {
            fracerca_de.setVisible(true);
        }
        
        if(e.getSource()==isalir)
        {
            System.exit(0);
        }
    }
    
    private class Cronometro extends JFrame implements ActionListener
    {
        public JFrame ventana;
        public JButton iniciar, pausar, parar, reiniciar;
        public JLabel tiempo;    
        public int deci, seg, dseg, min, dmin, hora;
        public boolean inic=false;
        public Timer timer;       
        
        public void crm()
        {   
            deci=0;
            seg=0;
            dseg=0;
            min=0;
            dmin=0;
            hora=0;            
            if(inic)
            {
                ventana.setVisible(false);
                timer.stop();
            }
            
            ventana = new JFrame("Cronometro");
            ventana.setBounds(0,0,640,375);
            ventana.setLayout(null);
            ventana.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
            
            
            iniciar = new JButton("Iniciar");
            iniciar.setBounds(175,150,100,30);
            iniciar.addActionListener(this);
            
            pausar = new JButton("Pausar");
            pausar.setBounds(325,150,100,30);
            pausar.addActionListener(this);
            
            parar = new JButton("Parar");
            parar.setBounds(175,200,100,30);
            parar.addActionListener(this);
            
            reiniciar = new JButton("Reiniciar");
            reiniciar.setBounds(325,200,100,30);
            reiniciar.addActionListener(this);
            
            tiempo = new JLabel("0:00:00:0");
            tiempo.setBounds(275,75,100,30);
            
            ActionListener comandos=new ActionListener()
            {
                @Override
                public void actionPerformed(ActionEvent e) 
                {                    
                    deci++;                     
                    if(deci==10)
                    {
                        deci=0;
                        seg++;
                    }
                    if(seg==10)
                    {
                        seg=0;
                        dseg++;
                    }
                    if(dseg==6)
                    {
                        dseg=0;
                        min++;
                    }
                    if(min==10)
                    {
                        min=0;
                        dmin++;
                    }
                    if(dmin==6)
                    {
                        dmin=0;
                        hora++;
                    }
                    
                    tiempo.setText(hora+":"+dmin+min+":"+dseg+seg+":"+deci);  
                }
            };
            timer=new Timer(100, comandos);
            
            
            ventana.getContentPane().add(iniciar);
            ventana.getContentPane().add(pausar);
            ventana.getContentPane().add(parar);
            ventana.getContentPane().add(reiniciar);
            ventana.getContentPane().add(tiempo);
            ventana.setVisible(true);
            inic=true;
        }    

        @Override
        public void actionPerformed(ActionEvent e) 
        {
            if(e.getSource()==iniciar)
            {
                timer.start();
            }
            if(e.getSource()==pausar)
            {
                timer.stop();
            }
            if(e.getSource()==parar)
            {
                deci=0;
                seg=0;
                dseg=0;
                min=0;
                dmin=0;
                hora=0;  
                timer.stop();
                tiempo.setText("0:00:00:0");
            }
            
            if(e.getSource()==reiniciar)
            {
                deci=0;
                seg=0;
                dseg=0;
                min=0;
                dmin=0;
                hora=0;  
                timer.start();
            }
        }
    }
    
    
    private class Semaforo 
    {
        public JFrame ventana;
        public JLabel lblfondo, lblC_D, lblC_L, lblC_R, lblC_U, lblS_U, lblS_D, lblS_L, lblS_R;
        public Icon fondo, C_D, C_L, C_R, C_U, S_R, S_A, S_V;
        public boolean SF, SL, inic;
        public int cont, posC_D, posC_U, posC_L, posC_R, limL, limR, limU, limD, vL, vD, vU, vR;
        public Timer timer_s, timer_c;

        public void Semaforo()
        {
            if (inic)
            {
                ventana.setVisible(false);
                timer_s.stop();
                timer_c.stop();
            }
            ventana=new JFrame("F-Kart");
            ventana.setLayout(null);
            ventana.setBounds(640, 0, 640, 740);            
            ventana.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

            
            SF=false;
            SL=true;
            posC_D=5;
            posC_U=600;
            posC_L=630;
            posC_R=5;
            cont=0;
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
            ImageIcon imagen = new ImageIcon(getClass().getResource("/Imagenes/Fondo.png"));
            Image imagen_esc = imagen.getImage().getScaledInstance(lblfondo.getWidth(), lblfondo.getHeight(), Image.SCALE_SMOOTH);
            fondo = new ImageIcon(imagen_esc);
            lblfondo.setIcon(fondo);

            lblC_D=new JLabel();
            lblC_D.setBounds(305, posC_D, 30,50);
            ImageIcon imagen2 = new ImageIcon(getClass().getResource("/Imagenes/C_D.png"));
            Image imagen_esc2 = imagen2.getImage().getScaledInstance(lblC_D.getWidth(), lblC_D.getHeight(), Image.SCALE_SMOOTH);
            C_D = new ImageIcon(imagen_esc2);
            lblC_D.setIcon(C_D);

            lblC_U=new JLabel();
            lblC_U.setBounds(355, posC_U, 30,50);
            ImageIcon imagen3 = new ImageIcon(getClass().getResource("/Imagenes/C_U.png"));
            Image imagen_esc3 = imagen3.getImage().getScaledInstance(lblC_U.getWidth(), lblC_U.getHeight(), Image.SCALE_SMOOTH);
            C_U = new ImageIcon(imagen_esc3);
            lblC_U.setIcon(C_U);

            lblC_R=new JLabel();
            lblC_R.setBounds(posC_R, 355, 50,30);
            ImageIcon imagen4 = new ImageIcon(getClass().getResource("/Imagenes/C_R.png"));
            Image imagen_esc4 = imagen4.getImage().getScaledInstance(lblC_R.getWidth(), lblC_R.getHeight(), Image.SCALE_SMOOTH);
            C_R = new ImageIcon(imagen_esc4);
            lblC_R.setIcon(C_R);

            lblC_L=new JLabel();
            lblC_L.setBounds(posC_L, 305, 50, 30);
            ImageIcon imagen5 = new ImageIcon(getClass().getResource("/Imagenes/C_L.png"));
            Image imagen_esc5 = imagen5.getImage().getScaledInstance(lblC_L.getWidth(), lblC_L.getHeight(), Image.SCALE_SMOOTH);
            C_L = new ImageIcon(imagen_esc5);
            lblC_L.setIcon(C_L);

            lblS_U=new JLabel();
            lblS_U.setBounds(415, 240, 50, 60); 

            ImageIcon imagen6 = new ImageIcon(getClass().getResource("/Imagenes/S_R.png"));
            Image imagen_esc6 = imagen6.getImage().getScaledInstance(lblS_U.getWidth(), lblS_U.getHeight(), Image.SCALE_SMOOTH);
            S_R = new ImageIcon(imagen_esc6);      

            ImageIcon imagen7 = new ImageIcon(getClass().getResource("/Imagenes/S_A.png"));
            Image imagen_esc7 = imagen7.getImage().getScaledInstance(lblS_U.getWidth(), lblS_U.getHeight(), Image.SCALE_SMOOTH);
            S_A = new ImageIcon(imagen_esc7);

            ImageIcon imagen8 = new ImageIcon(getClass().getResource("/Imagenes/S_V.png"));
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
            
            inic=true;

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
    
    private class Musica extends JFrame implements ActionListener
    {
        public Player player=new Player();
        public JFrame ventana;
        public JButton iniciar, pausar, parar, reiniciar;
        public boolean pause=false;
        public boolean inic;
        
        public void Musica() throws BasicPlayerException
        {
            player.control.open(getClass().getResource("/Imagenes/The Party.mp3"));
            
            if(inic)
            {
                ventana.setVisible(false);
                player.control.stop();
            }
            ventana = new JFrame("Música");
            ventana.setBounds(0, 375,640,375);
            ventana.setLayout(null);
            ventana.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);               

            iniciar = new JButton("Iniciar");
            iniciar.setBounds(100,150,100,30);
            iniciar.addActionListener(this);
            
            pausar = new JButton("Pausar");
            pausar.setBounds(250,150,100,30);
            pausar.addActionListener(this);
            
            parar = new JButton("Parar");
            parar.setBounds(400,150,100,30);
            parar.addActionListener(this);
            
            ventana.getContentPane().add(iniciar);
            ventana.getContentPane().add(pausar);
            ventana.getContentPane().add(parar);
            
            ventana.setVisible(true);
            inic=true;

        }

        @Override
        public void actionPerformed(ActionEvent e) 
        {
            if(e.getSource()==iniciar)
            {
                if(pause)
                {
                    try {
                        player.control.resume();
                    } catch (BasicPlayerException ex) {
                        Logger.getLogger(MenuBar.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
                else
                {
                    try {
                        player.control.play();
                    } catch (BasicPlayerException ex) {
                        Logger.getLogger(MenuBar.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
            }
            
            if(e.getSource()==pausar)
            {
                try {
                    player.control.pause();
                } catch (BasicPlayerException ex) {
                    Logger.getLogger(MenuBar.class.getName()).log(Level.SEVERE, null, ex);
                }
                pause=true;
            }
            
            if(e.getSource()==parar)
            {
                try {
                    player.control.stop();
                } catch (BasicPlayerException ex) {
                    Logger.getLogger(MenuBar.class.getName()).log(Level.SEVERE, null, ex);
                }
                pause=false;
            }
        }
        
    }
}

