package javaapplication1;
import java.util.Scanner;

public class JavaApplication1 {
    public static void main(String[] args) {
       star();
       pow(3);
       compute(5, 7);
       System.out.println(add(5, 3.5f));
    }
    
    public static void star(){
        System.out.println("************");
    }
    
    public static void pow(int n){
        System.out.println(n * n);
    }
    
    public static void compute(int a, int b){
        System.out.println(a * b);
    }
    
    public static float add(int x, float y){
        return x + y;
    }
}
