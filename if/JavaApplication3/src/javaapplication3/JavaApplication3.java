package javaapplication3;

import java.util.Scanner;

public class JavaApplication3 {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       System.out.println("請輸入數學成績 :");
       int math = sc.nextInt();
       if(math > 100 || math < 0){
           System.out.println("Error");
       }      
       else if(math >= 60){
           if(math >= 80 ){               
               System.out.println("Level A");
           }
           else{
               System.out.println("Level B");
           }           
       }
       else{
           if(math >= 50){
               System.out.println("補考");
           }
           else{
               System.out.println("重修");
           }           
       }
    }
}
