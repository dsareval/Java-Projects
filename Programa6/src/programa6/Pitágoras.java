/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package programa6;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author Administrador
 */
public class Pitágoras {
    BufferedReader teclado=new BufferedReader(new InputStreamReader(System.in));
    
    public float c1;
    public float c2;
    public float h;
    
    public void setearvalores() throws IOException
    {
        System.out.println("Ingrese el cateto 1: ");
        c1=Integer.valueOf(teclado.readLine());
        System.out.println("Ingrese el cateto 2: ");
        c2=Integer.valueOf(teclado.readLine());
    }
    
    public void hallarhipotenusa()
    {
        h=(float) Math.sqrt((c1*c1)+(c2*c2));
        System.out.println("El valor de la hipotenusa es: "+h);
    }
}
