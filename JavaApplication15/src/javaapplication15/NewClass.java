/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication15;

/**
 *
 * @author Lore
 */
public class NewClass 
{
    public double num1;
    public double exp;
    public double resp;
    
    public void proceso()
    {
        num1=3;
        exp=2;
        resp=Math.pow(num1, exp);
        System.out.println(num1+" elevado a la "+exp+"="+resp);
    }
}
