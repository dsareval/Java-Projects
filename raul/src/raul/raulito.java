/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package raul;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author Lore
 */
public class raulito
{
    public String tex;
    public String car;
    public int num_car;
    public int num_pal;
    public int num_let;
    
    public void mostrar() throws IOException
    {
        BufferedReader ob = new BufferedReader(new InputStreamReader(System.in));      
        System.out.println( " ingrese el texto " );
        tex=ob.readLine();
        num_let=tex.length();
        num_pal=1;
        while (num_car<num_let)
        {
            car=tex.substring(num_car,num_car+1);
            if (car.equals(" "))
            {
                num_car++;
                num_pal++;
            }
            
            else
            {
                num_car++;
            }
        }
        System.out.println("El número de palabras es "+num_pal);
        System.out.println("El numero de caracteres es "+num_car);
    }  
}
