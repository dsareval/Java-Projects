/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package guitar_subway;

import java.awt.*;
import java.awt.event.*;
import java.io.File;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.*;
import javax.swing.filechooser.FileNameExtensionFilter;
import javazoom.jlgui.basicplayer.BasicPlayerException;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JProgressBar;
import javax.swing.JToggleButton;
import net.java.games.input.Component;
import net.java.games.input.Component.Identifier;
import net.java.games.input.Controller;
import net.java.games.input.ControllerEnvironment;
/**
 *
 * @author LABORATORIO
 */
public class Guitar_Subway extends JFrame implements KeyListener
{
    public static void main(String args[]) throws InterruptedException, BasicPlayerException {
        //JInputJoystickTest jinputJoystickTest = new JInputJoystickTest();
        // Writes (into console) informations of all controllers that are found.
        //jinputJoystickTest.getAllControllersInfo();
        // In loop writes (into console) all joystick components and its current values.
        //jinputJoystickTest.pollControllerAndItsComponents(Controller.Type.STICK);
        //jinputJoystickTest.pollControllerAndItsComponents(Controller.Type.GAMEPAD);
        
        new Guitar_Subway();
    }
    
    public JFrame ventana, menu, lose, win;
    public JLabel lblfondo1, lblclv, lblrv, lblrr, lblra, lblraz, lblrt, lblrv1, 
           lblrr1, lblra1, lblraz1, lblrt1, lblf, lblp, lblpcon, lblnivel, lblmenu, lblopc, lbllose, lblGO, lblwin;
    public int posyv[], posyr[], posya[], posyaz[], posyt[], puntaje, i, i2, inicio, cont, cont2, cont3, sep, nivel, nt, contf;
    public int notas=20;
    public JLabel lblv[]=new JLabel [notas];
    public JLabel lblr[]=new JLabel [notas];
    public JLabel lbla[]=new JLabel [notas];
    public JLabel lblaz[]=new JLabel [notas];
    public JLabel lblt[]=new JLabel [notas];
    public ActionListener c[]=new ActionListener[20];
    public Icon fondo1, clv, v, r, a, az, t, rv, rr, ra, raz, rt, rv1, rr1, ra1, 
           raz1, rt1, f,I0 ,I1 ,I2 ,I3 ,I4 ,I5 ,I6 ,I7 ,I8, I9 ,I10 ,I11 ,I12 ,
            I13 ,I14 ,I15 ,I16 ,I17 ,I18, I19 ,I20, icnmenu, iniciar, salir, icnlose, GOS, icnwin;
    public Timer tv[], tr[], ta[], taz[], tt[], timer, timer2, timer3, tcomp, timerf;    
    public Player player=new Player();
    public Player fail=new Player();
    public Boolean puntov, puntor, puntoa, puntoaz, puntot, brv, brr, bra, braz, brt, bv, br, ba, baz, bt, cancion;
    private ArrayList<Controller> foundControllers;

    
    
