/*
一個機器人站在原點，有一串指令，分別為下列幾種
向左一位
向右一位
和第i步相同。
試問經過幾個步驟後的最後位置。
Hint：原始位置是0，向左 -1，向右 +1，計算數組和即可。
*/

package javaapplication9;

import java.util.Scanner;

public class JavaApplication9 {
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
         int no = sc.nextInt();  // 機器人旋轉的次數
         String[] turn = new String[no];  // 儲存旋轉的指令
         int[] value = new int[no];  // 儲存旋轉的值(左轉：-1，右轉：1)
         int i, sum = 0;
         for(i = 0; i < no; i++){
             Scanner sc2 = new Scanner(System.in);
             turn[i] = sc2.nextLine();
             
             if(turn[i].equals("LEFT")){
                 value[i] = -1;
             }
             else if(turn[i].equals("RIGHT")){
                 value[i] = 1;
             }
             else{
                 char ch = turn[i].charAt(turn[i].length()-1);  // 取出字串的最後一個字元
                 int no2 = ch - '0';  // 將ASCII code轉數字
                 value[i] = value[no2-1]; 
             }
         }
         for(int a : value)
             sum += a;
         System.out.println(sum);
    }

}

/* 測資
Sample Input
23
LEFT
RIGHT
SAME AS 2
5
LEFT
SAME AS 1
SAME AS 2
SAME AS 1
SAME AS 4
Sample Output
1
-5
*/