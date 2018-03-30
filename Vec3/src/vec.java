
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Lore
 */
public class vec 
{
    public int vector[]=new int[5];
    public int vector1[]=new int[5];
    public int n;
    public int nu;
    public int cont;
    
    public void operar() throws IOException
    {
        BufferedReader tcl=new BufferedReader(new InputStreamReader(System.in));
        
        System.out.println("Ingrese numeros: ");
        
        for(n=0;n<5;n++)
        {
            vector[n]=Integer.valueOf(tcl.readLine());
        }
        
        vector1[0]=vector.length;
        System.out.println("Tamaño del vector es: "+vector1[0]);
        
        for(n=0;n<5;n++)
        {
            vector1[1]+=vector[n];
        }
        
        System.out.println("La suma de los indices:"+vector1[1]);
        
        vector1[2]=1;
        for(n=0;n<5;n++)
        {
            vector1[2]*=vector[n];
        }
        System.out.println("El producto de los indices:"+vector1[2]);
        
        for(n=0;n<5;n++)
        {
            vector1[3]=(vector1[1]/5);
        }
        System.out.println("El promedio de los indices:"+vector1[3]);
        
        System.out.println("Ingrese numero que desea buscar: ");
        nu=Integer.valueOf(tcl.readLine());
        
        for(n=0;n<5;n++)
        {
            
            if(vector[n]==nu)
            {
                cont++;
            }      
        }
        vector1[4]=cont;
        
            System.out.println("La cantidad de "+ nu +" es: "+ vector1[4]);
        
    }
}
