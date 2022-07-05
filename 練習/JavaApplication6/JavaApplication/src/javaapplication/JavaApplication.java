package javaapplication;
import java.util.Scanner;

public class JavaApplication {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       int no = sc.nextInt();
       
       if(isodd(no) == 1){
           System.out.println("0");
       }
       else{
           int up = no;
           int down = no;
           
           while(true){
               up++;
               if(isodd(up) == 1){
                   break;
               }                  
           }
           System.out.println(up);           
           while(true){
               down--;
               if(isodd(down) == 1){
                   break;
               }                  
           }
           System.out.println(down);
           
           int a = up - no;
           int b = no - down;
           if(a < b)
               System.out.println(a);
           else
               System.out.println(b);
       }      
    }
    
    public static int isodd(int n){  // 回傳1表示全為奇數，-1表示至少有1個數字是偶數
        int yes = 1;        
        while(n != 0){
            int t = n % 10;
            if(t % 2 == 0){
                yes = -1;
            }
            n = n / 10;
        }
        if(yes == 1)  // 每個數字皆是奇數
            return 1;
        return -1;  //  // 至少有1個數字是偶數
    }
}
