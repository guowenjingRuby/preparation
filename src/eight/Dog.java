package eight;


public class Dog extends Pet {
    private String strain;

    public Dog(String name, int health, int love, String strain) {
        super(name, health, love);
        this.strain = strain;
    }

    public Dog(String name,String strain){
        super(name);
        this.strain=strain;
    }

    public String getStrain() {
        return strain;
    }

    public void setStrain(String strain) {
        this.strain = strain;
    }

    @Override
    public void eat() {
        System.out.printf("狗狗%s吃东西啦，健康值增长了3.\n",this.getName());
    }

    void catchingFlyDisc(){
        super.setHealth(super.getHealth()-10);
        super.setLove(super.getLove()+5);
        System.out.printf("和狗狗玩接飞盘游戏，狗狗的健康值减少10，与主人亲密度增加5。\n");
    }

    void printInfo(){
        System.out.println(super.getName()+"        "+this.strain);
    }


}
