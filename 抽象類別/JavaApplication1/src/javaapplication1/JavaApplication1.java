package javaapplication1;

import java.util.Scanner;

public class JavaApplication1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //Car c = new Car(); 錯，抽象類別不能產生物件
        Benz AMG = new Benz();
        AMG.go();
        AMG.abs();
    }

}

abstract class Car { // 抽象類別

    public void go() {
    }// 一般方法

    public abstract void abs();// 抽象方法
}

class Benz extends Car {

    @Override
    public void abs() {

    }
}
