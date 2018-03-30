/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package deberprogramacion;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author Diego
 */
class Procesos {

    public String usuario, nombreusuario="555";
    public int cont=0,contraseña1=0;
        
    public Procesos() throws IOException 
    {
        
        BufferedReader teclado = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Para salir del programa digite: 9999    "+ "" + "Ingrese el Nombre de Usuario:");
        
        while(cont==0||cont==1)
        {
            try
            {       
                contraseña1=Integer.parseInt(teclado.readLine());
                if(cont==1)
                {
                    if(contraseña1==1234)
                    {                      
                        System.out.println("Contraseña Correcta.");
                        cont=0;
                        System.out.println("Para salir del programa digite: 9999"+ "" + "Ingrese el Nombre de Usuario:");
                    }
                    else
                    {
                        System.out.println("Contraseña Incorrecta");
                        System.out.println("Ingresar contraseña para el Usuario:");
                    }
                }
                
                if(contraseña1==9999)
                {
                    System.exit(0);
                }
                
                if(cont==0)
                {
                    if(contraseña1==Integer.parseInt(nombreusuario))
                    {
                        System.out.println("Nombre de Usuario Correcto");
                        System.out.println("Ingresar contraseña para el Usuario:");
                        cont=1;
                    }
                    else
                    {
                        System.out.println("Nombre de Usuario Incorrecto");
                        System.out.println("Para salir del programa digite: 9999"+ "" + "Ingrese el Nombre de Usuario:");
                    }
                }
                
            }
            catch(NumberFormatException e)
            {
                System.out.println("Usted ha ingresado una contraseña la cual tiene caracteres no permitidos, ingresar contraeña nuevamente");
            }
        }
    }
    
}
