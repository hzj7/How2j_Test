/**
 * @author Zejun_Huang
 * @date 2020/11/22 - 21:53
 */
public class Array_Test2 {
    public static void main(String[] args) {
        int[][] array = new int[5][5];
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                array[i][j] = (int)(Math.random()*100);
                System.out.print(array[i][j] + "\t");
            }
            System.out.println();
        }
        int big = 0;
        int temp_i = 0,temp_j = 0;

        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                if(array[i][j] > big)
                {
                    big = array[i][j];
                    temp_i = i;
                    temp_j = j;
                }
            }
        }
        System.out.println("找出来的最大值是:"+ big);
        System.out.println("其坐标为:["+temp_i+"]"+"["+temp_j+"]");

    }
}
