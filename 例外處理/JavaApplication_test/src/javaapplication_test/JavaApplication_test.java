package javaapplication_test;

import java.util.InputMismatchException;
import java.util.Scanner;

public class JavaApplication_test {

    public static void main(String[] args) {
        while (true) {
            try {
                Scanner sc = new Scanner(System.in);
                System.out.println("請輸入分期數(整數) :");
                int m = sc.nextInt();
                int pay = 700_00 / m;
                System.out.println("月繳" + pay);
                break;
            } 
            catch (ArithmeticException e1) {
                System.out.println("分期數至少為一期!!");
            } 
            catch (InputMismatchException e2) {
                System.out.println("分期數只能為整數!!");
            }
        }

    }

}
