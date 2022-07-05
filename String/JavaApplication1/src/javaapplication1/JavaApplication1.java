package javaapplication1;
import java.util.Scanner;

public class JavaApplication1 {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       String s1 = "a";
       String s2 = "a";
       System.out.println(s1.compareTo(s2));
       
       String s3 = "ad";
       String s4 = "ab";
       System.out.println(s3.compareTo(s4));
       
       String s5 = "abfe";
       String s6 = "abgk";
       System.out.println(s5.compareTo(s6));
    }
}
