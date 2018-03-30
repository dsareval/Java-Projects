/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package vector_d;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author Lore
 */
public class Vector_d 
{
    BufferedReader tcl=new BufferedReader(new InputStreamReader(System.in));
    public int Vector_d1[]=new int[10];
    public int Vector_d2[]=new int[5];
    public int cont_d;
    public int num_d;
    
    public void Presentar() throws IOException
    {
        System.out.println("Ingrese 10 números: ");
        for(cont_d=0;cont_d<10;cont_d++)
        {
            Vector_d1[cont_d]=Integer.valueOf(tcl.readLine());
        }
        
        Vector_d2[0]=Vector_d1.length;
        
        for(cont_d=0;cont_d<10;cont_d++)
        {
            Vector_d2[1]+=Vector_d1[cont_d];
        }
        
        Vector_d2[2]=1;
        
        for(cont_d=0;cont_d<10;cont_d++)
        {
            Vector_d2[2]*=Vector_d1[cont_d];
        }
        
        Vector_d2[3]=Vector_d2[1]/Vector_d2[0];
        
        System.out.println("El tamaño del vector es: "+Vector_d2[0]);
        System.out.println("La suma de todos sus índices es: "+Vector_d2[1]);
        System.out.println("El producto de todos sus índices es: "+Vector_d2[2]);
        System.out.println("El promedio de todos sus índices es: "+Vector_d2[3]);
        System.out.print("Ingrese el número a buscarse: ");
        num_d=Integer.valueOf(tcl.readLine());
        for(cont_d=0;cont_d<10;cont_d++)
        {
            if(Vector_d1[cont_d]==num_d)
            {
                Vector_d2[4]++;
            }
        }
        System.out.println("La cantidad de "+num_d+" en el vector es: "+Vector_d2[4]);
    }
}
