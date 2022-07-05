package javaapplication1;

public class JavaApplication1 {

    public static void main(String[] args) {
//        int i, sum = 0;
//        for (i = 6; i <= 5; i++) {  // 前測式(pre-test)。最少執行0次
//            sum += i;
//        }
//        System.out.println(sum);
//==================================================
//         int i = 6, sum = 0;
//         while(i <= 5){  // 前測式(pre-test)。最少執行0次
//             sum += i;
//             i++;
//         }
//         System.out.println(sum);
//=====================================================
            int i = 6, sum = 0;
            do{               // 後測式(post-test)。最少執行1次
                sum += i;
                i++;
            }
            while(i <= 5);
            System.out.println(sum);
    }

}
