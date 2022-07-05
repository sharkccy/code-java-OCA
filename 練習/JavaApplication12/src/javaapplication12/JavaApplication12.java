package javaapplication12;

import java.util.ArrayList;
import java.util.Scanner;

public class JavaApplication12 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        int K = sc.nextInt();
        int idx = 0;
        ArrayList<Integer> ar = new ArrayList();
        for (int i = 0; i < N; i++) {
            ar.add(i + 1);
        }
        while (K-- > 0) {
            idx = (idx + M - 1)%ar.size();
            ar.remove(idx);
        }
        System.out.println(ar.get(0));
    }

}
