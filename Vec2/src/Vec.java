
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
    public int num[]=new int [5];
    public int num1[]=new int [5];
    public int num2[]=new int[5];
    public int n;
    public int con;
    
    public void operar() throws IOException
    {
        BufferedReader xyz=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Ingrese un numero: ");
        
        for(n=0;n<5;n++)
        {
            num[n]=Integer.valueOf(xyz.readLine());
        }
        
        System.out.println("Ingrese un numero: ");
        
        for(n=0;n<5;n++)
        {
            num1[n]=Integer.valueOf(xyz.readLine());
        }
        
        for(n=0;n<5;n++)         
        {
            num2[n]=num1[n]+num[n];
            System.out.println("La suma de los indices "+n+" es: "+num2[n]);    
            num2[n]=0;
        }
        
        for(n=0;n<5;n++)         
        {
            num2[n]=num1[n]-num[n];
            System.out.println("La resta de los indices "+n+" es: "+num2[n]);   
            num2[n]=0;                  
        }
        
        for(n=0;n<5;n++)         
        {
            for(con=0;con<5;con++)
            
            {
                 num2[n]+=(num[n]*num1[con]);
                 
            }
            System.out.println("La multiplicacion de los indices "+n+" es: "+num2[n]);          
            
        }
        
    }
}
