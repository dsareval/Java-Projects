/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package letral;

/**
 *
 * @author Lore
 */
public class L 
{
     public String[][] matL= new String[5][5];
    public void llenar()
    {
        for (int i=0;i<5;i++)
        {
            for(int j=0;j<5;j++)
            {
               matL[i][j]="*";
            }
        }
    }
    public void mostrarL()
    {
        for (int i=0;i<5;i++)
        {
            for(int j=0;j<5;j++)
            {
               if(i==4 || j==0)
               {
                   System.out.print(matL[i][j]);
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
