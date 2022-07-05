package javaapplication5;
import java.util.Scanner;

public class JavaApplication5 {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       Car b = new Benz(); //向上轉型
       b.go();
       b.abs();
       ((Benz)b).run(); // 向下轉型
    }

}
abstract class Car{
    public void go(){}
   public abstract void abs();
}

class Benz extends Car{
    @Override
    public void abs(){}
    
    public void run(){}
}