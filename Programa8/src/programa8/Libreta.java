/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package programa8;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author Administrador
 */
public class Libreta {
    BufferedReader teclado=new BufferedReader(new InputStreamReader(System.in));
    
    public float dpf1;
    public float dpf2;
    public float dpf3;
    public float dpfex;
    public float fisic1;
    public float fisic2;
    public float fisic3;
    public float fisicex;
    public float mat1;
    public float mat2;
    public float mat3;
    public float matex;
    public float ing1;
    public float ing2;
    public float ing3;
    public float ingex;
    public float hist1;
    public float hist2;
    public float hist3;
    public float histex;
    public float quim1;
    public float quim2;
    public float quim3;
    public float quimex;
    public float lite1;
    public float lite2;
    public float lite3;
    public float liteex;
    public float progra1;
    public float progra2;
    public float progra3;
    public float prograex; 
    public float elec1;
    public float elec2;
    public float elec3;
    public float elecex;  
    public float geom1;
    public float geom2;
    public float geom3;
    public float geomex;
    public float dt1;
    public float dt2;
    public float dt3;
    public float dtex;
    public float cad1;
    public float cad2;
    public float cad3;
    public float cadex;
    public float educa1;
    public float educa2;
    public float educa3;
    public float educaex;   
    public float reli1;
    public float reli2;
    public float reli3;
    public float reliex;      
    public float anim1;
    public float anim2;
    public float anim3;
    public float animex;
    public float club1;
    public float club2;
    public float club3;
    public float clubex;
    public float promedio;
    public float sumatotal;
    public float dpftotal;
    public float fisictotal;
    public float mattotal;
    public float ingtotal;
    public float histtotal;
    public float quimtotal; 
    public float litetotal; 
    public float progratotal;
    public float electotal;
    public float dttotal;
    public float geomtotal;
    public float cadtotal;
    public float educatotal;   
    public float relitotal;  
    public float animtotal;
    public float clubtotal;
    
    
    public void setearvalores() throws IOException
    {
        System.out.println("Ingrese la nota 1 de desarrollo del pensamiento filosófico: ");
        dpf1=Integer.valueOf(teclado.readLine());
        System.out.println("Ingrese la nota 2 de desarrollo del pensamiento filosófico: ");
        dpf2=Integer.valueOf(teclado.readLine());
        System.out.println("Ingrese la nota 3 de desarrollo del pensamiento filosófico: ");
        dpf3=Integer.valueOf(teclado.readLine());
        System.out.println("Ingrese el examen de desarrollo del pensamiento filosófico: ");
        dpfex=Integer.valueOf(teclado.readLine());
        System.out.println("Ingrese la nota 1 de física: ");
        fisic1=Integer.valueOf(teclado.readLine());
        System.out.println("Ingrese la nota 2 de física: ");
        fisic2=Integer.valueOf(teclado.readLine());
        System.out.println("Ingrese la nota 3 de física: ");
        fisic3=Integer.valueOf(teclado.readLine());
        System.out.println("Ingrese el exámen de física: ");        
        fisicex=Integer.valueOf(teclado.readLine());
        System.out.println("Ingrese la nota 1 de matemáticas: ");
        mat1=Integer.valueOf(teclado.readLine());
        System.out.println("Ingrese la nota 2 de matemáticas: ");
        mat2=Integer.valueOf(teclado.readLine());
        System.out.println("Ingrese la nota 3 de matemáticas: ");
        mat3=Integer.valueOf(teclado.readLine());
        System.out.println("Ingrese el exámen de matemáticas: ");        
        matex=Integer.valueOf(teclado.readLine());       
         System.out.println("Ingrese la nota 1 de inglés: ");
        ing1=Integer.valueOf(teclado.readLine());
        System.out.println("Ingrese la nota 2 de inglés: ");
        ing2=Integer.valueOf(teclado.readLine());
        System.out.println("Ingrese la nota 3 de inglés: ");
        ing3=Integer.valueOf(teclado.readLine());
        System.out.println("Ingrese el exámen de inglés: ");
        ingex=Integer.valueOf(teclado.readLine());
        System.out.println("Ingrese la nota 1 de historia: ");
        hist1=Integer.valueOf(teclado.readLine());
        System.out.println("Ingrese la nota 2 de historia: ");
        hist2=Integer.valueOf(teclado.readLine());
        System.out.println("Ingrese la nota 3 de historia: ");
        hist3=Integer.valueOf(teclado.readLine());
        System.out.println("Ingrese el examen de historia: ");
        histex=Integer.valueOf(teclado.readLine());        
        System.out.println("Ingrese la nota 1 de química: ");
        quim1=Integer.valueOf(teclado.readLine());
        System.out.println("Ingrese la nota 2 de química: ");
        quim2=Integer.valueOf(teclado.readLine());
        System.out.println("Ingrese la nota 3 de química: ");
        quim3=Integer.valueOf(teclado.readLine());
        System.out.println("Ingrese el exámen de química: ");
        quimex=Integer.valueOf(teclado.readLine()); 
        System.out.println("Ingrese la nota 1 de literatura: ");
        lite1=Integer.valueOf(teclado.readLine());
        System.out.println("Ingrese la nota 2 de literatura: ");
        lite2=Integer.valueOf(teclado.readLine());
        System.out.println("Ingrese la nota 3 de literatura: ");
        lite3=Integer.valueOf(teclado.readLine());
        System.out.println("Ingrese el examen de literatura: ");
        liteex=Integer.valueOf(teclado.readLine());     
        System.out.println("Ingrese la nota 1 de programación: ");
        progra1=Integer.valueOf(teclado.readLine());
        System.out.println("Ingrese la nota 2 de programación: ");
        progra2=Integer.valueOf(teclado.readLine());
        System.out.println("Ingrese la nota 3 de programación: ");
        progra3=Integer.valueOf(teclado.readLine());
        System.out.println("Ingrese el exámen de programación: ");
        prograex=Integer.valueOf(teclado.readLine());      
         System.out.println("Ingrese la nota 1 de electrónica: ");
        elec1=Integer.valueOf(teclado.readLine());
        System.out.println("Ingrese la nota 2 de electrónica: ");
        elec2=Integer.valueOf(teclado.readLine());
        System.out.println("Ingrese la nota 3 de electrónica: ");
        elec3=Integer.valueOf(teclado.readLine());
        System.out.println("Ingrese el exámen de electrónica: ");
        elecex=Integer.valueOf(teclado.readLine());
        System.out.println("Ingrese la nota 1 de dibujo técnico: ");
        dt1=Integer.valueOf(teclado.readLine());
        System.out.println("Ingrese la nota 2 de dibujo técnico: ");
        dt2=Integer.valueOf(teclado.readLine());
        System.out.println("Ingrese la nota 3 de dibujo técnico: ");
        dt3=Integer.valueOf(teclado.readLine());
        System.out.println("Ingrese el examen de dibujo técnico: ");
        dtex=Integer.valueOf(teclado.readLine());
         System.out.println("Ingrese la nota 1 de geometría: ");
        geom1=Integer.valueOf(teclado.readLine());
        System.out.println("Ingrese la nota 2 de geometría: ");
        geom2=Integer.valueOf(teclado.readLine());
        System.out.println("Ingrese la nota 3 de geometría: ");
        geom3=Integer.valueOf(teclado.readLine());
        System.out.println("Ingrese el exámen de geometría: ");
        geomex=Integer.valueOf(teclado.readLine());  
        System.out.println("Ingrese la nota 1 de autoCAD: ");
        cad1=Integer.valueOf(teclado.readLine());
        System.out.println("Ingrese la nota 2 de autoCAD: ");
        cad2=Integer.valueOf(teclado.readLine());
        System.out.println("Ingrese la nota 3 de autoCAD: ");
        cad3=Integer.valueOf(teclado.readLine());
        System.out.println("Ingrese el exámen de autoCAD: ");
        cadex=Integer.valueOf(teclado.readLine());
        System.out.println("Ingrese la nota 1 de educación física: ");
        educa1=Integer.valueOf(teclado.readLine());
        System.out.println("Ingrese la nota 2 de educación física: ");
        educa2=Integer.valueOf(teclado.readLine());
        System.out.println("Ingrese la nota 3 de educación física: ");
        educa3=Integer.valueOf(teclado.readLine());
        System.out.println("Ingrese el examen de educación física: ");
        educaex=Integer.valueOf(teclado.readLine());               
        System.out.println("Ingrese la nota 1 de religión: ");
        reli1=Integer.valueOf(teclado.readLine());
        System.out.println("Ingrese la nota 2 de religión: ");
        reli2=Integer.valueOf(teclado.readLine());
        System.out.println("Ingrese la nota 3 de religión: ");
        reli3=Integer.valueOf(teclado.readLine());
        System.out.println("Ingrese el exámen de religión: ");
        reliex=Integer.valueOf(teclado.readLine());  
        System.out.println("Ingrese la nota 1 de animación de clases: ");
        anim1=Integer.valueOf(teclado.readLine());
        System.out.println("Ingrese la nota 2 de animación de clases: ");
        anim2=Integer.valueOf(teclado.readLine());
        System.out.println("Ingrese la nota 3 de animación de clases: ");
        anim3=Integer.valueOf(teclado.readLine());
        System.out.println("Ingrese el exámen de animación de clases: ");
        animex=Integer.valueOf(teclado.readLine());  
        System.out.println("Ingrese la nota 1 de club: ");
        club1=Integer.valueOf(teclado.readLine());
        System.out.println("Ingrese la nota 2 de club: ");
        club2=Integer.valueOf(teclado.readLine());
        System.out.println("Ingrese la nota 3 de club: ");
        club3=Integer.valueOf(teclado.readLine());
        System.out.println("Ingrese el exámen de club: ");
        clubex=Integer.valueOf(teclado.readLine());           
        }
    
