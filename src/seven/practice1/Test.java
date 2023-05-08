package seven.practice1;

public class Test {
    public static void main(String[] args) {
        //子类向父类进行类型转换，自然而然的过程，从低到高转换
        Door defenceDoor=new DefenceDoor();
        //进门流程
//        门铃、拍照、开锁、关锁是子类里面特有的，父类里面没有，需要将父类转换成子类。从高到底，强制转换。
        if (defenceDoor instanceof DefenceDoor) {
            ((DefenceDoor) defenceDoor).doorBell();
            ((DefenceDoor) defenceDoor).takePicture();
            ((DefenceDoor) defenceDoor).upLock();
        }
        defenceDoor.open();
        //离开流程
        defenceDoor.close();
        if (defenceDoor instanceof DefenceDoor) {
            ((DefenceDoor) defenceDoor).closeLock();
        }
    }
}
