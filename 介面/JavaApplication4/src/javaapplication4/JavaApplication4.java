package javaapplication4;
import java.util.Scanner;

public class JavaApplication4 {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);

    }

}
class Mobile{}

interface USB{}

interface Wifi{}

class Iphone extends Mobile implements USB,Wifi{}//順序不可顛倒 