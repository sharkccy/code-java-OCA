package pk1;

import pk2.M;

public class JavaApplication1 {
    public static void main(String[] args) {
        B b = new B();  // 類別B與JavaApplication1是在同一個package，可以直接存取
        b.play();
        
        M m = new M();  // 類別M是在pk2，必須要import才可以使用 
    }
}

/*
import 方法
1. 明確指定要import哪個package內的類別，ex：import pk2.M;
2. import pk2.*;此寫法會匯入pk2內所有的類別，但是不包含子目錄
3. 不使用import，ex：pk2.M m = new pk2.M();
*/