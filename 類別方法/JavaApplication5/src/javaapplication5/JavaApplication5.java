package javaapplication5;

public class JavaApplication5 {
    public static void main(String[] args) {
        A a1 = new A();
        A a2 = new A();
    }

}

class A {
    public A(){ // 建構子
        System.out.println("A called");
    }
    
    static { // 比建構子更早被呼叫，而且只呼叫一次
        System.out.println("static called");
    }
}


/*
static 位置：
1. static int no = 3;   類別變數
2. static void go(){}  類別方法
3. static class{}
4. 放在類別內，如此例(稱為：static區塊)

*/