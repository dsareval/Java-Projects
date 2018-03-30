/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package tabla2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author Lore
 */
public class tabla 
{
    public int num;
    public int cont;
    public int resp;
    
    BufferedReader tcl=new BufferedReader(new InputStreamReader(System.in));
    public void operar() throws IOException
    {
        System.out.print("Ingrese el número: ");
        num=Integer.valueOf(tcl.readLine());
        
        while (cont<=10)
        {
            resp=num*cont;
            System.out.println(num+" * "+cont+" = "+resp);
            cont++;
        }
        
    }
}
