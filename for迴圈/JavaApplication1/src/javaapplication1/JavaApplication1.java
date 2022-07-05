package javaapplication1;

public class JavaApplication1 {

    public static void main(String[] args) {
        int i;
        for (i = 1; i <= 10; i++) {
            System.out.print(i + " ");
        }
        System.out.println(" ");
        for (i = 1; i <= 10; i+=2) {
            System.out.print(i + " ");
        }
        System.out.println(" ");
        for (i = 10; i >= 0; i--) {
            System.out.print(i + " ");
        }
        System.out.println(" ");
        System.out.println(" ");
        for (i = 3; i <= 200; i*=3) {
            System.out.print(i + " ");
        }
        System.out.println(" ");
    }

}
