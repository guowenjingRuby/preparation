package five;

import java.util.Scanner;

/**
 * @version 1.0
 * @authoradmin
 * @Create by 2023/3/15 22:02
 */
public class Test {
    public static void main(String[] args) {
//        System.out.println("欢迎来到宠物商店");
//        System.out.print("输入要领养的宠物姓名：");
//        Scanner scanner=new Scanner(System.in);
//        String name = scanner.nextLine();
//        System.out.print("请输入宠物的类型（1.狗狗，2.企鹅）：");
//        String kind = scanner.nextLine();
//        if(kind.equals("1")){
//            //=定义类型对象类型，右边是给对象初始化。Dog()其实就是无参的构造方法
//            System.out.print("请选择狗狗的品种（1.拉布拉多，2.雪娜瑞）：");
//            String strain = scanner.nextLine();
//            if(strain.equals("1")){
//                strain="拉布拉多";
//            }else{
//                strain="雪娜瑞";
//            }
//            //创建对象时初始化成员变量，调用狗类的四个有参的构造方法
//            Dog dog=new Dog(name,200,0,strain);
//            dog.printInfo();
//        }else if (kind.equals("2")){
//            System.out.print("请选择企鹅的性别（1.Q仔，2.Q妹）：");
//            String sex = scanner.nextLine();
//            if(sex.equals("1")){
//                sex="男";
//            }else{
//                sex="女";
//            }
//            // 等号左边是声明类型，右边new Penguin(name,100,0,sex);调用了我们自己创建的构造方法。
//            Penguin penguin=new Penguin(name,100,20,sex);
//            penguin.printInfo();
//        }
        Dog dog=new Dog("狗子",100,20,"藏獒");
        dog.printInfo();






        }
    }




