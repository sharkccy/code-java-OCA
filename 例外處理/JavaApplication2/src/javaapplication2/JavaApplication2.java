package javaapplication2;
import java.util.Scanner;

public class JavaApplication2 {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       int m [] = new int [3];
       
        System.out.println(m[5]);   //  發生ArrayIndexOutOfBoundsException例外，程式終止
        
        System.out.println(m[0]);
    }

}
