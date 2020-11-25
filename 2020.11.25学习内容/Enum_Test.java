/**
 * @author Zejun_Huang
 * @date 2020/11/25 - 17:03
 */
public class Enum_Test {
    public static void main(String[] args) {
        Enum LOL = Enum.WIZARD;   //枚举类要这样定义
        switch (LOL){
            case PUSH:
                System.out.println("推进");
                break;
            case ASSASSIN:
                System.out.println("刺客");
                break;
            case ASSIST:
                System.out.println("辅助");
                break;
            case WIZARD:
                System.out.println("法师");
                break;
            case TANK:
                System.out.println("坦克");
                break;
            case RANGED:
                System.out.println("远程");
                break;
            case FARMING:
                System.out.println("打野");
                break;
            case WARRIOR:
                System.out.println("近战");
                break;
        }
        for (Enum s:Enum.values()){     //通过增强for循环来输出Enum里的全部结果
            System.out.println(s);
        }
    }
}
