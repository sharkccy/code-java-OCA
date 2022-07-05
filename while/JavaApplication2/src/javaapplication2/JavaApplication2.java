package javaapplication2;

import java.util.Scanner;

public class JavaApplication2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i, n,sum = 0;
        while (true) {      //無窮迴圈
            System.out.println("請輸入0離開");
            n = sc.nextInt();
            if (n == 0) {
                break;
            } 
            else {
                sum = 0;
                for (i = 1; i <= n; i++) {
                    sum += i;
                }
                System.out.println("sum = " + sum);
            }
        }
    }

}
