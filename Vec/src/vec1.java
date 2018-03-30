
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
public class vec1 
{
    public int num[]=new int[20];
    public int n;
    public int cont;
    
    BufferedReader abc = new BufferedReader(new InputStreamReader(System.in));
    
    public void operar() throws IOException
    {
        System.out.println("Ingrese 20 numeros: ");
        
       for(n=0;n<=19;n++)
        {
             num[n]=Integer.valueOf(abc.readLine());        
        }
       
       for(n=0;n<19;n++)
        {
              System.out.print(num[n]+",");
              
        }
              System.out.println(num[n]);
       
       for(n=0;n<=19;n++)
        {
              System.out.println(num[n]);
        }
    
}
}
