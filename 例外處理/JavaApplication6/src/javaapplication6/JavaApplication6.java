package javaapplication6;

import java.util.InputMismatchException;
import java.util.Scanner;

public class JavaApplication6 {

    public static void main(String[] args) {
        try {
            Scanner sc = new Scanner(System.in);
            System.out.println("請輸入非0的整數：");
            int n = sc.nextInt();
            System.out.println(5 / n);
        }                
        catch (ArithmeticException | InputMismatchException e) {
            System.out.println("輸入格式錯誤!!");
        }
        // multi-catch：左右的例外類別不可以是父子關係
    }

}
