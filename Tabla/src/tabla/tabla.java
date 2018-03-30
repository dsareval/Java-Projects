/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package tabla;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author Lore
 */
public class tabla 
{
    public int nt;
    public int vf;
    public int resp;
    public int cont;
    
    public void asignar() throws IOException
    {
        BufferedReader tcl= new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Ingrese el número de la tabla: ");
        nt=Integer.valueOf(tcl.readLine());
        System.out.print("Ingrese el valor final de la tabla: ");
        vf=Integer.valueOf(tcl.readLine());        
    }
    
    public void calcular()
    {
        while (resp<=vf-nt)
        {
            resp=nt*cont;
            System.out.println(nt+" * "+cont+" = "+resp);
            cont++;
        }
    }
}
