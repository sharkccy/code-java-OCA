package javaapplication2;
import java.util.Scanner;

public class JavaApplication2 {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);

    }

}
interface USB {}

interface typeC extends USB {} // 子介面

class NB implements USB {} // 類別可以實作介面
// interface A implements USB {} 介面不可以實作介面