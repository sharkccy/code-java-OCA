/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;

/**
 *
 * @author FH
 */
public class JavaApplication1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {        
        System.out.println("5 + 3 = " + 5 + 3);
        System.out.println("5 + 3 = " + (5 + 3));
        System.out.println("5 * 3 = " + 5 * 3);
        
        System.out.printf("5 + 3 = %d\n", + 5 + 3);   //  %d後面接整數值
        
        System.out.printf("5 / 3 = %f\n", + 5.0 / 3);  //  %f後面接小數
        
        System.out.printf("5 / 3 = %.2f\n", + 5.0 / 3);  //  %.2f表示取到小數第2位
    }
    
}
