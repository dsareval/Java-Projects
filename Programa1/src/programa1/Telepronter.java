/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package programa1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author Administrador
 */
public class Telepronter 
{
    BufferedReader teclado=new BufferedReader(new InputStreamReader(System.in));    
    
    public String frase;
    public String empresa;
    public String telepronter;
    
    public void setearvalores() throws IOException
    {
        empresa=" Cooperativa de ahorro y credito Biblian Limitada e hijos";
        System.out.println("Ingrese el mensaje: ");
        frase=teclado.readLine();        
    }
    
    public void mostrarmensaje()
    {
        telepronter=frase+empresa;
        telepronter=telepronter.toUpperCase();
        System.out.println(telepronter);
    }
}
