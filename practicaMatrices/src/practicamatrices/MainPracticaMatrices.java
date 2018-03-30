/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practicamatrices;

import java.util.Scanner;

/**
 *
 * @author Lore
 */
public class MainPracticaMatrices {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        Scanner scs=new Scanner(System.in);
        int [][]mat;//Creamos la matriz
        int i;//contador de filas
        int j;//contador de columnas
        int filas;//Número de filas
        int columnas;//Número de columnas
        
        System.out.print("Ingrese el número de filas: ");//Solicitamos que se ingrese el num de filas.
        filas=scs.nextInt();//Leemos el num de filas
        System.out.print("Ingrese el número de columnas: ");//Solicitamos que se ingrese el num de columnas.
        columnas=scs.nextInt();//Leemos el num de columnas
        
        mat=new int [filas][columnas];//Dimensionamos la matriz con la cantidad de filas y columnas indicada por el usuario
        
        for(i=0;i<filas;i++)//bucle para desplazarse en las filas
        {
            for(j=0;j<columnas;j++)//bucle para desplazarse en las columnas
            {
                System.out.print("Ingrese un número: ");
                mat[i][j]=scs.nextInt();//Llenar la matriz en la posición [i][j] con 1
            }
        }
        
        for(i=0;i<filas;i++)//bucle para desplazarse en las filas
        {
            for(j=0;j<columnas;j++)//bucle para desplazarse en las columnas
            {
                System.out.print(mat[i][j]+" ");//Escribir el valor de mat[i][j] con un espacio
            }
            System.out.println();//Dar un enter
        }       
    }
    
}
