package javaapplication4;

public class JavaApplication4 {
    public static void main(String[] args) {
       String city = "TP";

        switch (city) {
            case "JP":
                System.out.println("東京");
                break;
            case "BK":
                System.out.println("北京");
                break;
            case "TP":
               System.out.println("台北");
                break;            
            case "HK":
                System.out.println("香港");
                break;    
            default:
                System.out.println("其他地區");
        }
    }
}
