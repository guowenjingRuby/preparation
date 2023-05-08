package five.practice4;

/**
 * @version 1.0
 * @authoradmin
 * @Create by 2023/3/17 14:28
 */
public class Employee extends Role{
    private double salary;
    private static String id;

    public Employee(String id,String name, int age, String sex, double salary) {
        super(name, age, sex);
        this.salary = salary;
        this.id=id;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public static String getId() {
        return id;
    }

    public static void setId(String id) {
        Employee.id = id;
    }

    @Override
    void play() {
        System.out.print("员工编号为："+id);
    }

    final void sing(){
        System.out.print(",姓名："+this.getName()+",年龄："+this.getAge()+",性别："+this.getSex()+",工资："+getSalary());
    }
}
