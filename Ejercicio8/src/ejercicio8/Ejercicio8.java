/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio8;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author Administrador
 */
public class Ejercicio8 
{
    BufferedReader tcl=new BufferedReader(new InputStreamReader(System.in));
    
    public float leng1;
    public float leng2;
    public float leng3;
    public float lengex;
    public float hist1;
    public float hist2;
    public float hist3;
    public float histex;
    public float filo1;
    public float filo2;
    public float filo3;
    public float filoex;
    public float dib1;
    public float dib2;
    public float dib3;
    public float dibex;
    public float eeff1;
    public float eeff2;
    public float eeff3;
    public float eeffex;
    public float elec1;
    public float elec2;
    public float elec3;
    public float elecex;
    public float progra1;
    public float progra2;
    public float progra3;
    public float prograex;
    public float mate1;
    public float mate2;
    public float mate3;
    public float mateex;
    public float quim1;
    public float quim2;
    public float quim3;
    public float quimex;
    public float fisica1;
    public float fisica2;
    public float fisica3;
    public float fisicaex;
    public float CAD1;
    public float CAD2;
    public float CAD3;
    public float CADex;
    public float reli1;
    public float reli2;
    public float reli3;
    public float reliex;
    public float ingles1;
    public float ingles2;
    public float ingles3;
    public float inglesex;
    public float trigo1;
    public float trigo2;
    public float trigo3;
    public float trigoex;
    public float quimestre;
    public float suma;
    public float lengtot;
    public float histtot;
    public float filotot;
    public float dibtot;
    public float eefftot;
    public float electot;
    public float progratot;
    public float matetot;
    public float quimtot;
    public float fisicatot;
    public float CADtot;
    public float relitot;
    public float inglestot;
    public float trigotot;
    
    public void asignarvalores() throws IOException
    {
        System.out.println("Ingrese la nota 1 de lenguaje");
        leng1=Integer.valueOf(tcl.readLine());
        System.out.println("Ingrese la nota 2 de lenguaje");
        leng2=Integer.valueOf(tcl.readLine());
        System.out.println("Ingrese la nota 3 de lenguaje");
        leng3=Integer.valueOf(tcl.readLine());
        System.out.println("Ingrese el examen de lenguaje");
        lengex=Integer.valueOf(tcl.readLine());
        System.out.println("Ingrese la nota 1 de historia");
        hist1=Integer.valueOf(tcl.readLine());
        System.out.println("Ingrese la nota 2 de historia");
        hist2=Integer.valueOf(tcl.readLine());
        System.out.println("Ingrese la nota 3 de historia");
        hist3=Integer.valueOf(tcl.readLine());
        System.out.println("Ingrese el examen de historia");
        histex=Integer.valueOf(tcl.readLine());
        System.out.println("Ingrese la nota 1 de desarrollo del pensamiento filosófico");
        filo1=Integer.valueOf(tcl.readLine());
        System.out.println("Ingrese la nota 2 de desarrollo del pensamiento filosófico");
        filo2=Integer.valueOf(tcl.readLine());
        System.out.println("Ingrese la nota 3 de desarrollo del pensamiento filosófico");
        filo3=Integer.valueOf(tcl.readLine());
        System.out.println("Ingrese el examen de desarrollo del pensamiento filosófico");
        filoex=Integer.valueOf(tcl.readLine());
        System.out.println("Ingrese la nota 1 de dibujo técnico");
        dib1=Integer.valueOf(tcl.readLine());
        System.out.println("Ingrese la nota 2 de dibujo técnico");
        dib2=Integer.valueOf(tcl.readLine());
        System.out.println("Ingrese la nota 3 de dibujo técnico");
        dib3=Integer.valueOf(tcl.readLine());
        System.out.println("Ingrese el examen de dibujo técnico");
        dibex=Integer.valueOf(tcl.readLine());
        System.out.println("Ingrese la nota 1 de educación física");
        eeff1=Integer.valueOf(tcl.readLine());
        System.out.println("Ingrese la nota 2 de educación física");
        eeff2=Integer.valueOf(tcl.readLine());
        System.out.println("Ingrese la nota 3 de educación física");
        eeff3=Integer.valueOf(tcl.readLine());
        System.out.println("Ingrese el examen de educación física");
        eeffex=Integer.valueOf(tcl.readLine());
        System.out.println("Ingrese la nota 1 de electrónica");
        elec1=Integer.valueOf(tcl.readLine());
        System.out.println("Ingrese la nota 2 de electrónica");
        elec2=Integer.valueOf(tcl.readLine());
        System.out.println("Ingrese la nota 3 de electrónica");
        elec3=Integer.valueOf(tcl.readLine());
        System.out.println("Ingrese el exámen de electrónica");
        elecex=Integer.valueOf(tcl.readLine());
        System.out.println("Ingrese la nota 1 de programación");
        progra1=Integer.valueOf(tcl.readLine());
        System.out.println("Ingrese la nota 2 de programación");
        progra2=Integer.valueOf(tcl.readLine());
        System.out.println("Ingrese la nota 3 de programación");
        progra3=Integer.valueOf(tcl.readLine());
        System.out.println("Ingrese el exámen de programación");
        prograex=Integer.valueOf(tcl.readLine());
        System.out.println("Ingrese la nota 1 de química");
        quim1=Integer.valueOf(tcl.readLine());
        System.out.println("Ingrese la nota 2 de química");
        quim2=Integer.valueOf(tcl.readLine());
        System.out.println("Ingrese la nota 3 de química");
        quim3=Integer.valueOf(tcl.readLine());
        System.out.println("Ingrese el exámen de química");
        quimex=Integer.valueOf(tcl.readLine());
        System.out.println("Ingrese la nota 1 de matemáticas");
        mate1=Integer.valueOf(tcl.readLine());
        System.out.println("Ingrese la nota 2 de matemáticas");
        mate2=Integer.valueOf(tcl.readLine());
        System.out.println("Ingrese la nota 3 de matemáticas");
        mate3=Integer.valueOf(tcl.readLine());
        System.out.println("Ingrese el exámen de matemáticas");        
        mateex=Integer.valueOf(tcl.readLine());
        System.out.println("Ingrese la nota 1 de física");
        fisica1=Integer.valueOf(tcl.readLine());
        System.out.println("Ingrese la nota 2 de física");
        fisica2=Integer.valueOf(tcl.readLine());
        System.out.println("Ingrese la nota 3 de física");
        fisica3=Integer.valueOf(tcl.readLine());
        System.out.println("Ingrese el exámen de física");        
        fisicaex=Integer.valueOf(tcl.readLine());
        System.out.println("Ingrese la nota 1 de aplicaciones informáticas");
        CAD1=Integer.valueOf(tcl.readLine());
        System.out.println("Ingrese la nota 2 de aplicaciones informáticas");
        CAD2=Integer.valueOf(tcl.readLine());
        System.out.println("Ingrese la nota 3 de aplicaciones informáticas");
        CAD3=Integer.valueOf(tcl.readLine());
        System.out.println("Ingrese el exámen de aplicaciones informáticas");
        CADex=Integer.valueOf(tcl.readLine());
        System.out.println("Ingrese la nota 1 de religión");
        reli1=Integer.valueOf(tcl.readLine());
        System.out.println("Ingrese la nota 2 de religión");
        reli2=Integer.valueOf(tcl.readLine());
        System.out.println("Ingrese la nota 3 de religión");
        reli3=Integer.valueOf(tcl.readLine());
        System.out.println("Ingrese el exámen de religión");
        reliex=Integer.valueOf(tcl.readLine());
        System.out.println("Ingrese la nota 1 de inglés");
        ingles1=Integer.valueOf(tcl.readLine());
        System.out.println("Ingrese la nota 2 de inglés");
        ingles2=Integer.valueOf(tcl.readLine());
        System.out.println("Ingrese la nota 3 de inglés");
        ingles3=Integer.valueOf(tcl.readLine());
        System.out.println("Ingrese el exámen de inglés");
        inglesex=Integer.valueOf(tcl.readLine());
        System.out.println("Ingrese la nota 1 de trigonometría");
        trigo1=Integer.valueOf(tcl.readLine());
        System.out.println("Ingrese la nota 2 de trigonometría");
        trigo2=Integer.valueOf(tcl.readLine());
        System.out.println("Ingrese la nota 3 de trigonometría");
        trigo3=Integer.valueOf(tcl.readLine());
        System.out.println("Ingrese el exámen de trigonometría");
        trigoex=Integer.valueOf(tcl.readLine());  
        }
    
