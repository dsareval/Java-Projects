/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Main;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 *
 * @author Lore
 */
public class Eddy 

{
    BufferedReader tcl=new BufferedReader(new InputStreamReader(System.in));
    
    public int num1;

    public void setear ()
    {
    num1=0;
    
    while (num1<=100)
    {
        System.out.print(num1+ " , ");
        num1++;
    }
  }       
}
