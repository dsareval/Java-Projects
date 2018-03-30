/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package programa5;

import java.io.IOException;

/**
 *
 * @author Administrador
 */
public class mainPrograma5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        Potencia obj=new Potencia();
        
        obj.setearvalores();
        obj.calcularrespuesta();
    }
}
