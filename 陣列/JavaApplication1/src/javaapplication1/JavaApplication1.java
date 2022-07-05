package javaapplication1;

import java.util.Arrays;

public class JavaApplication1 {
    public static void main(String[] args) {
       int[] ar = {5,3,8,6,7,4,2,1,9};
       
       Arrays.sort(ar);  // 將陣列ar做遞增排序
       
       for(int m : ar){
           System.out.print(m + " ");
       }
    }

}
