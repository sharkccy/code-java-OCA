package javaapplication1;

import java.util.Scanner;

public class JavaApplication1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("請連續輸入3個數字：");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int tmp = a > b ? a : b;
        System.out.println(tmp > c ?tmp : c);
    }
}
