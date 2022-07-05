package javaapplication4;

import java.util.Scanner;
import pkA.A;

public class JavaApplication4 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        A x = new A();
        x.a = 2;
//       x.b = 3 ; 錯
//       x.c = 4 ; 錯
//       x.d = 5 ; 錯
    }

}

class B extends A {

    public void set() {
        this.a = 6;
        //this.b = 7; 錯
        this.c = 6; // 可以存取宣告成protected的變數，因為有父子類別關係，即使位在不同的package
        //this.d = 8; 錯
    }
}
