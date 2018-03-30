/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio7;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author Administrador
 */
public class Ejercicio7 
{
    BufferedReader tcl=new BufferedReader(new InputStreamReader(System.in));
    
    public int habitaciones;
    public int pers_habitacion;
    
    public void asignarvalores() throws IOException
    {
        System.out.println("Ingrese el número de habitaciones");
        habitaciones=Integer.valueOf(tcl.readLine());
        System.out.println("Ingrese el número de perosnas por habitación");
        pers_habitacion=Integer.valueOf(tcl.readLine());
    }
    
    public void calcularpersonas()
    {
        System.out.println("El número de personas que entran en el crucero es "+habitaciones*pers_habitacion);
    }
}
