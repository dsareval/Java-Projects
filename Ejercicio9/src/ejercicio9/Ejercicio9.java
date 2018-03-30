/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio9;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author Administrador
 */
public class Ejercicio9 
{
    BufferedReader tcl=new BufferedReader(new InputStreamReader(System.in));
    
    public double dolares;
    public double euros;
    
    public void asignarvalores() throws IOException
    {
        System.out.println("Ingrese el valor en dolares: ");
        dolares=Integer.valueOf(tcl.readLine());        
    }
    
    public void calculareuros()
    {
        euros=dolares*1.3048;
        System.out.println("El valor en euros es: "+euros);
    }
}
