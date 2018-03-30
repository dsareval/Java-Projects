/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package programa8;

import java.io.IOException;

/**
 *
 * @author Administrador
 */
public class mainPrograma8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        Libreta objeto=new Libreta();
        
        objeto.setearvalores();
        objeto.obtenernotas();
        objeto.mostrarlibreta();
    }
}
