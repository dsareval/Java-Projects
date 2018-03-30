/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package sumamatrices;

import java.io.IOException;

/**
 *
 * @author LABORATORIO
 */
public class mainSumaMatrices {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException 
    {
        SumaMatrices obj=new SumaMatrices();
        obj.Ingresar();
        obj.sumar();
    }
}
