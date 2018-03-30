/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package paralelo;

import jnpout32.*;

public class Salida 
{
    private ioPort puertoParalelo = new ioPort();
    public Salida() 
    {
        puertoParalelo.Out32((short)0x378,(short)255);
    }   

    
}
