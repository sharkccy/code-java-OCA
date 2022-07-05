package javaapplication1;

public class JavaApplication1 {

    public static void main(String[] args) {
        int a = 3;
        System.out.println("a = " + a);
        System.out.println("a = " + a++);        // 先取a值使用，再+1
        System.out.println("a = " + a);

        System.out.println("===========");

        a = 3;
        System.out.println("a = " + a);
        System.out.println("a = " + ++a);        // 先取a值+1再使用
        System.out.println("a = " + a);

        System.out.println("===========");

        int b = 3;
        System.out.println("b = " + b);
        System.out.println("b = " + b--);         // 先取b值使用，再-1
        System.out.println("b = " + b);

        System.out.println("===========");

        b = 3;
        System.out.println("b = " + b);
        System.out.println("b = " + --b);            // 先取b值-1再使用
        System.out.println("b = " + b);

        System.out.println("===========");
    }

}
