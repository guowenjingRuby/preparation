package third;

import java.util.Scanner;

/**
 * @version 1.0
 * @authoradmin
 * @Create by 2023/2/28 13:36
 */
public class TestStudentsBiz {
    public static void main(String[] args) {
        StudentsBiz studentsBiz = new StudentsBiz();

        Scanner scanner = new Scanner(System.in);
//        //录入
//        for(int i=0;i<5;i++){
//            System.out.print("请输入学生姓名：");
//            String name = scanner.next();
//            studentsBiz.addName(name);
//        }
//        //显示
//        studentsBiz.showNames();
//        //查找
//        System.out.print("\n请输入开始查找的位置：");
//        int start=scanner.nextInt();
//        System.out.print("请输入结束查找的位置：");
//        int end=scanner.nextInt();
//        System.out.print("请输入查找的学生姓名：");
//        String name1 = scanner.next();
//        System.out.println("*********查找结果*********");
//        if(studentsBiz.searchName(start,end,name1)){
//            System.out.println("这个同学是我们班的");
//        }else{
//            System.out.println("这个同学不是我们班的");
//        }

        //以此添加多个学生
        while(1==1) {
            //根据Student类创建student对象，输入姓名、学号、年龄、分数。
            Student student = new Student();
            System.out.print("请输入学生学号：");
            String studentId = scanner.nextLine();
            //将输入的学号赋值给student的学号
            student.studentId=studentId;
            if(studentId.equals("q")){
                break;
            }
            System.out.print("请输入学生姓名：");
            String  name= scanner.nextLine();
            //将输入的姓名赋值给student的姓名
            student.name=name;

            System.out.print("请输入学生年龄：");
            int age = Integer.parseInt(scanner.nextLine());
            //将输入的年龄赋值给student的年龄
            student.age=age;

            System.out.print("请输入学生分数：");
            float score = Float.parseFloat(scanner.nextLine());
            //将输入的分数赋值给student的分数
            student.score=score;

            //添加学生
            studentsBiz.addStudent(student);

        }
        //显示学生信息
        studentsBiz.showStudents();
    }

}
