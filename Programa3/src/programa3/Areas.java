/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package programa3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author Administrador
 */
public class Areas {
     BufferedReader tcl = new BufferedReader(new InputStreamReader(System.in));
    
    public float brectangulo;
    public float arectangulo;
    public float btriangulo;
    public float atriagnulo;
    public float radio;
    public float dmayor;
    public float dmenor;    
    
    public void setearvalores() throws IOException
    {
        System.out.println("Ingrese la medida de la base del rectángulo");
        brectangulo=Integer.valueOf(tcl.readLine());
        System.out.println("Ingrese la medida de la altura del rectángulo");
        arectangulo=Integer.valueOf(tcl.readLine());
        System.out.println("Ingrese la medida de la base del triángulo");
        btriangulo=Integer.valueOf(tcl.readLine());
        System.out.println("Ingrese la medida de la altura del triángulo");
        atriagnulo=Integer.valueOf(tcl.readLine());
        System.out.println("Ingrese la medida delradio del círculo");
        radio=Integer.valueOf(tcl.readLine());
        System.out.println("Ingrese la medida de la diagonal mayor del rombo");
        dmayor=Integer.valueOf(tcl.readLine());
        System.out.println("Ingrese la medida de la diagonal menor del rombo");
        dmenor=Integer.valueOf(tcl.readLine());
    }
    
    public void calcularvalores()
    {
        System.out.println("El área del rectángulo mide "+brectangulo*arectangulo);
        System.out.println("El área del triángulo mide "+(btriangulo*atriagnulo)/2);
        System.out.println("El área del círculo mide "+radio*radio*3.1416);
        System.out.println("El área del rombo mide "+(dmayor*dmenor)/2);
    }
}