    public void calcularnotas()
    {
        lengtot=((leng1+leng2+leng3)/3)+(lengex);
        histtot=((hist1+hist2+hist3)/3)+(histex);
        filotot=((filo1+filo2+filo3)/3)+(filoex);
        dibtot=((dib1+dib2+dib3)/3)+(dibex);
        eefftot=((eeff1+eeff2+eeff3)/3)+(eeffex);
        electot=((elec1+elec2+elec3)/3)+(elecex);
        progratot=((progra1+progra2+progra3)/3)+(prograex);
        quimtot=((quim1+quim2+quim3)/3)+(quimex);
        matetot=((mate1+mate2+mate3)/3)+(mateex);
        fisicatot=((fisica1+fisica2+fisica3)/3)+(fisicaex);
        CADtot=((CAD1+CAD2+CAD3)/3)+(CADex);
        relitot=((reli1+reli2+reli3)/3)+(reliex);
        inglestot=((ingles1+ingles2+ingles3)/3)+(inglesex);
        trigotot=((trigo1+trigo2+trigo3)/3)+(trigoex);
        quimestre=(lengtot+histtot+filotot+dibtot+eefftot+electot+progratot+quimtot+matetot+fisicatot+CADtot+relitot+inglestot+trigotot)/14;
        suma=(lengtot+histtot+filotot+dibtot+eefftot+electot+progratot+quimtot+matetot+fisicatot+CADtot+relitot+inglestot+trigotot);
    }
    
    public void mostrarnotas()
    {
        System.out.println("LENGUAJE: "+lengtot);
        System.out.println("HISTORIA: "+histtot);
        System.out.println("FILOSOFÍA: "+filotot);
        System.out.println("DIBUJO TÉCNICO: "+dibtot);
        System.out.println("EDUCACIÓN FÍSICA: "+eefftot);
        System.out.println("ELECTRÓNICA: "+electot);
        System.out.println("PROGRAMACIÓN: "+progratot);
        System.out.println("QUÍMICA: "+quimtot);
        System.out.println("MATEMÁTICAS: "+matetot);
        System.out.println("FÍSICA: "+fisicatot);
        System.out.println("APLICACIONES INFORMÁTICAS: "+CADtot);
        System.out.println("RELIGIÓN: "+relitot);
        System.out.println("INGLÉS: "+inglestot);
        System.out.println("TRIGONOMETRÍA: "+trigotot);
        System.out.println("SUMA TOTAL: "+suma+"/140");
        System.out.println("NOTA QUIMESTRAL: "+quimestre+"/10");
    }
}
