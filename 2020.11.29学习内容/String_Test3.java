/**
 * @author Zejun_Huang
 * @date 2020/11/29 - 13:20
 */
public class String_Test3 {
    public static void main(String[] args) {
        String a = "let there be light";
        String[] words = a.split(" ");
        for (int i = 0; i < words.length; i++) {
            words[i] = words[i].substring(0,1).toUpperCase() + words[i].substring(1);
        }
        for (int i = 0; i < words.length; i++) {
            System.out.print(words[i] + " ");
        }
    }
}
