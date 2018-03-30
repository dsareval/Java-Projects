/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package validacioncedula;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author Lore
 */
public class ValidacionCedula 
{
    BufferedReader tcl=new BufferedReader(new InputStreamReader(System.in));
    public int vector[]=new int[10];    
    public char opc;
    public String cedula;
    public int cont;
    public String digs;
    public int digsi;
    public double suma1;
    public double suma2;
    public char opc2;
    
    public void Validar() throws IOException
    {
        opc='F';
        System.out.println("Ingrese la cédula");
        cedula=tcl.readLine();
        while (opc=='F')
        {
            opc='V';
            if(opc2=='V')
            {
                System.out.print("Cédula incorrecta. Ingrese nuevamente: ");
                cedula=tcl.readLine();
            }
            
            while(cedula.length()!=10)
            {
                System.out.print("Cédula incorrecta. Ingrese nuevamente: ");
                cedula=tcl.readLine();
            }
            
            for(cont=0;cont<10;cont++)
            {
                try
                {
                    vector[cont]=Integer.valueOf(cedula.substring(cont,cont+1));
                }
                
                catch(NumberFormatException e)
                {
                    System.out.print("Cédula incorrecta. Ingrese nuevamente: ");
                    cedula=tcl.readLine();
                    while(cedula.length()!=10)
                    {
                        System.out.print("Cédula incorrecta. Ingrese nuevamente: ");
                        cedula=tcl.readLine();
                    }
                }
            }
            
            digs=String.valueOf(vector[0])+String.valueOf(vector[1]);
            digsi=Integer.valueOf(digs);
            if(digsi>24)
            {
                opc='F';
            }
            
            for(cont=0;cont<9;cont+=2)
            {
                if(vector[cont]*2>=10)
                {
                    suma1+=(vector[cont]*2)-9;
                }
                else
                {
                    suma1+=vector[cont]*2;
                }
            }
            
            for(cont=1;cont<9;cont+=2)
            {
                suma2+=vector[cont];
            }
            
            if(10-((suma1+suma2)%10)!=vector[9])
            {
                opc='F';
            }
            suma1=0;
            suma2=0;
            opc2='V';
        }
        System.out.println("Cédula ingresada correctamente");
    }
}
