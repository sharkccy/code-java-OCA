package javaapplication2;
import java.util.Scanner;

public class JavaApplication2 {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
        N n = new N();
    }

}

class M{
    public M(){
        System.out.println("M");
    }
    
    public M(int a){    // 建構子多載
        System.out.println("MM");
    }
}

class N extends M{
    public N(){
        super(2);       // 呼叫父類別的建構子
        System.out.println("N");
    }
}