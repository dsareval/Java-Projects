/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package metodosstring;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Metodos 
{
    
    BufferedReader tcl1=new BufferedReader(new InputStreamReader(System.in));
    
    public String frase;
    public String frase2;
    public String frase3;
    public int cadena;
    public int posicion;    
    public String hilera;
    public String frasemin;
    public String frasemay;
    public String palabra;
    public char caracter;
    public String union;
    public String comparacion;
    public String comparacion2;
    
    
    
    public void asignarvalores() 
    {
        frase="Unidad Educativa Tecnico Salesiano";
        frase2="Aplicaciones Informáticas";
        frase3="unidad educativa tecnico salesiano";        
    }
    
    public void contarcaracteres()
    {
        cadena=frase.length();
    }
    
    public void buscarposición()
    {
        posicion=frase.indexOf("i");        
    }
    
    public void reemplazarcaracteres()
    {
        hilera=frase.replace("Tecnico","Robo");        
    }
    
    public void converitrminusculas()
    {
        frasemin=frase.toLowerCase();
    }
    
    public void convertirmayusculas()
    {
        frasemay=frase.toUpperCase();
    }
    
    public void tomarpalabra()
    {
        palabra=frase.substring(7,16);
    }
   
    public void tomarcaracter()
    { 
        caracter=frase.charAt(17);
    }  
    
    public void unirfrases()
    {
        union=frase+" "+frase2;
    }
    
    public void compararfrases()
    {
        if(frase.equals(frase2))
            comparacion="son iguales";
        else
            comparacion="son diferentes";
    }
    
    public void compararfrases2()
    {
        if(frase.equals(frase3))
            comparacion2="son iguales";
        else
            comparacion2="son diferentes";
    }
    
    
    
    
}
