/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package programa7;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author Administrador
 */
public class Crucero {
    BufferedReader teclado=new BufferedReader(new InputStreamReader(System.in));
    
    public int habitaciones;
    public int num_personas;
    public int total_pers;
    
    public void setearvalores() throws IOException
    {
        System.out.println("Ingrese el número de habitaciones: ");
        habitaciones=Integer.valueOf(teclado.readLine());
        System.out.println("Ingrese el número de perosnas que hay por habitación: ");
        num_personas=Integer.valueOf(teclado.readLine());
    }
    
    public void calcularpersonas()
    {
        total_pers=habitaciones*num_personas;
        System.out.println("La capacidad de personas del crucero es: "+total_pers);
    }
}
