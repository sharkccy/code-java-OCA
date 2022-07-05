package javaapplication3;

public class JavaApplication3 {
    public static void main(String[] args) {
        A a1 = new A();
        A a2 = new A();
        
        System.out.println(a1.n);
        a2.n = 3;
        System.out.println(a1.n);
    }

}


class A {
    static int n = 5;  // 類別變數
}