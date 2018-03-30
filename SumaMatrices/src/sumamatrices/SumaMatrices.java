/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package sumamatrices;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author LABORATORIO
 */
public class SumaMatrices 
{
    BufferedReader tcl=new BufferedReader(new InputStreamReader(System.in));
    
    public int mat[][];
    public int n;
    public int m;
    public int i;
    public int j;
    public int suma;  
    public char opc;
    
    public void Ingresar() throws IOException
    {
        opc='F';
        while(opc=='F')
        {
            try 
            {
                System.out.print("Ingrese el número de filas: ");
                n=Integer.valueOf(tcl.readLine());                
                opc='V';
            }         
            catch (NumberFormatException ex) 
            {
                System.out.println("El número ingresado es incorrecto. Ingrese nuevamente");
                opc='F';
            }
        }
        
        opc='F';
        while(opc=='F')
        {
            try 
            {
                System.out.print("Ingrese el número de columnas: ");
                m=Integer.valueOf(tcl.readLine());
                opc='V';
            }         
            catch (NumberFormatException ex) 
            {
                System.out.println("El número ingresado es incorrecto. Ingrese nuevamente");
                opc='F';
            }
        }
        
        mat=new int [n][m];
        for(i=0;i<n;i++)
        {
            for(j=0;j<m;j++)
            {
                System.out.print("Ingrese el número de la posición "+i+", "+j+": ");
                try
                {
                    mat[i][j]=Integer.valueOf(tcl.readLine());
                }
                catch(NumberFormatException e)
                {
                    System.out.println("El número ingresado es incorrecto. Ingrese nuevamente");
                    j--;
                }
            }
        }
    }
    
    public void sumar()
    {
        for(i=0;i<n;i++)
        {
            suma=0;
            for(j=0;j<m;j++)
            {
                System.out.print(mat[i][j]+" ");
                suma+=mat[i][j];                
            }
            System.out.print(" = ");
            System.out.println(suma);
        }
        
        for(i=0;i<m;i++)
        {
            System.out.print("= ");
        }
        
        System.out.println();
        
        for(j=0;j<m;j++)
        {
            suma=0;
            for(i=0;i<n;i++)
            {
                suma+=mat[i][j];
            }
            System.out.print(suma+" ");
        }
        
        System.out.println();
    }
}
