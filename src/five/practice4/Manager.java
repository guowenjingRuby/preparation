package five.practice4;

/**
 * @version 1.0
 * @authoradmin
 * @Create by 2023/3/17 14:34
 */
public class Manager extends Employee{
    private String vehicle;

    public Manager(String id,String name, int age, String sex, double salary,String vehicle) {
        super(id,name, age, sex, salary);
        this.vehicle=vehicle;
    }
    void driver(){
        super.play();
        super.sing();
        System.out.println(",交通工具是："+this.vehicle);
    }
}
