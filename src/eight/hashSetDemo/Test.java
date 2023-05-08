package eight.hashSetDemo;

import java.util.HashSet;

public class Test {
    public static void main(String[] args) {
        HashSet hs = new HashSet();		              // 创建HashSet集合
        Student stu1 = new Student("1", "张三");    // 创建Student对象
        Student stu2 = new Student("2", "李四");
        Student stu3 = new Student("2", "李四");
        hs.add(stu2);
        hs.add(stu1);
        hs.add(stu3);
        System.out.println(hs);
    }

}
