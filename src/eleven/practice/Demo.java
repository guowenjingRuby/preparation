package eleven.practice;

import eight.Dog;

/*
*1.为什么引入泛型，引入泛型的好处，泛型概念 T E V K
* 2.泛型类 泛型类的语法形式
* 3泛型方法  访问修饰符 <T> 返回类型 方法名（T t）
* 4.泛型接口  实现类不是泛型，那实现泛型的时候一定要指定泛型类的操作的类型
*           实现类是泛型，可以指定也可以不指定
*
* 5.泛型通配符：
*   ？：表示通配所有的。
*   ? extends 类名 通配所有类名或者类名的子类
*   ? super 类名  通配所有类名或者类名的父类
*
*
*
* */
public class Demo {

    public static void main(String[] args) {
//        Box要操作的数据指定为Number类型
        Box<Number> numberBox=new Box<>();
        numberBox.setKey(100);
//       静态方法调用静态方法，直接调用，如果静态方法中调用非静态方法，只能通过创建对象Demo对象去调用
        showKey(numberBox);
//        Box要操作的数据指定为Interger类型
        Box<Integer> integerBox=new Box<>();
        integerBox.setKey(20000);
        showKey(integerBox);

        Box<Dog> dogBox=new Box<Dog>();
        dogBox.setKey(new Dog("旺财","中华田园犬"));
        showKey(dogBox);
        System.out.println(numberBox.getClass()==numberBox.getClass());


    }
/*
* 方法重载，方法名一样，参数类型不一样，不能通过方法重载来解决问题，因为numberBox/numberBox本质上都Box类
* 可以放任何类型：？
* */
    /*创建一个静态的显示key的方法*/
    public static void showKey(Box<? > box){
        Object key = box.getKey();
        System.out.println(key);
    }

//    public static void showKey(Box<Integer> box){
//        Integer key = box.getKey();
//        System.out.println(key);
//    }
}
