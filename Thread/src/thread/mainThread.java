/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package thread;

/**
 *
 * @author Lore
 */
public class mainThread {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        Threads t1= new Threads();
        t1.setName("hola");
        t1.start();
    }
}
