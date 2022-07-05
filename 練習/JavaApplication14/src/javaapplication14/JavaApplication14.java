package javaapplication14;
import java.util.Random;
import java.util.Scanner;
import java.util.TreeSet;

public class JavaApplication14 {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       Random r = new Random();
       Random r2 = new Random();
       TreeSet ts = new TreeSet();
       for(int i = 0 ; i<3;i++){
           ts.add(r.nextInt(30)+1);
       }
       for(int i = 0 ; i<2;i++){
           ts.add(r.nextInt(20)+31);   //1~30
       }
        System.out.println(ts);         //31~50
    }

}
