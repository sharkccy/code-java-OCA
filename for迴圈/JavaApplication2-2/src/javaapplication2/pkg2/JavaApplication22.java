package javaapplication2.pkg2;

public class JavaApplication22 {
    public static void main(String[] args) {
       int j, sum = 0;
        for (j = 1; j <= 5; j++) {
            sum += j++;
        }
        System.out.println("sum = " + sum);
        System.out.println("j = " + j); 
    }

}

/*
j=1, sum=sum+j(0+1), j++, j++(j=3)
j=3, sum=sum+j(1+3), j++, j++(j=5)
j=5, sum=sum+j(4+5), j++, j++(j=7)
*/