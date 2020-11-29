/**
 * @author Zejun_Huang
 * @date 2020/11/28 - 17:47
 */
public abstract class Animal {
    protected int legs;
    protected  Animal(){
        System.out.println("这动物没有腿");
    }
    protected Animal(int legs){
        this.legs = legs;
        System.out.println("这动物有"+legs+"条腿");
    }
    public abstract void eat();
    public void walk(){
        System.out.println("它用"+this.legs+"走路");
    }
}
