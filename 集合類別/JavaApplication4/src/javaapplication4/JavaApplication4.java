package javaapplication4;

import java.util.Scanner;
import java.util.TreeSet;

public class JavaApplication4 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        TreeSet ts = new TreeSet();
        ts.add(2);
        ts.add(1);
        ts.add(35);
        ts.add(222);
        ts.add(9);
        ts.add(8);
        System.out.println(ts);
        System.out.println(ts.first());
        System.out.println(ts.last());
        System.out.println(ts.size());
    }

}
