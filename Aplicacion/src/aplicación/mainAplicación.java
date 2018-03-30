/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package aplicación;

import java.io.IOException;

/**
 *
 * @author LABORATORIO
 */
public class mainAplicación {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException 
    {
        Programa obj=new Programa();
        obj.asignar();
        obj.procesar();
    }
}
