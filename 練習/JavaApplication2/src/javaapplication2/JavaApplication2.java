package javaapplication2;

import java.util.Scanner;

public class JavaApplication2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("請輸入數值");
        int no = sc.nextInt();
        int i, j, count = 0,sum = 0;
        A:
        for (i = 1; i <= no; i++) {
            for (j = 1; j <= i; j++) {
                //System.out.print(i + "\t");
                count++;
                sum = sum + i ;
                if (count == no) {
                    break A;
                }
            }
            //System.out.println();
        }        
        System.out.println(sum);
    }

}
