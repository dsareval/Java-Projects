/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio6;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author Administrador
 */
public class Ejercicio6 
{
    BufferedReader tcl=new BufferedReader(new InputStreamReader(System.in));
    
    public float cat1;
    public float cat2;
    public float hip;
    
    public void asignarvalores() throws IOException
    {
        System.out.println("Ingrese el cateto 1");
        cat1=Integer.valueOf(tcl.readLine());
        System.out.println("Ingrese el cateto 2");
        cat2=Integer.valueOf(tcl.readLine());
    }
    
    public void calcularhipotenusa()
    {
        hip=(float) Math.sqrt((float) ((float) Math.pow(cat1, 2) + Math.pow(cat2, 2)));
        System.out.println("La hipotenusa es "+hip);
    }
}
