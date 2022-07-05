package javaapplication8;

public class JavaApplication8 {
    public static void main(String[] args) {
           int[] m = {1,2,3};
           try{
               sh(m);
           }
           catch(Exception e){
               System.out.println(e);
           }
           
    }
    
    public static void sh(int[] ar) throws Exception{  // 不明確的例外類別
        System.out.println(ar[5]);
    }
}

