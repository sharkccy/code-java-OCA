package javaapplication7;

public class JavaApplication7 {
    public static void main(String[] args) {
       int i , j , sum = 0 ;
       for(i = 1, j = 2;i <= 99 || j <=100 ; i+=2, j+=2 ){
           sum = sum + (i - j);
       }
        System.out.println(sum);
    }

}
