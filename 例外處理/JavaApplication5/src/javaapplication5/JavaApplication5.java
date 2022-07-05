package javaapplication5;

import java.util.Scanner;

public class JavaApplication5 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m[] = new int[3];
        try {
            System.out.println(5 / 0);
            System.out.println(m[5]);
        }
        //catch(Exception ex){} 錯，上方的例外類別不可以是下方的父類別  
        catch (ArrayIndexOutOfBoundsException e1) {
            System.out.println("錯誤，陣列超出邊界!!");
        }
        catch (ArithmeticException e2) {
            System.out.println("錯誤，分母為0!!");
        }
        System.out.println("over");  // 若是上方的catch有正確擷取到錯誤，此行才會執行
    }

}
