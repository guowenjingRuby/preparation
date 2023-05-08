package ten.treemap;

import java.util.Comparator;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeMap;

public class Test {
    public static void main(String[] args) {
        TreeMap tm = new TreeMap(new Comparator<Student>() {

            @Override
            public int compare(Student o1, Student o2) {
                int num = o1.getName().compareTo(o2.getName());
                return num == 0 ? num : o1.getAge() - o2.getAge();
            }
        });

        tm.put(new Student("杜甫", 100), "西安");
        tm.put(new Student("李白", 101), "北京");
        tm.put(new Student("李清照", 99), "上海");
        tm.put(new Student("杜甫", 100), "南京");

        Set keySet=tm.keySet();
        Iterator it=keySet.iterator();
        while(it.hasNext()){
            Object key=it.next();
            System.out.println(key+":"+tm.get(key));
        }
    }
}
