/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package letraa;

/**
 *
 * @author Lore
 */
public class A 
{
      public String[][] matA= new String[5][5];
    public void llenar()
    {
        for (int i=0;i<5;i++)
        {
            for(int j=0;j<5;j++)
            {
               matA[i][j]="*";
            }
        }
    }
    public void mostrarA()
    {
        for (int i=0;i<5;i++)
        {
            for(int j=0;j<5;j++)
            {
               if(i==2 || i==0 || j==4|| j==0)
               {
                   System.out.print(matA[i][j]);
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
