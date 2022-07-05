package javaapplication_數字交換2;

public class JavaApplication_數字交換2 {
    public static void main(String[] args) {
       int a = 4, b = 8;
       
       a = a ^ b;
       b = a ^ b;
       a = a ^ b;
       
       System.out.println("a = " + a + ", b = " + b);
    }

}