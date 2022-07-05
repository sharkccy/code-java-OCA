package javaapplication1;

import java.util.Scanner;

public class JavaApplication1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Car c1 = new Car("Lexus", 220);
        Car c2 = new Car("Honda", 90);
        c1.diff(c2);
    }
    
}

class Car {

    String brand;
    int price;
    
    public Car(String brand, int price) {
        this.brand = brand;
        this.price = price;
    }
    
    public void diff(Car c) {
        if (this.price > c.price) {     // this指的是呼叫diff()的物件
            System.out.println("Yes");
        } 
        else {
            System.out.println("No");
        }
    }
}
