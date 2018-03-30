/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author Administrador
 */
public class Ejercicio3 {
    
    BufferedReader tcl = new BufferedReader(new InputStreamReader(System.in));
    
    public float base_rec;
    public float alt_rec;
    public float base_tri;
    public float alt_tri;
    public float rad;
    public float Dmay;
    public float dmen;    
    
    public void asignarvalores() throws IOException
    {
        System.out.println("Ingrese la base del rectángulo");
        base_rec=Integer.valueOf(tcl.readLine());
        System.out.println("Ingrese la altura del rectángulo");
        alt_rec=Integer.valueOf(tcl.readLine());
        System.out.println("Ingrese la base del triángulo");
        base_tri=Integer.valueOf(tcl.readLine());
        System.out.println("Ingrese la altura del triángulo");
        alt_tri=Integer.valueOf(tcl.readLine());
        System.out.println("Ingrese el radio del círculo");
        rad=Integer.valueOf(tcl.readLine());
        System.out.println("Ingrese la diagonal mayor del rombo");
        Dmay=Integer.valueOf(tcl.readLine());
        System.out.println("Ingrese la diagonal menor del rombo");
        dmen=Integer.valueOf(tcl.readLine());
    }
    
    public void calcularareas()
    {
        System.out.println("El área del rectángulo es "+base_rec*alt_rec);
        System.out.println("El área del triángulo es "+(base_tri*alt_tri)/2);
        System.out.println("El área del círculo es "+rad*rad*3.1416);
        System.out.println("El área del rombo es "+(Dmay*dmen)/2);
    }
}
