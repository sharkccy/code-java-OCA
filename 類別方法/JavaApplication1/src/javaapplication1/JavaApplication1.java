package javaapplication1;
import java.util.Scanner;

public class JavaApplication1 {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       A a1 = new A();
       a1.go();
       A.play();
    }

}
class A{
    public void go(){               // 實例方法。要透過物件來呼叫
        System.out.println("go");
    }
    
    public static void play(){      // 類別方法。可以使用：類別.方法()來呼叫
        System.out.println("play game");
    }
}