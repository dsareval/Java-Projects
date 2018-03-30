/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package menu1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author Lore
 */
public class Escoger 
{
    public double base;
    public double altura;
    public double resultado;
    public String opc;
    char a;
    public void elegir () throws IOException 
    {
        BufferedReader tcl= new BufferedReader(new InputStreamReader(System.in));
        
        System.out.println("Escoja una opcion: ");
        System.out.println("a) Calcular area rectangulo b) Calcular area triangulo c)salir");
        opc= tcl.readLine(); //a
        a=opc.charAt(0);  //a
        while(a!='c')
        {    
            switch (a)
            {
                case 'a':
                    System.out.println("Ingrese la base");
                    base= Integer.valueOf(tcl.readLine());
                    System.out.println("Ingrese la altura");
                    altura= Integer.valueOf(tcl.readLine());
                    resultado= base*altura;
                    System.out.println("El area del rectangulo es: " + resultado);
                    System.out.println("Escoja una opcion: ");
                    System.out.println("a) Calcular area rectangulo b) Calcular area triangulo c)salir");
                    opc= tcl.readLine();
                    a=opc.charAt(0);
                    break;
                    
                case 'b':
                    System.out.println("Ingrese la base");
                    base= Integer.valueOf(tcl.readLine());
                    System.out.println("Ingrese la altura");
                    altura= Integer.valueOf(tcl.readLine());
                    resultado= (base*altura)/2;
                    System.out.print("El area del triangulo es; " + resultado);
                    System.out.println("Escoja una opcion: ");
                    System.out.println("a) Calcular area rectangulo b) Calcular area triangulo c)salir");
                    opc= tcl.readLine();
                    a=opc.charAt(0);
                    break;                  
                    
                default:
                    System.out.println("Error");
                    System.out.println("Escoja una opcion: ");
                    System.out.println("a) Calcular area rectangulo b) Calcular area triangulo c)salir");
                    opc= tcl.readLine();
                    a=opc.charAt(0);
                    break;
           }
       }
       System.out.println("Ha salido del programa"); 
    }
}