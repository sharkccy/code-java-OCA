package javaapplication5;

public class JavaApplication5 {

    public static void main(String[] args) {
        int i;
        for (i = 1; i <= 10; i++) {
            if (i % 4 == 0) {
                //break;    //結束迴圈
                continue;   //後面的程式碼不執行，繼續下一個迴圈
            }
            System.out.print(i + " ");
        }
    }

}
