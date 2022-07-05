package javaapplication4;
import java.util.Scanner;

public class JavaApplication4 {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);        
        try{
            System.out.println(5 / 0);
        }
        catch(Exception e){
            System.out.println(e);
        }
        finally{        // 不管上面程式有無錯誤(有無擷取到)，此行都會執行
            System.out.println("近似值" + 5/0.0000000001);
        }
    }

}
