package five;

/**
 * @version 1.0
 * @authoradmin
 * @Create by 2023/3/15 21:53
 */
public class Dog extends Pets{
    private String strain;

    public Dog(){
        super();//加不加一样
        super.name="狗子444444444";
        System.out.println("狗类的无参的构造方法");
    }

    public Dog(String name,int health, int love){
        super(name,health,love);
        System.out.println("狗类三个参数的构造方法。");
    }
    public Dog(String name, int health, int love,String strain) {
//        super();//加不加一样
//        super(name, health, love);
        this();
//        this(name,health,love);
        this.strain=strain;
    }

    public String getStrain() {
        return strain;
    }

    public void setStrain(String strain) {
        this.strain = strain;
    }

//    public void printInfo(){
//        super.printInfo();
//        System.out.print(",我的品种是："+strain);
//
//    }
    @Override
    void printInfo(){
        System.out.println("宠物自白：");
        super.testSuper();
        this.test();
        System.out.print("我的名字叫"+getName()+",健康值是"+getHealth()+",我和主人的亲密度是"+getLove()+",品种："+strain);

    }
//    static void test(){
//        this.printInfo();
//        super.test();
//        System.out.println("测试实例方法中是否this和super是否可以共存，并且不要求位置在第一行");
//    }
}
