package javaapplication1;


public class JavaApplication1 {
    public static void main(String[] args) {
        Worker w1; 
        w1 = new Worker();    // w1是根據類別Worker產生的物件
        w1.id = 7;
        w1.name = "Nick";
        w1.level = 4;
        w1.info();
        
        Worker w2 = new Worker();
      
    }

}

class Worker {
    int id;
    String name;
    int level;
    int day = 22;
    
    public void info(){
        System.out.println(name + " 您好，您的職等為：" + level);
    }
}