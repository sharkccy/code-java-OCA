package javaapplication_test;
/*
程式用途:從1連加直到超過輸入值，輸出最後一個加的值
*/
import java.util.Scanner;

public class JavaApplication_test {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("請輸入值：");
        int no = sc.nextInt();
        int i, sum = 0;
        for(i = 1; ;i++){
            sum += i ;
            if(sum > no){
                System.out.println(i);
                break;
            }
        }
    }

}
