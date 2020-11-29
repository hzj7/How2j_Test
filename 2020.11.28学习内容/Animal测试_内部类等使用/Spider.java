/**
 * @author Zejun_Huang
 * @date 2020/11/28 - 17:52
 */
public class Spider extends Animal{
    public Spider(){
        super(8);
        System.out.println("蜘蛛有8条腿");
    }

    @Override
    public void eat() {
        System.out.println("蜘蛛在吃......");
    }
}
