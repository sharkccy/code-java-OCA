package javaapplication1;

import java.util.Scanner;

public class JavaApplication1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();// 當按下空白鍵或是enter就會停止讀取
        System.out.println(s);
        
        sc.nextLine();       // 避免上面的enter重送到下面的nextLine()而影響結果
        
        String s2 = sc.nextLine();
        System.out.println(s2);
    }

}
