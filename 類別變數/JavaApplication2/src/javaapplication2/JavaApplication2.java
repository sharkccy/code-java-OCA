package javaapplication2;

public class JavaApplication2 {
    public static void main(String[] args) {
        A a1 = new A();
        System.out.println(a1.n);
                
        A a2 = new A();
        a2.n = 8;
        System.out.println(a2.n);
    }

}

class A {
    int n = 5; // 全域變數
   
}