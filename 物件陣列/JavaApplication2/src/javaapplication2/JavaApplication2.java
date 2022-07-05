package javaapplication2;
import java.util.Scanner;

public class JavaApplication2 {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       Std[] s = new Std[3];
       s[0] = new Std("may",79,90) ;
       s[1] = new Std("allen",83,70) ;
       s[2] = new Std("bob",99,60) ;
       int ja = 0 , sq = 0;
       for(int i = 0; i < s.length; i++){
           ja += s[i].java;
           sq += s[i].sql;
       }
        System.out.println("jave\tsql");
        System.out.println("===========");
        System.out.printf("%.0f\t%.0f\n",ja*1.0/s.length,sq*1.0/s.length);
    }

}
class Std {

    public Std(String name, int java, int sql) {
        this.name = name;
        this.java = java;
        this.sql = sql;
    }   
    String name;
    int java;
    int sql;
}