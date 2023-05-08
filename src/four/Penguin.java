package four;

/**
 * @version 1.0
 * @authoradmin
 * @Create by 2023/3/3 12:45
 * 企鹅类中添加一个无参构造方法，一个四个参数的构造方法。修改对应的测试类，通过调用四个参数的构造方法，实现需求。
 */
public class Penguin {


    private String name;
    private int health;
    private int love;
    static String sex;
//    final修饰成员变量表示常量。static修饰表示时静态的。
    static final String SEX_MALE="Q仔";
    static final String SEX_FEMALE="Q妹";
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getLove() {
        return love;
    }

    public void setLove(int love) {
        this.love = love;
    }

    public static String getSex() {
        return sex;
    }

    public static void setSex(String sex) {
        Penguin.sex = sex;
    }
    /**
     * 健康的set方法
     */
    public void setHealth(int health){
        if(health>100||health<20){
            health=40;
        }
        this.health=health;
    }
    /**
     * get方法
     */
    public int getHealth(){
        return health;
    }



    /**
     *
     */

    public Penguin () {
        health=100;
        love = 0;
    }

    public Penguin(String name, int health, int love) {
        this.name = name;
        this.health = health;
        this.love = love;
    }
    public static void main(String[] args) {
//        Penguin penguin=new Penguin();
//        penguin.name="小白";
//        静态方法中可以直接调用同类中的静态成员，但不能直接调用非静态成员,name非静态。sex是静态
//        name="小白";
//        sex="男";
//        静态方法中可以直接调用同类中的静态方法，但不能直接调用非静态方法，
//需要通过对象来访问非静态方法。
//        printInfo();

    }

    /**
     * 四个参数的构造方法
     */
    public Penguin(String name,int health,int love,String sex){
//        this 关键字
        this.name=name;
        if(health>100||health<0){
            health=20;
        }
        this.health=health;
        this.love=love;
        this.sex=sex;
    }


    /**
     * 企鹅自白方法
     */
     void printInfo(){
        System.out.println("宠物自白：");
        System.out.println("我的名字叫"+name+",健康值是"+health+",我和主人的亲密度"+love+"，性别"+sex);
        test();
    }
    static void test(){
        System.out.println();
    }

}
