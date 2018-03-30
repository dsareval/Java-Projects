/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package letrae;

/**
 *
 * @author Lore
 */
public class E 
{
    public String[][] matE= new String[5][5];
    public void llenar()
    {
        for (int i=0;i<5;i++)
        {
            for(int j=0;j<5;j++)
            {
               matE[i][j]="*";
            }
        }
    }
    public void mostrarE()
    {
        for (int i=0;i<5;i++)
        {
            for(int j=0;j<5;j++)
            {
               if(i==0 || i==4 ||i==2 || j==0 )
               {
                   System.out.print(matE[i][j]);
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