    public Guitar_Subway() throws InterruptedException, BasicPlayerException
    {
        tv=new Timer[notas];
        tr=new Timer[notas];
        ta=new Timer[notas];
        taz=new Timer[notas];
        tt=new Timer[notas];
        
        inicio=3600;
        sep=220;
        nivel=10;
        
        posyv= new int[notas];
        posyr= new int[notas];
        posya= new int[notas];
        posyaz= new int[notas];
        posyt= new int[notas];
        
        brv=false;    
        brr=false; 
        bra=false; 
        braz=false; 
        brt=false; 
        bv=false;
        br=false;
        ba=false;
        baz=false;
        bt=false;
        
        
        
        ventana=new JFrame("Guitar Subway");
        ventana.setLayout(null);
        ventana.setSize(550, 700);
        ventana.setLocationRelativeTo(null);
        ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        ventana.addKeyListener(this);
        
        foundControllers = new ArrayList<>();
        searchForControllers();
        
        // If at least one controller was found we start showing controller data on window.
        if(!foundControllers.isEmpty())
            startShowingControllerData();
        else
            System.out.println("no");
        
        lblfondo1=new JLabel();
        lblfondo1.setBounds(0, 0, 550, 700);
        ImageIcon imagen = new ImageIcon(getClass().getResource("/Imagenes/fondo1.png"));
        Image imagen_esc = imagen.getImage().getScaledInstance(lblfondo1.getWidth(), lblfondo1.getHeight(), Image.SCALE_SMOOTH);
        Icon f_1 = new ImageIcon(imagen_esc);
        fondo1=f_1;
        lblfondo1.setIcon(f_1);
        
        lblclv=new JLabel();
        lblclv.setBounds(50, 0, 200, 662);
        ImageIcon imagen2 = new ImageIcon(getClass().getResource("/Imagenes/Clavijero.png"));
        Image imagen_esc2 = imagen2.getImage().getScaledInstance(lblclv.getWidth(), lblclv.getHeight(), Image.SCALE_SMOOTH);
        Icon clav = new ImageIcon(imagen_esc2);
        clv=clav;
        lblclv.setIcon(clv);
        
        for(i=0;i<notas;i++)
        {
            lblv[i]=new JLabel();
            lblv[i].setBounds(50, -20, 40, 20);
            ImageIcon imagen3 = new ImageIcon(getClass().getResource("/Imagenes/nota_v.png"));
            Image imagen_esc3 = imagen3.getImage().getScaledInstance(lblv[i].getWidth(), lblv[i].getHeight(), Image.SCALE_SMOOTH);
            Icon nota_v = new ImageIcon(imagen_esc3);
            v=nota_v;
            lblv[i].setIcon(v);
            
            lblr[i]=new JLabel();
            lblr[i].setBounds(90, -20, 40, 20);
            ImageIcon imagen4 = new ImageIcon(getClass().getResource("/Imagenes/nota_r.png"));
            Image imagen_esc4 = imagen4.getImage().getScaledInstance(lblr[i].getWidth(), lblr[i].getHeight(), Image.SCALE_SMOOTH);
            Icon nota_r = new ImageIcon(imagen_esc4);
            r=nota_r;
            lblr[i].setIcon(r);
            
            lbla[i]=new JLabel();
            lbla[i].setBounds(130, -20, 40, 20);
            ImageIcon imagen5 = new ImageIcon(getClass().getResource("/Imagenes/nota_a.png"));
            Image imagen_esc5 = imagen5.getImage().getScaledInstance(lbla[i].getWidth(), lbla[i].getHeight(), Image.SCALE_SMOOTH);
            Icon nota_a = new ImageIcon(imagen_esc5);
            a=nota_a;
            lbla[i].setIcon(a);
            
            lblaz[i]=new JLabel();
            lblaz[i].setBounds(170, -20, 40, 20);
            ImageIcon imagen6 = new ImageIcon(getClass().getResource("/Imagenes/nota_az.png"));
            Image imagen_esc6 = imagen6.getImage().getScaledInstance(lblaz[i].getWidth(), lblaz[i].getHeight(), Image.SCALE_SMOOTH);
            Icon nota_az = new ImageIcon(imagen_esc6);
            az=nota_az;
            lblaz[i].setIcon(az);
            
            lblt[i]=new JLabel();
            lblt[i].setBounds(210, -20, 40, 20);
            ImageIcon imagen7 = new ImageIcon(getClass().getResource("/Imagenes/nota_t.png"));
            Image imagen_esc7 = imagen7.getImage().getScaledInstance(lblt[i].getWidth(), lblt[i].getHeight(), Image.SCALE_SMOOTH);
            Icon nota_t = new ImageIcon(imagen_esc7);
            t=nota_t;
            lblt[i].setIcon(t);
        }       
        
        lblrv=new JLabel();
        lblrv.setBounds(50, 610, 40, 30);
        ImageIcon imagen8 = new ImageIcon(getClass().getResource("/Imagenes/receptor_v.png"));
        Image imagen_esc8 = imagen8.getImage().getScaledInstance(lblrv.getWidth(), lblrv.getHeight(), Image.SCALE_SMOOTH);
        Icon receptor_v = new ImageIcon(imagen_esc8);
        rv=receptor_v;
        lblrv.setIcon(rv);
        
        lblrr=new JLabel();
        lblrr.setBounds(90, 610, 40, 30);
        ImageIcon imagen9 = new ImageIcon(getClass().getResource("/Imagenes/receptor_r.png"));
        Image imagen_esc9 = imagen9.getImage().getScaledInstance(lblrr.getWidth(), lblrr.getHeight(), Image.SCALE_SMOOTH);
        Icon receptor_r = new ImageIcon(imagen_esc9);
        rr=receptor_r;
        lblrr.setIcon(rr);
        
        lblra=new JLabel();
        lblra.setBounds(130, 610, 40, 30);
        ImageIcon imagen10 = new ImageIcon(getClass().getResource("/Imagenes/receptor_a.png"));
        Image imagen_esc10 = imagen10.getImage().getScaledInstance(lblra.getWidth(), lblra.getHeight(), Image.SCALE_SMOOTH);
        Icon receptor_a = new ImageIcon(imagen_esc10);
        ra=receptor_a;
        lblra.setIcon(ra);
        
        lblraz=new JLabel();
        lblraz.setBounds(170, 610, 40, 30);
        ImageIcon imagen11 = new ImageIcon(getClass().getResource("/Imagenes/receptor_az.png"));
        Image imagen_esc11 = imagen11.getImage().getScaledInstance(lblraz.getWidth(), lblraz.getHeight(), Image.SCALE_SMOOTH);
        Icon receptor_az = new ImageIcon(imagen_esc11);
        raz=receptor_az;
        lblraz.setIcon(raz);
        
        lblrt=new JLabel();
        lblrt.setBounds(210, 610, 40, 30);
        ImageIcon imagen12 = new ImageIcon(getClass().getResource("/Imagenes/receptor_t.png"));
        Image imagen_esc12 = imagen12.getImage().getScaledInstance(lblrt.getWidth(), lblrt.getHeight(), Image.SCALE_SMOOTH);
        Icon receptor_t = new ImageIcon(imagen_esc12);
        rt=receptor_t;
        lblrt.setIcon(rt);
        
        lblrv1=new JLabel();
        lblrv1.setBounds(50, 600, 40, 40);
        ImageIcon imagen13 = new ImageIcon(getClass().getResource("/Imagenes/receptor_v1.png"));
        Image imagen_esc13 = imagen13.getImage().getScaledInstance(lblrv1.getWidth(), lblrv1.getHeight(), Image.SCALE_SMOOTH);
        Icon receptor_v1 = new ImageIcon(imagen_esc13);
        rv1=receptor_v1;
        lblrv1.setIcon(rv1);
        
        lblf=new JLabel();
        lblf.setBounds(50, 580, 40, 40);
        ImageIcon imagen18 = new ImageIcon(getClass().getResource("/Imagenes/fuego.png"));
        Image imagen_esc18 = imagen18.getImage().getScaledInstance(lblf.getWidth(), lblf.getHeight(), Image.SCALE_SMOOTH);
        Icon fuego = new ImageIcon(imagen_esc18);
        f=fuego;
        lblf.setIcon(f);
        
        lblrr1=new JLabel();
        lblrr1.setBounds(90, 600, 40, 40);
        ImageIcon imagen14 = new ImageIcon(getClass().getResource("/Imagenes/receptor_r1.png"));
        Image imagen_esc14 = imagen14.getImage().getScaledInstance(lblrr1.getWidth(), lblrr1.getHeight(), Image.SCALE_SMOOTH);
        Icon receptor_r1 = new ImageIcon(imagen_esc14);
        rr1=receptor_r1;
        lblrr1.setIcon(rr1);
        
        lblra1=new JLabel();
        lblra1.setBounds(130, 600, 40, 40);
        ImageIcon imagen15 = new ImageIcon(getClass().getResource("/Imagenes/receptor_a1.png"));
        Image imagen_esc15 = imagen15.getImage().getScaledInstance(lblra1.getWidth(), lblra1.getHeight(), Image.SCALE_SMOOTH);
        Icon receptor_a1 = new ImageIcon(imagen_esc15);
        ra1=receptor_a1;
        lblra1.setIcon(ra1);
        
        lblraz1=new JLabel();
        lblraz1.setBounds(170, 600, 40, 40);
        ImageIcon imagen16 = new ImageIcon(getClass().getResource("/Imagenes/receptor_az1.png"));
        Image imagen_esc16 = imagen16.getImage().getScaledInstance(lblraz1.getWidth(), lblraz1.getHeight(), Image.SCALE_SMOOTH);
        Icon receptor_az1 = new ImageIcon(imagen_esc16);
        raz1=receptor_az1;
        lblraz1.setIcon(raz1);
        
        lblrt1=new JLabel();
        lblrt1.setBounds(210, 600, 40, 40);
        ImageIcon imagen17 = new ImageIcon(getClass().getResource("/Imagenes/receptor_t1.png"));
        Image imagen_esc17 = imagen17.getImage().getScaledInstance(lblrt1.getWidth(), lblrt1.getHeight(), Image.SCALE_SMOOTH);
        Icon receptor_t1 = new ImageIcon(imagen_esc17);
        rt1=receptor_t1;
        lblrt1.setIcon(rt1);
        
        lblp=new JLabel("Puntaje: ");
        lblp.setBounds(300, 100, 110,50);
        lblp.setFont(new java.awt.Font("Monospaced", Font.BOLD, 20));
        lblp.setForeground(Color.white);
        
        lblpcon=new JLabel("0");
        lblpcon.setBounds(400, 100, 110,50);
        lblpcon.setFont(new java.awt.Font("Monospaced", 0, 20));
        lblpcon.setForeground(Color.white);
        
        lblnivel=new JLabel();
        lblnivel.setBounds(300, 200, 200, 150);
        ImageIcon imagen19 = new ImageIcon(getClass().getResource("/Imagenes/0.png"));
        Image imagen_esc19 = imagen19.getImage().getScaledInstance(lblnivel.getWidth(), lblnivel.getHeight(), Image.SCALE_SMOOTH);
        Icon r0 = new ImageIcon(imagen_esc19);
        I0=r0;
        
        
        ImageIcon imagen20 = new ImageIcon(getClass().getResource("/Imagenes/1.png"));
        Image imagen_esc20 = imagen20.getImage().getScaledInstance(lblnivel.getWidth(), lblnivel.getHeight(), Image.SCALE_SMOOTH);
        Icon r1 = new ImageIcon(imagen_esc20);
        I1=r1;
        
        ImageIcon imagen21 = new ImageIcon(getClass().getResource("/Imagenes/2.png"));
        Image imagen_esc21 = imagen21.getImage().getScaledInstance(lblnivel.getWidth(), lblnivel.getHeight(), Image.SCALE_SMOOTH);
        Icon r2 = new ImageIcon(imagen_esc21);
        I2=r2;
        
        ImageIcon imagen22 = new ImageIcon(getClass().getResource("/Imagenes/3.png"));
        Image imagen_esc22 = imagen22.getImage().getScaledInstance(lblnivel.getWidth(), lblnivel.getHeight(), Image.SCALE_SMOOTH);
        Icon r3 = new ImageIcon(imagen_esc22);
        I3=r3;
        
        ImageIcon imagen23 = new ImageIcon(getClass().getResource("/Imagenes/4.png"));
        Image imagen_esc23 = imagen23.getImage().getScaledInstance(lblnivel.getWidth(), lblnivel.getHeight(), Image.SCALE_SMOOTH);
        Icon r4 = new ImageIcon(imagen_esc23);
        I4=r4;
        
        ImageIcon imagen24 = new ImageIcon(getClass().getResource("/Imagenes/5.png"));
        Image imagen_esc24 = imagen24.getImage().getScaledInstance(lblnivel.getWidth(), lblnivel.getHeight(), Image.SCALE_SMOOTH);
        Icon r5 = new ImageIcon(imagen_esc24);
        I5=r5;
        
        ImageIcon imagen25 = new ImageIcon(getClass().getResource("/Imagenes/6.png"));
        Image imagen_esc25 = imagen25.getImage().getScaledInstance(lblnivel.getWidth(), lblnivel.getHeight(), Image.SCALE_SMOOTH);
        Icon r6 = new ImageIcon(imagen_esc25);
        I6=r6;
        
        ImageIcon imagen26 = new ImageIcon(getClass().getResource("/Imagenes/7.png"));
        Image imagen_esc26 = imagen26.getImage().getScaledInstance(lblnivel.getWidth(), lblnivel.getHeight(), Image.SCALE_SMOOTH);
        Icon r7 = new ImageIcon(imagen_esc26);
        I7=r7;
        
        ImageIcon imagen27 = new ImageIcon(getClass().getResource("/Imagenes/8.png"));
        Image imagen_esc27 = imagen27.getImage().getScaledInstance(lblnivel.getWidth(), lblnivel.getHeight(), Image.SCALE_SMOOTH);
        Icon r8 = new ImageIcon(imagen_esc27);
        I8=r8;
        
        ImageIcon imagen28 = new ImageIcon(getClass().getResource("/Imagenes/9.png"));
        Image imagen_esc28 = imagen28.getImage().getScaledInstance(lblnivel.getWidth(), lblnivel.getHeight(), Image.SCALE_SMOOTH);
        Icon r9 = new ImageIcon(imagen_esc28);
        I9=r9;
        
        ImageIcon imagen29 = new ImageIcon(getClass().getResource("/Imagenes/10.png"));
        Image imagen_esc29 = imagen29.getImage().getScaledInstance(lblnivel.getWidth(), lblnivel.getHeight(), Image.SCALE_SMOOTH);
        Icon r10 = new ImageIcon(imagen_esc29);
        I10=r10;
        
        ImageIcon imagen30 = new ImageIcon(getClass().getResource("/Imagenes/11.png"));
        Image imagen_esc30 = imagen30.getImage().getScaledInstance(lblnivel.getWidth(), lblnivel.getHeight(), Image.SCALE_SMOOTH);
        Icon r11 = new ImageIcon(imagen_esc30);
        I11=r11;
        
        ImageIcon imagen31 = new ImageIcon(getClass().getResource("/Imagenes/12.png"));
        Image imagen_esc31 = imagen31.getImage().getScaledInstance(lblnivel.getWidth(), lblnivel.getHeight(), Image.SCALE_SMOOTH);
        Icon r12 = new ImageIcon(imagen_esc31);
        I12=r12;
        
        ImageIcon imagen32 = new ImageIcon(getClass().getResource("/Imagenes/13.png"));
        Image imagen_esc32 = imagen32.getImage().getScaledInstance(lblnivel.getWidth(), lblnivel.getHeight(), Image.SCALE_SMOOTH);
        Icon r13 = new ImageIcon(imagen_esc32);
        I13=r13;
        
        ImageIcon imagen33 = new ImageIcon(getClass().getResource("/Imagenes/14.png"));
        Image imagen_esc33 = imagen33.getImage().getScaledInstance(lblnivel.getWidth(), lblnivel.getHeight(), Image.SCALE_SMOOTH);
        Icon r14 = new ImageIcon(imagen_esc33);
        I14=r14;
        
        ImageIcon imagen34 = new ImageIcon(getClass().getResource("/Imagenes/15.png"));
        Image imagen_esc34 = imagen34.getImage().getScaledInstance(lblnivel.getWidth(), lblnivel.getHeight(), Image.SCALE_SMOOTH);
        Icon r15 = new ImageIcon(imagen_esc34);
        I15=r15;
        
        ImageIcon imagen35 = new ImageIcon(getClass().getResource("/Imagenes/16.png"));
        Image imagen_esc35 = imagen35.getImage().getScaledInstance(lblnivel.getWidth(), lblnivel.getHeight(), Image.SCALE_SMOOTH);
        Icon r16 = new ImageIcon(imagen_esc35);
        I16=r16;
        
        ImageIcon imagen36 = new ImageIcon(getClass().getResource("/Imagenes/17.png"));
        Image imagen_esc36 = imagen36.getImage().getScaledInstance(lblnivel.getWidth(), lblnivel.getHeight(), Image.SCALE_SMOOTH);
        Icon r17 = new ImageIcon(imagen_esc36);
        I17=r17;
        
        ImageIcon imagen37 = new ImageIcon(getClass().getResource("/Imagenes/18.png"));
        Image imagen_esc37 = imagen37.getImage().getScaledInstance(lblnivel.getWidth(), lblnivel.getHeight(), Image.SCALE_SMOOTH);
        Icon r18 = new ImageIcon(imagen_esc37);
        I18=r18;
        
        ImageIcon imagen38 = new ImageIcon(getClass().getResource("/Imagenes/19.png"));
        Image imagen_esc38 = imagen38.getImage().getScaledInstance(lblnivel.getWidth(), lblnivel.getHeight(), Image.SCALE_SMOOTH);
        Icon r19 = new ImageIcon(imagen_esc38);
        I19=r19;
        
        ImageIcon imagen39 = new ImageIcon(getClass().getResource("/Imagenes/20.png"));
        Image imagen_esc39 = imagen39.getImage().getScaledInstance(lblnivel.getWidth(), lblnivel.getHeight(), Image.SCALE_SMOOTH);
        Icon r20 = new ImageIcon(imagen_esc39);
        I20=r20;
        
        lblnivel.setIcon(I10);
        
        menu=new JFrame("Guitar Subway");
        menu.setLayout(null);
        menu.setSize(600, 500);
        menu.setLocationRelativeTo(null);
        menu.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        menu.addKeyListener(this);
        
        lblmenu=new JLabel();
        lblmenu.setBounds(0, 0, 600, 500);
        ImageIcon image = new ImageIcon(getClass().getResource("/Imagenes/Menu.png"));
        Image image_esc = image.getImage().getScaledInstance(lblmenu.getWidth(), lblmenu.getHeight(), Image.SCALE_SMOOTH);
        Icon m = new ImageIcon(image_esc);
        icnmenu=m;
        lblmenu.setIcon(icnmenu);
        
        lblopc=new JLabel();        
        lblopc.setBounds(225, 175, 150, 200);
        ImageIcon image2 = new ImageIcon(getClass().getResource("/Imagenes/iniciar.png"));
        Image image_esc2 = image2.getImage().getScaledInstance(lblopc.getWidth(), lblopc.getHeight(), Image.SCALE_SMOOTH);
        Icon opc = new ImageIcon(image_esc2);
        iniciar=opc;
        
        ImageIcon image3 = new ImageIcon(getClass().getResource("/Imagenes/salir.png"));
        Image image_esc3 = image3.getImage().getScaledInstance(lblopc.getWidth(), lblopc.getHeight(), Image.SCALE_SMOOTH);
        Icon opc2 = new ImageIcon(image_esc3);
        salir=opc2;
        
        lblopc.setIcon(iniciar);
        
        lose=new JFrame("Guitar Subway");
        lose.setLayout(null);
        lose.setSize(600, 500);
        lose.setLocationRelativeTo(null);
        lose.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        lose.addKeyListener(this);
        
        lbllose=new JLabel();
        lbllose.setBounds(0, 0, 600, 500);
        ImageIcon img = new ImageIcon(getClass().getResource("/Imagenes/lose.jpg"));
        Image img_esc = img.getImage().getScaledInstance(lbllose.getWidth(), lbllose.getHeight(), Image.SCALE_SMOOTH);
        Icon gover = new ImageIcon(img_esc);
        icnlose=gover;
        lbllose.setIcon(icnlose);
        
        lblGO=new JLabel();        
        lblGO.setBounds(200, 175, 150, 100);
        ImageIcon img2 = new ImageIcon(getClass().getResource("/Imagenes/GOS.png"));
        Image img_esc2 = img2.getImage().getScaledInstance(lblGO.getWidth(), lblGO.getHeight(), Image.SCALE_SMOOTH);
        Icon GO1 = new ImageIcon(img_esc2);
        GOS=GO1;
        
        lblGO.setIcon(GOS);
        
        win=new JFrame("Guitar Subway");
        win.setLayout(null);
        win.setSize(600,500);
        win.setLocationRelativeTo(null);
        win.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        win.addKeyListener(this);
        
        lblwin= new JLabel();
        lblwin.setBounds(0, 0, 600, 500);
        ImageIcon icon = new ImageIcon(getClass().getResource("/Imagenes/win.jpg"));
        Image icon_esc = icon.getImage().getScaledInstance(lbllose.getWidth(), lbllose.getHeight(), Image.SCALE_SMOOTH);
        Icon WIN = new ImageIcon(icon_esc);
        icnwin=WIN;
        lblwin.setIcon(icnwin);
        
        
        lose.getContentPane().add(lblGO);
        lose.getContentPane().add(lbllose);
        
        
        menu.getContentPane().add(lblp);
        menu.getContentPane().add(lblpcon);
        menu.getContentPane().add(lblopc);
        menu.getContentPane().add(lblmenu);
        
        win.getContentPane().add(lblwin);
        
        menu.setVisible(true);
        
        
        
        
        
        ventana.getContentPane().add(lblnivel);
        ventana.getContentPane().add(lblpcon);
        ventana.getContentPane().add(lblp);
        for(i=0;i<notas;i++)
        {
            ventana.getContentPane().add(lblv[i]);
            ventana.getContentPane().add(lblr[i]);
            ventana.getContentPane().add(lbla[i]);
            ventana.getContentPane().add(lblaz[i]);
            ventana.getContentPane().add(lblt[i]);
        }                        
        ventana.getContentPane().add(lblrv);
        ventana.getContentPane().add(lblrr);
        ventana.getContentPane().add(lblra);
        ventana.getContentPane().add(lblraz);
        ventana.getContentPane().add(lblrt);
        ventana.getContentPane().add(lblf);
        ventana.getContentPane().add(lblrv1);
        ventana.getContentPane().add(lblrr1);
        ventana.getContentPane().add(lblra1);
        ventana.getContentPane().add(lblraz1);
        ventana.getContentPane().add(lblrt1);        
        ventana.getContentPane().add(lblclv);
        ventana.getContentPane().add(lblfondo1);       
        
        lblrv1.setVisible(false);
        lblrr1.setVisible(false);
        lblra1.setVisible(false);
        lblraz1.setVisible(false);
        lblrt1.setVisible(false);
        lblf.setVisible(false);
        
        ventana.setVisible(false);
        
        while(true)
        {
        if(ventana.isVisible())
        {
            try 
            {
                player.control.open(getClass().getResource("/Imagenes/Rich.mp3"));
            } 
            catch (BasicPlayerException ex) 
            {
                Logger.getLogger(Guitar_Subway.class.getName()).log(Level.SEVERE, null, ex);
            }


             try {
                player.control.setGain(1);
            } catch (BasicPlayerException ex) 
            {
                Logger.getLogger(Guitar_Subway.class.getName()).log(Level.SEVERE, null, ex);
            }

             try {
                            player.control.play();
                        } catch (BasicPlayerException ex) {
                            Logger.getLogger(Guitar_Subway.class.getName()).log(Level.SEVERE, null, ex);
                        } 

             try 
            {
                fail.control.open(getClass().getResource("/Imagenes/Fail.mp3"));
            } 
            catch (BasicPlayerException ex) 
            {
                Logger.getLogger(Guitar_Subway.class.getName()).log(Level.SEVERE, null, ex);
            }       
             
            


            ActionListener task2=new ActionListener()  
            {
                @Override
                public void actionPerformed(ActionEvent e) 
                {  
                    System.out.println(contf);
                    if(contf==21)
                    {
                        ventana.setVisible(false);
                        win.setVisible(true);
                    }
                    contf++;
                    for(i=0;i<6;i++)
                    {
                        posyv[i]=-10;
                        posyr[i]=-10;
                        posya[i]=-10;
                        posyaz[i]=-10;
                        posyt[i]=-10;
                    }                                       

                    if(cont>0)
                    {
                        tv[0].stop();
                    }
                    ActionListener comandos0=new ActionListener() 
                    {
                        @Override
                        public void actionPerformed(ActionEvent e) 
                        {                
                            posyv[0]+=1;                
                            lblv[0].setLocation(50, posyv[0]);   
                        }
                    };
                    tv[0]=new Timer(2,comandos0);        
                    tv[0].setInitialDelay(inicio);        
                    tv[0].start();

                    if(cont>0)
                    {
                        tv[1].stop();
                    }
                    ActionListener comandos1=new ActionListener() 
                    {
                        @Override
                        public void actionPerformed(ActionEvent e) 
                        {
                            posyv[1]+=1;
                            lblv[1].setLocation(50, posyv[1]);

                        }
                    };
                    tv[1]=new Timer(2,comandos1);        
                    tv[1].setInitialDelay(inicio+sep);        
                    tv[1].start();

                    if(cont>0)
                    {
                        ta[0].stop();
                    }
                    ActionListener comandos2=new ActionListener() 
                    {
                        @Override
                        public void actionPerformed(ActionEvent e) 
                        {                
                            posya[0]+=1;                
                            lbla[0].setLocation(130, posya[0]); 

                        }
                    };
                    ta[0]=new Timer(2,comandos2);        
                    ta[0].setInitialDelay(inicio+2*sep);        
                    ta[0].start();

                    if(cont>0)
                    {
                        ta[1].stop();
                    }
                    ActionListener comandos3=new ActionListener()  
                    {
                        @Override
                        public void actionPerformed(ActionEvent e) 
                        {                
                            posya[1]+=1;                
                            lbla[1].setLocation(130, posya[1]); 

                        }
                    };
                    ta[1]=new Timer(2,comandos3);        
                    ta[1].setInitialDelay(inicio+3*sep);        
                    ta[1].start();

                    if(cont>0)
                    {
                        tr[0].stop();
                    }
                    ActionListener comandos4=new ActionListener()  
                    {
                        @Override
                        public void actionPerformed(ActionEvent e) 
                        {                
                            posyr[0]+=1;                
                            lblr[0].setLocation(90, posyr[0]);

                        }
                    };
                    tr[0]=new Timer(2,comandos4);        
                    tr[0].setInitialDelay(inicio+4*sep);        
                    tr[0].start();

                    if(cont>0)
                    {
                        tr[1].stop();
                    }
                    ActionListener comandos5=new ActionListener() 
                    {
                        @Override
                        public void actionPerformed(ActionEvent e) 
                        {                
                            posyr[1]+=1;                
                            lblr[1].setLocation(90, posyr[1]);   

                        }
                    };
                    tr[1]=new Timer(2,comandos5);        
                    tr[1].setInitialDelay(inicio+5*sep);        
                    tr[1].start();  

                    if(cont>0)
                    {
                        taz[0].stop();
                    }
                    ActionListener comandos6=new ActionListener() 
                    {
                        @Override
                        public void actionPerformed(ActionEvent e) 
                        {                
                            posyaz[0]+=1;                
                            lblaz[0].setLocation(170, posyaz[0]); 

                        }
                    };
                    taz[0]=new Timer(2,comandos6);        
                    taz[0].setInitialDelay(inicio+6*sep);        
                    taz[0].start();  

                    if(cont>0)
                    {
                        taz[1].stop();
                    }
                    ActionListener comandos7=new ActionListener() 
                    {
                        @Override
                        public void actionPerformed(ActionEvent e) 
                        {                
                            posyaz[1]+=1;                
                            lblaz[1].setLocation(170, posyaz[1]); 

                        }
                    };
                    taz[1]=new Timer(2,comandos7);        
                    taz[1].setInitialDelay(inicio+7*sep);        
                    taz[1].start();  

                    if(cont>0)
                    {
                        ta[2].stop();
                    }
                    ActionListener comandos8=new ActionListener() 
                    {
                        @Override
                        public void actionPerformed(ActionEvent e) 
                        {                
                            posya[2]+=1;                
                            lbla[2].setLocation(130, posya[2]); 

                        }
                    };
                    ta[2]=new Timer(2,comandos8);        
                    ta[2].setInitialDelay(inicio+8*sep);        
                    ta[2].start();

                    if(cont>0)
                    {
                        ta[3].stop();
                    }
                    ActionListener comandos9=new ActionListener() 
                    {
                        @Override
                        public void actionPerformed(ActionEvent e) 
                        {                
                            posya[3]+=1;                
                            lbla[3].setLocation(130, posya[3]); 

                        }
                    };
                    ta[3]=new Timer(2,comandos9);        
                    ta[3].setInitialDelay(inicio+9*sep);        
                    ta[3].start();

                    if(cont>0)
                    {
                        tt[0].stop();
                    }
                    ActionListener comandos10=new ActionListener() 
                    {
                        @Override
                        public void actionPerformed(ActionEvent e) 
                        {                
                            posyt[0]+=1;                
                            lblt[0].setLocation(210, posyt[0]); 

                        }
                    };
                    tt[0]=new Timer(2,comandos10);        
                    tt[0].setInitialDelay(inicio+10*sep);        
                    tt[0].start();  

                    if(cont>0)
                    {
                        tt[1].stop();
                    }
                    ActionListener comandos11=new ActionListener() 
                    {
                        @Override
                        public void actionPerformed(ActionEvent e) 
                        {                
                            posyt[1]+=1;                
                            lblt[1].setLocation(210, posyt[1]); 

                        }
                    };
                    tt[1]=new Timer(2,comandos11);        
                    tt[1].setInitialDelay(inicio+11*sep);        
                    tt[1].start();  

                    if(cont>0)
                    {
                        tv[2].stop();
                    }
                    ActionListener comandos12=new ActionListener() 
                    {
                        @Override
                        public void actionPerformed(ActionEvent e) 
                        {                
                            posyv[2]+=1;                
                            lblv[2].setLocation(50, posyv[2]);     

                        }
                    };
                    tv[2]=new Timer(2,comandos12);        
                    tv[2].setInitialDelay(inicio+12*sep);        
                    tv[2].start();

                    if(cont>0)
                    {
                        ta[4].stop();
                    }
                    ActionListener comandos13=new ActionListener() 
                    {
                        @Override
                        public void actionPerformed(ActionEvent e) 
                        {                
                            posya[4]+=1;                
                            lbla[4].setLocation(130, posya[4]); 

                        }
                    };
                    ta[4]=new Timer(2,comandos13);        
                    ta[4].setInitialDelay(inicio+12*sep+sep/2);        
                    ta[4].start();

                    if(cont>0)
                    {
                        tv[3].stop();
                    }
                    ActionListener comandos14=new ActionListener() 
                    {
                        @Override
                        public void actionPerformed(ActionEvent e) 
                        {                
                            posyv[3]+=1;                
                            lblv[3].setLocation(50, posyv[3]);     

                        }
                    };
                    tv[3]=new Timer(2,comandos14);        
                    tv[3].setInitialDelay(inicio+13*sep);        
                    tv[3].start();

                    if(cont>0)
                    {
                        tt[2].stop();
                    }
                    ActionListener comandos15=new ActionListener() 
                    {
                        @Override
                        public void actionPerformed(ActionEvent e) 
                        {                
                            posyt[2]+=1;                
                            lblt[2].setLocation(210, posyt[2]);     

                        }
                    };
                    tt[2]=new Timer(2,comandos15);        
                    tt[2].setInitialDelay(inicio+14*sep);        
                    tt[2].start();

                    if(cont>0)
                    {
                        ta[5].stop();
                    }
                    ActionListener comandos16=new ActionListener() 
                    {
                        @Override
                        public void actionPerformed(ActionEvent e) 
                        {                
                            posya[5]+=1;                
                            lbla[5].setLocation(130, posya[5]); 

                        }
                    };
                    ta[5]=new Timer(2,comandos16);        
                    ta[5].setInitialDelay(inicio+14*sep+sep/2);        
                    ta[5].start();

                    if(cont>0)
                    {
                        tt[3].stop();
                    }
                    ActionListener comandos17=new ActionListener()  
                    {
                        @Override
                        public void actionPerformed(ActionEvent e) 
                        {                
                            posyt[3]+=1;                
                            lblt[3].setLocation(210, posyt[3]);     

                        }
                    };
                    tt[3]=new Timer(2,comandos17);        
                    tt[3].setInitialDelay(inicio+15*sep);        
                    tt[3].start();   

                    cont++;
                }
            };
            timer=new Timer(10564,task2);
            timer.setInitialDelay(0);
            timer.start();

            ActionListener task3=new ActionListener()  
            {
                @Override
                public void actionPerformed(ActionEvent e) 
                {
                    for(i=6;i<12;i++)
                    {
                        posyv[i]=-10;
                        posyr[i]=-10;
                        posya[i]=-10;
                        posyaz[i]=-10;
                        posyt[i]=-10;
                    }

                    if(cont2>0)
                    {
                        tv[6].stop();
                    }
                    ActionListener comandos18=new ActionListener() 
                    {
                        @Override
                        public void actionPerformed(ActionEvent e) 
                        {                
                            posyv[6]+=1;                
                            lblv[6].setLocation(50, posyv[6]);   
                        }
                    };
                    tv[6]=new Timer(2,comandos18);        
                    tv[6].setInitialDelay(inicio);        
                    tv[6].start();

                    if(cont2>0)
                    {
                        tv[7].stop();
                    }
                    ActionListener comandos19=new ActionListener() 
                    {
                        @Override
                        public void actionPerformed(ActionEvent e) 
                        {
                            posyv[7]+=1;
                            lblv[7].setLocation(50, posyv[7]);

                        }
                    };
                    tv[7]=new Timer(2,comandos19);        
                    tv[7].setInitialDelay(inicio+sep);        
                    tv[7].start();

                    if(cont2>0)
                    {
                        ta[6].stop();
                    }
                    ActionListener comandos20=new ActionListener() 
                    {
                        @Override
                        public void actionPerformed(ActionEvent e) 
                        {                
                            posya[6]+=1;                
                            lbla[6].setLocation(130, posya[6]); 

                        }
                    };
                    ta[6]=new Timer(2,comandos20);        
                    ta[6].setInitialDelay(inicio+2*sep);        
                    ta[6].start();

                    if(cont2>0)
                    {
                        ta[7].stop();
                    }
                    ActionListener comandos21=new ActionListener()  
                    {
                        @Override
                        public void actionPerformed(ActionEvent e) 
                        {                
                            posya[7]+=1;                
                            lbla[7].setLocation(130, posya[7]); 

                        }
                    };
                    ta[7]=new Timer(2,comandos21);        
                    ta[7].setInitialDelay(inicio+3*sep);        
                    ta[7].start();

                    if(cont2>0)
                    {
                        tr[6].stop();
                    }
                    ActionListener comandos22=new ActionListener()  
                    {
                        @Override
                        public void actionPerformed(ActionEvent e) 
                        {                
                            posyr[6]+=1;                
                            lblr[6].setLocation(90, posyr[6]);

                        }
                    };
                    tr[6]=new Timer(2,comandos22);        
                    tr[6].setInitialDelay(inicio+4*sep);        
                    tr[6].start();

                    if(cont2>0)
                    {
                        tr[7].stop();
                    }
                    ActionListener comandos23=new ActionListener() 
                    {
                        @Override
                        public void actionPerformed(ActionEvent e) 
                        {                
                            posyr[7]+=1;                
                            lblr[7].setLocation(90, posyr[7]);   

                        }
                    };
                    tr[7]=new Timer(2,comandos23);        
                    tr[7].setInitialDelay(inicio+5*sep);        
                    tr[7].start();  

                    if(cont2>0)
                    {
                        taz[6].stop();
                    }
                    ActionListener comandos24=new ActionListener() 
                    {
                        @Override
                        public void actionPerformed(ActionEvent e) 
                        {                
                            posyaz[6]+=1;                
                            lblaz[6].setLocation(170, posyaz[6]); 

                        }
                    };
                    taz[6]=new Timer(2,comandos24);        
                    taz[6].setInitialDelay(inicio+6*sep);        
                    taz[6].start();  

                    if(cont2>0)
                    {
                        taz[7].stop();
                    }
                    ActionListener comandos25=new ActionListener() 
                    {
                        @Override
                        public void actionPerformed(ActionEvent e) 
                        {                
                            posyaz[7]+=1;                
                            lblaz[7].setLocation(170, posyaz[7]); 

                        }
                    };
                    taz[7]=new Timer(2,comandos25);        
                    taz[7].setInitialDelay(inicio+7*sep);        
                    taz[7].start();  

                    if(cont2>0)
                    {
                        ta[8].stop();
                    }
                    ActionListener comandos26=new ActionListener() 
                    {
                        @Override
                        public void actionPerformed(ActionEvent e) 
                        {                
                            posya[8]+=1;                
                            lbla[8].setLocation(130, posya[8]); 

                        }
                    };
                    ta[8]=new Timer(2,comandos26);        
                    ta[8].setInitialDelay(inicio+8*sep);        
                    ta[8].start();

                    if(cont2>0)
                    {
                        ta[9].stop();
                    }
                    ActionListener comandos27=new ActionListener() 
                    {
                        @Override
                        public void actionPerformed(ActionEvent e) 
                        {                
                            posya[9]+=1;                
                            lbla[9].setLocation(130, posya[9]); 

                        }
                    };
                    ta[9]=new Timer(2,comandos27);        
                    ta[9].setInitialDelay(inicio+9*sep);        
                    ta[9].start();

                    if(cont2>0)
                    {
                        tt[6].stop();
                    }
                    ActionListener comandos28=new ActionListener() 
                    {
                        @Override
                        public void actionPerformed(ActionEvent e) 
                        {                
                            posyt[6]+=1;                
                            lblt[6].setLocation(210, posyt[6]); 

                        }
                    };
                    tt[6]=new Timer(2,comandos28);        
                    tt[6].setInitialDelay(inicio+10*sep);        
                    tt[6].start();  

                    if(cont2>0)
                    {
                        tt[7].stop();
                    }
                    ActionListener comandos29=new ActionListener() 
                    {
                        @Override
                        public void actionPerformed(ActionEvent e) 
                        {                
                            posyt[7]+=1;                
                            lblt[7].setLocation(210, posyt[7]); 

                        }
                    };
                    tt[7]=new Timer(2,comandos29);        
                    tt[7].setInitialDelay(inicio+11*sep);        
                    tt[7].start();  

                    if(cont2>0)
                    {
                        tv[8].stop();
                    }
                    ActionListener comandos30=new ActionListener() 
                    {
                        @Override
                        public void actionPerformed(ActionEvent e) 
                        {                
                            posyv[8]+=1;                
                            lblv[8].setLocation(50, posyv[8]);     

                        }
                    };
                    tv[8]=new Timer(2,comandos30);        
                    tv[8].setInitialDelay(inicio+12*sep);        
                    tv[8].start();

                    if(cont2>0)
                    {
                        ta[10].stop();
                    }
                    ActionListener comandos31=new ActionListener() 
                    {
                        @Override
                        public void actionPerformed(ActionEvent e) 
                        {                
                            posya[10]+=1;                
                            lbla[10].setLocation(130, posya[10]); 

                        }
                    };
                    ta[10]=new Timer(2,comandos31);        
                    ta[10].setInitialDelay(inicio+12*sep+sep/2);        
                    ta[10].start();

                    if(cont2>0)
                    {
                        tv[9].stop();
                    }
                    ActionListener comandos32=new ActionListener() 
                    {
                        @Override
                        public void actionPerformed(ActionEvent e) 
                        {                
                            posyv[9]+=1;                
                            lblv[9].setLocation(50, posyv[9]);     

                        }
                    };
                    tv[9]=new Timer(2,comandos32);        
                    tv[9].setInitialDelay(inicio+13*sep);        
                    tv[9].start();

                    if(cont2>0)
                    {
                        tt[8].stop();
                    }
                    ActionListener comandos33=new ActionListener() 
                    {
                        @Override
                        public void actionPerformed(ActionEvent e) 
                        {                
                            posyt[8]+=1;                
                            lblt[8].setLocation(210, posyt[8]);     

                        }
                    };
                    tt[8]=new Timer(2,comandos33);        
                    tt[8].setInitialDelay(inicio+14*sep);        
                    tt[8].start();

                    if(cont2>0)
                    {
                        ta[11].stop();
                    }
                    ActionListener comandos34=new ActionListener() 
                    {
                        @Override
                        public void actionPerformed(ActionEvent e) 
                        {                
                            posya[11]+=1;                
                            lbla[11].setLocation(130, posya[11]); 

                        }
                    };
                    ta[11]=new Timer(2,comandos34);        
                    ta[11].setInitialDelay(inicio+14*sep+sep/2);        
                    ta[11].start();

                    if(cont2>0)
                    {
                        tt[9].stop();
                    }
                    ActionListener comandos35=new ActionListener()  
                    {
                        @Override
                        public void actionPerformed(ActionEvent e) 
                        {                
                            posyt[9]+=1;                
                            lblt[9].setLocation(210, posyt[9]);     

                        }
                    };
                    tt[9]=new Timer(2,comandos35);        
                    tt[9].setInitialDelay(inicio+15*sep);        
                    tt[9].start();   

                    cont2++;
                }
            };
            timer2=new Timer(10564,task3);
            timer2.setInitialDelay(3500);
            timer2.start();

            
            ActionListener task4=new ActionListener()  
            {
                @Override
                public void actionPerformed(ActionEvent e) 
                {
                    for(i=12;i<18;i++)
                    {
                        posyv[i]=-10;
                        posyr[i]=-10;
                        posya[i]=-10;
                        posyaz[i]=-10;
                        posyt[i]=-10;
                    }

                    if(cont3>0)
                    {
                        tv[12].stop();
                    }
                    ActionListener comandos36=new ActionListener() 
                    {
                        @Override
                        public void actionPerformed(ActionEvent e) 
                        {                
                            posyv[12]+=1;                
                            lblv[12].setLocation(50, posyv[12]);   
                        }
                    };
                    tv[12]=new Timer(2,comandos36);        
                    tv[12].setInitialDelay(inicio);        
                    tv[12].start();

                    if(cont3>0)
                    {
                        tv[13].stop();
                    }
                    ActionListener comandos37=new ActionListener() 
                    {
                        @Override
                        public void actionPerformed(ActionEvent e) 
                        {
                            posyv[13]+=1;
                            lblv[13].setLocation(50, posyv[13]);

                        }
                    };
                    tv[13]=new Timer(2,comandos37);        
                    tv[13].setInitialDelay(inicio+sep);        
                    tv[13].start();

                    if(cont3>0)
                    {
                        ta[12].stop();
                    }
                    ActionListener comandos38=new ActionListener() 
                    {
                        @Override
                        public void actionPerformed(ActionEvent e) 
                        {                
                            posya[12]+=1;                
                            lbla[12].setLocation(130, posya[12]); 

                        }
                    };
                    ta[12]=new Timer(2,comandos38);        
                    ta[12].setInitialDelay(inicio+2*sep);        
                    ta[12].start();

                    if(cont3>0)
                    {
                        ta[13].stop();
                    }
                    ActionListener comandos39=new ActionListener()  
                    {
                        @Override
                        public void actionPerformed(ActionEvent e) 
                        {                
                            posya[13]+=1;                
                            lbla[13].setLocation(130, posya[13]); 

                        }
                    };
                    ta[13]=new Timer(2,comandos39);        
                    ta[13].setInitialDelay(inicio+3*sep);        
                    ta[13].start();

                    if(cont3>0)
                    {
                        tr[12].stop();
                    }
                    ActionListener comandos40=new ActionListener()  
                    {
                        @Override
                        public void actionPerformed(ActionEvent e) 
                        {                
                            posyr[12]+=1;                
                            lblr[12].setLocation(90, posyr[12]);

                        }
                    };
                    tr[12]=new Timer(2,comandos40);        
                    tr[12].setInitialDelay(inicio+4*sep);        
                    tr[12].start();

                    if(cont3>0)
                    {
                        tr[13].stop();
                    }
                    ActionListener comandos41=new ActionListener() 
                    {
                        @Override
                        public void actionPerformed(ActionEvent e) 
                        {                
                            posyr[13]+=1;                
                            lblr[13].setLocation(90, posyr[13]);   

                        }
                    };
                    tr[13]=new Timer(2,comandos41);        
                    tr[13].setInitialDelay(inicio+5*sep);        
                    tr[13].start();  

                    if(cont3>0)
                    {
                        taz[12].stop();
                    }
                    ActionListener comandos42=new ActionListener() 
                    {
                        @Override
                        public void actionPerformed(ActionEvent e) 
                        {                
                            posyaz[12]+=1;                
                            lblaz[12].setLocation(170, posyaz[12]); 

                        }
                    };
                    taz[12]=new Timer(2,comandos42);        
                    taz[12].setInitialDelay(inicio+6*sep);        
                    taz[12].start();  

                    if(cont3>0)
                    {
                        taz[13].stop();
                    }
                    ActionListener comandos43=new ActionListener() 
                    {
                        @Override
                        public void actionPerformed(ActionEvent e) 
                        {                
                            posyaz[13]+=1;                
                            lblaz[13].setLocation(170, posyaz[13]); 

                        }
                    };
                    taz[13]=new Timer(2,comandos43);        
                    taz[13].setInitialDelay(inicio+7*sep);        
                    taz[13].start();  

                    if(cont3>0)
                    {
                        ta[14].stop();
                    }
                    ActionListener comandos44=new ActionListener() 
                    {
                        @Override
                        public void actionPerformed(ActionEvent e) 
                        {                
                            posya[14]+=1;                
                            lbla[14].setLocation(130, posya[14]); 

                        }
                    };
                    ta[14]=new Timer(2,comandos44);        
                    ta[14].setInitialDelay(inicio+8*sep);        
                    ta[14].start();

                    if(cont3>0)
                    {
                        ta[15].stop();
                    }
                    ActionListener comandos45=new ActionListener() 
                    {
                        @Override
                        public void actionPerformed(ActionEvent e) 
                        {                
                            posya[15]+=1;                
                            lbla[15].setLocation(130, posya[15]); 

                        }
                    };
                    ta[15]=new Timer(2,comandos45);        
                    ta[15].setInitialDelay(inicio+9*sep);        
                    ta[15].start();

                    if(cont3>0)
                    {
                        tt[12].stop();
                    }
                    ActionListener comandos46=new ActionListener() 
                    {
                        @Override
                        public void actionPerformed(ActionEvent e) 
                        {                
                            posyt[12]+=1;                
                            lblt[12].setLocation(210, posyt[12]); 

                        }
                    };
                    tt[12]=new Timer(2,comandos46);        
                    tt[12].setInitialDelay(inicio+10*sep);        
                    tt[12].start();  

                    if(cont3>0)
                    {
                        tt[13].stop();
                    }
                    ActionListener comandos47=new ActionListener() 
                    {
                        @Override
                        public void actionPerformed(ActionEvent e) 
                        {                
                            posyt[13]+=1;                
                            lblt[13].setLocation(210, posyt[13]); 

                        }
                    };
                    tt[13]=new Timer(2,comandos47);        
                    tt[13].setInitialDelay(inicio+11*sep);        
                    tt[13].start();  

                    if(cont3>0)
                    {
                        tv[14].stop();
                    }
                    ActionListener comandos48=new ActionListener() 
                    {
                        @Override
                        public void actionPerformed(ActionEvent e) 
                        {                
                            posyv[14]+=1;                
                            lblv[14].setLocation(50, posyv[14]);     

                        }
                    };
                    tv[14]=new Timer(2,comandos48);        
                    tv[14].setInitialDelay(inicio+12*sep);        
                    tv[14].start();

                    if(cont3>0)
                    {
                        ta[16].stop();
                    }
                    ActionListener comandos49=new ActionListener() 
                    {
                        @Override
                        public void actionPerformed(ActionEvent e) 
                        {                
                            posya[16]+=1;                
                            lbla[16].setLocation(130, posya[16]); 

                        }
                    };
                    ta[16]=new Timer(2,comandos49);        
                    ta[16].setInitialDelay(inicio+12*sep+sep/2);        
                    ta[16].start();

                    if(cont3>0)
                    {
                        tv[15].stop();
                    }
                    ActionListener comandos50=new ActionListener() 
                    {
                        @Override
                        public void actionPerformed(ActionEvent e) 
                        {                
                            posyv[15]+=1;                
                            lblv[15].setLocation(50, posyv[15]);     

                        }
                    };
                    tv[15]=new Timer(2,comandos50);        
                    tv[15].setInitialDelay(inicio+13*sep);        
                    tv[15].start();

                    if(cont3>0)
                    {
                        tt[14].stop();
                    }
                    ActionListener comandos51=new ActionListener() 
                    {
                        @Override
                        public void actionPerformed(ActionEvent e) 
                        {                
                            posyt[14]+=1;                
                            lblt[14].setLocation(210, posyt[14]);     

                        }
                    };
                    tt[14]=new Timer(2,comandos51);        
                    tt[14].setInitialDelay(inicio+14*sep);        
                    tt[14].start();

                    if(cont3>0)
                    {
                        ta[17].stop();
                    }
                    ActionListener comandos52=new ActionListener() 
                    {
                        @Override
                        public void actionPerformed(ActionEvent e) 
                        {                
                            posya[17]+=1;                
                            lbla[17].setLocation(130, posya[17]); 

                        }
                    };
                    ta[17]=new Timer(2,comandos52);        
                    ta[17].setInitialDelay(inicio+14*sep+sep/2);        
                    ta[17].start();

                    if(cont3>0)
                    {
                        tt[15].stop();
                    }
                    ActionListener comandos53=new ActionListener()  
                    {
                        @Override
                        public void actionPerformed(ActionEvent e) 
                        {                
                            posyt[15]+=1;                
                            lblt[15].setLocation(210, posyt[15]);     
                        }
                    };
                    tt[15]=new Timer(2,comandos53);        
                    tt[15].setInitialDelay(inicio+15*sep);        
                    tt[15].start();   

                    cont3++;
                }
            };
            timer3=new Timer(10564,task4);
            timer3.setInitialDelay(7000);
            timer3.start();




             ActionListener comandos=new ActionListener() 
             {
                @Override
                public void actionPerformed(ActionEvent e) 
                {         
                    for(i2=0;i2<notas;i2++)
                    {
                       if (posyv[i2]>580&&posyv[i2]<630)
                       {                    
                           if(brv==true)
                           {
                               bv=true;
                               break;                        
                           }
                           else
                           {
                               bv=false;
                           }                    
                       }

                       if (posyr[i2]>580&&posyr[i2]<630)
                       {                    
                           if(brr==true)
                           {
                               br=true;
                               break;                        
                           }
                           else
                           {
                               br=false;
                           }                    
                       }

                       if (posya[i2]>580&&posya[i2]<630)
                       {                    
                           if(bra==true)
                           {
                               ba=true;
                               break;                        
                           }
                           else
                           {
                               ba=false;
                           }                    
                       }

                       if (posyaz[i2]>580&&posyaz[i2]<630)
                       {                    
                           if(braz==true)
                           {
                               baz=true;
                               break;                        
                           }
                           else
                           {
                               baz=false;
                           }                    
                       }

                       if (posyt[i2]>580&&posyt[i2]<630)
                       {                    
                           if(brt==true)
                           {
                               bt=true;
                               break;                        
                           }
                           else
                           {
                               bt=false;
                           }                    
                       }
                    }

                    if(bv|| br || ba || baz || bt)
                    {     
                        try {
                            player.control.setGain(1);
                            } catch (BasicPlayerException ex) {
                            Logger.getLogger(Guitar_Subway.class.getName()).log(Level.SEVERE, null, ex);
                            }
                    }

                    for(i2=0;i2<notas;i2++)
                    {
                        if(posyv[i2]==630&&!bv)
                        {
                            try 
                            {
                                player.control.setGain(0);
                            } catch (BasicPlayerException ex) {
                                Logger.getLogger(Guitar_Subway.class.getName()).log(Level.SEVERE, null, ex);
                            }
                            nivel--;
                        }  

                        if(posyr[i2]==630&&!br)
                        {
                            try 
                            {
                                player.control.setGain(0);
                            } catch (BasicPlayerException ex) {
                                Logger.getLogger(Guitar_Subway.class.getName()).log(Level.SEVERE, null, ex);
                            }
                            nivel--;
                        }   

                        if(posya[i2]==630&&!ba)
                        {
                            try 
                            {
                                player.control.setGain(0);
                            } catch (BasicPlayerException ex) {
                                Logger.getLogger(Guitar_Subway.class.getName()).log(Level.SEVERE, null, ex);
                            }
                            nivel--;
                        }   

                        if(posyaz[i2]==630&&!baz)
                        {
                            try 
                            {
                                player.control.setGain(0);
                            } catch (BasicPlayerException ex) {
                                Logger.getLogger(Guitar_Subway.class.getName()).log(Level.SEVERE, null, ex);
                            }
                            nivel--;
                        }   

                        if(posyt[i2]==630&&!bt)
                        {
                            try 
                            {
                                player.control.setGain(0);
                            } catch (BasicPlayerException ex) {
                                Logger.getLogger(Guitar_Subway.class.getName()).log(Level.SEVERE, null, ex);
                            }
                            nivel--;
                        }   
                    }
                }
             };
             tcomp=new Timer(2,comandos);         
             tcomp.start();

             while(true)
             {
                 switch(nivel)
                 {
                     case -1:
                         
                         
                         lblp.setBounds(100, 100, 110,50);
                         lblpcon.setBounds(200, 100, 110,50);
                         lose.getContentPane().add(lblp);
                         lose.getContentPane().add(lblpcon);
                         player.control.stop();                         
                         lose.setVisible(true);
                         ventana.setVisible(false);
                         break;

                     case 0:
                         lblnivel.setIcon(I0);
                         break;

                     case 1:
                         lblnivel.setIcon(I1);
                         break;

                     case 2:
                         lblnivel.setIcon(I2);
                         break;

                     case 3:
                         lblnivel.setIcon(I3);
                         break;

                     case 4:
                         lblnivel.setIcon(I4);
                         break;

                     case 5:
                         lblnivel.setIcon(I5);
                         break;
                     case 6:
                         lblnivel.setIcon(I6);
                         break;

                     case 7:
                         lblnivel.setIcon(I7);
                         break;

                     case 8:
                         lblnivel.setIcon(I8);
                         break;

                     case 9:
                         lblnivel.setIcon(I9);
                         break;

                     case 10:
                         lblnivel.setIcon(I10);
                         break;

                     case 11:
                         lblnivel.setIcon(I11);
                         break;

                     case 12:
                         lblnivel.setIcon(I12);
                         break;

                     case 13:
                         lblnivel.setIcon(I13);
                         break;

                     case 14:
                         lblnivel.setIcon(I14);
                         break;

                     case 15:
                         lblnivel.setIcon(I15);
                         break;
                     case 16:
                         lblnivel.setIcon(I16);
                         break;

                     case 17:
                         lblnivel.setIcon(I17);
                         break;

                     case 18:
                         lblnivel.setIcon(I18);
                         break;

                     case 19:
                         lblnivel.setIcon(I19);
                         break;

                     case 20:
                         lblnivel.setIcon(I20);
                         break;               
                 }


             }
        }
        Thread.sleep(25);
        }
         
        
            
         
         
                
    }

