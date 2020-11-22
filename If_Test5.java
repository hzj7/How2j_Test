/**
 * @author Zejun_Huang
 * @date 2020/11/22 - 20:19
 */
public class If_Test5 {
    public static void main(String[] args) {
        int a,b,c;
        for (int num = 100; num <= 999; num++) {
            a = num % 10;
            b = num % 100 / 10;
            c = num / 100;
            if(a*a*a+b*b*b+c*c*c == num){
                System.out.println(num + "是水仙花数");
            }
        }
    }
}
