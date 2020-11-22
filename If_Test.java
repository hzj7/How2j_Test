import java.util.Scanner;

/**
 * @author Zejun_Huang
 * @date 2020/11/21 - 23:13
 */
public class If_Test {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double BMI;
        double high;
        double weight;
        System.out.println("请输入身高(m):");
        high = input.nextDouble();
        System.out.println("请输入体重(kg):");
        weight = input.nextDouble();
        BMI = weight/(high*high);
        System.out.println("当前的BMI是:"+BMI);
        if (BMI<18.5){
            System.out.println("身体状态是:体重过轻");
        }
        else if (BMI >= 18.5 && BMI < 24){
            System.out.println("身体状态是:正常范围");
        }
        else if (BMI >= 24 && BMI < 27){
            System.out.println("身体状态是:体重过重");
        }
        else if (BMI >= 27 && BMI < 30){
            System.out.println("身体状态是:轻度肥胖");
        }
        else if (BMI >= 30 && BMI < 35){
            System.out.println("身体状态是:中度肥胖");
        }
        else if (BMI >= 35){
            System.out.println("身体状态是:重度肥胖");
        }
    }
}
