package javaapplication1;

public class JavaApplication1 {
    public static void main(String[] args) {
        M m = new M();
        System.out.println(m.getClass());
        
        N n = new N();
        m = n;
        System.out.println(m.getClass());
    }

}

class M {}

class N extends M{}

/*
若是類別沒有繼承其他類別，Java在編譯時會自動加入：extends Object
Object類別有3個常用的方法：
1. getClass()
2. equals()
3. toString()
*/