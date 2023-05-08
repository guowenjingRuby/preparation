package eight.practice2;

import java.util.ArrayList;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        ArrayList<Student> arrayList = new ArrayList<>();
        while (true) {
            //这是学生管理系统的主界面
            System.out.println("--------欢迎来到学生管理系统--------");
            System.out.println("1 查看所有学生");
            System.out.println("2 添加学生");
            System.out.println("3 删除学生");
            System.out.println("4 修改学生");
            System.out.println("5 退出");
            System.out.println("请输入你的选择：");
            //创建键盘录入对象
            Scanner sc = new Scanner(System.in);
            String choiceString = sc.nextLine();
            //用switch语句实现选择
            switch (choiceString) {
                case "1":
                    findAllStudent(arrayList);
                    break;
                case "2":
                    addStudent(arrayList);
                    break;
                case "3":
                    deleStudent(arrayList);
                    break;
                case "4":
                    updateStudent(arrayList);
                    break;
                case "5":
                    //退出
                    //System.out.println("谢谢你的使用");
                    //break;
                default:
                    System.out.println("谢谢你的使用");
                    System.exit(0); //JVM退出
                    break;
            }
        }
    }

    private static void updateStudent(ArrayList<Student> arrayList) {
        //修改学生的思路：键盘录入一个学号，到集合中去查找，看是否有学生使用的是该 学号，如果有就修改该学生
        //创建键盘录入对象
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入你要修改的学生的学号：");
        String id = sc.nextLine();
        //定义一个索引
        int index = -1;
        //遍历集合
        for (int x = 0; x < arrayList.size(); x++) {
            //获取每一个学生对象
            Student s = arrayList.get(x);
            //拿学生对象的学号和键盘录入的学号进行比较
            if (s.getId().equals(id)) {
                index = x;
                break;
            }
        }
        if (index == -1) {
            System.out.println("不好意思,你要修改的学号对应的学生信息不存在,请回去重新你的选择");
        } else {
            System.out.println("请输入学生新姓名：");
            String name = sc.nextLine();
            System.out.println("请输入学生新年龄：");
            String age = sc.nextLine();
            System.out.println("请输入学生新居住地：");
            String address = sc.nextLine();
            //创建学生对象
            Student s = new Student();
            s.setId(id);
            s.setName(name);
            s.setAge(age);
            s.setAddress(address);
            //修改集合中的学生对象
            arrayList.set(index, s);
            //给出提示
            System.out.println("修改学生成功");
        }
    }

    private static void deleStudent(ArrayList<Student> arrayList) {
        //删除学生的思路：键盘录入一个学号，到集合中去查找，看是否有学生使用的是该 学号，如果有就删除该学生
        //创建键盘录入对象
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入你要删除的学生的学号：");
        String id = sc.nextLine();
        //我们必须给出学号不存在的时候的提示
        //定义一个索引
        int index = -1;
        //遍历集合
        for (int x = 0; x < arrayList.size(); x++) {
            Student s = arrayList.get(x);
            //拿这个学生对象的学号和键盘录入的学号进行比较
            if (s.getId().equals(id)) {
                index = x;
                break;
            }
        }
        if (index == -1) {
            System.out.println("不好意思,你要删除的学号对应的学生信息不存在,请回去重新你的选择");
        } else {
            arrayList.remove(index);
            System.out.println("删除学生成功");
        }
    }


    private static void addStudent(ArrayList<Student> arrayList) {
        Scanner sc = new Scanner(System.in);
        String id;
        while (true) {
            System.out.println("请输入学生学号：");
            //String id = sc.nextLine();
            id = sc.nextLine();
            //判断学号有没有被人占用
            //定义标记
            boolean flag = false;
            //遍历集合，得到每一个学生
            for (int i = 0; i < arrayList.size(); i++) {
                Student s = arrayList.get(i);
                if (s.getId().equals(id)) {
                    flag = true;
                    break;
                }
            }
            if (flag) {
                System.out.println("你输入的学号已经被占用,请重新输入");
            } else {
                break;
            }
        }
        System.out.println("请输入学生姓名：");
        String name = sc.nextLine();
        System.out.println("请输入学生年龄：");
        String age = sc.nextLine();
        System.out.println("请输入学生居住地：");
        String address = sc.nextLine();
        //创建学生对象
        Student s = new Student();
        s.setId(id);
        s.setName(name);
        s.setAge(age);
        s.setAddress(address);
        arrayList.add(s);
        System.out.println("添加学生成功");
    }

    private static void findAllStudent(ArrayList<Student> arrayList) {
        if (arrayList.size() == 0) {
            System.out.println("不好意思,目前没有学生信息可供查询,请回去重新选择你的操作");
            return;
        }
        System.out.println("学号\t姓名\t年龄\t居住地");
        for (int i = 0; i < arrayList.size(); i++) {
            Student student = arrayList.get(i);
            System.out.printf("%s\t%s\t%s\t%s\n", student.getId(), student.getName(), student.getAge(), student.getAddress());
        }
    }
}
