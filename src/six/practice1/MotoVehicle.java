package six.practice1;

/**
 * @version 1.0
 * @authoradmin
 * @Create by 2023/3/21 14:13
 */
public abstract class MotoVehicle {
    private String no;
    private String brand;

    public MotoVehicle(){

    }

    public MotoVehicle(String no, String brand) {
        this.no = no;
        this.brand = brand;
    }

    public String getNo() {
        return no;
    }

    public void setNo(String no) {
        this.no = no;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    abstract int calRent(int days);


/*    void printMoteInfo(MotoVehicle motos[]){
        System.out.println("车牌号             车品牌");
        for(int j=0;j<motos.length;j++){
            System.out.println(motos[j].getNo()+"             "+motos[j].getBrand());
        }

    }*/
}
