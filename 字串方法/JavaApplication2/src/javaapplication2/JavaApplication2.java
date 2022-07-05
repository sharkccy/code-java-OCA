package javaapplication2;
import java.util.Scanner;

public class JavaApplication2 {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       String s1 = "Java";
       String s2 = "Java";
       String s3 = new String("Java");
       String s4 = "Jawa";
       
        System.out.println(s1 == s2);
        System.out.println(s1 == s3);
        
        
        System.out.println(s1.equals(s4));   //回傳布林值
        System.out.println(s1.equals(s3));
        
        System.out.println(s1.compareTo(s4)); //回傳整數，0表示相同
        System.out.println(s1.compareTo(s3));
    }

}
