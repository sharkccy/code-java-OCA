package javaapplication7_2;

import java.util.Scanner;

public class JavaApplication7_2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num[] = {4, 8, 16, 32, 64, 128};
        int data[] = {2, 0, 4, 4, 0, 8};
        try {
            for (int i = 0; i < num.length; i++) {
                System.out.println(num[i] / data[i]);
            }
        } 
        catch (ArithmeticException e) {
            System.out.println("分母不可為零!");
        }
    }
}


