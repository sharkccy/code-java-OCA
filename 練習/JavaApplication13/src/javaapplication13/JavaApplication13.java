package javaapplication13;

import java.util.ArrayList;
import java.util.Scanner;

public class JavaApplication13 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        ArrayList<String> ar = new ArrayList<>();
        for (int i = 0; i < N; i++) {
            ar.add(sc.next());
        }
        int W = sc.nextInt();
        int S = sc.nextInt();
        int idx = W - 1;
        while (!ar.isEmpty()) {
            idx = (idx + S - 1)%ar.size();
            System.out.println(ar.get(idx));
            ar.remove(idx);

        }
    }
}
