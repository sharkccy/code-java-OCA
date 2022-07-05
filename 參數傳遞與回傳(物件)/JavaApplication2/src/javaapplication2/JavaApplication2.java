package javaapplication2;
import java.util.Scanner;

public class JavaApplication2 {
    public static void main(String[] args) {
       Car c1 = new Car("Lexus", 220);
        Car c2 = new Car("Honda", 90);
        System.out.println(c1.diff(c2));
    }
    
}

class Car {

    String brand;
    int price;
    
    public Car(String brand, int price) {
        this.brand = brand;
        this.price = price;
    }
    
    public String toString(){
        return this.brand;
    }
    
    public Car diff(Car c) {             // 請注意，回傳Car，實際是要回傳Car所產生的物件
        if (this.price > c.price) {     
           return this ;
        } 
        else {
            return c ;
        }
    }
}
