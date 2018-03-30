/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package programa_4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author Lore
 */
public class Arreglos 
{
    
    public int num;
    public int num2;
    public int cont;
    public int [] Arreglo1=new int[10];
    public int [] Arreglo2=new int[5];
    
    
    public void Mostrar() throws IOException
    {
        BufferedReader tcl=new BufferedReader(new InputStreamReader(System.in));
        
        for(num=0;num<10;num++)
        {
            System.out.println("Ingrese un número ");
            Arreglo1[num]=Integer.valueOf(tcl.readLine());
        }
        
        Arreglo2[0]=Arreglo1.length;
        System.out.println("El arreglo posee "+Arreglo2[0]+" posiciones");
        
        for(num=0;num<10;num++)
        {
            Arreglo2[1]=Arreglo2[1]+Arreglo1[num];
        }
        System.out.println("La suma de todos los números es "+Arreglo2[1]);
        
        Arreglo2[2]=1;
        
        for(num=0;num<10;num++)
        {
            Arreglo2[2]=Arreglo2[2]*Arreglo1[num];
        }
        System.out.println("Todos los números multplicados da igual a "+Arreglo2[2]);
        
        Arreglo2[3]=Arreglo2[1]/10;      
        System.out.println("El promedio de todos sus índices es "+Arreglo2[3]);
        
        System.out.println("Que número desea buscar ");
        num2=Integer.valueOf(tcl.readLine());
        
        for(num=0;num<10;num++)
        {
            if(Arreglo1[num]==num2)
            {
                cont++;
            }
        }
        Arreglo2[4]=cont;
        System.out.println("El arreglo posee "+Arreglo2[4]+" números");
    }
}
