/**
 * @author Zejun_Huang
 * @date 2020/11/22 - 19:43
 */
public class If_Test3 {
    public static void main(String[] args) {
            int n ;
            int money = 0;

            for (int j = 1; j < 100; j++) {
                n=j;
                float r = 1f;
                for (int i = 1; i <= n; i++) {
                    r *= 1.2f;
                }
                money +=( 12000 * r - 12000);
                System.out.println("经过"+n+"年，总收入是"+money);
                if(money>=1000000){
                    System.out.println("持续投资"+n+"年，总收入达到100万");
                    break;
                }
            }


    }
}
