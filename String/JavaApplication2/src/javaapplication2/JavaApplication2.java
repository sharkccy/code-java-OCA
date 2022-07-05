package javaapplication2;
import java.util.Scanner;

public class JavaApplication2 {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       String[] m = {"abc123", "bdc100", "aBc111", "Bcq123", "bdc200", "Bcj050"};
       int i, j;
       for(i = 0 ; i < m.length-1; i ++){
           for(j = 0; j < m.length-i-1; j++){
               if(m[j].compareTo(m[j+1]) > 0){
                   String tmp;
                   tmp = m[j];
                   m[j] = m[j+1];
                   m[j+1] = tmp;
               }
           }
       }
       for(String x : m){
           System.out.println(x);
       }
    }

}
