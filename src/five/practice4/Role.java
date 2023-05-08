package five.practice4;

/**
 * @version 1.0
 * @authoradmin
 * @Create by 2023/3/17 14:25
 */
public abstract class Role {
    private String name;
    private int age;
    private String sex;

    public Role(String name, int age, String sex) {
        this.name = name;
        this.age = age;
        this.sex = sex;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    abstract void play();
}
