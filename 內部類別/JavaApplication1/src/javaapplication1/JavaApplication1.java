package javaapplication1;
import java.util.Scanner;

public class JavaApplication1 {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       A.In i = new A().new In();
       i.show();
    }

}

class A{
    class In{               // 內部類別(Inner class)
        public void show(){
            System.out.println("In called");
        }
    }
}