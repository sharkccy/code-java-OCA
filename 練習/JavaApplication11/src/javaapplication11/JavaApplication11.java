package javaapplication11;

import java.util.Scanner;

public class JavaApplication11 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] line = new String[4];
        int[] no = new int[26];
        int i, j;
        for (i = 0; i < 4; i++) {
            line[i] = sc.nextLine();
            for (j = 0; j < line[i].length(); j++) {
                if (line[i].charAt(j) >= 'A' && line[i].charAt(j) <= 'Z') {
                    no[line[i].charAt(j) - 'A']++;
                }
            }
        }
        int max = no[0];
        for (i = 0; i < no.length; i++) {
            if (no[i] > max) {
                max = no[i]; // 找出字母出現最多次的值
            }
        }
         for (i = max; i >= 0; i--) {
            for (j = 0; j < 26; j++) {
                if (no[j] > i) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }

        for (i = 0; i < 26; i++) {
            System.out.printf("%c ", 'A' + i);
        }
        System.out.println();
    }
}
    

