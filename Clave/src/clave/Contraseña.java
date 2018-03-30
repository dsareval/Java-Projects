/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package clave;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author Lore
 */
public class Contraseña 
{
    public String clave;
    public int intentos;
    
    BufferedReader tcl=new BufferedReader(new InputStreamReader(System.in));
    
    public void ingresar() throws IOException
    {
        intentos=1;
        while(intentos<=4)
        {
        System.out.print("Ingrese la clave:");
        clave=tcl.readLine();
        
        if(clave.equals("tipimon"))
        {
            intentos=6;
        }
        else
        {
            System.out.println("clave erronea");
            System.out.println("número de intentos: "+intentos);
            intentos++;
        }        
        }
        if(intentos==6)
        {
            System.out.println("acceso permitido");
        }
        else
        {
            System.out.println("Usted ha excedido el número de intentos");
        }
    }
    
}
