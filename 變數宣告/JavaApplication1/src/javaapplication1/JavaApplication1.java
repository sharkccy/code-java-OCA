package javaapplication1;

public class JavaApplication1 {

    public static void main(String[] args) {
        int a = 2147483647;
        System.out.println(a + 1);   // 發生溢位 (overflow)
        
        int b = -2147483648;
        System.out.println(b - 1);
        
        long c = 2147485000L;
        System.out.println(c + 1);
    }

}
