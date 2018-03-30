/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package bucles;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author Lore
 */
public class Numeros 
{
    BufferedReader ob = new BufferedReader(new InputStreamReader(System.in));
    public int num;
    public int numne;
    
    public void escribir() throws IOException
    {
        System.out.println( " ingrese el numero " );
        num=Integer.valueOf(ob.readLine());
        while (num>=100)
        {
            System.out.println(num);
            System.out.println( " ingrese el numero " );
           num=Integer.valueOf(ob.readLine()); 
        }
    }
}
