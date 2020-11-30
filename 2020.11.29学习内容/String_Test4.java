import java.util.Scanner;

/**
 * @author Zejun_Huang
 * @date 2020/11/29 - 13:21
 */
public class String_Test4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("请输入:");
        String l = input.nextLine();
        String[] words = l.split(" ");
        int count = 0;
        for (int i = 0; i < words.length; i++) {
            if ((words[i].substring(0,1).equals("p") || words[i].substring(0,1).equals("P"))){
                count++;
            }
        }
        System.out.println(count);
    }
}
