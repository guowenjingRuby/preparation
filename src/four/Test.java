package four;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
//        System.out.println(Dog.name);
        System.out.println("欢迎来到宠物商店");
        System.out.print("输入要领养的宠物姓名：");
        Scanner scanner=new Scanner(System.in);
        String name = scanner.nextLine();
        System.out.print("请输入宠物的类型（1.狗狗，2.企鹅）：");
        String kind = scanner.nextLine();
        if(kind.equals("1")){
            //=定义类型对象类型，右边是给对象初始化。Dog()其实就是无参的构造方法
            System.out.print("请选择狗狗的品种（1.拉布拉多，2.雪娜瑞）：");
            String strain = scanner.nextLine();
            if(strain.equals("1")){
                strain="拉布拉多";
            }else{
                strain="雪娜瑞";
            }
            //创建对象时初始化成员变量，调用狗类的四个有参的构造方法
            Dog dog=new Dog(name,200,0,strain);
//            dog.setName("狗子");
//            System.out.println(dog.getName());
////            注销无参构造方法，创建一个无参的狗对象
//            Dog dog1=new Dog();
            dog.printInfo();
        }else if (kind.equals("2")){
            System.out.print("请选择企鹅的性别（1.Q仔，2.Q妹）：");
            String sex = scanner.nextLine();
            if(sex.equals("1")){
//                //通过静态常量对性别进行赋值
//                sex=Penguin.SEX_MALE;
                //通过静态变量对性别进行赋值
                Penguin.sex="雄";
                sex=Penguin.sex;
            }else{
//                //通过静态常量对性别进行赋值
//                sex=Penguin.SEX_FEMALE;
                //通过静态变量对性别进行赋值
                Penguin.sex="雌";
                sex=Penguin.sex;
            }
            // 等号左边是声明类型，右边new Penguin(name,100,0,sex);调用了我们自己创建的构造方法。
            Penguin penguin=new Penguin(name,100,20,sex);
            penguin.printInfo();
        }
        //因为sex是静态成员变量，所以可以通过类名去赋值。
        /***
         *     static String sex;sex加了static表示是类属性，类是模板，表示sex如果做了修改，所有的对象都要修改
         *     修改类属性有两种方式：类名.类属性=值；
         *                       对象名.类属性=值
         *          Penguin.sex="女";
         *         Penguin penguin2=new Penguin();
         *         penguin2.sex="男";
         *
         *         String name;普通的成员变量.只能通过对象修改，只是修改某一个对象。
         */

//        Penguin penguin2=new Penguin();
//        penguin2.setHealth(-1000);
//        System.out.println(penguin2.getHealth());
////        penguin2.sex="男";
//        //通过对象去访问修改对象属性值。容易出现非法输入。
////        penguin2.=-1000;
//        //等号右边，通过类名去访问了SEX_FEMALE。静态成员变量的访问方式类名.静态成员变量名
////        Penguin penguin3=new Penguin();
//        penguin2.printInfo();
////        penguin3.printInfo();
    }
}
