package four;
/**
 * 有返回值：
 *      1.无参方法（）
 *      2.有参方法（参数列表）
 *          1.一个参数，添加学生的姓名
 *          2.多个参数的方法，添加五个学生成绩
 *          3.字符串数组做参数，录入五个学生蓝桥杯成绩
 *          4.学生类型作为参数（对象类型作为参数），添加一个学生，并显示这个学生的基本信息。
 *       return
 *void 无返回值
 *   1.无参方法（）
 *  *      2.有参方法（参数列表）
 *  *          1.一个参数，添加学生的姓名
 *  *          2.多个参数的方法，添加五个学生成绩
 *  *          3.字符串数组做参数，录入五个学生蓝桥杯成绩
 *  *          4.学生类型作为参数（对象类型作为参数），添加一个学生，并显示这个学生的基本信息。
 *
 *
 * 构造方法:1.所有的类都一个默认的无参数构造方法。
 *          2.当我们自定义一个有参的构造方法，系统将不在调用默认的构造方法
 *          3.作用：帮助我们通过对象初始化类中的成员变量。所以如果有参数，参数一定是成员变量中的一个或者多个。
 *
 * 重载：方法名一样，参数个数不一样，就被称为方法重载。
 *
 * this关键字作用：就是表示要实例化的对象。
 *      1.调用属性
 *      2.调用方法
 *      3.调用构造方法
 *
 *  构造方法语法形式：
 *  public 类名（参数类别）{
 *
 *  }
 *
 *  final修饰成员变量表示常量。static修饰表示时静态的。
 *
 *  静态成员变量的访问方式  类名.静态成员变量名  对象名.静态成员变量名
 *  1.静态方法中可以直接调用同类中的静态成员，但不能直接调用非静态成员
 *  2.静态方法中可以直接调用同类中的静态方法，但不能直接调用非静态方法，
 * 需要通过对象来访问非静态方法。
 * 1.2如果想要在静态方法中访问非静态方法或非静态成员变量，只能通过类去创建对象访问。
 * 3.在普通的方法中可以访问静态和非静态的方法或者变量。
 * 4.static 除了修饰方法和成员变量外，还可以修饰代码块（就是{}中的内容。）
 * 静态初始化块只在类加载时执行，且只执行一次，同时静态初始化块只给静态变量赋值，不能初始化普通的成员变量。
 *
 *
 * 总结：初始化成员变量可以通过构造方法，也可以通过set方法。
 * 抽取类的时候，要学会先画类图。
 *
 */

/**
 * @version 1.0
 * @authoradmin
 * @Create by 2023/3/3 12:44
 */
public class Dog {
    private String name;
    private int health;
    private int love;
    private String strain;

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public int getLove() {
        return love;
    }

    public void setLove(int love) {
        this.love = love;
    }


    public void setName(String name1){
        if(name.equals("秦始皇")){
            name="gouzi";
        }
        this.name=name1;
    }
    public String getName(){
        return name;
    }

    public String getStrain() {
        return strain;
    }

    public void setStrain(String strain) {
        this.strain = strain;
    }
    /**
     * 狗类的无参构造方法，通过构造方法实现了health和love的初始化。
     */
    public Dog(){
        System.out.println("我是无参构造方法，我被执行了吗？");
        health=100;
        love=0;
    }

    /**
     * 有1参的构造方法
     */
    public Dog(int health1){
        this.health=health1;
    }
    /**
     * 多个参数的够着方法
     */
    public Dog(String name,int health,int love,String strain){
        this.name=name;
        if(health>100 || health<0){
            health=20;
        }
        this.health=health;
        this.love=love;
        this.strain=strain;
    }

    /**
     * 狗狗自白方法
     */
    void printInfo(){
        System.out.println("宠物自白：");
        System.out.println("我的名字叫"+name+",健康值是"+health+",我和主人的亲密度是"+love+"，我是一只"+strain);
    }

    void testSuper(){
        System.out.println("重写testSuper方法");
    }

}
