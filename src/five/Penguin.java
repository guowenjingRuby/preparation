package five;

public final class Penguin extends Pets{
    //final修饰变量是一个常量值，不允许被修改。
    final String home="南极";
    private String sex;

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public Penguin(String name, int health, int love, String sex) {
        super(name, health, love);
        this.sex = sex;
    }

    @Override
    void printInfo() {
        System.out.println("宠物自白：");
        System.out.print("我的名字叫"+getName()+",健康值是"+getHealth()+",我和主人的亲密度是"+getLove()+",性别是："+sex);

    }


}
