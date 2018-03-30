/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package programa9;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author Administrador
 */
public class Euros {
     BufferedReader teclado=new BufferedReader(new InputStreamReader(System.in));
    
    public double dolares;
    public double euros;
    
    public void setearvalores() throws IOException
    {
        System.out.println("Ingrese el valor en dolares a convertirse: ");
        dolares=Integer.valueOf(teclado.readLine());        
    }
    
    public void convertireuros()
    {
        euros=dolares*1.308;
        System.out.println("El valor convertido a euros es: "+euros);
    }
}
