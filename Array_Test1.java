/**
 * @author Zejun_Huang
 * @date 2020/11/22 - 21:40
 */
public class Array_Test1 {
    public static void main(String[] args) {
        int[] a = new int[(int)(Math.random()*10)+1];
        for (int i = 0; i < a.length; i++) {
            a[i] = (int)(Math.random()*100);
        }
        for (int i = 0; i < a.length; i++) {
            System.out.println("a["+i+"]"+a[i]);
        }

        int[] b = new int[(int)(Math.random()*10)+1];
        for (int i = 0; i < b.length; i++) {
            b[i] = (int)(Math.random()*100);
        }
        for (int i = 0; i < b.length; i++) {
            System.out.println("b["+i+"]"+b[i]);
        }
        int[] c = new int[20];
        System.arraycopy(a,0,c,0,a.length);
        System.arraycopy(b,0,c,a.length,b.length);
        for (int i = 0; i < c.length; i++) {
            System.out.println("c["+i+"]"+c[i]);
        }
    }
}
