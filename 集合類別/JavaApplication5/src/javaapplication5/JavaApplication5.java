package javaapplication5;

import java.util.Random;
import java.util.Scanner;
import java.util.TreeSet;

public class JavaApplication5 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        TreeSet ts = new TreeSet();
        Random r = new Random();
        while (ts.size() < 6) {
            int no = r.nextInt(49) + 1;
            ts.add(no);
        }
        System.out.println(ts);
    }
}
