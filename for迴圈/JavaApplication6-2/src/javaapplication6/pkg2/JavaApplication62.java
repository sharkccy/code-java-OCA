package javaapplication6.pkg2;

public class JavaApplication62 {
    public static void main(String[] args) {
       int i , j;
       A : for(i = 1;i <= 5;i++){
           for(j = 1;j <= 5;j++){
               if(j == 3){
                   break A;   //中斷整個迴圈
               }
           }
       }
        System.out.println(i);
    }


    

}
