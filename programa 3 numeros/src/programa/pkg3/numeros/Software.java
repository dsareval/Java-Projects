/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package programa.pkg3.numeros;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author Administrador
 */
public class Software 
{
    public int num1;
    public int num2;
    public int num3;
    public int mayor;
    public int menor;
    public int medio;
    public String opc;
    
    BufferedReader tcl=new BufferedReader(new InputStreamReader(System.in));
    
    public void asignar() throws IOException
    {
        System.out.print("Ingrese el primer número: ");
        num1=Integer.valueOf(tcl.readLine());
        System.out.print("Ingrese el segundo número: ");
        num2=Integer.valueOf(tcl.readLine());
        System.out.print("Ingrese el tercer número: ");
        num3=Integer.valueOf(tcl.readLine());        
        System.out.println("                                        M   E   N   U       ");
        System.out.println("a)Número mayor   b)Número menor   c)Números de manera ascendente  d)Números de manera descendente   e)Número intermedio");
        System.out.print("Eliga una opción: ");
        opc=tcl.readLine();        
    }
    
    public void comparar()
    {
        if(num1>num2)
        {
            if(num1>num3)
            {               
                mayor=num1;
                if(num2>num3)
                {                        
                    medio=num2;
                    menor=num3;
                }
                else
                {
                    medio=num3;
                    menor=num2;
                }                
            }
            else
            {
                mayor=num3;
                medio=num1;
                menor=num2;                            
            }
        }
        else
        {
            if(num2>num3)
            {
                mayor=num2;
                if(num1>num3)
                {
                    medio=num1;
                    menor=num3;
                }
                else
                {
                    medio=num3;
                    menor=num1;
                }
            }
            else
            {
                mayor=num3;
                medio=num2;
                menor=num1;
            }
        }
    }
    
    public void mostrar()
    {
        if(opc.equals("a"))
        {
            System.out.println("El número mayor es: "+mayor);
        }
        else
        {
            if(opc.equals("b"))
            {
                System.out.println("El número menor es: "+menor);
            }
            else
            {
                if(opc.equals("c"))
                {
                   System.out.println("Orden ascendente: "+menor+", "+medio+", "+mayor); 
                }
                else
                {
                    if(opc.equals("d"))
                    {
                        System.out.println("Orden descendente: "+mayor+", "+medio+", "+menor);
                    }
                    else
                    {
                        if(opc.equals("e"))
                        {
                            System.out.println("El número intermedio es: "+medio);
                        }
                        else
                        {
                            System.out.println("Opción incorrecta");
                        }
                    }
                }
            }
        }
    }
}
