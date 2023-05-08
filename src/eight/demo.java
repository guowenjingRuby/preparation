package eight;
/*  *表示将java.util中所有的都导进来*/
import java.util.*;

/*
数据类型：1.基本数据类型：字符串、数字（整数和小数）、布尔值
         2.引用数据类型：Student、Object、Customer、

    //定义了一个长度为30，数据类型为字符串的数组，用来存放班级姓名。
    String[] names = new String[30];
    //定义了一个长度为30的学生对象数组，【】表示是数组，Student表示只能存放Student类型的对象，并且最多只能存放30
    Student[] students=new Student[30];
    //定义一个长度为5类型为float的数组，存放成绩。
    float[] scores=new float[5];
   //定义了一个数据类型为Customer的，长度为30的数组，
    Customer[] customers=new Customer[30];
    数组类型声明的语法形式： 类[] 对象名=new 类[长度];
* 数组本质上也是容器：1.长度固定，2.一个数组只能存放固定类型的内容。
新的容器：集合：1.长度不固定，实际需要多少，就给多少。2.可以放不同类型的数据
集合都是在java.util。


/*
 Collection父类集合的操作
 * boolean add(Object o)向集合中添加一个元素
 * boolean addAll(Collection c)向集合中添加一个集合
 * void clear() 删除集合中所有的元素 a.clear()删除集合a所有的元素
 * boolean remove(Object o) 删除集合中指定的元素
 * boolean removeAll(Collection c)删除集合中所有的元素 a.removeAll(b)删除集合a中所有集合b的元素。
 * boolean isEmpty() 判断集合是否为空
 * boolean contains(Object o) 判断集合中是否包含o   a.contains("abc") a={1,3,4,2}
 * boolean containsAll(Collection c) 判定集合中是否包含指定集合中的所有元素。 a.contains(c) a={1,3,4,2} c={1,2}
 * Itertor iterator()产生一个遍历集合的迭代器
 * int size()获取该集合元素的个数。

 * List子集合中的操作：
 void add(int index,Object element):向集合中指定位置添加元素
boolean addAll(int index,Collect c):在指定位置添加一个集合
Object get(int index)：返回集合索引index处的元素
Object remove(int index):根据索引值删除元素
Object set(int index,Object element):将集合index处的元素替换成element
int indexOf(Object o)返回对象o在集合中出现的索引
int lastIndexOf(object o)：返回对象o在集合中最后一次出现的索引位置。
List subList(int fromIndex,int toIndex) 返回从fromIndex 到toIndex所有元素组成的集合,包含fromIndex不包含toIndex

LinkList操作：
void addFirst(Object o)将指定元素插入到此集合的开头
void addLast(Object o)将指定元素插入到此集合的结尾
Object getFirst()返回集合的第一个元素
Object getLast()返回集合的最后一个元素
Object removeFirst()删除并返回此集合的第一个元素
Object removeLast()删除并返回此集合的最后一个元素

processon
 */
/*
* 作业：
* 1.ArrayList添加删除元素操作图。LinkedList添加删除元素操作图
* 2.课堂上Collection、List的方法的操作代码，
* 3.回去自己练习LinkedList的操作。书上有例子。
* 4.ppt上的11、13页作业。ppt放课程群里了。
* */

public class demo {

    public static void main(String[] args) {
        ArrayList arrayList=new ArrayList();
        List list=new ArrayList();
        //集合可以存放不同数据类型,往集合中添加元素用 集合名.add()
        /*添加了一个字符串*/
        arrayList.add("求真、尚美、修德、长技");
        /*添加数值*/
        arrayList.add(1);

//        打印集合中添加的两个元素,首先是获取/访问集合中的元素，get方法 集合名.get(index)。index是从0开始-->集合的长度-1
//        System.out.printf("%s %s\n",arrayList.get(0),arrayList.get(1));
////        判断集合是否为空
//        System.out.println(arrayList.isEmpty());

        list.add(1);// --->0
        list.add(2);// --->1
        list.add(3);// --->2
        list.add("我爱学习");// --->3
        list.add(3);// --->4

//        System.out.println(list.subList(1,3));
//        System.out.println(list.indexOf(3));
//        System.out.println();
//        System.out.println(list.indexOf("我爱学习"));
//        list.set(3,"我爱学习");
//        list.remove(2);
//        System.out.println(list.get(3));
//        list.add(0,"1111");
//        list.addAll(0,arrayList);
//        System.out.println(list.size());


//        是将arraylist中所有的元素都添加到collection中
//        System.out.println(collection.addAll(arrayList));

//        collection.clear();
//        collection.remove(2);
//        collection.removeAll(arrayList);
//        System.out.println(collection.contains(3));
//        System.out.println(collection.containsAll(arrayList));
//        System.out.println(collection.size());
//       产生一个迭代器，用来遍历集合
        Iterator it=list.subList(1,3).iterator();
        /*遍历collection中的元素*/
//      先判断集合中是否存在下一个元素
        while(it.hasNext()){
                //获取下一个元素，并不知道下一个元素的类型，所以定义为obj类型
                Object obj=it.next();
                System.out.println(obj);
            }
    }

}
