/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package thread;

/**
 *
 * @author Lore
 */
public class Threads extends Thread
{
    public void run()
    {
        int i=0;
        while(i<5)
        {
            System.out.println(this.getName());
            i++;
        }
    }
}
