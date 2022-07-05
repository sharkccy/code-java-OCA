package javaapplication2;


public class JavaApplication2 {
    public static void main(String[] args) {
       int[] data = {2,4,6,8};
       show(data);    
    }
    
    public static void show(int[] m){  // int[] m = data ，陣列m參照到data
        for(int a : m){
            System.out.print(a + " ");
        }        
        System.out.println("");
        
        m = new int[2];  // 陣列m獨立成為一個可以存放2個整數的新陣列
        
        for(int n : m){
            System.out.print(n + " ");
        }        
        System.out.println("");
    }
}
