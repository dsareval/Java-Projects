/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package vector_b;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author Lore
 */
public class Vector_b 
{
    BufferedReader tcl=new BufferedReader(new InputStreamReader(System.in));
    
    public int Vector_b[]=new int[10];
    public int cont_b;
    
    public void Calcular() throws IOException
    {
        System.out.println("Ingrese 10 números:");
        for(cont_b=0;cont_b<10;cont_b++)
        {
            Vector_b[cont_b]=Integer.valueOf(tcl.readLine());
        }
        System.out.println("el tamaño del vector es: "+Vector_b.length);
    }
}
