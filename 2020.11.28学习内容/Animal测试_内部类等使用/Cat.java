/**
 * @author Zejun_Huang
 * @date 2020/11/28 - 17:57
 */
public class Cat extends Animal implements Pet {
    protected Cat() {
        super(4);
        System.out.println("猫有4条腿");
    }
    public Cat(String name){
        super(4);
        this.name = name;
    }
    private String name;
    @Override
    public void eat() {
        System.out.println("猫在吃......");
    }

    @Override
    public void setName(String name) {
        System.out.println("原来的名字"+this.name+"即将被替换为"+name);
        this.name = name;
    }
    public String getName(){
        return this.name;
    }
    public void play(){
        System.out.println(this.name + "is playing");
    }
}
