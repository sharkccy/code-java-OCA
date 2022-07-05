package javaapplication2;

public class JavaApplication2 {
    public static void main(String[] args) {
       float a = 3.5F;    // 單倍精確度浮點數
       double b = 3.5;    // 雙倍精確度浮點數
       
       System.out.println(a / 3);
       System.out.println(b / 3);
       
       float c = 300000.5F;
       double d = 300000.5;
       
       System.out.println(c / 3);
       System.out.println(d / 3);
    }

}
