/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package palabras;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author Lore
 */
public class J 
{
    
    
    public int cont;
    public int num;
    public char letra;
    public String cadena;
    public int cont2;
    
    public void contar() throws IOException
    {   
        BufferedReader tcl=new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Ingrese el texto: ");
        cadena=tcl.readLine();
        num=cadena.length();
        cont=0;
        while(cont<=num-1)
        {
            letra=cadena.charAt(cont);
            if(letra=='j')
            {
                cont2=cont2+1;
            }
            else
            {}
            cont=cont+1;
        }
        System.out.println("j = " + cont2);
    }
}
