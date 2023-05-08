package six.practice1;

/**
 * @version 1.0
 * @authoradmin
 * @Create by 2023/3/25 14:13
 */
public class Customer {

    private String name;

    public Customer(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    /*计算租多辆车的总金额*/
    int calcTotalRent(MotoVehicle motos[],int days){
        int sum=0;
        for(int i=0;i<motos.length;i++){
            //motos[i]表示是一辆car或者bus,或者是truck或者是空
            if(motos[i]!=null) {
                sum += motos[i].calRent(days);
            }
        }
        return sum;
    }

    void printMoteInfo(MotoVehicle motos[]){
        System.out.println("车牌号             车品牌");
        for(int j=0;j<motos.length;j++){
//            交通工具数组里面内容不为空的进行输出
            if(motos[j]!=null) {
                System.out.println(motos[j].getNo() + "             " + motos[j].getBrand());
            }
        }

    }
}
