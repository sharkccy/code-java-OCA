package javaapplication10;
import java.util.Scanner;

public class JavaApplication10 {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       try{
           Enter.login();
       }
       catch(Exception e){
           System.out.println(e);
       }
    }
    
}

class Enter{
    public static void login() throws IdException{
        Scanner sc = new Scanner(System.in);
        System.out.println("請輸入員工編號：");
        int n = sc.nextInt();
        if(n <= 100){
            throw new IdException(1);
        }
        if(n <= 200){
            throw new IdException(2);
        }
        
    }
            
}