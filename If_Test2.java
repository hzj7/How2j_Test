import java.util.Scanner;

/**
 * @author Zejun_Huang
 * @date 2020/11/21 - 23:28
 */
public class If_Test2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("请输入年份");
        int year;
        year = input.nextInt();
        boolean flag = false;
        if((year%4 == 0 && year%100 != 0)||(year % 400 == 0)){
            flag = true;
        }
        if(flag == true){
            System.out.println(year + "是闰年");
        }
        else {
            System.out.println(year + "不是闰年");
        }
    }
}
