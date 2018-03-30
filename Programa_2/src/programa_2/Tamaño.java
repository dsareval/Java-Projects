/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package programa_2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author Lore
 */
public class Tamaño 
{
    BufferedReader tcl=new BufferedReader(new InputStreamReader(System.in));
    
    public int []Vector=new int[10];
    public int num;
    
    public void Mostrar() throws IOException
    {        
        String aux;
        for(num=0;num<10;num++)
        {            
            System.out.println("Ingrese un número");
            aux=tcl.readLine();
            Vector[num]=Integer.valueOf(aux);
        }
        System.out.println("El vector posee "+Vector.length+" posiciones");
    }
}
