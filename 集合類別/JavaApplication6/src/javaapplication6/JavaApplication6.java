package javaapplication6;

import java.util.TreeSet;

public class JavaApplication6 {
    public static void main(String[] args) {
        TreeSet<String> ts = new TreeSet<>();
        String[] mem1 = {"Jacob", "Nick", "Amy", "Eric", "Suzan"};
        String[] mem2 = {"Nick", "Andy", "Suzan", "Lina", "Damon"};
        for(String x : mem1){
            ts.add(x);
        }
        for(String x : mem2){
            ts.add(x);
        }
        System.out.println(ts);
    }

}
