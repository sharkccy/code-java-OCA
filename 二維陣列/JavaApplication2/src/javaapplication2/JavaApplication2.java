package javaapplication2;

public class JavaApplication2 {
    public static void main(String[] args) {
       int[][] ar = {{1, 3, 5}, {8, 6, 4, 2}};
       int i , j ;
       for(i = 0;i < ar.length; i++){           // 取出陣列的列數
           for(j = 0; j < ar[i].length; j++){   // 取出每列包含幾筆資料
               System.out.print(ar[i][j] + "  ");
           }
           System.out.println(" ");
       }
    }

}
