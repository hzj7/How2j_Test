/**
 * @author Zejun_Huang
 * @date 2020/11/22 - 19:46
 */
public class If_Test4 {
    //黄金分割点
    public static void main(String[] args) {
        int temp_i = 0 ,temp_j = 0;
        float golden = 0.618f;
        float closest = 1f;
        float compare = 0f;
        float out = 0f;
        for (float i = 1; i < 20; i++) {
            for (float j = 1; j < 20; j++) {
                if(i%2 == 0 && j%2 == 0) continue;
                if((float)(i/j)-golden < 0)
                    compare = -(i/j-golden);
                else
                    compare = i/j-golden;
                if(compare < closest) {
                    closest = compare;
                    out =  i/j;
                    temp_i = (int)i;
                    temp_j = (int)j;
                }
            }
        }
        System.out.println("离黄金分割点{0.618}最近的两个数相除是"+temp_i+"/"+temp_j+"="+out);
    }
}
