package javaapplication1;

public class JavaApplication1 {
    public static void main(String[] args) {
        String s = "HelloWorld";
        
        System.out.println(s.length());
        
        System.out.println(s.charAt(0)); // 取出字串第1個字元
        
        System.out.println(s.substring(3));  // 取出s字串第4個字元(含)之後的子字串
        
        System.out.println(s.substring(5, 8)); // 取出s字串第6個字元(含)後面的3個字
    }

}
