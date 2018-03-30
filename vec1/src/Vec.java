
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
public class Vec 
{
    public int num[]=new int[10];
    public int c;
    
    public void operar() throws IOException
    {
        BufferedReader abc = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Ingrese numeros: ");
        
        for(c=0;c<10;c++)
        {
            num[c]=Integer.valueOf(abc.readLine());
        }
        
        System.out.println("El tamaño del vector= "+num.length);
        
    }
}
