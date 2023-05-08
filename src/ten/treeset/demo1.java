package ten.treeset;

import java.util.Comparator;
import java.util.TreeSet;

public class demo1
{
    public static void main(String[] args) {
/*基本数据类型Interg实现了camparable接口的camparaTo()方法*/
//        TreeSet ts=new TreeSet<>();
//        ts.add(3);
//        ts.add(1);
//        ts.add(1);
//        ts.add(2);
//        ts.add(3);
//        System.out.println(ts);

        /*Student类没有实现camparable接口的camparaTo()方法时，TreeSet不会对其进行排序*/
//        TreeSet ts=new TreeSet<>(new Comparator<Student>() {
//            @Override
//            public int compare(Student o1, Student o2) {
//                return o1.getId().charAt(0)-o2.getId().charAt(0);
//            }
//        });
        TreeSet ts=new TreeSet();
        ts.add(new Student("1","李白"));
        ts.add(new Student("2","杜甫"));
        ts.add(new Student("2","杜甫"));
        ts.add(new Student("3","李清照"));

        System.out.println(ts);
    }
}
