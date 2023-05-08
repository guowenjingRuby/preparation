package eight;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Test {
    public static void main(String[] args) {
        Dog dog1=new Dog("旺财","拉布拉多");
        Dog dog2=new Dog("富贵","中华田园犬");
        Dog dog3=new Dog("二哈","雪纳瑞");
        Dog dog4=new Dog("小黑","藏獒");

//        List dogs=new ArrayList();
//        dogs.add(dog1);
//        dogs.add(dog2);
//        dogs.add(dog3);
//        //指定位置添加元素
//        dogs.add(2,dog4);
//        System.out.printf("删除之前有%s条狗。\n",dogs.size());
//        //删除指定位置的元素
//        dogs.remove(0);
//        //删除指定对象二哈，即dog3
//        dogs.remove(dog3);
//        System.out.printf("删除之后有%s条狗。\n",dogs.size());
////        System.out.printf("共计有%s条狗\n",dogs.size());
//        System.out.println("分别是：");
//        for (int i = 0; i < dogs.size(); i++) {
//            Dog dog= (Dog) dogs.get(i);
//            dog.printInfo();
//        }
//        if(dogs.contains(dog2)){
//            System.out.println("集合中包含"+dog2.getName()+"的信息。");
//        }else {
//            System.out.println("集合中不包含" + dog2.getName() + "的信息。");
//        }

        LinkedList dogs = new LinkedList();
        dogs.add(dog1);
        dogs.add(dog3);
        dogs.addLast(dog2);
        dogs.addFirst(dog4);

        Dog dogFirst= (Dog)dogs.getFirst();
        System.out.println("第一条狗狗昵称是"+dogFirst.getName() );

        Dog dogLast= (Dog)dogs.getLast();
        System.out.println("最后一条狗狗昵称是"+dogLast.getName());

        dogs.removeFirst();
        dogs.removeLast();
    }
}
