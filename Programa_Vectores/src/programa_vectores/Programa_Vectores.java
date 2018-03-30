/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package programa_vectores;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author Lore
 */
public class Programa_Vectores 
{
    BufferedReader tcl=new BufferedReader(new InputStreamReader(System.in));
    
    public int cont_a;
    public int Vector_a[]=new int[20];
    
    public int cont_b;
    public int Vector_b[]=new int[10];
    
    public int cont_c;
    public int cont_c2;
    public int Vector_c1[]=new int[5];
    public int Vector_c2[]=new int[5];
    public int Vector_c3[]=new int[5];
    
    public int cont_d;
    public int num_d;
    public int Vector_d1[]=new int[10];
    public int Vector_d2[]=new int[5];

    
    public void Programa_a() throws IOException
    {
        System.out.println("Ingrese 20 números: ");
        
        for(cont_a=0;cont_a<20;cont_a++)
        {
            Vector_a[cont_a]=Integer.valueOf(tcl.readLine());
        }
        
        for(cont_a=0;cont_a<20;cont_a++)
        {
            System.out.println(Vector_a[cont_a]);
        }
        
        for(cont_a=0;cont_a<19;cont_a++)
        {
            System.out.print(Vector_a[cont_a]+", ");
        }
        System.out.println(Vector_a[cont_a]);
        
        System.out.println("------------------------------------------------------------------------------------------------------------------------");
    }
    
    public void Programa_b() throws IOException
    {
        System.out.println("Ingrese 10 números:");
        for(cont_b=0;cont_b<10;cont_b++)
        {
            Vector_b[cont_b]=Integer.valueOf(tcl.readLine());
        }
        System.out.println("el tamaño del vector es: "+Vector_b.length);
        System.out.println("------------------------------------------------------------------------------------------------------------------------");
    }    
    
    public void Programa_c() throws IOException
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
        System.out.println("------------------------------------------------------------------------------------------------------------------------");
    }
    
    public void Programa_d() throws IOException
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
