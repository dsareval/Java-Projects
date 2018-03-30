/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package nombre_matriz;

/**
 *
 * @author Lore
 */
public class Nombre_matriz 
{
    public char [][] D=new char[5][5];
    public char [][] A=new char[5][5];
    public char [][] N=new char[5][5];
    public char [][] I=new char[5][5];
    public char [][] E=new char[5][5];
    public char [][] L=new char[5][5];
    public int i;
    public int j;
    
    public void llenar()
    {
                for(i=0;i<5;i++)
                {
                    for(j=0;j<5;j++)
                    {
                        if(i==0 && j!=4 || i==4 && j!=4 || j==0 || j==4 && i!=0 && i!=4)
                        {
                            D[i][j]='D';
                        }
                        else
                        {
                            D[i][j]=' ';
                        }
                    }
                }
        
                for(i=0;i<5;i++)
                {
                    for(j=0;j<5;j++)
                    {
                       if(i==0 && j!=0 && j!=4 || i==2 || j==0 && i!=0 || j==4 && i!=0 )
                       {
                           A[i][j]='A';
                       }
                       else
                       {
                           A[i][j]=' ';
                       }
                    }           
                }
        
                for(i=0;i<5;i++)
                {
                    for(j=0;j<5;j++)
                    {
                        if(i==j|| j==0 || j==4 )
                        {
                            N[i][j]='N';
                        }
                        else
                        {
                            N[i][j]=' ';
                        }
                    }         
                }
        
                for(i=0;i<5;i++)
                {
                    for(j=0;j<5;j++)
                    {
                        if(i==0 || i==4 || j==2 )
                        {
                            I[i][j]='I';
                        }
                        else
                        {
                            I[i][j]=' ';
                        }   
                    }         
                }
        
                for(i=0;i<5;i++)
                {
                    for(j=0;j<5;j++)
                    {
                        if(i==0 || i==2 || i==4 || j==0 )
                        {
                            E[i][j]='N';
                        }
                        else
                        {
                            E[i][j]=' ';
                        }
                    }        
                }
        
                for(i=0;i<5;i++)
                {
                    for(j=0;j<5;j++)
                    {
                        if(i==4 || j==0)
                        {
                            L[i][j]='L';
                        }
                        else
                        {
                            L[i][j]=' ';
                        }
                    }           
                }
    }
    
    public void Mostrar()
    {
        for(i=0;i<5;i++)
        {
            for(j=0;j<5;j++)
            {
                System.out.print(D[i][j]);
            }
            
            System.out.print(" ");
            
            for(j=0;j<5;j++)
            {
                System.out.print(A[i][j]);
            }
            System.out.print(" ");
            
            for(j=0;j<5;j++)
            {
                System.out.print(N[i][j]);
            }
            System.out.print(" ");
            
            for(j=0;j<5;j++)
            {
                System.out.print(I[i][j]);
            }
            System.out.print(" ");
            
            for(j=0;j<5;j++)
            {
                System.out.print(E[i][j]);
            }
            System.out.print(" ");
            
            for(j=0;j<5;j++)
            {
                System.out.print(L[i][j]);
            }
            System.out.println(" ");
        }
    }
}
