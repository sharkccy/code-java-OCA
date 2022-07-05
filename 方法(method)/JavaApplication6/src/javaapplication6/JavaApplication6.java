package javaapplication6;
import java.util.Scanner;

public class JavaApplication6 {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       
        System.out.println(max(3, 1));
    }
    
    public static boolean max(int a, int b){
        if(a > b)
            return true;
        return false;
        //System.out.println("xxx");  return 之後不可以有程式碼
    }
}
