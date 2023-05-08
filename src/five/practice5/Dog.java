package five.practice5;

/**
 * @version 1.0
 * @authoradmin
 * @Create by 2023/3/20 15:06
 */
public class Dog extends Animal{
    public Dog(String type) {
        super(type);
    }

    @Override
    public void eat() {
        System.out.println("狗在吃东西");
    }

    @Override
    public void sleep() {
        System.out.println("狗在睡觉");
    }
}
