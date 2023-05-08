package six.practice1;

public class Truck extends MotoVehicle{
    private int t;
    public Truck(String no,String brand) {
        super(no,brand);
    }

    public Truck(String no,String brand,int t) {
        super(no,brand);
        this.t = t;
    }

    public int getT() {
        return t;
    }

    public void setT(int t) {
        this.t = t;
    }

    /*卡车的租金和吨位相关*/
    @Override
    int calRent(int days) {
        return 50*this.t*days;
    }
}
