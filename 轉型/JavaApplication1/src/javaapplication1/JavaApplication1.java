//向上轉型
package javaapplication1;

import java.util.Scanner;

public class JavaApplication1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        X m = new Y();  // 向上轉型        
        System.out.println(m.getClass());
        // m屬於類別Y，但是有向上轉型成類別X
        m.sh();     // 可以執行從父類別繼承下來、或是改寫的方法
        //m.go();錯，不能執行子類別新增的方法
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
