
package cedula;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Procesos 
{
    public String n;
    public int vector[]=new int [10];
    public int cont;
    public double num1;
    public double resp1;
    public double num2;
    public double resp2;
    public double resp;
    public boolean opc;
    public boolean opc2;
    
    BufferedReader tcl=  new BufferedReader(new InputStreamReader(System.in));
    
     public void Ingresar() throws IOException
     {
         System.out.println("Ingrese cedula: ");
         n=tcl.readLine();
         while(opc==false)
         {  
            if(opc2==true)
            {
                System.out.println("Cédula invalida. Ingrese nuevamente");
                n=tcl.readLine();
            }
            opc=true;
            while (n.length()!=10)
            {
                System.out.println("Cédula invalida. Ingrese nuevamente");
                n=tcl.readLine();
            }
            for(cont=0;cont<10;cont++)
            {
                try
                {
                    vector[cont]=Integer.valueOf(n.substring(cont, cont+1));
                }
                catch(NumberFormatException  ex)
                {
                    System.out.println("Cédula invalida. Ingrese nuevamente");
                    n=tcl.readLine();  
                    while (n.length()!=10)
                    {
                        System.out.println("Cédula invalida. Ingrese nuevamente");
                        n=tcl.readLine();
                    }
                }
            }    
            
         if (vector[0]>2)
         {
             opc=false;
         }
         
         if (vector[0]==2)
         {
             if (vector[1]>=5)
             {
                opc=false;
             }
         }   

         for(cont=0;cont<9;cont+=2)
         {
             num1=vector[cont]*2;
             if (num1>=10)
             {
                 num1-=9;
             }
             resp1+=num1;            
         }
         
         for(cont=1;cont<9;cont+=2)
         {
             if (vector[cont]>=10)
             {
                 vector[cont]-=9;
             }
             resp2+=vector[cont];
         }         
         
         resp=(resp1+resp2)%10;
         
         if (resp==0)
         {
             if (resp!=vector[9])
             {
                 opc=false;
             }            
         }
         else
         {
             if(10-resp!=vector[9])
             {
                 opc=false;
             }
         }
         opc2=true;
         resp=0;
         resp1=0;
         resp2=0;         
     }
     System.out.println("Cédula correcta");
}
}