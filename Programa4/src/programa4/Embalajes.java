/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package programa4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author Administrador
 */
public class Embalajes {
    BufferedReader teclado=new BufferedReader(new InputStreamReader(System.in));
    
    public int t1;
    public int t2;
    public int t3;
    public int t4;
    public int ttotal;
    public int tseg;
    public int tmins;
    
    public void setearvalores() throws IOException
    {
        System.out.println("Ingrese el tiempo 1: ");
        t1=Integer.valueOf(teclado.readLine());
        System.out.println("Ingrese el tiempo 2: ");
        t2=Integer.valueOf(teclado.readLine());
        System.out.println("Ingrese el tempo 3: ");
        t3=Integer.valueOf(teclado.readLine());
        System.out.println("Ingrese el tempo 4: ");
        t4=Integer.valueOf(teclado.readLine());        
    }
    
    public void calculartiempo()
    {
        ttotal=t1+t2+t3+t4;
        tmins=ttotal/60;
        tseg=ttotal%60;
        System.out.println("EL tiempo de embalaje es "+tmins+" minutos y "+tseg+" segundos");
    }
}
