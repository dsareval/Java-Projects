/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package metodosstring;

import java.io.IOException;



/**
 *
 * @author Administrador
 */
public class mainMetodosString {

    
    
    public static void main(String[] args)
    {
        Metodos met1=new Metodos();
            met1.asignarvalores();
            met1.contarcaracteres();
            met1.buscarposición();
            met1.reemplazarcaracteres();
            met1.converitrminusculas();
            met1.convertirmayusculas();
            met1.tomarpalabra();
            met1.tomarcaracter();
            met1.unirfrases();
            met1.compararfrases();
            met1.compararfrases2();
            System.out.println("La frase es "+ met1.frase);
            System.out.println("La frase 2 es "+met1.frase2);
            System.out.println("La frase 3 es "+met1.frase3);
            System.out.println("La cantidad de caracteres que tiene la frase es " + met1.cadena);
            System.out.println("La primera letra 'i' se encuentra en el caracter "+met1.posicion);
            System.out.println("Al reemplazar Tecnico por Robo la frase es "+met1.hilera);  
            System.out.println("Al escribir la frase en minúsculas queda "+met1.frasemin);
            System.out.println("Al escribir la frase en mayúsculas queda "+met1.frasemay);
            System.out.println("la palabra que se encuentra entre el caracter 7 y 16 es "+met1.palabra);
            System.out.println("El caracter que ocupa el lugar 17 es "+met1.caracter);
            System.out.println("Al unir la frase con la frase 2 queda "+met1.union);
            System.out.println("La frase y la frase 2 "+met1.comparacion);
            System.out.println("La frase y la frase 3 sin tomar cuenta mayúsuculas " +met1.comparacion2);
            
     }
}
