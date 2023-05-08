package ten;

import eight.Dog;
import six.Penguin;

import java.util.ArrayList;
import java.util.Iterator;

/*
 * Iterator
 *   Collection
 *       List:顺序，可重复
 *           ArrayList：查询修改效率高
 *           LinkedList：删除和新增效率高
 *       Set：无序，无重复
 *           hashSet：hascode（）和equal方法.无序，无重复
 *           TreeSet:有序，利用树的结构实现了有序。但是也是无重复，是通过添加的数据类型实现Comparable接口中的compareTo。
 *           也可以通过Comparator接口中比较方法。
 *
 *   Map：键值对形式
 *       HashMap：无序的键值对
 *       TreeMap：有序的键值对。
 *
 * 泛型：
 * 1.为什么引入泛型，泛型是什么？
 * 如果arraylist存放100个不同类型的元素，要重复写很多强制类型转换语句，不符合代码复用的逻辑，集合放的元素不定
 * 能不能在创建arrayList集合的时候，限定里面只能放某一个类型，不准其他类型。
 * 限定只能放String类型:将运行时的错误提前暴露到编译阶段.有安全机制
 * 如果想往集合中添加int类型。
 * 集合泛型：只能用类类型（除了基本类型以外的类型）
 * String doJucier(String fruit):
 *  return fruit+"汁";
 * 调用 doJuicer("苹果")
 * 调用 doJuicer(1111)
 * 泛型：定义泛型类的时候不写其操作的数据类型，去创建对象的时候才指定操作的类型
 * 如何去定义泛型类
 * */
public class Demo {
    public static void main(String[] args) {
        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("我爱学习");
//        arrayList.add(100);
//        arrayList.add(new Dog("狗子","中华田园犬"));
//        arrayList.add(new Penguin("偶偶",100,0,"女"));
        arrayList.add("Java");
        arrayList.add("Python");
        arrayList.add("JavaScript");


        /*当不使用泛型的时候，用add方法往集合中添加的内容统一以Object类的对象存进集合中，自然取出来也是obj*/
        Iterator iterator = arrayList.iterator();
        while (iterator.hasNext()) {
            Object next = iterator.next();
            //类型强制转换之前先判断一下类型是不是这个子类，instanceof
//            if(next instanceof String) {
//            String strNext = (String) next;
            System.out.println(next);
//            }else if(next instanceof Integer){
//                int intNext=(Integer)next;
//                System.out.println(intNext);
//            }else {
//                Dog dogNext=(Dog)next;
//                System.out.println(dogNext);
//            }

            }
        System.out.println("================================");

        ArrayList<Integer> intList=new ArrayList<>();
        intList.add(100);
        intList.add(99);
        intList.add(90);
        Iterator<Integer> it = intList.iterator();
        while(it.hasNext()){
            int intnext=it.next();
            System.out.println(intnext);

        }


    }
}
