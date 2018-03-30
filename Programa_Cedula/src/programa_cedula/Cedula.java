/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package programa_cedula;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author Lore
 */
public class Cedula 
{
    BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
    public int vec_1[]=new int[10];    
    public int i;
    public int nums2;
    public double prod1;
    public double prod2;
    public double resp1;
    public double resp2;  
    public double resp3;
    public double resp4;
    public double resp5;
    public String cedula;
    public String nums;
    public boolean op1;
    public boolean op2;
    public boolean opc;
    
    public void Setear() throws IOException
    {
        System.out.println("Ingrese su número de cédula");
        cedula=br.readLine();
        while (op1==false||op2==false)
        {
            if(opc==true)
            {
                System.out.println("Error. Intente nuevamente: ");
                cedula=br.readLine();
            }
            
            while(cedula.length()!=10)
            {
                System.out.println("Error. Intente nuevamente: ");
                cedula=br.readLine();
            }
            
            for(i=0;i<10;i++)
            {
                try
                {
                    vec_1[i]=Integer.valueOf(cedula.substring(i,i+1));
                }
                
                catch(NumberFormatException e)
                {
                    System.out.println("Error. Intente nuevamente: ");
                    cedula=br.readLine();
                    while(cedula.length()!=10)
                    {
                        System.out.println("Error. Intente nuevamente: ");
                        cedula=br.readLine();
                    }
                }
            }
            
            switch (vec_1[0])
            {
                case 0:
                    op1=true;
                    break;
                case 1:
                    op1=true;
                    break;
                case 2:
                    switch (vec_1[1])
                    {
                        case 0:
                            op1=true;
                            break;
                        case 1:
                            op1=true;
                            break;
                        case 2:
                            op1=true;
                            break;
                        case 3:
                            op1=true;
                            break;
                        case 4:
                            op1=true;
                            break;
                        default:
                            op1=false;
                            break;
                    }
                default:
                    op1=false;
                    break;
            }
            
            for(i=0;i<9;i+=2)
            {
                prod1=vec_1[i]*2;
                if(prod1>=10)
                {
                    resp1+=prod1-9;
                }
                else
                {
                    resp1+=prod1;
                }
            }
            
            for(i=1;i<9;i+=2)
            {
                prod2=vec_1[i]*1;
                resp2+=prod2;
            }
            
            resp3=resp1+resp2;
            resp4=resp3%10;
            resp5=10-resp4;
            if(resp5==vec_1[9])
            {
                op2=true;
            }
            resp1=0;
            resp2=0;
            opc=true;
            
        }
        System.out.println("Número Correcto");
    }
}
