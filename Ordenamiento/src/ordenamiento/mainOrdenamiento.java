/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ordenamiento;

import java.io.IOException;

/**
 *
 * @author Lore
 */
public class mainOrdenamiento {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException 
    {
        Ordenamiento obj=new Ordenamiento();
        obj.Ingresar();
        obj.BubbleSort();
    }
}
