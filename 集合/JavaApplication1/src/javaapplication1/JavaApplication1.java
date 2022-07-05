package javaapplication1;

import java.util.ArrayList;

public class JavaApplication1 {
    public static void main(String[] args) {
        ArrayList<Integer> ar = new ArrayList<>(); // 資料先進先出，可重複
        ar.add(3);
        ar.add(1);
        ar.add(4);
        ar.add(3);
        ar.add(2);
        System.out.println(ar);
        System.out.println(ar.size());  // 資料筆數
        System.out.println(ar.get(2)); // 取出索引2的資料
        ar.remove(3);  // 刪除索引3的資料
        System.out.println(ar);
        System.out.println(ar.isEmpty());  // 查詢集合是否是空的
    }

}
