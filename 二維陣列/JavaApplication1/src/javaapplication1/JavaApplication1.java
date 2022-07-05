package javaapplication1;

public class JavaApplication1 {

    public static void main(String[] args) {
        int[][] m = new int[2][3];
        int[] m2[] = new int[2][3];
        int m3[][] = new int[2][];

        // int[][]  m4 = new int[][3];  錯
        int[][] m5 = new int[3][];  //不規則陣列
        m5[0] = new int[2];
        m5[1] = new int[4];
        m5[2] = new int[6];

        int[][] m6 = new int[3][];
        m6[0] = new int[]{1, 2};
        m6[1] = new int[]{1, 2, 3};
        m6[2] = new int[]{1, 2, 3, 4};

        int[][] m7 = {{1, 2, 3}, {4, 5, 6}};     // 2*3的陣列        
    }

}
