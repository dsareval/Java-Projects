/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package programa10;

import java.io.IOException;

/**
 *
 * @author Administrador
 */
public class mainPrograma10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        Factura objeto=new Factura();
        
        objeto.setearvalores();
        objeto.calcularprecios();
        objeto.mostrarfactura();
    }
}
