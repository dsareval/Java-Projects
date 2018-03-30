/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package menu2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author Lore
 */
public class Opciones 
{
    public int num;
    public int num2;
    public char opc;
    public int edad;
    public int edad2;
    
    public void contar () throws IOException
    {
        BufferedReader tcl = new BufferedReader (new InputStreamReader (System.in));
        System.out.println("Ingrese la fecha de nacimiento: ");
        num= Integer.valueOf(tcl.readLine());
        System.out.println("Ingrese la segunda fecha de nacimiento");
        num2=Integer.valueOf(tcl.readLine());
        System.out.println("        MENU        ");
        System.out.println ("a(calcular edades    b)comparar edades " );
        
        String aux;
        aux=tcl.readLine();
        opc=aux.charAt(0);
        edad=2013-num;
        edad2=2013-num2;
        
        switch (opc)
        {
            case 'a':                
                System.out.println("Las edades son: ");
                System.out.println("La edad de la primera persona es:  " + edad);
                System.out.println("La edad de la segunda persona es:  "+ edad2);
                break;
               
                
            case 'b':
                if (edad>edad2)
                {
                    System.out.println("La edad de la primera persona es mayor a la de la segunda");
                }
                else
                {
                    System.out.println("La edad de la primea persona es menor a la de la segunda");
                }
                break;
                
            default: 
                System.out.println("        ERROR       ");
                break;
                
        }
        
        
        
    }
    
            
    
}
