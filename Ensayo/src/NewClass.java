
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
public class NewClass 
{
    BufferedReader ob = new BufferedReader(new InputStreamReader(System.in));
    
    public int vec[]=new int [10];
    public int t;
    
    public void operar() throws IOException
    {
        for(int i=0;i<10;i++)
        {
            System.out.print("Ingrese 10 números: ");
            try
            {
                vec[i]=Integer.valueOf(ob.readLine());
            }
            catch(NumberFormatException e)
            {
                System.out.print("DATO ERRONEO");
                i--;
            }
         }
        
        for(int i2=0;i2<10;i2++)
        {
            for(int i3=9;i3>i2;i3--)
            {
                if(vec[i2]<vec[i3])
                {
                    t=vec[i2];
                    vec[i2]=vec[i3];
                    vec[i3]=t;
                }
            }
        }
        
        System.out.print("El orden es: ");
        for(int i4=0;i4<10;i4++)
        {
            System.out.print(vec[i4]+", ");
        }
    }     
}
