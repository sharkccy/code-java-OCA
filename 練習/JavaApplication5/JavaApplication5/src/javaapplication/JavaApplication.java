package javaapplication;

public class JavaApplication {
    public static void main(String[] args) {
       int[] m = {5, 2, 5, 6, 6, 8, 8, 3, 2, 3, 9, 9, 4, 7, 7};
       
       int n = 0;
       for(int a : m){
           n = n ^ a;  //  ^ 表示 XOR
       }
       
        System.out.println(n);
    }

}
