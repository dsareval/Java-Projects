/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package programa2;

import java.io.IOException;

/**
 *
 * @author Administrador
 */
public class mainPrograma2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        Calculadora objeto=new Calculadora();
        objeto.setearvalores();
        objeto.sumar();
        objeto.restar();
        objeto.multiplicar();
        objeto.dividir();
    }
}
