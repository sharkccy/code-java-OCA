package javaapplication2;

import java.util.Scanner;

public class JavaApplication2 {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
        System.out.println("請輸入英文名字");
        String s = sc.nextLine();               // nextLine()可以輸入字串，但是是以enter做為結束的判斷
        System.out.println(s);
    }

}
