package javaapplication3;

import java.util.Scanner;

public class JavaApplication3 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = "hello";
        s = s.replace('l', 'L');  //字元替換
        System.out.println(s);
        
        String s2 = "I love Taiwan,I live here";
        s2 = s2.replaceAll("ve", "ving");
        System.out.println(s2);     //字串替換
    }

}
