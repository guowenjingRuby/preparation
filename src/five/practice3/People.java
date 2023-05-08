package five.practice3;

/**
 * @version 1.0
 * @authoradmin
 * @Create by 2023/3/17 14:53
 */
public class People extends Monkey{
    public People(String name) {
        super(name);
    }

    @Override
    public void speak() {
//        super.speak();
        System.out.println("小样的，不错嘛！会说话了！");
    }
}
