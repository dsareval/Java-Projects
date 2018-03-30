/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package matrices;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author PC
 */
public class Calculos 
{
    
    public int filas;
    public int sumafilas;
    public int sumacolumnas;
    public int columnas;
    public int i;
    public int j;
    public int tam;
    
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    public void Mostar() throws IOException
    {
        System.out.print("Ingrese el numero de filas: ");
        filas=Integer.valueOf(br.readLine());
        
        System.out.print("Ingrese el numero de columnas: ");
        columnas=Integer.valueOf(br.readLine());
        
     int [][] mat = new int [filas][columnas];
 
     
     
        for( i=0;i<filas;i++)
        {
   
            for( j=0;j<columnas;j++)
            {  
               
                System.out.print("Ingrese el numero en la posicion: "+ i + " " + j +":" );
                   
          
                try
                {
                     mat[i][j]=Integer.valueOf(br.readLine());
                     
                }    
                catch(NumberFormatException e)
                {
                    System.out.println("error");
                    j--;
                }    
       
            }
           
         }     

                
        for( i=0;i<filas;i++)
        {
             sumafilas=0;
            for( j=0;j<columnas;j++)
            {    
               
                System.out.print(mat[i][j]);
                System.out.print(" "+" "); 
                
                sumafilas += mat[i][j];  
            } 
          
               System.out.println("="+" "+" "+sumafilas);      
     
        } 
        
        for( j=0;j<columnas;j++)
        {
             sumacolumnas=0;
             
            for( i=0;i<filas;i++)
            {    
                System.out.print(" "+" "); 
                
                sumacolumnas += mat[i][j];  
            } 
          
               System.out.println("=");      
     
        } 
        
        
        
        
}
}