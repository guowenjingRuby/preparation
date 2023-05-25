package fifteen.practice;

public class Good {
    //商品编号
    private int id;
    //商品名称
    private String name;
    //单价
    private double price;
    //数量
    private int number;
    //总价
    private double totalmoney;
    //审批人
    private String people;
    public Good(int id, String name, double price, int number, double totalmoney, String people) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.number = number;
        this.totalmoney = totalmoney;
        this.people = people;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public double getTotalmoney() {
        return totalmoney;
    }

    public void setTotalmoney(double totalmoney) {
        this.totalmoney = totalmoney;
    }

    public String getPeople() {
        return people;
    }

    public void setPeople(String people) {
        this.people = people;
    }

    @Override
    public String toString() {
        return "进货记录编号：" + id + "\n商品名称：" + name + "\n商品单价：" + price + "\n库存数量：" + number + "\n审批人员：" + people;
    }


}
