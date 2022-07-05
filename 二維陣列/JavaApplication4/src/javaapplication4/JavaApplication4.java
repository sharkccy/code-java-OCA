package javaapplication4;

public class JavaApplication4 {
    public static void main(String[] args) {
       String[][] std = {{"aa", "bb", "cc"}, {"xx", "yy", "zz"}};

        for (String[] m : std) {
            for (String n : m) {
                System.out.print(n + " ");
            }
            System.out.println(" ");
        }
    }

}
