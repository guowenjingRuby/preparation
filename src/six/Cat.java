package six;

public class Cat extends Pet {
    public Cat(String name, int health, int love) {
        super(name, health, love);
    }

    @Override
    void eat() {
        System.out.printf("猫咪%s吃东西啦，健康值增加了4.\n",this.getName());
    }

}
