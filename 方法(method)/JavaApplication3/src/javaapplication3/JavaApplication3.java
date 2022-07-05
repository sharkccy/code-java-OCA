package javaapplication3;
import java.util.Scanner;

public class JavaApplication3 {
    public static void main(String[] args) {
       add();
       add(5);
       add(5.7f);
       add(4, 8);
    }
    
    public static void add(){
        System.out.println("0");
    }
    
//    public static int add(){ 不是多載
//       return 1;
//    }
    
    public static void add(int n){  // 方法的多載(Overloading)。方法的名稱一樣，但是參數的型態或是個數不同
        System.out.println(2 * n);
    }
    
    public static void add(float n){
        System.out.println(2 * n);
    }
    
    public static void add(int n1, int n2){
        System.out.println(n1 + n2);        
    }
    
//    public static void add(int q){  不是多載
//        System.out.println(2 * q);
//     
}
