package javaapplication1;
import java.util.Scanner;

public class JavaApplication1 {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       Bird b = new Bird();
       Eagle e = new Eagle();       // 先呼叫父類別的建構子，再呼叫本身的建構子
    }

}

class Bird{
    public Bird(){
        System.out.println("Bird");
    }
}

class Eagle extends Bird{
    public Eagle(){
        System.out.println("Eagle");
    }
}