    public void obtenernotas()
    {
        dpftotal=((dpf1+dpf2+dpf3)/3)+(dpfex);
        fisictotal=((fisic1+fisic2+fisic3)/3)+(fisicex);
        mattotal=((mat1+mat2+mat3)/3)+(matex);
        ingtotal=((ing1+ing2+ing3)/3)+(ingex);
        histtotal=((hist1+hist2+hist3)/3)+(histex);
        quimtotal=((quim1+quim2+quim3)/3)+(quimex);
        litetotal=((lite1+lite2+lite3)/3)+(liteex); 
        progratotal=((progra1+progra2+progra3)/3)+(prograex);
        electotal=((elec1+elec2+elec3)/3)+(elecex);
        dttotal=((dt1+dt2+dt3)/3)+(dtex);
        geomtotal=((geom1+geom2+geom3)/3)+(geomex);
        cadtotal=((cad1+cad2+cad3)/3)+(cadex);
        educatotal=((educa1+educa2+educa3)/3)+(educaex);       
        relitotal=((reli1+reli2+reli3)/3)+(reliex);           
        animtotal=((anim1+anim2+anim3)/3)+(animex);
        clubtotal=((club1+club2+club3)/3)+(clubex);
        promedio=(litetotal+histtotal+dpftotal+dttotal+educatotal+electotal+progratotal+quimtotal+mattotal+fisictotal+cadtotal+relitotal+ingtotal+geomtotal+animtotal+clubtotal)/16;
        sumatotal=(litetotal+histtotal+dpftotal+dttotal+educatotal+electotal+progratotal+quimtotal+mattotal+fisictotal+cadtotal+relitotal+ingtotal+geomtotal+animtotal+clubtotal);
    }
    
    public void mostrarlibreta()
    {
        System.out.println("DESARROLLO DEL PENSAMIENTO FILOSÓFICO: "+dpftotal);
        System.out.println("FÍSICA: "+fisictotal);
        System.out.println("MATEMÁTICAS: "+mattotal);
        System.out.println("INGLÉS: "+ingtotal);
        System.out.println("HISTORIA: "+histtotal);
        System.out.println("QUÍMICA: "+quimtotal);
        System.out.println("LITERATURA: "+litetotal);
        System.out.println("PROGRAMACIÓN: "+progratotal);
        System.out.println("ELECTRÓNICA: "+electotal);
        System.out.println("DIBUJO TÉCNICO: "+dttotal);
        System.out.println("GEOMETRÍA: "+geomtotal);
        System.out.println("AUTOCAD: "+cadtotal);
        System.out.println("EDUCACIÓN FÍSICA: "+educatotal);
        System.out.println("RELIGIÓN: "+relitotal);
        System.out.println("ANIMACIÓN DE CLASES: "+animtotal);
        System.out.println("CLUB: "+clubtotal);
        System.out.println("SUMA TOTAL: "+sumatotal);
        System.out.println("PROMEDIO QUIMESTRE: "+promedio);
    }
}
