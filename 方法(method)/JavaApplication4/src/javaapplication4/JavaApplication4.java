package javaapplication4;

public class JavaApplication4 {
    public static void main(String[] args) {
       sum();       
       sum(2);
       sum(2,3);
       sum(2,3,4,5);
    }
    
    public static void sum(int ... n){  // ...表示參數的個數不限
        int total = 0;
        
        for(int a : n){
            total = total + a;
        }
        System.out.println(total);
    }
}
