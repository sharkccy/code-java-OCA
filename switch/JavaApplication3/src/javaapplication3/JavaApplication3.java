package javaapplication3;

public class JavaApplication3 {
    public static void main(String[] args) {
   char ch = 'a';
        switch (ch) {           // switch內的資料型態可是：int、char、String
            case 'A' :
            case 'a' :
                System.out.println("A");
                break;
            case 'B' :
            case 'b' :
                System.out.println("B");
                break;
            case 'C' :
            case 'c' :
                System.out.println("C");
                break;            
            default :
                System.out.println("Z");
        }
    }
}

