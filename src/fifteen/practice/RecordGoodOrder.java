package fifteen.practice;

import java.util.ArrayList;
import java.util.Scanner;


public class RecordGoodOrder {
    //创建商品库存
    static ArrayList<Good> goodsList=new ArrayList<Good>();

    public static void main(String[] args) {
        init();//初始化商品库存
        //循环遍历将商品信息输出
        for(int i=0;i<goodsList.size();i++){
            System.out.println(goodsList.get(i)+"\n");

        }
        while(true){
            Scanner scanner=new Scanner(System.in);
            System.out.println("请输入商品编号:");
            int goodId = scanner.nextInt();
            //根据商品id去查找商品
            Good stockGood=getGoodsById(goodId);
            //判断stockGood是否存在
            if(stockGood!=null){
                //存在输出商品信息
                System.out.println("当前库存信息"+stockGood);
                System.out.println("请输入进货数量:");
                int bookNumber= scanner.nextInt();
                //将输入的信息封装成Books对象
                Good good=new Good(stockGood.getId(), stockGood.getName(), stockGood.getPrice(),stockGood.getNumber()+bookNumber, stockGood.getPrice()*bookNumber,stockGood.getPeople());
                FileUtil.saveBooks(good);//将数据存在本地csv文件中
                //修改库存
                stockGood.setNumber(stockGood.getNumber()+bookNumber);
                //显示库存变动的商品
                System.out.println(stockGood);
            }else{
                System.out.println("商品编号输入有误！");
                break;
            }
        }
    }

    private static Good getGoodsById(int goodId) {
        for (int i = 0; i <goodsList.size(); i++) {
            Good good = goodsList.get(i);
            if(goodId==good.getId()){
                return good;
            }
        }
        return null;
    }

    public static void init(){
        Good good1=new Good(1001,"百事可乐",4.5,100,450,"张三");
        Good good2=new Good(1002,"可口可乐",4,100,400,"李四");
        Good good3=new Good(1003,"百事雪碧",3.8,100,380,"张三");
        goodsList.add(good1);
        goodsList.add(good2);
        goodsList.add(good3);
    }
}
