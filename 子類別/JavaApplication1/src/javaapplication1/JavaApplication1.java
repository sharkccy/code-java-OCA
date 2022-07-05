package javaapplication1;

public class JavaApplication1 {
    public static void main(String[] args) {
        Fish f1 = new Fish();
        f1.swim();        
        
        Shark s1 = new Shark();
        s1.swim(); // 繼承自Fish類別
        s1.jump();
    }

}


class Fish {  // 父類別
    public void swim(){
        System.out.println("Swim");
    }
}

class Shark extends Fish {  // 子類別
    public void jump(){
        System.out.println("Jump");
    }
}