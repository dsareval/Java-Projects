/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package vector_c;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author Lore
 */
public class Vector_c 
{
    BufferedReader tcl=new BufferedReader(new InputStreamReader(System.in));
    
    public int Vector_c1[]=new int[5];
    public int Vector_c2[]=new int[5];
    public int Vector_c3[]=new int[5];
    public int cont_c;
    public int cont_c2;
    
    public void Operar() throws IOException
    {
        System.out.println("Ingrese 5 números: ");
        for(cont_c=0;cont_c<5;cont_c++)
        {
            Vector_c1[cont_c]=Integer.valueOf(tcl.readLine());            
        }
        
        System.out.println("Ingrese 5 números: ");
        for(cont_c=0;cont_c<5;cont_c++)
        {
            Vector_c2[cont_c]=Integer.valueOf(tcl.readLine());            
        }
        
        for(cont_c=0;cont_c<5;cont_c++)
        {
            Vector_c3[cont_c]=Vector_c1[cont_c]+Vector_c2[cont_c];
            System.out.println(Vector_c1[cont_c]+" + "+Vector_c2[cont_c]+" = "+Vector_c3[cont_c]);
        }
        
        for(cont_c=0;cont_c<5;cont_c++)
        {
            Vector_c3[cont_c]=Vector_c1[cont_c]-Vector_c2[cont_c];
            System.out.println(Vector_c1[cont_c]+" - "+Vector_c2[cont_c]+" = "+Vector_c3[cont_c]);
        }
        
        for(cont_c=0;cont_c<5;cont_c++)
        {
            for(cont_c2=0;cont_c2<5;cont_c2++)
            {
                Vector_c3[cont_c]+=Vector_c1[cont_c]*Vector_c2[cont_c2];
            }
            System.out.println("el producto de los vectores en la posición "+cont_c+" es: "+Vector_c3[cont_c]);
        }
    }
}
