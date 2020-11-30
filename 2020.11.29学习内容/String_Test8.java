import java.util.Arrays;

/**
 * @author Zejun_Huang
 * @date 2020/11/29 - 13:47
 */
public class String_Test8 {
    public static String get(){
        String str = "";
        int kind = 3;
        int random;
        for (int i = 0; i < 2; i++) {
            random = (int)(Math.random()*kind);
            if(random == 0){
                str = str + (char)(Math.random()*26 + 'a');
            }
            else if (random == 1){
                str = str + (char)(Math.random()*26 + 'A');
            }
            else{
                str = str + (char)(Math.random()*10 + '0');
            }
        }
        return str;
    }
    public static void main(String[] args) {
        String[] A = new String[100];
        for (int i = 0; i < A.length; i++) {
            A[i] = get();
        }
        System.out.print(Arrays.toString(A) + " ");
        int[] count = new int[100];
        for (int i = 0; i < count.length; i++) {
            count[i] = 0;
        }
        for (int i = 0; i < A.length; i++) {
            for (int j = i+1; j < A.length; j++) {
                if(A[i].length() == 2){
                    if (A[i].equals(A[j])){
                        count[i]++;
                        A[j] = "";
                    }
                }
            }
        }
        int p = 0;
        for (int i = 0; i < count.length; i++) {
            if (count[i] != 0){
                p++;
            }
        }
        System.out.println("");
        System.out.println("总共有"+p+"种重复出现的字符串");
        System.out.println("分别是");
        for (int i = 0; i < count.length; i++) {
            if (count[i] != 0){
                System.out.print(A[i] + " ");
            }
        }
    }
}
