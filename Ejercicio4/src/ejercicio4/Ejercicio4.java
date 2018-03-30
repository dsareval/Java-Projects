/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author Administrador
 */
public class Ejercicio4 
{
    BufferedReader tcl=new BufferedReader(new InputStreamReader(System.in));
    
    public int t1;
    public int t2;
    public int t3;
    public int t4;
    public int tt;
    
    public void asignarvalores() throws IOException
    {
        System.out.println("Ingrese el primer tiempo de embalaje");
        t1=Integer.valueOf(tcl.readLine());
        System.out.println("Ingrese el segundo tiempo de embalaje");
        t2=Integer.valueOf(tcl.readLine());
        System.out.println("Ingrese el tercer tiempo de embalaje");
        t3=Integer.valueOf(tcl.readLine());
        System.out.println("Ingrese el cuarto tiempo de embalaje");
        t4=Integer.valueOf(tcl.readLine());        
    }
    
    public void calculartiempo()
    {
        tt=t1+t2+t3+t4;
        System.out.println("EL tiempo total de embalaje es "+(tt/60)+" minutos y "+(tt%60)+" segundos");
    }
}
