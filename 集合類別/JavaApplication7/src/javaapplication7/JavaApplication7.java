package javaapplication7;

import java.util.Random;
import java.util.Scanner;
import java.util.TreeMap;

public class JavaApplication7 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random r = new Random();
        TreeMap<Integer, String> tm = new TreeMap();
        tm.put(01, "Dogy");
        tm.put(02, "Bobo");
        tm.put(03, "Vincent");
        tm.put(04, "Sean");
        tm.put(05, "Allen");
        System.out.println(tm);
        System.out.println(tm.get(r.nextInt(5) + 1));
        System.out.println(tm.containsKey(05));
        System.out.println(tm.containsValue("Allen"));
    }

}
