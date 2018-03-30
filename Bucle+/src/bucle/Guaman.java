/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package bucle;

/**
 *
 * @author Lore
 */
public class Guaman 
{
    public int num1;
    
    
    public void mostrar()
    {
        num1=7; 
        while( num1<=1000)
        {
            System.out.println( num1 );
            num1= (num1+7);            
        }        
    }        
}
