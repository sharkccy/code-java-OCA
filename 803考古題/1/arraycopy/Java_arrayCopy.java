public class Java_arrayCopy {
    public static void main(String[] args) {
        int[] m1 = {1,2,3,4,5};
        int[] m2 = new int[m1.length];
               
        System.arraycopy(m1, 0, m2, 0, m1.length);
        // �ӷ��}�C�A�_�l���ޭȡA�ت��}�C�A�_�l���ޭȡA�ƻs����
        for(int n:m2)
            System.out.print(n + " ");
        
        System.out.println();
        
        System.arraycopy(m1, 2, m1, 1, 2);
        for(int n:m1)
            System.out.print(n + " ");
        // �ƻsm1������2�᭱2�ӼƦr(3.4)�����1����
    }
}
