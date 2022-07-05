package javaapplication2;

public class JavaApplication2 {

    public static void main(String[] args) {
        int[] a = {1, 2, 3};
        int[] b = a;            // b 參照到 a
        System.out.println(a[1]);
        System.out.println(b[2]);
        b[2] = 9;
        System.out.println(a[2]);
        
        b = new int[5];     // b 獨立成為一個新陣列
        for(int i =0;i < b.length; i++){
            System.out.print(b[i] + " ");
        }
        
    }

}
