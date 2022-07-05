package javaapplication3;

import java.util.Scanner;

public class JavaApplication3 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("請輸入整數：");
        int n = sc.nextInt();
        System.out.println(n * n);

        // 若輸入小數或是字元(串)，會發生InputMismatchException錯誤
    }

}
