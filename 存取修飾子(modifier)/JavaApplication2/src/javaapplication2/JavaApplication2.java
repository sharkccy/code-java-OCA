package javaapplication2;
import java.util.Scanner;

public class JavaApplication2 {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       A a = new A();
       a.go();
       a.n = 2;
       //a.m = 6; 錯
       //a.to(); 錯
    }

}
class A{
    public int n = 1;
    private int m = 6;
    public void go(){
        System.out.println("go");
        
        to();
    }
    private void to(){  // 宣告成private表示只有在同一個類別內可以存取
        System.out.println("to");
    }
}