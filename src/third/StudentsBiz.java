package third;

import javax.rmi.ssl.SslRMIClientSocketFactory;

/**
 * @version 1.0
 * @authoradmin
 * @Create by 2023/2/28 13:25
 */
public class StudentsBiz {
    //定义了一个长度为30，数据类型为字符串的数组，用来存放班级姓名。
    String[] names = new String[30];
    //定义了一个长度为30的学生对象数组，【】表示是数组，Student表示只能存放Student类型的对象，并且最多只能存放30
    Student[] students=new Student[30];

    public void addName(String name) {
        //增加学生姓名
        for(int i=0;i<names.length;i++){
            //每次从数组中为空的那个位置开始插入。
            if(names[i]==null){
                names[i]=name;
                break;
            }
        }
        System.out.println("学生姓名添加成功");
    }

    /**
     * 实现不光能添加学生姓名，同时添加学号，年龄，成绩
     *第一种方式：将姓名、学号、年龄、成绩作为参数传递进来
     * 第二种方式：将姓名、学号、年龄、成绩封装到学生类中，将学生类的对象作为参数传递进来
     *
     * 补充学生类中的成员变量和方法，测试添加学生是否成功。
     */
//    public void addInfos(String name,String id,int age,float score){
//
//    }
    public void addStudent(Student student){
        //找到存放学生数组中第一个为空的元素，将学生添加进去
        for(int i=0;i<students.length;i++){
            if(students[i]==null){
                students[i]=student;
                break;
            }
        }
    }

    public void showNames() {
        System.out.println("学生姓名如下：");
        //显示全部学生姓名
        for(int i=0;i<names.length;i++) {
            if(names[i]!=null) {
                System.out.print(names[i]+"  ");
            }
        }


    }

    public boolean searchName (int start, int end, String name) {
        boolean find = false;  // 是否找到标识
        // 指定区间数组中，查找姓名
        for(int i=start-1;i<end;i++) {
            if(name.equals(names[i])) {
                find=true;
                break;
            }
        }
        return find;
    }


    public void showStudents(){
        System.out.println("本班学生列表：");
        for(int i=0;i<students.length;i++) {
            if(students[i]!=null) {
                students[i].showInfo();
            }
        }
    }


}
