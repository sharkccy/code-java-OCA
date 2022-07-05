package javaapplication3;

public class JavaApplication3 {
    public static void main(String[] args) {
        Car c = new Car();
        c.tire = 4;
        c.abs = "A class";
        c.go();
    }

}

class Car{
    int tire;
    String abs;
    
    public Car(){
        System.out.println("running");
    }
    public void go(){
        System.out.println("跑跑計程車");
    }
}