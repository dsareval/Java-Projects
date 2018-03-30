/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package programa_d;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author Lore
 */
public class Programa_d 
{
    BufferedReader tcl=new BufferedReader(new InputStreamReader(System.in));
    
    public int opc;
    public int fn;
    
    public void asignar() throws IOException
    {
        System.out.println("    M   E   N   U   ");
        System.out.println("1. Calcular Edad    2. Salir");
        opc=Integer.valueOf(tcl.readLine());        
    }
    
    public void calcular() throws IOException
    {
        while(opc==1)
        {
            System.out.print("Ingrese su fecha de nacimiento: ");
            fn=Integer.valueOf(tcl.readLine());
            System.out.println("Su edad es de "+(2013-fn)+" años");
            if ((2013-fn)>=18)
            {
                System.out.println("Usted es mayor de edad");
            }
            else
            {
                System.out.println("Usted es menor de edad");
            }
            System.out.println("----------------------");
            System.out.println("");
            
            System.out.println("    M   E   N   U   ");
            System.out.println("1. Calcular Edad    2. Salir");
            opc=Integer.valueOf(tcl.readLine());  
        }
        
        if (opc==2)
        {
            System.out.println("Programa Finalizado");
        }
        else
        {
            System.out.println("opción incorrecta");
        }
    }
    
}
