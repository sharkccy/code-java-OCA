package javaapplication7;

import java.util.Scanner;

public class JavaApplication7 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i, j, k = 0;
        System.out.println("字串1:");
        String s1 = sc.next();
        System.out.println("字串2:");
        String s2 = sc.next();        
        char[] ch = new char[s1.length() * s2.length()];
        for (i = 0; i < s1.length(); i++) {
            for (j = 0; j < s2.length(); j++) {
                if (s1.charAt(i) == s2.charAt(j)) {
                    ch[k] = s1.charAt(i);
                    k++;
                    break;
                }
            }
        }
        for(i ='a'; i <= 'z';i++){
            for(j = 0; j < ch.length; j++){
               if(ch[j] == i){
                   System.out.print(ch[j]);
                   break;
               } 
            }          
        }
    }
}
