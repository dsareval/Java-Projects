/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package datospersonales;

/**
 *
 * @author Administrador
 */
public class mainDatosPersonales {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        Persona robo = new Persona();
                robo.AsignarValor();
                robo.MostrarValor();
                System.out.println(robo.salida);     
             
    }
}
