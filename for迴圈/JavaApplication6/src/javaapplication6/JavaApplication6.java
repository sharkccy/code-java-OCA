package javaapplication6;

public class JavaApplication6 {
    public static void main(String[] args) {
       int i , j;
       for(i = 1;i <= 5;i++){
           for(j = 1;j <= 5;j++){
               if(j == 3){
                   break;   //中斷內圈
               }
           }
       }
       System.out.println(i);
    }

}
