package two;

import java.util.Scanner;

/**
 * @version 1.0
 * @authoradmin
 * @Create by 2023/2/17 18:33
 */
public class TestTriangle {
    public static void main(String[] args) {
        Triangle triangle=new Triangle();
        //创建Scanner对象，接收用户终端的输入的三条边
        Scanner scanner=new Scanner(System.in);
        System.out.print("请输入边a:");
        int aMargin=Integer.parseInt(scanner.nextLine());
        System.out.print("请输入边b:");
        int bMargin=Integer.parseInt(scanner.nextLine());
        System.out.print("请输入边c:");
        int cMargin=Integer.parseInt(scanner.nextLine());
//        判断是否构成三角形
        if(aMargin + bMargin > cMargin && aMargin + cMargin > bMargin && bMargin + cMargin > aMargin){
            triangle.amargin=aMargin;
            triangle.bmargin=bMargin;
            triangle.cmargin=cMargin;
            System.out.println("三角形的周长为:"+triangle.girth()+",面积为:"+triangle.area());
        }else{
            System.out.println("无法构成三角形");
        }

    }
}
