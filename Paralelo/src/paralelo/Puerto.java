/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package paralelo;

/**
 *
 * @author Lore
 */
public class Puerto 
{
    public native void Out32(short PortAddress, short data);
    // lee una palabra desde la direccion del puerto especificada
    public native short Inp32(short PortAddress);
    // carga el package 'jnpout32.dll'
    static { System.loadLibrary("jnpout32pkg");}

}
