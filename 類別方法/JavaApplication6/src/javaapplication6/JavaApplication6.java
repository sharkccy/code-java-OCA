package javaapplication6;

public class JavaApplication6 {
    public static void main(String[] args) {
        B b = new B();
        b.play();
    }

}

class A {
    public static void play(){
    }  // 類別方法
}

class B extends A { // 子類別
    public void play(){  // 錯，禁止被改寫
        System.out.println("play");
    }  // 類別方法
}