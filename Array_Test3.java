import java.util.Arrays;

/**
 * @author Zejun_Huang
 * @date 2020/11/22 - 22:16
 */
public class Array_Test3 {
    public static void main(String[] args) {
        int[][] a = new int[5][8];
        int[] b = new int[40];
        int n = 0;
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 8; j++) {
                a[i][j] = (int)(Math.random()*100);
                b[n] = a[i][j];
                n++;
            }
        }
        System.out.println("排序前:");
        for (int i = 0; i < 5; i++) {
            System.out.println(Arrays.toString(a[i]));
        }
        Arrays.sort(b);
        for (int i = 0; i < 5; i++) {
            System.arraycopy(b,i*8,a[i],0,8);
        }
        System.out.println("排序后:");
        for (int i = 0; i < 5; i++) {
            System.out.println(Arrays.toString(a[i]));
        }

    }
}
