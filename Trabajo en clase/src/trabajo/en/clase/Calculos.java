/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package trabajo.en.clase;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author PC
 */
public class Calculos 
{
   BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
   public  String n;
   public int tam;
   public int aux;
   public int aux1;
   public int cont;
   public int temp;
   
   
   public void Mostrar() throws IOException
   {
        System.out.println("Ingrese un nùmero: ");
        n=br.readLine();       
        tam=n.length();
        aux=0;
        int Vector[]= new int[tam];
        
        for (cont=0;cont<tam;cont++)
        {
            Vector[cont]=Integer.valueOf(n.substring(cont,cont+1));
        }
        
        for(aux=0;aux<tam;aux++)
        {    
              for(aux1=tam-1;aux1>=aux;aux1--)
              {
                   if(Vector[aux1]<Vector[aux])
                   {
                      temp=Vector[aux];
                      Vector[aux]=Vector[aux1];
                      Vector[aux1]=temp;
                   }
              }
         }
        
         for( aux=0; aux<tam ; aux++)
         {
            System.out.print(Vector[aux]+" ");
         }
    }
     
     
     

    

     
}
   
   

