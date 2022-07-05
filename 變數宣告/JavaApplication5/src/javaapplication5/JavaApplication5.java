package javaapplication5;

public class JavaApplication5 {
    public static void main(String[] args) {
       int a = 1_000_000_000;  //底線不可放在頭跟尾
       
       int b = 0b101_010_001;   // 0b開頭表示2進位
       System.out.println(a);    // 2進位的值輸出時仍會轉成10進位
       
       int c = 0167;            // 0開頭表示8進位
       System.out.println(c);
        
       int d =0x1A2F;           // 0x開頭表示16進位
       System.out.println(d);
               
    }
}
