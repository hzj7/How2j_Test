/**
 * @author Zejun_Huang
 * @date 2020/11/22 - 20:43
 */
public class Array_Test {
    public static void main(String[] args) {
        int[] a = new int[5];
        a[0] = (int)(Math.random()*100);
        a[1] = (int)(Math.random()*100);
        a[2] = (int)(Math.random()*100);
        a[3] = (int)(Math.random()*100);
        a[4] = (int)(Math.random()*100);
        for (int i = 0; i < 5; i++) {
            System.out.println(a[i]);
        }

        int temp = 0;
        for (int i = 0; i < 2; i++) {
            temp = a[i];
            a[i] = a[4-i];
            a[4-i] = temp;
        }
        for (int i = 0; i < 5; i++) {
            System.out.println(a[i]);
        }
    }
}
