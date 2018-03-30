/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package calculadora;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author Lore
 */
public class operaciones
{
    BufferedReader ob = new BufferedReader(new InputStreamReader(System.in));
    public double num1;
    public double num2;
    public double suma;
    public double resta;
    public double multi;
    public double divi;
    
    public void Mostrar() throws IOException
    {
      System.out.println(" ingrese el primer numero ");
      num1= Double.valueOf(ob.readLine());
      System.out.println(" ingrese el segundo numero ");
      num2= Double.valueOf(ob.readLine());
      
      suma=( num1 + num2 );
      System.out.println(" el resultado de la suma es  " + suma );
      resta=( num1 - num2 );
      System.out.println(" el resultado de la resta es  " + resta );
      multi=( num1 * num2 );
      System.out.println(" el resultado de la multicion es  " + multi );
      divi=( num1/num2 );
      System.out.println(" el resultado de la divicion es  " + divi );
    }
    
}
