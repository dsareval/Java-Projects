package menu;


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
public class Operaciones 
{
    public double num;
    public double num2;
    public char opc;
    public double sumar;
    public double restar;
    public double multiplicar;
    public double dividir;
    
    public void contar () throws IOException
    {
        BufferedReader tcl= new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Ingrese el primer número: ");
        num= Double.valueOf(tcl.readLine());
        System.out.println("Ingrese el segundo número: ");
        num2= Double.valueOf(tcl.readLine());
        System.out.println("                     Menu                         ");
        System.out.println("a) Sumar    b) Restar   c) Multiplicar  D)Dividir");
        System.out.print("Elija una opción: ");
        
        String aux;
        aux= tcl.readLine();
        opc=aux.charAt(0);
        
        switch(opc)
        {
            case 'a':
            sumar= num + num2;
            System.out.println(num + " + " + num2 + " = " + sumar );
                break;
                
            case 'b':
                restar= num - num2;
                System.out.println(num + " - " + num2 + " = " + restar);
                break;
                
            case 'c':
                multiplicar= num * num2;
                System.out.println(num + " * " + num2 + " = " + multiplicar);
                break;
                
            case 'd':
                dividir= num / num2;
                System.out.println(num + " / " + num2 + " = " + dividir);
                break;
                
            default:
                System.out.println("              Error           ");
                break;
         }
        
                
        }
        
        
        
       
    }

