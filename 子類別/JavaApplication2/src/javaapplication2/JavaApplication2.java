package javaapplication2;

public class JavaApplication2 {
    public static void main(String[] args) {
        Std s1 = new Std();
        s1.go();
        
        Friend fr1 = new Friend();
        fr1.go();
    }

}

class Std {
    public void go(){
        System.out.println("Go to school");
    }
}

class Friend extends Std { // 方法的名稱、參數、回傳值皆相同
    @Override    // 跟Java編譯器講，以下的方法是要改寫父類別的方法
    public void go(){   // 改寫、複寫 (Overriding)
        System.out.println("Go shopping");
    }
}