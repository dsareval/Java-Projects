/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package letra.t;

/**
 *
 * @author Lore
 */
public class T 
{
           public String[][] matT= new String[5][5];
    public void llenar()
    {
        for (int i=0;i<5;i++)
        {
            for(int j=0;j<5;j++)
            {
               matT[i][j]="*";
            }
        }
    }
    public void mostrarT()
    {
        for (int i=0;i<5;i++)
        {
            for(int j=0;j<5;j++)
            {
               if(i==4 || i==0 || j==2)
               {
                   System.out.print(matT[i][j]);
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
