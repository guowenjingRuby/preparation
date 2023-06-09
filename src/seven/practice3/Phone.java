package seven.practice3;

public abstract class Phone {

    private String brand;
    private String type;


    public Phone(String brand, String type) {
        this.brand = brand;
        this.type = type;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    abstract void sentMessage();
    abstract void call();
    abstract void broadcast();

    void printInfo(){
        System.out.printf("这是一款型号为:%s的%s手机\n",this.brand,this.type);
    }

}
