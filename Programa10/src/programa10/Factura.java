/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package programa10;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author Administrador
 */
public class Factura {
    BufferedReader tcl=new BufferedReader(new InputStreamReader(System.in));
    
    public float ca1;
    public float ca2;
    public float ca3;
    public float va1;
    public float va2;
    public float va3;
    public float suba1;
    public float suba2;
    public float suba3;
    public float desca1;
    public float desca2;
    public float desca3;
    public float totala1;
    public float totala2;
    public float totala3;
    public float subtotal;
    public float descuento;
    public float iva;
    public float total;
    public String nombres;
    public String apellidos;
    public String cedula;
    public String telefono;
    public String direccion;
    
    public void setearvalores() throws IOException
    {        
        System.out.println("Cantidad de brochas");
        ca1=Integer.valueOf(tcl.readLine());
        System.out.println("Cantidad de rodillos");
        ca2=Integer.valueOf(tcl.readLine());
        System.out.println("Cantidad de selladores");
        ca3=Integer.valueOf(tcl.readLine());
        System.out.println("Valor unitario de las brochas");
        va1=Integer.valueOf(tcl.readLine());
        System.out.println("Valor unitario de los rodillos");
        va2=Integer.valueOf(tcl.readLine());
        System.out.println("Falor unitario de los selladores");
        va3=Integer.valueOf(tcl.readLine());
        System.out.println("Ingrese sus nombres: ");
        nombres=tcl.readLine();
        System.out.println("Ingrese sus apellidos: ");
        apellidos=tcl.readLine();
        System.out.println("Ingrese su número de cédula: ");
        cedula=tcl.readLine();
        System.out.println("Ingrese su teléfono: ");
        telefono=tcl.readLine();
        System.out.println("Ingrese su dirección: ");
        direccion=tcl.readLine();
    }
    
    public void calcularprecios()
    {
        suba1=ca1*va1;
        suba2=ca2*va2;
        suba3=ca3*va3;
        subtotal=suba1+suba2+suba3;
        desca1=(float) (suba1*0.25);
        desca2=(float) (suba2*0.15);
        desca3=(float) (suba3*0.07);
        descuento=desca1+desca2+desca3;
        iva=(float) (subtotal*0.12);
        total=subtotal-descuento+iva;
    }
    
    public void mostrarfactura()
    {
        System.out.println("Cliente: "+nombres+" "+apellidos);
        System.out.println("CI: "+cedula);
        System.out.println("Telf.: "+telefono);
        System.out.println("Dir.: "+direccion);
        System.out.println("Subtotal brochas: "+suba1);
        System.out.println("Subtotal rodillos: "+suba2);
        System.out.println("Subtotal selladores: "+suba3);
        System.out.println("SUBTOTAL: "+subtotal);
        System.out.println("Descuento: "+descuento);
        System.out.println("IVA: "+iva);
        System.out.println("TOTAL: "+total);   
    }
}
