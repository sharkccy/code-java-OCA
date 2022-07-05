package javaapplication3;

import java.util.Scanner;

public class JavaApplication3 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("請輸入陣列大小(偶數)");
        int n = sc.nextInt();
        int[][] arr = new int[n][n];
        int i, j, k = 1;
        for (i = 0; i < arr.length; i++) {  //產生陣列
            for (j = 0; j < arr[i].length; j += 2) {
                arr[i][j] = k;
                arr[i][j + 1] = k;
                k++;
            }
        }
//=====================================================

        for (i = 0; i < arr.length; i++) {  //打亂陣列
            for (j = 0; j < arr[i].length; j++) {   
                int x = (int)(Math.random() * n);   // 亂數產生 0~n-1之間的值
                int y = (int)(Math.random() * n);
                int tmp = arr[i][j] ;
                arr[i][j] = arr[x][y];
                arr[x][y] = tmp ;
            }
        }

//=====================================================
        for (int[] x : arr) {                //輸出陣列
            for (int y : x) {
                System.out.print(y + "\t");
            }
            System.out.println(" ");
        }
    }

}
