package five.practice7;

/**
 * @version 1.0
 * @authoradmin
 * @Create by 2023/3/21 11:06
 */
public class Student extends Person{
    String school;
    public Student(){
        //super();//有没有该语句，效果都一样
        System.out.println("execute Student()");
    }
    public Student(String name,String school){
        super(name);
        this.school=school;
        System.out.println("execute Student(name,school)");
    }
}
