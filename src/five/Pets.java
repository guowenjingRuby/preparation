package five;

/**
 * @version 1.0
 * @authoradmin
 * @Create by 2023/3/15 21:50
 */
public abstract class  Pets {
//    private String name;
//    protected String name;
    String name;
//    public String name;
    private int health;
    private int love;

    public Pets(){
        name="狗子333333";
        health=70;
        love=10;
        System.out.println("宠物类的无参的构造方法");
    }

    public Pets(String name, int health, int love) {
        this.name = name;
        //防止初始化时非法传入
        if(health>100||health<0){
            health=40;
        }
        this.health = health;
        this.love = love;
        System.out.println("宠物类3个参数的构造方法");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        //防止外界通过Pets类的对象或者子类的对象传入非法的健康值。
        if(health>100||health<0){
            health=20;
        }
        this.health = health;
    }

    public int getLove() {
        return love;
    }

    public void setLove(int love) {
        this.love = love;
    }

    abstract void printInfo();

    final void testSuper(){
        System.out.println("父类中的实例方法");
    }
//    {
//        System.out.println("宠物自白：");
//        System.out.print("我的名字叫"+name+",健康值是"+health+",我和主人的亲密度是"+love);
//    }

//    void test(){
//        printInfo();
//    }
        void test(){
            System.out.println("父类的测试");
        }
}
