/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package programa_1;

/**
 *
 * @author Lore
 */
public class Numeros20 
{
    public int num;
    public int Vector[]=new int[20];
    
    public void Mostrar()
    {
        for(num=0;num<20;num++)
        {
            Vector[num]=num+1;
        }
        
        for(num=0;num<20;num++)
        {
            System.out.println(Vector[num]);
        }
        
        for(num=0;num<20;num++)
        {
            System.out.print(Vector[num]+"-");
        }
    }
}
