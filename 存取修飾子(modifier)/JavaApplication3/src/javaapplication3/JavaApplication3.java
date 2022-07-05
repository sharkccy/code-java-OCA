package javaapplication3;
import java.util.Scanner;
import pkA.B;

public class JavaApplication3 {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       A.go();
       B b = new B();
       //b.go();錯
    }

}
class A{
    static void go(){   // 沒有加存取修飾子，只有在相同package內可存取
        System.out.println("go shopping");
    }
}