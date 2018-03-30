/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package guitar_subway;

/* Definitions in the build of jnpout32.dll are:            */
    /*   short _stdcall Inp32(short PortAddress);               */
    /*   void _stdcall Out32(short PortAddress, short data);    */
public class Paralelo 
{
    
    // declaracion metodos nativos de 'jnpout32.dll'
    // escribe una palabra a la direccion del puerto especificada
    public native void Out32(short PortAddress, short data);
    // lee una palabra desde la direccion del puerto especificada
    public native short Inp32(short PortAddress);
    // carga el package 'jnpout32.dll'
    static { System.loadLibrary("jnpout32pkg");}

}
