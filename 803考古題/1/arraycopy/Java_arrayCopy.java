public class Java_arrayCopy {
    public static void main(String[] args) {
        int[] m1 = {1,2,3,4,5};
        int[] m2 = new int[m1.length];
               
        System.arraycopy(m1, 0, m2, 0, m1.length);
        // 來源陣列，起始索引值，目的陣列，起始索引值，複製長度
        for(int n:m2)
            System.out.print(n + " ");
        
        System.out.println();
        
        System.arraycopy(m1, 2, m1, 1, 2);
        for(int n:m1)
            System.out.print(n + " ");
        // 複製m1的索引2後面2個數字(3.4)到索引1之後
    }
}
