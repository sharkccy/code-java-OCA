//向下轉型
package javaapplication2;
import java.util.Scanner;

public class JavaApplication2 {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       X m = new Y(); //向上轉型
       ((Y)m).go();   //向下轉型
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
