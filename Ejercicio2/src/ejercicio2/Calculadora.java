/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author Lore
 */
public class Calculadora 
{
    BufferedReader ob=new BufferedReader(new InputStreamReader(System.in));
    
    public double n1;
    public double n2;
    public double rs;
    public double rr;
    public double rm;
    public double rd;    
    
    public void calcular() throws IOException
    {
        System.out.print("Ingrese el primer número: ");
        n1=Double.valueOf(ob.readLine());
        System.out.print("Ingrese el segundo número: ");
        n2=Double.valueOf(ob.readLine());
        rs=n1+n2;
        rr=n1-n2;
        rm=n1*n2;
        rd=n1/n2;
        
        System.out.println("La respuesta de la suma es: "+rs);
        System.out.println("La respuesta de la resta es: "+rr);
        System.out.println("La respuesta de la multiplicación es: "+rm);
        System.out.println("La respuesta de la división es: "+rd);
    }
    
    
}
