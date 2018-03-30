/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package repeticion;

/**
 *
 * @author Lore
 */
public class Estructuras 
{
    public int num1; 
    
    public void operarwhile()
    {
        num1=1;
        
        while (num1<=10)
        {
            System.out.println(num1);
            num1++;
        }
        
        System.out.println("------------");  
    }
    
    public void operardowhile()
    {
        num1=1;
        
        do
        {            
            System.out.println(num1);
            num1++;        
        }
        while(num1<=10);
        
        System.out.println("------------");
    }
    
    public void operarfor()
    {        
        for(num1=1;num1<=10; num1++)
        {
            System.out.println(num1);
        }
    }
}
