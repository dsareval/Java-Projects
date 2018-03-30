/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package fibonacci;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 *
 * @author Lore
 */
public class Fibonacci
{
    public int num;
    public int num2;
    public int num3;
    BufferedReader tcl=new BufferedReader(new InputStreamReader(System.in));
    
    public void escribir()
    {
        num=0;
        num2=1;
        System.out.println("0");
        System.out.println("1");
        while (num3<=100)
        {
        num3=num+num2;
        num=num2;
        num2=num3;
        System.out.println(num3);
        }
    }
}