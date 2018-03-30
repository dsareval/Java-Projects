/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package nombres;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author Lore
 */
public class Vertical 
{
    public String nomb;
    public int cont;
    public int cant;
    
    public void escribir () throws IOException
    {
        BufferedReader tcl=new BufferedReader (new InputStreamReader(System.in));
        System.out.println("Ingrese el texo");
        nomb= tcl.readLine ();
        cant=nomb.length();
        while (cont<cant)
        {
            System.out.println(nomb.substring(cont,cont+1));
            cont=cont+1;
            
        }
        
        
    }
}
