package five.practice5;

/**
 * @version 1.0
 * @authoradmin
 * @Create by 2023/3/20 15:04
 */
public abstract class Animal {
    private String type;

    public Animal(String type) {
        this.type = type;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public abstract void eat();

    public abstract void sleep();
}
