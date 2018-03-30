/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package letrasmatrices;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author Lore
 */
public class LetrasMatrices 
{
    BufferedReader tcl= new BufferedReader(new InputStreamReader(System.in));
    public String [][] Letra=new String [5][5];
    public int i;
    public int j;
    public char opc;
    
    public void Mostrar() throws IOException
    {
        System.out.println("Seleccione la opción: a)Daniel  b)Tipimon  c)Alfabeto Griego");
        String aux=tcl.readLine();
        opc=aux.charAt(0);
        
        switch(opc)
        {
            case 'a':
                
                for(i=0;i<5;i++)
                {
                    for(j=0;j<5;j++)
                    {
                        if(i==0 && j!=4 || i==4 && j!=4 || j==0 || j==4 && i!=0 && i!=4)
                        {
                            System.out.print("D");
                        }
                        else
                        {
                            System.out.print(" ");
                        }
                    }
                    System.out.println();            
                }
        
                System.out.println("");
        
                for(i=0;i<5;i++)
                {
                    for(j=0;j<5;j++)
                    {
                       if(i==0 && j!=0 && j!=4 || i==2 || j==0 && i!=0 || j==4 && i!=0 )
                       {
                           System.out.print("A");
                       }
                       else
                       {
                       System.out.print(" ");
                       }
                    }
                    System.out.println();            
                }
        
                System.out.println("");
        
                for(i=0;i<5;i++)
                {
                    for(j=0;j<5;j++)
                    {
                        if(i==j|| j==0 || j==4 )
                        {
                            System.out.print("N");
                        }
                        else
                        {
                            System.out.print(" ");
                        }
                    }
                    System.out.println();            
                }
        
                System.out.println("");
        
                for(i=0;i<5;i++)
                {
                    for(j=0;j<5;j++)
                    {
                        if(i==0 || i==4 || j==2 )
                        {
                            System.out.print("I");
                        }
                        else
                        {
                            System.out.print(" ");
                        }   
                    }
                    System.out.println();            
                }
        
                System.out.println("");
        
                for(i=0;i<5;i++)
                {
                    for(j=0;j<5;j++)
                    {
                        if(i==0 || i==2 || i==4 || j==0 )
                        {
                            System.out.print("E");
                        }
                        else
                        {
                            System.out.print(" ");
                        }
                    }
                    System.out.println();            
                }
        
                System.out.println("");
        
                for(i=0;i<5;i++)
                {
                    for(j=0;j<5;j++)
                    {
                        if(i==4 || j==0)
                        {
                            System.out.print("L");
                        }
                        else
                        {
                            System.out.print(" ");
                        }
                    }
                    System.out.println();            
                }
                break;
                
            case 'b':
                
                for(i=0;i<5;i++)
                {
                    for(j=0;j<5;j++)
                    {
                        if(i==0 || j==2)
                        {
                            System.out.print("T");
                        }
                        else
                        {
                            System.out.print(" ");
                        }
                    }
                    System.out.println();            
                }
        
                System.out.println("");
        
                for(i=0;i<5;i++)
                {
                    for(j=0;j<5;j++)
                    {
                       if(i==0 || i==4 || j==2)
                       {
                           System.out.print("I");
                       }
                       else
                       {
                       System.out.print(" ");
                       }
                    }
                    System.out.println();            
                }
        
                System.out.println("");
        
                for(i=0;i<5;i++)
                {
                    for(j=0;j<5;j++)
                    {
                        if(i==0 && j!=4 || i==2 && j!=4 || j==0 || j==4 && i==1 )
                        {
                            System.out.print("P");
                        }
                        else
                        {   
                            System.out.print(" ");
                        }
                    }
                    System.out.println();            
                }
        
                System.out.println("");
        
                for(i=0;i<5;i++)
                {
                    for(j=0;j<5;j++)
                    {
                        if(i==0 || i==4 || j==2 )
                        {
                            System.out.print("I");
                        }
                        else
                        {
                            System.out.print(" ");
                        }   
                    }
                    System.out.println();            
                }
        
                System.out.println("");
        
                for(i=0;i<5;i++)
                {
                    for(j=0;j<5;j++)
                    {
                        if(j==0 || j==4 || i==j && j<3 || i==4-j && j>2 )
                        {
                            System.out.print("M");
                        }
                        else
                        {
                            System.out.print(" ");
                        }
                    }
                    System.out.println();            
                }
        
                System.out.println("");
        
                for(i=0;i<5;i++)
                {
                    for(j=0;j<5;j++)
                    {
                        if(i==0 && j!= 0 && j!=4 || i==4 && j!= 0 && j!=4 || j==0 && i!= 0 && i!=4 || j==4 && i!= 0 && i!=4)
                        {
                            System.out.print("O");
                        }
                        else
                        {
                            System.out.print(" ");
                        }
                    }
                    System.out.println();            
                }
                
                System.out.println("");
                
                for(i=0;i<5;i++)
                {
                    for(j=0;j<5;j++)
                    {
                        if(i==j|| j==0 || j==4 )
                        {
                            System.out.print("N");
                        }
                        else
                        {
                            System.out.print(" ");
                        }
                    }
                    System.out.println();            
                }
                break;
                
            case 'c':
                for(i=0;i<5;i++)
                {
                    for(j=0;j<5;j++)
                    {
                       if(i==0 && j!=0 && j!=4 || i==2 || j==0 && i!=0 || j==4 && i!=0 )
                       {
                           System.out.print("A");
                       }
                       else
                       {
                       System.out.print(" ");
                       }
                    }
                    System.out.println();            
                }
                
                System.out.println("");                
                
                for(i=0;i<5;i++)
                {
                    for(j=0;j<5;j++)
                    {
                       if(i==0  && j!=4 || i==2 && j!=4 || i==4 && j!=4 || j==0 || j==4 && i!=0 && i!=2 && i!=4)
                       {
                           System.out.print("B");
                       }
                       else
                       {
                       System.out.print(" ");
                       }
                    }
                    System.out.println();            
                }
                
                System.out.println("");
                
                for(i=0;i<5;i++)
                {
                    for(j=0;j<5;j++)
                    {
                        if(i==0|| j==0 )
                        {
                            System.out.print("Γ");
                        }
                        else
                        {
                            System.out.print(" ");
                        }
                    }
                    System.out.println();            
                }
                
                System.out.println("");
                
                for(i=0;i<5;i++)
                {
                    for(j=0;j<5;j++)
                    {
                        if(i==2-j && j<3|| i==j-2 && j>2|| i==2 )
                        {
                            System.out.print("Δ");
                        }
                        else
                        {
                            System.out.print(" ");
                        }
                    }
                    System.out.println();            
                }
                
                System.out.println("");
                
                for(i=0;i<5;i++)
                {
                    for(j=0;j<5;j++)
                    {
                        if(i==0 || i==2 || i==4 || j==0 )
                        {
                            System.out.print("E");
                        }
                        else
                        {
                            System.out.print(" ");
                        }
                    }
                    System.out.println();            
                }
                
                System.out.println("");
                
                for(i=0;i<5;i++)
                {
                    for(j=0;j<5;j++)
                    {
                        if(i==0 || i==4 || i==4-j )
                        {
                            System.out.print("Z");
                        }
                        else
                        {
                            System.out.print(" ");
                        }
                    }
                    System.out.println();            
                }
                
                System.out.println("");
                
                for(i=0;i<5;i++)
                {
                    for(j=0;j<5;j++)
                    {
                        if(j==0 || j==4 || i==2 )
                        {
                            System.out.print("H");
                        }
                        else
                        {
                            System.out.print(" ");
                        }
                    }
                    System.out.println();            
                }
                
                System.out.println("");
                
                for(i=0;i<5;i++)
                {
                    for(j=0;j<5;j++)
                    {
                        if(i==0 && j!= 0 && j!=4 || i==4 && j!= 0 && j!=4 || j==0 && i!= 0 && i!=4 || j==4 && i!= 0 && i!=4 || i==2)
                        {
                            System.out.print("Θ");
                        }
                        else
                        {
                            System.out.print(" ");
                        }
                    }
                    System.out.println();            
                }
                
                System.out.println("");
                
                for(i=0;i<5;i++)
                {
                    for(j=0;j<5;j++)
                    {
                        if(i==0 || i==4 || j==2 )
                        {
                            System.out.print("I");
                        }
                        else
                        {
                            System.out.print(" ");
                        }   
                    }
                    System.out.println();            
                }
                
                System.out.println("");
                
                for(i=0;i<5;i++)
                {
                    for(j=0;j<5;j++)
                    {
                        if(j==0 || i-1==2-j || i+1==j+2 )
                        {
                            System.out.print("K");
                        }
                        else
                        {
                            System.out.print(" ");
                        }   
                    }
                    System.out.println();            
                }
                
                System.out.println("");
                
                for(i=0;i<5;i++)
                {
                    for(j=0;j<5;j++)
                    {
                        if(i==2-j && j<3|| i==j-2 && j>2)
                        {
                            System.out.print("Λ");
                        }
                        else
                        {
                            System.out.print(" ");
                        }
                    }
                    System.out.println();            
                }
                
                System.out.println("");
                
                for(i=0;i<5;i++)
                {
                    for(j=0;j<5;j++)
                    {
                        if(j==0 || j==4 || i==j && j<3 || i==4-j && j>2 )
                        {
                            System.out.print("M");
                        }
                        else
                        {
                            System.out.print(" ");
                        }
                    }
                    System.out.println();            
                }
                
                System.out.println("");
                
                for(i=0;i<5;i++)
                {
                    for(j=0;j<5;j++)
                    {
                        if(i==j|| j==0 || j==4 )
                        {
                            System.out.print("N");
                        }
                        else
                        {
                            System.out.print(" ");
                        }
                    }
                    System.out.println();            
                }
                
                System.out.println("");
                
                for(i=0;i<5;i++)
                {
                    for(j=0;j<5;j++)
                    {
                        if(i==0 || i==2 && j!=0 && j!=4 || i==4 )
                        {
                            System.out.print("Ξ");
                        }
                        else
                        {
                            System.out.print(" ");
                        }
                    }
                    System.out.println();            
                }
                
                System.out.println("");
                
                for(i=0;i<5;i++)
                {
                    for(j=0;j<5;j++)
                    {
                        if(i==0 && j!= 0 && j!=4 || i==4 && j!= 0 && j!=4 || j==0 && i!= 0 && i!=4 || j==4 && i!= 0 && i!=4)
                        {
                            System.out.print("O");
                        }
                        else
                        {
                            System.out.print(" ");
                        }
                    }
                    System.out.println();            
                }
                
                System.out.println("");
                
                for(i=0;i<5;i++)
                {
                    for(j=0;j<5;j++)
                    {
                        if(i==0|| j==0 || j==4)
                        {
                            System.out.print("Π");
                        }
                        else
                        {
                            System.out.print(" ");
                        }
                    }
                    System.out.println();            
                }
                
                System.out.println("");
                
                for(i=0;i<5;i++)
                {
                    for(j=0;j<5;j++)
                    {
                        if(i==0 && j!=4 || i==2 && j!=4 || j==0 || j==4 && i==1 )
                        {
                            System.out.print("P");
                        }
                        else
                        {   
                            System.out.print(" ");
                        }
                    }
                    System.out.println();            
                }
                
                System.out.println("");
                
                for(i=0;i<5;i++)
                {
                    for(j=0;j<5;j++)
                    {
                        if(i==0 || i==j && j<3 || i==4 || i==4-j && j <3)
                        {
                            System.out.print("Σ");
                        }
                        else
                        {
                            System.out.print(" ");
                        }
                    }
                    System.out.println();            
                }
                
                System.out.println("");
                
                for(i=0;i<5;i++)
                {
                    for(j=0;j<5;j++)
                    {
                        if(i==0 || j==2)
                        {
                            System.out.print("T");
                        }
                        else
                        {
                            System.out.print(" ");
                        }
                    }
                    System.out.println();            
                }
                
                System.out.println("");
                
                for(i=0;i<5;i++)
                {
                    for(j=0;j<5;j++)
                    {
                        if(i==j && j<3 || i==4-j && j>2 || j==2 && i>2 )
                        {
                            System.out.print("Y");
                        }
                        else
                        {
                            System.out.print(" ");
                        }
                    }
                    System.out.println();            
                }
                
                System.out.println("");
                
                for(i=0;i<5;i++)
                {
                    for(j=0;j<5;j++)
                    {
                        if(i==1 && j!= 0 && j!=4 || i==3 && j!= 0 && j!=4 || j==0 && i==2 || j==4 && i==2 || j==2)
                        {
                            System.out.print("Φ");
                        }
                        else
                        {
                            System.out.print(" ");
                        }
                    }
                    System.out.println();            
                }
                
                System.out.println("");
                
                for(i=0;i<5;i++)
                {
                    for(j=0;j<5;j++)
                    {
                        if(i==j  || i==4-j)
                        {
                            System.out.print("X");
                        }
                        else
                        {
                            System.out.print(" ");
                        }
                    }
                    System.out.println();            
                }
                
                System.out.println("");
                
                for(i=0;i<5;i++)
                {
                    for(j=0;j<5;j++)
                    {
                        if(i==2 && j!= 0 && j!=4 || j==0 && i<2 || j==4 && i<2 || j==2)
                        {
                            System.out.print("Ψ");
                        }
                        else
                        {
                            System.out.print(" ");
                        }
                    }
                    System.out.println();            
                }
                
                System.out.println("");
                
                for(i=0;i<5;i++)
                {
                    for(j=0;j<5;j++)
                    {
                        if(i==0 && j!= 0 && j!=4 || i==3 && j!= 0 && j!=4 && j!=2 || i==4 && j!=2 || j==0 && i!= 0 && i<3 || j==4 && i!= 0 && i<3)
                        {
                            System.out.print("Ω");
                        }
                        else
                        {
                            System.out.print(" ");
                        }
                    }
                    System.out.println();            
                }
            
                for(i=0;i<5;i++)
                {
                    for(j=0;j<5;j++)
                    {
                        if(i==2-j || j==2+i  || i==2+j || j==6-i )
                        {
                            System.out.print("♦");
                        }
                        else
                        {
                            System.out.print(" ");
                        }
                    }
                    System.out.println();            
                }

        }
        
    }
}
