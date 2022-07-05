package javaapplication2;

import java.util.Scanner;

public class JavaApplication2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        A a = new A();
        B b = new B();
        C c = new C();
        
        a = b;
        b = c;
        a = c;  // 參照可以跨代

    }

}

class A {
}

class B extends A {
}

class C extends B {
}
