/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package entrada;

import jnpout32.*;

public class Entrada 
{
    public pPort puerto;
    
    public Entrada()
    {
        while (true)
        {
            System.out.println(puerto.input((short)0x379));
        }
    }
}
