/**
 * @author Zejun_Huang
 * @date 2020/11/28 - 18:12
 */
public class Test {
    public static void main(String[] args) {
        Spider spider = new Spider();
        spider.eat();
        spider.walk();
        System.out.println(spider.legs);

        Cat cat1 = new Cat();
        Cat cat2 = new Cat("Tom");
        System.out.println(cat1.getName());
        System.out.println(cat2.getName());
        cat1.setName("Sam");
        System.out.println(cat1.getName());
        cat1.eat();
        cat2.walk();
        cat1.play();

        Fish fish = new Fish();
        System.out.println(fish.getName());
        fish.setName("Cool");
        System.out.println(fish.getName());
        fish.eat();
        fish.walk();
        fish.play();

        Animal A = new Animal() {
            @Override
            public void eat() {
                System.out.println("干饭");
            }
        };
        A.eat();
    }
}
