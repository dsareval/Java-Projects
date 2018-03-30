/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package vectores;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author Lore
 */
public class Calculos {
    BufferedReader br = new BufferedReader (new InputStreamReader(System.in));
        

    public int[] numeros = new int[5];
    public int[] numeros1= new int[5];
    public int[] numeros2= new int[5];
    public int[] num = new int[10];
    public int[] num1= new int[5];
    public int[] v1 = new int[10];
    public int[] v2 = new int[20];
    public int i;
    public int c;
    public int n;
    public int tv;
    public int cont2;
    
    
    public void programaC() throws IOException
            
    {
        
        System.out.println("Ingrese 5 numeros : ");

        for(i=0;i<5;i++)
        {
            numeros[i]=Integer.valueOf(br.readLine());
        }
        System.out.println("Ingrese 5 numeros : ");

        for(i=0;i<5;i++)
        {
            numeros1[i]=Integer.valueOf(br.readLine());
        }
        
        for(i=0;i<5;i++)
        {
            numeros2[i]=numeros[i]+numeros1[i];
            System.out.println("La suma de los indices: "+i+" = "+numeros2[i]);
            numeros2[i]=0;
            
        }
        
         for(i=0;i<5;i++)
        {
        
            for(cont2=0;cont2<5;cont2++)
            {
                numeros2[i]+=numeros[i]*numeros1[cont2];
            }
            System.out.println("La multiplicacion de los indices: "+i+" = "+numeros2[i]);
            numeros2[i]=0;
        }
        
         for(i=0;i<5;i++)
        {
        
            numeros2[i]=numeros[i]-numeros1[i];
            System.out.println("La resta de los indices: "+i+" = "+numeros2[i]);
        }
       
    }
    
    
   public void programaD() throws IOException
   {
    System.out.println("Ingrese 10 numeros");
     for(i=0;i<10;i++)
        {
        num[i]=Integer.valueOf(br.readLine());
        }
     num1[0]=num.length;
     System.out.println("El tamano del vector es: "+num1[0]);
      for(i=0;i<10;i++)  
      {
            num1[1]+=num[i];
      }
      System.out.println("la suma de los numeros es: " + num1[1]);
      num1[2]=1;
      for(i=0;i<10;i++)  
      {
            num1[2]*=num[i];
      }
      System.out.println("la multiplicacion de los numeros es: " + num1[2]);
      for(i=0;i<10;i++)  
      {
            num1[3]+=num[i]/10;
      }
      System.out.println("Ingrese el numero que desea buscar: ");
      n=Integer.valueOf(br.readLine());
       for(i=0;i<10;i++)
       {
           if(num[i]==n)
           {
              c++;
           }
       }
       System.out.println("La cantidad de numeros "+n+" es: "+c);
   }
   
   
   public void programaB() throws IOException
   {
     System.out.println("Ingrese 10 numeros"); 
     for(i=0;i<10;i++)
        {
        v1[i]=Integer.valueOf(br.readLine());
        }
      tv= v1.length;
      System.out.println("El tamano del vector es: " + tv);  
   }
   
            
   public void programaA() throws IOException
   {
       System.out.println("Ingrese 20 numeros: ");
       for(i=0;i<=19;i++)
        {
        v2[i]=Integer.valueOf(br.readLine());        
        }
       
        
      
        for(i=0;i<19;i++)
        {
        System.out.print(v2[i]+",");
        }
        
        System.out.println(v2[i]);
        
        for(i=0;i<=19;i++)
        {
        System.out.println(v2[i]);
        }
        
       
   }
            
            
            
}
