/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package lala;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author Lore
 */
public class Hola 
{
    public String nombre;
    public int cont;
    public String opc;
    char opc1;
     
    
    public void contar() throws IOException
    {
    BufferedReader tcl= new BufferedReader(new InputStreamReader(System.in));
    
    System.out.println("ESCOJA UNA OPCION: a) INGRESAR UN NOMBRE   b) FINALIZAR ");
    opc= tcl.readLine();
    opc1= opc.charAt(0);
    while (opc1!='b'  )
    {
        switch (opc1)
        {
                case 'a':
                System.out.println("INGRESAR UN NOMBRE: ");
                nombre= tcl.readLine();
                cont++;
                
                 System.out.println("ESCOJA UNA OPCION: a) INGRESAR UN NOMBRE   b) FINALIZAR ");
                    opc= tcl.readLine();
                    opc1= opc.charAt(0);    
                    break;
                        
                default: 
                    System.out.println("ERROR");
                     System.out.println("ESCOJA UNA OPCION: a) INGRESAR UN NOMBRE   b) FINALIZAR ");
                    opc= tcl.readLine();
                    opc1= opc.charAt(0);    
        }
    }
        System.out.println("El numero de ingresos es:  "+ cont);
    }
    
    
}
