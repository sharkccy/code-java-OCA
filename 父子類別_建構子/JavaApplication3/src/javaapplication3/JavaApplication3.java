package javaapplication3;
import java.util.Scanner;

public class JavaApplication3 {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);

    }

}
class M{
    M(){}   // 注意此行，因為子類別執行super()來呼叫父類別的預設建構子
    public M(int a){            // 建構子多載
        System.out.println("MM");
    }
}

class N extends M{
    public N(){       
        System.out.println("N");
    }
}
