package javaapplication3;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class JavaApplication3 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Integer> ar = new ArrayList<>();  //向上轉型
        ar.add(2);
        ar.add(6);
        ar.add(5);
        ar.add(8);
        ar.add(6);
        System.out.println(ar);
        for(Integer x :ar){
            System.out.print(x + " ");            
        }
        System.out.println("");
        Iterator it = ar.iterator();
        while(it.hasNext()){
            System.out.print(it.next() + " ");
        }
    }

}
