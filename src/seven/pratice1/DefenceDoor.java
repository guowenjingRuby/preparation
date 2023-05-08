package seven.pratice1;
/*
* java里面继承是单继承，一个子类只能继承一个父类，不能继承多个父类
* 那我们就引入了接口。一个类可以继承多个接口
*
 * 定义一个类的语法形式：
 *  public 或者默认  class  类名{}
 *
 * 继承一个类的语法形式（一个子类只能继承一个父类，extends后面只能放一个类名）：
 * 修饰符 class 子类  extends 父类名{}
 *
* 定义一个接口语法形式：
*   public interface 接口名{}
* 一个类实现一个接口的语法形式（多继承，implements后面可以放多个接口，多个接口名之间用英文输入下的逗号隔开）：
*   class 类名 implements 接口名1，接口名2....{}
*
*
* 接口不叫继承（extends），叫实现（implements）,接口不用类（class）修饰。用interface修饰。
* 多继承之间用逗号隔开。
*
* 防盗门具有铃声的功能：只能让其实现接口中铃声的功能
*
*
* 接口默认都是抽象的，接口中的方法也都是抽象。
*
* 为什么防盗门是继承门，实现锁。而不是继承锁实现门？
* 换而言之，什么时候用继承，什么时候实现。
* 防盗门是门 DefenceDoor extends Door
* 防盗门是门，不是锁，只是具有锁的功能
* 防盗门是门，不是铃声，只是具有铃声的功能
* Dog是宠物 Dog extends Pet
* Cat是宠物 Cat extends Pet
*
*
*
* 卡车是交通工具 卡车 extends 交通工具
* 轿车是交通工具  轿车 extends 交通工具
* 班车是交通工具
*
*
* 继承：什么是什么，这种句式用继承
* 接口（实现）：具有什么什么功能，用接口。
* 包的概念
* */
public class DefenceDoor extends Door implements Lock,Photo,Bell{
    @Override
    void open() {
        System.out.println("开门");
    }

    @Override
    void close() {
        System.out.println("关门");

    }

    @Override
    public void upLock() {
        System.out.println("钥匙往后拧一圈，锁开了");
    }

    @Override
    public void closeLock() {
        System.out.println("钥匙往前拧一圈，锁开上了");
    }

    @Override
    public void takePicture() {
        System.out.println("请进行人脸拍照，记录访客。");
    }

    @Override
    public void doorBell() {
        System.out.println("叮叮叮。。。。");
    }
}
