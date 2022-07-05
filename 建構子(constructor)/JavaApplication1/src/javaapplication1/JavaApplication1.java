package javaapplication1;

public class JavaApplication1 {
    public static void main(String[] args) {
        W w1 = new W();      
        
        W w2;  // 只有宣告物件，沒有使用new產生，所以建構子不會被呼叫
        
    }

}

class W {
    public W(){ // 建構子
        System.out.println("Hello");
    }
}

/*
1. 建構子的名稱與類別相同
2. 不要加 void
3. 產生物件時會自動被呼叫
*/
