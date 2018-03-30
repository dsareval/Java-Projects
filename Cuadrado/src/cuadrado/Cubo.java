/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package cuadrado;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author Lore
 */
public class Cubo 
{
    public int num;
    public int cont;
    BufferedReader tcl=new BufferedReader(new InputStreamReader(System.in));
    public void calcular() throws IOException
    {
        System.out.print("Ingrese el número: ");
        num=Integer.valueOf(tcl.readLine());
        cont=num;
        while(num<=cont+5)
        {
            System.out.println("número: "+num+" cuadrado: "+num*num+" cubo: "+num*num*num);
            num++;
        }
    }
}
