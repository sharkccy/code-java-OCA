package javaapplication2;

public class JavaApplication2 {
    public static void main(String[] args) {
        Std s1 = new Std(11, "Amy", "Accounting", "amy@gmail.com");
    }

}


class Std {
    int id;
    String name;
    String major;
    String email;

    // 按右鍵，insert Code / Constructor / Select All
    public Std(int id, String name, String major, String email) {
        this.id = id;
        this.name = name;
        this.major = major;
        this.email = email;
    }
    
    
}