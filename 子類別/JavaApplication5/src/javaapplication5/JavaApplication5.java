package javaapplication5;

public class JavaApplication5 {
    public static void main(String[] args) {

    }

}

class M {
    final int a = 5;  // 變數宣告成final => 常數(值不可更改)
    
    public void set(){
         //a += 2;  錯，不能更改常數的值      
        System.out.println(a);
    }
    
    final public void go(){  // 方法宣告成final => 禁止被子類別改寫
        System.out.println("Go");
    }
}

class N extends M {
    //public void go(){  }  // 不可改寫      
}

final class A {}   // 類別宣告成final => 禁止被繼承(沒有子類別)

// class B extends A {} 錯