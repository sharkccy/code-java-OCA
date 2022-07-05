package javaapplication4;
import java.util.Scanner;

public class JavaApplication4 {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       String s = "aa:bb:cc:dd";
       String[] m = s.split(":");
        System.out.println(m[1]);
    }

}
