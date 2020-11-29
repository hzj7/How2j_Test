import java.util.Scanner;

/**
 * @author Zejun_Huang
 * @date 2020/11/28 - 21:57
 */
public class Char_Test {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("请输入:");
        String len = input.nextLine();
        char[] l = len.toCharArray();
        for (int i = 0; i < l.length; i++) {
            if(Character.isUpperCase(l[i]) || Character.isDigit(l[i])){
                System.out.print(l[i]);
            }
        }
    }
}
