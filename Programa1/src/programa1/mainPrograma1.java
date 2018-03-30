/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package programa1;

import java.io.IOException;

/**
 *
 * @author Administrador
 */
public class mainPrograma1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException 
    {
        Telepronter objeto=new Telepronter();
        objeto.setearvalores();
        objeto.mostrarmensaje();
    }
}
