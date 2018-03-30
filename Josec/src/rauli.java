
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
public class rauli
{
    public double n1;
    public double n2;
    public double cont;
    public double pr;
    BufferedReader ob=new BufferedReader(new InputStreamReader(System.in));
    
    public void set() throws IOException
    {
        while(n1>=0)
        {
            System.out.print("Ingrese un numero: ");
            n1=Double.valueOf(ob.readLine());
            if (n1>=0)
            {
            n2+=n1;
            cont++;
            }
            else
            {
            
            }
        }
        pr=n2/cont;
        System.out.println("el promedio es: "+pr);
    }
}
