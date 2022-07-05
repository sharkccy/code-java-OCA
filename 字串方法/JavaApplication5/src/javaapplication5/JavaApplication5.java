package javaapplication5;
import java.util.Scanner;

public class JavaApplication5 {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       String s = "aa,bb,cc,dd,ll";
       String[] m = s.split(",");
       for(String x : m){
           System.out.print(x + " ");
       }
    }

}
