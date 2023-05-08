package six;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
/*
        Dog dog=new Dog("汪星人",100,0,"雪纳瑞");
        Penguin penguin=new Penguin("白白",100,0,"Q妹");
        //创建猫类对象
        Cat cat=new Cat("喵星人",100,0);
        Master master=new Master("张三",1000);
        //给狗喂食
        master.feed(dog);
        //给企鹅喂食
        master.feed(penguin);
        //给猫类喂食
        master.feed(cat);
*/
//        Dog dog=new Dog("汪星人",100,0,"雪纳瑞");
//        dog.eat();
        //将狗对象转换成了宠物  ==右边是狗类的实例化对象，==左边是宠物类的生命。其实做了一个向上的类型转换，就是子类对象转换成父类。
//        Pet pet=new Dog("汪星人",100,0,"雪纳瑞");

//        Pet pet=new Penguin("白白",100,0,"Q妹");
        Pet pet =new Cat("喵星人",100,0);
        pet.eat();
        Master master=new Master("张三",1000);
        master.feed(pet);
       /*为什么dog对象转换成了宠物，还调用Dog类里面的eat方法？而不是调用Pets的eat方法呢？*/

      /*  *//**
         * 基本数据类型转换
         * 1.从低到高
         * int---->double
         *//*
        int num=5;
        double num1 = num;
        System.out.println(num1);

        *//**
         * 基本数据类型转换
         * 2.从高到低
         * double--->int。需要强制类型转换。
         *//*
        double num2=5.3;
        int num3= (int) num2;
        System.out.println(num3);*/


//        System.out.println("欢迎来到宠物商店");
//        System.out.print("请选择领养的宠物类型（1，狗，2.企鹅）：");
//        Scanner scanner=new Scanner(System.in);
//        int typeId= Integer.parseInt(scanner.nextLine());
//        Master master=new Master("张三",1000);
//        Pet pet=master.getPet(typeId);
//        if(pet!=null){
//            System.out.println("领养成功");
//            master.feed(pet);
//        }else{
//            System.out.println("对不起啊，没有这种宠物");
//        }



//        Pet pet=new Dog("汪星人",100,0,"雪纳瑞");
        //调用了子类重写的父类的eat();
//        pet.eat();
        //调用狗的接飞盘游戏方法。，父类 不可以直接调用子类特有的方法,用idea工具调试错误，自动做了强制类型转换
//        ((Dog) pet).catchingFlyDisc();
        //将宠物类向下做个强制类型转换
        /*instanceof：判断某个实例是否属于某个类，判断结果是个布尔值
        *
         */
//        if(pet instanceof Dog){
//            Dog dog=(Dog) pet;
//            dog.catchingFlyDisc();
//        }else if(pet instanceof Penguin){
//            Penguin penguin=(Penguin)pet;
//            penguin.swimming();
//        }
//        Pet pet=new Penguin("白白",100,0,"Q妹");
//        Master master=new Master("张三",1000);
//        master.play(pet);




    }
}
