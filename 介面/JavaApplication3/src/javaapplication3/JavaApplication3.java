package javaapplication3;
import java.util.Scanner;

public class JavaApplication3 {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);

    }

}
class A{}
class B{}
//class C extends A,B{} 類別不能多重繼承
interface USB{}
interface Wifi{}
interface NFC{}
interface BOX extends USB,Wifi,NFC{}    // 介面能多重繼承介面