/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package aplicación;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author LABORATORIO
 */
public class Programa 
{
    public char opc;
    public double num1;
    public double num2;
    public double suma;
    public double resta;
    public double mult;
    public double div;
    public String respdiv;
    public int fec;
    public int edad;
    public double din;
    public char mon;
    public double conv;
    
    BufferedReader tcl=new BufferedReader(new InputStreamReader(System.in));
    
    public void asignar() throws IOException    {
        
        System.out.println("                M    E    N    U   ");
        System.out.println("a) Calculadora      b) Edad      c)Convertidor");
        String aux;
        aux=tcl.readLine();
        opc=aux.charAt(0);        
    }
    
    public void procesar() throws IOException
    {
        switch(opc)
        {
            case 'a':
                System.out.print("Ingrese el número 1: ");
                num1=Integer.valueOf(tcl.readLine());
                System.out.print("Ingrese el número 2: ");
                num2=Integer.valueOf(tcl.readLine());
                suma=Math.rint((num1+num2)*1000)/1000;
                resta=Math.rint((num1-num2)*1000)/1000;
                mult=Math.rint((num1*num2)*1000)/1000;
                if (num2==0)
                {
                    respdiv="No es posible dividir para cero";
                }
                else
                {
                    div=Math.rint((num1/num2)*1000)/1000;
                    respdiv=""+div;                     
                }         
                System.out.println(num1+" + "+num2+" = "+suma);
                System.out.println(num1+" - "+num2+" = "+resta);
                System.out.println(num1+" * "+num2+" = "+mult);
                System.out.println(num1+" / "+num2+" = "+respdiv);
                break;
                
            case 'b':
                System.out.print("Ingrese la fecha de nacimiento: ");
                fec=Integer.valueOf(tcl.readLine());
                edad=2013-fec;
                System.out.println("Su edad es de "+edad+" años");
                if(edad>18)
                {
                    System.out.println("Usted es mayor de edad");
                }
                else
                {
                    System.out.println("Usted es menor de edad");
                }
                break;
                
            case 'c':
                System.out.print("Ingrese la cantidad en dólares: ");
                din=Double.valueOf(tcl.readLine());
                System.out.println("Indique la moneda a la que quiere convertir: ");
                System.out.println("a)Euros    b)Yenes    c)Pesos cubanos");
                String aux;
                aux=tcl.readLine();
                mon=aux.charAt(0);
                switch(mon)
                {
                    case 'a':
                        conv=Math.rint((din*0.7707)*100)/100;
                        System.out.println(din+" dólares es igual a "+ conv+" euros");
                        break;
                    
                    case 'b':
                        conv=Math.rint((din*101.792)*100)/100;
                        System.out.println(din+" dólares es igual a "+ conv+" yenes");
                        break;
                    
                    case 'c':
                        conv=Math.rint((din*22.2222)*100)/100;
                        System.out.println(din+" dólares es igual a "+ conv+" pesos cubanos");
                        break;
                        
                    default:
                        System.out.println("La opción no existe");
                        break;
                }
                break;
                
            default: 
                System.out.println("La opción no existe");      
                break;
        }
    }
}
