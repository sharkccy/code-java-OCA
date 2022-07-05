package javaapplication8;

import java.util.Scanner;

public class JavaApplication8 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int len = sc.nextInt();  // DNA長度
        int no = sc.nextInt();   // 資料筆數
        String[] dna = new String[no];
        int[] dnaSum = new int[no];
        int i, j, k;
        int m = (len - 1) * len / 2;  // 單筆資料未排序最大程度

        for (i = 0; i < no; i++) {
            dna[i] = sc.next();
        }

        for (i = 0; i < no; i++) {
            for (j = 0; j < len - 1; j++) {
                for (k = j + 1; k < len; k++) {
                    if (dna[i].charAt(j) > dna[i].charAt(k)) {
                        dnaSum[i]++; // 若右邊的字比較大則+1
                    }
                }
            }           
        }        
        
        System.out.println();       
        for (i = 0; i <= m; i++) {
            for (j = 0; j < no; j++) {
                if (dnaSum[j] == i) {
                    System.out.println(dna[j]);
                }
            }
        }
    }
}

/*
Sample Input
10 6
AACATGAAGG
TTTTGGCCAA
TTTGGCCAAA
GATCAGATTT
CCCGGGGGGA
ATCGATGCAT

Sample Output
CCCGGGGGGA
AACATGAAGG
GATCAGATTT
ATCGATGCAT
TTTTGGCCAA
TTTGGCCAAA

*/
