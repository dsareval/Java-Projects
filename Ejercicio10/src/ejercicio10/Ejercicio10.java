/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio10;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author Administrador
 */
public class Ejercicio10 
{
    BufferedReader tcl=new BufferedReader(new InputStreamReader(System.in));
    
    public float cantbro;
    public float cantrod;
    public float cantsel;
    public float valorbro;
    public float valorrod;
    public float valorsel;
    public float subbro;
    public float subrod;
    public float subsel;
    public float descbro;
    public float descrod;
    public float descsel;
    public float totbro;
    public float totrod;
    public float totsel;
    public float subtotal;
    public float descuento;
    public float impuesto;
    public float total;
    public String nombres;
    public String apellidos;
    public String CI;
    public String telefono;
    public String direccion;
    
    public void asignarvalores() throws IOException
    {
        System.out.println("Ingrese los nombres: ");
        nombres=tcl.readLine();
        System.out.println("Ingrese los apellidos: ");
        apellidos=tcl.readLine();
        System.out.println("Ingrese el número de cédula: ");
        CI=tcl.readLine();
        System.out.println("Ingrese el teléfono: ");
        telefono=tcl.readLine();
        System.out.println("Ingrese la dirección: ");
        direccion=tcl.readLine();
        System.out.println("Ingrese la cantidad de brochas");
        cantbro=Integer.valueOf(tcl.readLine());
        System.out.println("Ingrese la cantidad de rodillos");
        cantrod=Integer.valueOf(tcl.readLine());
        System.out.println("Ingrese la cantidad de selladores");
        cantsel=Integer.valueOf(tcl.readLine());
        System.out.println("Ingrese el precio unitario de las brochas");
        valorbro=Integer.valueOf(tcl.readLine());
        System.out.println("Ingrese el precio unitario de los rodillos");
        valorrod=Integer.valueOf(tcl.readLine());
        System.out.println("Ingrese el precio unitario de los selladores");
        valorsel=Integer.valueOf(tcl.readLine());
    }
    
    public void calcularvalores()
    {
        subbro=cantbro*valorbro;
        subrod=cantrod*valorrod;
        subsel=cantsel*valorsel;
        subtotal=subbro+subrod+subsel;
        descbro=(float) (subbro*0.25);
        descrod=(float) (subrod*0.15);
        descsel=(float) (subsel*0.07);
        descuento=descbro+descrod+descsel;
        impuesto=(float) (subtotal*0.12);
        total=subtotal-descuento+impuesto;
    }
    
    public void mostrarvalores()
    {
        System.out.println("NOMBRES: "+nombres);
        System.out.println("APELLIDOS: "+apellidos);
        System.out.println("CÉDULA: "+CI);
        System.out.println("TELÉFONO: "+telefono);
        System.out.println("DIRECCIÓN: "+direccion);
        System.out.println("SUBTOTAL BROCHAS: "+subbro);
        System.out.println("SUBTOTAL RODILLOS: "+subrod);
        System.out.println("SUBTOTAL SELLADORES: "+subsel);
        System.out.println("SUBTOTAL GENERAL: "+subtotal);
        System.out.println("DESCUENTO TOTAL: "+descuento);
        System.out.println("IMPUESTOS: "+impuesto);
        System.out.println("TOTAL: "+total);        
    }
    
    
}
