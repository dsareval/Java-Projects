/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package programa2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author Administrador
 */
public class Calculadora {
    BufferedReader teclado= new BufferedReader(new InputStreamReader(System.in));
    
    public float n1;
    public float n2;
    
    public void setearvalores() throws IOException
    {
        System.out.println("Ingrese el primer número:");
        n1=Integer.valueOf(teclado.readLine());
        System.out.println("Ingrese el segundo número");
        n2=Integer.valueOf(teclado.readLine());
    }
    
    public void sumar()
    {
        System.out.println("SUMA: "+(n1+n2));
    }
    
    public void restar()
    {
        System.out.println("RESTA: "+(n1-n2));
    }
    
    public void multiplicar()
    {
        System.out.println("MULTIPLICACIÓN: "+(n1*n2));
    }
    
    public void dividir()
    {
        
        System.out.println("DIVISIÓN: "+(n1/n2));
    }
}
