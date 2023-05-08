package one;

import java.util.Scanner;

/**
 * @version 1.0
 * @authoradmin
 * @Create by 2023/2/15 11:09
 * 要求请同学们做好防止非法输入的判断。
 */
public class TestCalculator {
    public static void main(String[] args) {
        Calculator calculator=new Calculator();
        System.out.print("请输入数字1：");
        Scanner scanner=new Scanner(System.in);
        float num1=Float.parseFloat(scanner.nextLine());
        System.out.print("请输入运算符：");
        String symbol=scanner.nextLine();
        System.out.print("请输入数字2：");
        float num2=Float.parseFloat(scanner.nextLine());
        calculator.num1=num1;
        calculator.num2=num2;
        calculator.syboml=symbol;
        calculator.calcul();

    }
}
