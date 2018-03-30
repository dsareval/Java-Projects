/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package programa;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author Lore
 */
public class Proceso 
{
      public double n1;
      public double n2;
      public int fn;
      public double usd;
      public char op;
      public char op2;
      public double eur;
      public double pen;
      public double ecs;
      
      public void procesar() throws IOException
      {
          BufferedReader t1=new BufferedReader(new InputStreamReader(System.in));
          System.out.println("                          MENU                               ");
          System.out.println("a) Calculadora    b) Cálculo edad    c)Convertidor de monedas");
          System.out.println("Eliga una opcion: ");
          String aux;
          aux=t1.readLine();
          op=aux.charAt(0);
          
          switch(op)
          {
              case'a':
                  System.out.println("Ingrese el número 1: ");
                  aux=t1.readLine();
                  n1=Double.valueOf(aux);
                  System.out.println("Ingrese el número 2:");
                  aux=t1.readLine();
                  n2=Double.valueOf(aux);
                  System.out.println("La suma es igual a: "+(Math.rint((n1+n2)*1000)/1000));
                  System.out.println("La resta es igual a: "+(Math.rint((n1-n2)*1000)/1000));
                  System.out.println("La multiplicación es igual a: "+(Math.rint((n1*n2)*1000)/1000));
                  if(n2==0)
                  {
                      System.out.println("No es posible dividir para cero");
                  }
                  else
                  {
                      System.out.println("La división es igual a: "+(Math.rint((n1/n2)*1000)/1000));
                  }               
              break;
                  
              case'b':
                  System.out.println("Ingrese su año de nacimiento: ");
                  aux=t1.readLine();
                  fn=Integer.valueOf(aux);
                  System.out.println("Su edad es: "+(2013-fn)+" años");
              break;
                  
              case'c':
                  System.out.println("Ingrese el dinero a convertir en dólares: ");
                  aux=t1.readLine();
                  usd=Double.valueOf(aux);
                  System.out.println("Indique la moneda a converitr: a)euros    b)soles    c)sucres");
                  aux=t1.readLine();
                  op2=aux.charAt(0);
                  
                  switch(op2)
                  {
                      case'a':
                          eur=usd*0.77873;
                          System.out.println("Esta cantidad es igual a: "+eur+" euros");
                      break;
                          
                      case'b':
                          pen=usd*2.57686;
                          System.out.println("Esta cantidad es igual a: "+pen+" soles");
                      break;
                          
                      case'c':
                          ecs=usd*24094;
                          System.out.println("Esta cantidad es igual a: "+ecs+" sucres");
                      break;
                  }
              break;
                  
              default:
                  System.out.println("La opción no es correcta");
              break;
          }
      }
}
