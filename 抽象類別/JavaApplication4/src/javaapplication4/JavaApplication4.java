package javaapplication4;
import java.util.Scanner;

public class JavaApplication4 {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);

    }

}

abstract class A{
    public abstract void go();
    
    public abstract void go2();
    
    // public final abstract void go3(); 因為要讓子類別改寫，所以不能宣告成final
}