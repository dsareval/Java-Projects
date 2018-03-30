/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package programa_c;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author Lore
 */
public class Programa_c 
{
    public int num1;
    public int num2;
    
    public void asignar() throws IOException
    {
        BufferedReader tcl= new BufferedReader(new InputStreamReader(System.in));
        
        System.out.print("Ingrese el primer número: ");
        num1=Integer.valueOf(tcl.readLine());
        System.out.print("Ingrese el segundo número: ");
        num2=Integer.valueOf(tcl.readLine());
    }
    
    public void listar()
    {
        if(num1<num2)
        {
            while(num1<=num2)
            {
                System.out.print(num1+", ");
                num1++;
            }
        }
        else
        {
            while(num2<=num1)
            {
                System.out.print(num2+", ");
                num2++;
            }
        }
    }
}
