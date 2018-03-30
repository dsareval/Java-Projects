/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package programa_3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author Lore
 */
public class Operaciones 
{
    BufferedReader tcl=new BufferedReader(new InputStreamReader(System.in));
    
    public int num;
    public int num2;    
    public int []Arreglo1=new int[5];
    public int []Arreglo2=new int[5];
    public int []Arreglo3=new int[5];
    public int []Arreglo4=new int[5];
    public int []Arreglo5=new int[5];
        
    public void Mostrar() throws IOException
    {        
        for(num=0;num<5;num++)
        {
            System.out.println("Ingrese un número para el primer arreglo");
            Arreglo1[num]=Integer.valueOf(tcl.readLine());            
        }
        
        for(num=0;num<5;num++)
        {
            System.out.println("Ingrese un número para el segundo arreglo");
            Arreglo2[num]=Integer.valueOf(tcl.readLine());            
        }
        
        for(num=0;num<5;num++)
        {
            Arreglo3[num]=Arreglo1[num]+Arreglo2[num];
            System.out.println("La suma de los arreglos en la posición "+num+" es "+Arreglo3[num]);
        }
        
        for(num=0;num<5;num++)
        {
            Arreglo4[num]=Arreglo1[num]-Arreglo2[num];
            System.out.println("La resta de los arreglos en la posición "+num+" es "+Arreglo4[num]);
        }
        
        for(num=0;num<5;num++)
        {
            for(num2=0;num2<5;num2++)
            {
                Arreglo5[num]+=Arreglo1[num]*Arreglo2[num2];
            }
            System.out.println("El producto de los arreglos en la posición "+num+" es "+Arreglo5[num]);
        }
        
    }
}
