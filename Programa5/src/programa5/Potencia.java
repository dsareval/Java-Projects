/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package programa5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author Administrador
 */
public class Potencia {
    BufferedReader teclado=new BufferedReader(new InputStreamReader(System.in));
    
    public int num;
    public int exponente;
    public int resp;
    
    public void setearvalores() throws IOException
    {
        System.out.println("Ingrese el número: ");
        num=Integer.valueOf(teclado.readLine());
        System.out.println("Ingrese el exponente: ");
        exponente=Integer.valueOf(teclado.readLine());
    }
    
    public void calcularrespuesta()
    {
        resp=(int) Math.pow(num,exponente);
        System.out.println("la respuesta es: "+ resp);
    }
}
