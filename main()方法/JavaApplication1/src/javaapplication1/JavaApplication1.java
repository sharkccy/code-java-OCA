package javaapplication1;

import java.util.Scanner;

public class JavaApplication1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Hello");
        main("Good");
        main(168);
    }

    public static void main(String s) {
        System.out.println(s);
    }

    public static void main(int n) {
        System.out.println(n);
    }

}
