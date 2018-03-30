/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package datospersonales;

/**
 *
 * @author Administrador
 */
public class Persona 
{
    public String nombre;
    public String apellido;
    public String cedula;
    public String direccion;
    public String salida;
    
    public void AsignarValor()
    {
        nombre="Daniel";
        apellido="Arévalo";
        cedula="010559966-6";
        direccion="la prensa";        
    }
    
    public void MostrarValor()
    {
        salida= nombre + " " + apellido + " ---- " + cedula + " ---- " + direccion;    
    }
}
