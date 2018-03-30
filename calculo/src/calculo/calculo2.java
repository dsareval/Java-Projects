/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package calculo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author Lore
 */
public class calculo2
{
    BufferedReader ob = new BufferedReader(new InputStreamReader(System.in));
    
    public double num1;
    public double num2;
    public double rs;
    public double rr;
    public double rm;
    public double rd;
    public double rt;
    
    public void calcular() throws IOException
            {
                System.out.print("Ingrese el primer numero: ");
                num1:Double.valueOf(ob.readLine());
                System.out.print("Ingrese el segundo numero: ");
                num2:Double.valueOf(ob.readLine());
                
                rs:Double.valueOf(ob.readLine());
                System.out.println("La respuesta de la suma es: "+rs);
                rs=num1+num2;
                rr:Double.valueOf(ob.readLine());
                System.out.println("La respuesta de la suma es: "+rr);
                rr=num1-num2;
                rm:Double.valueOf(ob.readLine());
                System.out.println("La respuesta de la suma es: "+rm);
                rm=num1*num2;
                rd:Double.valueOf(ob.readLine());
                System.out.println("La respuesta de la suma es: "+rd);
                rd=num1/num2;
                
            }
}
