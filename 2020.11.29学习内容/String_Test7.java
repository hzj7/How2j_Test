/**
 * @author Zejun_Huang
 * @date 2020/11/29 - 13:37
 */
public class String_Test7 {
    public static void main(String[] args) {
        String a = "Nature has given us that two ears, two eyes, and but one tongue, to the end that we should hear and see more than we speak";
        int n = a.lastIndexOf("two");
        char[] temp = a.toCharArray();
        temp[n] = (char)(temp[n] - 32);
        a = new String(temp);
        System.out.println(a);
    }
}
