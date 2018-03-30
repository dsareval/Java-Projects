
package Programa_ordenar;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author Lore
 */
public class Ordenar 
{
    BufferedReader tcl=new BufferedReader(new InputStreamReader(System.in));
    public int Arreglo[];
    public int temp;
    public int i;
    public int k;
    public char op;
    public String num;
    
    public void Ingresar() throws IOException
    {
        System.out.println("Ingrese un número: ");
        num=tcl.readLine();
        op='F';
        while(op=='F')
        {
            try
            {  
                Arreglo=new int[num.length()];
                for(i=0;i<num.length();i++)
                {                    
                    Arreglo[i]=Integer.valueOf(num.substring(i,i+1));  
                }
                op='V';
            }
            catch (NumberFormatException e)
            {
                System.out.println("Error en el número: ");
                num=tcl.readLine();
                op='F';
            }      
        }
    }
    
    public void Ordenar()
    {
        for(i=0;i<num.length();i++)
        {
            for(k=num.length()-1;k>=i;k--)
            {
                if(Arreglo[k]<Arreglo[i])
                {
                    temp=Arreglo[i];                    
                    Arreglo[i]=Arreglo[k];
                    Arreglo[k]=temp;
                }                
            }
        }
        for(i=0;i<num.length();i++)
        {
            System.out.println(Arreglo[i]);
        }
    }
}
