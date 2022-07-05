package javaapplication2;
import java.util.Scanner;

public class JavaApplication2 {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       JavaApplication2 j = new JavaApplication2();
       j.go();      
       // go();  錯，類別方法只能呼叫類別變數或類別方法
    }
    public void go(){
        System.out.println("來抓寶可夢");
    }
}
