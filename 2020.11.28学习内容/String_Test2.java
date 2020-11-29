import java.util.Arrays;
import java.util.Random;

/**
 * @author Zejun_Huang
 * @date 2020/11/28 - 22:17
 */
public class String_Test2 {

    int kind;
    //生成length长度的字符串
    public static String get(int length,int kind){
        Random random = new Random();
        String s = "";
        for (int i = 0; i < length; i++) {
            int a = random.nextInt(kind);
            if(a == 0){
                s = s + (char)((int)((Math.random()*26)) + 'a');
            }else if(a == 1){
                s = s + (char)((int)((Math.random()*26)) + 'A');
            }else{
                s = s + (char)(((Math.random()*10))+'0');
            }
        }
        return s;
    }

    public static void sort(String[] strings){
        for (int i = 0; i < strings.length; i++) {
            char[] temp = strings[i].toCharArray();
            for (int j = i+1; j < strings.length; j++) {
                char[] temp2 = strings[j].toCharArray();
                        for (int k = 0; k < temp.length;) {
                            if(Character.toUpperCase(temp[k]) == Character.toUpperCase(temp2[k])){
                                k++;
                            }else if(Character.toUpperCase(temp[k]) < Character.toUpperCase(temp2[k])){
                                break;
                            }else {
                                String t;
                                t = strings[i];
                                strings[i] = strings[j];
                                strings[j] = t;
                                temp = temp2;
                                break;
                            }
                        }


            }
        }
    }



    public static void main(String[] args) {
                 /***第一个问题***/
        String a = get(5,3);
        System.out.println(a);
        String[] strings = new String[8];
        for (int i = 0; i < 8; i++) {
            strings[i] = get(5,2);
        }
        System.out.println("排序前"+Arrays.toString(strings));
        sort(strings);
        System.out.println("排序后"+Arrays.toString(strings));


    }
}
