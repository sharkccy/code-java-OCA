package javaapplication3;

public class JavaApplication3 {
    public static void main(String[] args) {
        Benz AMG = new Benz();
    }

}

abstract class Car {
    public Car(){  // 抽象類別的建構子
        System.out.println("Car");
    }    
}


class Benz extends Car {    
    public Benz(){
        System.out.println("Benz");
    }
}

