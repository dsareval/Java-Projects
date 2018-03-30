package tiempo;


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
public class segundos 
{
    BufferedReader ob = new BufferedReader(new InputStreamReader(System.in));
    public int tiem1;
    public int tiem2;
    public int tiem3;
    public int tiem4;
    public int tiemt;
    public int tiems;
    public int tiemm;
    
            
    public void Mostrar () throws IOException
    {
     
        System.out.println(" ingrese el primer tiempo:  ");
        tiem1=Integer.valueOf(ob.readLine());
        System.out.println(" ingrese el segundo tiempo:  ");
        tiem2=Integer.valueOf(ob.readLine());
        System.out.println(" ingrese el tercero tiempo:  ");
        tiem3=Integer.valueOf(ob.readLine());
        System.out.println(" ingrese el cuarto tiempo:  ");
        tiem4=Integer.valueOf(ob.readLine());
        tiems = ( tiem1+tiem2+tiem3+tiem4)%60;
        tiemm = ( tiem1+tiem2+tiem3+tiem4)/60;
        System.out.println(" tardo " + tiemm+" minutos y "+tiems+" segundos");
        
        
    }
            
    
    
}
