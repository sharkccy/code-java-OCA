package javaapplication3;
import java.util.Scanner;

public class JavaApplication3 {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);

    }

}

class A{
    public void go(){  // 實例方法
        System.out.println("go");
        
        to();          // 實例方法可以呼叫實例方法
        play();        // 實例方法也可以呼叫類別方法
    }
    public void to(){
        System.out.println("to");
    }
    public void play(){
        System.out.println("play");
    }
}
