package javaapplication1;
import java.util.Scanner;

public class JavaApplication1 {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       NB asus = new NB();
       asus.swift();
       asus.transfer();
    }

}
interface USB {
    public abstract void transfer();
    public void swift();    // 介面只能有抽象方法
}
class NB implements USB{
    public void transfer(){}
    public void swift(){}    // 實作介面的抽象方法   
}