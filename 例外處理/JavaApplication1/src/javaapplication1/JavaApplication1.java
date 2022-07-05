package javaapplication1;
import java.util.Scanner;

public class JavaApplication1 {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
        System.out.println(5 / 0);  //發生ArithmeticException例外，程式終止
        
        System.out.println("Hi");
    }

}
