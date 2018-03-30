/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package areas;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author Lore
 */
public class rauli 
{
    BufferedReader tcl= new BufferedReader(new InputStreamReader(System.in));
    
    public double br;
    public double hr;
    public double ar;
    public double bt;
    public double ht;
    public double at;
    public char opc;
    
    /**
     *
     * @throws IOException
     */
    public void calcular() throws IOException
    {
        while(opc!='c')
        {
        System.out.println("Elija el área de que figura calcular: a)rectángulo  b)triángulo  c)salir");
        String aux;
        aux=tcl.readLine();
        opc=aux.charAt(0);
        
        switch(opc)
        {
            case 'a':
                System.out.print("Ingrese la base del rectángulo: ");
                br=Double.valueOf(tcl.readLine());
                System.out.print("Ingrese la altura del rectángulo: ");
                hr=Double.valueOf(tcl.readLine());
                ar=br*hr;
                System.out.println("El área del rectángulo es: "+ar);
                
                break;
                
            case 'b':
                System.out.print("Ingrese la base del triángulo: ");
                bt=Double.valueOf(tcl.readLine());
                System.out.print("Ingrese la altura del triángulo: ");
                ht=Double.valueOf(tcl.readLine());
                at=bt*ht/2;
                System.out.println("El área del triángulo es: "+at);
                break;
                
            case 'c':
                System.out.println("Ha salido del programa");
                break;
                
            default:
                System.out.println("Esa opción no existe");
                break;
           }      
        }
    }
}