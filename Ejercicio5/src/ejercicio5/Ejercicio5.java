/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author Administrador
 */
public class Ejercicio5 
{
    BufferedReader tcl=new BufferedReader(new InputStreamReader(System.in));
    
    public int base;
    public int exponente;
    
    public void asignarvalores() throws IOException
    {
        System.out.println("Ingrese la base");
        base=Integer.valueOf(tcl.readLine());
        System.out.println("Ingrese el exponente");
        exponente=Integer.valueOf(tcl.readLine());
    }
    
    public void calcularpotencia()
    {
        System.out.println("la potencia da como resultado "+(int) Math.pow(base,exponente));
    }
    
    
}


