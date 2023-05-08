package seven;

public class Computer{
    EMS ems;
    HardDis dis;
    CPU cup;

    public Computer(EMS ems, HardDis dis, CPU cup) {
        this.ems = ems;
        this.dis = dis;
        this.cup = cup;
    }

    void printInfo(){
        System.out.println("计算机的信息如下：");
        System.out.printf("cup的品牌:%s,cpu的主频：%s",this.cup.getBrand(),this.cup.getFre());
    }
    public EMS getEms() {
        return ems;
    }

    public void setEms(EMS ems) {
        this.ems = ems;
    }

}
