package javaapplication5;
import java.util.Scanner;

public class JavaApplication5 {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       A a = new B();   // 向上轉型
       a.in();
       ((B)a).out();    // 向下轉型
    }

}
interface A{
    int no = 5; // 介面內的變數要有初始值，而且預設宣告成final
    public void in();
}

class B implements A{
    public void in(){}
    
    public void out(){}
}