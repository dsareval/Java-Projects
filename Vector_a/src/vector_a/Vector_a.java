/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package vector_a;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author Lore
 */
public class Vector_a 
{
    BufferedReader tcl=new BufferedReader(new InputStreamReader(System.in));
    
    public int cont;
    public int Numeros[]=new int[20];    
    
    public void presentar() throws IOException
    {
        System.out.println("Ingrese 20 números: ");
        
        for(cont=0;cont<20;cont++)
        {
            Numeros[cont]=Integer.valueOf(tcl.readLine());
        }
        
        for(cont=0;cont<20;cont++)
        {
            System.out.println(Numeros[cont]);
        }
        
        for(cont=0;cont<20;cont++)
        {
            System.out.print(Numeros[cont]+", ");
        }
    }
}
