package Rubbish;

import java.util.Arrays;
import java.util.Scanner;

public class Rubbish {

    /*通过代码演示四个常量为static和非static在main方法中的调用方式*/
    /*厨余垃圾*/
    static final String[] KIT_Garbage={"菜叶","剩菜","剩饭","果皮","蛋壳","茶渣","骨头"};
    /*可回收垃圾*/
    static final String[] RECY_Garbage={"废弃计算机","打印机","复印件","传真机","扫描仪","投影仪","电视机","空调机",
            "电线","插座","书本","报纸","复印纸","宣传单","包装纸","信封","硬纸板","纸质包装盒","矿泉水瓶","饮料瓶","硬质塑料瓶","塑料油桶","乳液罐",
            "塑料盒","塑料杯","软桶","塑料衣架","塑料玩具"};
    /*其他垃圾*/
    static final String[] OTHER_Garbage={"瓦砾","陶瓷","尘土","不能回收的卫生纸"};
    /*有害垃圾*/
    static final String[] HAZA_Garbage={"灯管","油漆","杀虫剂","废弃化妆品","过期药品","电池","灯泡","废水银温度计"};

    /*遍历垃圾分类数组方法,查找垃圾属于什么类型,投入对应桶中*/
    /*通过代码演示该方法为static和非static在main方法中的调用方式*/
    static void throwRubbish(String[] strs,String garbageName,String color){
        for (int i = 0; i < strs.length; i++) {
            if (strs[i].equals(garbageName)) {
                System.out.printf("%s 属于厨余垃圾，请投入-%s-的桶中\n",garbageName,color);
            }
        }
    }
    /*演示在同一个类中非静态方法中调用静态方法或者非静态方法，直接调用*/
    void test(){
        throwRubbish(KIT_Garbage,"塑料盒","蓝色");
    }
    public static void main(String[] args) throws InterruptedException {
        Scanner scanner=new Scanner(System.in);
        System.out.println("欢迎投放垃圾");
        while (1==1){
            System.out.print("请输入你要投放的垃圾（结束垃圾投放请输入exit）：");
            String garbageName=scanner.nextLine();
            if("exit".equals(garbageName)) {
                break;
            }else{
                throwRubbish(KIT_Garbage,garbageName,"绿色");
                throwRubbish(RECY_Garbage,garbageName,"蓝色");
                throwRubbish(OTHER_Garbage,garbageName,"黑色");
                throwRubbish(HAZA_Garbage,garbageName,"红色");
                System.out.println("投递中。。。。");
                Thread.sleep(1000);
                System.out.println("你的垃圾投入成功，文明的你真闪亮。。。、\n");
                Thread.sleep(100);
            }
        }
    }


}
