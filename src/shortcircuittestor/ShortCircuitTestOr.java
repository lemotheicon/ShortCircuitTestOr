/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package shortcircuittestor;

/**
 *
 * @author Omolemo
 */
public class ShortCircuitTestOr {

    
    public static void main(String[] args) {
        if(trueMethod() || falseMethod())
            System.out.println("Both are true");
        else
            System.out.println("Both are not true");
    }
    public static boolean trueMethod()
            {
                System.out.println("Within trueMethod()");
                return true;
            }
    public static boolean falseMethod()
            {
                System.out.println("Within falseMethod()");
                return false;
            }
}
