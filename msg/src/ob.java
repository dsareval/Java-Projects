
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
public class ob 
{
    String m;
    String s;
    String g;
    
    BufferedReader tcl=new BufferedReader (new InputStreamReader(System.in));
    public void set() throws IOException
    {
        System.out.print("Ingrese el nombre de la empresa: ");
        m=tcl.readLine();
        System.out.print("Ingrese el mensaje: ");
        s=tcl.readLine();
        
        g= m + s;
        System.out.println(g.toUpperCase());
    }
}