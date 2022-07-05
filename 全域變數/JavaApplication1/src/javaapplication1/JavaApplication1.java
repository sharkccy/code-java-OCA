package javaapplication1;

public class JavaApplication1 {
    public static void main(String[] args) {
        Test t = new Test();
        t.go();
    }

}

class Test {  // 全域變數：宣告在類別內，有初始值
    int a;    
    float b;
    char c;
    String d;
    
    public void go(){
        int x = 1;  // 區域變數， 宣告在方法內，必須要設定初始值
        System.out.println("x = " + x);
        
        System.out.println("int：" + a);
        System.out.println("float：" + b);
        System.out.println("char：" + c);
        System.out.println("String：" + d);
    }
}