package javaapplication4;
import java.util.Scanner;

public class JavaApplication4 {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       A a = new A();
       //a.go();
       
       B b = new B();
       b.play();
    }

}

class A{
    public void go(){
        System.out.println("go");
        this.go2(); //go2()也可以
    }
    
    public void go2(){
        System.out.println("go2");
    }
}

class B extends A{
    public void play(){
        System.out.println("play");
        super.go2();
    }       
}