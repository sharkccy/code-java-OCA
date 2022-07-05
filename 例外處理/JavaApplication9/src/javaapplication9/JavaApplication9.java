package javaapplication9;

import java.util.InputMismatchException;
import java.util.Scanner;

public class JavaApplication9 {
    public static void main(String[] args) {
        try{
            test();
        }
        catch(Exception e){
            System.out.println(e);
        }
    }
    
    public static void test() throws InputMismatchException{
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if(n == 0){
            throw new ArithmeticException();
        }
        else
            System.out.println(3 / n);
    } 
}
