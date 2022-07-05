package javaapplication2;

import java.util.Scanner;

public class JavaApplication2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        In i = new In();
        i.show();
    }

    static class In {  // 內部類別(Inner class)。加上static的宣告是為了讓main()可以存取
        public void show() {
            System.out.println("In called");
        }
    }
}
