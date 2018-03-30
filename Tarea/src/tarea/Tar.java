/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package tarea;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author Lore
 */
public class Tar 
{
    public int num;
    public String opcion;
    public void elegir () throws IOException 
    {
        BufferedReader tcl = new BufferedReader (new InputStreamReader (System.in)); 
        do
        {
            System.out.println("Ingrese el numero ");
            num=Integer.valueOf(tcl.readLine());
            
        }while (opcion.equals("si")); 
                
    }
}
