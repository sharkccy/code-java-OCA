package javaapplication8_2;

public class JavaApplication8_2 {
    public static void main(String[] args) {
        int[] m = {1,2};
        try{
            sh(m);
        }
        catch(ArrayIndexOutOfBoundsException e){
            System.out.println(e);
        }
    }
    
     public static void sh(int[] ar) throws ArithmeticException {  
        System.out.println(ar[5] / 0);
    }
}
