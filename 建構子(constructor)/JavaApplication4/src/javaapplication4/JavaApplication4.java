package javaapplication4;

public class JavaApplication4 {
    public static void main(String[] args) {
        A a1 = new A();
        a1.A();  // 要使用 物件.方法() 來執行
    }

}

class A {
    public A(){ // 建構子
        System.out.println("A");
    }
    
    public void A(){ // 方法 (不是建構子)
        System.out.println("Go");
    }
}