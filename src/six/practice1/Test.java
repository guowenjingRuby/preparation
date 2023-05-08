package six.practice1;

import java.util.Scanner;

/**
 * @version 1.0
 * @authoradmin
 * @Create by 2023/3/21 14:29
 */
public class Test {
    /**
     * 中国各个地区的数组
     */
    private static final String[] CAR_AREA_ARRAY = {"京", "津", "沪", "渝", "冀", "豫", "云", "辽", "黑",
            "湘", "皖", "鲁", "新", "苏", "浙", "赣", "鄂", "桂", "甘", "晋", "蒙", "陕", "吉", "闽", "贵", "粤", "青", "藏",
            "川", "宁", "琼"};

    /**
     * 城市代码，不能有字母 I 和 O
     */
    private static final String[] CAR_LETTER_ARRAY = {"A", "B", "C", "D", "E", "F", "G", "H", "J", "K",
            "L", "M", "N", "P", "Q", "R", "S", "T", "U", "V"};

    /**
     * 车牌号，不能有字母 I 和 O
     */
    private static final String[] CAR_CHAR_ARRAY = {"0", "1", "2", "3", "4", "5", "6", "7", "8", "9", "A", "B", "C", "D", "E", "F", "G", "H", "J", "K",
            "L", "M", "N", "P", "Q", "R", "S", "T", "U", "V", "W", "X", "Y", "Z"};

    /**
     * 车牌编号长度
     */
    private static final int CAR_NUM_LENGTH = 5;

