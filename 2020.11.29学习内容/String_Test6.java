/**
 * @author Zejun_Huang
 * @date 2020/11/29 - 13:36
 */
public class String_Test6 {
    public static void main(String[] args) {
        String a = "lengendary";
        char[] temp = a.toCharArray();
        for (int i = 0; i < temp.length; i++) {
            if(i == temp.length-1){
                temp[i] = (char) (temp[i] - 32);
            }
        }
        a = new String(temp);
        System.out.println(a);
    }
}
