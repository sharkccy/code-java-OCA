package javaapplication;

import java.util.Scanner;

public class JavaApplication {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i, a, b, N;
        while(true){
            a = sc.nextInt();
             if(a == 0)
                break;
            b = sc.nextInt();
            N = sc.nextInt();
                       
            System.out.print(a / b + ".");
            a = a % b;

            for (i = 1; i <= N; i++) {
                a = a * 10;
                System.out.print(a / b);
                a = a % b;
            }
            System.out.println("");
        }       
    }

}
