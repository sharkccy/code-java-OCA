package javaapplication3;
import java.util.Scanner;

public class JavaApplication3 {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       Y m1 = new Y();
       X m2 = m1; 
       System.out.println(m2.getClass());
       // m2參照到m1。等同於m2向上轉型成X
       m2.sh();
       ((Y)m2).go();
    }

}
class X {

    public void sh() {
        System.out.println("X");
    }
}

class Y extends X {

    public void sh() {      //改寫
        System.out.println("Y");
    }
    
    public void go() {      
        System.out.println("YY");
    }
}
