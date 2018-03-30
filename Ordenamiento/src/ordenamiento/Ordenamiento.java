
package ordenamiento;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author Lore
 */
public class Ordenamiento 
{
    BufferedReader tcl=new BufferedReader(new InputStreamReader(System.in));
    public int vector[];
    public String num;
    public int temp;
    public int cont;
    public int cont2;
    public int tamaño;
    public char opc;
    
    public void Ingresar() throws IOException
    {
        System.out.println("Ingrese el número a ordenarse: ");
        num=tcl.readLine();
        do
        {
            try
            {  
                tamaño=num.length();
                vector=new int[tamaño];
                for(cont=0;cont<tamaño;cont++)
                {                    
                    vector[cont]=Integer.valueOf(num.substring(cont,cont+1));  
                }
                opc='V';
            }
            catch (NumberFormatException e)
            {
                System.out.println("El dato ingresado no es numérico, intente nuevamente: ");
                num=tcl.readLine();
                opc='F';
            }      
        }while(opc=='F');
    }
    
    public void BubbleSort()
    {
        for(cont=0;cont<tamaño;cont++)
        {
            for(cont2=tamaño-1;cont2>=cont;cont2--)
            {
                if(vector[cont2]<vector[cont])
                {
                    temp=vector[cont];                    
                    vector[cont]=vector[cont2];
                    vector[cont2]=temp;
                }                
            }
        }
        System.out.println("----------------------------------------------");
        for(cont=0;cont<tamaño;cont++)
        {
            System.out.print(vector[cont]+", ");
        }
    }
}
