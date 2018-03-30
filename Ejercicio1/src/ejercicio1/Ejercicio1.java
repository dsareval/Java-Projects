/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Locale;



public class Ejercicio1 
{
    BufferedReader tcl1=new BufferedReader(new InputStreamReader(System.in));    
    
    public String mensaje;
    public String empresa;
    public String frase_final;
    
    public void asignarvalores() throws IOException
    {
        empresa=" Robotel";
        System.out.println("Ingrese el mensaje a mostrarse");
        mensaje=tcl1.readLine();        
    }
    
    public void mostrarmensaje()
    {
        frase_final=mensaje+empresa;
        frase_final=frase_final.toUpperCase();
        System.out.println(frase_final);
    }
}
