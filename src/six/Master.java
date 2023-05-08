package six;

public class Master {
    private String name;
    private int money;

    public Master(String name, int money) {
        this.name = name;
        this.money = money;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getMoney() {
        return money;
    }

    public void setMoney(int money) {
        this.money = money;
    }

/*    *//**
     * 给狗狗喂食的方法
     *//*
    void feed(Dog dog){
        dog.eat();
    }

    *//**
     * 企鹅喂食的方法
     *//*
    void feed(Penguin penguin){
        penguin.eat();
    }
    *//**
     * 给猫喂食的方法
     *//*
    void feed(Cat cat){
        cat.eat();
    }*/
    /**
     * 给宠物喂食的方法，使用父类作为方法形参实现多态
     */
    void feed(Pet pet){
        pet.eat();
    }
    /**
     * 领养宠物的方法，使用父类作为方法返回值实现多态
     */
    Pet getPet(int typeId){
        //先声明一个宠物类型
        Pet pet=null;
        if(typeId==1){
            //根据实现效果图，输入是1，表示领养狗,所以pet指向狗对象
            pet=new Dog("汪星人",100,0,"雪纳瑞");
        }else if(typeId==2){
            //根据实现效果图，输入是2，表示领养企鹅，所以pet指向企鹅对象
            pet=new Penguin("白白",100,0,"Q妹");
        }
        return pet;
    }
    /**
     * play方法，实现和不同的宠物玩不同的游戏
     */
    void play(Pet pet){
        /*
        * 如果宠物是狗：
        *   玩接飞盘游戏
        * 如果宠物是企鹅：
        *   玩游泳游戏
        */
        if(pet instanceof Dog){
            //向下转型。为什么向下转型？父类对象不能引用子类特有的方法。
            Dog dog=(Dog) pet;
            dog.catchingFlyDisc();
        }else if(pet instanceof Penguin){
            Penguin penguin=(Penguin)pet;
            penguin.swimming();
        }
    }
}
