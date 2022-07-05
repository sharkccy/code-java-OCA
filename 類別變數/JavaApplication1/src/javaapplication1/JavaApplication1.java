package javaapplication1;

public class JavaApplication1 {
    public static void main(String[] args) {
        A a = new A();
        a.sh();
        a.sh2();
        a.sh3();
    }
}

class A {
    int n = 3; // 全域變數
    
    public void sh(){
        int n = 5;  // 區域變數
        System.out.println("in sh(), n = " + n);
    }
    
    public void sh2(){
        n += 7;  // 將全域變數n的值+7
    }
    
    public void sh3(){
        System.out.println("in sh3(), n = " + n);
    }
            
}