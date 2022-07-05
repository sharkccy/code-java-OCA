package javaapplication3;
import java.util.Scanner;

public class JavaApplication3 {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       C c1 = new C();
       c1.walk();
       c1.run();
       c1.go();
    }

}
class A{
    public void walk(){
        System.out.println("walk");
    }
}

class B extends A{
    public void run(){
        System.out.println("run");
    }
}

class C extends B{
    @Override
    public void walk(){
        System.out.println("walking to the park");
    }
    public void go(){
        System.out.println("go");
    }
}
