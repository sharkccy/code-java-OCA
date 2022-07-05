package javaapplication5;

public class JavaApplication5 {
    public static void main(String[] args) {
       
       sum(1,2,3);
    }
    
    public static void sum(int m, int ... n){  // Java將...視為陣列
         int total = 0;        
        for(int i = 0; i < n.length; i++){
            total = total + n[i];
        }
        System.out.println(total - m);
     }
}
