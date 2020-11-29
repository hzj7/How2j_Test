/**
 * @author Zejun_Huang
 * @date 2020/11/28 - 20:47
 */
public class Math_Test {
    public static void main(String[] args)
    {
        int max_value = (int)Math.pow(10, 7);
        System.out.println(max_value);
        int sum = 0; //统计质数个数
         /*boolean 数组初始化全是false，而且只占一个bit，占用空间很小
          所以用筛选法将合数全部置true，剩下的false就是质数，最后统计false数量即可*/

        boolean judge[] = new boolean[max_value];
        judge[1] = true;   //0这个位置不要，1的位置代表数字1，2的位置代表数字2，以此类推
        for (int i = 2; i < max_value; i++)
        {
            if (!judge[i])   // 如果是质数，就把他的倍数都置true
            {
                sum +=1;     //当场统计
                for (int j = 2; j*i <max_value; j++)
                    judge[i*j] = true;
            }

        }
        System.out.println("1000W数字内的质数有" + sum + "个");

    }
}
