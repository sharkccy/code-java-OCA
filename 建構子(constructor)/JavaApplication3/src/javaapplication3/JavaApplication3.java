package javaapplication3;

public class JavaApplication3 {
    public static void main(String[] args) {
        A a1 = new A();
        //A a2 = new A(1);
        //A a3 = new A(1.5);
    }
}

class A {
    public A(){  // 預設建構子(default constructor)
        this(1.5);  // this()指的是類別A的建構子，要放在建構子的第1列
        System.out.println("A");
    }
    
    public A(int n){   
        System.out.println("AA");
    }
    
    public A(double n){          
        System.out.println("AAA");
    }
}