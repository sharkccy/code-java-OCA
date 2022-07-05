package javaapplication1;

public class JavaApplication1 {
    public static void main(String[] args) {
        Car c1 = new Car();
       
        new Car();  // 匿名物件
        new Car(); 
    }
}

class Car {
    public Car(){
        System.out.println("跑跑卡丁車");
    }
}