     private void searchForControllers() {
        Controller[] controllers = ControllerEnvironment.getDefaultEnvironment().getControllers();

        for(int i = 0; i < controllers.length; i++){
            Controller controller = controllers[i];
            
            if (
                    controller.getType() == Controller.Type.STICK || 
                    controller.getType() == Controller.Type.GAMEPAD || 
                    controller.getType() == Controller.Type.WHEEL ||
                    controller.getType() == Controller.Type.FINGERSTICK
               )
            {
                // Add new controller to the list of all controllers.
                foundControllers.add(controller);
                
               
            }
        }
    }
     
     private void startShowingControllerData(){
        while(true)
        {
            // Currently selected controller.
            int selectedControllerIndex = 0;
            Controller controller = foundControllers.get(selectedControllerIndex);

            // Pull controller for current data, and break while loop if controller is disconnected.
            if( !controller.poll() ){
                System.out.println("desconectado");
                break;
            }
            
            // X axis and Y axis
            int xAxisPercentage = 0;
            int yAxisPercentage = 0;
            // JPanel for other axes.
            JPanel axesPanel = new JPanel(new FlowLayout(FlowLayout.LEFT, 25, 2));
            axesPanel.setBounds(0, 0, 200, 190);
            
            // JPanel for controller buttons
            JPanel buttonsPanel = new JPanel(new FlowLayout(FlowLayout.LEFT, 1, 1));
            buttonsPanel.setBounds(6, 19, 246, 110);
                    
            // Go trough all components of the controller.
            Component[] components = controller.getComponents();
            for(int i=0; i < components.length; i++)
            {
                Component component = components[i];
                Identifier componentIdentifier = component.getIdentifier();
                
                // Buttons
                //if(component.getName().contains("Button")){ // If the language is not english, this won't work.
                if(componentIdentifier.getName().matches("^[0-9]*$")){ // If the component identifier name contains only numbers, then this is a button.
                    // Is button pressed?
                    boolean isItPressed = true;
                    if(component.getPollData() == 0.0f)
                        isItPressed = false;
                    
                    // Button index
                    String buttonIndex;
                    buttonIndex = component.getIdentifier().toString();
                    
                    // Create and add new button to panel.
                    JToggleButton aToggleButton = new JToggleButton(buttonIndex, isItPressed);
                    aToggleButton.setPreferredSize(new Dimension(48, 25));
                    aToggleButton.setEnabled(false);
                    buttonsPanel.add(aToggleButton);
                    
                    if(buttonIndex=="6"&&isItPressed)
                    {
                        System.out.println("hola");                       
                    }
                    
                }
                
                // Hat switch
                if(componentIdentifier == Component.Identifier.Axis.POV){
                    float hatSwitchPosition = component.getPollData();
                    
                    // We know that this component was hat switch so we can skip to next component.
                    continue;
                }
                
                // Axes
                if(component.isAnalog()){
                    float axisValue = component.getPollData();
                    int axisValueInPercentage = getAxisValueInPercentage(axisValue);
                    
                    // X axis
                    if(componentIdentifier == Component.Identifier.Axis.X){
                        xAxisPercentage = axisValueInPercentage;
                        continue; // Go to next component.
                    }
                    // Y axis
                    if(componentIdentifier == Component.Identifier.Axis.Y){
                        yAxisPercentage = axisValueInPercentage;
                        continue; // Go to next component.
                    }
                    
                    // Other axis
                    JLabel progressBarLabel = new JLabel(component.getName());
                    JProgressBar progressBar = new JProgressBar(0, 100);
                    progressBar.setValue(axisValueInPercentage);
                    axesPanel.add(progressBarLabel);
                    axesPanel.add(progressBar);
                }
            }
            

            
            // We have to give processor some rest.
            try {
                Thread.sleep(25);
            } catch (InterruptedException ex) {
                Logger.getLogger(Guitar_Subway.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
     
     public int getAxisValueInPercentage(float axisValue)
    {
        return (int)(((2 - (1 - axisValue)) * 100) / 2);
    }
    @Override
    public void keyTyped(KeyEvent e) 
    {
        
    }

    @Override
    public void keyPressed(KeyEvent e) 
    {                
        if(e.getKeyCode()==KeyEvent.VK_A)
        {            
            brv=true;
            for(i=0;i<notas;i++)
            {
                if(posyv[i]>580&&posyv[i]<630)
                {      
                    puntov=true;
                    break;                           
                }
                else
                {
                    puntov=false;                
                }
            }
            if(puntov)
            {                
                puntov=false;
                puntaje+=100;
                lblpcon.setText(String.valueOf(puntaje));
                posyv[i]=1000;
                lblf.setLocation(50, 580);
                lblf.setVisible(true);   
                if(nivel!=20)
                {
                    nivel++;
                }
            }
            else
            {
                try {
                    fail.control.stop();
                } catch (BasicPlayerException ex) {
                    Logger.getLogger(Guitar_Subway.class.getName()).log(Level.SEVERE, null, ex);
                }
                try {
                    fail.control.play();
                } catch (BasicPlayerException ex) {
                    Logger.getLogger(Guitar_Subway.class.getName()).log(Level.SEVERE, null, ex);
                }
                nivel--;
                
                
            }
            lblrv.setVisible(false);
            lblrv1.setVisible(true);
            
        }
        
        if(e.getKeyCode()==KeyEvent.VK_S)
        {
            brr=true;
            for(i=0;i<notas;i++)
            {
                if(posyr[i]>580&&posyr[i]<630)
                {      
                    puntor=true;
                    break;                           
                }
                else
                {
                    puntor=false;                
                }
            }
            if(puntor)
            {                
                puntor=false;
                puntaje+=100;
                lblpcon.setText(String.valueOf(puntaje));
                posyr[i]=1000;
                lblf.setLocation(90, 580);
                lblf.setVisible(true);  
                if(nivel!=20)
                {
                    nivel++;
                }
            }
            else
            {
                try {
                    fail.control.stop();
                } catch (BasicPlayerException ex) {
                    Logger.getLogger(Guitar_Subway.class.getName()).log(Level.SEVERE, null, ex);
                }
                try {
                    fail.control.play();
                } catch (BasicPlayerException ex) {
                    Logger.getLogger(Guitar_Subway.class.getName()).log(Level.SEVERE, null, ex);
                }
                nivel--;
                
                
            }            
            lblrr.setVisible(false);
            lblrr1.setVisible(true);
        }
        
        if(e.getKeyCode()==KeyEvent.VK_D)
        {
            bra=true;
            for(i=0;i<notas;i++)
            {
                if(posya[i]>580&&posya[i]<630)
                {      
                    puntoa=true;
                    break;                           
                }
                else
                {
                    puntoa=false;                
                }
            }
            if(puntoa)
            {                
                puntoa=false;
                puntaje+=100;
                lblpcon.setText(String.valueOf(puntaje));
                posya[i]=1000;
                lblf.setLocation(130, 580);
                lblf.setVisible(true);  
                if(nivel!=20)
                {
                    nivel++;
                }
            }
            else
            {
                try {
                    fail.control.stop();
                } catch (BasicPlayerException ex) {
                    Logger.getLogger(Guitar_Subway.class.getName()).log(Level.SEVERE, null, ex);
                }
                try {
                    fail.control.play();
                } catch (BasicPlayerException ex) {
                    Logger.getLogger(Guitar_Subway.class.getName()).log(Level.SEVERE, null, ex);
                }
                nivel--;
                
            }            
            lblra.setVisible(false);
            lblra1.setVisible(true);
        }
        if(e.getKeyCode()==KeyEvent.VK_F)
        {
            braz=true;
            for(i=0;i<notas;i++)
            {
                if(posyaz[i]>580&&posyaz[i]<630)
                {      
                    puntoaz=true;
                    break;                           
                }
                else
                {
                    puntoaz=false;                
                }
            }
            if(puntoaz)
            {                
                puntoaz=false;
                puntaje+=100;
                lblpcon.setText(String.valueOf(puntaje));
                posyaz[i]=1000;
                lblf.setLocation(170, 580);
                lblf.setVisible(true);  
                if(nivel!=20)
                {
                    nivel++;
                }
            }
            else
            {
                try {
                    fail.control.stop();
                } catch (BasicPlayerException ex) {
                    Logger.getLogger(Guitar_Subway.class.getName()).log(Level.SEVERE, null, ex);
                }
                try {
                    fail.control.play();
                } catch (BasicPlayerException ex) {
                    Logger.getLogger(Guitar_Subway.class.getName()).log(Level.SEVERE, null, ex);
                }
                nivel--;
                
            }            
            lblraz.setVisible(false);
            lblraz1.setVisible(true);
        }
        
        if(e.getKeyCode()==KeyEvent.VK_G)
        {
            brt=true;
            for(i=0;i<notas;i++)
            {
                if(posyt[i]>580&&posyt[i]<630)
                {      
                    puntot=true;
                    break;                           
                }
                else
                {
                    puntot=false;                
                }
            }
            if(puntot)
            {                
                puntot=false;
                puntaje+=100;
                lblpcon.setText(String.valueOf(puntaje));
                posyt[i]=1000;
                lblf.setLocation(210, 580);
                lblf.setVisible(true);  
                if(nivel!=20)
                {
                    nivel++;
                }
            }
            else
            {
                try {
                    fail.control.stop();
                } catch (BasicPlayerException ex) {
                    Logger.getLogger(Guitar_Subway.class.getName()).log(Level.SEVERE, null, ex);
                }
                try {
                    fail.control.play();
                } catch (BasicPlayerException ex) {
                    Logger.getLogger(Guitar_Subway.class.getName()).log(Level.SEVERE, null, ex);
                }
                nivel--;
                
            }
            lblrt.setVisible(false);
            lblrt1.setVisible(true);
        }
        
        if(e.getKeyCode()==KeyEvent.VK_DOWN)
        {
            lblopc.setIcon(salir);
            
        }
        
        if(e.getKeyCode()==KeyEvent.VK_UP)
        {
            lblopc.setIcon(iniciar);
            
        }
        
        if(e.getKeyCode()==KeyEvent.VK_ENTER)
        {
            if(menu.isVisible())
            {
                if(lblopc.getIcon()==iniciar)
                {
                    ventana.setVisible(true);
                    menu.setVisible(false);
                }
                if(lblopc.getIcon()==salir)
                {
                    System.exit(0);
                }
            }
            if(lose.isVisible())
            {                
                    System.exit(0);                
            }
        }
        
        
    }

    @Override
    public void keyReleased(KeyEvent e) 
    {  
        if(e.getKeyCode()==KeyEvent.VK_A)
        {         
            brv=false;
            lblrv.setVisible(true);
            lblrv1.setVisible(false);
            lblf.setVisible(false);   
        }
        
        if(e.getKeyCode()==KeyEvent.VK_S)
        {
            brr=false;
            lblrr.setVisible(true);
            lblrr1.setVisible(false);
            lblf.setVisible(false); 
        }
        
        if(e.getKeyCode()==KeyEvent.VK_D)
        {
            bra=false;
            lblra.setVisible(true);
            lblra1.setVisible(false);
            lblf.setVisible(false); 
        }
        if(e.getKeyCode()==KeyEvent.VK_F)
        {
            braz=false;
            lblraz.setVisible(true);
            lblraz1.setVisible(false);
            lblf.setVisible(false); 
        }
        
        if(e.getKeyCode()==KeyEvent.VK_G)
        {
            braz=false;
            lblrt.setVisible(true);
            lblrt1.setVisible(false);
            lblf.setVisible(false); 
        }
        
        
    }



}
