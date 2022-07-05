package javaapplication1;

import java.util.Scanner;

public class JavaApplication1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("請輸入數字");
        int a = sc.nextInt();               // nextInt()可以輸入數字
        System.out.println(a);
        
        System.out.println("請輸入小數");    // nextDouble()可以輸入小數
        double b = sc.nextDouble();
        System.out.println(b);
        
        System.out.println("請輸入字串");     // next()可以輸入字串
        String c = sc.next();
        System.out.println(c);
    }
}
