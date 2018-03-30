import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Matriz 
{
    BufferedReader tcl=new BufferedReader(new InputStreamReader(System.in));
    
    public int n;
    public int m;
    
    public int sumaF;
    public int sumaC;
    
    public void Operar() throws IOException
    {
        System.out.print("Ingrese # de filas: ");
        n=Integer.valueOf(tcl.readLine());
        
        System.out.print("Ingrese # de columnas: ");
        m=Integer.valueOf(tcl.readLine());
        
        int M[][]=new int [n][m];
        
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<m;j++)
            {
                System.out.print("Ingrese el # para la posición, "+i+", "+j+": ");
                try
                {
                    M[i][j]=Integer.valueOf(tcl.readLine());
                }
                catch(NumberFormatException e)
                {
                    System.out.println("Dato erróneo.");
                    j--;
                }              
            }
        }
        
        for(int i=0;i<n;i++)
        {
           sumaF=0; 
           for(int j=0;j<m;j++)
           {
               sumaF+=M[i][j];
               System.out.print(M[i][j]+" ");               
           }
            System.out.println("= "+sumaF);
        }
        
        for(int j=0;j<m-1;j++)
        {
            System.out.print("= ");
        }
        System.out.println("= ");
        
        for(int j=0;j<m;j++)
        {
            sumaC=0;
           for(int i=0;i<n;i++)
           {
               sumaC+=M[i][j];
           }
            System.out.print(sumaC+" ");
        }
    }
}