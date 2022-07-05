package javaapplication3;

public class JavaApplication3 {

    public static void main(String[] args) {
        int[][] ar = {{1, 3, 5}, {8, 6, 4, 2}};
        for (int[] m : ar) {
            for (int n : m ) {
                System.out.print( n + "  ");
            }
            System.out.println(" ");
        }
    }
}
