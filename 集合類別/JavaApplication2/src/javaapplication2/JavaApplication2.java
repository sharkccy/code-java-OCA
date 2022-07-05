package javaapplication2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class JavaApplication2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> ar = new ArrayList<>(); // 資料先進先出，可重複
        ar.add(3);
        ar.add(1);
        ar.add(4);
        ar.add(3);
        ar.add(2);
        System.out.println(ar);
        Collections.sort(ar);
        System.out.println(ar);
        System.out.println(Collections.max(ar));
        System.out.println(Collections.min(ar));
    }

}
