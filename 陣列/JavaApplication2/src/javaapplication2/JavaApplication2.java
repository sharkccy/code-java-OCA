package javaapplication2;
import java.util.Arrays;
import java.util.Scanner;

public class JavaApplication2 {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       int[] ar = {5,3,8,0,6,7,7,8,2,4,2,1,3,1,9,4,9,8,6,5};       
       Arrays.sort(ar);
       
       if (ar[0] != ar[1]) {
            System.out.println(ar[0]);
        } 
        else if (ar[ar.length - 1] != ar[ar.length - 2]) {
            System.out.println(ar[ar.length - 1]);
        } 
        else {
            for (int i = 1; i < ar.length - 1; i++) {
                if (ar[i - 1] != ar[i] && ar[i] != ar[i + 1]) {
                    System.out.println(ar[i]);
                }
            }
        }       
    }

}
