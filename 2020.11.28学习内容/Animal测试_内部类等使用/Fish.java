
/**
 * @author Zejun_Huang
 * @date 2020/11/28 - 18:06
 */
public class Fish extends Animal implements Pet{
    public Fish(){
        super();
        System.out.println("鱼没有腿");
    }
    private String name;
    @Override
    public void walk() {
        System.out.println("鱼没有腿，不能走路");
    }

    @Override
    public void eat() {
        System.out.println("鱼吃.......");
    }

    @Override
    public void setName(String name) {
        System.out.println("这条鱼的名字要从"+this.name+"变成"+name);
        this.name = name;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void play() {
        System.out.println(this.name + "is playing");
    }
}
