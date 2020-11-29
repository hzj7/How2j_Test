import java.util.Scanner;

/**
 * @author Zejun_Huang
 * @date 2020/11/28 - 21:19
 */
public class String_Test {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("请输入地名");
        String s1 = input.nextLine();
        System.out.println("请输入公司类型");
        String s2 = input.nextLine();
        System.out.println("请输入公司名称");
        String s3 = input.nextLine();
        System.out.println("请输入老板名称");
        String s4 = input.nextLine();
        System.out.println("请输入金额");
        String money = input.nextLine();
        System.out.println("请输入产品");
        String s5 = input.nextLine();
        System.out.println("请输入计量单位");
        String s6 = input.nextLine();
        String out =  "%s最大%s%s倒闭了，王八蛋老板%s吃喝嫖赌，欠下了%s个亿，带着他的小姨子跑了!我们没有办法，拿着%s抵工资!原价都是一%s多、两%s多、三%s多的%s，现在全部只卖二十块，统统只要二十块!%s王八蛋，你不是人!我们辛辛苦苦给你干了大半年，你不发工资，你还我血汗钱，还我血汗钱! ";
        System.out.format(out ,s1,s2,s3,s4,money,s5,s6,s6,s6,s5,s4);
    }
}
