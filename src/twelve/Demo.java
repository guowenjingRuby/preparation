package twelve;

import java.util.ArrayList;

/*
* 数据类型：基本数据类型int、float、double、boolean、char
* 引用类型（类类型）
*之前学习中遇到的问题：泛型里只能放引用类型，不能放基本数据类型。所以要基本数据类型都包装成类类型
*
*分为两类：一种是将基本数据类型（int，String）转换成Integer类型：valueOf
	第二种Integer类型转换成其他的基本数据类型，Integer.doubleVallue() 将Integer类型转换成double类型
				                         Integer.byteValue():将Integer类型转换成byte类型
				                         Integer.
基本数据类型之间的转换如何进行？
高阶---》低阶：强制类型转换。
* */
public class Demo {
    public static void main(String[] args) {
        ArrayList<Integer> integers=new ArrayList<>();

        int num1=111;
        int num2=222;
        //先将基本数据类型int转换成Integer,jdk1.5以前的操作方式
        /*Integer integer1=new Integer(num1);
        Integer integer2=new Integer(num2);*/
        Integer integer1 = Integer.valueOf(num1);
        Integer integer2 = Integer.valueOf(num2);
        integers.add(integer1);
        integers.add(integer2);

        /*将字符串类型转成int类型：parseInt（）*/
        int i1 = Integer.parseInt("100");
        integers.add(i1);


        //定义string类型的变量，通过Integer（String s）构造方法，返回一个Integer类型对象
        String str1="123";
        String str2="456";

        /*Integer integer_str1=new Integer(str1);
        Integer integer_str2=new Integer(str2);*/
        Integer integer3 = Integer.valueOf(str1);
        Integer integer4 = Integer.valueOf(str2);

        integers.add(integer3);
        integers.add(integer4);


        /*num1/num2是基本数据类型int，arraylist的add方法里面要求放Integer类型。
        * 用add方法添加int类型没有报错，那说明java已经帮我们实现了，int类型向Integer类型的一个自动转换-装箱
        * 当然现在也可以自动拆箱，从包装类型到基本数据类型*/
        integers.add(num1);
        integers.add(num2);

        for (int i = 0; i < integers.size(); i++) {
            Integer integer = integers.get(i);
            System.out.println(integer);

        }


    }
}
