package javaapplication1;

public class JavaApplication1 {

    public static void main(String[] args) {
        A a = new A();
        B b = new B();        
        System.out.println(a.getClass());  // getClass()可以回傳物件所屬類別
        
        a = b;  // a 參照到 b       
        System.out.println(a.getClass());
        a.go();    // a 會執行類別 B 改寫的方法   
        //a.play => 錯，a 不可執行類別 B 新增的方法
    }
}

class A {
    public void go(){
        System.out.println("go");
    }
}

class B extends A {
    public void go(){
        System.out.println("goto");
    }
    public void play(){
        System.out.println("play game");
    }
}
