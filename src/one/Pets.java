package one;

public class Pets {
    private String name;
    private int health;
    private int love;

    public Pets(String name,int health,int love){
        this.name=name;
        if(health>100||health<0){
            health=40;
        }
        this.health=health;
        this.love=love;
    }

    /**
     * 外界通过set方法来设置name的值
     */
    public void setName(String name){
        this.name=name;
    }
    /**
     * 类体外通过name的get方法来获取name的值
     */
    public String getName(){
        return this.name;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public int getLove() {
        return love;
    }

    public void setLove(int love) {
        this.love = love;
    }

    public void printInfo(){
        System.out.println("宠物自白：");
        System.out.print("我的名字叫"+name+",健康值是"+health+",我和主人的亲密度是"+love);
    }
     void test(){
        System.out.println(111);
    }
}
