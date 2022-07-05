package javaapplication4;

public class JavaApplication4 {
    public static void main(String[] args) {

    }

}

class  T {
    public static void go(){  // 類別方法
        System.out.println("go");  
        
        to();  // 類別方法可以呼叫類別方法
        // play(); 錯，類別方法不可以呼叫實例方法
    }
    
     public static void to(){  // 類別方法
        System.out.println("to");
    }
    
    public void play(){  // 實例方法
        System.out.println("play");
    }
}