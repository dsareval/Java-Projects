/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package deber2.josesitu;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author Lore
 */
public class lala 
{
    public String palabra1;
    public String p1;
    public int cont1;
    public int resultado;
    public int ingr;
    public void contar() throws IOException
    {
        BufferedReader tcl= new BufferedReader(new InputStreamReader(System.in));
        
        while(ingr<5)
        {
            System.out.println("INGRESE LA PALABRA: ");
            palabra1= tcl.readLine();
            cont1=palabra1.length();
            p1= palabra1.substring(cont1-1, cont1);
            if(p1.equals("o"))
            {
                resultado++;
            }
            else
            {
            }
            ingr++;
        }
        System.out.println("EL NUMERO DE INGRESOS ES: "+ resultado);
    }        
    
}
