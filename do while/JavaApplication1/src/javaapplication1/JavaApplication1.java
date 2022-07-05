package javaapplication1;

import java.util.Scanner;

public class JavaApplication1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String account;
        do {
            System.out.println("請輸入帳號 :");
            account = sc.next();

            if (account.length() < 6) {
                System.out.println("帳號長度必須 >= 6!");
            }
        } 
        while (account.length() < 6);

    }

}
