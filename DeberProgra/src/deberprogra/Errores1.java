/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package deberprogra;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author Angel
 */
public class Errores1 
{
    public int vec1 []= new int [10];
    public double resp1;
    public double resp2;
    public double resp3;
    public double resp4;
    public double resp5;
    public String cedula;
    public int cont;
    public String nums;
    public int nums2;
    public char var;
    public char var2;
    public char var3;
    public void ingresar () throws IOException 
    {
        BufferedReader tcl= new BufferedReader(new InputStreamReader(System.in));
        var2='F';
        while (var2=='F'||var3=='F')
        {    
        System.out.println("Ingrese la Cedula");
        cedula= tcl.readLine();       
        
        while (cedula.length()!=10)  
        {
            System.out.println("Ingrese la Cedula");
            cedula= tcl.readLine();
        }
        for(cont=0; cont<=9; cont++)
        {
            try
            {
                vec1[cont] = Integer.valueOf(cedula.substring(cont,cont+1));      
            }
            catch(NumberFormatException ex)
            {
                while (cedula.length()!=10)  
                {
                    System.out.println("Ingrese la Cedula");
                    cedula= tcl.readLine();
                }
            }
        }
        nums=Integer.toString(vec1[0])+Integer.toString(vec1[1]);
        nums2=Integer.valueOf(nums);
        if(nums2<=24)
        {            
            var2='V';
        }
        else
        {
            var2='F';
        }       
        for(cont=0; cont<=8; cont+=2)
        {
            if(vec1[cont]*2>=10)
            {
                resp1+=(vec1[cont]*2)-9;
            }
            else
            {
                resp1+=vec1[cont]*2;
            }
        }
        for(cont=1; cont<=8; cont+=2)
        {
            resp2+=vec1[cont]*1;        
        }
        resp3= resp1+resp2;
        resp4=resp3%10;
        resp5=10-resp4;
        if(resp5==vec1[9])
        {
            var3='V';
        }
        else
        {
            var3='F';
        }
        resp1=0;
        resp2=0;
        resp3=0;
        resp4=0;
        resp5=0;
        }
        System.out.println("La cédula es valida");
    }    
}