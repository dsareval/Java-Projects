/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package program;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author Lore
 */
public class Program 
{
    BufferedReader tcl=new BufferedReader(new InputStreamReader(System.in));
    
    public int Vector[]=new int[10];
    public int cont;
    
    public void mostrar() throws IOException
    {
        System.out.println("Ingrese 10 números: ");
        for(cont=0;cont<10;cont++)
        {
            Vector[cont]=Integer.valueOf(tcl.readLine());
        }
        
        cont=0;
        while (Vector[cont]!=2)
        {
            cont++;
        }
        
        System.out.println("El número 2 se encuentra en la posición: "+cont);
    }
}
