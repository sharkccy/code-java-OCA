package javaapplication2;

public class JavaApplication2 {
    public static void main(String[] args) {
        Worker w2 = new Worker();
        w2.id = 200;
        w2.name = "Bear";
        w2.level = 2;
        w2.day = 21;
        w2.info();
        w2.pay();
        
        Worker w3 = new Worker();
        w3.id = 300;
        w3.name = "Bob";
        w3.level = 1;
        w3.day = 23;
        w3.info();
        w3.pay(4500);
    }

}