    public static String getCarNum() {
        // 随机获取地区
        String area =  CAR_AREA_ARRAY[(int)(Math.random() * CAR_AREA_ARRAY.length)];

        // 随机生成城市编号
        String cityCode = CAR_LETTER_ARRAY[(int)(Math.random() * CAR_LETTER_ARRAY.length)];

        // 循环5次，生成车牌号
        StringBuilder sb = new StringBuilder();
        for(int i=0; i<CAR_NUM_LENGTH; i++) {
            sb.append(CAR_CHAR_ARRAY[(int)(Math.random()*CAR_CHAR_ARRAY.length)]);
        }

        // 拼接
        return area +cityCode +"."+ sb;
    }
    public static void main(String[] args) {
        Customer customer=new Customer("张伟");

//        MotoVehicle vehicles[] = new MotoVehicle[4];
//        vehicles[0] = new Car(getCarNum(), "宝马", "550i");
//        vehicles[1] = new Car(getCarNum(), "宝马", "X6");
//        vehicles[2] = new Car(getCarNum(), "别克", "林荫大道");
//        vehicles[3] = new Bus(getCarNum(), "金龙", 34);
//
//        customer.printMoteInfo(vehicles);
//
//        int days=5;
//        System.out.printf("顾客：%s,租赁天数：%d天,租车总金额：%d元",customer.getName(),days,customer.calcTotalRent(vehicles,days));


//        System.out.println("欢迎来到汽车租赁公司");
//        System.out.print("请输入要租赁的天数：");
//        Scanner scanner=new Scanner(System.in);
//        int days = Integer.parseInt(scanner.nextLine());
//        System.out.print("请输入要租赁的汽车类型（1.轿车，2.客车）：");
//        String motoType=scanner.nextLine();
//        if("1".equals(motoType)){
//            Car car=new Car();
//            System.out.print("请输入要租赁的汽车品牌（1.宝马，2.别克）：");
//            String brand=scanner.nextLine();
//            if("1".equals(brand)){
//                car.setBrand("宝马");
//                System.out.print("请输入汽车的型号(1.550i，2.X6)：");
//                String type=scanner.nextLine();
//                if("1".equals(type)){
//                    car.setType("550i");
//                } else if ("2".equals(type)) {
//                    car.setType("X6");
//                }
//                //设置一个随机生成的车牌
//                car.setNo(getCarNum());
//                System.out.println("分配给您的汽车品牌是："+car.getNo());
//                System.out.println("累计"+days+"天,你需要支付的租赁费用是："+car.calRent(days));
//            } else if ("2".equals(brand)) {
//                car.setBrand("别克");
//                System.out.print("请输入汽车的型号(1.GL8，2.林荫大道)：");
//                String type=scanner.nextLine();
//                if("1".equals(type)){
//                    car.setType("GL8");
//                } else if ("2".equals(type)) {
//                    car.setType("林荫大道");
//                }
//                //设置一个随机生成的车牌
//                car.setNo(getCarNum());
//                System.out.println("分配给您的汽车牌号是："+car.getNo());
//                System.out.println("累计"+days+"天,你需要支付的租赁费用是："+car.calRent(days));
//            }
//        } else if ("2".equals(motoType)) {
//            Bus bus=new Bus();
//            System.out.print("请输入要租赁的客车品牌（1.金杯，2.金龙）：");
//            String brand=scanner.nextLine();
//            if("1".equals(brand)){
//                bus.setBrand("金杯");
//            } else if ("2".equals(brand)) {
//                bus.setBrand("金龙");
//            }
//            System.out.print("请输入座位数：");
//            int seatNumber=Integer.parseInt(scanner.nextLine());
//            bus.setSeatNumber(seatNumber);
////            随机给客车生成一个车牌号
//            bus.setNo(getCarNum());
//            System.out.println("分配给您的汽车牌号是："+bus.getNo());
//            System.out.println("累计"+days+"天,你需要支付的租赁费用是："+bus.calRent(days));
//        }
        /*假设最多可以录入10辆汽车。。1.不能确定用户到底要租几辆车，万一用户要租20辆车，我数组长度固定为10.用户租车程序会报错。
        我为了保证这个租车程序肯定能满足所有用户的需求，数组长度设置越大越好。这样是不会报错了。
        但是现实数据现实：只有百分之5的客户会租10辆以上的车。内存空间极大的浪费*/
        MotoVehicle vehicles[] = new MotoVehicle[100000];
        Scanner scanner=new Scanner(System.in);
        /*定义一个i，帮我们记录选取了多少辆车*/
        int i=0;
        /*1.选取租赁汽车*/
        while (1==1){
            System.out.printf("这是你选得第%d辆车，请输入要租赁的交通工具类型（轿车，客车，卡车）：",i+1);
            String vehicleType=scanner.nextLine();
            if("轿车".equals(vehicleType)){
                //创建汽车对象
                vehicles[i]=new Car();
                vehicles[i].setNo(getCarNum());
                System.out.print("请输入要租赁的汽车品牌（1.宝马，2.别克）：");
                String brand=scanner.nextLine();
                if("1".equals(brand)){
                    vehicles[i].setBrand("宝马");
                    System.out.print("请输入汽车的型号(1.550i，2.X6)：");
                    String type=scanner.nextLine();
                    if("1".equals(type)){
                        /*setType（）属于car类特有的方法，car在126行声明为了父类类型，所以进行强转*/
                        ((Car) vehicles[i]).setType("550i");
                    } else if ("2".equals(type)) {
                        ((Car) vehicles[i]).setType("X6");
                    }
                } else if ("2".equals(brand)) {
                    vehicles[i].setBrand("别克");
                    System.out.print("请输入汽车的型号(1.GL8，2.林荫大道)：");
                    String type=scanner.nextLine();
                    if("1".equals(type)){
                        ((Car) vehicles[i]).setType("GL8");
                    } else if ("2".equals(type)) {
                        ((Car) vehicles[i]).setType("林荫大道");
                    }
                }
            }else if("客车".equals(vehicleType)){
                //创建客车对象
                vehicles[i]=new Bus();
                vehicles[i].setNo(getCarNum());
                vehicles[i].setBrand("金杯");
                System.out.print("请输入座位数：");
                int seatNumber=Integer.parseInt(scanner.nextLine());
                ((Bus)vehicles[i]).setSeatNumber(seatNumber);
            }else if("卡车".equals(vehicleType)){
                //创建卡车对象
                vehicles[i]=new Truck(getCarNum(),"解放");
                System.out.print("请输入卡车的吨位：");
                int t=Integer.parseInt(scanner.nextLine());
                ((Truck)vehicles[i]).setT(t);
            }else{
                System.out.println("选车结束");
                break;
            }
            i++;
        }

        /*录入租赁天数*/
        System.out.print("录入租赁天数：");
        int days= Integer.parseInt(scanner.nextLine());

        /*显示租赁的汽车信息*/
        customer.printMoteInfo(vehicles);
        /*计算费用*/
        System.out.printf("顾客：%s,租赁天数：%d天,租车总金额：%d元",customer.getName(),days,customer.calcTotalRent(vehicles,days));
    }
}
