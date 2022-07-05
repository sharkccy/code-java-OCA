package javaapplication4;
import java.util.Scanner;

public class JavaApplication4 {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
        //Car c = new Car(); 錯，抽象類別不能產生物件
        Benz AMG = new AMG();
        AMG.go();
        AMG.abs();
    }

}

abstract class Car { // 抽象類別

    public void go() {
    }// 一般方法

    public abstract void abs();// 抽象方法
}

 abstract class Benz extends Car {// 抽象子類別 
     public void abs(){}
 }    

class AMG extends Benz {}