/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package try_catch;

import java.util.Scanner;

/**
 *
 * @author Lore
 */
public class MainTry_catch {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        Scanner scs= new Scanner(System.in);
        int num;
        boolean ingreso=false;
        
        while(ingreso==false)
        {
            System.out.println("Ingrese un número");

            try
            {                
                num=Integer.valueOf(scs.next());
                System.out.println("Usted ha ingresado el número: "+num);
                ingreso=true;
            }
            catch(Exception e)
            {
                System.out.println("El formato de ingreso no es el indicado");
            }
        }
        
        
    }
    
}
