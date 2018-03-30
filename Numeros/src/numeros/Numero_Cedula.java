/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package numeros;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author Lore
 */
public class Numero_Cedula 
{
    public int cont;
    public int tamano;
    public String letra;
    public int letnum;
    public String ci;
    public int cont2;
    public int num;
    
    public void contar() throws IOException
    {   
        BufferedReader tcl=new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Ingrese la cedula: ");
        ci=tcl.readLine();
        tamano=ci.length();
        cont=0;
        System.out.print("Ingrese el número a contar: ");
        num=Integer.valueOf(tcl.readLine());
        while(cont<=tamano-1)
        {
            letra= ci.substring(cont, cont+1);
            letnum=Integer.valueOf(letra);            
            if(letnum == num)
            {
                cont2=cont2+1;
            }
            else
            {
               
            }
            cont=cont+1;
        }
        System.out.println(num+"  =  " + cont2);
    }
}
