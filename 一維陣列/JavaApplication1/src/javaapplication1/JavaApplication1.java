package javaapplication1;

public class JavaApplication1 {

    public static void main(String[] args) {
        int[] m1 = {1, 3, 5};
        int []m2 = {1, 3, 5};
        int m3[] = {1, 3, 5};
        
        int[] m4 = new int[3];
        m4[0] = 1;
        m4[1] = 3;
        m4[2] = 5;
        
        int[] m5;
        m5 = new int[3];  // 初始值全為0
        System.out.println(m5[0]);
    }

}
